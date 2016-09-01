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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;




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

import com.bydan.erp.contabilidad.util.TipoGrupoFlujoCajaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoGrupoFlujoCajaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoGrupoFlujoCajaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoGrupoFlujoCajaBean;
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

import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.contabilidad.resources.reportes.AuxiliarReportes;


import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.contabilidad.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoGrupoFlujoCajaBeanSwingJInternalFrame extends TipoGrupoFlujoCajaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGrupoFlujoCajaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGrupoFlujoCaja> tipogrupoflujocajaValidator = new ClassValidator<TipoGrupoFlujoCaja>(TipoGrupoFlujoCaja.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGrupoFlujoCaja tipogrupoflujocaja;	
	public TipoGrupoFlujoCaja tipogrupoflujocajaAux;
	public TipoGrupoFlujoCaja tipogrupoflujocajaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGrupoFlujoCaja tipogrupoflujocajaTotales;
	public Long idTipoGrupoFlujoCajaActual;
	public Long iIdNuevoTipoGrupoFlujoCaja=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosLineaFlujoCaja=false;

	public Boolean getIsTienePermisosLineaFlujoCaja() {
		return isTienePermisosLineaFlujoCaja;
	}

	public void setIsTienePermisosLineaFlujoCaja(Boolean isTienePermisosLineaFlujoCaja) {
		this.isTienePermisosLineaFlujoCaja= isTienePermisosLineaFlujoCaja;
	}


	public Boolean isTienePermisosCentroActividad=false;

	public Boolean getIsTienePermisosCentroActividad() {
		return isTienePermisosCentroActividad;
	}

	public void setIsTienePermisosCentroActividad(Boolean isTienePermisosCentroActividad) {
		this.isTienePermisosCentroActividad= isTienePermisosCentroActividad;
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
	
	public Boolean isPermisoTodoTipoGrupoFlujoCaja;
	public Boolean isPermisoNuevoTipoGrupoFlujoCaja;
	public Boolean isPermisoActualizarTipoGrupoFlujoCaja;
	public Boolean isPermisoActualizarOriginalTipoGrupoFlujoCaja;
	public Boolean isPermisoEliminarTipoGrupoFlujoCaja;
	public Boolean isPermisoGuardarCambiosTipoGrupoFlujoCaja;
	public Boolean isPermisoConsultaTipoGrupoFlujoCaja;
	public Boolean isPermisoBusquedaTipoGrupoFlujoCaja;
	public Boolean isPermisoReporteTipoGrupoFlujoCaja;
	public Boolean isPermisoPaginacionMedioTipoGrupoFlujoCaja;
	public Boolean isPermisoPaginacionAltoTipoGrupoFlujoCaja;
	public Boolean isPermisoPaginacionTodoTipoGrupoFlujoCaja;
	public Boolean isPermisoCopiarTipoGrupoFlujoCaja;
	public Boolean isPermisoVerFormTipoGrupoFlujoCaja;
	public Boolean isPermisoDuplicarTipoGrupoFlujoCaja;
	public Boolean isPermisoOrdenTipoGrupoFlujoCaja;
	
	
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
	
	public TipoGrupoFlujoCajaParameterReturnGeneral tipogrupoflujocajaReturnGeneral;
	public TipoGrupoFlujoCajaParameterReturnGeneral tipogrupoflujocajaParameterGeneral;
	
	

	public LineaFlujoCajaLogic lineaflujocajaLogic=null;

	public LineaFlujoCajaLogic getLineaFlujoCajaLogic() {
		return lineaflujocajaLogic;
	}

	public void setLineaFlujoCajaLogic(LineaFlujoCajaLogic lineaflujocajaLogic) {
		this.lineaflujocajaLogic = lineaflujocajaLogic;
	}


	public CentroActividadLogic centroactividadLogic=null;

	public CentroActividadLogic getCentroActividadLogic() {
		return centroactividadLogic;
	}

	public void setCentroActividadLogic(CentroActividadLogic centroactividadLogic) {
		this.centroactividadLogic = centroactividadLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGrupoFlujoCaja=false;
	public Boolean esParaAccionDesdeFormularioTipoGrupoFlujoCaja=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGrupoFlujoCajaLogic tipogrupoflujocajaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGrupoFlujoCaja tipogrupoflujocajaBean;
	public TipoGrupoFlujoCajaConstantesFunciones tipogrupoflujocajaConstantesFunciones;
	//public TipoGrupoFlujoCajaParameterReturnGeneral tipogrupoflujocajaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoGrupoFlujoCaja> tipogrupoflujocajas;	
	//public List<TipoGrupoFlujoCaja> tipogrupoflujocajasEliminados;
	//public List<TipoGrupoFlujoCaja> tipogrupoflujocajasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja=true;
	public Boolean isVisibilidadCeldaCopiarTipoGrupoFlujoCaja=true;
	public Boolean isVisibilidadCeldaVerFormTipoGrupoFlujoCaja=true;
	public Boolean isVisibilidadCeldaOrdenTipoGrupoFlujoCaja=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;
	public Boolean isVisibilidadCeldaModificarTipoGrupoFlujoCaja=false;
	public Boolean isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=false;
	public Boolean isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=false;
	public Boolean isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=false;
	public Boolean isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoGrupoFlujoCaja() {
		return this.iIdNuevoTipoGrupoFlujoCaja;
	}

	public void setiIdNuevoTipoGrupoFlujoCaja(Long iIdNuevoTipoGrupoFlujoCaja) {
		this.iIdNuevoTipoGrupoFlujoCaja = iIdNuevoTipoGrupoFlujoCaja;
	}
	
	public Long getidTipoGrupoFlujoCajaActual() {
		return this.idTipoGrupoFlujoCajaActual;
	}

	public void setidTipoGrupoFlujoCajaActual(Long idTipoGrupoFlujoCajaActual) {
		this.idTipoGrupoFlujoCajaActual = idTipoGrupoFlujoCajaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGrupoFlujoCaja gettipogrupoflujocaja() {
		return this.tipogrupoflujocaja;
	}

	public void settipogrupoflujocaja(TipoGrupoFlujoCaja tipogrupoflujocaja) {
		this.tipogrupoflujocaja = tipogrupoflujocaja;
	}
	
	public TipoGrupoFlujoCaja gettipogrupoflujocajaAux() {
		return this.tipogrupoflujocajaAux;
	}

	public void settipogrupoflujocajaAux(TipoGrupoFlujoCaja tipogrupoflujocajaAux) {
		this.tipogrupoflujocajaAux = tipogrupoflujocajaAux;
	}				
	
	public TipoGrupoFlujoCaja gettipogrupoflujocajaAnterior() {
		return this.tipogrupoflujocajaAnterior;
	}

	public void settipogrupoflujocajaAnterior(TipoGrupoFlujoCaja tipogrupoflujocajaAnterior) {
		this.tipogrupoflujocajaAnterior = tipogrupoflujocajaAnterior;
	}	
	
	public TipoGrupoFlujoCaja gettipogrupoflujocajaTotales() {
		return this.tipogrupoflujocajaTotales;
	}

	public void settipogrupoflujocajaTotales(TipoGrupoFlujoCaja tipogrupoflujocajaTotales) {
		this.tipogrupoflujocajaTotales = tipogrupoflujocajaTotales;
	}	
	
	public TipoGrupoFlujoCaja gettipogrupoflujocajaBean() {
		return this.tipogrupoflujocajaBean;
	}

	public void settipogrupoflujocajaBean(TipoGrupoFlujoCaja tipogrupoflujocajaBean) {
		this.tipogrupoflujocajaBean = tipogrupoflujocajaBean;
	}	
	
	public TipoGrupoFlujoCajaParameterReturnGeneral gettipogrupoflujocajaReturnGeneral() {
		return this.tipogrupoflujocajaReturnGeneral;
	}

	public void settipogrupoflujocajaReturnGeneral(TipoGrupoFlujoCajaParameterReturnGeneral tipogrupoflujocajaReturnGeneral) {
		this.tipogrupoflujocajaReturnGeneral = tipogrupoflujocajaReturnGeneral;
	}	
	
	
	public String codigoBusquedaPorCodigo="";

	public String getcodigoBusquedaPorCodigo() {
		return this.codigoBusquedaPorCodigo;
	}

	public void setcodigoBusquedaPorCodigo(String codigoBusquedaPorCodigo) {
		this.codigoBusquedaPorCodigo = codigoBusquedaPorCodigo;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoGrupoFlujoCajaLogic getTipoGrupoFlujoCajaLogic()	{		
		return tipogrupoflujocajaLogic;
	}

	public void setTipoGrupoFlujoCajaLogic(TipoGrupoFlujoCajaLogic tipogrupoflujocajaLogic) {
		this.tipogrupoflujocajaLogic = tipogrupoflujocajaLogic;
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
	
	public Boolean getIsEsNuevoTipoGrupoFlujoCaja() {
		return isEsNuevoTipoGrupoFlujoCaja;
	}

	public void setIsEsNuevoTipoGrupoFlujoCaja(Boolean isEsNuevoTipoGrupoFlujoCaja) {
		this.isEsNuevoTipoGrupoFlujoCaja = isEsNuevoTipoGrupoFlujoCaja;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGrupoFlujoCaja() {
		return esParaAccionDesdeFormularioTipoGrupoFlujoCaja;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGrupoFlujoCaja(Boolean esParaAccionDesdeFormularioTipoGrupoFlujoCaja) {
		this.esParaAccionDesdeFormularioTipoGrupoFlujoCaja = esParaAccionDesdeFormularioTipoGrupoFlujoCaja;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoGrupoFlujoCaja() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGrupoFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGrupoFlujoCaja(this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGrupoFlujoCajaConstantesFunciones.refrescarForeignKeysDescripcionesTipoGrupoFlujoCaja(this.tipogrupoflujocajas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogrupoflujocajaLogic.setTipoGrupoFlujoCajas(this.tipogrupoflujocajas);
			tipogrupoflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGrupoFlujoCajaParameterReturnGeneral getTipoGrupoFlujoCajaParameterGeneral() {
		return this.tipogrupoflujocajaParameterGeneral;
	}
	
	public void setTipoGrupoFlujoCajaParameterGeneral(TipoGrupoFlujoCajaParameterReturnGeneral tipogrupoflujocajaParameterGeneral) {
		this.tipogrupoflujocajaParameterGeneral = tipogrupoflujocajaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGrupoFlujoCaja() {
		return isPermisoTodoTipoGrupoFlujoCaja;
	}

	public void setIsPermisoTodoTipoGrupoFlujoCaja(Boolean isPermisoTodoTipoGrupoFlujoCaja) {
		this.isPermisoTodoTipoGrupoFlujoCaja = isPermisoTodoTipoGrupoFlujoCaja;
	}

	public Boolean getIsPermisoNuevoTipoGrupoFlujoCaja() {
		return isPermisoNuevoTipoGrupoFlujoCaja;
	}

	public void setIsPermisoNuevoTipoGrupoFlujoCaja(Boolean isPermisoNuevoTipoGrupoFlujoCaja) {
		this.isPermisoNuevoTipoGrupoFlujoCaja = isPermisoNuevoTipoGrupoFlujoCaja;
	}

	public Boolean getIsPermisoActualizarTipoGrupoFlujoCaja() {
		return isPermisoActualizarTipoGrupoFlujoCaja;
	}

	public void setIsPermisoActualizarTipoGrupoFlujoCaja(Boolean isPermisoActualizarTipoGrupoFlujoCaja) {
		this.isPermisoActualizarTipoGrupoFlujoCaja = isPermisoActualizarTipoGrupoFlujoCaja;
	}

	public Boolean getIsPermisoEliminarTipoGrupoFlujoCaja() {
		return isPermisoEliminarTipoGrupoFlujoCaja;
	}

	public void setIsPermisoEliminarTipoGrupoFlujoCaja(Boolean isPermisoEliminarTipoGrupoFlujoCaja) {
		this.isPermisoEliminarTipoGrupoFlujoCaja = isPermisoEliminarTipoGrupoFlujoCaja;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGrupoFlujoCaja() {
		return isPermisoGuardarCambiosTipoGrupoFlujoCaja;
	}

	public void setIsPermisoGuardarCambiosTipoGrupoFlujoCaja(Boolean isPermisoGuardarCambiosTipoGrupoFlujoCaja) {
		this.isPermisoGuardarCambiosTipoGrupoFlujoCaja = isPermisoGuardarCambiosTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsPermisoConsultaTipoGrupoFlujoCaja() {
		return isPermisoConsultaTipoGrupoFlujoCaja;
	}

	public void setIsPermisoConsultaTipoGrupoFlujoCaja(Boolean isPermisoConsultaTipoGrupoFlujoCaja) {
		this.isPermisoConsultaTipoGrupoFlujoCaja = isPermisoConsultaTipoGrupoFlujoCaja;
	}

	public Boolean getIsPermisoBusquedaTipoGrupoFlujoCaja() {
		return isPermisoBusquedaTipoGrupoFlujoCaja;
	}

	public void setIsPermisoBusquedaTipoGrupoFlujoCaja(Boolean isPermisoBusquedaTipoGrupoFlujoCaja) {
		this.isPermisoBusquedaTipoGrupoFlujoCaja = isPermisoBusquedaTipoGrupoFlujoCaja;
	}

	public Boolean getIsPermisoReporteTipoGrupoFlujoCaja() {
		return isPermisoReporteTipoGrupoFlujoCaja;
	}

	public void setIsPermisoReporteTipoGrupoFlujoCaja(Boolean isPermisoReporteTipoGrupoFlujoCaja) {
		this.isPermisoReporteTipoGrupoFlujoCaja = isPermisoReporteTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGrupoFlujoCaja() {
		return isPermisoPaginacionMedioTipoGrupoFlujoCaja;
	}

	public void setIsPermisoPaginacionMedioTipoGrupoFlujoCaja(Boolean isPermisoPaginacionMedioTipoGrupoFlujoCaja) {
		this.isPermisoPaginacionMedioTipoGrupoFlujoCaja = isPermisoPaginacionMedioTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGrupoFlujoCaja() {
		return isPermisoPaginacionTodoTipoGrupoFlujoCaja;
	}

	public void setIsPermisoPaginacionTodoTipoGrupoFlujoCaja(Boolean isPermisoPaginacionTodoTipoGrupoFlujoCaja) {
		this.isPermisoPaginacionTodoTipoGrupoFlujoCaja = isPermisoPaginacionTodoTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGrupoFlujoCaja() {
		return isPermisoPaginacionAltoTipoGrupoFlujoCaja;
	}

	public void setIsPermisoPaginacionAltoTipoGrupoFlujoCaja(Boolean isPermisoPaginacionAltoTipoGrupoFlujoCaja) {
		this.isPermisoPaginacionAltoTipoGrupoFlujoCaja = isPermisoPaginacionAltoTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsPermisoCopiarTipoGrupoFlujoCaja() {
		return isPermisoCopiarTipoGrupoFlujoCaja;
	}

	public void setIsPermisoCopiarTipoGrupoFlujoCaja(Boolean isPermisoCopiarTipoGrupoFlujoCaja) {
		this.isPermisoCopiarTipoGrupoFlujoCaja = isPermisoCopiarTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsPermisoVerFormTipoGrupoFlujoCaja() {
		return isPermisoVerFormTipoGrupoFlujoCaja;
	}

	public void setIsPermisoVerFormTipoGrupoFlujoCaja(Boolean isPermisoVerFormTipoGrupoFlujoCaja) {
		this.isPermisoVerFormTipoGrupoFlujoCaja = isPermisoVerFormTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsPermisoDuplicarTipoGrupoFlujoCaja() {
		return isPermisoDuplicarTipoGrupoFlujoCaja;
	}

	public void setIsPermisoDuplicarTipoGrupoFlujoCaja(Boolean isPermisoDuplicarTipoGrupoFlujoCaja) {
		this.isPermisoDuplicarTipoGrupoFlujoCaja = isPermisoDuplicarTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsPermisoOrdenTipoGrupoFlujoCaja() {
		return isPermisoOrdenTipoGrupoFlujoCaja;
	}

	public void setIsPermisoOrdenTipoGrupoFlujoCaja(Boolean isPermisoOrdenTipoGrupoFlujoCaja) {
		this.isPermisoOrdenTipoGrupoFlujoCaja = isPermisoOrdenTipoGrupoFlujoCaja;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaNuevoTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaNuevoTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja = isVisibilidadCeldaNuevoTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja = isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaCopiarTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaCopiarTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaCopiarTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaCopiarTipoGrupoFlujoCaja = isVisibilidadCeldaCopiarTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaVerFormTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaVerFormTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaVerFormTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaVerFormTipoGrupoFlujoCaja = isVisibilidadCeldaVerFormTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaOrdenTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaOrdenTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaOrdenTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaOrdenTipoGrupoFlujoCaja = isVisibilidadCeldaOrdenTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja = isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaModificarTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaModificarTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaModificarTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja = isVisibilidadCeldaModificarTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaActualizarTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaActualizarTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaActualizarTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja = isVisibilidadCeldaActualizarTipoGrupoFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaEliminarTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaEliminarTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaEliminarTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja = isVisibilidadCeldaEliminarTipoGrupoFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaCancelarTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaCancelarTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaCancelarTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja = isVisibilidadCeldaCancelarTipoGrupoFlujoCaja;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaGuardarTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaGuardarTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja = isVisibilidadCeldaGuardarTipoGrupoFlujoCaja;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja() {
		return isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja(Boolean isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja) {
		this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja = isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja;
	}
		
	public TipoGrupoFlujoCajaSessionBean gettipogrupoflujocajaSessionBean() {
		return this.tipogrupoflujocajaSessionBean;
	}
	
	public void settipogrupoflujocajaSessionBean(TipoGrupoFlujoCajaSessionBean tipogrupoflujocajaSessionBean) {
		this.tipogrupoflujocajaSessionBean=tipogrupoflujocajaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorCodigo() {
		return this.isVisibilidadBusquedaPorCodigo;
	}

	public void setisVisibilidadBusquedaPorCodigo(Boolean isVisibilidadBusquedaPorCodigo) {
		this.isVisibilidadBusquedaPorCodigo=isVisibilidadBusquedaPorCodigo;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoGrupoFlujoCaja tipogrupoflujocaja,TipoGrupoFlujoCaja tipogrupoflujocajaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGrupoFlujoCaja(tipogrupoflujocaja);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogrupoflujocajaAux.setId(tipogrupoflujocaja.getId());
		tipogrupoflujocajaAux.setVersionRow(tipogrupoflujocaja.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGrupoFlujoCaja();
		
			int intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogrupoflujocajaValidator.getInvalidValues(this.tipogrupoflujocaja);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogrupoflujocajaLogic.setDatosCliente(datosCliente);
			tipogrupoflujocajaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogrupoflujocajaAux=new  TipoGrupoFlujoCaja();
				
				tipogrupoflujocajaAux.setIsNew(true);
				tipogrupoflujocajaAux.setIsChanged(true);
				
				tipogrupoflujocajaAux.setTipoGrupoFlujoCajaOriginal(this.tipogrupoflujocaja);
				
				tipogrupoflujocajaAux.setId(this.tipogrupoflujocaja.getId());	
				tipogrupoflujocajaAux.setVersionRow(this.tipogrupoflujocaja.getVersionRow());	
				tipogrupoflujocajaAux.setcodigo(this.tipogrupoflujocaja.getcodigo());	
				tipogrupoflujocajaAux.setnombre(this.tipogrupoflujocaja.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogrupoflujocajaAux,tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoflujocajaAux,tipogrupoflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoflujocajaLogic.saveTipoGrupoFlujoCajas();//WithConnection
						//tipogrupoflujocajaLogic.getSetVersionRowTipoGrupoFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogrupoflujocaja,tipogrupoflujocajaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogrupoflujocajaAux=new  TipoGrupoFlujoCaja();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado() && this.tipogrupoflujocaja.getId()>=0)) {
						
					tipogrupoflujocajaAux.setIsNew(false);
				}
				
				tipogrupoflujocajaAux.setIsDeleted(false);
			
				tipogrupoflujocajaAux.setId(this.tipogrupoflujocaja.getId());	
				tipogrupoflujocajaAux.setVersionRow(this.tipogrupoflujocaja.getVersionRow());	
				tipogrupoflujocajaAux.setcodigo(this.tipogrupoflujocaja.getcodigo());	
				tipogrupoflujocajaAux.setnombre(this.tipogrupoflujocaja.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogrupoflujocajaAux,tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoflujocajaAux,tipogrupoflujocajas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoflujocajaLogic.saveTipoGrupoFlujoCajas();//WithConnection
						//tipogrupoflujocajaLogic.getSetVersionRowTipoGrupoFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogrupoflujocaja,tipogrupoflujocajaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogrupoflujocajaAux=new  TipoGrupoFlujoCaja();
				
				tipogrupoflujocajaAux.setIsNew(false);
				tipogrupoflujocajaAux.setIsChanged(false);
				
				tipogrupoflujocajaAux.setIsDeleted(true);
				
				tipogrupoflujocajaAux.setId(this.tipogrupoflujocaja.getId());	
				tipogrupoflujocajaAux.setVersionRow(this.tipogrupoflujocaja.getVersionRow());	
				tipogrupoflujocajaAux.setcodigo(this.tipogrupoflujocaja.getcodigo());	
				tipogrupoflujocajaAux.setnombre(this.tipogrupoflujocaja.getnombre());	
				
				if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogrupoflujocajaAux.getId()>=0) {	
						this.tipogrupoflujocajasEliminados.add(tipogrupoflujocajaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogrupoflujocajaAux,tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoflujocajaAux,tipogrupoflujocajas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoflujocajaLogic.saveTipoGrupoFlujoCajas();//WithConnection
						//tipogrupoflujocajaLogic.getSetVersionRowTipoGrupoFlujoCajas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoflujocajaAux.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());

							if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoflujocajaAux.setCentroActividads(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividadLogic.getCentroActividads());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipogrupoflujocajaAux,tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipogrupoflujocajaAux,tipogrupoflujocajas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().addAll(this.tipogrupoflujocajasEliminados);
					
					tipogrupoflujocajaLogic.saveTipoGrupoFlujoCajas();//WithConnection
					//tipogrupoflujocajaLogic.getSetVersionRowTipoGrupoFlujoCajas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipogrupoflujocajasEliminados= new ArrayList<TipoGrupoFlujoCaja>();		
			}
			
			if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Grupo Flujo Caja GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogrupoflujocaja=tipogrupoflujocajaAux;
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
      		//this.finishProcessTipoGrupoFlujoCaja();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGrupoFlujoCaja tipogrupoflujocajaLocal) throws Exception {
		
		if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipogrupoflujocajaLocal.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());
				tipogrupoflujocajaLocal.setCentroActividads(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividadLogic.getCentroActividads());
			
			} else {
			
				tipogrupoflujocajaLocal.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajas);
				tipogrupoflujocajaLocal.setCentroActividads(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividads);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGrupoFlujoCaja tipogrupoflujocajaLocal) throws Exception {	
		if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoGrupoFlujoCajaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogrupoflujocajaValidator.getInvalidValues(this.tipogrupoflujocaja);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGrupoFlujoCaja tipogrupoflujocaja,List<TipoGrupoFlujoCaja> tipogrupoflujocajas) throws Exception {
		try	{		
			TipoGrupoFlujoCajaConstantesFunciones.actualizarLista(tipogrupoflujocaja,tipogrupoflujocajas,this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGrupoFlujoCaja tipogrupoflujocaja,List<TipoGrupoFlujoCaja> tipogrupoflujocajas) throws Exception {
		try	{			
			TipoGrupoFlujoCajaConstantesFunciones.actualizarSelectedLista(tipogrupoflujocaja,tipogrupoflujocajas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGrupoFlujoCaja> tipogrupoflujocajasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogrupoflujocajasLocal=this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogrupoflujocajasLocal=this.tipogrupoflujocajas;
			}
			//ARCHITECTURE
		
			for(TipoGrupoFlujoCaja tipogrupoflujocajaLocal:tipogrupoflujocajasLocal) {
				if(this.permiteMantenimiento(tipogrupoflujocajaLocal) && tipogrupoflujocajaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGrupoFlujoCajaConstantesFunciones.getTipoGrupoFlujoCajaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGrupoFlujoCajaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jLabelcodigoTipoGrupoFlujoCaja,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoGrupoFlujoCajaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jLabelnombreTipoGrupoFlujoCaja,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jLabelcodigoTipoGrupoFlujoCaja,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jLabelnombreTipoGrupoFlujoCaja,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("LineaFlujoCaja")) {
			if(this.tipogrupoflujocaja==null) {
				this.tipogrupoflujocaja= new TipoGrupoFlujoCaja();
			}

			if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGrupoFlujoCaja
				this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);

				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.getlineaflujocaja().setTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
			}

			return;
		}
		 else  if(sTipo.equals("CentroActividad")) {
			if(this.tipogrupoflujocaja==null) {
				this.tipogrupoflujocaja= new TipoGrupoFlujoCaja();
			}

			if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGrupoFlujoCaja
				this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);

				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.getcentroactividad().setTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoGrupoFlujoCaja--;	
		
		
		this.tipogrupoflujocajaAux=new TipoGrupoFlujoCaja();
		
		this.tipogrupoflujocajaAux.setId(this.iIdNuevoTipoGrupoFlujoCaja);
		this.tipogrupoflujocajaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().add(this.tipogrupoflujocajaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogrupoflujocajas.add(this.tipogrupoflujocajaAux);
		}
		//ARCHITECTURE
		
		this.tipogrupoflujocaja=this.tipogrupoflujocajaAux;
		
		if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
		}
				
		//this.setDefaultControlesTipoGrupoFlujoCaja();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGrupoFlujoCaja();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGrupoFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoFlujoCaja();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocajaBean,this.tipogrupoflujocaja,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
			classes=TipoGrupoFlujoCajaConstantesFunciones.getClassesRelationshipsOfTipoGrupoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogrupoflujocajaReturnGeneral=tipogrupoflujocajaLogic.procesarEventosTipoGrupoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas(),this.tipogrupoflujocaja,this.tipogrupoflujocajaParameterGeneral,this.isEsNuevoTipoGrupoFlujoCaja,classes);//this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCaja()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGrupoFlujoCaja(this.tipogrupoflujocajaReturnGeneral,this.tipogrupoflujocajaBean,false);
		
		if(this.tipogrupoflujocajaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFlujoCaja(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGrupoFlujoCaja(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja());
		}
		
		if(this.tipogrupoflujocajaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoFlujoCaja(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja(),classes);//this.tipogrupoflujocajaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGrupoFlujoCaja();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGrupoFlujoCaja();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
						
			if(tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.getEsGuardarRelacionado() && LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaFlujoCajaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.getEsGuardarRelacionado() && CentroActividadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCentroActividadActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoFlujoCaja();
			}
			
			this.actualizarVisualTableDatosTipoGrupoFlujoCaja();
			
			this.jTableDatosTipoGrupoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoFlujoCaja(), this.getIndiceNuevoTipoGrupoFlujoCaja());
			
			this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
						
			this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGrupoFlujoCaja(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldcodigoTipoGrupoFlujoCaja.setEnabled(isHabilitar && this.tipogrupoflujocajaConstantesFunciones.activarcodigoTipoGrupoFlujoCaja);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextAreanombreTipoGrupoFlujoCaja.setEnabled(isHabilitar && this.tipogrupoflujocajaConstantesFunciones.activarnombreTipoGrupoFlujoCaja);	
		
	};
	
	public void setDefaultControlesTipoGrupoFlujoCaja() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGrupoFlujoCaja(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogrupoflujocajaSessionBean.setConGuardarRelaciones(true);			
			this.tipogrupoflujocajaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipogrupoflujocajaSessionBean.setConGuardarRelaciones(false);			
			this.tipogrupoflujocajaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoGrupoFlujoCaja() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
				if(tipogrupoflujocajaAux.getId().equals(this.iIdNuevoTipoGrupoFlujoCaja)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajas) {
				if(tipogrupoflujocajaAux.getId().equals(this.iIdNuevoTipoGrupoFlujoCaja)) {
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
	
	public int getIndiceActualTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
				if(tipogrupoflujocajaAux.getId().equals(tipogrupoflujocaja.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajas) {
				if(tipogrupoflujocajaAux.getId().equals(tipogrupoflujocaja.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocajaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
				if(tipogrupoflujocajaAux.getTipoGrupoFlujoCajaOriginal().getId().equals(tipogrupoflujocajaOriginal.getId())) {
					existe=true;
					tipogrupoflujocajaOriginal.setId(tipogrupoflujocajaAux.getId());
					tipogrupoflujocajaOriginal.setVersionRow(tipogrupoflujocajaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajas) {
				if(tipogrupoflujocajaAux.getTipoGrupoFlujoCajaOriginal().getId().equals(tipogrupoflujocajaOriginal.getId())) {
					existe=true;
					tipogrupoflujocajaOriginal.setId(tipogrupoflujocajaAux.getId());
					tipogrupoflujocajaOriginal.setVersionRow(tipogrupoflujocajaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGrupoFlujoCaja(Boolean esParaCancelar) throws Exception {
		tipogrupoflujocajasAux=new ArrayList<TipoGrupoFlujoCaja>();
		tipogrupoflujocajaAux=new TipoGrupoFlujoCaja();
		
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
					if(tipogrupoflujocajaAux.getId()<0) {
						tipogrupoflujocajasAux.add(tipogrupoflujocajaAux);
					}		
				}
				this.iIdNuevoTipoGrupoFlujoCaja=0L;
				this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().removeAll(tipogrupoflujocajasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajas) {
					if(tipogrupoflujocajaAux.getId()<0) {
						tipogrupoflujocajasAux.add(tipogrupoflujocajaAux);
					}		
				}
				this.iIdNuevoTipoGrupoFlujoCaja=0L;
				this.tipogrupoflujocajas.removeAll(tipogrupoflujocajasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGrupoFlujoCaja 
					&& this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size()>0
					) {
					tipogrupoflujocajaAux=this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().get(this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size() - 1);
				
					if(tipogrupoflujocajaAux.getId()<0) {
						this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().remove(tipogrupoflujocajaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGrupoFlujoCaja && this.tipogrupoflujocajas.size()>0) {
					tipogrupoflujocajaAux=this.tipogrupoflujocajas.get(this.tipogrupoflujocajas.size() - 1);
				
					if(tipogrupoflujocajaAux.getId()<0) {
						this.tipogrupoflujocajas.remove(tipogrupoflujocajaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGrupoFlujoCaja(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogrupoflujocaja.getId()<0) {
				this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().remove(this.tipogrupoflujocaja);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogrupoflujocaja.getId()<0) {
				this.tipogrupoflujocajas.remove(this.tipogrupoflujocaja);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGrupoFlujoCaja(List<TipoGrupoFlujoCaja> tipogrupoflujocajasAux) throws Exception {
		TipoGrupoFlujoCajaConstantesFunciones.setEstadosInicialesTipoGrupoFlujoCaja(tipogrupoflujocajasAux);
	}
	
	public void setEstadosInicialesTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocajaAux) throws Exception {
		TipoGrupoFlujoCajaConstantesFunciones.setEstadosInicialesTipoGrupoFlujoCaja(tipogrupoflujocajaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGrupoFlujoCajaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGrupoFlujoCajaActual()) {
				if(!this.isEsNuevoTipoGrupoFlujoCaja) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGrupoFlujoCaja=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGrupoFlujoCajaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Grupo Flujo Caja ?", "MANTENIMIENTO DE Tipo Grupo Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGrupoFlujoCaja tipogrupoflujocaja) throws Exception {
		TipoGrupoFlujoCajaConstantesFunciones.seleccionarAsignar(this.tipogrupoflujocaja,tipogrupoflujocaja);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGrupoFlujoCaja=this.isPermisoActualizarOriginalTipoGrupoFlujoCaja;
			
			
			this.seleccionarAsignar(tipogrupoflujocaja);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGrupoFlujoCajaConstantesFunciones.quitarEspaciosTipoGrupoFlujoCaja(this.tipogrupoflujocaja,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogrupoflujocajaSessionBean.setsFuncionBusquedaRapida(this.tipogrupoflujocajaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGrupoFlujoCaja) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGrupoFlujoCaja(esParaCancelar);				
				this.cancelarNuevoTipoGrupoFlujoCaja(esParaCancelar);								
			}
			
			this.tipogrupoflujocaja=new TipoGrupoFlujoCaja();
			
			this.inicializarTipoGrupoFlujoCaja();
			
			this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGrupoFlujoCaja() throws Exception {
		try {
			TipoGrupoFlujoCajaConstantesFunciones.inicializarTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGrupoFlujoCajas(String sAccionBusqueda,List<TipoGrupoFlujoCaja> tipogrupoflujocajasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGrupoFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGrupoFlujoCajaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGrupoFlujoCajaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGrupoFlujoCaja"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Grupo Flujo Cajas");		
		parameters.put("busquedapor", TipoGrupoFlujoCajaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(LineaFlujoCaja.class));
			classes.add(new Classe(CentroActividad.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoGrupoFlujoCajaLogic tipogrupoflujocajaLogicAuxiliar=new TipoGrupoFlujoCajaLogic();
					tipogrupoflujocajaLogicAuxiliar.setDatosCliente(tipogrupoflujocajaLogic.getDatosCliente());				
					tipogrupoflujocajaLogicAuxiliar.setTipoGrupoFlujoCajas(tipogrupoflujocajasParaReportes);
					
					tipogrupoflujocajaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoGrupoFlujoCajaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipogrupoflujocajasParaReportes=tipogrupoflujocajaLogicAuxiliar.getTipoGrupoFlujoCajas();
					
					//tipogrupoflujocajaLogic.getNewConnexionToDeep();
					
					//for (TipoGrupoFlujoCaja tipogrupoflujocaja:tipogrupoflujocajasParaReportes) {
					//	tipogrupoflujocajaLogic.deepLoad(tipogrupoflujocaja, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipogrupoflujocajaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipogrupoflujocajaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileLineaFlujoCaja = AuxiliarReportes.class.getResourceAsStream("LineaFlujoCajaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_lineaflujocaja", reportFileLineaFlujoCaja);

			InputStream reportFileCentroActividad = AuxiliarReportes.class.getResourceAsStream("CentroActividadDetalleRelacionesDesign.jasper");
			parameters.put("subreport_centroactividad", reportFileCentroActividad);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGrupoFlujoCaja=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGrupoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGrupoFlujoCajaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGrupoFlujoCaja=new JRBeanArrayDataSource(TipoGrupoFlujoCajaJInternalFrame.TraerTipoGrupoFlujoCajaBeans(tipogrupoflujocajasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGrupoFlujoCaja);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGrupoFlujoCajaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGrupoFlujoCajaBean.TraerTipoGrupoFlujoCajaBeans(tipogrupoflujocajasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGrupoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipogrupoflujocajasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGrupoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipogrupoflujocajasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCajaActionPerformed(null);
					//this.generarExcelReporteTipoGrupoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipogrupoflujocajasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGrupoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipogrupoflujocajasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGrupoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipogrupoflujocajasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGrupoFlujoCajas(sAccionBusqueda,sTipoArchivoReporte,tipogrupoflujocajasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGrupoFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoFlujoCaja> tipogrupoflujocajasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoflujocaja";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoFlujoCajas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGrupoFlujoCaja("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGrupoFlujoCaja tipogrupoflujocaja : tipogrupoflujocajasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGrupoFlujoCajaConstantesFunciones.generarExcelReporteDataTipoGrupoFlujoCaja("NORMAL",row,workbook,tipogrupoflujocaja,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGrupoFlujoCaja(String sTipo,Row row,Workbook workbook) {
		
		TipoGrupoFlujoCajaConstantesFunciones.generarExcelReporteHeaderTipoGrupoFlujoCaja(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGrupoFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoFlujoCaja> tipogrupoflujocajasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoflujocaja_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGrupoFlujoCaja tipogrupoflujocaja : tipogrupoflujocajasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.getTipoGrupoFlujoCajaDescripcion(tipogrupoflujocaja));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogrupoflujocaja.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogrupoflujocaja.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGrupoFlujoCajas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoFlujoCaja> tipogrupoflujocajasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGrupoFlujoCaja> tipogrupoflujocajasRespaldo=null;
		
		classes=TipoGrupoFlujoCajaConstantesFunciones.getClassesRelationshipsOfTipoGrupoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogrupoflujocajaLogic.setDatosCliente(this.datosCliente);
		this.tipogrupoflujocajaLogic.setDatosDeep(this.datosDeep);
		this.tipogrupoflujocajaLogic.setIsConDeep(true);
		
		tipogrupoflujocajasRespaldo=this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas();
		
		this.tipogrupoflujocajaLogic.setTipoGrupoFlujoCajas(tipogrupoflujocajasParaReportes);	
		this.tipogrupoflujocajaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogrupoflujocajasParaReportes=this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas();
		this.tipogrupoflujocajaLogic.setTipoGrupoFlujoCajas(tipogrupoflujocajasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoflujocaja_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoFlujoCajas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGrupoFlujoCaja("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGrupoFlujoCaja tipogrupoflujocaja : tipogrupoflujocajasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGrupoFlujoCaja("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGrupoFlujoCajaConstantesFunciones.generarExcelReporteDataTipoGrupoFlujoCaja("NORMAL",row,workbook,tipogrupoflujocaja,cellStyleDataAux);
		
			
			


				//LineaFlujoCaja
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogrupoflujocaja.getLineaFlujoCajas()!=null && tipogrupoflujocaja.getLineaFlujoCajas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					LineaFlujoCajaConstantesFunciones.generarExcelReporteHeaderLineaFlujoCaja("RELACIONADO",row,workbook);
				}

				if(tipogrupoflujocaja.getLineaFlujoCajas()!=null) {
					i2=0;
					for(LineaFlujoCaja lineaflujocaja : tipogrupoflujocaja.getLineaFlujoCajas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						LineaFlujoCajaConstantesFunciones.generarExcelReporteDataLineaFlujoCaja("RELACIONADO",row,workbook,lineaflujocaja,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//CentroActividad
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(CentroActividadConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogrupoflujocaja.getCentroActividads()!=null && tipogrupoflujocaja.getCentroActividads().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(CentroActividadConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					CentroActividadConstantesFunciones.generarExcelReporteHeaderCentroActividad("RELACIONADO",row,workbook);
				}

				if(tipogrupoflujocaja.getCentroActividads()!=null) {
					i2=0;
					for(CentroActividad centroactividad : tipogrupoflujocaja.getCentroActividads()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						CentroActividadConstantesFunciones.generarExcelReporteDataCentroActividad("RELACIONADO",row,workbook,centroactividad,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.getTipoGrupoFlujoCajaDescripcion(tipogrupoflujocaja));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGrupoFlujoCaja() throws Exception {		
		this.startProcessTipoGrupoFlujoCaja(true);
	}
	
	public void startProcessTipoGrupoFlujoCaja(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoGrupoFlujoCaja ,this.jPanelParametrosReportesTipoGrupoFlujoCaja, this.jScrollPanelDatosTipoGrupoFlujoCaja,this.jPanelPaginacionTipoGrupoFlujoCaja, this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja, this.jPanelAccionesTipoGrupoFlujoCaja,this.jPanelAccionesFormularioTipoGrupoFlujoCaja,this.jmenuBarTipoGrupoFlujoCaja,this.jmenuBarDetalleTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,this.jTtoolBarDetalleTipoGrupoFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGrupoFlujoCaja=this.jTabbedPaneBusquedasTipoGrupoFlujoCaja; 
		
		final JPanel jPanelParametrosReportesTipoGrupoFlujoCaja=this.jPanelParametrosReportesTipoGrupoFlujoCaja;
		//final JScrollPane jScrollPanelDatosTipoGrupoFlujoCaja=this.jScrollPanelDatosTipoGrupoFlujoCaja;
		final JTable jTableDatosTipoGrupoFlujoCaja=this.jTableDatosTipoGrupoFlujoCaja;		
		final JPanel jPanelPaginacionTipoGrupoFlujoCaja=this.jPanelPaginacionTipoGrupoFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionTipoGrupoFlujoCaja=this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja;
		final JPanel jPanelAccionesTipoGrupoFlujoCaja=this.jPanelAccionesTipoGrupoFlujoCaja;
		
		JPanel jPanelCamposAuxiliarTipoGrupoFlujoCaja=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGrupoFlujoCaja=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			jPanelCamposAuxiliarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jPanelCamposTipoGrupoFlujoCaja;
			jPanelAccionesFormularioAuxiliarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jPanelAccionesFormularioTipoGrupoFlujoCaja;
		}
		
		final JPanel jPanelCamposTipoGrupoFlujoCaja=jPanelCamposAuxiliarTipoGrupoFlujoCaja;
		final JPanel jPanelAccionesFormularioTipoGrupoFlujoCaja=jPanelAccionesFormularioAuxiliarTipoGrupoFlujoCaja;
		
		
		final JMenuBar jmenuBarTipoGrupoFlujoCaja=this.jmenuBarTipoGrupoFlujoCaja;
		final JToolBar jTtoolBarTipoGrupoFlujoCaja=this.jTtoolBarTipoGrupoFlujoCaja;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGrupoFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGrupoFlujoCaja=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jmenuBarDetalleTipoGrupoFlujoCaja;
			jTtoolBarDetalleAuxiliarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTtoolBarDetalleTipoGrupoFlujoCaja;
		}
		
		final JMenuBar jmenuBarDetalleTipoGrupoFlujoCaja=jmenuBarDetalleAuxiliarTipoGrupoFlujoCaja;
		final JToolBar jTtoolBarDetalleTipoGrupoFlujoCaja=jTtoolBarDetalleAuxiliarTipoGrupoFlujoCaja;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGrupoFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGrupoFlujoCaja;
			processRunnable.jTableDatos=jTableDatosTipoGrupoFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposTipoGrupoFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGrupoFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGrupoFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGrupoFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGrupoFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGrupoFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarTipoGrupoFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGrupoFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGrupoFlujoCaja ,jPanelParametrosReportesTipoGrupoFlujoCaja,jTableDatosTipoGrupoFlujoCaja, /*jScrollPanelDatosTipoGrupoFlujoCaja,*/jPanelCamposTipoGrupoFlujoCaja,jPanelPaginacionTipoGrupoFlujoCaja, /*jScrollPanelDatosEdicionTipoGrupoFlujoCaja,*/ jPanelAccionesTipoGrupoFlujoCaja,jPanelAccionesFormularioTipoGrupoFlujoCaja,jmenuBarTipoGrupoFlujoCaja,jmenuBarDetalleTipoGrupoFlujoCaja,jTtoolBarTipoGrupoFlujoCaja,jTtoolBarDetalleTipoGrupoFlujoCaja);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGrupoFlujoCaja ,jPanelParametrosReportesTipoGrupoFlujoCaja, jScrollPanelDatosTipoGrupoFlujoCaja,jPanelPaginacionTipoGrupoFlujoCaja, jScrollPanelDatosEdicionTipoGrupoFlujoCaja, jPanelAccionesTipoGrupoFlujoCaja,jPanelAccionesFormularioTipoGrupoFlujoCaja,jmenuBarTipoGrupoFlujoCaja,jmenuBarDetalleTipoGrupoFlujoCaja,jTtoolBarTipoGrupoFlujoCaja,jTtoolBarDetalleTipoGrupoFlujoCaja);
						
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
	
	public void finishProcessTipoGrupoFlujoCaja() {// throws Exception 
		this.finishProcessTipoGrupoFlujoCaja(true);
	}
	
	public void finishProcessTipoGrupoFlujoCaja(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoGrupoFlujoCaja ,this.jPanelParametrosReportesTipoGrupoFlujoCaja, this.jScrollPanelDatosTipoGrupoFlujoCaja,this.jPanelPaginacionTipoGrupoFlujoCaja, this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja, this.jPanelAccionesTipoGrupoFlujoCaja,this.jPanelAccionesFormularioTipoGrupoFlujoCaja,this.jmenuBarTipoGrupoFlujoCaja,this.jmenuBarDetalleTipoGrupoFlujoCaja,this.jTtoolBarTipoGrupoFlujoCaja,this.jTtoolBarDetalleTipoGrupoFlujoCaja);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGrupoFlujoCaja=this.jTabbedPaneBusquedasTipoGrupoFlujoCaja; 
		
		final JPanel jPanelParametrosReportesTipoGrupoFlujoCaja=this.jPanelParametrosReportesTipoGrupoFlujoCaja;
		//final JScrollPane jScrollPanelDatosTipoGrupoFlujoCaja=this.jScrollPanelDatosTipoGrupoFlujoCaja;
		final JTable jTableDatosTipoGrupoFlujoCaja=this.jTableDatosTipoGrupoFlujoCaja;		
		final JPanel jPanelPaginacionTipoGrupoFlujoCaja=this.jPanelPaginacionTipoGrupoFlujoCaja;
		//final JScrollPane jScrollPanelDatosEdicionTipoGrupoFlujoCaja=this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja;
		final JPanel jPanelAccionesTipoGrupoFlujoCaja=this.jPanelAccionesTipoGrupoFlujoCaja;
		
		JPanel jPanelCamposAuxiliarTipoGrupoFlujoCaja=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGrupoFlujoCaja=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			jPanelCamposAuxiliarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jPanelCamposTipoGrupoFlujoCaja;
			jPanelAccionesFormularioAuxiliarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jPanelAccionesFormularioTipoGrupoFlujoCaja;
		}
		
		final JPanel jPanelCamposTipoGrupoFlujoCaja=jPanelCamposAuxiliarTipoGrupoFlujoCaja;
		final JPanel jPanelAccionesFormularioTipoGrupoFlujoCaja=jPanelAccionesFormularioAuxiliarTipoGrupoFlujoCaja;
		
		
		final JMenuBar jmenuBarTipoGrupoFlujoCaja=this.jmenuBarTipoGrupoFlujoCaja;		
		final JToolBar jTtoolBarTipoGrupoFlujoCaja=this.jTtoolBarTipoGrupoFlujoCaja;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGrupoFlujoCaja=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGrupoFlujoCaja=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			jmenuBarDetalleAuxiliarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jmenuBarDetalleTipoGrupoFlujoCaja;
			jTtoolBarDetalleAuxiliarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTtoolBarDetalleTipoGrupoFlujoCaja;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGrupoFlujoCaja=jmenuBarDetalleAuxiliarTipoGrupoFlujoCaja;
		final JToolBar jTtoolBarDetalleTipoGrupoFlujoCaja=jTtoolBarDetalleAuxiliarTipoGrupoFlujoCaja;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGrupoFlujoCaja;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGrupoFlujoCaja;
			processRunnable.jTableDatos=jTableDatosTipoGrupoFlujoCaja;
			processRunnable.jPanelCampos=jPanelCamposTipoGrupoFlujoCaja;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGrupoFlujoCaja;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGrupoFlujoCaja;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGrupoFlujoCaja;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGrupoFlujoCaja;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGrupoFlujoCaja;
			processRunnable.jTtoolBar=jTtoolBarTipoGrupoFlujoCaja;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGrupoFlujoCaja;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGrupoFlujoCaja ,jPanelParametrosReportesTipoGrupoFlujoCaja, jTableDatosTipoGrupoFlujoCaja,/*jScrollPanelDatosTipoGrupoFlujoCaja,*/jPanelCamposTipoGrupoFlujoCaja,jPanelPaginacionTipoGrupoFlujoCaja, /*jScrollPanelDatosEdicionTipoGrupoFlujoCaja,*/ jPanelAccionesTipoGrupoFlujoCaja,jPanelAccionesFormularioTipoGrupoFlujoCaja,jmenuBarTipoGrupoFlujoCaja,jmenuBarDetalleTipoGrupoFlujoCaja,jTtoolBarTipoGrupoFlujoCaja,jTtoolBarDetalleTipoGrupoFlujoCaja));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGrupoFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGrupoFlujoCaja(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGrupoFlujoCaja(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGrupoFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGrupoFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGrupoFlujoCaja,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGrupoFlujoCaja(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGrupoFlujoCaja,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGrupoFlujoCaja,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogrupoflujocajaConstantesFunciones.getsFinalQueryTipoGrupoFlujoCaja();
		String  finalQueryPaginacionTodos=this.tipogrupoflujocajaConstantesFunciones.getsFinalQueryTipoGrupoFlujoCaja();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGrupoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesNoTipoGrupoFlujoCaja(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGrupoFlujoCajaConstantesFunciones.getArrayColumnasGlobalesTipoGrupoFlujoCaja(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGrupoFlujoCajaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogrupoflujocajasEliminados= new ArrayList<TipoGrupoFlujoCaja>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGrupoFlujoCaja();
		
				///*TipoGrupoFlujoCajaSessionBean*/this.tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
			
			if(this.tipogrupoflujocajaSessionBean==null) {
				this.tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
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
					this.iNumeroPaginacion=TipoGrupoFlujoCajaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGrupoFlujoCajaConstantesFunciones.getClassesForeignKeysOfTipoGrupoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogrupoflujocaja."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogrupoflujocajasAux= new ArrayList<TipoGrupoFlujoCaja>();
			
				
			tipogrupoflujocajaLogic.setDatosCliente(this.datosCliente);
			tipogrupoflujocajaLogic.setDatosDeep(this.datosDeep);
			tipogrupoflujocajaLogic.setIsConDeep(true);
			
			
			tipogrupoflujocajaLogic.getTipoGrupoFlujoCajaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogrupoflujocajaLogic.getTodosTipoGrupoFlujoCajas(finalQueryGlobal,pagination);
					
					//tipogrupoflujocajaLogic.getTodosTipoGrupoFlujoCajasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()==null|| tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogrupoflujocajasAux= new ArrayList<TipoGrupoFlujoCaja>();
							tipogrupoflujocajasAux.addAll(tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoflujocajasAux= new ArrayList<TipoGrupoFlujoCaja>();
							tipogrupoflujocajasAux.addAll(tipogrupoflujocajas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogrupoflujocajaLogic.getTodosTipoGrupoFlujoCajas(finalQueryGlobal+"",this.pagination);												
							
							//tipogrupoflujocajaLogic.getTodosTipoGrupoFlujoCajasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGrupoFlujoCajas("Todos",tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogrupoflujocajaLogic.setTipoGrupoFlujoCajas(new ArrayList<TipoGrupoFlujoCaja>());					
							tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().addAll(tipogrupoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoflujocajas=new ArrayList<TipoGrupoFlujoCaja>();
							tipogrupoflujocajas.addAll(tipogrupoflujocajasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGrupoFlujoCaja=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGrupoFlujoCaja=this.idActual;
				
				} else if(this.idTipoGrupoFlujoCajaActual!=null && this.idTipoGrupoFlujoCajaActual!=0L) {
					idTipoGrupoFlujoCaja=idTipoGrupoFlujoCajaActual;
				}
				
					
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndicePorId(idTipoGrupoFlujoCaja);
				
				this.tipogrupoflujocajas=new ArrayList<TipoGrupoFlujoCaja>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogrupoflujocajaLogic.getEntity(idTipoGrupoFlujoCaja);
					
					//tipogrupoflujocajaLogic.getEntityWithConnection(idTipoGrupoFlujoCaja);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoflujocajaLogic.setTipoGrupoFlujoCajas(new ArrayList<TipoGrupoFlujoCaja>());
					tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().add(tipogrupoflujocajaLogic.getTipoGrupoFlujoCaja());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogrupoflujocajas=new ArrayList<TipoGrupoFlujoCaja>();
					this.tipogrupoflujocajas.add(tipogrupoflujocaja);
				}
				
				if(tipogrupoflujocajaLogic.getTipoGrupoFlujoCaja()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogrupoflujocajaLogic.getTipoGrupoFlujoCajasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()==null||tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogrupoflujocajas==null|| tipogrupoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoflujocajasAux=new ArrayList<TipoGrupoFlujoCaja>();
						tipogrupoflujocajasAux.addAll(tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoflujocajasAux=new ArrayList<TipoGrupoFlujoCaja>();
							tipogrupoflujocajasAux.addAll(tipogrupoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogrupoflujocajaLogic.getTipoGrupoFlujoCajasBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGrupoFlujoCajas("BusquedaPorCodigo",tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGrupoFlujoCajas("BusquedaPorCodigo",tipogrupoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoflujocajaLogic.setTipoGrupoFlujoCajas(new ArrayList<TipoGrupoFlujoCaja>());
						tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().addAll(tipogrupoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoflujocajas=new ArrayList<TipoGrupoFlujoCaja>();
							tipogrupoflujocajas.addAll(tipogrupoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogrupoflujocajaLogic.getTipoGrupoFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()==null||tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogrupoflujocajas==null|| tipogrupoflujocajas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoflujocajasAux=new ArrayList<TipoGrupoFlujoCaja>();
						tipogrupoflujocajasAux.addAll(tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoflujocajasAux=new ArrayList<TipoGrupoFlujoCaja>();
							tipogrupoflujocajasAux.addAll(tipogrupoflujocajas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogrupoflujocajaLogic.getTipoGrupoFlujoCajasBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoFlujoCajaConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGrupoFlujoCajas("BusquedaPorNombre",tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGrupoFlujoCajas("BusquedaPorNombre",tipogrupoflujocajas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoflujocajaLogic.setTipoGrupoFlujoCajas(new ArrayList<TipoGrupoFlujoCaja>());
						tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().addAll(tipogrupoflujocajasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoflujocajas=new ArrayList<TipoGrupoFlujoCaja>();
							tipogrupoflujocajas.addAll(tipogrupoflujocajasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGrupoFlujoCaja();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGrupoFlujoCaja();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogrupoflujocajas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogrupoflujocajas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGrupoFlujoCaja tipogrupoflujocaja) {
		Boolean permite=true;
		
		if(this.tipogrupoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGrupoFlujoCajaConstantesFunciones.getOrderByListaTipoGrupoFlujoCaja();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGrupoFlujoCajaConstantesFunciones.getOrderByListaTipoGrupoFlujoCaja();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFlujoCaja tipogrupoflujocaja:tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
				if(tipogrupoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoflujocajaTotales=tipogrupoflujocaja;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFlujoCaja tipogrupoflujocaja:this.tipogrupoflujocajas) {
				if(tipogrupoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoflujocajaTotales=tipogrupoflujocaja;
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
			this.tipogrupoflujocajaAux=new TipoGrupoFlujoCaja();
			this.tipogrupoflujocajaAux.setsType(Constantes2.S_TOTALES);
			this.tipogrupoflujocajaAux.setIsNew(false);
			this.tipogrupoflujocajaAux.setIsChanged(false);
			this.tipogrupoflujocajaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGrupoFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoGrupoFlujoCaja(this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas(),this.tipogrupoflujocajaAux);
				
				this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().add(this.tipogrupoflujocajaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGrupoFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoGrupoFlujoCaja(this.tipogrupoflujocajas,this.tipogrupoflujocajaAux);
				
				this.tipogrupoflujocajas.add(this.tipogrupoflujocajaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogrupoflujocajaTotales=new TipoGrupoFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().remove(tipogrupoflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogrupoflujocajas.remove(tipogrupoflujocajaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogrupoflujocajaTotales=new TipoGrupoFlujoCaja();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFlujoCaja tipogrupoflujocaja:tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
				if(tipogrupoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoflujocajaTotales=tipogrupoflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrupoFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoGrupoFlujoCaja(this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas(),tipogrupoflujocajaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFlujoCaja tipogrupoflujocaja:this.tipogrupoflujocajas) {
				if(tipogrupoflujocaja.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoflujocajaTotales=tipogrupoflujocaja;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrupoFlujoCajaConstantesFunciones.TotalizarValoresFilaTipoGrupoFlujoCaja(this.tipogrupoflujocajas,tipogrupoflujocajaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoGrupoFlujoCajasBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGrupoFlujoCajasBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoGrupoFlujoCajasBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoflujocajaLogic.getTipoGrupoFlujoCajasBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGrupoFlujoCajasBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoflujocajaLogic.getTipoGrupoFlujoCajasBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
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
	
	public void inicializarPermisosTipoGrupoFlujoCaja() {
		this.isPermisoTodoTipoGrupoFlujoCaja=false;
		this.isPermisoNuevoTipoGrupoFlujoCaja=false;
		this.isPermisoActualizarTipoGrupoFlujoCaja=false;
		this.isPermisoActualizarOriginalTipoGrupoFlujoCaja=false;
		this.isPermisoEliminarTipoGrupoFlujoCaja=false;
		this.isPermisoGuardarCambiosTipoGrupoFlujoCaja=false;
		this.isPermisoConsultaTipoGrupoFlujoCaja=false;
		this.isPermisoBusquedaTipoGrupoFlujoCaja=false;
		this.isPermisoReporteTipoGrupoFlujoCaja=false;		
		this.isPermisoOrdenTipoGrupoFlujoCaja=false;		
		this.isPermisoPaginacionMedioTipoGrupoFlujoCaja=false;		
		this.isPermisoPaginacionAltoTipoGrupoFlujoCaja=false;
		this.isPermisoPaginacionTodoTipoGrupoFlujoCaja=false;
		this.isPermisoCopiarTipoGrupoFlujoCaja=false;		
		this.isPermisoVerFormTipoGrupoFlujoCaja=false;		
		this.isPermisoDuplicarTipoGrupoFlujoCaja=false;		
		this.isPermisoOrdenTipoGrupoFlujoCaja=false;		
	}
	
	public void setPermisosUsuarioTipoGrupoFlujoCaja(Boolean isPermiso) {
		this.isPermisoTodoTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoNuevoTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoActualizarTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoEliminarTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoConsultaTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoBusquedaTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoReporteTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoOrdenTipoGrupoFlujoCaja=isPermiso;		
		this.isPermisoPaginacionMedioTipoGrupoFlujoCaja=isPermiso;		
		this.isPermisoPaginacionAltoTipoGrupoFlujoCaja=isPermiso;		
		this.isPermisoPaginacionTodoTipoGrupoFlujoCaja=isPermiso;		
		this.isPermisoCopiarTipoGrupoFlujoCaja=isPermiso;		
		this.isPermisoVerFormTipoGrupoFlujoCaja=isPermiso;		
		this.isPermisoDuplicarTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoOrdenTipoGrupoFlujoCaja=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGrupoFlujoCaja(Boolean isPermiso) {
		//this.isPermisoTodoTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoNuevoTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoActualizarTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoActualizarOriginalTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoEliminarTipoGrupoFlujoCaja=isPermiso;
		this.isPermisoGuardarCambiosTipoGrupoFlujoCaja=isPermiso;
		//this.isPermisoConsultaTipoGrupoFlujoCaja=isPermiso;
		//this.isPermisoBusquedaTipoGrupoFlujoCaja=isPermiso;
		//this.isPermisoReporteTipoGrupoFlujoCaja=isPermiso;
		//this.isPermisoOrdenTipoGrupoFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGrupoFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGrupoFlujoCaja=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGrupoFlujoCaja=isPermiso;		
		//this.isPermisoCopiarTipoGrupoFlujoCaja=isPermiso;		
		//this.isPermisoDuplicarTipoGrupoFlujoCaja=isPermiso;
		//this.isPermisoOrdenTipoGrupoFlujoCaja=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGrupoFlujoCajaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(LineaFlujoCajaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(CentroActividadConstantesFunciones.SNOMBREOPCION);
		
		if(TipoGrupoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosLineaFlujoCaja=false;
		this.isTienePermisosLineaFlujoCaja=this.verificarGetPermisosUsuarioOpcionTipoGrupoFlujoCajaClaseRelacionada(this.opcionsRelacionadas,LineaFlujoCajaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosCentroActividad=false;
		this.isTienePermisosCentroActividad=this.verificarGetPermisosUsuarioOpcionTipoGrupoFlujoCajaClaseRelacionada(this.opcionsRelacionadas,CentroActividadConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGrupoFlujoCaja(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGrupoFlujoCajaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosLineaFlujoCaja=conPermiso;
		this.isTienePermisosCentroActividad=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGrupoFlujoCajaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGrupoFlujoCajaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGrupoFlujoCajaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosLineaFlujoCaja && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.remove(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosCentroActividad && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.remove(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoGrupoFlujoCaja() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGrupoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGrupoFlujoCajaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGrupoFlujoCaja=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGrupoFlujoCaja=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGrupoFlujoCaja=this.isPermisoActualizarTipoGrupoFlujoCaja;
			this.isPermisoEliminarTipoGrupoFlujoCaja=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGrupoFlujoCaja=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGrupoFlujoCaja=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGrupoFlujoCaja=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGrupoFlujoCaja=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGrupoFlujoCaja=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGrupoFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGrupoFlujoCaja=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGrupoFlujoCaja=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGrupoFlujoCaja=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGrupoFlujoCaja=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGrupoFlujoCaja=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGrupoFlujoCaja=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGrupoFlujoCaja=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGrupoFlujoCaja.setToolTipText(this.jTableDatosTipoGrupoFlujoCaja.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGrupoFlujoCaja(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGrupoFlujoCaja(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGrupoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGrupoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGrupoFlujoCaja() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosLineaFlujoCaja && this.tipogrupoflujocajaConstantesFunciones.mostrarLineaFlujoCajaTipoGrupoFlujoCaja && !TipoGrupoFlujoCajaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Linea Flujo Caja");
			reporte.setsDescripcion("Linea Flujo Caja");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosCentroActividad && this.tipogrupoflujocajaConstantesFunciones.mostrarCentroActividadTipoGrupoFlujoCaja && !TipoGrupoFlujoCajaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Centro Actividad");
			reporte.setsDescripcion("Centro Actividad");
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
	
		
	public void inicializarCombosForeignKeyTipoGrupoFlujoCajaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGrupoFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGrupoFlujoCajaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGrupoFlujoCajaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoGrupoFlujoCajaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGrupoFlujoCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoGrupoFlujoCaja()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGrupoFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGrupoFlujoCaja()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoFlujoCaja();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGrupoFlujoCaja()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoFlujoCaja()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGrupoFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGrupoFlujoCaja()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGrupoFlujoCaja()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGrupoFlujoCaja()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGrupoFlujoCaja(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGrupoFlujoCaja()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoGrupoFlujoCajaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGrupoFlujoCajaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGrupoFlujoCajaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean(); 
		this.tipogrupoflujocajaConstantesFunciones=new TipoGrupoFlujoCajaConstantesFunciones(); 
		this.tipogrupoflujocajaBean=new TipoGrupoFlujoCaja();//(this.tipogrupoflujocajaConstantesFunciones); 		
		this.tipogrupoflujocajaReturnGeneral=new TipoGrupoFlujoCajaParameterReturnGeneral(); 
		
		this.tipogrupoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrupoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGrupoFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGrupoFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGrupoFlujoCajaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGrupoFlujoCaja(true);
			
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
			
			this.tipogrupoflujocajaConstantesFunciones=new TipoGrupoFlujoCajaConstantesFunciones(); 
			this.tipogrupoflujocajaBean=new TipoGrupoFlujoCaja();//this.tipogrupoflujocajaConstantesFunciones); 			
			this.tipogrupoflujocajaReturnGeneral=new TipoGrupoFlujoCajaParameterReturnGeneral(); 
		
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Grupo Flujo Caja Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogrupoflujocaja=new TipoGrupoFlujoCaja();
			this.tipogrupoflujocajas = new ArrayList<TipoGrupoFlujoCaja>();
			this.tipogrupoflujocajasAux = new ArrayList<TipoGrupoFlujoCaja>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic=new TipoGrupoFlujoCajaLogic();
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogrupoflujocajaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogrupoflujocajaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGrupoFlujoCaja);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja);	
					}
					
					if(this.jInternalFrameImportacionTipoGrupoFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGrupoFlujoCaja);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGrupoFlujoCaja!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGrupoFlujoCaja);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja);
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setVisible(false);
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja);
					this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGrupoFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGrupoFlujoCaja);
					this.jInternalFrameImportacionTipoGrupoFlujoCaja.setVisible(false);
					this.jInternalFrameImportacionTipoGrupoFlujoCaja.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGrupoFlujoCaja!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGrupoFlujoCaja);
					this.jInternalFrameOrderByTipoGrupoFlujoCaja.setVisible(false);
					this.jInternalFrameOrderByTipoGrupoFlujoCaja.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGrupoFlujoCajaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGrupoFlujoCajaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipogrupoflujocajaReturnGeneral=new TipoGrupoFlujoCajaParameterReturnGeneral();
			
			this.tipogrupoflujocajaParameterGeneral=new TipoGrupoFlujoCajaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogrupoflujocajaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGrupoFlujoCajaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(LineaFlujoCajaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(CentroActividadConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGrupoFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado(),this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGrupoFlujoCajaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado(),this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaCopiarTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaVerFormTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaOrdenTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGrupoFlujoCaja();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGrupoFlujoCaja(false);
			
			this.setPermisosUsuarioTipoGrupoFlujoCaja();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado() && this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGrupoFlujoCajaClasesRelacionadas();
			}
			
			if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGrupoFlujoCajaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGrupoFlujoCaja();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGrupoFlujoCaja();
			}
			
			if(!this.isPermisoBusquedaTipoGrupoFlujoCaja) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGrupoFlujoCaja,this.isPermisoPaginacionMedioTipoGrupoFlujoCaja,this.isPermisoPaginacionTodoTipoGrupoFlujoCaja);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGrupoFlujoCajaConstantesFunciones.getTiposSeleccionarTipoGrupoFlujoCaja());
				
				this.tiposColumnasSelect=TipoGrupoFlujoCajaConstantesFunciones.getTiposSeleccionarTipoGrupoFlujoCaja(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoGrupoFlujoCaja();				
				//this.tiposRelacionesSelect=TipoGrupoFlujoCajaConstantesFunciones.getTiposRelacionesTipoGrupoFlujoCaja(true);
				
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
			//if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGrupoFlujoCaja();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoGrupoFlujoCaja(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoGrupoFlujoCaja(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoFlujoCaja() ;
			
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
			
			
			this.lineaflujocajaLogic=new LineaFlujoCajaLogic();
			this.centroactividadLogic=new CentroActividadLogic(); 
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
				tipogrupoflujocajaImplementable= (TipoGrupoFlujoCajaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGrupoFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogrupoflujocajaImplementableHome= (TipoGrupoFlujoCajaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGrupoFlujoCajaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogrupoflujocajas= new ArrayList<TipoGrupoFlujoCaja>();
			this.tipogrupoflujocajasEliminados= new ArrayList<TipoGrupoFlujoCaja>();
						
			this.isEsNuevoTipoGrupoFlujoCaja=false;
			this.esParaAccionDesdeFormularioTipoGrupoFlujoCaja=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGrupoFlujoCaja(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGrupoFlujoCaja();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGrupoFlujoCajaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGrupoFlujoCaja();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGrupoFlujoCaja();
			}
			
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGrupoFlujoCaja(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGrupoFlujoCaja: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGrupoFlujoCaja() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(CentroActividadConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(CentroActividadConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGrupoFlujoCaja")) {
				iIndex=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();	
				
				

				if(sTitle.equals("Centro Actividades")) {
					if(!CentroActividadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGrupoFlujoCaja();

						this.cargarParteTabPanelRelacionadaCentroActividad(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Linea Flujo Cajas")) {
					if(!LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGrupoFlujoCaja();

						this.cargarParteTabPanelRelacionadaLineaFlujoCaja(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGrupoFlujoCaja();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCentroActividad(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.cargarSessionConBeanSwingJInternalFrameCentroActividad(false,true,iIndex);
		this.jButtonCentroActividadActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCentroActividad();

		//this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.updateUI();
		//this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaLineaFlujoCaja(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.cargarSessionConBeanSwingJInternalFrameLineaFlujoCaja(false,true,iIndex);
		this.jButtonLineaFlujoCajaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaLineaFlujoCaja();

		//this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.updateUI();
		//this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("LineaFlujoCaja")) {
				int row=this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
				jButtonLineaFlujoCajaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("CentroActividad")) {
				int row=this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
				jButtonCentroActividadActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Linea Flujo Caja")) {

					if(this.isTienePermisosLineaFlujoCaja && this.tipogrupoflujocajaConstantesFunciones.mostrarLineaFlujoCajaTipoGrupoFlujoCaja && !TipoGrupoFlujoCajaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Linea Flujo Cajas"+"("+LineaFlujoCajaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Linea Flujo Cajas");

						if(tipogrupoflujocajaConstantesFunciones.resaltarLineaFlujoCajaTipoGrupoFlujoCaja!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrupoflujocajaConstantesFunciones.resaltarLineaFlujoCajaTipoGrupoFlujoCaja);
						}

						jmenuItem.setEnabled(this.tipogrupoflujocajaConstantesFunciones.activarLineaFlujoCajaTipoGrupoFlujoCaja);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"LineaFlujoCaja"));

						

						this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jmenuDetalleTipoGrupoFlujoCaja.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Centro Actividad")) {

					if(this.isTienePermisosCentroActividad && this.tipogrupoflujocajaConstantesFunciones.mostrarCentroActividadTipoGrupoFlujoCaja && !TipoGrupoFlujoCajaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Centro Actividades"+"("+CentroActividadConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Centro Actividades");

						if(tipogrupoflujocajaConstantesFunciones.resaltarCentroActividadTipoGrupoFlujoCaja!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrupoflujocajaConstantesFunciones.resaltarCentroActividadTipoGrupoFlujoCaja);
						}

						jmenuItem.setEnabled(this.tipogrupoflujocajaConstantesFunciones.activarCentroActividadTipoGrupoFlujoCaja);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"CentroActividad"));

						

						this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jmenuDetalleTipoGrupoFlujoCaja.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoGrupoFlujoCaja(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGrupoFlujoCaja(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGrupoFlujoCaja(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGrupoFlujoCajaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGrupoFlujoCaja();
		
		this.cargarCombosFrameForeignKeyTipoGrupoFlujoCaja();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGrupoFlujoCaja();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGrupoFlujoCaja();
		}
	}
	
	
	
	public void jButtonNuevoTipoGrupoFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
			
			if(jTableDatosTipoGrupoFlujoCaja.getRowCount()>=1) {
				jTableDatosTipoGrupoFlujoCaja.removeRowSelectionInterval(0, jTableDatosTipoGrupoFlujoCaja.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGrupoFlujoCaja=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGrupoFlujoCaja(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGrupoFlujoCaja(true);			
			//this.tipogrupoflujocaja=new TipoGrupoFlujoCaja();
			//this.tipogrupoflujocaja.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoFlujoCaja(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja() ;
			
			if(TipoGrupoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoFlujoCaja(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogrupoflujocaja);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);				
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
			if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGrupoFlujoCaja: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGrupoFlujoCajaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGrupoFlujoCaja.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGrupoFlujoCaja.getSelectedRows().length;			
			}
			
			tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGrupoFlujoCaja--;			
				//TipoGrupoFlujoCaja tipogrupoflujocajaAux= new TipoGrupoFlujoCaja();			
				//tipogrupoflujocajaAux.setId(this.iIdNuevoTipoGrupoFlujoCaja);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGrupoFlujoCaja tipogrupoflujocajaOrigen=new TipoGrupoFlujoCaja();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGrupoFlujoCaja tipogrupoflujocajaOrigen : tipogrupoflujocajasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogrupoflujocajaOrigen =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoflujocajaOrigen =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGrupoFlujoCaja();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogrupoflujocaja.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGrupoFlujoCaja(tipogrupoflujocajaOrigen,this.tipogrupoflujocaja,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().add(this.tipogrupoflujocajaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogrupoflujocajas.add(this.tipogrupoflujocajaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
				
				this.jTableDatosTipoGrupoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoFlujoCaja(), this.getIndiceNuevoTipoGrupoFlujoCaja());
				
				int iLastRow =  this.jTableDatosTipoGrupoFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGrupoFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGrupoFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();									
		
			TipoGrupoFlujoCaja tipogrupoflujocajaOrigen=new TipoGrupoFlujoCaja();
			TipoGrupoFlujoCaja tipogrupoflujocajaDestino=new TipoGrupoFlujoCaja();
				
			tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGrupoFlujoCaja.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogrupoflujocajasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGrupoFlujoCaja.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoflujocajaOrigen =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogrupoflujocajaOrigen =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoflujocajaDestino =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogrupoflujocajaDestino =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogrupoflujocajaOrigen =tipogrupoflujocajasSeleccionados.get(0);
				tipogrupoflujocajaDestino =tipogrupoflujocajasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGrupoFlujoCaja(tipogrupoflujocajaOrigen,tipogrupoflujocajaDestino,true,false);
				
				tipogrupoflujocajaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogrupoflujocajaDestino,tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoflujocajaDestino,tipogrupoflujocajas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
				
				//this.jTableDatosTipoGrupoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoFlujoCaja(), this.getIndiceNuevoTipoGrupoFlujoCaja());
				
				int iLastRow =  this.jTableDatosTipoGrupoFlujoCaja.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGrupoFlujoCaja.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGrupoFlujoCaja.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGrupoFlujoCaja.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(!isVisible);
			this.jPanelPaginacionTipoGrupoFlujoCaja.setVisible(!isVisible);
			this.jPanelAccionesTipoGrupoFlujoCaja.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGrupoFlujoCaja();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGrupoFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGrupoFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGrupoFlujoCaja();
			
			this.abrirFrameOrderByTipoGrupoFlujoCaja();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGrupoFlujoCaja();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGrupoFlujoCaja(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGrupoFlujoCaja);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setSize(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.iWidthFormulario,this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jContentPaneDetalleTipoGrupoFlujoCaja.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jContentPaneDetalleTipoGrupoFlujoCaja.getWidth(),TipoGrupoFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jContentPaneDetalleTipoGrupoFlujoCaja.getWidth(),TipoGrupoFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jContentPaneDetalleTipoGrupoFlujoCaja.getWidth(),TipoGrupoFlujoCajaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(CentroActividadJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCentroActividad();
					}

					if(LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaLineaFlujoCaja();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGrupoFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGrupoFlujoCaja==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGrupoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoFlujoCaja,false,this);
				} else {
					this.jInternalFrameOrderByTipoGrupoFlujoCaja=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoFlujoCaja,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGrupoFlujoCaja);
				this.jInternalFrameOrderByTipoGrupoFlujoCaja.setVisible(false);
				this.jInternalFrameOrderByTipoGrupoFlujoCaja.setSelected(false);
				
				this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGrupoFlujoCaja"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGrupoFlujoCaja();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGrupoFlujoCaja() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGrupoFlujoCaja==null) {
				
				this.jInternalFrameImportacionTipoGrupoFlujoCaja=new ImportacionJInternalFrame(TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGrupoFlujoCaja);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGrupoFlujoCaja);
				this.jInternalFrameImportacionTipoGrupoFlujoCaja.setVisible(false);
				this.jInternalFrameImportacionTipoGrupoFlujoCaja.setSelected(false);


				this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGrupoFlujoCaja"));
				this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGrupoFlujoCaja"));
				this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGrupoFlujoCaja"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGrupoFlujoCaja() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja==null) {
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja=new ReporteDinamicoJInternalFrame(TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja);
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoFlujoCaja"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoFlujoCaja();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCentroActividad() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.jScrollPanelDatosCentroActividad.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jContentPaneDetalleTipoGrupoFlujoCaja.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.jScrollPanelDatosCentroActividad.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.jScrollPanelDatosCentroActividad.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.jScrollPanelDatosCentroActividad.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaLineaFlujoCaja() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jContentPaneDetalleTipoGrupoFlujoCaja.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoGrupoFlujoCaja() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGrupoFlujoCaja);
			
	       	this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.dispose();
			//this.jInternalFrameDetalleFormTipoGrupoFlujoCaja=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGrupoFlujoCaja() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGrupoFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGrupoFlujoCaja.setVisible(true);
	        this.jInternalFrameImportacionTipoGrupoFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGrupoFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setVisible(true);
	        this.jInternalFrameOrderByTipoGrupoFlujoCaja.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGrupoFlujoCaja() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGrupoFlujoCaja.setVisible(false);
	        this.jInternalFrameOrderByTipoGrupoFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGrupoFlujoCaja() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGrupoFlujoCaja() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGrupoFlujoCaja.setVisible(false);
	        this.jInternalFrameImportacionTipoGrupoFlujoCaja.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGrupoFlujoCaja(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGrupoFlujoCaja(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGrupoFlujoCaja(true);
			//this.isEsNuevoTipoGrupoFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoFlujoCaja(false) ;
			
			if(tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.getEsGuardarRelacionado() && LineaFlujoCajaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonLineaFlujoCajaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.getEsGuardarRelacionado() && CentroActividadJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonCentroActividadActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoGrupoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoFlujoCaja(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGrupoFlujoCajaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGrupoFlujoCaja(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGrupoFlujoCaja(true);
			//this.isEsNuevoTipoGrupoFlujoCaja=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogrupoflujocaja.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGrupoFlujoCaja(false) ;
			
			if(TipoGrupoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoFlujoCaja(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGrupoFlujoCaja(false);
			
			//if(!this.isEsNuevoTipoGrupoFlujoCaja) {								
				int intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
				
			}
			
			if(this.permiteMantenimiento(this.tipogrupoflujocaja)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGrupoFlujoCaja=true;
					this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
					this.isEsNuevoTipoGrupoFlujoCaja=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGrupoFlujoCaja=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGrupoFlujoCaja=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGrupoFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesTipoGrupoFlujoCaja(false);
			
												
				
				if(TipoGrupoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGrupoFlujoCaja();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,tipogrupoflujocajaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGrupoFlujoCaja.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogrupoflujocajaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogrupoflujocaja.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.tipogrupoflujocaja.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				this.tipogrupoflujocaja.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogrupoflujocaja)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGrupoFlujoCajaModel) this.jTableDatosTipoGrupoFlujoCaja.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGrupoFlujoCaja=true;
				this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
				this.isEsNuevoTipoGrupoFlujoCaja=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGrupoFlujoCaja(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja(false);
				
				this.habilitarDeshabilitarControlesTipoGrupoFlujoCaja(false);
				
				
				
				if(TipoGrupoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGrupoFlujoCaja();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGrupoFlujoCaja.getRowCount()>=1) {
				jTableDatosTipoGrupoFlujoCaja.removeRowSelectionInterval(0, jTableDatosTipoGrupoFlujoCaja.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGrupoFlujoCaja(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoFlujoCaja(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja(false) ;
			
			this.isEsNuevoTipoGrupoFlujoCaja=false;
			
			if(TipoGrupoFlujoCajaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGrupoFlujoCaja();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
				
				//SI ES MANUAL
				if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGrupoFlujoCaja();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGrupoFlujoCaja--;			
			//TipoGrupoFlujoCaja tipogrupoflujocajaAux= new TipoGrupoFlujoCaja();			
			//tipogrupoflujocajaAux.setId(this.iIdNuevoTipoGrupoFlujoCaja);
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGrupoFlujoCaja();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
			
			this.tipogrupoflujocaja.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().add(this.tipogrupoflujocajaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogrupoflujocajas.add(this.tipogrupoflujocajaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
			
			this.jTableDatosTipoGrupoFlujoCaja.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoFlujoCaja(), this.getIndiceNuevoTipoGrupoFlujoCaja());
			
			int iLastRow =  this.jTableDatosTipoGrupoFlujoCaja.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGrupoFlujoCaja.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGrupoFlujoCaja.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoFlujoCaja();
			}
			
			//this.abrirFrameTreeTipoGrupoFlujoCaja();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Grupo Flujo CajaS ?", "MANTENIMIENTO DE Tipo Grupo Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGrupoFlujoCaja.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGrupoFlujoCaja();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogrupoflujocajaReturnGeneral=tipogrupoflujocajaLogic.procesarImportacionTipoGrupoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogrupoflujocajaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGrupoFlujoCajaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGrupoFlujoCaja.setFileImportacion(this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGrupoFlujoCaja.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGrupoFlujoCaja.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();		

		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGrupoFlujoCajaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGrupoFlujoCajaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGrupoFlujoCajas("Todos",tipogrupoflujocajasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();		
		
		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoflujocaja";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGrupoFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoGrupoFlujoCaja tipogrupoflujocaja:tipogrupoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogrupoflujocaja.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGrupoFlujoCaja tipogrupoflujocaja:tipogrupoflujocajasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogrupoflujocaja.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoGrupoFlujoCaja(row);				
			//	iRow++;
			//}				
			
			//for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGrupoFlujoCaja(tipogrupoflujocajaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoFlujoCaja();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGrupoFlujoCaja();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
			
			//SI ES MANUAL
			if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGrupoFlujoCaja();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGrupoFlujoCaja() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGrupoFlujoCaja.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGrupoFlujoCaja.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGrupoFlujoCaja.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGrupoFlujoCaja.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGrupoFlujoCaja.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGrupoFlujoCaja.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGrupoFlujoCaja.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGrupoFlujoCaja(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGrupoFlujoCaja(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGrupoFlujoCaja(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGrupoFlujoCaja(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGrupoFlujoCaja(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoFlujoCaja(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGrupoFlujoCaja(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGrupoFlujoCaja() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja();
		
		this.inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGrupoFlujoCaja();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoFlujoCaja() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoFlujoCaja(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoFlujoCaja(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGrupoFlujoCaja.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jCheckBoxPostAccionNuevoTipoGrupoFlujoCaja.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jCheckBoxPostAccionSinCerrarTipoGrupoFlujoCaja.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jCheckBoxPostAccionSinMensajeTipoGrupoFlujoCaja.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGrupoFlujoCaja.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jCheckBoxPostAccionNuevoTipoGrupoFlujoCaja.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jCheckBoxPostAccionSinCerrarTipoGrupoFlujoCaja.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jCheckBoxPostAccionSinMensajeTipoGrupoFlujoCaja.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGrupoFlujoCaja.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGrupoFlujoCaja(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoFlujoCaja(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoFlujoCaja() throws Exception {
		try	{
			if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGrupoFlujoCaja();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGrupoFlujoCaja() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGrupoFlujoCaja() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGrupoFlujoCaja.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGrupoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGrupoFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGrupoFlujoCaja.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.addItem(reporte);
			}
			
			
			if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGrupoFlujoCaja.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoFlujoCaja();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoFlujoCaja() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGrupoFlujoCaja()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoGrupoFlujoCaja.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoGrupoFlujoCaja.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGrupoFlujoCaja(Boolean esInicializar) throws Exception {				
		if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGrupoFlujoCaja();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGrupoFlujoCaja() throws Exception {
		this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGrupoFlujoCaja() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGrupoFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGrupoFlujoCajaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGrupoFlujoCajaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFlujoCajaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGrupoFlujoCajaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGrupoFlujoCajaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGrupoFlujoCaja(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogrupoflujocajas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGrupoFlujoCaja.setModel(new TipoGrupoFlujoCajaModel(this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGrupoFlujoCaja.setModel(new TipoGrupoFlujoCajaModel(this.tipogrupoflujocajas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGrupoFlujoCaja!=null && this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGrupoFlujoCaja();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFlujoCaja,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGrupoFlujoCajaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,tipogrupoflujocajaConstantesFunciones.resaltarSeleccionarTipoGrupoFlujoCaja,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGrupoFlujoCajaConstantesFunciones.SCLASSWEBTITULO,tipogrupoflujocajaConstantesFunciones.resaltarSeleccionarTipoGrupoFlujoCaja,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFlujoCaja,TipoGrupoFlujoCajaConstantesFunciones.LABEL_ID));

		if(this.tipogrupoflujocajaConstantesFunciones.mostraridTipoGrupoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoFlujoCajaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogrupoflujocajaConstantesFunciones.resaltaridTipoGrupoFlujoCaja,this.tipogrupoflujocajaConstantesFunciones.activaridTipoGrupoFlujoCaja,this,true,"idTipoGrupoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogrupoflujocajaConstantesFunciones.resaltaridTipoGrupoFlujoCaja,this.tipogrupoflujocajaConstantesFunciones.activaridTipoGrupoFlujoCaja,this,true,"idTipoGrupoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFlujoCaja,TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO));

		if(this.tipogrupoflujocajaConstantesFunciones.mostrarcodigoTipoGrupoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogrupoflujocajaConstantesFunciones.resaltarcodigoTipoGrupoFlujoCaja,this.tipogrupoflujocajaConstantesFunciones.activarcodigoTipoGrupoFlujoCaja,this,true,"codigoTipoGrupoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogrupoflujocajaConstantesFunciones.resaltarcodigoTipoGrupoFlujoCaja,this.tipogrupoflujocajaConstantesFunciones.activarcodigoTipoGrupoFlujoCaja,this,true,"codigoTipoGrupoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGrupoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFlujoCaja,TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogrupoflujocajaConstantesFunciones.mostrarnombreTipoGrupoFlujoCaja && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogrupoflujocajaConstantesFunciones.resaltarnombreTipoGrupoFlujoCaja,this.tipogrupoflujocajaConstantesFunciones.activarnombreTipoGrupoFlujoCaja,this,true,"nombreTipoGrupoFlujoCaja","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogrupoflujocajaConstantesFunciones.resaltarnombreTipoGrupoFlujoCaja,this.tipogrupoflujocajaConstantesFunciones.activarnombreTipoGrupoFlujoCaja,this,true,"nombreTipoGrupoFlujoCaja","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoGrupoFlujoCajaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosLineaFlujoCaja && this.tipogrupoflujocajaConstantesFunciones.mostrarLineaFlujoCajaTipoGrupoFlujoCaja && !TipoGrupoFlujoCajaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Linea Flujo Cajas");
				tableColumn.setHeaderValue("Linea Flujo Cajas");
				tableColumn.setCellRenderer(new LineaFlujoCajaTableCell(tipogrupoflujocajaConstantesFunciones.resaltarLineaFlujoCajaTipoGrupoFlujoCaja,this,this.tipogrupoflujocajaConstantesFunciones.activarLineaFlujoCajaTipoGrupoFlujoCaja));
				tableColumn.setCellEditor(new LineaFlujoCajaTableCell(tipogrupoflujocajaConstantesFunciones.resaltarLineaFlujoCajaTipoGrupoFlujoCaja,this,this.tipogrupoflujocajaConstantesFunciones.activarLineaFlujoCajaTipoGrupoFlujoCaja));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGrupoFlujoCaja.addColumn(tableColumn);
			}

			if(this.isTienePermisosCentroActividad && this.tipogrupoflujocajaConstantesFunciones.mostrarCentroActividadTipoGrupoFlujoCaja && !TipoGrupoFlujoCajaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Centro Actividades");
				tableColumn.setHeaderValue("Centro Actividades");
				tableColumn.setCellRenderer(new CentroActividadTableCell(tipogrupoflujocajaConstantesFunciones.resaltarCentroActividadTipoGrupoFlujoCaja,this,this.tipogrupoflujocajaConstantesFunciones.activarCentroActividadTipoGrupoFlujoCaja));
				tableColumn.setCellEditor(new CentroActividadTableCell(tipogrupoflujocajaConstantesFunciones.resaltarCentroActividadTipoGrupoFlujoCaja,this,this.tipogrupoflujocajaConstantesFunciones.activarCentroActividadTipoGrupoFlujoCaja));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGrupoFlujoCaja.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGrupoFlujoCaja.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGrupoFlujoCaja.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGrupoFlujoCaja.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoGrupoFlujoCaja.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGrupoFlujoCaja.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGrupoFlujoCaja.moveColumn(this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGrupoFlujoCaja.moveColumn(this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoGrupoFlujoCaja.moveColumn(this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGrupoFlujoCaja.moveColumn(this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGrupoFlujoCaja.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGrupoFlujoCaja.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGrupoFlujoCaja,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGrupoFlujoCaja.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGrupoFlujoCaja.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGrupoFlujoCaja.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogrupoflujocajas.size()-1;
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
		//this.jTableDatosTipoGrupoFlujoCaja.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGrupoFlujoCaja.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGrupoFlujoCaja();
			
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
				
				//this.isEsNuevoTipoGrupoFlujoCaja=false;
					
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
				if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGrupoFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogrupoflujocaja.getsType().equals("DUPLICADO")
				   || this.tipogrupoflujocaja.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGrupoFlujoCaja=true;
				
				} else {
					this.isEsNuevoTipoGrupoFlujoCaja=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogrupoflujocaja.getId()>=0 && !this.tipogrupoflujocaja.getIsNew()) {						
						this.isEsNuevoTipoGrupoFlujoCaja=false;
						
					} else {
						this.isEsNuevoTipoGrupoFlujoCaja=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGrupoFlujoCaja(esRelaciones);						
				
				this.seleccionarTipoGrupoFlujoCaja(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogrupoflujocaja.getId()<0) {
					this.isEsNuevoTipoGrupoFlujoCaja=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGrupoFlujoCaja(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGrupoFlujoCaja(evt,rowIndex);
				}	
				
				if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGrupoFlujoCaja: " + this.dDif); 
					}
				}								
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGrupoFlujoCaja(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogrupoflujocaja)) {
					if(this.tipogrupoflujocaja.getId()>0) {
						this.tipogrupoflujocaja.setIsDeleted(true);
						
						this.tipogrupoflujocajasEliminados.add(this.tipogrupoflujocaja);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().remove(this.tipogrupoflujocaja);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogrupoflujocajas.remove(this.tipogrupoflujocaja);				
					}
					
					
					((TipoGrupoFlujoCajaModel) this.jTableDatosTipoGrupoFlujoCaja.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGrupoFlujoCaja(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGrupoFlujoCaja) {
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGrupoFlujoCaja.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGrupoFlujoCaja(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGrupoFlujoCaja(tipogrupoflujocaja,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGrupoFlujoCaja(tipogrupoflujocaja);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGrupoFlujoCaja(tipogrupoflujocaja,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFlujoCaja(tipogrupoflujocaja);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.setText(tipogrupoflujocaja.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldcodigoTipoGrupoFlujoCaja.setText(tipogrupoflujocaja.getcodigo());
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextAreanombreTipoGrupoFlujoCaja.setText(tipogrupoflujocaja.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGrupoFlujoCaja tipogrupoflujocajaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogrupoflujocajaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGrupoFlujoCaja tipogrupoflujocajaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogrupoflujocajaLocal=this.tipogrupoflujocaja;
			} else {
				tipogrupoflujocajaLocal=this.tipogrupoflujocajaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogrupoflujocajaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGrupoFlujoCaja(tipogrupoflujocajaLocal,true);
					
					if(tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogrupoflujocajaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogrupoflujocajaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(tipogrupoflujocaja,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(tipogrupoflujocaja);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(tipogrupoflujocaja,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.getText()==null || this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.getText()=="" || this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.setText("0");
			}

			if(conColumnasBase) {tipogrupoflujocaja.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoFlujoCajaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jLabelIdTipoGrupoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogrupoflujocaja.setcodigo(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldcodigoTipoGrupoFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jLabelcodigoTipoGrupoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogrupoflujocaja.setnombre(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextAreanombreTipoGrupoFlujoCaja.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jLabelnombreTipoGrupoFlujoCaja,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocajaBean,TipoGrupoFlujoCaja tipogrupoflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocajaOrigen,TipoGrupoFlujoCaja tipogrupoflujocaja,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogrupoflujocajaOrigen.getId()!=null && !tipogrupoflujocajaOrigen.getId().equals(0L))) {tipogrupoflujocaja.setId(tipogrupoflujocajaOrigen.getId());}}
			if(conDefault || (!conDefault && tipogrupoflujocajaOrigen.getcodigo()!=null && !tipogrupoflujocajaOrigen.getcodigo().equals(""))) {tipogrupoflujocaja.setcodigo(tipogrupoflujocajaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipogrupoflujocajaOrigen.getnombre()!=null && !tipogrupoflujocajaOrigen.getnombre().equals(""))) {tipogrupoflujocaja.setnombre(tipogrupoflujocajaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.setText(tipogrupoflujocaja.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldcodigoTipoGrupoFlujoCaja.setText(tipogrupoflujocaja.getcodigo());
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextAreanombreTipoGrupoFlujoCaja.setText(tipogrupoflujocaja.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGrupoFlujoCaja(TipoGrupoFlujoCajaBean tipogrupoflujocajaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.setText(tipogrupoflujocajaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldcodigoTipoGrupoFlujoCaja.setText(tipogrupoflujocajaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextAreanombreTipoGrupoFlujoCaja.setText(tipogrupoflujocajaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGrupoFlujoCaja(TipoGrupoFlujoCajaParameterReturnGeneral tipogrupoflujocajaReturnGeneral,TipoGrupoFlujoCajaBean tipogrupoflujocajaBean,Boolean conDefault) throws Exception { 
		try {
			TipoGrupoFlujoCaja tipogrupoflujocajaLocal=new TipoGrupoFlujoCaja();
			
			tipogrupoflujocajaLocal=tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogrupoflujocajaLocal.getId()!=null && !tipogrupoflujocajaLocal.getId().equals(0L))) {tipogrupoflujocajaBean.setId(tipogrupoflujocajaLocal.getId());}}
			if(conDefault || (!conDefault && tipogrupoflujocajaLocal.getcodigo()!=null && !tipogrupoflujocajaLocal.getcodigo().equals(""))) {tipogrupoflujocajaBean.setcodigo(tipogrupoflujocajaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipogrupoflujocajaLocal.getnombre()!=null && !tipogrupoflujocajaLocal.getnombre().equals(""))) {tipogrupoflujocajaBean.setnombre(tipogrupoflujocajaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGrupoFlujoCajaGenerico(Long idTipoGrupoFlujoCajaSeleccionado,JComboBox jComboBoxTipoGrupoFlujoCaja,List<TipoGrupoFlujoCaja> tipogrupoflujocajasLocal)throws Exception {
		try {
			TipoGrupoFlujoCaja  tipogrupoflujocajaTemp=null;

			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasLocal) {
				if(tipogrupoflujocajaAux.getId()!=null && tipogrupoflujocajaAux.getId().equals(idTipoGrupoFlujoCajaSeleccionado)) {
					tipogrupoflujocajaTemp=tipogrupoflujocajaAux;
					break;
				}
			}

			jComboBoxTipoGrupoFlujoCaja.setSelectedItem(tipogrupoflujocajaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGrupoFlujoCajaGenerico(JComboBox jComboBoxTipoGrupoFlujoCaja,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGrupoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrupoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGrupoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrupoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrupoFlujoCaja.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGrupoFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrupoFlujoCaja.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGrupoFlujoCaja.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGrupoFlujoCaja.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGrupoFlujoCaja.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("LineaFlujoCaja")) {
			jButtonLineaFlujoCajaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("CentroActividad")) {
			jButtonCentroActividadActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogrupoflujocaja=(TipoGrupoFlujoCaja) tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogrupoflujocaja =(TipoGrupoFlujoCaja) tipogrupoflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGrupoFlujoCaja tipogrupoflujocajaRow=new TipoGrupoFlujoCaja();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogrupoflujocajaRow=(TipoGrupoFlujoCaja) tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogrupoflujocajaRow=(TipoGrupoFlujoCaja) tipogrupoflujocajas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonLineaFlujoCajaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGrupoFlujoCaja tipogrupoflujocaja) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoflujocaja = (TipoGrupoFlujoCaja)this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogrupoflujocaja = (TipoGrupoFlujoCaja)this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogrupoflujocaja!=null) {
						this.tipogrupoflujocaja = tipogrupoflujocaja;
					} else {
						this.tipogrupoflujocaja = new TipoGrupoFlujoCaja();
					}
				}

				if(this.isTienePermisosLineaFlujoCaja && this.permiteMantenimiento(this.tipogrupoflujocaja)) {
					LineaFlujoCajaBeanSwingJInternalFrame lineaflujocajaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup=new LineaFlujoCajaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						lineaflujocajaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup;
					} else {
						lineaflujocajaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame;
					}

					List<TipoGrupoFlujoCaja> tipogrupoflujocajas=new ArrayList<TipoGrupoFlujoCaja>();
					tipogrupoflujocajas.add(this.tipogrupoflujocaja);
					if(!esRelacionado) {
						//lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setConGuardarRelaciones(false);
						//lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					lineaflujocajaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.cargarLineaFlujoCajaBeanSwingJInternalFrame(tipogrupoflujocajas,this.tipogrupoflujocaja,lineaflujocajaBeanSwingJInternalFrame,/*conInicializar,*/lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.getConGuardarRelaciones(),lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaSessionBean.getEsGuardarRelacionado());
					lineaflujocajaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						lineaflujocajaBeanSwingJInternalFrame.actualizarEstadoPanelsLineaFlujoCaja("no_relacionado");

						lineaflujocajaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(LineaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA + (LineaFlujoCajaConstantesFunciones.ITAMANIOFILATABLA/2));

						lineaflujocajaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGrupoFlujoCaja=(TitledBorder)this.jScrollPanelDatosTipoGrupoFlujoCaja.getBorder();
						TitledBorder titledBorderLineaFlujoCaja=(TitledBorder)lineaflujocajaBeanSwingJInternalFrame.jScrollPanelDatosLineaFlujoCaja.getBorder();

						titledBorderLineaFlujoCaja.setTitle(titledBorderTipoGrupoFlujoCaja.getTitle() + " -> Linea Flujo Caja");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,lineaflujocajaBeanSwingJInternalFrame);
						}

						lineaflujocajaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(lineaflujocajaBeanSwingJInternalFrame);

						lineaflujocajaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Linea Flujo Caja",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonCentroActividadActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGrupoFlujoCaja tipogrupoflujocaja) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoflujocaja = (TipoGrupoFlujoCaja)this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogrupoflujocaja = (TipoGrupoFlujoCaja)this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogrupoflujocaja!=null) {
						this.tipogrupoflujocaja = tipogrupoflujocaja;
					} else {
						this.tipogrupoflujocaja = new TipoGrupoFlujoCaja();
					}
				}

				if(this.isTienePermisosCentroActividad && this.permiteMantenimiento(this.tipogrupoflujocaja)) {
					CentroActividadBeanSwingJInternalFrame centroactividadBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFramePopup=new CentroActividadBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						centroactividadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFramePopup;
					} else {
						centroactividadBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame;
					}

					List<TipoGrupoFlujoCaja> tipogrupoflujocajas=new ArrayList<TipoGrupoFlujoCaja>();
					tipogrupoflujocajas.add(this.tipogrupoflujocaja);
					if(!esRelacionado) {
						//centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.setConGuardarRelaciones(false);
						//centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					centroactividadBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.cargarCentroActividadBeanSwingJInternalFrame(tipogrupoflujocajas,this.tipogrupoflujocaja,centroactividadBeanSwingJInternalFrame,/*conInicializar,*/centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.getConGuardarRelaciones(),centroactividadBeanSwingJInternalFrame.centroactividadSessionBean.getEsGuardarRelacionado());
					centroactividadBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						centroactividadBeanSwingJInternalFrame.actualizarEstadoPanelsCentroActividad("no_relacionado");

						centroactividadBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(CentroActividadConstantesFunciones.ITAMANIOFILATABLA + (CentroActividadConstantesFunciones.ITAMANIOFILATABLA/2));

						centroactividadBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGrupoFlujoCaja=(TitledBorder)this.jScrollPanelDatosTipoGrupoFlujoCaja.getBorder();
						TitledBorder titledBorderCentroActividad=(TitledBorder)centroactividadBeanSwingJInternalFrame.jScrollPanelDatosCentroActividad.getBorder();

						titledBorderCentroActividad.setTitle(titledBorderTipoGrupoFlujoCaja.getTitle() + " -> Centro Actividad");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,centroactividadBeanSwingJInternalFrame);
						}

						centroactividadBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(centroactividadBeanSwingJInternalFrame);

						centroactividadBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Centro Actividad",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja && this.isPermisoNuevoTipoGrupoFlujoCaja));			
			this.jButtonDuplicarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja && this.isPermisoDuplicarTipoGrupoFlujoCaja));			
			this.jButtonCopiarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoFlujoCaja && this.isPermisoCopiarTipoGrupoFlujoCaja));
			this.jButtonVerFormTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoFlujoCaja && this.isPermisoVerFormTipoGrupoFlujoCaja));
			
			this.jButtonAbrirOrderByTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFlujoCaja && this.isPermisoOrdenTipoGrupoFlujoCaja));			
			
			this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja && this.isPermisoNuevoTipoGrupoFlujoCaja));			
			this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja && this.isPermisoNuevoTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonModificarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja && this.isPermisoActualizarTipoGrupoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja && this.isPermisoActualizarTipoGrupoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja && this.isPermisoEliminarTipoGrupoFlujoCaja));
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarTipoGrupoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja);							
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja && this.isPermisoNuevoTipoGrupoFlujoCaja));						
			this.jButtonDuplicarToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja && this.isPermisoDuplicarTipoGrupoFlujoCaja));						
			this.jButtonCopiarToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoFlujoCaja && this.isPermisoCopiarTipoGrupoFlujoCaja));			
			this.jButtonVerFormToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoFlujoCaja && this.isPermisoVerFormTipoGrupoFlujoCaja));			
			this.jButtonAbrirOrderByToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFlujoCaja && this.isPermisoOrdenTipoGrupoFlujoCaja));
			this.jButtonNuevoRelacionesToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja && this.isPermisoNuevoTipoGrupoFlujoCaja));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja && this.isPermisoNuevoTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));			
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonModificarToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja && this.isPermisoActualizarTipoGrupoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja  && this.isPermisoActualizarTipoGrupoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja && this.isPermisoEliminarTipoGrupoFlujoCaja));
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarToolBarTipoGrupoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja);				
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja && this.isPermisoNuevoTipoGrupoFlujoCaja));			
			this.jMenuItemDuplicarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja && this.isPermisoDuplicarTipoGrupoFlujoCaja));			
			this.jMenuItemCopiarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoFlujoCaja && this.isPermisoCopiarTipoGrupoFlujoCaja));			
			this.jMenuItemVerFormTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoFlujoCaja && this.isPermisoVerFormTipoGrupoFlujoCaja));			
			this.jMenuItemAbrirOrderByTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFlujoCaja && this.isPermisoOrdenTipoGrupoFlujoCaja));			
			//this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFlujoCaja && this.isPermisoOrdenTipoGrupoFlujoCaja));
			this.jMenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFlujoCaja && this.isPermisoOrdenTipoGrupoFlujoCaja));			
			//this.jMenuItemDetalleMostrarOcultarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFlujoCaja && this.isPermisoOrdenTipoGrupoFlujoCaja));			
			this.jMenuItemNuevoRelacionesTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja && this.isPermisoNuevoTipoGrupoFlujoCaja));			
			this.jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja && this.isPermisoNuevoTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));									
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemModificarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja && this.isPermisoActualizarTipoGrupoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemActualizarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja && this.isPermisoActualizarTipoGrupoFlujoCaja));	
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemEliminarTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja && this.isPermisoEliminarTipoGrupoFlujoCaja));
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemCancelarTipoGrupoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja);				
			}
			
			this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));						
			this.jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=this.jButtonNuevoTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja=this.jButtonDuplicarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCopiarTipoGrupoFlujoCaja=this.jButtonCopiarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaVerFormTipoGrupoFlujoCaja=this.jButtonVerFormTipoGrupoFlujoCaja.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGrupoFlujoCaja=this.jButtonAbrirOrderByTipoGrupoFlujoCaja.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=this.jButtonModificarTipoGrupoFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosTipoGrupoFlujoCaja.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=this.jButtonNuevoToolBarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=this.jButtonNuevoRelacionesToolBarTipoGrupoFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonModificarToolBarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarToolBarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarToolBarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarToolBarTipoGrupoFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=this.jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=this.jButtonGuardarCambiosTablaToolBarTipoGrupoFlujoCaja.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=this.jMenuItemNuevoTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=this.jMenuItemNuevoRelacionesTipoGrupoFlujoCaja.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemModificarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemActualizarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemEliminarTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemCancelarTipoGrupoFlujoCaja.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=this.jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGrupoFlujoCaja(Boolean esInicializar) {
		if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGrupoFlujoCaja();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGrupoFlujoCaja(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGrupoFlujoCaja() {
		this.jButtonNuevoTipoGrupoFlujoCaja.setVisible(this.isPermisoNuevoTipoGrupoFlujoCaja);			
		this.jButtonDuplicarTipoGrupoFlujoCaja.setVisible(this.isPermisoDuplicarTipoGrupoFlujoCaja);			
		this.jButtonCopiarTipoGrupoFlujoCaja.setVisible(this.isPermisoCopiarTipoGrupoFlujoCaja);			
		this.jButtonVerFormTipoGrupoFlujoCaja.setVisible(this.isPermisoVerFormTipoGrupoFlujoCaja);			
		
		this.jButtonAbrirOrderByTipoGrupoFlujoCaja.setVisible(this.isPermisoOrdenTipoGrupoFlujoCaja);					
		
		this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.setVisible(this.isPermisoNuevoTipoGrupoFlujoCaja);			
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonModificarTipoGrupoFlujoCaja.setVisible(this.isPermisoActualizarTipoGrupoFlujoCaja);	
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarTipoGrupoFlujoCaja.setVisible(this.isPermisoActualizarTipoGrupoFlujoCaja);	
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarTipoGrupoFlujoCaja.setVisible(this.isPermisoEliminarTipoGrupoFlujoCaja);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarTipoGrupoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja);						
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosTipoGrupoFlujoCaja.setVisible(this.isPermisoGuardarCambiosTipoGrupoFlujoCaja);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.setVisible(this.isPermisoActualizarTipoGrupoFlujoCaja);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGrupoFlujoCaja() {
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonModificarTipoGrupoFlujoCaja.setVisible(this.isPermisoActualizarTipoGrupoFlujoCaja);	
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarTipoGrupoFlujoCaja.setVisible(this.isPermisoActualizarTipoGrupoFlujoCaja);	
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarTipoGrupoFlujoCaja.setVisible(this.isPermisoEliminarTipoGrupoFlujoCaja);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarTipoGrupoFlujoCaja.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja);							
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosTipoGrupoFlujoCaja.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja && this.isPermisoGuardarCambiosTipoGrupoFlujoCaja));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGrupoFlujoCaja() {
		if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGrupoFlujoCaja();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGrupoFlujoCaja() {
	}
	
	public void jTableDatosTipoGrupoFlujoCajaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGrupoFlujoCaja(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGrupoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.gettipogrupoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogrupoflujocaja==null) {
						this.tipogrupoflujocaja = new TipoGrupoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
				}

				if(this.tipogrupoflujocaja.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogrupoflujocaja.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoGrupoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.gettipogrupoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogrupoflujocaja==null) {
						this.tipogrupoflujocaja = new TipoGrupoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
				}

				if(this.tipogrupoflujocaja.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipogrupoflujocaja.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGrupoFlujoCajaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.gettipogrupoflujocaja(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogrupoflujocaja==null) {
						this.tipogrupoflujocaja = new TipoGrupoFlujoCaja();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);
				}

				if(this.tipogrupoflujocaja.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogrupoflujocaja.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);

			this.getTipoGrupoFlujoCajasBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);

			//if(TipoGrupoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoGrupoFlujoCajaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);

			this.getTipoGrupoFlujoCajasBusquedaPorNombre();

			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);

			//if(TipoGrupoFlujoCajaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoflujocajaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoGrupoFlujoCaja() {
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
		

		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja!=null) {
			this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.dispose();
			this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja=null;
		}
		
		if(this.jInternalFrameImportacionTipoGrupoFlujoCaja!=null) {
			this.jInternalFrameImportacionTipoGrupoFlujoCaja.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGrupoFlujoCaja.dispose();
			this.jInternalFrameImportacionTipoGrupoFlujoCaja=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGrupoFlujoCaja();
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGrupoFlujoCaja")) {
				jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGrupoFlujoCaja")) {
				jButtonDuplicarTipoGrupoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGrupoFlujoCaja")) {
				jButtonCopiarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGrupoFlujoCaja")) {
				jButtonVerFormTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGrupoFlujoCaja")) {
				jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGrupoFlujoCaja")) {
				jButtonDuplicarTipoGrupoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGrupoFlujoCaja")) {
				jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGrupoFlujoCaja")) {
				jButtonDuplicarTipoGrupoFlujoCajaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGrupoFlujoCaja")) {
				jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGrupoFlujoCaja")) {
				jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGrupoFlujoCaja")) {
				jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGrupoFlujoCaja")) {
				jButtonModificarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGrupoFlujoCaja")) {
				jButtonModificarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGrupoFlujoCaja")) {
				jButtonModificarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGrupoFlujoCaja")) {
				jButtonActualizarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGrupoFlujoCaja")) {
				jButtonActualizarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGrupoFlujoCaja")) {
				jButtonActualizarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGrupoFlujoCaja")) {
				jButtonEliminarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGrupoFlujoCaja")) {
				jButtonEliminarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGrupoFlujoCaja")) {
				jButtonEliminarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGrupoFlujoCaja")) {
				jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGrupoFlujoCaja")) {
				jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGrupoFlujoCaja")) {
				jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGrupoFlujoCaja")) {
				jButtonCerrarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGrupoFlujoCaja")) {
				jButtonCerrarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGrupoFlujoCaja")) {
				jButtonCerrarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGrupoFlujoCaja")) {
				jButtonMostrarOcultarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGrupoFlujoCaja")) {
				jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGrupoFlujoCaja")) {
				jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGrupoFlujoCaja")) {
				jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGrupoFlujoCaja")) {
				jButtonCopiarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGrupoFlujoCaja")) {
				jButtonVerFormTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGrupoFlujoCaja")) {
				jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGrupoFlujoCaja")) {
				jButtonCopiarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGrupoFlujoCaja")) {
				jButtonVerFormTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGrupoFlujoCaja")) {
				jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGrupoFlujoCaja")) {
				jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGrupoFlujoCaja")) {
				jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGrupoFlujoCaja")) {
				jButtonRecargarInformacionTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGrupoFlujoCaja")) {
				jButtonRecargarInformacionTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGrupoFlujoCaja")) {
				jButtonRecargarInformacionTipoGrupoFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGrupoFlujoCaja")) {
				jButtonAnterioresTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGrupoFlujoCaja")) {
				jButtonAnterioresTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGrupoFlujoCaja")) {
				jButtonAnterioresTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGrupoFlujoCaja")) {
				jButtonSiguientesTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGrupoFlujoCaja")) {
				jButtonSiguientesTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGrupoFlujoCaja")) {
				jButtonSiguientesTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGrupoFlujoCaja") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja")) {
				jButtonAbrirOrderByTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGrupoFlujoCaja") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGrupoFlujoCaja")) {
				jButtonMostrarOcultarTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGrupoFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGrupoFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGrupoFlujoCaja")) {
				jButtonCerrarReporteDinamicoTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGrupoFlujoCaja")) {
				jButtonGenerarReporteDinamicoTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGrupoFlujoCaja")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGrupoFlujoCaja")) {
				jButtonCerrarImportacionTipoGrupoFlujoCajaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGrupoFlujoCaja")) {
				
				jButtonGenerarImportacionTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGrupoFlujoCaja")) {
				
				jButtonAbrirImportacionTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGrupoFlujoCaja")) {
				jComboBoxTiposAccionesTipoGrupoFlujoCajaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGrupoFlujoCaja")) {
				jComboBoxTiposRelacionesTipoGrupoFlujoCajaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGrupoFlujoCaja")) {
				jComboBoxTiposAccionesTipoGrupoFlujoCajaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGrupoFlujoCaja")) {
				
				jComboBoxTiposSeleccionarTipoGrupoFlujoCajaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGrupoFlujoCaja")) {
				jTextFieldValorCampoGeneralTipoGrupoFlujoCajaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGrupoFlujoCaja")) {
				jButtonAbrirOrderByTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGrupoFlujoCaja")) {
				jButtonAbrirOrderByTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGrupoFlujoCaja")) {
				jButtonCerrarOrderByTipoGrupoFlujoCajaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGrupoFlujoCajaBusqueda")) {
				this.jButtonidTipoGrupoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGrupoFlujoCajaBusqueda")) {
				this.jButtoncodigoTipoGrupoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGrupoFlujoCajaBusqueda")) {
				this.jButtonnombreTipoGrupoFlujoCajaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoGrupoFlujoCaja")) {
				this.jButtonBusquedaPorCodigoTipoGrupoFlujoCajaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoGrupoFlujoCaja")) {
				this.jButtonBusquedaPorNombreTipoGrupoFlujoCajaActionPerformed(evt);
			}
			
			;
			
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGrupoFlujoCaja();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				


				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGrupoFlujoCaja tipogrupoflujocajaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogrupoflujocajaLocal=this.tipogrupoflujocaja;
			} else {
				tipogrupoflujocajaLocal=this.tipogrupoflujocajaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
							
				
				


				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
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
			
			


			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
								
						
				


				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
								
				
				


				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
							
				
				


				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
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
			
			


			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
								
				
				


				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGrupoFlujoCaja")) {
					jCheckBoxSeleccionarTodosTipoGrupoFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGrupoFlujoCaja")) {
					jCheckBoxSeleccionadosTipoGrupoFlujoCajaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGrupoFlujoCaja")) {
					
				}
				
				


				
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
												
				
				


				
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
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
			
			


			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoflujocaja);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoflujocaja);
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
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
				
				


				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFlujoCaja.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFlujoCaja.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFlujoCajaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoflujocajaAnterior =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGrupoFlujoCaja")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGrupoFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGrupoFlujoCaja.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogrupoflujocaja =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogrupoflujocaja);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGrupoFlujoCaja")) {
				
				}
				
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGrupoFlujoCaja")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGrupoFlujoCaja.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGrupoFlujoCaja")) {
			
			}
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGrupoFlujoCaja();
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGrupoFlujoCaja")) {
				jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGrupoFlujoCaja")) {
				jButtonDuplicarTipoGrupoFlujoCajaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGrupoFlujoCaja")) {
				jButtonCopiarTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGrupoFlujoCaja")) {
				jButtonVerFormTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGrupoFlujoCaja")) {
				jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGrupoFlujoCaja")) {
				jButtonModificarTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGrupoFlujoCaja")) {
				jButtonActualizarTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGrupoFlujoCaja")) {
				jButtonEliminarTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGrupoFlujoCaja")) {
				jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGrupoFlujoCaja")) {
				jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGrupoFlujoCaja")) {
				jButtonCerrarTipoGrupoFlujoCajaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGrupoFlujoCaja")) {
				jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGrupoFlujoCaja")) {
				jButtonNuevoGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGrupoFlujoCaja")) {
				jButtonAbrirOrderByTipoGrupoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGrupoFlujoCaja")) {
				jButtonRecargarInformacionTipoGrupoFlujoCajaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGrupoFlujoCaja")) {
				jButtonAnterioresTipoGrupoFlujoCajaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGrupoFlujoCaja")) {
				jButtonSiguientesTipoGrupoFlujoCajaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGrupoFlujoCajaBusqueda")) {
				this.jButtonidTipoGrupoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoGrupoFlujoCajaBusqueda")) {
				this.jButtoncodigoTipoGrupoFlujoCajaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGrupoFlujoCajaBusqueda")) {
				this.jButtonnombreTipoGrupoFlujoCajaBusquedaActionPerformed(evt);
			}
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGrupoFlujoCaja();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGrupoFlujoCaja")) {
				closingInternalFrameTipoGrupoFlujoCaja();
				
			} else if(sTipo.equals("jButtonCancelarTipoGrupoFlujoCaja")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGrupoFlujoCaja = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGrupoFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(TipoGrupoFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGrupoFlujoCaja.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGrupoFlujoCajaActionPerformed(null);
			}
			
			TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogrupoflujocaja,new Object(),this.tipogrupoflujocajaParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGrupoFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGrupoFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGrupoFlujoCaja(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogrupoflujocaja)) {
			if(!esControlTabla) {
				if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);			
				}
				
				if(this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogrupoflujocajaReturnGeneral=tipogrupoflujocajaLogic.procesarEventosTipoGrupoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas(),this.tipogrupoflujocaja,this.tipogrupoflujocajaParameterGeneral,this.isEsNuevoTipoGrupoFlujoCaja,classes);//this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGrupoFlujoCaja(this.tipogrupoflujocajaReturnGeneral,this.tipogrupoflujocajaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGrupoFlujoCaja(classes,this.tipogrupoflujocajaReturnGeneral,this.tipogrupoflujocajaBean,false);
					}
						
					if(this.tipogrupoflujocajaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFlujoCaja(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGrupoFlujoCaja(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja());	
					}
						
					if(this.tipogrupoflujocajaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoFlujoCaja(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja(),classes);//this.tipogrupoflujocajaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoFlujoCaja(this.tipogrupoflujocaja,classes);//this.tipogrupoflujocajaBean);									
				}
			
				if(TipoGrupoFlujoCajaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGrupoFlujoCaja(this.tipogrupoflujocaja,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFlujoCaja(this.tipogrupoflujocaja);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogrupoflujocajaAnterior!=null) {
						this.tipogrupoflujocaja=this.tipogrupoflujocajaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogrupoflujocajaReturnGeneral=tipogrupoflujocajaLogic.procesarEventosTipoGrupoFlujoCajasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas(),this.tipogrupoflujocaja,this.tipogrupoflujocajaParameterGeneral,this.isEsNuevoTipoGrupoFlujoCaja,classes);//this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCaja()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogrupoflujocajaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja(),tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja(),this.tipogrupoflujocajas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGrupoFlujoCaja.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGrupoFlujoCaja.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGrupoFlujoCaja();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGrupoFlujoCaja() throws Exception {
		
		TipoGrupoFlujoCajaModel tipogrupoflujocajaModel=(TipoGrupoFlujoCajaModel)this.jTableDatosTipoGrupoFlujoCaja.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogrupoflujocajaModel.tipogrupoflujocajas=this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogrupoflujocajaModel.tipogrupoflujocajas=this.tipogrupoflujocajas;
		}
		
		
		((TipoGrupoFlujoCajaModel) this.jTableDatosTipoGrupoFlujoCaja.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGrupoFlujoCaja() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogrupoflujocajaAnterior(),this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogrupoflujocajaAnterior(),this.tipogrupoflujocajas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGrupoFlujoCaja();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(LineaFlujoCaja.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.setLineaFlujoCajas(tipogrupoflujocaja.getLineaFlujoCajas());
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLineaFlujoCaja(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CentroActividad.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividadLogic.setCentroActividads(tipogrupoflujocaja.getCentroActividads());
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroActividad(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
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
										
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoflujocaja,new Object(),generalEntityParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGrupoFlujoCajaConstantesFunciones.getClassesRelationshipsOfTipoGrupoFlujoCaja(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGrupoFlujoCajaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGrupoFlujoCaja(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGrupoFlujoCaja(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGrupoFlujoCajaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoflujocaja,new Object(),generalEntityParameterGeneral,this.tipogrupoflujocajaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGrupoFlujoCaja(TipoGrupoFlujoCajaBean tipogrupoflujocajaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(LineaFlujoCaja.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.setLineaFlujoCajas(tipogrupoflujocaja.getLineaFlujoCajas());
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.inicializarActualizarBindingTablaLineaFlujoCaja(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CentroActividad.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividadLogic.setCentroActividads(tipogrupoflujocaja.getCentroActividads());
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.inicializarActualizarBindingTablaCentroActividad(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGrupoFlujoCaja(ArrayList<Classe> classes,TipoGrupoFlujoCajaReturnGeneral tipogrupoflujocajaReturnGeneral,TipoGrupoFlujoCajaBean tipogrupoflujocajaBean,Boolean conDefault) throws Exception {
		
			this.tipogrupoflujocajaBean.setLineaFlujoCajas(tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja().getLineaFlujoCajas());
			this.tipogrupoflujocajaBean.setCentroActividads(tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja().getCentroActividads());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(LineaFlujoCaja.class)) {
					tipogrupoflujocaja.setLineaFlujoCajas(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaBeanSwingJInternalFrame.lineaflujocajaLogic.getLineaFlujoCajas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(CentroActividad.class)) {
					tipogrupoflujocaja.setCentroActividads(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadBeanSwingJInternalFrame.centroactividadLogic.getCentroActividads());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipogrupoflujocaja)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja = new TipoGrupoFlujoCajaDetalleFormJInternalFrame(jDesktopPane,this.tipogrupoflujocajaSessionBean.getConGuardarRelaciones(),this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setVisible(false);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.tipogrupoflujocajaLogic=this.tipogrupoflujocajaLogic;
		
		this.cargarCombosFrameForeignKeyTipoGrupoFlujoCaja("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGrupoFlujoCaja();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGrupoFlujoCaja();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGrupoFlujoCaja("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGrupoFlujoCaja();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGrupoFlujoCaja"));
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonModificarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarTipoGrupoFlujoCaja"));

		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonModificarToolBarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGrupoFlujoCaja"));
					
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemModificarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGrupoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarTipoGrupoFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarToolBarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGrupoFlujoCaja"));
						
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemActualizarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGrupoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarTipoGrupoFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGrupoFlujoCaja"));
								
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemEliminarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGrupoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarTipoGrupoFlujoCaja"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGrupoFlujoCaja"));
					
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemCancelarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGrupoFlujoCaja"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemDetalleCerrarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGrupoFlujoCaja"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoFlujoCaja"));
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGrupoFlujoCaja"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonidTipoGrupoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtoncodigoTipoGrupoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGrupoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonnombreTipoGrupoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoFlujoCajaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGrupoFlujoCaja"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGrupoFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGrupoFlujoCaja"));
		}
		
		this.jTableDatosTipoGrupoFlujoCaja.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGrupoFlujoCaja"));
		
		this.jTableDatosTipoGrupoFlujoCaja.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGrupoFlujoCaja"));
		
		this.jButtonNuevoTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoTipoGrupoFlujoCaja"));
		
		this.jButtonDuplicarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarTipoGrupoFlujoCaja"));
		
		this.jButtonCopiarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"CopiarTipoGrupoFlujoCaja"));
		
		this.jButtonVerFormTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"VerFormTipoGrupoFlujoCaja"));
		
		
		this.jButtonNuevoToolBarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGrupoFlujoCaja"));
			
		this.jButtonDuplicarToolBarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGrupoFlujoCaja"));
			
		this.jMenuItemNuevoTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGrupoFlujoCaja"));
			
		this.jMenuItemDuplicarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGrupoFlujoCaja"));		
		
		
		this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGrupoFlujoCaja"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGrupoFlujoCaja"));
			
		this.jMenuItemNuevoRelacionesTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGrupoFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonModificarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarTipoGrupoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonModificarToolBarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGrupoFlujoCaja"));
			
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemModificarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGrupoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"ActualizarTipoGrupoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonActualizarToolBarTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGrupoFlujoCaja"));
				
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemActualizarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGrupoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarTipoGrupoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonEliminarToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGrupoFlujoCaja"));
						
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemEliminarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGrupoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarTipoGrupoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonCancelarToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGrupoFlujoCaja"));
			
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemCancelarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGrupoFlujoCaja"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGrupoFlujoCaja"));		
		
		
		this.jButtonCerrarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarTipoGrupoFlujoCaja"));
		
		
		this.jButtonCerrarToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGrupoFlujoCaja"));
			
		this.jMenuItemCerrarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGrupoFlujoCaja"));
			
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jMenuItemDetalleCerrarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGrupoFlujoCaja"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGrupoFlujoCaja"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoFlujoCaja"));
		}
		
		this.jButtonCopiarToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGrupoFlujoCaja"));
			
		this.jButtonVerFormToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGrupoFlujoCaja"));
		
		this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGrupoFlujoCaja"));
			
		this.jMenuItemCopiarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGrupoFlujoCaja"));		
		
		this.jMenuItemVerFormTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGrupoFlujoCaja"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGrupoFlujoCaja"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGrupoFlujoCaja"));
			
		this.jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGrupoFlujoCaja"));		
		
		
		
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGrupoFlujoCaja"));
					
		this.jButtonRecargarInformacionToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGrupoFlujoCaja"));
		
		this.jMenuItemRecargarInformacionTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGrupoFlujoCaja"));		
		
		
		
		this.jButtonAnterioresTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresTipoGrupoFlujoCaja"));
		
		
		this.jButtonAnterioresToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGrupoFlujoCaja"));
		
		this.jMenuItemAnterioresTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGrupoFlujoCaja"));		
		
		
		this.jButtonSiguientesTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesTipoGrupoFlujoCaja"));
		
		
		this.jButtonSiguientesToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGrupoFlujoCaja"));
			
		this.jMenuItemSiguientesTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGrupoFlujoCaja"));
			
		this.jMenuItemAbrirOrderByTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGrupoFlujoCaja"));
			
		this.jMenuItemMostrarOcultarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGrupoFlujoCaja"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGrupoFlujoCaja"));
			
		this.jMenuItemDetalleMostarOcultarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGrupoFlujoCaja"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGrupoFlujoCaja"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGrupoFlujoCaja"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGrupoFlujoCaja"));

		this.jCheckBoxSeleccionadosTipoGrupoFlujoCaja.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGrupoFlujoCaja"));
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGrupoFlujoCaja"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGrupoFlujoCaja"));
			
		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGrupoFlujoCaja"));
					
		this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGrupoFlujoCaja"));
			
		this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGrupoFlujoCaja"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonidTipoGrupoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtoncodigoTipoGrupoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGrupoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonnombreTipoGrupoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoFlujoCajaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoGrupoFlujoCaja"));

			this.jButtonBusquedaPorNombreTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGrupoFlujoCaja"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoFlujoCaja"));
				this.jInternalFrameReporteDinamicoTipoGrupoFlujoCaja.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoFlujoCaja"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoFlujoCaja"));				
			//this.jButtonGenerarReporteDinamicoTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoFlujoCaja"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoFlujoCaja"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGrupoFlujoCaja!=null) {
				this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGrupoFlujoCaja"));
				this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGrupoFlujoCaja"));
				this.jInternalFrameImportacionTipoGrupoFlujoCaja.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGrupoFlujoCaja"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGrupoFlujoCaja"));
			
			this.jButtonAbrirOrderByToolBarTipoGrupoFlujoCaja.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGrupoFlujoCaja"));			
			
			if(this.jInternalFrameOrderByTipoGrupoFlujoCaja!=null) {
				this.jInternalFrameOrderByTipoGrupoFlujoCaja.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGrupoFlujoCaja"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTabbedPaneRelacionesTipoGrupoFlujoCaja.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGrupoFlujoCaja"));
		
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
            		closingInternalFrameTipoGrupoFlujoCaja();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGrupoFlujoCaja = (JInternalFrameBase)event.getSource();
	            	
	            TipoGrupoFlujoCajaBeanSwingJInternalFrame jInternalFrameParent=(TipoGrupoFlujoCajaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGrupoFlujoCaja.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGrupoFlujoCajaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGrupoFlujoCaja.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGrupoFlujoCajaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGrupoFlujoCaja.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGrupoFlujoCaja.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGrupoFlujoCaja";
		inputMap = this.jButtonNuevoTipoGrupoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGrupoFlujoCaja";
		inputMap = this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGrupoFlujoCajaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGrupoFlujoCaja";
		inputMap = this.jButtonModificarTipoGrupoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGrupoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGrupoFlujoCaja";
		inputMap = this.jButtonActualizarTipoGrupoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGrupoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGrupoFlujoCaja";
		inputMap = this.jButtonEliminarTipoGrupoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGrupoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGrupoFlujoCaja";
		inputMap = this.jButtonCancelarTipoGrupoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGrupoFlujoCaja";
		inputMap = this.jButtonCerrarTipoGrupoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGrupoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGrupoFlujoCaja";
		inputMap = this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosTipoGrupoFlujoCaja.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonGuardarCambiosTipoGrupoFlujoCaja.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGrupoFlujoCaja.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGrupoFlujoCajaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGrupoFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGrupoFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGrupoFlujoCajaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonidTipoGrupoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtoncodigoTipoGrupoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoGrupoFlujoCajaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jButtonnombreTipoGrupoFlujoCajaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoFlujoCajaBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoGrupoFlujoCaja"));

		this.jButtonBusquedaPorNombreTipoGrupoFlujoCaja.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGrupoFlujoCaja"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGrupoFlujoCaja.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGrupoFlujoCajaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGrupoFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGrupoFlujoCaja.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGrupoFlujoCaja(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
					tipogrupoflujocajaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajas) {
					tipogrupoflujocajaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGrupoFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
						tipogrupoflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajas) {
						tipogrupoflujocajaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGrupoFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGrupoFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGrupoFlujoCajaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGrupoFlujoCaja.getSelectedRows();
			
			TipoGrupoFlujoCaja tipogrupoflujocajaLocal=new TipoGrupoFlujoCaja();
			
			//this.seleccionarTodosTipoGrupoFlujoCaja(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoflujocajaLocal =(TipoGrupoFlujoCaja) this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas().toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogrupoflujocajaLocal =(TipoGrupoFlujoCaja) this.tipogrupoflujocajas.toArray()[this.jTableDatosTipoGrupoFlujoCaja.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogrupoflujocajaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
						tipogrupoflujocajaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajas) {
						tipogrupoflujocajaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGrupoFlujoCaja.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGrupoFlujoCaja.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFlujoCaja,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGrupoFlujoCajaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGrupoFlujoCajaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGrupoFlujoCajaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGrupoFlujoCaja.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
				
						if(sTipoSeleccionar.equals(TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogrupoflujocajaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogrupoflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajas) {
					
						if(sTipoSeleccionar.equals(TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipogrupoflujocajaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogrupoflujocajaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGrupoFlujoCajaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGrupoFlujoCaja=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGrupoFlujoCaja) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGrupoFlujoCaja(conSplash);
				
					this.generarReporteTipoGrupoFlujoCajasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGrupoFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGrupoFlujoCajasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGrupoFlujoCajasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGrupoFlujoCaja();
				
				this.exportarTipoGrupoFlujoCajasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGrupoFlujoCajas();
				//this.importarTipoGrupoFlujoCajas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGrupoFlujoCaja();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGrupoFlujoCajasSeleccionados();
				//this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Grupo Flujo Caja", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGrupoFlujoCaja();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGrupoFlujoCaja)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGrupoFlujoCaja(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoFlujoCaja.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jComboBoxTiposAccionesFormularioTipoGrupoFlujoCaja.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGrupoFlujoCaja();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGrupoFlujoCaja(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGrupoFlujoCajaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGrupoFlujoCaja();
			
			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();		
			TipoGrupoFlujoCaja tipogrupoflujocaja=new TipoGrupoFlujoCaja();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGrupoFlujoCaja.getSelectedItem();
			
			
			
			
			tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogrupoflujocajasSeleccionados.size()==1) {
				for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasSeleccionados) {
					tipogrupoflujocaja=tipogrupoflujocajaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Linea Flujo Caja")) {
					jButtonLineaFlujoCajaActionPerformed(null,rowIndex,true,false,tipogrupoflujocaja);
				}
				else if(this.sTipoRelacion.equals("Centro Actividad")) {
					jButtonCentroActividadActionPerformed(null,rowIndex,true,false,tipogrupoflujocaja);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGrupoFlujoCaja();
			
      		//this.finishProcessTipoGrupoFlujoCaja(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGrupoFlujoCajaReturnGeneral() throws Exception {
		if(this.tipogrupoflujocajaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogrupoflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogrupoflujocajaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogrupoflujocajaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogrupoflujocajaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogrupoflujocajaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
		}
		
		if(this.tipogrupoflujocajaReturnGeneral.getConRetornoLista() || this.tipogrupoflujocajaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogrupoflujocajaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogrupoflujocajaLogic.setTipoGrupoFlujoCajas(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCajas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogrupoflujocajaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogrupoflujocajaLogic.setTipoGrupoFlujoCaja(this.tipogrupoflujocajaReturnGeneral.getTipoGrupoFlujoCaja());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGrupoFlujoCaja(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGrupoFlujoCaja() throws Exception {
		
		
	}
	
	public ArrayList<TipoGrupoFlujoCaja> getTipoGrupoFlujoCajasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGrupoFlujoCaja) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas()) {
					if(tipogrupoflujocajaAux.getIsSelected()) {
						tipogrupoflujocajasSeleccionados.add(tipogrupoflujocajaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:this.tipogrupoflujocajas) {
					if(tipogrupoflujocajaAux.getIsSelected()) {
						tipogrupoflujocajasSeleccionados.add(tipogrupoflujocajaAux);				
					}
				}
			}
			
			if(tipogrupoflujocajasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogrupoflujocajasSeleccionados.addAll(this.tipogrupoflujocajaLogic.getTipoGrupoFlujoCajas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogrupoflujocajasSeleccionados.addAll(this.tipogrupoflujocajas);				
					}
				}
			}
		} else {
			tipogrupoflujocajasSeleccionados.add(this.tipogrupoflujocaja);
		}
		
		return tipogrupoflujocajasSeleccionados;
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
	
	public void generarReporteTipoGrupoFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGrupoFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGrupoFlujoCajasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGrupoFlujoCajasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGrupoFlujoCajasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoGrupoFlujoCajasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Grupo Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGrupoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();		
		
		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGrupoFlujoCajas("Todos",tipogrupoflujocajasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGrupoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();		
		
		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGrupoFlujoCajas("Todos",tipogrupoflujocajasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGrupoFlujoCajasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();
		
		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGrupoFlujoCajas("Todos",tipogrupoflujocajasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGrupoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGrupoFlujoCaja();
		
		
		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGrupoFlujoCaja();
		
		
		//this.generarReporteTipoGrupoFlujoCajas("Todos",tipogrupoflujocajasSeleccionados ,tipogrupoflujocajaImplementable,tipogrupoflujocajaImplementableHome);
	}
	
	public void mostrarImportacionTipoGrupoFlujoCajas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGrupoFlujoCaja();
		
		this.abrirFrameImportacionTipoGrupoFlujoCaja();		
		
			
		//this.generarReporteTipoGrupoFlujoCajas("Todos",tipogrupoflujocajasSeleccionados ,tipogrupoflujocajaImplementable,tipogrupoflujocajaImplementableHome);
	}
	
	public void importarTipoGrupoFlujoCajas() throws Exception {		
	
	}
	
	public void exportarTipoGrupoFlujoCajasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGrupoFlujoCajasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGrupoFlujoCajasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGrupoFlujoCajasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Grupo Flujo Caja",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGrupoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();		
		
		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoflujocaja."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGrupoFlujoCaja(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGrupoFlujoCaja(tipogrupoflujocajaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogrupoflujocajaAux.setsDetalleGeneralEntityReporte(tipogrupoflujocajaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGrupoFlujoCaja(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGrupoFlujoCajaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoFlujoCajaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogrupoflujocaja.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrupoflujocaja.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrupoflujocaja.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrupoflujocaja.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGrupoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();		
		
		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoflujocaja.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGrupoFlujoCajas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGrupoFlujoCaja(row);				
				iRow++;
			}				
			
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGrupoFlujoCaja(tipogrupoflujocajaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGrupoFlujoCajasSeleccionados() throws Exception {
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();		
		
		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoflujocaja.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogrupoflujocajas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogrupoflujocaja");
			//elementRoot.appendChild(element);
		
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasSeleccionados) {
				element = document.createElement("tipogrupoflujocaja");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGrupoFlujoCaja(tipogrupoflujocajaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Flujo Caja",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGrupoFlujoCaja(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogrupoflujocaja.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogrupoflujocaja.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogrupoflujocaja.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoGrupoFlujoCaja(TipoGrupoFlujoCaja tipogrupoflujocaja,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGrupoFlujoCajaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogrupoflujocaja.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGrupoFlujoCajaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogrupoflujocaja.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoGrupoFlujoCajaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipogrupoflujocaja.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoGrupoFlujoCajaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogrupoflujocaja.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoGrupoFlujoCajasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados=new ArrayList<TipoGrupoFlujoCaja>();
		
		tipogrupoflujocajasSeleccionados=this.getTipoGrupoFlujoCajasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGrupoFlujoCaja(tipogrupoflujocajasSeleccionados);
		
		this.generarReporteTipoGrupoFlujoCajas("Todos",tipogrupoflujocajasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGrupoFlujoCaja(ArrayList<TipoGrupoFlujoCaja> tipogrupoflujocajasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGrupoFlujoCaja tipogrupoflujocajaAux:tipogrupoflujocajasSeleccionados) {
				tipogrupoflujocajaAux.setsDetalleGeneralEntityReporte(tipogrupoflujocajaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGrupoFlujoCajaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipogrupoflujocajaAux.setsDescripcionGeneralEntityReporte1(tipogrupoflujocajaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoGrupoFlujoCajaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogrupoflujocajaAux.setsDescripcionGeneralEntityReporte1(tipogrupoflujocajaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFlujoCajaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGrupoFlujoCaja(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaModificarTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFlujoCaja=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFlujoCaja=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGrupoFlujoCajaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=true;
		} else {
			this.actualizarEstadoPanelsTipoGrupoFlujoCaja(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGrupoFlujoCaja=false;
			//this.isVisibilidadCeldaVerFormTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaDuplicarTipoGrupoFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!tipogrupoflujocajaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;												
			}
			
			this.jButtonCerrarTipoGrupoFlujoCaja.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFlujoCaja=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogrupoflujocaja)) {
			this.isVisibilidadCeldaActualizarTipoGrupoFlujoCaja=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFlujoCaja=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGrupoFlujoCaja() {
		this.isVisibilidadCeldaNuevoTipoGrupoFlujoCaja=false;
		this.isVisibilidadCeldaGuardarCambiosTipoGrupoFlujoCaja=false;
	}
	
	public void actualizarEstadoPanelsTipoGrupoFlujoCaja(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoGrupoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoFlujoCaja!=null) {
				this.jPanelPaginacionTipoGrupoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoGrupoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoFlujoCaja!=null) {
				this.jPanelPaginacionTipoGrupoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoGrupoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoFlujoCaja!=null) {
				this.jPanelPaginacionTipoGrupoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoGrupoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoFlujoCaja!=null) {
				this.jPanelPaginacionTipoGrupoFlujoCaja.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoGrupoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoFlujoCaja!=null) {
				this.jPanelPaginacionTipoGrupoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoGrupoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoFlujoCaja!=null) {
				this.jPanelPaginacionTipoGrupoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFlujoCaja.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFlujoCaja!=null) {
				this.jScrollPanelDatosTipoGrupoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoFlujoCaja!=null) {
				this.jPanelPaginacionTipoGrupoFlujoCaja.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja!=null) {
					this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogrupoflujocajaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFlujoCaja!=null) {
				this.jPanelParametrosReportesTipoGrupoFlujoCaja.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoGrupoFlujoCajaParaLineaFlujoCajas() throws Exception {
		Boolean isPaginaPopupLineaFlujoCaja=false;

		try {

			if(this.tipogrupoflujocajaSessionBean==null) {
				this.tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaSessionBean=new LineaFlujoCajaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaSessionBean.setsPathNavegacionActual(tipogrupoflujocajaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+LineaFlujoCajaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupLineaFlujoCaja=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeLineaFlujoCaja(true);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeLineaFlujoCaja(TipoGrupoFlujoCajaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja(true);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.lineaflujocajaSessionBean.setlidTipoGrupoFlujoCajaActual(this.idTipoGrupoFlujoCajaActual);

			tipogrupoflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGrupoFlujoCaja(true);
			tipogrupoflujocajaSessionBean.setlIdTipoGrupoFlujoCajaActualForeignKey(this.idTipoGrupoFlujoCajaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoGrupoFlujoCajaParaCentroActividades() throws Exception {
		Boolean isPaginaPopupCentroActividad=false;

		try {

			if(this.tipogrupoflujocajaSessionBean==null) {
				this.tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadSessionBean=new CentroActividadSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadSessionBean.setsPathNavegacionActual(tipogrupoflujocajaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+CentroActividadConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCentroActividad=this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCentroActividad(true);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCentroActividad(TipoGrupoFlujoCajaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFlujoCaja(true);
			this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.centroactividadSessionBean.setlidTipoGrupoFlujoCajaActual(this.idTipoGrupoFlujoCajaActual);

			tipogrupoflujocajaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGrupoFlujoCaja(true);
			tipogrupoflujocajaSessionBean.setlIdTipoGrupoFlujoCajaActualForeignKey(this.idTipoGrupoFlujoCajaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGrupoFlujoCajaSessionBean tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
		
		if(this.tipogrupoflujocajaSessionBean==null) {
			this.tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
		}
		
		this.tipogrupoflujocajaSessionBean.setsUltimaBusquedaTipoGrupoFlujoCaja(this.getsAccionBusqueda());
		this.tipogrupoflujocajaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogrupoflujocajaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipogrupoflujocajaSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipogrupoflujocajaSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGrupoFlujoCajaSessionBean tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
		
		if(this.tipogrupoflujocajaSessionBean==null) {
			this.tipogrupoflujocajaSessionBean=new TipoGrupoFlujoCajaSessionBean();
		}
		
		if(this.tipogrupoflujocajaSessionBean.getsUltimaBusquedaTipoGrupoFlujoCaja()!=null&&!this.tipogrupoflujocajaSessionBean.getsUltimaBusquedaTipoGrupoFlujoCaja().equals("")) {
			this.setsAccionBusqueda(tipogrupoflujocajaSessionBean.getsUltimaBusquedaTipoGrupoFlujoCaja());
			this.setiNumeroPaginacion(tipogrupoflujocajaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogrupoflujocajaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipogrupoflujocajaSessionBean.getcodigo());
				tipogrupoflujocajaSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipogrupoflujocajaSessionBean.getnombre());
				tipogrupoflujocajaSessionBean.setnombre("");
			}
		}
		
		this.tipogrupoflujocajaSessionBean.setsUltimaBusquedaTipoGrupoFlujoCaja("");
		this.tipogrupoflujocajaSessionBean.setiNumeroPaginacion(TipoGrupoFlujoCajaConstantesFunciones.INUMEROPAGINACION);
		this.tipogrupoflujocajaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGrupoFlujoCaja(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGrupoFlujoCaja() {
		this.updateBorderResaltarBusquedasFormularioTipoGrupoFlujoCaja();
		this.updateVisibilidadBusquedasFormularioTipoGrupoFlujoCaja();
		this.updateHabilitarBusquedasFormularioTipoGrupoFlujoCaja();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGrupoFlujoCaja() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponents().length>0) {
	

		if(this.tipogrupoflujocajaConstantesFunciones.resaltarBusquedaPorCodigoTipoGrupoFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGrupoFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponent(index);
				jPanel.setBorder(this.tipogrupoflujocajaConstantesFunciones.resaltarBusquedaPorCodigoTipoGrupoFlujoCaja);
			}
		}

		if(this.tipogrupoflujocajaConstantesFunciones.resaltarBusquedaPorNombreTipoGrupoFlujoCaja!=null) {
			index= this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoGrupoFlujoCaja);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponent(index);
				jPanel.setBorder(this.tipogrupoflujocajaConstantesFunciones.resaltarBusquedaPorNombreTipoGrupoFlujoCaja);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGrupoFlujoCaja() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGrupoFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogrupoflujocajaConstantesFunciones.mostrarBusquedaPorCodigoTipoGrupoFlujoCaja);
			if(!this.tipogrupoflujocajaConstantesFunciones.mostrarBusquedaPorCodigoTipoGrupoFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoGrupoFlujoCaja);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogrupoflujocajaConstantesFunciones.mostrarBusquedaPorNombreTipoGrupoFlujoCaja);
			if(!this.tipogrupoflujocajaConstantesFunciones.mostrarBusquedaPorNombreTipoGrupoFlujoCaja && index>-1) {
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoGrupoFlujoCaja() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGrupoFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogrupoflujocajaConstantesFunciones.activarBusquedaPorCodigoTipoGrupoFlujoCaja);
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setEnabledAt(index,this.tipogrupoflujocajaConstantesFunciones.activarBusquedaPorCodigoTipoGrupoFlujoCaja);
			}

			index= this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoGrupoFlujoCaja);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogrupoflujocajaConstantesFunciones.activarBusquedaPorNombreTipoGrupoFlujoCaja);
				this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setEnabledAt(index,this.tipogrupoflujocajaConstantesFunciones.activarBusquedaPorNombreTipoGrupoFlujoCaja);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoGrupoFlujoCaja(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorCodigoTipoGrupoFlujoCaja);

			this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponent(index);

			this.tipogrupoflujocajaConstantesFunciones.setResaltarBusquedaPorCodigoTipoGrupoFlujoCaja(resaltar);

			jPanel.setBorder(this.tipogrupoflujocajaConstantesFunciones.resaltarBusquedaPorCodigoTipoGrupoFlujoCaja);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.indexOfComponent(this.jPanelBusquedaPorNombreTipoGrupoFlujoCaja);

			this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFlujoCaja.getComponent(index);

			this.tipogrupoflujocajaConstantesFunciones.setResaltarBusquedaPorNombreTipoGrupoFlujoCaja(resaltar);

			jPanel.setBorder(this.tipogrupoflujocajaConstantesFunciones.resaltarBusquedaPorNombreTipoGrupoFlujoCaja);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoGrupoFlujoCaja.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoGrupoFlujoCaja() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGrupoFlujoCaja();
		this.updateVisibilidadResaltarControlesFormularioTipoGrupoFlujoCaja();
		this.updateHabilitarResaltarControlesFormularioTipoGrupoFlujoCaja();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGrupoFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogrupoflujocajaConstantesFunciones.resaltaridTipoGrupoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.setBorder(this.tipogrupoflujocajaConstantesFunciones.resaltaridTipoGrupoFlujoCaja);}
		if(this.tipogrupoflujocajaConstantesFunciones.resaltarcodigoTipoGrupoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldcodigoTipoGrupoFlujoCaja.setBorder(this.tipogrupoflujocajaConstantesFunciones.resaltarcodigoTipoGrupoFlujoCaja);}
		if(this.tipogrupoflujocajaConstantesFunciones.resaltarnombreTipoGrupoFlujoCaja!=null && this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextAreanombreTipoGrupoFlujoCaja.setBorder(this.tipogrupoflujocajaConstantesFunciones.resaltarnombreTipoGrupoFlujoCaja);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGrupoFlujoCaja() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
	
		//this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.setVisible(this.tipogrupoflujocajaConstantesFunciones.mostraridTipoGrupoFlujoCaja);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jPanelidTipoGrupoFlujoCaja.setVisible(this.tipogrupoflujocajaConstantesFunciones.mostraridTipoGrupoFlujoCaja);
		//this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldcodigoTipoGrupoFlujoCaja.setVisible(this.tipogrupoflujocajaConstantesFunciones.mostrarcodigoTipoGrupoFlujoCaja);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jPanelcodigoTipoGrupoFlujoCaja.setVisible(this.tipogrupoflujocajaConstantesFunciones.mostrarcodigoTipoGrupoFlujoCaja);
		//this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextAreanombreTipoGrupoFlujoCaja.setVisible(this.tipogrupoflujocajaConstantesFunciones.mostrarnombreTipoGrupoFlujoCaja);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jPanelnombreTipoGrupoFlujoCaja.setVisible(this.tipogrupoflujocajaConstantesFunciones.mostrarnombreTipoGrupoFlujoCaja);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGrupoFlujoCaja() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoFlujoCaja!=null) {
	
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldidTipoGrupoFlujoCaja.setEnabled(this.tipogrupoflujocajaConstantesFunciones.activaridTipoGrupoFlujoCaja);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextFieldcodigoTipoGrupoFlujoCaja.setEnabled(this.tipogrupoflujocajaConstantesFunciones.activarcodigoTipoGrupoFlujoCaja);
		this.jInternalFrameDetalleFormTipoGrupoFlujoCaja.jTextAreanombreTipoGrupoFlujoCaja.setEnabled(this.tipogrupoflujocajaConstantesFunciones.activarnombreTipoGrupoFlujoCaja);
		}
	}
	
		
}