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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.CateTipoAfiliacionConstantesFunciones;
import com.bydan.erp.nomina.util.CateTipoAfiliacionParameterReturnGeneral;
//import com.bydan.erp.nomina.util.CateTipoAfiliacionParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.CateTipoAfiliacionBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.sris.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.produccion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.produccion.presentation.swing.jinternalframes.*;

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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


import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.produccion.business.entity.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.sris.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.produccion.util.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.produccion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class CateTipoAfiliacionBeanSwingJInternalFrame extends CateTipoAfiliacionJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(CateTipoAfiliacionBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<CateTipoAfiliacion> catetipoafiliacionValidator = new ClassValidator<CateTipoAfiliacion>(CateTipoAfiliacion.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public CateTipoAfiliacion catetipoafiliacion;	
	public CateTipoAfiliacion catetipoafiliacionAux;
	public CateTipoAfiliacion catetipoafiliacionAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public CateTipoAfiliacion catetipoafiliacionTotales;
	public Long idCateTipoAfiliacionActual;
	public Long iIdNuevoCateTipoAfiliacion=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosTipoAfiliacion=false;

	public Boolean getIsTienePermisosTipoAfiliacion() {
		return isTienePermisosTipoAfiliacion;
	}

	public void setIsTienePermisosTipoAfiliacion(Boolean isTienePermisosTipoAfiliacion) {
		this.isTienePermisosTipoAfiliacion= isTienePermisosTipoAfiliacion;
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
	
	public Boolean isPermisoTodoCateTipoAfiliacion;
	public Boolean isPermisoNuevoCateTipoAfiliacion;
	public Boolean isPermisoActualizarCateTipoAfiliacion;
	public Boolean isPermisoActualizarOriginalCateTipoAfiliacion;
	public Boolean isPermisoEliminarCateTipoAfiliacion;
	public Boolean isPermisoGuardarCambiosCateTipoAfiliacion;
	public Boolean isPermisoConsultaCateTipoAfiliacion;
	public Boolean isPermisoBusquedaCateTipoAfiliacion;
	public Boolean isPermisoReporteCateTipoAfiliacion;
	public Boolean isPermisoPaginacionMedioCateTipoAfiliacion;
	public Boolean isPermisoPaginacionAltoCateTipoAfiliacion;
	public Boolean isPermisoPaginacionTodoCateTipoAfiliacion;
	public Boolean isPermisoCopiarCateTipoAfiliacion;
	public Boolean isPermisoVerFormCateTipoAfiliacion;
	public Boolean isPermisoDuplicarCateTipoAfiliacion;
	public Boolean isPermisoOrdenCateTipoAfiliacion;
	
	
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
	
	public CateTipoAfiliacionParameterReturnGeneral catetipoafiliacionReturnGeneral;
	public CateTipoAfiliacionParameterReturnGeneral catetipoafiliacionParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public TipoAfiliacionLogic tipoafiliacionLogic=null;

	public TipoAfiliacionLogic getTipoAfiliacionLogic() {
		return tipoafiliacionLogic;
	}

	public void setTipoAfiliacionLogic(TipoAfiliacionLogic tipoafiliacionLogic) {
		this.tipoafiliacionLogic = tipoafiliacionLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoCateTipoAfiliacion=false;
	public Boolean esParaAccionDesdeFormularioCateTipoAfiliacion=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected CateTipoAfiliacionSessionBeanAdditional catetipoafiliacionSessionBeanAdditional=null;
	
	public CateTipoAfiliacionSessionBeanAdditional getCateTipoAfiliacionSessionBeanAdditional() {
		return this.catetipoafiliacionSessionBeanAdditional;
	}
	
	public void setCateTipoAfiliacionSessionBeanAdditional(CateTipoAfiliacionSessionBeanAdditional catetipoafiliacionSessionBeanAdditional) {
		try {
			this.catetipoafiliacionSessionBeanAdditional=catetipoafiliacionSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected CateTipoAfiliacionBeanSwingJInternalFrameAdditional catetipoafiliacionBeanSwingJInternalFrameAdditional=null;
	//public class CateTipoAfiliacionBeanSwingJInternalFrame
	
	public CateTipoAfiliacionBeanSwingJInternalFrameAdditional getCateTipoAfiliacionBeanSwingJInternalFrameAdditional() {
		return this.catetipoafiliacionBeanSwingJInternalFrameAdditional;
	}
	
	public void setCateTipoAfiliacionBeanSwingJInternalFrameAdditional(CateTipoAfiliacionBeanSwingJInternalFrameAdditional catetipoafiliacionBeanSwingJInternalFrameAdditional) {
		try {
			this.catetipoafiliacionBeanSwingJInternalFrameAdditional=catetipoafiliacionBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public CateTipoAfiliacionLogic catetipoafiliacionLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public CateTipoAfiliacion catetipoafiliacionBean;
	public CateTipoAfiliacionConstantesFunciones catetipoafiliacionConstantesFunciones;
	//public CateTipoAfiliacionParameterReturnGeneral catetipoafiliacionReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<CateTipoAfiliacion> catetipoafiliacions;	
	//public List<CateTipoAfiliacion> catetipoafiliacionsEliminados;
	//public List<CateTipoAfiliacion> catetipoafiliacionsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoCateTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaDuplicarCateTipoAfiliacion=true;
	public Boolean isVisibilidadCeldaCopiarCateTipoAfiliacion=true;
	public Boolean isVisibilidadCeldaVerFormCateTipoAfiliacion=true;
	public Boolean isVisibilidadCeldaOrdenCateTipoAfiliacion=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaModificarCateTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaActualizarCateTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaEliminarCateTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaCancelarCateTipoAfiliacion=false;
	public Boolean isVisibilidadCeldaGuardarCateTipoAfiliacion=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=false;	
	
	
	
	public Long getiIdNuevoCateTipoAfiliacion() {
		return this.iIdNuevoCateTipoAfiliacion;
	}

	public void setiIdNuevoCateTipoAfiliacion(Long iIdNuevoCateTipoAfiliacion) {
		this.iIdNuevoCateTipoAfiliacion = iIdNuevoCateTipoAfiliacion;
	}
	
	public Long getidCateTipoAfiliacionActual() {
		return this.idCateTipoAfiliacionActual;
	}

	public void setidCateTipoAfiliacionActual(Long idCateTipoAfiliacionActual) {
		this.idCateTipoAfiliacionActual = idCateTipoAfiliacionActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public CateTipoAfiliacion getcatetipoafiliacion() {
		return this.catetipoafiliacion;
	}

	public void setcatetipoafiliacion(CateTipoAfiliacion catetipoafiliacion) {
		this.catetipoafiliacion = catetipoafiliacion;
	}
	
	public CateTipoAfiliacion getcatetipoafiliacionAux() {
		return this.catetipoafiliacionAux;
	}

	public void setcatetipoafiliacionAux(CateTipoAfiliacion catetipoafiliacionAux) {
		this.catetipoafiliacionAux = catetipoafiliacionAux;
	}				
	
	public CateTipoAfiliacion getcatetipoafiliacionAnterior() {
		return this.catetipoafiliacionAnterior;
	}

	public void setcatetipoafiliacionAnterior(CateTipoAfiliacion catetipoafiliacionAnterior) {
		this.catetipoafiliacionAnterior = catetipoafiliacionAnterior;
	}	
	
	public CateTipoAfiliacion getcatetipoafiliacionTotales() {
		return this.catetipoafiliacionTotales;
	}

	public void setcatetipoafiliacionTotales(CateTipoAfiliacion catetipoafiliacionTotales) {
		this.catetipoafiliacionTotales = catetipoafiliacionTotales;
	}	
	
	public CateTipoAfiliacion getcatetipoafiliacionBean() {
		return this.catetipoafiliacionBean;
	}

	public void setcatetipoafiliacionBean(CateTipoAfiliacion catetipoafiliacionBean) {
		this.catetipoafiliacionBean = catetipoafiliacionBean;
	}	
	
	public CateTipoAfiliacionParameterReturnGeneral getcatetipoafiliacionReturnGeneral() {
		return this.catetipoafiliacionReturnGeneral;
	}

	public void setcatetipoafiliacionReturnGeneral(CateTipoAfiliacionParameterReturnGeneral catetipoafiliacionReturnGeneral) {
		this.catetipoafiliacionReturnGeneral = catetipoafiliacionReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public CateTipoAfiliacionLogic getCateTipoAfiliacionLogic()	{		
		return catetipoafiliacionLogic;
	}

	public void setCateTipoAfiliacionLogic(CateTipoAfiliacionLogic catetipoafiliacionLogic) {
		this.catetipoafiliacionLogic = catetipoafiliacionLogic;
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
	
	public Boolean getIsEsNuevoCateTipoAfiliacion() {
		return isEsNuevoCateTipoAfiliacion;
	}

	public void setIsEsNuevoCateTipoAfiliacion(Boolean isEsNuevoCateTipoAfiliacion) {
		this.isEsNuevoCateTipoAfiliacion = isEsNuevoCateTipoAfiliacion;
	}

	public Boolean getEsParaAccionDesdeFormularioCateTipoAfiliacion() {
		return esParaAccionDesdeFormularioCateTipoAfiliacion;
	}
	
	public void setEsParaAccionDesdeFormularioCateTipoAfiliacion(Boolean esParaAccionDesdeFormularioCateTipoAfiliacion) {
		this.esParaAccionDesdeFormularioCateTipoAfiliacion = esParaAccionDesdeFormularioCateTipoAfiliacion;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesCateTipoAfiliacion() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			CateTipoAfiliacionConstantesFunciones.refrescarForeignKeysDescripcionesCateTipoAfiliacion(this.catetipoafiliacionLogic.getCateTipoAfiliacions());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			CateTipoAfiliacionConstantesFunciones.refrescarForeignKeysDescripcionesCateTipoAfiliacion(this.catetipoafiliacions);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//catetipoafiliacionLogic.setCateTipoAfiliacions(this.catetipoafiliacions);
			catetipoafiliacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public CateTipoAfiliacionParameterReturnGeneral getCateTipoAfiliacionParameterGeneral() {
		return this.catetipoafiliacionParameterGeneral;
	}
	
	public void setCateTipoAfiliacionParameterGeneral(CateTipoAfiliacionParameterReturnGeneral catetipoafiliacionParameterGeneral) {
		this.catetipoafiliacionParameterGeneral = catetipoafiliacionParameterGeneral;
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
	
	public Boolean getIsPermisoTodoCateTipoAfiliacion() {
		return isPermisoTodoCateTipoAfiliacion;
	}

	public void setIsPermisoTodoCateTipoAfiliacion(Boolean isPermisoTodoCateTipoAfiliacion) {
		this.isPermisoTodoCateTipoAfiliacion = isPermisoTodoCateTipoAfiliacion;
	}

	public Boolean getIsPermisoNuevoCateTipoAfiliacion() {
		return isPermisoNuevoCateTipoAfiliacion;
	}

	public void setIsPermisoNuevoCateTipoAfiliacion(Boolean isPermisoNuevoCateTipoAfiliacion) {
		this.isPermisoNuevoCateTipoAfiliacion = isPermisoNuevoCateTipoAfiliacion;
	}

	public Boolean getIsPermisoActualizarCateTipoAfiliacion() {
		return isPermisoActualizarCateTipoAfiliacion;
	}

	public void setIsPermisoActualizarCateTipoAfiliacion(Boolean isPermisoActualizarCateTipoAfiliacion) {
		this.isPermisoActualizarCateTipoAfiliacion = isPermisoActualizarCateTipoAfiliacion;
	}

	public Boolean getIsPermisoEliminarCateTipoAfiliacion() {
		return isPermisoEliminarCateTipoAfiliacion;
	}

	public void setIsPermisoEliminarCateTipoAfiliacion(Boolean isPermisoEliminarCateTipoAfiliacion) {
		this.isPermisoEliminarCateTipoAfiliacion = isPermisoEliminarCateTipoAfiliacion;
	}

	public Boolean getIsPermisoGuardarCambiosCateTipoAfiliacion() {
		return isPermisoGuardarCambiosCateTipoAfiliacion;
	}

	public void setIsPermisoGuardarCambiosCateTipoAfiliacion(Boolean isPermisoGuardarCambiosCateTipoAfiliacion) {
		this.isPermisoGuardarCambiosCateTipoAfiliacion = isPermisoGuardarCambiosCateTipoAfiliacion;
	}
	
	public Boolean getIsPermisoConsultaCateTipoAfiliacion() {
		return isPermisoConsultaCateTipoAfiliacion;
	}

	public void setIsPermisoConsultaCateTipoAfiliacion(Boolean isPermisoConsultaCateTipoAfiliacion) {
		this.isPermisoConsultaCateTipoAfiliacion = isPermisoConsultaCateTipoAfiliacion;
	}

	public Boolean getIsPermisoBusquedaCateTipoAfiliacion() {
		return isPermisoBusquedaCateTipoAfiliacion;
	}

	public void setIsPermisoBusquedaCateTipoAfiliacion(Boolean isPermisoBusquedaCateTipoAfiliacion) {
		this.isPermisoBusquedaCateTipoAfiliacion = isPermisoBusquedaCateTipoAfiliacion;
	}

	public Boolean getIsPermisoReporteCateTipoAfiliacion() {
		return isPermisoReporteCateTipoAfiliacion;
	}

	public void setIsPermisoReporteCateTipoAfiliacion(Boolean isPermisoReporteCateTipoAfiliacion) {
		this.isPermisoReporteCateTipoAfiliacion = isPermisoReporteCateTipoAfiliacion;
	}
	
	public Boolean getIsPermisoPaginacionMedioCateTipoAfiliacion() {
		return isPermisoPaginacionMedioCateTipoAfiliacion;
	}

	public void setIsPermisoPaginacionMedioCateTipoAfiliacion(Boolean isPermisoPaginacionMedioCateTipoAfiliacion) {
		this.isPermisoPaginacionMedioCateTipoAfiliacion = isPermisoPaginacionMedioCateTipoAfiliacion;
	}
	
	public Boolean getIsPermisoPaginacionTodoCateTipoAfiliacion() {
		return isPermisoPaginacionTodoCateTipoAfiliacion;
	}

	public void setIsPermisoPaginacionTodoCateTipoAfiliacion(Boolean isPermisoPaginacionTodoCateTipoAfiliacion) {
		this.isPermisoPaginacionTodoCateTipoAfiliacion = isPermisoPaginacionTodoCateTipoAfiliacion;
	}
	
	public Boolean getIsPermisoPaginacionAltoCateTipoAfiliacion() {
		return isPermisoPaginacionAltoCateTipoAfiliacion;
	}

	public void setIsPermisoPaginacionAltoCateTipoAfiliacion(Boolean isPermisoPaginacionAltoCateTipoAfiliacion) {
		this.isPermisoPaginacionAltoCateTipoAfiliacion = isPermisoPaginacionAltoCateTipoAfiliacion;
	}
	
	public Boolean getIsPermisoCopiarCateTipoAfiliacion() {
		return isPermisoCopiarCateTipoAfiliacion;
	}

	public void setIsPermisoCopiarCateTipoAfiliacion(Boolean isPermisoCopiarCateTipoAfiliacion) {
		this.isPermisoCopiarCateTipoAfiliacion = isPermisoCopiarCateTipoAfiliacion;
	}
	
	public Boolean getIsPermisoVerFormCateTipoAfiliacion() {
		return isPermisoVerFormCateTipoAfiliacion;
	}

	public void setIsPermisoVerFormCateTipoAfiliacion(Boolean isPermisoVerFormCateTipoAfiliacion) {
		this.isPermisoVerFormCateTipoAfiliacion = isPermisoVerFormCateTipoAfiliacion;
	}
	
	public Boolean getIsPermisoDuplicarCateTipoAfiliacion() {
		return isPermisoDuplicarCateTipoAfiliacion;
	}

	public void setIsPermisoDuplicarCateTipoAfiliacion(Boolean isPermisoDuplicarCateTipoAfiliacion) {
		this.isPermisoDuplicarCateTipoAfiliacion = isPermisoDuplicarCateTipoAfiliacion;
	}
	
	public Boolean getIsPermisoOrdenCateTipoAfiliacion() {
		return isPermisoOrdenCateTipoAfiliacion;
	}

	public void setIsPermisoOrdenCateTipoAfiliacion(Boolean isPermisoOrdenCateTipoAfiliacion) {
		this.isPermisoOrdenCateTipoAfiliacion = isPermisoOrdenCateTipoAfiliacion;
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
	
	public Boolean getIsVisibilidadCeldaNuevoCateTipoAfiliacion() {
		return isVisibilidadCeldaNuevoCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaNuevoCateTipoAfiliacion(Boolean isVisibilidadCeldaNuevoCateTipoAfiliacion) {
		this.isVisibilidadCeldaNuevoCateTipoAfiliacion = isVisibilidadCeldaNuevoCateTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarCateTipoAfiliacion() {
		return isVisibilidadCeldaDuplicarCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaDuplicarCateTipoAfiliacion(Boolean isVisibilidadCeldaDuplicarCateTipoAfiliacion) {
		this.isVisibilidadCeldaDuplicarCateTipoAfiliacion = isVisibilidadCeldaDuplicarCateTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarCateTipoAfiliacion() {
		return isVisibilidadCeldaCopiarCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaCopiarCateTipoAfiliacion(Boolean isVisibilidadCeldaCopiarCateTipoAfiliacion) {
		this.isVisibilidadCeldaCopiarCateTipoAfiliacion = isVisibilidadCeldaCopiarCateTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormCateTipoAfiliacion() {
		return isVisibilidadCeldaVerFormCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaVerFormCateTipoAfiliacion(Boolean isVisibilidadCeldaVerFormCateTipoAfiliacion) {
		this.isVisibilidadCeldaVerFormCateTipoAfiliacion = isVisibilidadCeldaVerFormCateTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenCateTipoAfiliacion() {
		return isVisibilidadCeldaOrdenCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaOrdenCateTipoAfiliacion(Boolean isVisibilidadCeldaOrdenCateTipoAfiliacion) {
		this.isVisibilidadCeldaOrdenCateTipoAfiliacion = isVisibilidadCeldaOrdenCateTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion() {
		return isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion(Boolean isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion) {
		this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion = isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaModificarCateTipoAfiliacion() {
		return isVisibilidadCeldaModificarCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaModificarCateTipoAfiliacion(Boolean isVisibilidadCeldaModificarCateTipoAfiliacion) {
		this.isVisibilidadCeldaModificarCateTipoAfiliacion = isVisibilidadCeldaModificarCateTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarCateTipoAfiliacion() {
		return isVisibilidadCeldaActualizarCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaActualizarCateTipoAfiliacion(Boolean isVisibilidadCeldaActualizarCateTipoAfiliacion) {
		this.isVisibilidadCeldaActualizarCateTipoAfiliacion = isVisibilidadCeldaActualizarCateTipoAfiliacion;
	}

	public Boolean getIsVisibilidadCeldaEliminarCateTipoAfiliacion() {
		return isVisibilidadCeldaEliminarCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaEliminarCateTipoAfiliacion(Boolean isVisibilidadCeldaEliminarCateTipoAfiliacion) {
		this.isVisibilidadCeldaEliminarCateTipoAfiliacion = isVisibilidadCeldaEliminarCateTipoAfiliacion;
	}

	public Boolean getIsVisibilidadCeldaCancelarCateTipoAfiliacion() {
		return isVisibilidadCeldaCancelarCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaCancelarCateTipoAfiliacion(Boolean isVisibilidadCeldaCancelarCateTipoAfiliacion) {
		this.isVisibilidadCeldaCancelarCateTipoAfiliacion = isVisibilidadCeldaCancelarCateTipoAfiliacion;
	}

	public Boolean getIsVisibilidadCeldaGuardarCateTipoAfiliacion() {
		return isVisibilidadCeldaGuardarCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaGuardarCateTipoAfiliacion(Boolean isVisibilidadCeldaGuardarCateTipoAfiliacion) {
		this.isVisibilidadCeldaGuardarCateTipoAfiliacion = isVisibilidadCeldaGuardarCateTipoAfiliacion;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosCateTipoAfiliacion() {
		return isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion;
	}

	public void setIsVisibilidadCeldaGuardarCambiosCateTipoAfiliacion(Boolean isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion) {
		this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion = isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion;
	}
		
	public CateTipoAfiliacionSessionBean getcatetipoafiliacionSessionBean() {
		return this.catetipoafiliacionSessionBean;
	}
	
	public void setcatetipoafiliacionSessionBean(CateTipoAfiliacionSessionBean catetipoafiliacionSessionBean) {
		this.catetipoafiliacionSessionBean=catetipoafiliacionSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion)throws Exception {
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
	
	public void bugActualizarReferenciaActual(CateTipoAfiliacion catetipoafiliacion,CateTipoAfiliacion catetipoafiliacionAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalCateTipoAfiliacion(catetipoafiliacion);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		catetipoafiliacionAux.setId(catetipoafiliacion.getId());
		catetipoafiliacionAux.setVersionRow(catetipoafiliacion.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessCateTipoAfiliacion();
		
			int intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = catetipoafiliacionValidator.getInvalidValues(this.catetipoafiliacion);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			catetipoafiliacionLogic.setDatosCliente(datosCliente);
			catetipoafiliacionLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				catetipoafiliacionAux=new  CateTipoAfiliacion();
				
				catetipoafiliacionAux.setIsNew(true);
				catetipoafiliacionAux.setIsChanged(true);
				
				catetipoafiliacionAux.setCateTipoAfiliacionOriginal(this.catetipoafiliacion);
				
				catetipoafiliacionAux.setId(this.catetipoafiliacion.getId());	
				catetipoafiliacionAux.setVersionRow(this.catetipoafiliacion.getVersionRow());	
				catetipoafiliacionAux.setcodigo(this.catetipoafiliacion.getcodigo());	
				catetipoafiliacionAux.setnombre(this.catetipoafiliacion.getnombre());	
				catetipoafiliacionAux.setes_defecto(this.catetipoafiliacion.getes_defecto());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.catetipoafiliacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(catetipoafiliacionAux,catetipoafiliacionLogic.getCateTipoAfiliacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(catetipoafiliacionAux,catetipoafiliacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						catetipoafiliacionLogic.saveCateTipoAfiliacions();//WithConnection
						//catetipoafiliacionLogic.getSetVersionRowCateTipoAfiliacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.catetipoafiliacion,catetipoafiliacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions().addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacions.addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionsEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								catetipoafiliacionLogic.saveCateTipoAfiliacionRelaciones(catetipoafiliacionAux,this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions());//WithConnection
								//catetipoafiliacionLogic.getSetVersionRowCateTipoAfiliacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.catetipoafiliacion,catetipoafiliacionAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.setTipoAfiliacions(new ArrayList<TipoAfiliacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacions= new ArrayList<TipoAfiliacion>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							catetipoafiliacionAux.setClientes(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.quitarFilaTotales();}
							catetipoafiliacionAux.setTipoAfiliacions(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.catetipoafiliacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(catetipoafiliacionAux,catetipoafiliacionLogic.getCateTipoAfiliacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(catetipoafiliacionAux,catetipoafiliacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.catetipoafiliacion,catetipoafiliacionAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				catetipoafiliacionAux=new  CateTipoAfiliacion();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado() 
					|| (this.catetipoafiliacionSessionBean.getEsGuardarRelacionado() && this.catetipoafiliacion.getId()>=0)) {
						
					catetipoafiliacionAux.setIsNew(false);
				}
				
				catetipoafiliacionAux.setIsDeleted(false);
			
				catetipoafiliacionAux.setId(this.catetipoafiliacion.getId());	
				catetipoafiliacionAux.setVersionRow(this.catetipoafiliacion.getVersionRow());	
				catetipoafiliacionAux.setcodigo(this.catetipoafiliacion.getcodigo());	
				catetipoafiliacionAux.setnombre(this.catetipoafiliacion.getnombre());	
				catetipoafiliacionAux.setes_defecto(this.catetipoafiliacion.getes_defecto());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(catetipoafiliacionAux,catetipoafiliacionLogic.getCateTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(catetipoafiliacionAux,catetipoafiliacions);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						catetipoafiliacionLogic.saveCateTipoAfiliacions();//WithConnection
						//catetipoafiliacionLogic.getSetVersionRowCateTipoAfiliacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.catetipoafiliacion,catetipoafiliacionAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions().addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacions.addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionsEliminados);
						}
						//ARCHITECTURE
						
						if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								catetipoafiliacionLogic.saveCateTipoAfiliacionRelaciones(catetipoafiliacionAux,this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions());//WithConnection
								//catetipoafiliacionLogic.getSetVersionRowCateTipoAfiliacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.catetipoafiliacion,catetipoafiliacionAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.setTipoAfiliacions(new ArrayList<TipoAfiliacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacions= new ArrayList<TipoAfiliacion>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							catetipoafiliacionAux.setClientes(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.quitarFilaTotales();}
							catetipoafiliacionAux.setTipoAfiliacions(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
									|| this.catetipoafiliacionSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(catetipoafiliacionAux,catetipoafiliacionLogic.getCateTipoAfiliacions());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(catetipoafiliacionAux,catetipoafiliacions);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.catetipoafiliacion,catetipoafiliacionAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				catetipoafiliacionAux=new  CateTipoAfiliacion();
				
				catetipoafiliacionAux.setIsNew(false);
				catetipoafiliacionAux.setIsChanged(false);
				
				catetipoafiliacionAux.setIsDeleted(true);
				
				catetipoafiliacionAux.setId(this.catetipoafiliacion.getId());	
				catetipoafiliacionAux.setVersionRow(this.catetipoafiliacion.getVersionRow());	
				catetipoafiliacionAux.setcodigo(this.catetipoafiliacion.getcodigo());	
				catetipoafiliacionAux.setnombre(this.catetipoafiliacion.getnombre());	
				catetipoafiliacionAux.setes_defecto(this.catetipoafiliacion.getes_defecto());	
				
				if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.catetipoafiliacionAux.getId()>=0) {	
						this.catetipoafiliacionsEliminados.add(catetipoafiliacionAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(catetipoafiliacionAux,catetipoafiliacionLogic.getCateTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(catetipoafiliacionAux,catetipoafiliacions);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						catetipoafiliacionLogic.saveCateTipoAfiliacions();//WithConnection
						//catetipoafiliacionLogic.getSetVersionRowCateTipoAfiliacions();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions().addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionsEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacions.addAll(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionsEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jInternalFrameDetalleFormTipoAfiliacion.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								catetipoafiliacionLogic.saveCateTipoAfiliacionRelaciones(catetipoafiliacionAux,this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions());//WithConnection
								//catetipoafiliacionLogic.getSetVersionRowCateTipoAfiliacions();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.setTipoAfiliacions(new ArrayList<TipoAfiliacion>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacions= new ArrayList<TipoAfiliacion>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							catetipoafiliacionAux.setClientes(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.quitarFilaTotales();}
							catetipoafiliacionAux.setTipoAfiliacions(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
								|| this.catetipoafiliacionSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(catetipoafiliacionAux,catetipoafiliacionLogic.getCateTipoAfiliacions());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(catetipoafiliacionAux,catetipoafiliacions);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.getCateTipoAfiliacions().addAll(this.catetipoafiliacionsEliminados);
					
					catetipoafiliacionLogic.saveCateTipoAfiliacions();//WithConnection
					//catetipoafiliacionLogic.getSetVersionRowCateTipoAfiliacions();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.catetipoafiliacionsEliminados= new ArrayList<CateTipoAfiliacion>();		
			}
			
			if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Cate Tipo Afiliacion GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.catetipoafiliacion=catetipoafiliacionAux;
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
      		//this.finishProcessCateTipoAfiliacion();
      	}
		
	}	
	
	public void actualizarRelaciones(CateTipoAfiliacion catetipoafiliacionLocal) throws Exception {
		
		if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				catetipoafiliacionLocal.setClientes(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				catetipoafiliacionLocal.setTipoAfiliacions(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions());
			
			} else {
			
				catetipoafiliacionLocal.setClientes(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clientes);
				catetipoafiliacionLocal.setTipoAfiliacions(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacions);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(CateTipoAfiliacion catetipoafiliacionLocal) throws Exception {	
		if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarCateTipoAfiliacionActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = catetipoafiliacionValidator.getInvalidValues(this.catetipoafiliacion);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(CateTipoAfiliacion catetipoafiliacion,List<CateTipoAfiliacion> catetipoafiliacions) throws Exception {
		try	{		
			CateTipoAfiliacionConstantesFunciones.actualizarLista(catetipoafiliacion,catetipoafiliacions,this.catetipoafiliacionSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(CateTipoAfiliacion catetipoafiliacion,List<CateTipoAfiliacion> catetipoafiliacions) throws Exception {
		try	{			
			CateTipoAfiliacionConstantesFunciones.actualizarSelectedLista(catetipoafiliacion,catetipoafiliacions);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<CateTipoAfiliacion> catetipoafiliacionsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				catetipoafiliacionsLocal=this.catetipoafiliacionLogic.getCateTipoAfiliacions();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				catetipoafiliacionsLocal=this.catetipoafiliacions;
			}
			//ARCHITECTURE
		
			for(CateTipoAfiliacion catetipoafiliacionLocal:catetipoafiliacionsLocal) {
				if(this.permiteMantenimiento(catetipoafiliacionLocal) && catetipoafiliacionLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+CateTipoAfiliacionConstantesFunciones.getCateTipoAfiliacionLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(CateTipoAfiliacionConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabelcodigoCateTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CateTipoAfiliacionConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabelnombreCateTipoAfiliacion,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(CateTipoAfiliacionConstantesFunciones.ESDEFECTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabeles_defectoCateTipoAfiliacion,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabelcodigoCateTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabelnombreCateTipoAfiliacion,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabeles_defectoCateTipoAfiliacion,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.catetipoafiliacion==null) {
				this.catetipoafiliacion= new CateTipoAfiliacion();
			}

			if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCateTipoAfiliacion
				this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);

				this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.getcliente().setCateTipoAfiliacion(this.catetipoafiliacion);
			}

			return;
		}
		 else  if(sTipo.equals("TipoAfiliacion")) {
			if(this.catetipoafiliacion==null) {
				this.catetipoafiliacion= new CateTipoAfiliacion();
			}

			if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoCateTipoAfiliacion
				this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);

				this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.gettipoafiliacion().setCateTipoAfiliacion(this.catetipoafiliacion);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoCateTipoAfiliacion--;	
		
		
		this.catetipoafiliacionAux=new CateTipoAfiliacion();
		
		this.catetipoafiliacionAux.setId(this.iIdNuevoCateTipoAfiliacion);
		this.catetipoafiliacionAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.catetipoafiliacionLogic.getCateTipoAfiliacions().add(this.catetipoafiliacionAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.catetipoafiliacions.add(this.catetipoafiliacionAux);
		}
		//ARCHITECTURE
		
		this.catetipoafiliacion=this.catetipoafiliacionAux;
		
		if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioCateTipoAfiliacion(this.catetipoafiliacion);
			this.setVariablesObjetoActualToFormularioForeignKeyCateTipoAfiliacion(this.catetipoafiliacion);
		}
				
		//this.setDefaultControlesCateTipoAfiliacion();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyCateTipoAfiliacion();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyCateTipoAfiliacion();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyCateTipoAfiliacion();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCateTipoAfiliacion(this.catetipoafiliacionBean,this.catetipoafiliacion,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
			classes=CateTipoAfiliacionConstantesFunciones.getClassesRelationshipsOfCateTipoAfiliacion(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.catetipoafiliacionReturnGeneral=catetipoafiliacionLogic.procesarEventosCateTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.catetipoafiliacionLogic.getCateTipoAfiliacions(),this.catetipoafiliacion,this.catetipoafiliacionParameterGeneral,this.isEsNuevoCateTipoAfiliacion,classes);//this.catetipoafiliacionLogic.getCateTipoAfiliacion()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanCateTipoAfiliacion(this.catetipoafiliacionReturnGeneral,this.catetipoafiliacionBean,false);
		
		if(this.catetipoafiliacionReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyCateTipoAfiliacion(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacion());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioCateTipoAfiliacion(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacion());
		}
		
		if(this.catetipoafiliacionReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioCateTipoAfiliacion(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacion(),classes);//this.catetipoafiliacionBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyCateTipoAfiliacion();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyCateTipoAfiliacion();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.RecargarFormCateTipoAfiliacion(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingCateTipoAfiliacion(false);
						
			if(catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.getEsGuardarRelacionado() && TipoAfiliacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoAfiliacionActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCateTipoAfiliacion();
			}
			
			this.actualizarVisualTableDatosCateTipoAfiliacion();
			
			this.jTableDatosCateTipoAfiliacion.setRowSelectionInterval(this.getIndiceNuevoCateTipoAfiliacion(), this.getIndiceNuevoCateTipoAfiliacion());
			
			this.seleccionarFilaTablaCateTipoAfiliacionActual();
						
			this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesCateTipoAfiliacion(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldcodigoCateTipoAfiliacion.setEnabled(isHabilitar && this.catetipoafiliacionConstantesFunciones.activarcodigoCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextAreanombreCateTipoAfiliacion.setEnabled(isHabilitar && this.catetipoafiliacionConstantesFunciones.activarnombreCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxes_defectoCateTipoAfiliacion.setEnabled(isHabilitar && this.catetipoafiliacionConstantesFunciones.activares_defectoCateTipoAfiliacion);	
		
	};
	
	public void setDefaultControlesCateTipoAfiliacion() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoCateTipoAfiliacion(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.catetipoafiliacionSessionBean.setConGuardarRelaciones(true);			
			this.catetipoafiliacionSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.catetipoafiliacionSessionBean.setConGuardarRelaciones(false);			
			this.catetipoafiliacionSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoCateTipoAfiliacion() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacionLogic.getCateTipoAfiliacions()) {
				if(catetipoafiliacionAux.getId().equals(this.iIdNuevoCateTipoAfiliacion)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacions) {
				if(catetipoafiliacionAux.getId().equals(this.iIdNuevoCateTipoAfiliacion)) {
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
	
	public int getIndiceActualCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacionLogic.getCateTipoAfiliacions()) {
				if(catetipoafiliacionAux.getId().equals(catetipoafiliacion.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacions) {
				if(catetipoafiliacionAux.getId().equals(catetipoafiliacion.getId())) {
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
	
	public void setCamposBaseDesdeOriginalCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacionOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacionLogic.getCateTipoAfiliacions()) {
				if(catetipoafiliacionAux.getCateTipoAfiliacionOriginal().getId().equals(catetipoafiliacionOriginal.getId())) {
					existe=true;
					catetipoafiliacionOriginal.setId(catetipoafiliacionAux.getId());
					catetipoafiliacionOriginal.setVersionRow(catetipoafiliacionAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacions) {
				if(catetipoafiliacionAux.getCateTipoAfiliacionOriginal().getId().equals(catetipoafiliacionOriginal.getId())) {
					existe=true;
					catetipoafiliacionOriginal.setId(catetipoafiliacionAux.getId());
					catetipoafiliacionOriginal.setVersionRow(catetipoafiliacionAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosCateTipoAfiliacion(Boolean esParaCancelar) throws Exception {
		catetipoafiliacionsAux=new ArrayList<CateTipoAfiliacion>();
		catetipoafiliacionAux=new CateTipoAfiliacion();
		
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacionLogic.getCateTipoAfiliacions()) {
					if(catetipoafiliacionAux.getId()<0) {
						catetipoafiliacionsAux.add(catetipoafiliacionAux);
					}		
				}
				this.iIdNuevoCateTipoAfiliacion=0L;
				this.catetipoafiliacionLogic.getCateTipoAfiliacions().removeAll(catetipoafiliacionsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacions) {
					if(catetipoafiliacionAux.getId()<0) {
						catetipoafiliacionsAux.add(catetipoafiliacionAux);
					}		
				}
				this.iIdNuevoCateTipoAfiliacion=0L;
				this.catetipoafiliacions.removeAll(catetipoafiliacionsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoCateTipoAfiliacion 
					&& this.catetipoafiliacionLogic.getCateTipoAfiliacions().size()>0
					) {
					catetipoafiliacionAux=this.catetipoafiliacionLogic.getCateTipoAfiliacions().get(this.catetipoafiliacionLogic.getCateTipoAfiliacions().size() - 1);
				
					if(catetipoafiliacionAux.getId()<0) {
						this.catetipoafiliacionLogic.getCateTipoAfiliacions().remove(catetipoafiliacionAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoCateTipoAfiliacion && this.catetipoafiliacions.size()>0) {
					catetipoafiliacionAux=this.catetipoafiliacions.get(this.catetipoafiliacions.size() - 1);
				
					if(catetipoafiliacionAux.getId()<0) {
						this.catetipoafiliacions.remove(catetipoafiliacionAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoCateTipoAfiliacion(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(catetipoafiliacion.getId()<0) {
				this.catetipoafiliacionLogic.getCateTipoAfiliacions().remove(this.catetipoafiliacion);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(catetipoafiliacion.getId()<0) {
				this.catetipoafiliacions.remove(this.catetipoafiliacion);
			}
		}			
	}
	
	public void setEstadosInicialesCateTipoAfiliacion(List<CateTipoAfiliacion> catetipoafiliacionsAux) throws Exception {
		CateTipoAfiliacionConstantesFunciones.setEstadosInicialesCateTipoAfiliacion(catetipoafiliacionsAux);
	}
	
	public void setEstadosInicialesCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacionAux) throws Exception {
		CateTipoAfiliacionConstantesFunciones.setEstadosInicialesCateTipoAfiliacion(catetipoafiliacionAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarCateTipoAfiliacionActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarCateTipoAfiliacionActual()) {
				if(!this.isEsNuevoCateTipoAfiliacion) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoCateTipoAfiliacion=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarCateTipoAfiliacionActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Cate Tipo Afiliacion ?", "MANTENIMIENTO DE Cate Tipo Afiliacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(CateTipoAfiliacion catetipoafiliacion) throws Exception {
		CateTipoAfiliacionConstantesFunciones.seleccionarAsignar(this.catetipoafiliacion,catetipoafiliacion);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarCateTipoAfiliacion=this.isPermisoActualizarOriginalCateTipoAfiliacion;
			
			
			this.seleccionarAsignar(catetipoafiliacion);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			CateTipoAfiliacionConstantesFunciones.quitarEspaciosCateTipoAfiliacion(this.catetipoafiliacion,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.catetipoafiliacionSessionBean.setsFuncionBusquedaRapida(this.catetipoafiliacionSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoCateTipoAfiliacion) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosCateTipoAfiliacion(esParaCancelar);				
				this.cancelarNuevoCateTipoAfiliacion(esParaCancelar);								
			}
			
			this.catetipoafiliacion=new CateTipoAfiliacion();
			
			this.inicializarCateTipoAfiliacion();
			
			this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarCateTipoAfiliacion() throws Exception {
		try {
			CateTipoAfiliacionConstantesFunciones.inicializarCateTipoAfiliacion(this.catetipoafiliacion);
			
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
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.catetipoafiliacionLogic.getCateTipoAfiliacions().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteCateTipoAfiliacions(String sAccionBusqueda,List<CateTipoAfiliacion> catetipoafiliacionsParaReportes) throws Exception {
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
					sPathReporteFinal="CateTipoAfiliacion"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="CateTipoAfiliacionMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("CateTipoAfiliacionMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="CateTipoAfiliacion"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Cate Tipo Afiliaciones");		
		parameters.put("busquedapor", CateTipoAfiliacionConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(TipoAfiliacion.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					CateTipoAfiliacionLogic catetipoafiliacionLogicAuxiliar=new CateTipoAfiliacionLogic();
					catetipoafiliacionLogicAuxiliar.setDatosCliente(catetipoafiliacionLogic.getDatosCliente());				
					catetipoafiliacionLogicAuxiliar.setCateTipoAfiliacions(catetipoafiliacionsParaReportes);
					
					catetipoafiliacionLogicAuxiliar.cargarRelacionesLoteForeignKeyCateTipoAfiliacionWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					catetipoafiliacionsParaReportes=catetipoafiliacionLogicAuxiliar.getCateTipoAfiliacions();
					
					//catetipoafiliacionLogic.getNewConnexionToDeep();
					
					//for (CateTipoAfiliacion catetipoafiliacion:catetipoafiliacionsParaReportes) {
					//	catetipoafiliacionLogic.deepLoad(catetipoafiliacion, false, DeepLoadType.INCLUDE, classes);
					//}						
					//catetipoafiliacionLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//catetipoafiliacionLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileTipoAfiliacion = AuxiliarReportes.class.getResourceAsStream("TipoAfiliacionDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tipoafiliacion", reportFileTipoAfiliacion);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceCateTipoAfiliacion=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			CateTipoAfiliacionConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			CateTipoAfiliacionConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceCateTipoAfiliacion=new JRBeanArrayDataSource(CateTipoAfiliacionJInternalFrame.TraerCateTipoAfiliacionBeans(catetipoafiliacionsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceCateTipoAfiliacion);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+CateTipoAfiliacionConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+CateTipoAfiliacionConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(CateTipoAfiliacionBean.TraerCateTipoAfiliacionBeans(catetipoafiliacionsParaReportes).toArray()));
							
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
				this.generarExcelReporteCateTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,catetipoafiliacionsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalCateTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,catetipoafiliacionsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoCateTipoAfiliacionActionPerformed(null);
					//this.generarExcelReporteCateTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,catetipoafiliacionsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalCateTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,catetipoafiliacionsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesCateTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,catetipoafiliacionsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesCateTipoAfiliacions(sAccionBusqueda,sTipoArchivoReporte,catetipoafiliacionsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteCateTipoAfiliacions(String sAccionBusqueda,String sTipoArchivoReporte,List<CateTipoAfiliacion> catetipoafiliacionsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"catetipoafiliacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CateTipoAfiliacions");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCateTipoAfiliacion("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(CateTipoAfiliacion catetipoafiliacion : catetipoafiliacionsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			CateTipoAfiliacionConstantesFunciones.generarExcelReporteDataCateTipoAfiliacion("NORMAL",row,workbook,catetipoafiliacion,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderCateTipoAfiliacion(String sTipo,Row row,Workbook workbook) {
		
		CateTipoAfiliacionConstantesFunciones.generarExcelReporteHeaderCateTipoAfiliacion(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalCateTipoAfiliacions(String sAccionBusqueda,String sTipoArchivoReporte,List<CateTipoAfiliacion> catetipoafiliacionsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"catetipoafiliacion_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CateTipoAfiliacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(CateTipoAfiliacion catetipoafiliacion : catetipoafiliacionsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(CateTipoAfiliacionConstantesFunciones.getCateTipoAfiliacionDescripcion(catetipoafiliacion));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(catetipoafiliacion.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(catetipoafiliacion.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(catetipoafiliacion.getes_defecto()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesCateTipoAfiliacions(String sAccionBusqueda,String sTipoArchivoReporte,List<CateTipoAfiliacion> catetipoafiliacionsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<CateTipoAfiliacion> catetipoafiliacionsRespaldo=null;
		
		classes=CateTipoAfiliacionConstantesFunciones.getClassesRelationshipsOfCateTipoAfiliacion(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.catetipoafiliacionLogic.setDatosCliente(this.datosCliente);
		this.catetipoafiliacionLogic.setDatosDeep(this.datosDeep);
		this.catetipoafiliacionLogic.setIsConDeep(true);
		
		catetipoafiliacionsRespaldo=this.catetipoafiliacionLogic.getCateTipoAfiliacions();
		
		this.catetipoafiliacionLogic.setCateTipoAfiliacions(catetipoafiliacionsParaReportes);	
		this.catetipoafiliacionLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		catetipoafiliacionsParaReportes=this.catetipoafiliacionLogic.getCateTipoAfiliacions();
		this.catetipoafiliacionLogic.setCateTipoAfiliacions(catetipoafiliacionsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"catetipoafiliacion_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("CateTipoAfiliacions");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderCateTipoAfiliacion("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(CateTipoAfiliacion catetipoafiliacion : catetipoafiliacionsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderCateTipoAfiliacion("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			CateTipoAfiliacionConstantesFunciones.generarExcelReporteDataCateTipoAfiliacion("NORMAL",row,workbook,catetipoafiliacion,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(catetipoafiliacion.getClientes()!=null && catetipoafiliacion.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(catetipoafiliacion.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : catetipoafiliacion.getClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ClienteConstantesFunciones.generarExcelReporteDataCliente("RELACIONADO",row,workbook,cliente,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//TipoAfiliacion
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO))) {

				if(catetipoafiliacion.getTipoAfiliacions()!=null && catetipoafiliacion.getTipoAfiliacions().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TipoAfiliacionConstantesFunciones.generarExcelReporteHeaderTipoAfiliacion("RELACIONADO",row,workbook);
				}

				if(catetipoafiliacion.getTipoAfiliacions()!=null) {
					i2=0;
					for(TipoAfiliacion tipoafiliacion : catetipoafiliacion.getTipoAfiliacions()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TipoAfiliacionConstantesFunciones.generarExcelReporteDataTipoAfiliacion("RELACIONADO",row,workbook,tipoafiliacion,cellStyleDataAuxHijo);
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
		cell.setCellValue(CateTipoAfiliacionConstantesFunciones.getCateTipoAfiliacionDescripcion(catetipoafiliacion));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessCateTipoAfiliacion() throws Exception {		
		this.startProcessCateTipoAfiliacion(true);
	}
	
	public void startProcessCateTipoAfiliacion(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesCateTipoAfiliacion, this.jScrollPanelDatosCateTipoAfiliacion,this.jPanelPaginacionCateTipoAfiliacion, this.jScrollPanelDatosEdicionCateTipoAfiliacion, this.jPanelAccionesCateTipoAfiliacion,this.jPanelAccionesFormularioCateTipoAfiliacion,this.jmenuBarCateTipoAfiliacion,this.jmenuBarDetalleCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,this.jTtoolBarDetalleCateTipoAfiliacion);		
		
		final JTabbedPane jTabbedPaneBusquedasCateTipoAfiliacion=null; 
		
		final JPanel jPanelParametrosReportesCateTipoAfiliacion=this.jPanelParametrosReportesCateTipoAfiliacion;
		//final JScrollPane jScrollPanelDatosCateTipoAfiliacion=this.jScrollPanelDatosCateTipoAfiliacion;
		final JTable jTableDatosCateTipoAfiliacion=this.jTableDatosCateTipoAfiliacion;		
		final JPanel jPanelPaginacionCateTipoAfiliacion=this.jPanelPaginacionCateTipoAfiliacion;
		//final JScrollPane jScrollPanelDatosEdicionCateTipoAfiliacion=this.jScrollPanelDatosEdicionCateTipoAfiliacion;
		final JPanel jPanelAccionesCateTipoAfiliacion=this.jPanelAccionesCateTipoAfiliacion;
		
		JPanel jPanelCamposAuxiliarCateTipoAfiliacion=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarCateTipoAfiliacion=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			jPanelCamposAuxiliarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jPanelCamposCateTipoAfiliacion;
			jPanelAccionesFormularioAuxiliarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jPanelAccionesFormularioCateTipoAfiliacion;
		}
		
		final JPanel jPanelCamposCateTipoAfiliacion=jPanelCamposAuxiliarCateTipoAfiliacion;
		final JPanel jPanelAccionesFormularioCateTipoAfiliacion=jPanelAccionesFormularioAuxiliarCateTipoAfiliacion;
		
		
		final JMenuBar jmenuBarCateTipoAfiliacion=this.jmenuBarCateTipoAfiliacion;
		final JToolBar jTtoolBarCateTipoAfiliacion=this.jTtoolBarCateTipoAfiliacion;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarCateTipoAfiliacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCateTipoAfiliacion=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			jmenuBarDetalleAuxiliarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jmenuBarDetalleCateTipoAfiliacion;
			jTtoolBarDetalleAuxiliarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jTtoolBarDetalleCateTipoAfiliacion;
		}
		
		final JMenuBar jmenuBarDetalleCateTipoAfiliacion=jmenuBarDetalleAuxiliarCateTipoAfiliacion;
		final JToolBar jTtoolBarDetalleCateTipoAfiliacion=jTtoolBarDetalleAuxiliarCateTipoAfiliacion;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCateTipoAfiliacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCateTipoAfiliacion;
			processRunnable.jTableDatos=jTableDatosCateTipoAfiliacion;
			processRunnable.jPanelCampos=jPanelCamposCateTipoAfiliacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionCateTipoAfiliacion;
			processRunnable.jPanelAcciones=jPanelAccionesCateTipoAfiliacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCateTipoAfiliacion;
			
			
			processRunnable.jmenuBar=jmenuBarCateTipoAfiliacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCateTipoAfiliacion;
			processRunnable.jTtoolBar=jTtoolBarCateTipoAfiliacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCateTipoAfiliacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasCateTipoAfiliacion ,jPanelParametrosReportesCateTipoAfiliacion,jTableDatosCateTipoAfiliacion, /*jScrollPanelDatosCateTipoAfiliacion,*/jPanelCamposCateTipoAfiliacion,jPanelPaginacionCateTipoAfiliacion, /*jScrollPanelDatosEdicionCateTipoAfiliacion,*/ jPanelAccionesCateTipoAfiliacion,jPanelAccionesFormularioCateTipoAfiliacion,jmenuBarCateTipoAfiliacion,jmenuBarDetalleCateTipoAfiliacion,jTtoolBarCateTipoAfiliacion,jTtoolBarDetalleCateTipoAfiliacion);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesCateTipoAfiliacion, jScrollPanelDatosCateTipoAfiliacion,jPanelPaginacionCateTipoAfiliacion, jScrollPanelDatosEdicionCateTipoAfiliacion, jPanelAccionesCateTipoAfiliacion,jPanelAccionesFormularioCateTipoAfiliacion,jmenuBarCateTipoAfiliacion,jmenuBarDetalleCateTipoAfiliacion,jTtoolBarCateTipoAfiliacion,jTtoolBarDetalleCateTipoAfiliacion);
						
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
	
	public void finishProcessCateTipoAfiliacion() {// throws Exception 
		this.finishProcessCateTipoAfiliacion(true);
	}
	
	public void finishProcessCateTipoAfiliacion(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesCateTipoAfiliacion, this.jScrollPanelDatosCateTipoAfiliacion,this.jPanelPaginacionCateTipoAfiliacion, this.jScrollPanelDatosEdicionCateTipoAfiliacion, this.jPanelAccionesCateTipoAfiliacion,this.jPanelAccionesFormularioCateTipoAfiliacion,this.jmenuBarCateTipoAfiliacion,this.jmenuBarDetalleCateTipoAfiliacion,this.jTtoolBarCateTipoAfiliacion,this.jTtoolBarDetalleCateTipoAfiliacion);		
		
		final JTabbedPane jTabbedPaneBusquedasCateTipoAfiliacion=null; 
		
		final JPanel jPanelParametrosReportesCateTipoAfiliacion=this.jPanelParametrosReportesCateTipoAfiliacion;
		//final JScrollPane jScrollPanelDatosCateTipoAfiliacion=this.jScrollPanelDatosCateTipoAfiliacion;
		final JTable jTableDatosCateTipoAfiliacion=this.jTableDatosCateTipoAfiliacion;		
		final JPanel jPanelPaginacionCateTipoAfiliacion=this.jPanelPaginacionCateTipoAfiliacion;
		//final JScrollPane jScrollPanelDatosEdicionCateTipoAfiliacion=this.jScrollPanelDatosEdicionCateTipoAfiliacion;
		final JPanel jPanelAccionesCateTipoAfiliacion=this.jPanelAccionesCateTipoAfiliacion;
		
		JPanel jPanelCamposAuxiliarCateTipoAfiliacion=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarCateTipoAfiliacion=new JPanel();
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			jPanelCamposAuxiliarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jPanelCamposCateTipoAfiliacion;
			jPanelAccionesFormularioAuxiliarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jPanelAccionesFormularioCateTipoAfiliacion;
		}
		
		final JPanel jPanelCamposCateTipoAfiliacion=jPanelCamposAuxiliarCateTipoAfiliacion;
		final JPanel jPanelAccionesFormularioCateTipoAfiliacion=jPanelAccionesFormularioAuxiliarCateTipoAfiliacion;
		
		
		final JMenuBar jmenuBarCateTipoAfiliacion=this.jmenuBarCateTipoAfiliacion;		
		final JToolBar jTtoolBarCateTipoAfiliacion=this.jTtoolBarCateTipoAfiliacion;
				
		JMenuBar jmenuBarDetalleAuxiliarCateTipoAfiliacion=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarCateTipoAfiliacion=new JToolBar();
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			jmenuBarDetalleAuxiliarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jmenuBarDetalleCateTipoAfiliacion;
			jTtoolBarDetalleAuxiliarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jTtoolBarDetalleCateTipoAfiliacion;		
		}
		
		final JMenuBar jmenuBarDetalleCateTipoAfiliacion=jmenuBarDetalleAuxiliarCateTipoAfiliacion;
		final JToolBar jTtoolBarDetalleCateTipoAfiliacion=jTtoolBarDetalleAuxiliarCateTipoAfiliacion;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasCateTipoAfiliacion;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesCateTipoAfiliacion;
			processRunnable.jTableDatos=jTableDatosCateTipoAfiliacion;
			processRunnable.jPanelCampos=jPanelCamposCateTipoAfiliacion;
			processRunnable.jPanelPaginacion=jPanelPaginacionCateTipoAfiliacion;
			processRunnable.jPanelAcciones=jPanelAccionesCateTipoAfiliacion;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioCateTipoAfiliacion;
			
			
			processRunnable.jmenuBar=jmenuBarCateTipoAfiliacion;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleCateTipoAfiliacion;
			processRunnable.jTtoolBar=jTtoolBarCateTipoAfiliacion;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleCateTipoAfiliacion;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasCateTipoAfiliacion ,jPanelParametrosReportesCateTipoAfiliacion, jTableDatosCateTipoAfiliacion,/*jScrollPanelDatosCateTipoAfiliacion,*/jPanelCamposCateTipoAfiliacion,jPanelPaginacionCateTipoAfiliacion, /*jScrollPanelDatosEdicionCateTipoAfiliacion,*/ jPanelAccionesCateTipoAfiliacion,jPanelAccionesFormularioCateTipoAfiliacion,jmenuBarCateTipoAfiliacion,jmenuBarDetalleCateTipoAfiliacion,jTtoolBarCateTipoAfiliacion,jTtoolBarDetalleCateTipoAfiliacion));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesCateTipoAfiliacion(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarCateTipoAfiliacion(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuCateTipoAfiliacion(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarCateTipoAfiliacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarCateTipoAfiliacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleCateTipoAfiliacion,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuCateTipoAfiliacion(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarCateTipoAfiliacion,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleCateTipoAfiliacion,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.catetipoafiliacionConstantesFunciones.getsFinalQueryCateTipoAfiliacion();
		String  finalQueryPaginacionTodos=this.catetipoafiliacionConstantesFunciones.getsFinalQueryCateTipoAfiliacion();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=CateTipoAfiliacionConstantesFunciones.getArrayColumnasGlobalesNoCateTipoAfiliacion(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=CateTipoAfiliacionConstantesFunciones.getArrayColumnasGlobalesCateTipoAfiliacion(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,CateTipoAfiliacionConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.catetipoafiliacionsEliminados= new ArrayList<CateTipoAfiliacion>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessCateTipoAfiliacion();
		
				///*CateTipoAfiliacionSessionBean*/this.catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
			
			if(this.catetipoafiliacionSessionBean==null) {
				this.catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
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
					this.iNumeroPaginacion=CateTipoAfiliacionConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=CateTipoAfiliacionConstantesFunciones.getClassesForeignKeysOfCateTipoAfiliacion(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/catetipoafiliacion."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			catetipoafiliacionsAux= new ArrayList<CateTipoAfiliacion>();
			
				
			catetipoafiliacionLogic.setDatosCliente(this.datosCliente);
			catetipoafiliacionLogic.setDatosDeep(this.datosDeep);
			catetipoafiliacionLogic.setIsConDeep(true);
			
			
			catetipoafiliacionLogic.getCateTipoAfiliacionDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					catetipoafiliacionLogic.getTodosCateTipoAfiliacions(finalQueryGlobal,pagination);
					
					//catetipoafiliacionLogic.getTodosCateTipoAfiliacionsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(catetipoafiliacionLogic.getCateTipoAfiliacions()==null|| catetipoafiliacionLogic.getCateTipoAfiliacions().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							catetipoafiliacionsAux= new ArrayList<CateTipoAfiliacion>();
							catetipoafiliacionsAux.addAll(catetipoafiliacionLogic.getCateTipoAfiliacions());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							catetipoafiliacionsAux= new ArrayList<CateTipoAfiliacion>();
							catetipoafiliacionsAux.addAll(catetipoafiliacions);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							catetipoafiliacionLogic.getTodosCateTipoAfiliacions(finalQueryGlobal+"",this.pagination);												
							
							//catetipoafiliacionLogic.getTodosCateTipoAfiliacionsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteCateTipoAfiliacions("Todos",catetipoafiliacionLogic.getCateTipoAfiliacions() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							catetipoafiliacionLogic.setCateTipoAfiliacions(new ArrayList<CateTipoAfiliacion>());					
							catetipoafiliacionLogic.getCateTipoAfiliacions().addAll(catetipoafiliacionsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							catetipoafiliacions=new ArrayList<CateTipoAfiliacion>();
							catetipoafiliacions.addAll(catetipoafiliacionsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idCateTipoAfiliacion=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idCateTipoAfiliacion=this.idActual;
				
				} else if(this.idCateTipoAfiliacionActual!=null && this.idCateTipoAfiliacionActual!=0L) {
					idCateTipoAfiliacion=idCateTipoAfiliacionActual;
				}
				
					
				this.sDetalleReporte=CateTipoAfiliacionConstantesFunciones.getDetalleIndicePorId(idCateTipoAfiliacion);
				
				this.catetipoafiliacions=new ArrayList<CateTipoAfiliacion>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					catetipoafiliacionLogic.getEntity(idCateTipoAfiliacion);
					
					//catetipoafiliacionLogic.getEntityWithConnection(idCateTipoAfiliacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					catetipoafiliacionLogic.setCateTipoAfiliacions(new ArrayList<CateTipoAfiliacion>());
					catetipoafiliacionLogic.getCateTipoAfiliacions().add(catetipoafiliacionLogic.getCateTipoAfiliacion());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.catetipoafiliacions=new ArrayList<CateTipoAfiliacion>();
					this.catetipoafiliacions.add(catetipoafiliacion);
				}
				
				if(catetipoafiliacionLogic.getCateTipoAfiliacion()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesCateTipoAfiliacion();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessCateTipoAfiliacion();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=catetipoafiliacionLogic.getCateTipoAfiliacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=catetipoafiliacions.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=catetipoafiliacionLogic.getCateTipoAfiliacions().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=catetipoafiliacions.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(CateTipoAfiliacion catetipoafiliacion) {
		Boolean permite=true;
		
		if(this.catetipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=CateTipoAfiliacionConstantesFunciones.getOrderByListaCateTipoAfiliacion();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=CateTipoAfiliacionConstantesFunciones.getOrderByListaCateTipoAfiliacion();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CateTipoAfiliacion catetipoafiliacion:catetipoafiliacionLogic.getCateTipoAfiliacions()) {
				if(catetipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
					catetipoafiliacionTotales=catetipoafiliacion;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CateTipoAfiliacion catetipoafiliacion:this.catetipoafiliacions) {
				if(catetipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
					catetipoafiliacionTotales=catetipoafiliacion;
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
			this.catetipoafiliacionAux=new CateTipoAfiliacion();
			this.catetipoafiliacionAux.setsType(Constantes2.S_TOTALES);
			this.catetipoafiliacionAux.setIsNew(false);
			this.catetipoafiliacionAux.setIsChanged(false);
			this.catetipoafiliacionAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				CateTipoAfiliacionConstantesFunciones.TotalizarValoresFilaCateTipoAfiliacion(this.catetipoafiliacionLogic.getCateTipoAfiliacions(),this.catetipoafiliacionAux);
				
				this.catetipoafiliacionLogic.getCateTipoAfiliacions().add(this.catetipoafiliacionAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				CateTipoAfiliacionConstantesFunciones.TotalizarValoresFilaCateTipoAfiliacion(this.catetipoafiliacions,this.catetipoafiliacionAux);
				
				this.catetipoafiliacions.add(this.catetipoafiliacionAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		catetipoafiliacionTotales=new CateTipoAfiliacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.catetipoafiliacionLogic.getCateTipoAfiliacions().remove(catetipoafiliacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.catetipoafiliacions.remove(catetipoafiliacionTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		catetipoafiliacionTotales=new CateTipoAfiliacion();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(CateTipoAfiliacion catetipoafiliacion:catetipoafiliacionLogic.getCateTipoAfiliacions()) {
				if(catetipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
					catetipoafiliacionTotales=catetipoafiliacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CateTipoAfiliacionConstantesFunciones.TotalizarValoresFilaCateTipoAfiliacion(this.catetipoafiliacionLogic.getCateTipoAfiliacions(),catetipoafiliacionTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(CateTipoAfiliacion catetipoafiliacion:this.catetipoafiliacions) {
				if(catetipoafiliacion.getsType().equals(Constantes2.S_TOTALES)) {
					catetipoafiliacionTotales=catetipoafiliacion;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				CateTipoAfiliacionConstantesFunciones.TotalizarValoresFilaCateTipoAfiliacion(this.catetipoafiliacions,catetipoafiliacionTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosCateTipoAfiliacion() {
		this.isPermisoTodoCateTipoAfiliacion=false;
		this.isPermisoNuevoCateTipoAfiliacion=false;
		this.isPermisoActualizarCateTipoAfiliacion=false;
		this.isPermisoActualizarOriginalCateTipoAfiliacion=false;
		this.isPermisoEliminarCateTipoAfiliacion=false;
		this.isPermisoGuardarCambiosCateTipoAfiliacion=false;
		this.isPermisoConsultaCateTipoAfiliacion=false;
		this.isPermisoBusquedaCateTipoAfiliacion=false;
		this.isPermisoReporteCateTipoAfiliacion=false;		
		this.isPermisoOrdenCateTipoAfiliacion=false;		
		this.isPermisoPaginacionMedioCateTipoAfiliacion=false;		
		this.isPermisoPaginacionAltoCateTipoAfiliacion=false;
		this.isPermisoPaginacionTodoCateTipoAfiliacion=false;
		this.isPermisoCopiarCateTipoAfiliacion=false;		
		this.isPermisoVerFormCateTipoAfiliacion=false;		
		this.isPermisoDuplicarCateTipoAfiliacion=false;		
		this.isPermisoOrdenCateTipoAfiliacion=false;		
	}
	
	public void setPermisosUsuarioCateTipoAfiliacion(Boolean isPermiso) {
		this.isPermisoTodoCateTipoAfiliacion=isPermiso;
		this.isPermisoNuevoCateTipoAfiliacion=isPermiso;
		this.isPermisoActualizarCateTipoAfiliacion=isPermiso;
		this.isPermisoActualizarOriginalCateTipoAfiliacion=isPermiso;
		this.isPermisoEliminarCateTipoAfiliacion=isPermiso;
		this.isPermisoGuardarCambiosCateTipoAfiliacion=isPermiso;
		this.isPermisoConsultaCateTipoAfiliacion=isPermiso;
		this.isPermisoBusquedaCateTipoAfiliacion=isPermiso;
		this.isPermisoReporteCateTipoAfiliacion=isPermiso;
		this.isPermisoOrdenCateTipoAfiliacion=isPermiso;		
		this.isPermisoPaginacionMedioCateTipoAfiliacion=isPermiso;		
		this.isPermisoPaginacionAltoCateTipoAfiliacion=isPermiso;		
		this.isPermisoPaginacionTodoCateTipoAfiliacion=isPermiso;		
		this.isPermisoCopiarCateTipoAfiliacion=isPermiso;		
		this.isPermisoVerFormCateTipoAfiliacion=isPermiso;		
		this.isPermisoDuplicarCateTipoAfiliacion=isPermiso;
		this.isPermisoOrdenCateTipoAfiliacion=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioCateTipoAfiliacion(Boolean isPermiso) {
		//this.isPermisoTodoCateTipoAfiliacion=isPermiso;
		this.isPermisoNuevoCateTipoAfiliacion=isPermiso;
		this.isPermisoActualizarCateTipoAfiliacion=isPermiso;
		this.isPermisoActualizarOriginalCateTipoAfiliacion=isPermiso;
		this.isPermisoEliminarCateTipoAfiliacion=isPermiso;
		this.isPermisoGuardarCambiosCateTipoAfiliacion=isPermiso;
		//this.isPermisoConsultaCateTipoAfiliacion=isPermiso;
		//this.isPermisoBusquedaCateTipoAfiliacion=isPermiso;
		//this.isPermisoReporteCateTipoAfiliacion=isPermiso;
		//this.isPermisoOrdenCateTipoAfiliacion=isPermiso;		
		//this.isPermisoPaginacionMedioCateTipoAfiliacion=isPermiso;		
		//this.isPermisoPaginacionAltoCateTipoAfiliacion=isPermiso;		
		//this.isPermisoPaginacionTodoCateTipoAfiliacion=isPermiso;		
		//this.isPermisoCopiarCateTipoAfiliacion=isPermiso;		
		//this.isPermisoDuplicarCateTipoAfiliacion=isPermiso;
		//this.isPermisoOrdenCateTipoAfiliacion=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioCateTipoAfiliacionClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(TipoAfiliacionConstantesFunciones.SNOMBREOPCION);
		
		if(CateTipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosCliente=false;
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionCateTipoAfiliacionClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosTipoAfiliacion=false;
		this.isTienePermisosTipoAfiliacion=this.verificarGetPermisosUsuarioOpcionCateTipoAfiliacionClaseRelacionada(this.opcionsRelacionadas,TipoAfiliacionConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebCateTipoAfiliacion(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioCateTipoAfiliacionClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosTipoAfiliacion=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioCateTipoAfiliacionClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionCateTipoAfiliacionClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioCateTipoAfiliacionClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormCateTipoAfiliacion!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.remove(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosTipoAfiliacion && this.jInternalFrameDetalleFormCateTipoAfiliacion!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.remove(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioCateTipoAfiliacion() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(CateTipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, CateTipoAfiliacionConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoCateTipoAfiliacion=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarCateTipoAfiliacion=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalCateTipoAfiliacion=this.isPermisoActualizarCateTipoAfiliacion;
			this.isPermisoEliminarCateTipoAfiliacion=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosCateTipoAfiliacion=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaCateTipoAfiliacion=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaCateTipoAfiliacion=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoCateTipoAfiliacion=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteCateTipoAfiliacion=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCateTipoAfiliacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioCateTipoAfiliacion=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoCateTipoAfiliacion=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoCateTipoAfiliacion=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarCateTipoAfiliacion=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormCateTipoAfiliacion=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarCateTipoAfiliacion=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenCateTipoAfiliacion=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosCateTipoAfiliacion.setToolTipText(this.jTableDatosCateTipoAfiliacion.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioCateTipoAfiliacion(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioCateTipoAfiliacion(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(CateTipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(CateTipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioCateTipoAfiliacion() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.catetipoafiliacionConstantesFunciones.mostrarClienteCateTipoAfiliacion && !CateTipoAfiliacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosTipoAfiliacion && this.catetipoafiliacionConstantesFunciones.mostrarTipoAfiliacionCateTipoAfiliacion && !CateTipoAfiliacionConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tipo Afiliacion");
			reporte.setsDescripcion("Tipo Afiliacion");
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
	
		
	public void inicializarCombosForeignKeyCateTipoAfiliacionListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyCateTipoAfiliacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(CateTipoAfiliacionJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyCateTipoAfiliacionListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyCateTipoAfiliacionListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyCateTipoAfiliacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyCateTipoAfiliacion()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyCateTipoAfiliacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyCateTipoAfiliacion()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyCateTipoAfiliacion();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyCateTipoAfiliacion()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyCateTipoAfiliacion()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyCateTipoAfiliacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyCateTipoAfiliacion()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroCateTipoAfiliacion()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyCateTipoAfiliacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyCateTipoAfiliacion(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyCateTipoAfiliacion()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public CateTipoAfiliacionBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public CateTipoAfiliacionBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public CateTipoAfiliacionBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean(); 
		this.catetipoafiliacionConstantesFunciones=new CateTipoAfiliacionConstantesFunciones(); 
		this.catetipoafiliacionBean=new CateTipoAfiliacion();//(this.catetipoafiliacionConstantesFunciones); 		
		this.catetipoafiliacionReturnGeneral=new CateTipoAfiliacionParameterReturnGeneral(); 
		
		this.catetipoafiliacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.catetipoafiliacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public CateTipoAfiliacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public CateTipoAfiliacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public CateTipoAfiliacionBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessCateTipoAfiliacion(true);
			
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
			
			this.catetipoafiliacionConstantesFunciones=new CateTipoAfiliacionConstantesFunciones(); 
			this.catetipoafiliacionBean=new CateTipoAfiliacion();//this.catetipoafiliacionConstantesFunciones); 			
			this.catetipoafiliacionReturnGeneral=new CateTipoAfiliacionParameterReturnGeneral(); 
		
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Cate Tipo Afiliacion Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.catetipoafiliacion=new CateTipoAfiliacion();
			this.catetipoafiliacions = new ArrayList<CateTipoAfiliacion>();
			this.catetipoafiliacionsAux = new ArrayList<CateTipoAfiliacion>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic=new CateTipoAfiliacionLogic();
				this.catetipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			//this.catetipoafiliacionSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.catetipoafiliacionSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormCateTipoAfiliacion);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCateTipoAfiliacion);	
					}
					
					if(this.jInternalFrameImportacionCateTipoAfiliacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCateTipoAfiliacion);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByCateTipoAfiliacion!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByCateTipoAfiliacion);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormCateTipoAfiliacion);
				this.jInternalFrameDetalleFormCateTipoAfiliacion.setVisible(false);
				this.jInternalFrameDetalleFormCateTipoAfiliacion.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCateTipoAfiliacion);
					this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setVisible(false);
					this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionCateTipoAfiliacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionCateTipoAfiliacion);
					this.jInternalFrameImportacionCateTipoAfiliacion.setVisible(false);
					this.jInternalFrameImportacionCateTipoAfiliacion.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByCateTipoAfiliacion!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByCateTipoAfiliacion);
					this.jInternalFrameOrderByCateTipoAfiliacion.setVisible(false);
					this.jInternalFrameOrderByCateTipoAfiliacion.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idCateTipoAfiliacionActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=CateTipoAfiliacionConstantesFunciones.INUMEROPAGINACION;
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
			
			this.catetipoafiliacionReturnGeneral=new CateTipoAfiliacionParameterReturnGeneral();
			
			this.catetipoafiliacionParameterGeneral=new CateTipoAfiliacionParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.catetipoafiliacionLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
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
			
			if(CateTipoAfiliacionJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(TipoAfiliacionConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CateTipoAfiliacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.catetipoafiliacionSessionBean.getEsGuardarRelacionado(),this.catetipoafiliacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,CateTipoAfiliacionConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.catetipoafiliacionSessionBean.getEsGuardarRelacionado(),this.catetipoafiliacionSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=false;
			this.isVisibilidadCeldaDuplicarCateTipoAfiliacion=true;
			this.isVisibilidadCeldaCopiarCateTipoAfiliacion=true;
			this.isVisibilidadCeldaVerFormCateTipoAfiliacion=true;
			this.isVisibilidadCeldaOrdenCateTipoAfiliacion=true;
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosCateTipoAfiliacion();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioCateTipoAfiliacion(false);
			
			this.setPermisosUsuarioCateTipoAfiliacion();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado() 
				|| (this.catetipoafiliacionSessionBean.getEsGuardarRelacionado() && this.catetipoafiliacionSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioCateTipoAfiliacionClasesRelacionadas();
			}
			
			if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioCateTipoAfiliacionClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosCateTipoAfiliacion();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualCateTipoAfiliacion();
			}
			
			if(!this.isPermisoBusquedaCateTipoAfiliacion) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioCateTipoAfiliacion,this.isPermisoPaginacionMedioCateTipoAfiliacion,this.isPermisoPaginacionTodoCateTipoAfiliacion);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(CateTipoAfiliacionConstantesFunciones.getTiposSeleccionarCateTipoAfiliacion());
				
				this.tiposColumnasSelect=CateTipoAfiliacionConstantesFunciones.getTiposSeleccionarCateTipoAfiliacion(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectCateTipoAfiliacion();				
				//this.tiposRelacionesSelect=CateTipoAfiliacionConstantesFunciones.getTiposRelacionesCateTipoAfiliacion(true);
				
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
			//if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioCateTipoAfiliacion();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioCateTipoAfiliacion(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioCateTipoAfiliacion(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesCateTipoAfiliacion() ;
			
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
			
			
			this.clienteLogic=new ClienteLogic();
			this.tipoafiliacionLogic=new TipoAfiliacionLogic(); 
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
				catetipoafiliacionImplementable= (CateTipoAfiliacionImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CateTipoAfiliacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				catetipoafiliacionImplementableHome= (CateTipoAfiliacionImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+CateTipoAfiliacionConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.catetipoafiliacions= new ArrayList<CateTipoAfiliacion>();
			this.catetipoafiliacionsEliminados= new ArrayList<CateTipoAfiliacion>();
						
			this.isEsNuevoCateTipoAfiliacion=false;
			this.esParaAccionDesdeFormularioCateTipoAfiliacion=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyCateTipoAfiliacion(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroCateTipoAfiliacion();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=CateTipoAfiliacionConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingCateTipoAfiliacion(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioCateTipoAfiliacion();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioCateTipoAfiliacion();
			}
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessCateTipoAfiliacion(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga CateTipoAfiliacion: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectCateTipoAfiliacion() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesCateTipoAfiliacion")) {
				iIndex=this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCateTipoAfiliacion();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Tipo Afiliaciones")) {
					if(!TipoAfiliacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessCateTipoAfiliacion();

						this.cargarParteTabPanelRelacionadaTipoAfiliacion(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessCateTipoAfiliacion();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCateTipoAfiliacion.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesCateTipoAfiliacion.updateUI();
		//this.jTabbedPaneRelacionesCateTipoAfiliacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCateTipoAfiliacion.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTipoAfiliacion(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormCateTipoAfiliacion.cargarSessionConBeanSwingJInternalFrameTipoAfiliacion(false,true,iIndex);
		this.jButtonTipoAfiliacionActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTipoAfiliacion();

		//this.jTabbedPaneRelacionesCateTipoAfiliacion.updateUI();
		//this.jTabbedPaneRelacionesCateTipoAfiliacion.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesCateTipoAfiliacion.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosCateTipoAfiliacion.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("TipoAfiliacion")) {
				int row=this.jTableDatosCateTipoAfiliacion.getSelectedRow();
				jButtonTipoAfiliacionActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.catetipoafiliacionConstantesFunciones.mostrarClienteCateTipoAfiliacion && !CateTipoAfiliacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(catetipoafiliacionConstantesFunciones.resaltarClienteCateTipoAfiliacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(catetipoafiliacionConstantesFunciones.resaltarClienteCateTipoAfiliacion);
						}

						jmenuItem.setEnabled(this.catetipoafiliacionConstantesFunciones.activarClienteCateTipoAfiliacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormCateTipoAfiliacion.jmenuDetalleCateTipoAfiliacion.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Tipo Afiliacion")) {

					if(this.isTienePermisosTipoAfiliacion && this.catetipoafiliacionConstantesFunciones.mostrarTipoAfiliacionCateTipoAfiliacion && !CateTipoAfiliacionConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tipo Afiliaciones"+"("+TipoAfiliacionConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tipo Afiliaciones");

						if(catetipoafiliacionConstantesFunciones.resaltarTipoAfiliacionCateTipoAfiliacion!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(catetipoafiliacionConstantesFunciones.resaltarTipoAfiliacionCateTipoAfiliacion);
						}

						jmenuItem.setEnabled(this.catetipoafiliacionConstantesFunciones.activarTipoAfiliacionCateTipoAfiliacion);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TipoAfiliacion"));

						

						this.jInternalFrameDetalleFormCateTipoAfiliacion.jmenuDetalleCateTipoAfiliacion.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyCateTipoAfiliacion(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyCateTipoAfiliacion(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyCateTipoAfiliacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyCateTipoAfiliacionListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyCateTipoAfiliacion();
		
		this.cargarCombosFrameForeignKeyCateTipoAfiliacion();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyCateTipoAfiliacion();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyCateTipoAfiliacion();
		}
	}
	
	
	
	public void jButtonNuevoCateTipoAfiliacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
			
			if(jTableDatosCateTipoAfiliacion.getRowCount()>=1) {
				jTableDatosCateTipoAfiliacion.removeRowSelectionInterval(0, jTableDatosCateTipoAfiliacion.getRowCount()-1);						
			}
			
			this.isEsNuevoCateTipoAfiliacion=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoCateTipoAfiliacion(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesCateTipoAfiliacion(true);			
			//this.catetipoafiliacion=new CateTipoAfiliacion();
			//this.catetipoafiliacion.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCateTipoAfiliacion(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCateTipoAfiliacion() ;
			
			if(CateTipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCateTipoAfiliacion(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.catetipoafiliacion);	
			this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);				
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
			if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar CateTipoAfiliacion: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarCateTipoAfiliacionActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosCateTipoAfiliacion.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosCateTipoAfiliacion.getSelectedRows().length;			
			}
			
			catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoCateTipoAfiliacion--;			
				//CateTipoAfiliacion catetipoafiliacionAux= new CateTipoAfiliacion();			
				//catetipoafiliacionAux.setId(this.iIdNuevoCateTipoAfiliacion);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//CateTipoAfiliacion catetipoafiliacionOrigen=new CateTipoAfiliacion();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(CateTipoAfiliacion catetipoafiliacionOrigen : catetipoafiliacionsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							catetipoafiliacionOrigen =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							catetipoafiliacionOrigen =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaCateTipoAfiliacion();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.catetipoafiliacion.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosCateTipoAfiliacion(catetipoafiliacionOrigen,this.catetipoafiliacion,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.catetipoafiliacionLogic.getCateTipoAfiliacions().add(this.catetipoafiliacionAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.catetipoafiliacions.add(this.catetipoafiliacionAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
				
				this.jTableDatosCateTipoAfiliacion.setRowSelectionInterval(this.getIndiceNuevoCateTipoAfiliacion(), this.getIndiceNuevoCateTipoAfiliacion());
				
				int iLastRow =  this.jTableDatosCateTipoAfiliacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCateTipoAfiliacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCateTipoAfiliacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();									
		
			CateTipoAfiliacion catetipoafiliacionOrigen=new CateTipoAfiliacion();
			CateTipoAfiliacion catetipoafiliacionDestino=new CateTipoAfiliacion();
				
			catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosCateTipoAfiliacion.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || catetipoafiliacionsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosCateTipoAfiliacion.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						catetipoafiliacionOrigen =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						catetipoafiliacionOrigen =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						catetipoafiliacionDestino =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						catetipoafiliacionDestino =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				catetipoafiliacionOrigen =catetipoafiliacionsSeleccionados.get(0);
				catetipoafiliacionDestino =catetipoafiliacionsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosCateTipoAfiliacion(catetipoafiliacionOrigen,catetipoafiliacionDestino,true,false);
				
				catetipoafiliacionDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(catetipoafiliacionDestino,catetipoafiliacionLogic.getCateTipoAfiliacions());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(catetipoafiliacionDestino,catetipoafiliacions);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
				
				//this.jTableDatosCateTipoAfiliacion.setRowSelectionInterval(this.getIndiceNuevoCateTipoAfiliacion(), this.getIndiceNuevoCateTipoAfiliacion());
				
				int iLastRow =  this.jTableDatosCateTipoAfiliacion.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosCateTipoAfiliacion.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosCateTipoAfiliacion.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormCateTipoAfiliacion.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesCateTipoAfiliacion.isVisible();
			
			
			this.jPanelParametrosReportesCateTipoAfiliacion.setVisible(!isVisible);
			this.jPanelPaginacionCateTipoAfiliacion.setVisible(!isVisible);
			this.jPanelAccionesCateTipoAfiliacion.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameCateTipoAfiliacion();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoCateTipoAfiliacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionCateTipoAfiliacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByCateTipoAfiliacion();
			
			this.abrirFrameOrderByCateTipoAfiliacion();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByCateTipoAfiliacion();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleCateTipoAfiliacion(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormCateTipoAfiliacion);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormCateTipoAfiliacion.isMaximum()) {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormCateTipoAfiliacion.setSize(this.jInternalFrameDetalleFormCateTipoAfiliacion.iWidthFormulario,this.jInternalFrameDetalleFormCateTipoAfiliacion.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormCateTipoAfiliacion.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormCateTipoAfiliacion.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormCateTipoAfiliacion.isMaximum()) {
						this.jInternalFrameDetalleFormCateTipoAfiliacion.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormCateTipoAfiliacion.jContentPaneDetalleCateTipoAfiliacion.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormCateTipoAfiliacion.jContentPaneDetalleCateTipoAfiliacion.getWidth(),CateTipoAfiliacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormCateTipoAfiliacion.jContentPaneDetalleCateTipoAfiliacion.getWidth(),CateTipoAfiliacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormCateTipoAfiliacion.jContentPaneDetalleCateTipoAfiliacion.getWidth(),CateTipoAfiliacionConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(TipoAfiliacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTipoAfiliacion();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormCateTipoAfiliacion.setVisible(true);
	        this.jInternalFrameDetalleFormCateTipoAfiliacion.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByCateTipoAfiliacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByCateTipoAfiliacion==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByCateTipoAfiliacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCateTipoAfiliacion,false,this);
				} else {
					this.jInternalFrameOrderByCateTipoAfiliacion=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByCateTipoAfiliacion,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByCateTipoAfiliacion);
				this.jInternalFrameOrderByCateTipoAfiliacion.setVisible(false);
				this.jInternalFrameOrderByCateTipoAfiliacion.setSelected(false);
				
				this.jInternalFrameOrderByCateTipoAfiliacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCateTipoAfiliacion"));
				
				this.inicializarActualizarBindingTablaOrderByCateTipoAfiliacion();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionCateTipoAfiliacion() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionCateTipoAfiliacion==null) {
				
				this.jInternalFrameImportacionCateTipoAfiliacion=new ImportacionJInternalFrame(CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionCateTipoAfiliacion);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionCateTipoAfiliacion);
				this.jInternalFrameImportacionCateTipoAfiliacion.setVisible(false);
				this.jInternalFrameImportacionCateTipoAfiliacion.setSelected(false);


				this.jInternalFrameImportacionCateTipoAfiliacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCateTipoAfiliacion"));
				this.jInternalFrameImportacionCateTipoAfiliacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCateTipoAfiliacion"));
				this.jInternalFrameImportacionCateTipoAfiliacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCateTipoAfiliacion"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoCateTipoAfiliacion() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion==null) {
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion=new ReporteDinamicoJInternalFrame(CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoCateTipoAfiliacion);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoCateTipoAfiliacion);
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setVisible(false);
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCateTipoAfiliacion"));
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCateTipoAfiliacion"));
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCateTipoAfiliacion"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCateTipoAfiliacion();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCateTipoAfiliacion.jContentPaneDetalleCateTipoAfiliacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTipoAfiliacion() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jScrollPanelDatosTipoAfiliacion.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormCateTipoAfiliacion.jContentPaneDetalleCateTipoAfiliacion.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jScrollPanelDatosTipoAfiliacion.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jScrollPanelDatosTipoAfiliacion.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.jScrollPanelDatosTipoAfiliacion.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleCateTipoAfiliacion() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormCateTipoAfiliacion);
			
	       	this.jInternalFrameDetalleFormCateTipoAfiliacion.setVisible(false);
	        this.jInternalFrameDetalleFormCateTipoAfiliacion.setSelected(false);
			
			//this.jInternalFrameDetalleFormCateTipoAfiliacion.dispose();
			//this.jInternalFrameDetalleFormCateTipoAfiliacion=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoCateTipoAfiliacion() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setVisible(true);
	        this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionCateTipoAfiliacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionCateTipoAfiliacion.setVisible(true);
	        this.jInternalFrameImportacionCateTipoAfiliacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByCateTipoAfiliacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByCateTipoAfiliacion.setVisible(true);
	        this.jInternalFrameOrderByCateTipoAfiliacion.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByCateTipoAfiliacion() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByCateTipoAfiliacion.setVisible(false);
	        this.jInternalFrameOrderByCateTipoAfiliacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoCateTipoAfiliacion() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setVisible(false);
	        this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionCateTipoAfiliacion() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionCateTipoAfiliacion.setVisible(false);
	        this.jInternalFrameImportacionCateTipoAfiliacion.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarCateTipoAfiliacion(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarCateTipoAfiliacion(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesCateTipoAfiliacion(true);
			//this.isEsNuevoCateTipoAfiliacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCateTipoAfiliacion(false) ;
			
			if(catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.getEsGuardarRelacionado() && TipoAfiliacionJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoAfiliacionActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(CateTipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCateTipoAfiliacion(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCateTipoAfiliacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaCateTipoAfiliacionActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarCateTipoAfiliacion(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesCateTipoAfiliacion(true);
			//this.isEsNuevoCateTipoAfiliacion=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.catetipoafiliacion.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesCateTipoAfiliacion(false) ;
			
			if(CateTipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleCateTipoAfiliacion(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCateTipoAfiliacion(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesCateTipoAfiliacion(false);
			
			//if(!this.isEsNuevoCateTipoAfiliacion) {								
				int intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true);
				this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
				
			}
			
			if(this.permiteMantenimiento(this.catetipoafiliacion)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoCateTipoAfiliacion=true;
					this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
					this.isEsNuevoCateTipoAfiliacion=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoCateTipoAfiliacion=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoCateTipoAfiliacion=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCateTipoAfiliacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCateTipoAfiliacion(false);
				
				this.habilitarDeshabilitarControlesCateTipoAfiliacion(false);
			
												
				
				if(CateTipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleCateTipoAfiliacion();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoCateTipoAfiliacionActionPerformed(evt,catetipoafiliacionSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualCateTipoAfiliacion(this.catetipoafiliacion,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosCateTipoAfiliacion.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,catetipoafiliacionSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.catetipoafiliacion.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				this.catetipoafiliacion.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				this.catetipoafiliacion.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.catetipoafiliacion)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((CateTipoAfiliacionModel) this.jTableDatosCateTipoAfiliacion.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoCateTipoAfiliacion=true;
				this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
				this.isEsNuevoCateTipoAfiliacion=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesCateTipoAfiliacion(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCateTipoAfiliacion(false);
				
				this.habilitarDeshabilitarControlesCateTipoAfiliacion(false);
				
				
				
				if(CateTipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleCateTipoAfiliacion();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosCateTipoAfiliacion.getRowCount()>=1) {
				jTableDatosCateTipoAfiliacion.removeRowSelectionInterval(0, jTableDatosCateTipoAfiliacion.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesCateTipoAfiliacion(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesCateTipoAfiliacion(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualCateTipoAfiliacion(false) ;
			
			this.isEsNuevoCateTipoAfiliacion=false;
			
			if(CateTipoAfiliacionJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleCateTipoAfiliacion();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingCateTipoAfiliacion(false);
				
				//SI ES MANUAL
				if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualCateTipoAfiliacion();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoCateTipoAfiliacion--;			
			//CateTipoAfiliacion catetipoafiliacionAux= new CateTipoAfiliacion();			
			//catetipoafiliacionAux.setId(this.iIdNuevoCateTipoAfiliacion);
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaCateTipoAfiliacion();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
			
			this.catetipoafiliacion.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.catetipoafiliacionLogic.getCateTipoAfiliacions().add(this.catetipoafiliacionAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.catetipoafiliacions.add(this.catetipoafiliacionAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
			
			this.jTableDatosCateTipoAfiliacion.setRowSelectionInterval(this.getIndiceNuevoCateTipoAfiliacion(), this.getIndiceNuevoCateTipoAfiliacion());
			
			int iLastRow =  this.jTableDatosCateTipoAfiliacion.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosCateTipoAfiliacion.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosCateTipoAfiliacion.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingCateTipoAfiliacion(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCateTipoAfiliacion(false);
			
			//SI ES MANUAL
			if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCateTipoAfiliacion();
			}
			
			//this.abrirFrameTreeCateTipoAfiliacion();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Cate Tipo AfiliacionES ?", "MANTENIMIENTO DE Cate Tipo Afiliacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionCateTipoAfiliacion.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralCateTipoAfiliacion();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.catetipoafiliacionReturnGeneral=catetipoafiliacionLogic.procesarImportacionCateTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.catetipoafiliacionParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarCateTipoAfiliacionReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionCateTipoAfiliacion.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionCateTipoAfiliacion.setFileImportacion(this.jInternalFrameImportacionCateTipoAfiliacion.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionCateTipoAfiliacion.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionCateTipoAfiliacion.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionCateTipoAfiliacion.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionCateTipoAfiliacion.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();		

		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("CateTipoAfiliacionBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"CateTipoAfiliacionBaseDesign.jrxml";
			
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
			
			this.generarReporteCateTipoAfiliacions("Todos",catetipoafiliacionsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO:
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
		
		if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoria="es_defecto";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO:
					sNombreCampoCategoriaValor="es_defecto";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO:
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
	
	public void jButtonGenerarExcelReporteDinamicoCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();		
		
		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"catetipoafiliacion";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("CateTipoAfiliacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(CateTipoAfiliacion catetipoafiliacion:catetipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(catetipoafiliacion.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(CateTipoAfiliacion catetipoafiliacion:catetipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(catetipoafiliacion.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO);
					iRow++;

					for(CateTipoAfiliacion catetipoafiliacion:catetipoafiliacionsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(catetipoafiliacion.getes_defecto());
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
			//	this.getFilaCabeceraExportarExcelCateTipoAfiliacion(row);				
			//	iRow++;
			//}				
			
			//for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelCateTipoAfiliacion(catetipoafiliacionAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
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
				this.catetipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCateTipoAfiliacion(false);
			
			//SI ES MANUAL
			if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualCateTipoAfiliacion();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCateTipoAfiliacion(false);
			
			//SI ES MANUAL
			if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCateTipoAfiliacion();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesCateTipoAfiliacionActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingCateTipoAfiliacion(false);
			
			//SI ES MANUAL
			if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualCateTipoAfiliacion();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.catetipoafiliacionLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaCateTipoAfiliacion() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosCateTipoAfiliacion.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosCateTipoAfiliacion.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosCateTipoAfiliacion.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosCateTipoAfiliacion.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosCateTipoAfiliacion.setMinimumSize(dimensionMinimum);
		this.jTableDatosCateTipoAfiliacion.setMaximumSize(dimensionMaximum);
		this.jTableDatosCateTipoAfiliacion.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingCateTipoAfiliacion(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingCateTipoAfiliacion(esInicializar,true);
	}
	
	public void inicializarActualizarBindingCateTipoAfiliacion(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaCateTipoAfiliacion(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesCateTipoAfiliacion(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasCateTipoAfiliacion(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCateTipoAfiliacion(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesCateTipoAfiliacion(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualCateTipoAfiliacion() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaCateTipoAfiliacion();
		
		this.inicializarActualizarBindingBotonesManualCateTipoAfiliacion(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualCateTipoAfiliacion();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesCateTipoAfiliacion() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualCateTipoAfiliacion(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualCateTipoAfiliacion(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosCateTipoAfiliacion.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosCateTipoAfiliacion.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteCateTipoAfiliacion.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxPostAccionNuevoCateTipoAfiliacion.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxPostAccionSinCerrarCateTipoAfiliacion.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxPostAccionSinMensajeCateTipoAfiliacion.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosCateTipoAfiliacion.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosCateTipoAfiliacion.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteCateTipoAfiliacion.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
				this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxPostAccionNuevoCateTipoAfiliacion.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxPostAccionSinCerrarCateTipoAfiliacion.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxPostAccionSinMensajeCateTipoAfiliacion.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionCateTipoAfiliacion.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionCateTipoAfiliacion.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesCateTipoAfiliacion.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesCateTipoAfiliacion.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarCateTipoAfiliacion.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesCateTipoAfiliacion.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesCateTipoAfiliacion.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralCateTipoAfiliacion.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesCateTipoAfiliacion(Boolean esInicializar) throws Exception {
		try	{	
			if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualCateTipoAfiliacion(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesCateTipoAfiliacion() throws Exception {
		try	{
			if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualCateTipoAfiliacion();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCateTipoAfiliacion() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualCateTipoAfiliacion() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesCateTipoAfiliacion.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesCateTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesCateTipoAfiliacion.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesCateTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesCateTipoAfiliacion.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionCateTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionCateTipoAfiliacion.addItem(reporte);
			}
			
			
			if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionCateTipoAfiliacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionCateTipoAfiliacion.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesCateTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesCateTipoAfiliacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesCateTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesCateTipoAfiliacion.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarCateTipoAfiliacion.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarCateTipoAfiliacion.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarCateTipoAfiliacion.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCateTipoAfiliacion();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualCateTipoAfiliacion() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion!=null) {
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion!=null) {
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion!=null) {
				
				if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualCateTipoAfiliacion()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasCateTipoAfiliacion(Boolean esInicializar) throws Exception {				
		if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualCateTipoAfiliacion();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaCateTipoAfiliacion() throws Exception {
		this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByCateTipoAfiliacion() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new CateTipoAfiliacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new CateTipoAfiliacionPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosCateTipoAfiliacionOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCateTipoAfiliacionOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new CateTipoAfiliacionPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new CateTipoAfiliacionPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaCateTipoAfiliacion(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=catetipoafiliacionLogic.getCateTipoAfiliacions().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=catetipoafiliacions.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosCateTipoAfiliacion.setModel(new CateTipoAfiliacionModel(this.catetipoafiliacionLogic.getCateTipoAfiliacions(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosCateTipoAfiliacion.setModel(new CateTipoAfiliacionModel(this.catetipoafiliacions,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByCateTipoAfiliacion!=null && this.jInternalFrameOrderByCateTipoAfiliacion.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByCateTipoAfiliacion();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCateTipoAfiliacion,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new CateTipoAfiliacionPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,catetipoafiliacionConstantesFunciones.resaltarSeleccionarCateTipoAfiliacion,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+CateTipoAfiliacionConstantesFunciones.SCLASSWEBTITULO,catetipoafiliacionConstantesFunciones.resaltarSeleccionarCateTipoAfiliacion,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCateTipoAfiliacion,CateTipoAfiliacionConstantesFunciones.LABEL_ID));

		if(this.catetipoafiliacionConstantesFunciones.mostraridCateTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CateTipoAfiliacionConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.catetipoafiliacionConstantesFunciones.resaltaridCateTipoAfiliacion,this.catetipoafiliacionConstantesFunciones.activaridCateTipoAfiliacion,this,true,"idCateTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.catetipoafiliacionConstantesFunciones.resaltaridCateTipoAfiliacion,this.catetipoafiliacionConstantesFunciones.activaridCateTipoAfiliacion,this,true,"idCateTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCateTipoAfiliacion,CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO));

		if(this.catetipoafiliacionConstantesFunciones.mostrarcodigoCateTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.catetipoafiliacionConstantesFunciones.resaltarcodigoCateTipoAfiliacion,this.catetipoafiliacionConstantesFunciones.activarcodigoCateTipoAfiliacion,this,true,"codigoCateTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.catetipoafiliacionConstantesFunciones.resaltarcodigoCateTipoAfiliacion,this.catetipoafiliacionConstantesFunciones.activarcodigoCateTipoAfiliacion,this,true,"codigoCateTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CateTipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCateTipoAfiliacion,CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE));

		if(this.catetipoafiliacionConstantesFunciones.mostrarnombreCateTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.catetipoafiliacionConstantesFunciones.resaltarnombreCateTipoAfiliacion,this.catetipoafiliacionConstantesFunciones.activarnombreCateTipoAfiliacion,this,true,"nombreCateTipoAfiliacion","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.catetipoafiliacionConstantesFunciones.resaltarnombreCateTipoAfiliacion,this.catetipoafiliacionConstantesFunciones.activarnombreCateTipoAfiliacion,this,true,"nombreCateTipoAfiliacion","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new CateTipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosCateTipoAfiliacion,CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO));

		if(this.catetipoafiliacionConstantesFunciones.mostrares_defectoCateTipoAfiliacion && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.catetipoafiliacionConstantesFunciones.resaltares_defectoCateTipoAfiliacion,this.catetipoafiliacionConstantesFunciones.activares_defectoCateTipoAfiliacion));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.catetipoafiliacionConstantesFunciones.resaltares_defectoCateTipoAfiliacion,this.catetipoafiliacionConstantesFunciones.activares_defectoCateTipoAfiliacion,this,true,"es_defectoCateTipoAfiliacion","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new CateTipoAfiliacionPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.catetipoafiliacionConstantesFunciones.mostrarClienteCateTipoAfiliacion && !CateTipoAfiliacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(catetipoafiliacionConstantesFunciones.resaltarClienteCateTipoAfiliacion,this,this.catetipoafiliacionConstantesFunciones.activarClienteCateTipoAfiliacion));
				tableColumn.setCellEditor(new ClienteTableCell(catetipoafiliacionConstantesFunciones.resaltarClienteCateTipoAfiliacion,this,this.catetipoafiliacionConstantesFunciones.activarClienteCateTipoAfiliacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCateTipoAfiliacion.addColumn(tableColumn);
			}

			if(this.isTienePermisosTipoAfiliacion && this.catetipoafiliacionConstantesFunciones.mostrarTipoAfiliacionCateTipoAfiliacion && !CateTipoAfiliacionConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tipo Afiliaciones");
				tableColumn.setHeaderValue("Tipo Afiliaciones");
				tableColumn.setCellRenderer(new TipoAfiliacionTableCell(catetipoafiliacionConstantesFunciones.resaltarTipoAfiliacionCateTipoAfiliacion,this,this.catetipoafiliacionConstantesFunciones.activarTipoAfiliacionCateTipoAfiliacion));
				tableColumn.setCellEditor(new TipoAfiliacionTableCell(catetipoafiliacionConstantesFunciones.resaltarTipoAfiliacionCateTipoAfiliacion,this,this.catetipoafiliacionConstantesFunciones.activarTipoAfiliacionCateTipoAfiliacion));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosCateTipoAfiliacion.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCateTipoAfiliacion.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosCateTipoAfiliacion.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosCateTipoAfiliacion.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosCateTipoAfiliacion.addColumn(tableColumn);
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
			
			this.jTableDatosCateTipoAfiliacion.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosCateTipoAfiliacion.moveColumn(this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosCateTipoAfiliacion.moveColumn(this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosCateTipoAfiliacion.moveColumn(this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosCateTipoAfiliacion.moveColumn(this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosCateTipoAfiliacion.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosCateTipoAfiliacion.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosCateTipoAfiliacion,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosCateTipoAfiliacion.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosCateTipoAfiliacion.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosCateTipoAfiliacion.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=catetipoafiliacionLogic.getCateTipoAfiliacions().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=catetipoafiliacions.size()-1;
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
		//this.jTableDatosCateTipoAfiliacion.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosCateTipoAfiliacion.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosCateTipoAfiliacion();
			
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
				
				//this.isEsNuevoCateTipoAfiliacion=false;
					
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
				if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCateTipoAfiliacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCateTipoAfiliacion.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.catetipoafiliacion.getsType().equals("DUPLICADO")
				   || this.catetipoafiliacion.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoCateTipoAfiliacion=true;
				
				} else {
					this.isEsNuevoCateTipoAfiliacion=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					if(this.catetipoafiliacion.getId()>=0 && !this.catetipoafiliacion.getIsNew()) {						
						this.isEsNuevoCateTipoAfiliacion=false;
						
					} else {
						this.isEsNuevoCateTipoAfiliacion=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoCateTipoAfiliacion(esRelaciones);						
				
				this.seleccionarCateTipoAfiliacion(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.catetipoafiliacion.getId()<0) {
					this.isEsNuevoCateTipoAfiliacion=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarCateTipoAfiliacion(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarCateTipoAfiliacion(evt,rowIndex);
				}	
				
				if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion CateTipoAfiliacion: " + this.dDif); 
					}
				}								
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarCateTipoAfiliacion(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.catetipoafiliacion)) {
					if(this.catetipoafiliacion.getId()>0) {
						this.catetipoafiliacion.setIsDeleted(true);
						
						this.catetipoafiliacionsEliminados.add(this.catetipoafiliacion);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.catetipoafiliacionLogic.getCateTipoAfiliacions().remove(this.catetipoafiliacion);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.catetipoafiliacions.remove(this.catetipoafiliacion);				
					}
					
					
					((CateTipoAfiliacionModel) this.jTableDatosCateTipoAfiliacion.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarCateTipoAfiliacion(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoCateTipoAfiliacion) {
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosCateTipoAfiliacion.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosCateTipoAfiliacion.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioCateTipoAfiliacion(this.catetipoafiliacion);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesCateTipoAfiliacion("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesCateTipoAfiliacion(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualCateTipoAfiliacion() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoCateTipoAfiliacion(catetipoafiliacion,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioCateTipoAfiliacion(catetipoafiliacion);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyCateTipoAfiliacion(catetipoafiliacion,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyCateTipoAfiliacion(catetipoafiliacion);
	}
	
	public void setVariablesObjetoActualToFormularioCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.setText(catetipoafiliacion.getId().toString());
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldcodigoCateTipoAfiliacion.setText(catetipoafiliacion.getcodigo());
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextAreanombreCateTipoAfiliacion.setText(catetipoafiliacion.getnombre());
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxes_defectoCateTipoAfiliacion.setSelected(catetipoafiliacion.getes_defecto());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,CateTipoAfiliacion catetipoafiliacionLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,catetipoafiliacionLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,CateTipoAfiliacion catetipoafiliacionLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				catetipoafiliacionLocal=this.catetipoafiliacion;
			} else {
				catetipoafiliacionLocal=this.catetipoafiliacionAnterior;
			}
		}
		
		if(this.permiteMantenimiento(catetipoafiliacionLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoCateTipoAfiliacion(catetipoafiliacionLocal,true);
					
					if(catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(catetipoafiliacionLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(catetipoafiliacionLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(catetipoafiliacion,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(catetipoafiliacion);
	}
	
	public void setVariablesFormularioToObjetoActualCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(catetipoafiliacion,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.getText()==null || this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.getText()=="" || this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.getText()=="Id") {
				this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.setText("0");
			}

			if(conColumnasBase) {catetipoafiliacion.setId(Long.parseLong(this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CateTipoAfiliacionConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabelIdCateTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			catetipoafiliacion.setcodigo(this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldcodigoCateTipoAfiliacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabelcodigoCateTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			catetipoafiliacion.setnombre(this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextAreanombreCateTipoAfiliacion.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabelnombreCateTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			catetipoafiliacion.setes_defecto(this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxes_defectoCateTipoAfiliacion.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormCateTipoAfiliacion.jLabeles_defectoCateTipoAfiliacion,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacionBean,CateTipoAfiliacion catetipoafiliacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacionOrigen,CateTipoAfiliacion catetipoafiliacion,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && catetipoafiliacionOrigen.getId()!=null && !catetipoafiliacionOrigen.getId().equals(0L))) {catetipoafiliacion.setId(catetipoafiliacionOrigen.getId());}}
			if(conDefault || (!conDefault && catetipoafiliacionOrigen.getcodigo()!=null && !catetipoafiliacionOrigen.getcodigo().equals(""))) {catetipoafiliacion.setcodigo(catetipoafiliacionOrigen.getcodigo());}
			if(conDefault || (!conDefault && catetipoafiliacionOrigen.getnombre()!=null && !catetipoafiliacionOrigen.getnombre().equals(""))) {catetipoafiliacion.setnombre(catetipoafiliacionOrigen.getnombre());}
			if(conDefault || (!conDefault && catetipoafiliacionOrigen.getes_defecto()!=null && !catetipoafiliacionOrigen.getes_defecto().equals(false))) {catetipoafiliacion.setes_defecto(catetipoafiliacionOrigen.getes_defecto());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.setText(catetipoafiliacion.getId().toString());
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldcodigoCateTipoAfiliacion.setText(catetipoafiliacion.getcodigo());
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextAreanombreCateTipoAfiliacion.setText(catetipoafiliacion.getnombre());
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxes_defectoCateTipoAfiliacion.setSelected(catetipoafiliacion.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioCateTipoAfiliacion(CateTipoAfiliacionBean catetipoafiliacionBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.setText(catetipoafiliacionBean.getId().toString());
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldcodigoCateTipoAfiliacion.setText(catetipoafiliacionBean.getcodigo());
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextAreanombreCateTipoAfiliacion.setText(catetipoafiliacionBean.getnombre());
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxes_defectoCateTipoAfiliacion.setSelected(catetipoafiliacionBean.getes_defecto());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanCateTipoAfiliacion(CateTipoAfiliacionParameterReturnGeneral catetipoafiliacionReturnGeneral,CateTipoAfiliacionBean catetipoafiliacionBean,Boolean conDefault) throws Exception { 
		try {
			CateTipoAfiliacion catetipoafiliacionLocal=new CateTipoAfiliacion();
			
			catetipoafiliacionLocal=catetipoafiliacionReturnGeneral.getCateTipoAfiliacion();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && catetipoafiliacionLocal.getId()!=null && !catetipoafiliacionLocal.getId().equals(0L))) {catetipoafiliacionBean.setId(catetipoafiliacionLocal.getId());}}
			if(conDefault || (!conDefault && catetipoafiliacionLocal.getcodigo()!=null && !catetipoafiliacionLocal.getcodigo().equals(""))) {catetipoafiliacionBean.setcodigo(catetipoafiliacionLocal.getcodigo());}
			if(conDefault || (!conDefault && catetipoafiliacionLocal.getnombre()!=null && !catetipoafiliacionLocal.getnombre().equals(""))) {catetipoafiliacionBean.setnombre(catetipoafiliacionLocal.getnombre());}
			if(conDefault || (!conDefault && catetipoafiliacionLocal.getes_defecto()!=null && !catetipoafiliacionLocal.getes_defecto().equals(false))) {catetipoafiliacionBean.setes_defecto(catetipoafiliacionLocal.getes_defecto());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxCateTipoAfiliacionGenerico(Long idCateTipoAfiliacionSeleccionado,JComboBox jComboBoxCateTipoAfiliacion,List<CateTipoAfiliacion> catetipoafiliacionsLocal)throws Exception {
		try {
			CateTipoAfiliacion  catetipoafiliacionTemp=null;

			for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsLocal) {
				if(catetipoafiliacionAux.getId()!=null && catetipoafiliacionAux.getId().equals(idCateTipoAfiliacionSeleccionado)) {
					catetipoafiliacionTemp=catetipoafiliacionAux;
					break;
				}
			}

			jComboBoxCateTipoAfiliacion.setSelectedItem(catetipoafiliacionTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxCateTipoAfiliacionGenerico(JComboBox jComboBoxCateTipoAfiliacion,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxCateTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCateTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxCateTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxCateTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCateTipoAfiliacion.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxCateTipoAfiliacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxCateTipoAfiliacion.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxCateTipoAfiliacion.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxCateTipoAfiliacion.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxCateTipoAfiliacion.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Cliente")) {
			jButtonClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("TipoAfiliacion")) {
			jButtonTipoAfiliacionActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			catetipoafiliacion=(CateTipoAfiliacion) catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			catetipoafiliacion =(CateTipoAfiliacion) catetipoafiliacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		CateTipoAfiliacion catetipoafiliacionRow=new CateTipoAfiliacion();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			catetipoafiliacionRow=(CateTipoAfiliacion) catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			catetipoafiliacionRow=(CateTipoAfiliacion) catetipoafiliacions.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CateTipoAfiliacion catetipoafiliacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.catetipoafiliacion = (CateTipoAfiliacion)this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.catetipoafiliacion = (CateTipoAfiliacion)this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(catetipoafiliacion!=null) {
						this.catetipoafiliacion = catetipoafiliacion;
					} else {
						this.catetipoafiliacion = new CateTipoAfiliacion();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.catetipoafiliacion)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame;
					}

					List<CateTipoAfiliacion> catetipoafiliacions=new ArrayList<CateTipoAfiliacion>();
					catetipoafiliacions.add(this.catetipoafiliacion);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCateTipoAfiliacion.cargarClienteBeanSwingJInternalFrame(catetipoafiliacions,this.catetipoafiliacion,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCateTipoAfiliacion=(TitledBorder)this.jScrollPanelDatosCateTipoAfiliacion.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderCateTipoAfiliacion.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonTipoAfiliacionActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,CateTipoAfiliacion catetipoafiliacion) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.catetipoafiliacion = (CateTipoAfiliacion)this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.catetipoafiliacion = (CateTipoAfiliacion)this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(catetipoafiliacion!=null) {
						this.catetipoafiliacion = catetipoafiliacion;
					} else {
						this.catetipoafiliacion = new CateTipoAfiliacion();
					}
				}

				if(this.isTienePermisosTipoAfiliacion && this.permiteMantenimiento(this.catetipoafiliacion)) {
					TipoAfiliacionBeanSwingJInternalFrame tipoafiliacionBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFramePopup=new TipoAfiliacionBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tipoafiliacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFramePopup;
					} else {
						tipoafiliacionBeanSwingJInternalFrame=this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame;
					}

					List<CateTipoAfiliacion> catetipoafiliacions=new ArrayList<CateTipoAfiliacion>();
					catetipoafiliacions.add(this.catetipoafiliacion);
					if(!esRelacionado) {
						//tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.setConGuardarRelaciones(false);
						//tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tipoafiliacionBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormCateTipoAfiliacion.cargarTipoAfiliacionBeanSwingJInternalFrame(catetipoafiliacions,this.catetipoafiliacion,tipoafiliacionBeanSwingJInternalFrame,/*conInicializar,*/tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.getConGuardarRelaciones(),tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionSessionBean.getEsGuardarRelacionado());
					tipoafiliacionBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tipoafiliacionBeanSwingJInternalFrame.actualizarEstadoPanelsTipoAfiliacion("no_relacionado");

						tipoafiliacionBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TipoAfiliacionConstantesFunciones.ITAMANIOFILATABLA + (TipoAfiliacionConstantesFunciones.ITAMANIOFILATABLA/2));

						tipoafiliacionBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderCateTipoAfiliacion=(TitledBorder)this.jScrollPanelDatosCateTipoAfiliacion.getBorder();
						TitledBorder titledBorderTipoAfiliacion=(TitledBorder)tipoafiliacionBeanSwingJInternalFrame.jScrollPanelDatosTipoAfiliacion.getBorder();

						titledBorderTipoAfiliacion.setTitle(titledBorderCateTipoAfiliacion.getTitle() + " -> Tipo Afiliacion");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tipoafiliacionBeanSwingJInternalFrame);
						}

						tipoafiliacionBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tipoafiliacionBeanSwingJInternalFrame);

						tipoafiliacionBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tipo Afiliacion",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualCateTipoAfiliacion(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoCateTipoAfiliacion && this.isPermisoNuevoCateTipoAfiliacion));			
			this.jButtonDuplicarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaDuplicarCateTipoAfiliacion && this.isPermisoDuplicarCateTipoAfiliacion));			
			this.jButtonCopiarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaCopiarCateTipoAfiliacion && this.isPermisoCopiarCateTipoAfiliacion));
			this.jButtonVerFormCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaVerFormCateTipoAfiliacion && this.isPermisoVerFormCateTipoAfiliacion));
			
			this.jButtonAbrirOrderByCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenCateTipoAfiliacion && this.isPermisoOrdenCateTipoAfiliacion));			
			
			this.jButtonNuevoRelacionesCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion && this.isPermisoNuevoCateTipoAfiliacion));			
			this.jButtonNuevoGuardarCambiosCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoCateTipoAfiliacion && this.isPermisoNuevoCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonModificarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaModificarCateTipoAfiliacion && this.isPermisoActualizarCateTipoAfiliacion));	
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaActualizarCateTipoAfiliacion && this.isPermisoActualizarCateTipoAfiliacion));	
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaEliminarCateTipoAfiliacion && this.isPermisoEliminarCateTipoAfiliacion));
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarCateTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarCateTipoAfiliacion);							
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));			
			
			}
						
			this.jButtonGuardarCambiosTablaCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoCateTipoAfiliacion && this.isPermisoNuevoCateTipoAfiliacion));						
			this.jButtonDuplicarToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaDuplicarCateTipoAfiliacion && this.isPermisoDuplicarCateTipoAfiliacion));						
			this.jButtonCopiarToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaCopiarCateTipoAfiliacion && this.isPermisoCopiarCateTipoAfiliacion));			
			this.jButtonVerFormToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaVerFormCateTipoAfiliacion && this.isPermisoVerFormCateTipoAfiliacion));			
			this.jButtonAbrirOrderByToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenCateTipoAfiliacion && this.isPermisoOrdenCateTipoAfiliacion));
			this.jButtonNuevoRelacionesToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion && this.isPermisoNuevoCateTipoAfiliacion));			
			this.jButtonNuevoGuardarCambiosToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoCateTipoAfiliacion && this.isPermisoNuevoCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));			
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonModificarToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaModificarCateTipoAfiliacion && this.isPermisoActualizarCateTipoAfiliacion));	
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaActualizarCateTipoAfiliacion  && this.isPermisoActualizarCateTipoAfiliacion));	
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaEliminarCateTipoAfiliacion && this.isPermisoEliminarCateTipoAfiliacion));
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarToolBarCateTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarCateTipoAfiliacion);				
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoCateTipoAfiliacion && this.isPermisoNuevoCateTipoAfiliacion));			
			this.jMenuItemDuplicarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaDuplicarCateTipoAfiliacion && this.isPermisoDuplicarCateTipoAfiliacion));			
			this.jMenuItemCopiarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaCopiarCateTipoAfiliacion && this.isPermisoCopiarCateTipoAfiliacion));			
			this.jMenuItemVerFormCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaVerFormCateTipoAfiliacion && this.isPermisoVerFormCateTipoAfiliacion));			
			this.jMenuItemAbrirOrderByCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenCateTipoAfiliacion && this.isPermisoOrdenCateTipoAfiliacion));			
			//this.jMenuItemMostrarOcultarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenCateTipoAfiliacion && this.isPermisoOrdenCateTipoAfiliacion));
			this.jMenuItemDetalleAbrirOrderByCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenCateTipoAfiliacion && this.isPermisoOrdenCateTipoAfiliacion));			
			//this.jMenuItemDetalleMostrarOcultarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaOrdenCateTipoAfiliacion && this.isPermisoOrdenCateTipoAfiliacion));			
			this.jMenuItemNuevoRelacionesCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion && this.isPermisoNuevoCateTipoAfiliacion));			
			this.jMenuItemNuevoGuardarCambiosCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaNuevoCateTipoAfiliacion && this.isPermisoNuevoCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));									
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemModificarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaModificarCateTipoAfiliacion && this.isPermisoActualizarCateTipoAfiliacion));	
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemActualizarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaActualizarCateTipoAfiliacion && this.isPermisoActualizarCateTipoAfiliacion));	
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemEliminarCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaEliminarCateTipoAfiliacion && this.isPermisoEliminarCateTipoAfiliacion));
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemCancelarCateTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarCateTipoAfiliacion);				
			}
			
			this.jMenuItemGuardarCambiosCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));						
			this.jMenuItemGuardarCambiosTablaCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=this.jButtonNuevoCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaDuplicarCateTipoAfiliacion=this.jButtonDuplicarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaCopiarCateTipoAfiliacion=this.jButtonCopiarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaVerFormCateTipoAfiliacion=this.jButtonVerFormCateTipoAfiliacion.isVisible();
			
			this.isVisibilidadCeldaOrdenCateTipoAfiliacion=this.jButtonAbrirOrderByCateTipoAfiliacion.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=this.jButtonNuevoRelacionesCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=this.jButtonModificarCateTipoAfiliacion.isVisible();
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaGuardarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosCateTipoAfiliacion.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=this.jButtonGuardarCambiosTablaCateTipoAfiliacion.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=this.jButtonNuevoToolBarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=this.jButtonNuevoRelacionesToolBarCateTipoAfiliacion.isVisible();
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonModificarToolBarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarToolBarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarToolBarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarToolBarCateTipoAfiliacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCateTipoAfiliacion=this.jButtonGuardarCambiosToolBarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=this.jButtonGuardarCambiosTablaToolBarCateTipoAfiliacion.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=this.jMenuItemNuevoCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=this.jMenuItemNuevoRelacionesCateTipoAfiliacion.isVisible();
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemModificarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemActualizarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemEliminarCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemCancelarCateTipoAfiliacion.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarCateTipoAfiliacion=this.jMenuItemGuardarCambiosCateTipoAfiliacion.isVisible();
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=this.jMenuItemGuardarCambiosTablaCateTipoAfiliacion.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesCateTipoAfiliacion(Boolean esInicializar) {
		if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {			
			if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
				//if(this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesCateTipoAfiliacion();
			}
			
			this.inicializarActualizarBindingBotonesManualCateTipoAfiliacion(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualCateTipoAfiliacion() {
		this.jButtonNuevoCateTipoAfiliacion.setVisible(this.isPermisoNuevoCateTipoAfiliacion);			
		this.jButtonDuplicarCateTipoAfiliacion.setVisible(this.isPermisoDuplicarCateTipoAfiliacion);			
		this.jButtonCopiarCateTipoAfiliacion.setVisible(this.isPermisoCopiarCateTipoAfiliacion);			
		this.jButtonVerFormCateTipoAfiliacion.setVisible(this.isPermisoVerFormCateTipoAfiliacion);			
		
		this.jButtonAbrirOrderByCateTipoAfiliacion.setVisible(this.isPermisoOrdenCateTipoAfiliacion);					
		
		this.jButtonNuevoRelacionesCateTipoAfiliacion.setVisible(this.isPermisoNuevoCateTipoAfiliacion);			
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonModificarCateTipoAfiliacion.setVisible(this.isPermisoActualizarCateTipoAfiliacion);	
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarCateTipoAfiliacion.setVisible(this.isPermisoActualizarCateTipoAfiliacion);	
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarCateTipoAfiliacion.setVisible(this.isPermisoEliminarCateTipoAfiliacion);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarCateTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarCateTipoAfiliacion);						
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosCateTipoAfiliacion.setVisible(this.isPermisoGuardarCambiosCateTipoAfiliacion);							
		}
		
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion.setVisible(this.isPermisoActualizarCateTipoAfiliacion);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleCateTipoAfiliacion() {
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonModificarCateTipoAfiliacion.setVisible(this.isPermisoActualizarCateTipoAfiliacion);	
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarCateTipoAfiliacion.setVisible(this.isPermisoActualizarCateTipoAfiliacion);	
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarCateTipoAfiliacion.setVisible(this.isPermisoEliminarCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarCateTipoAfiliacion.setVisible(this.isVisibilidadCeldaCancelarCateTipoAfiliacion);							
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosCateTipoAfiliacion.setVisible((this.isVisibilidadCeldaGuardarCateTipoAfiliacion && this.isPermisoGuardarCambiosCateTipoAfiliacion));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosCateTipoAfiliacion() {
		if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualCateTipoAfiliacion();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesCateTipoAfiliacion() {
	}
	
	public void jTableDatosCateTipoAfiliacionListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarCateTipoAfiliacion(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidCateTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.getcatetipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.catetipoafiliacion==null) {
						this.catetipoafiliacion = new CateTipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
				}

				if(this.catetipoafiliacion.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.catetipoafiliacion.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCateTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoCateTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.getcatetipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.catetipoafiliacion==null) {
						this.catetipoafiliacion = new CateTipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
				}

				if(this.catetipoafiliacion.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.catetipoafiliacion.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCateTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreCateTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.getcatetipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.catetipoafiliacion==null) {
						this.catetipoafiliacion = new CateTipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
				}

				if(this.catetipoafiliacion.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.catetipoafiliacion.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCateTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_defectoCateTipoAfiliacionBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.getcatetipoafiliacion(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.catetipoafiliacion==null) {
						this.catetipoafiliacion = new CateTipoAfiliacion();
					}

					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);
				}

				if(this.catetipoafiliacion.getes_defecto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_defecto = "+this.catetipoafiliacion.getes_defecto().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingCateTipoAfiliacion(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameCateTipoAfiliacion() {
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
		

		if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.setVisible(false);	    			
			this.jInternalFrameDetalleFormCateTipoAfiliacion.dispose();
			this.jInternalFrameDetalleFormCateTipoAfiliacion=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion!=null) {
			this.jInternalFrameReporteDinamicoCateTipoAfiliacion.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoCateTipoAfiliacion.dispose();
			this.jInternalFrameReporteDinamicoCateTipoAfiliacion=null;
		}
		
		if(this.jInternalFrameImportacionCateTipoAfiliacion!=null) {
			this.jInternalFrameImportacionCateTipoAfiliacion.setVisible(false);	    			
			this.jInternalFrameImportacionCateTipoAfiliacion.dispose();
			this.jInternalFrameImportacionCateTipoAfiliacion=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessCateTipoAfiliacion();
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
			
			if(sTipo.equals("NuevoCateTipoAfiliacion")) {
				jButtonNuevoCateTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarCateTipoAfiliacion")) {
				jButtonDuplicarCateTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarCateTipoAfiliacion")) {
				jButtonCopiarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormCateTipoAfiliacion")) {
				jButtonVerFormCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarCateTipoAfiliacion")) {
				jButtonNuevoCateTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarCateTipoAfiliacion")) {
				jButtonDuplicarCateTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoCateTipoAfiliacion")) {
				jButtonNuevoCateTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarCateTipoAfiliacion")) {
				jButtonDuplicarCateTipoAfiliacionActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesCateTipoAfiliacion")) {
				jButtonNuevoCateTipoAfiliacionActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarCateTipoAfiliacion")) {
				jButtonNuevoCateTipoAfiliacionActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesCateTipoAfiliacion")) {
				jButtonNuevoCateTipoAfiliacionActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarCateTipoAfiliacion")) {
				jButtonModificarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarCateTipoAfiliacion")) {
				jButtonModificarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarCateTipoAfiliacion")) {
				jButtonModificarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarCateTipoAfiliacion")) {
				jButtonActualizarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarCateTipoAfiliacion")) {
				jButtonActualizarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarCateTipoAfiliacion")) {
				jButtonActualizarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarCateTipoAfiliacion")) {
				jButtonEliminarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarCateTipoAfiliacion")) {
				jButtonEliminarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarCateTipoAfiliacion")) {
				jButtonEliminarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarCateTipoAfiliacion")) {
				jButtonCancelarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarCateTipoAfiliacion")) {
				jButtonCancelarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarCateTipoAfiliacion")) {
				jButtonCancelarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarCateTipoAfiliacion")) {
				jButtonCerrarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarCateTipoAfiliacion")) {
				jButtonCerrarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarCateTipoAfiliacion")) {
				jButtonCerrarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarCateTipoAfiliacion")) {
				jButtonMostrarOcultarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarCateTipoAfiliacion")) {
				jButtonCancelarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosCateTipoAfiliacion")) {
				jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarCateTipoAfiliacion")) {
				jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarCateTipoAfiliacion")) {
				jButtonCopiarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarCateTipoAfiliacion")) {
				jButtonVerFormCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosCateTipoAfiliacion")) {
				jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarCateTipoAfiliacion")) {
				jButtonCopiarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormCateTipoAfiliacion")) {
				jButtonVerFormCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaCateTipoAfiliacion")) {
				jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarCateTipoAfiliacion")) {
				jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaCateTipoAfiliacion")) {
				jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionCateTipoAfiliacion")) {
				jButtonRecargarInformacionCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarCateTipoAfiliacion")) {
				jButtonRecargarInformacionCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionCateTipoAfiliacion")) {
				jButtonRecargarInformacionCateTipoAfiliacionActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresCateTipoAfiliacion")) {
				jButtonAnterioresCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarCateTipoAfiliacion")) {
				jButtonAnterioresCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreCateTipoAfiliacion")) {
				jButtonAnterioresCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesCateTipoAfiliacion")) {
				jButtonSiguientesCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarCateTipoAfiliacion")) {
				jButtonSiguientesCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesCateTipoAfiliacion")) {
				jButtonSiguientesCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByCateTipoAfiliacion") || sTipo.equals("MenuItemDetalleAbrirOrderByCateTipoAfiliacion")) {
				jButtonAbrirOrderByCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarCateTipoAfiliacion") || sTipo.equals("MenuItemDetalleMostrarOcultarCateTipoAfiliacion")) {
				jButtonMostrarOcultarCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosCateTipoAfiliacion")) {
				jButtonNuevoGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarCateTipoAfiliacion")) {
				jButtonNuevoGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosCateTipoAfiliacion")) {
				jButtonNuevoGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoCateTipoAfiliacion")) {
				jButtonCerrarReporteDinamicoCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoCateTipoAfiliacion")) {
				jButtonGenerarReporteDinamicoCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoCateTipoAfiliacion")) {
				
				jButtonGenerarExcelReporteDinamicoCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionCateTipoAfiliacion")) {
				jButtonCerrarImportacionCateTipoAfiliacionActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionCateTipoAfiliacion")) {
				
				jButtonGenerarImportacionCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionCateTipoAfiliacion")) {
				
				jButtonAbrirImportacionCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesCateTipoAfiliacion")) {
				jComboBoxTiposAccionesCateTipoAfiliacionActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesCateTipoAfiliacion")) {
				jComboBoxTiposRelacionesCateTipoAfiliacionActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioCateTipoAfiliacion")) {
				jComboBoxTiposAccionesCateTipoAfiliacionActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarCateTipoAfiliacion")) {
				
				jComboBoxTiposSeleccionarCateTipoAfiliacionActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralCateTipoAfiliacion")) {
				jTextFieldValorCampoGeneralCateTipoAfiliacionActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByCateTipoAfiliacion")) {
				jButtonAbrirOrderByCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarCateTipoAfiliacion")) {
				jButtonAbrirOrderByCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByCateTipoAfiliacion")) {
				jButtonCerrarOrderByCateTipoAfiliacionActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCateTipoAfiliacionBusqueda")) {
				this.jButtonidCateTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCateTipoAfiliacionBusqueda")) {
				this.jButtoncodigoCateTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCateTipoAfiliacionBusqueda")) {
				this.jButtonnombreCateTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoCateTipoAfiliacionBusqueda")) {
				this.jButtones_defectoCateTipoAfiliacionBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessCateTipoAfiliacion();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				


				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			CateTipoAfiliacion catetipoafiliacionLocal=null;
			
			if(!this.getEsControlTabla()) {
				catetipoafiliacionLocal=this.catetipoafiliacion;
			} else {
				catetipoafiliacionLocal=this.catetipoafiliacionAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
							
				
				


				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
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
			
			


			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCateTipoAfiliacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
								
						
				


				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
								
				
				


				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCateTipoAfiliacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
							
				
				


				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
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
			
			


			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
								
				
				


				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCateTipoAfiliacionActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
			
			this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCateTipoAfiliacionActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosCateTipoAfiliacion")) {
					jCheckBoxSeleccionarTodosCateTipoAfiliacionItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosCateTipoAfiliacion")) {
					jCheckBoxSeleccionadosCateTipoAfiliacionItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarCateTipoAfiliacion")) {
					
				}
				
				


				
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
												
				
				


				
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCateTipoAfiliacionActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
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
			
			


			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.catetipoafiliacion);
				
				this.actualizarInformacion("INFO_PADRE",false,this.catetipoafiliacion);
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
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
				
				


				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(CateTipoAfiliacion.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",CateTipoAfiliacion.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaCateTipoAfiliacionActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.catetipoafiliacionAnterior =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarCateTipoAfiliacion")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosCateTipoAfiliacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosCateTipoAfiliacion.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.catetipoafiliacion =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.catetipoafiliacion);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarCateTipoAfiliacion")) {
				
				}
				
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarCateTipoAfiliacion")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosCateTipoAfiliacion.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarCateTipoAfiliacion")) {
			
			}
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessCateTipoAfiliacion();
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
			if(sTipo.equals("NuevoCateTipoAfiliacion")) {
				jButtonNuevoCateTipoAfiliacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarCateTipoAfiliacion")) {
				jButtonDuplicarCateTipoAfiliacionActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarCateTipoAfiliacion")) {
				jButtonCopiarCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormCateTipoAfiliacion")) {
				jButtonVerFormCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesCateTipoAfiliacion")) {
				jButtonNuevoCateTipoAfiliacionActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarCateTipoAfiliacion")) {
				jButtonModificarCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarCateTipoAfiliacion")) {
				jButtonActualizarCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarCateTipoAfiliacion")) {
				jButtonEliminarCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaCateTipoAfiliacion")) {
				jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarCateTipoAfiliacion")) {
				jButtonCancelarCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarCateTipoAfiliacion")) {
				jButtonCerrarCateTipoAfiliacionActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosCateTipoAfiliacion")) {
				jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosCateTipoAfiliacion")) {
				jButtonNuevoGuardarCambiosCateTipoAfiliacionActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByCateTipoAfiliacion")) {
				jButtonAbrirOrderByCateTipoAfiliacionActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionCateTipoAfiliacion")) {
				jButtonRecargarInformacionCateTipoAfiliacionActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresCateTipoAfiliacion")) {
				jButtonAnterioresCateTipoAfiliacionActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesCateTipoAfiliacion")) {
				jButtonSiguientesCateTipoAfiliacionActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idCateTipoAfiliacionBusqueda")) {
				this.jButtonidCateTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoCateTipoAfiliacionBusqueda")) {
				this.jButtoncodigoCateTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreCateTipoAfiliacionBusqueda")) {
				this.jButtonnombreCateTipoAfiliacionBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_defectoCateTipoAfiliacionBusqueda")) {
				this.jButtones_defectoCateTipoAfiliacionBusquedaActionPerformed(evt);
			}
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessCateTipoAfiliacion();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameCateTipoAfiliacion")) {
				closingInternalFrameCateTipoAfiliacion();
				
			} else if(sTipo.equals("jButtonCancelarCateTipoAfiliacion")) {
				JInternalFrameBase jInternalFrameDetalleFormCateTipoAfiliacion = (JInternalFrameBase)evt.getSource();
	            	
	            CateTipoAfiliacionBeanSwingJInternalFrame jInternalFrameParent=(CateTipoAfiliacionBeanSwingJInternalFrame)jInternalFrameDetalleFormCateTipoAfiliacion.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarCateTipoAfiliacionActionPerformed(null);
			}
			
			CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.catetipoafiliacion,new Object(),this.catetipoafiliacionParameterGeneral,this.catetipoafiliacionReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormCateTipoAfiliacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormCateTipoAfiliacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormCateTipoAfiliacion(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.catetipoafiliacion)) {
			if(!esControlTabla) {
				if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);			
				}
				
				if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.catetipoafiliacionReturnGeneral=catetipoafiliacionLogic.procesarEventosCateTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.catetipoafiliacionLogic.getCateTipoAfiliacions(),this.catetipoafiliacion,this.catetipoafiliacionParameterGeneral,this.isEsNuevoCateTipoAfiliacion,classes);//this.catetipoafiliacionLogic.getCateTipoAfiliacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanCateTipoAfiliacion(this.catetipoafiliacionReturnGeneral,this.catetipoafiliacionBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanCateTipoAfiliacion(classes,this.catetipoafiliacionReturnGeneral,this.catetipoafiliacionBean,false);
					}
						
					if(this.catetipoafiliacionReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyCateTipoAfiliacion(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacion());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioCateTipoAfiliacion(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacion());	
					}
						
					if(this.catetipoafiliacionReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioCateTipoAfiliacion(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacion(),classes);//this.catetipoafiliacionBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioCateTipoAfiliacion(this.catetipoafiliacion,classes);//this.catetipoafiliacionBean);									
				}
			
				if(CateTipoAfiliacionJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualCateTipoAfiliacion(this.catetipoafiliacion,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysCateTipoAfiliacion(this.catetipoafiliacion);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.catetipoafiliacionAnterior!=null) {
						this.catetipoafiliacion=this.catetipoafiliacionAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.catetipoafiliacionReturnGeneral=catetipoafiliacionLogic.procesarEventosCateTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.catetipoafiliacionLogic.getCateTipoAfiliacions(),this.catetipoafiliacion,this.catetipoafiliacionParameterGeneral,this.isEsNuevoCateTipoAfiliacion,classes);//this.catetipoafiliacionLogic.getCateTipoAfiliacion()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.catetipoafiliacionSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.catetipoafiliacionSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacion(),catetipoafiliacionLogic.getCateTipoAfiliacions());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacion(),this.catetipoafiliacions);
				}
				//ARCHITECTURE
				
				//this.jTableDatosCateTipoAfiliacion.repaint();
				
				//((AbstractTableModel) this.jTableDatosCateTipoAfiliacion.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosCateTipoAfiliacion();
			}
		}
	}
	
	public void actualizarVisualTableDatosCateTipoAfiliacion() throws Exception {
		
		CateTipoAfiliacionModel catetipoafiliacionModel=(CateTipoAfiliacionModel)this.jTableDatosCateTipoAfiliacion.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			catetipoafiliacionModel.catetipoafiliacions=this.catetipoafiliacionLogic.getCateTipoAfiliacions();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			catetipoafiliacionModel.catetipoafiliacions=this.catetipoafiliacions;
		}
		
		
		((CateTipoAfiliacionModel) this.jTableDatosCateTipoAfiliacion.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaCateTipoAfiliacion() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcatetipoafiliacionAnterior(),this.catetipoafiliacionLogic.getCateTipoAfiliacions());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcatetipoafiliacionAnterior(),this.catetipoafiliacions);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosCateTipoAfiliacion();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(catetipoafiliacion.getClientes());
					this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoAfiliacion.class)) {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.setTipoAfiliacions(catetipoafiliacion.getTipoAfiliacions());
					this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoAfiliacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
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
										
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.catetipoafiliacion,new Object(),generalEntityParameterGeneral,this.catetipoafiliacionReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=CateTipoAfiliacionConstantesFunciones.getClassesRelationshipsOfCateTipoAfiliacion(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=CateTipoAfiliacionConstantesFunciones.getClassesRelationshipsFromStringsOfCateTipoAfiliacion(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormCateTipoAfiliacion(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				CateTipoAfiliacionBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.catetipoafiliacion,new Object(),generalEntityParameterGeneral,this.catetipoafiliacionReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioCateTipoAfiliacion(CateTipoAfiliacionBean catetipoafiliacionBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(catetipoafiliacion.getClientes());
					this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoAfiliacion.class)) {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.setTipoAfiliacions(catetipoafiliacion.getTipoAfiliacions());
					this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoAfiliacion(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanCateTipoAfiliacion(ArrayList<Classe> classes,CateTipoAfiliacionReturnGeneral catetipoafiliacionReturnGeneral,CateTipoAfiliacionBean catetipoafiliacionBean,Boolean conDefault) throws Exception {
		
			this.catetipoafiliacionBean.setClientes(catetipoafiliacionReturnGeneral.getCateTipoAfiliacion().getClientes());
			this.catetipoafiliacionBean.setTipoAfiliacions(catetipoafiliacionReturnGeneral.getCateTipoAfiliacion().getTipoAfiliacions());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					catetipoafiliacion.setClientes(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoAfiliacion.class)) {
					catetipoafiliacion.setTipoAfiliacions(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionBeanSwingJInternalFrame.tipoafiliacionLogic.getTipoAfiliacions());
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
		if(!paraTabla && !this.permiteMantenimiento(this.catetipoafiliacion)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion = new CateTipoAfiliacionDetalleFormJInternalFrame(jDesktopPane,this.catetipoafiliacionSessionBean.getConGuardarRelaciones(),this.catetipoafiliacionSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.setVisible(false);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.setSelected(false);						
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.catetipoafiliacionLogic=this.catetipoafiliacionLogic;
		
		this.cargarCombosFrameForeignKeyCateTipoAfiliacion("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleCateTipoAfiliacion();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleCateTipoAfiliacion();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyCateTipoAfiliacion("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyCateTipoAfiliacion();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCateTipoAfiliacion"));
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonModificarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ModificarCateTipoAfiliacion"));

		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonModificarToolBarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarCateTipoAfiliacion"));
					
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemModificarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarCateTipoAfiliacion"));		
		
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"ActualizarCateTipoAfiliacion"));
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarToolBarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCateTipoAfiliacion"));
						
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemActualizarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCateTipoAfiliacion"));		
		
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"EliminarCateTipoAfiliacion"));
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarCateTipoAfiliacion"));
								
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemEliminarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCateTipoAfiliacion"));		
		
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CancelarCateTipoAfiliacion"));
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarCateTipoAfiliacion"));
					
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemCancelarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCateTipoAfiliacion"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemDetalleCerrarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCateTipoAfiliacion"));		
		
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCateTipoAfiliacion"));
		
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCateTipoAfiliacion"));
		
		
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCateTipoAfiliacion"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonidCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"idCateTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtoncodigoCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoCateTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonnombreCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreCateTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtones_defectoCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoCateTipoAfiliacionBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCateTipoAfiliacion"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameCateTipoAfiliacion"));
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarCateTipoAfiliacion"));
		}
		
		this.jTableDatosCateTipoAfiliacion.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarCateTipoAfiliacion"));
		
		this.jTableDatosCateTipoAfiliacion.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarCateTipoAfiliacion"));
		
		this.jButtonNuevoCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"NuevoCateTipoAfiliacion"));
		
		this.jButtonDuplicarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"DuplicarCateTipoAfiliacion"));
		
		this.jButtonCopiarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"CopiarCateTipoAfiliacion"));
		
		this.jButtonVerFormCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"VerFormCateTipoAfiliacion"));
		
		
		this.jButtonNuevoToolBarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"NuevoToolBarCateTipoAfiliacion"));
			
		this.jButtonDuplicarToolBarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"DuplicarToolBarCateTipoAfiliacion"));
			
		this.jMenuItemNuevoCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoCateTipoAfiliacion"));
			
		this.jMenuItemDuplicarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarCateTipoAfiliacion"));		
		
		
		this.jButtonNuevoRelacionesCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"NuevoRelacionesCateTipoAfiliacion"));
		
		
		this.jButtonNuevoRelacionesToolBarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarCateTipoAfiliacion"));
			
		this.jMenuItemNuevoRelacionesCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesCateTipoAfiliacion"));		
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonModificarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ModificarCateTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonModificarToolBarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ModificarToolBarCateTipoAfiliacion"));
			
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemModificarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"MenuItemModificarCateTipoAfiliacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"ActualizarCateTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonActualizarToolBarCateTipoAfiliacion.addActionListener(new ButtonActionListener(this,"ActualizarToolBarCateTipoAfiliacion"));
				
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemActualizarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemActualizarCateTipoAfiliacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"EliminarCateTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonEliminarToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"EliminarToolBarCateTipoAfiliacion"));
						
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemEliminarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemEliminarCateTipoAfiliacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CancelarCateTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonCancelarToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CancelarToolBarCateTipoAfiliacion"));
			
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemCancelarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemCancelarCateTipoAfiliacion"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarCateTipoAfiliacion"));		
		
		
		this.jButtonCerrarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CerrarCateTipoAfiliacion"));
		
		
		this.jButtonCerrarToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CerrarToolBarCateTipoAfiliacion"));
			
		this.jMenuItemCerrarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemCerrarCateTipoAfiliacion"));
			
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jMenuItemDetalleCerrarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarCateTipoAfiliacion"));		
		}
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosCateTipoAfiliacion"));
		}
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarCateTipoAfiliacion"));
		}
		
		this.jButtonCopiarToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CopiarToolBarCateTipoAfiliacion"));
			
		this.jButtonVerFormToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"VerFormToolBarCateTipoAfiliacion"));
		
		this.jMenuItemGuardarCambiosCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosCateTipoAfiliacion"));
			
		this.jMenuItemCopiarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemCopiarCateTipoAfiliacion"));		
		
		this.jMenuItemVerFormCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemVerFormCateTipoAfiliacion"));		
		
		
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCateTipoAfiliacion"));
		
		
		this.jButtonGuardarCambiosTablaToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarCateTipoAfiliacion"));
			
		this.jMenuItemGuardarCambiosTablaCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaCateTipoAfiliacion"));		
		
		
		
		this.jButtonRecargarInformacionCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionCateTipoAfiliacion"));
					
		this.jButtonRecargarInformacionToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarCateTipoAfiliacion"));
		
		this.jMenuItemRecargarInformacionCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionCateTipoAfiliacion"));		
		
		
		
		this.jButtonAnterioresCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"AnterioresCateTipoAfiliacion"));
		
		
		this.jButtonAnterioresToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"AnterioresToolBarCateTipoAfiliacion"));
		
		this.jMenuItemAnterioresCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresCateTipoAfiliacion"));		
		
		
		this.jButtonSiguientesCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"SiguientesCateTipoAfiliacion"));
		
		
		this.jButtonSiguientesToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"SiguientesToolBarCateTipoAfiliacion"));
			
		this.jMenuItemSiguientesCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesCateTipoAfiliacion"));
			
		this.jMenuItemAbrirOrderByCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByCateTipoAfiliacion"));
			
		this.jMenuItemMostrarOcultarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarCateTipoAfiliacion"));
			
		this.jMenuItemDetalleAbrirOrderByCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByCateTipoAfiliacion"));
			
		this.jMenuItemDetalleMostarOcultarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarCateTipoAfiliacion"));		
		
		
		this.jButtonNuevoGuardarCambiosCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosCateTipoAfiliacion"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarCateTipoAfiliacion"));
			
		this.jMenuItemNuevoGuardarCambiosCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosCateTipoAfiliacion"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosCateTipoAfiliacion.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosCateTipoAfiliacion"));

		this.jCheckBoxSeleccionadosCateTipoAfiliacion.addItemListener(new CheckBoxItemListener(this,"SeleccionadosCateTipoAfiliacion"));
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioCateTipoAfiliacion"));
		}
		
		
		this.jComboBoxTiposRelacionesCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposRelacionesCateTipoAfiliacion"));
			
		this.jComboBoxTiposAccionesCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposAccionesCateTipoAfiliacion"));
					
		this.jComboBoxTiposSeleccionarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"TiposSeleccionarCateTipoAfiliacion"));
			
		this.jTextFieldValorCampoGeneralCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralCateTipoAfiliacion"));		
		
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonidCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"idCateTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtoncodigoCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoCateTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonnombreCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreCateTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtones_defectoCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoCateTipoAfiliacionBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoCateTipoAfiliacion!=null) {
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCateTipoAfiliacion"));
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCateTipoAfiliacion"));
				this.jInternalFrameReporteDinamicoCateTipoAfiliacion.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCateTipoAfiliacion"));
			}
			
			//this.jButtonCerrarReporteDinamicoCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoCateTipoAfiliacion"));				
			//this.jButtonGenerarReporteDinamicoCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoCateTipoAfiliacion"));
			//this.jButtonGenerarExcelReporteDinamicoCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoCateTipoAfiliacion"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionCateTipoAfiliacion!=null) {
				this.jInternalFrameImportacionCateTipoAfiliacion.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionCateTipoAfiliacion"));
				this.jInternalFrameImportacionCateTipoAfiliacion.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionCateTipoAfiliacion"));
				this.jInternalFrameImportacionCateTipoAfiliacion.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionCateTipoAfiliacion"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByCateTipoAfiliacion"));
			
			this.jButtonAbrirOrderByToolBarCateTipoAfiliacion.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarCateTipoAfiliacion"));			
			
			if(this.jInternalFrameOrderByCateTipoAfiliacion!=null) {
				this.jInternalFrameOrderByCateTipoAfiliacion.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByCateTipoAfiliacion"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormCateTipoAfiliacion.jTabbedPaneRelacionesCateTipoAfiliacion.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesCateTipoAfiliacion"));
		
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
            		closingInternalFrameCateTipoAfiliacion();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormCateTipoAfiliacion = (JInternalFrameBase)event.getSource();
	            	
	            CateTipoAfiliacionBeanSwingJInternalFrame jInternalFrameParent=(CateTipoAfiliacionBeanSwingJInternalFrame)jInternalFrameDetalleFormCateTipoAfiliacion.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarCateTipoAfiliacionActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosCateTipoAfiliacion.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosCateTipoAfiliacionListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosCateTipoAfiliacion.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosCateTipoAfiliacion.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCateTipoAfiliacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCateTipoAfiliacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCateTipoAfiliacionActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoCateTipoAfiliacion";
		inputMap = this.jButtonNuevoCateTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoCateTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCateTipoAfiliacionActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCateTipoAfiliacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCateTipoAfiliacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoCateTipoAfiliacionActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesCateTipoAfiliacion";
		inputMap = this.jButtonNuevoRelacionesCateTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesCateTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoCateTipoAfiliacionActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarCateTipoAfiliacion";
		inputMap = this.jButtonModificarCateTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarCateTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarCateTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarCateTipoAfiliacion";
		inputMap = this.jButtonActualizarCateTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarCateTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarCateTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarCateTipoAfiliacion";
		inputMap = this.jButtonEliminarCateTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarCateTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarCateTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarCateTipoAfiliacion";
		inputMap = this.jButtonCancelarCateTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarCateTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarCateTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarCateTipoAfiliacion";
		inputMap = this.jButtonCerrarCateTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarCateTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarCateTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosCateTipoAfiliacion";
		inputMap = this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosCateTipoAfiliacion.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonGuardarCambiosCateTipoAfiliacion.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosCateTipoAfiliacionActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosCateTipoAfiliacion.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosCateTipoAfiliacionItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesCateTipoAfiliacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesCateTipoAfiliacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarCateTipoAfiliacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarCateTipoAfiliacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralCateTipoAfiliacion.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralCateTipoAfiliacionActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonidCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"idCateTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtoncodigoCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"codigoCateTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtonnombreCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"nombreCateTipoAfiliacionBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jButtones_defectoCateTipoAfiliacionBusqueda.addActionListener(new ButtonActionListener(this,"es_defectoCateTipoAfiliacionBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionCateTipoAfiliacion.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionCateTipoAfiliacionActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarCateTipoAfiliacionActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarCateTipoAfiliacion.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosCateTipoAfiliacion(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacionLogic.getCateTipoAfiliacions()) {
					catetipoafiliacionAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacions) {
					catetipoafiliacionAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosCateTipoAfiliacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCateTipoAfiliacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacionLogic.getCateTipoAfiliacions()) {
						catetipoafiliacionAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacions) {
						catetipoafiliacionAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacionLogic.getCateTipoAfiliacions()) {
					
						if(sTipoSeleccionar.equals(CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							catetipoafiliacionAux.setes_defecto(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacions) {
						
						if(sTipoSeleccionar.equals(CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO)) {
							existe=true;
							catetipoafiliacionAux.setes_defecto(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCateTipoAfiliacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCateTipoAfiliacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCateTipoAfiliacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosCateTipoAfiliacionItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingCateTipoAfiliacion(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosCateTipoAfiliacion.getSelectedRows();
			
			CateTipoAfiliacion catetipoafiliacionLocal=new CateTipoAfiliacion();
			
			//this.seleccionarTodosCateTipoAfiliacion(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					catetipoafiliacionLocal =(CateTipoAfiliacion) this.catetipoafiliacionLogic.getCateTipoAfiliacions().toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					catetipoafiliacionLocal =(CateTipoAfiliacion) this.catetipoafiliacions.toArray()[this.jTableDatosCateTipoAfiliacion.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				catetipoafiliacionLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacionLogic.getCateTipoAfiliacions()) {
						catetipoafiliacionAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacions) {
						catetipoafiliacionAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosCateTipoAfiliacion.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosCateTipoAfiliacion.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosCateTipoAfiliacion,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualCateTipoAfiliacionItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarCateTipoAfiliacionParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralCateTipoAfiliacionActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingCateTipoAfiliacion(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralCateTipoAfiliacion.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacionLogic.getCateTipoAfiliacions()) {
				
						if(sTipoSeleccionar.equals(CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							catetipoafiliacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							catetipoafiliacionAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacions) {
					
						if(sTipoSeleccionar.equals(CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							catetipoafiliacionAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							catetipoafiliacionAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesCateTipoAfiliacionActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingCateTipoAfiliacion(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioCateTipoAfiliacion=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesCateTipoAfiliacion.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteCateTipoAfiliacion) {				
					conSplash=true;//false;										
					
					//this.startProcessCateTipoAfiliacion(conSplash);
				
					this.generarReporteCateTipoAfiliacionsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoCateTipoAfiliacionsSeleccionados();
				//this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCateTipoAfiliacionsSeleccionados(false);
				//this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoCateTipoAfiliacionsSeleccionados(true);
				//this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCateTipoAfiliacion();
				
				this.exportarCateTipoAfiliacionsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionCateTipoAfiliacions();
				//this.importarCateTipoAfiliacions();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessCateTipoAfiliacion();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelCateTipoAfiliacionsSeleccionados();
				//this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Cate Tipo Afiliacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessCateTipoAfiliacion();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoCateTipoAfiliacion)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyCateTipoAfiliacion(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setSelectedIndex(0);					
				}	
			} 			
			else if(CateTipoAfiliacionBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteCateTipoAfiliacion) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessCateTipoAfiliacion(conSplash);
					
						//this.actualizarParametrosGeneralCateTipoAfiliacion();
						
						this.generarReporteProcesoAccionCateTipoAfiliacionsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(CateTipoAfiliacionBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Cate Tipo AfiliacionES SELECCIONADOS?", "MANTENIMIENTO DE Cate Tipo Afiliacion", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessCateTipoAfiliacion();
				
						this.actualizarParametrosGeneralCateTipoAfiliacion();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.catetipoafiliacionReturnGeneral=catetipoafiliacionLogic.procesarAccionCateTipoAfiliacionsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.catetipoafiliacionLogic.getCateTipoAfiliacions(),this.catetipoafiliacionParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarCateTipoAfiliacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralCateTipoAfiliacion();
					
					CateTipoAfiliacionBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarCateTipoAfiliacionReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesCateTipoAfiliacion.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormCateTipoAfiliacion.jComboBoxTiposAccionesFormularioCateTipoAfiliacion.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessCateTipoAfiliacion(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesCateTipoAfiliacionActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessCateTipoAfiliacion();
			
			if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();		
			CateTipoAfiliacion catetipoafiliacion=new CateTipoAfiliacion();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingCateTipoAfiliacion(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesCateTipoAfiliacion.getSelectedItem();
			
			
			
			
			catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
			//this.sTipoAccion;
			
			if(catetipoafiliacionsSeleccionados.size()==1) {
				for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsSeleccionados) {
					catetipoafiliacion=catetipoafiliacionAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,catetipoafiliacion);
				}
				else if(this.sTipoRelacion.equals("Tipo Afiliacion")) {
					jButtonTipoAfiliacionActionPerformed(null,rowIndex,true,false,catetipoafiliacion);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessCateTipoAfiliacion();
			
      		//this.finishProcessCateTipoAfiliacion(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarCateTipoAfiliacionReturnGeneral() throws Exception {
		if(this.catetipoafiliacionReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.catetipoafiliacionReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.catetipoafiliacionReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.catetipoafiliacionReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.catetipoafiliacionReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.catetipoafiliacionReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingCateTipoAfiliacion(false);
		}
		
		if(this.catetipoafiliacionReturnGeneral.getConRetornoLista() || this.catetipoafiliacionReturnGeneral.getConRetornoObjeto()) {
			if(this.catetipoafiliacionReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.catetipoafiliacionLogic.setCateTipoAfiliacions(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacions());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.catetipoafiliacionReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.catetipoafiliacionLogic.setCateTipoAfiliacion(this.catetipoafiliacionReturnGeneral.getCateTipoAfiliacion());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingCateTipoAfiliacion(false);
		}
	}
	
	public void actualizarParametrosGeneralCateTipoAfiliacion() throws Exception {
		
		
	}
	
	public ArrayList<CateTipoAfiliacion> getCateTipoAfiliacionsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioCateTipoAfiliacion) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionLogic.getCateTipoAfiliacions()) {
					if(catetipoafiliacionAux.getIsSelected()) {
						catetipoafiliacionsSeleccionados.add(catetipoafiliacionAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(CateTipoAfiliacion catetipoafiliacionAux:this.catetipoafiliacions) {
					if(catetipoafiliacionAux.getIsSelected()) {
						catetipoafiliacionsSeleccionados.add(catetipoafiliacionAux);				
					}
				}
			}
			
			if(catetipoafiliacionsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						catetipoafiliacionsSeleccionados.addAll(this.catetipoafiliacionLogic.getCateTipoAfiliacions());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						catetipoafiliacionsSeleccionados.addAll(this.catetipoafiliacions);				
					}
				}
			}
		} else {
			catetipoafiliacionsSeleccionados.add(this.catetipoafiliacion);
		}
		
		return catetipoafiliacionsSeleccionados;
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
	
	public void generarReporteCateTipoAfiliacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalCateTipoAfiliacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoCateTipoAfiliacionsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCateTipoAfiliacionsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoCateTipoAfiliacionsSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesCateTipoAfiliacionsSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Cate Tipo Afiliacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesCateTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();		
		
		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteCateTipoAfiliacions("Todos",catetipoafiliacionsSeleccionados);
		
	}	
	
	public void generarReporteNormalCateTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();		
		
		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteCateTipoAfiliacions("Todos",catetipoafiliacionsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionCateTipoAfiliacionsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();
		
		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteCateTipoAfiliacions("Todos",catetipoafiliacionsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoCateTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();		
		
		
		this.abrirInicializarFrameReporteDinamicoCateTipoAfiliacion();
		
		
		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoCateTipoAfiliacion();
		
		
		//this.generarReporteCateTipoAfiliacions("Todos",catetipoafiliacionsSeleccionados ,catetipoafiliacionImplementable,catetipoafiliacionImplementableHome);
	}
	
	public void mostrarImportacionCateTipoAfiliacions() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionCateTipoAfiliacion();
		
		this.abrirFrameImportacionCateTipoAfiliacion();		
		
			
		//this.generarReporteCateTipoAfiliacions("Todos",catetipoafiliacionsSeleccionados ,catetipoafiliacionImplementable,catetipoafiliacionImplementableHome);
	}
	
	public void importarCateTipoAfiliacions() throws Exception {		
	
	}
	
	public void exportarCateTipoAfiliacionsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelCateTipoAfiliacionsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoCateTipoAfiliacionsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlCateTipoAfiliacionsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Cate Tipo Afiliacion",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoCateTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();		
		
		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"catetipoafiliacion."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarCateTipoAfiliacion(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarCateTipoAfiliacion(catetipoafiliacionAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//catetipoafiliacionAux.setsDetalleGeneralEntityReporte(catetipoafiliacionAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarCateTipoAfiliacion(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=CateTipoAfiliacionConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CateTipoAfiliacionConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=catetipoafiliacion.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=catetipoafiliacion.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=catetipoafiliacion.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=catetipoafiliacion.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=catetipoafiliacion.getes_defecto().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelCateTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();		
		
		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"catetipoafiliacion.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("CateTipoAfiliacions");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelCateTipoAfiliacion(row);				
				iRow++;
			}				
			
			for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelCateTipoAfiliacion(catetipoafiliacionAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlCateTipoAfiliacionsSeleccionados() throws Exception {
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();		
		
		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"catetipoafiliacion.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("catetipoafiliacions");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("catetipoafiliacion");
			//elementRoot.appendChild(element);
		
			for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsSeleccionados) {
				element = document.createElement("catetipoafiliacion");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlCateTipoAfiliacion(catetipoafiliacionAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Cate Tipo Afiliacion",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelCateTipoAfiliacion(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(catetipoafiliacion.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(catetipoafiliacion.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(catetipoafiliacion.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(catetipoafiliacion.getes_defecto());				
	}
	
	public void setFilaDatosExportarXmlCateTipoAfiliacion(CateTipoAfiliacion catetipoafiliacion,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(CateTipoAfiliacionConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(catetipoafiliacion.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(CateTipoAfiliacionConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(catetipoafiliacion.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(CateTipoAfiliacionConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(catetipoafiliacion.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(CateTipoAfiliacionConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(catetipoafiliacion.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementes_defecto = document.createElement(CateTipoAfiliacionConstantesFunciones.ESDEFECTO);
		elementes_defecto.appendChild(document.createTextNode(catetipoafiliacion.getes_defecto().toString().trim()));
		element.appendChild(elementes_defecto);
	}
	
	public void generarReporteGroupGenericoCateTipoAfiliacionsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados=new ArrayList<CateTipoAfiliacion>();
		
		catetipoafiliacionsSeleccionados=this.getCateTipoAfiliacionsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoCateTipoAfiliacion(catetipoafiliacionsSeleccionados);
		
		this.generarReporteCateTipoAfiliacions("Todos",catetipoafiliacionsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoCateTipoAfiliacion(ArrayList<CateTipoAfiliacion> catetipoafiliacionsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(CateTipoAfiliacion catetipoafiliacionAux:catetipoafiliacionsSeleccionados) {
				catetipoafiliacionAux.setsDetalleGeneralEntityReporte(catetipoafiliacionAux.toString());
			
				if(sTipoSeleccionar.equals(CateTipoAfiliacionConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					catetipoafiliacionAux.setsDescripcionGeneralEntityReporte1(catetipoafiliacionAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(CateTipoAfiliacionConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					catetipoafiliacionAux.setsDescripcionGeneralEntityReporte1(catetipoafiliacionAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(CateTipoAfiliacionConstantesFunciones.LABEL_ESDEFECTO)) {
					existe=true;
					catetipoafiliacionAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(catetipoafiliacionAux.getes_defecto()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,CateTipoAfiliacionConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesCateTipoAfiliacion(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoCateTipoAfiliacion=true;
				this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=true;
				this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=true;
			}
			
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=true;
				} else {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=true;
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=true;
				} else {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=true;
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=true;
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=true;
				} else {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=true;
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				} else {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=true;
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=true;
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=true;
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=true;
				} else {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=false;
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				} else {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=false;
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=false;
			this.isVisibilidadCeldaModificarCateTipoAfiliacion=true;
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaCancelarCateTipoAfiliacion=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				} else {
					this.isVisibilidadCeldaGuardarCateTipoAfiliacion=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(CateTipoAfiliacionJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=true;
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=true;
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=true;
		} else {
			this.actualizarEstadoPanelsCateTipoAfiliacion(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarCateTipoAfiliacion=false;
			//this.isVisibilidadCeldaVerFormCateTipoAfiliacion=false;
			this.isVisibilidadCeldaDuplicarCateTipoAfiliacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!catetipoafiliacionSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;
		} else {
			this.isVisibilidadCeldaNuevoCateTipoAfiliacion=false;
			this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
			if(!catetipoafiliacionSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;												
			}
			
			this.jButtonCerrarCateTipoAfiliacion.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesCateTipoAfiliacion=false;
		}
		
		if(!this.permiteMantenimiento(this.catetipoafiliacion)) {
			this.isVisibilidadCeldaActualizarCateTipoAfiliacion=false;
			this.isVisibilidadCeldaEliminarCateTipoAfiliacion=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesCateTipoAfiliacion() {
		this.isVisibilidadCeldaNuevoCateTipoAfiliacion=false;
		this.isVisibilidadCeldaGuardarCambiosCateTipoAfiliacion=false;
	}
	
	public void actualizarEstadoPanelsCateTipoAfiliacion(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionCateTipoAfiliacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosCateTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionCateTipoAfiliacion!=null) {
				this.jPanelPaginacionCateTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCateTipoAfiliacion!=null) {
				this.jPanelParametrosReportesCateTipoAfiliacion.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionCateTipoAfiliacion.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosCateTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionCateTipoAfiliacion!=null) {
				this.jPanelPaginacionCateTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCateTipoAfiliacion!=null) {
				this.jPanelParametrosReportesCateTipoAfiliacion.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionCateTipoAfiliacion.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosCateTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionCateTipoAfiliacion!=null) {
				this.jPanelPaginacionCateTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCateTipoAfiliacion!=null) {
				this.jPanelParametrosReportesCateTipoAfiliacion.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionCateTipoAfiliacion.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosCateTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelPaginacionCateTipoAfiliacion!=null) {
				this.jPanelPaginacionCateTipoAfiliacion.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesCateTipoAfiliacion!=null) {
				this.jPanelParametrosReportesCateTipoAfiliacion.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionCateTipoAfiliacion.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosCateTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionCateTipoAfiliacion!=null) {
				this.jPanelPaginacionCateTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCateTipoAfiliacion!=null) {
				this.jPanelParametrosReportesCateTipoAfiliacion.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionCateTipoAfiliacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosCateTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionCateTipoAfiliacion!=null) {
				this.jPanelPaginacionCateTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCateTipoAfiliacion!=null) {
				this.jPanelParametrosReportesCateTipoAfiliacion.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosEdicionCateTipoAfiliacion.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosCateTipoAfiliacion!=null) {
				this.jScrollPanelDatosCateTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelPaginacionCateTipoAfiliacion!=null) {
				this.jPanelPaginacionCateTipoAfiliacion.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesCateTipoAfiliacion!=null) {
				this.jPanelParametrosReportesCateTipoAfiliacion.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.catetipoafiliacionSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionCateTipoAfiliacionParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.catetipoafiliacionSessionBean==null) {
				this.catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteSessionBean.setsPathNavegacionActual(catetipoafiliacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(CateTipoAfiliacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteSessionBean.setisBusquedaDesdeForeignKeySesionCateTipoAfiliacion(true);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.clienteSessionBean.setlidCateTipoAfiliacionActual(this.idCateTipoAfiliacionActual);

			catetipoafiliacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCateTipoAfiliacion(true);
			catetipoafiliacionSessionBean.setlIdCateTipoAfiliacionActualForeignKey(this.idCateTipoAfiliacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionCateTipoAfiliacionParaTipoAfiliaciones() throws Exception {
		Boolean isPaginaPopupTipoAfiliacion=false;

		try {

			if(this.catetipoafiliacionSessionBean==null) {
				this.catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
			}

			if(this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionSessionBean==null) {
				this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionSessionBean=new TipoAfiliacionSessionBean();
			}

			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionSessionBean.setsPathNavegacionActual(catetipoafiliacionSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TipoAfiliacionConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTipoAfiliacion=this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTipoAfiliacion(true);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoAfiliacion(CateTipoAfiliacionConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionSessionBean.setisBusquedaDesdeForeignKeySesionCateTipoAfiliacion(true);
			this.jInternalFrameDetalleFormCateTipoAfiliacion.tipoafiliacionSessionBean.setlidCateTipoAfiliacionActual(this.idCateTipoAfiliacionActual);

			catetipoafiliacionSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyCateTipoAfiliacion(true);
			catetipoafiliacionSessionBean.setlIdCateTipoAfiliacionActualForeignKey(this.idCateTipoAfiliacionActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//CateTipoAfiliacionSessionBean catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
		
		if(this.catetipoafiliacionSessionBean==null) {
			this.catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
		}
		
		this.catetipoafiliacionSessionBean.setsUltimaBusquedaCateTipoAfiliacion(this.getsAccionBusqueda());
		this.catetipoafiliacionSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.catetipoafiliacionSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//CateTipoAfiliacionSessionBean catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
		
		if(this.catetipoafiliacionSessionBean==null) {
			this.catetipoafiliacionSessionBean=new CateTipoAfiliacionSessionBean();
		}
		
		if(this.catetipoafiliacionSessionBean.getsUltimaBusquedaCateTipoAfiliacion()!=null&&!this.catetipoafiliacionSessionBean.getsUltimaBusquedaCateTipoAfiliacion().equals("")) {
			this.setsAccionBusqueda(catetipoafiliacionSessionBean.getsUltimaBusquedaCateTipoAfiliacion());
			this.setiNumeroPaginacion(catetipoafiliacionSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(catetipoafiliacionSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.catetipoafiliacionSessionBean.setsUltimaBusquedaCateTipoAfiliacion("");
		this.catetipoafiliacionSessionBean.setiNumeroPaginacion(CateTipoAfiliacionConstantesFunciones.INUMEROPAGINACION);
		this.catetipoafiliacionSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaCateTipoAfiliacion(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioCateTipoAfiliacion() {
		this.updateBorderResaltarBusquedasFormularioCateTipoAfiliacion();
		this.updateVisibilidadBusquedasFormularioCateTipoAfiliacion();
		this.updateHabilitarBusquedasFormularioCateTipoAfiliacion();
	}
	
	public void updateBorderResaltarBusquedasFormularioCateTipoAfiliacion() {					
	}
	
	public void updateVisibilidadBusquedasFormularioCateTipoAfiliacion() {
	}
	
	public void updateHabilitarBusquedasFormularioCateTipoAfiliacion() {
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
	
	public void updateControlesFormularioCateTipoAfiliacion() throws Exception {

		if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioCateTipoAfiliacion();
		this.updateVisibilidadResaltarControlesFormularioCateTipoAfiliacion();
		this.updateHabilitarResaltarControlesFormularioCateTipoAfiliacion();
		
	}
	
	public void updateBorderResaltarControlesFormularioCateTipoAfiliacion() throws Exception {
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.catetipoafiliacionConstantesFunciones.resaltaridCateTipoAfiliacion!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.setBorder(this.catetipoafiliacionConstantesFunciones.resaltaridCateTipoAfiliacion);}
		if(this.catetipoafiliacionConstantesFunciones.resaltarcodigoCateTipoAfiliacion!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldcodigoCateTipoAfiliacion.setBorder(this.catetipoafiliacionConstantesFunciones.resaltarcodigoCateTipoAfiliacion);}
		if(this.catetipoafiliacionConstantesFunciones.resaltarnombreCateTipoAfiliacion!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextAreanombreCateTipoAfiliacion.setBorder(this.catetipoafiliacionConstantesFunciones.resaltarnombreCateTipoAfiliacion);}
		if(this.catetipoafiliacionConstantesFunciones.resaltares_defectoCateTipoAfiliacion!=null && this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxes_defectoCateTipoAfiliacion.setBorderPainted(true);this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxes_defectoCateTipoAfiliacion.setBorder(this.catetipoafiliacionConstantesFunciones.resaltares_defectoCateTipoAfiliacion);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioCateTipoAfiliacion() throws Exception {		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
	
		//this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.setVisible(this.catetipoafiliacionConstantesFunciones.mostraridCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jPanelidCateTipoAfiliacion.setVisible(this.catetipoafiliacionConstantesFunciones.mostraridCateTipoAfiliacion);
		//this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldcodigoCateTipoAfiliacion.setVisible(this.catetipoafiliacionConstantesFunciones.mostrarcodigoCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jPanelcodigoCateTipoAfiliacion.setVisible(this.catetipoafiliacionConstantesFunciones.mostrarcodigoCateTipoAfiliacion);
		//this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextAreanombreCateTipoAfiliacion.setVisible(this.catetipoafiliacionConstantesFunciones.mostrarnombreCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jPanelnombreCateTipoAfiliacion.setVisible(this.catetipoafiliacionConstantesFunciones.mostrarnombreCateTipoAfiliacion);
		//this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxes_defectoCateTipoAfiliacion.setVisible(this.catetipoafiliacionConstantesFunciones.mostrares_defectoCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jPaneles_defectoCateTipoAfiliacion.setVisible(this.catetipoafiliacionConstantesFunciones.mostrares_defectoCateTipoAfiliacion);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioCateTipoAfiliacion() throws Exception {
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormCateTipoAfiliacion!=null) {
	
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldidCateTipoAfiliacion.setEnabled(this.catetipoafiliacionConstantesFunciones.activaridCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextFieldcodigoCateTipoAfiliacion.setEnabled(this.catetipoafiliacionConstantesFunciones.activarcodigoCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jTextAreanombreCateTipoAfiliacion.setEnabled(this.catetipoafiliacionConstantesFunciones.activarnombreCateTipoAfiliacion);
		this.jInternalFrameDetalleFormCateTipoAfiliacion.jCheckBoxes_defectoCateTipoAfiliacion.setEnabled(this.catetipoafiliacionConstantesFunciones.activares_defectoCateTipoAfiliacion);
		}
	}
	
		
}