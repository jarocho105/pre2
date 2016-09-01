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

import com.bydan.erp.contabilidad.util.TipoMovimientoModuloConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoMovimientoModuloParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoMovimientoModuloParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoMovimientoModuloBean;
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
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoMovimientoModuloBeanSwingJInternalFrame extends TipoMovimientoModuloJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoMovimientoModuloBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoMovimientoModulo> tipomovimientomoduloValidator = new ClassValidator<TipoMovimientoModulo>(TipoMovimientoModulo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoMovimientoModulo tipomovimientomodulo;	
	public TipoMovimientoModulo tipomovimientomoduloAux;
	public TipoMovimientoModulo tipomovimientomoduloAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoMovimientoModulo tipomovimientomoduloTotales;
	public Long idTipoMovimientoModuloActual;
	public Long iIdNuevoTipoMovimientoModulo=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboModulo="";

	public List<Modulo> modulosForeignKey;

	public List<Modulo> getmodulosForeignKey() {
		return modulosForeignKey;
	}

	public void setmodulosForeignKey(List<Modulo> modulosForeignKey) {
		this.modulosForeignKey = modulosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Modulo moduloForeignKey;

	public Modulo getmoduloForeignKey() {
		return moduloForeignKey;
	}

	public void setmoduloForeignKey(Modulo moduloForeignKey) {
		this.moduloForeignKey = moduloForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosParametroCompra=false;

	public Boolean getIsTienePermisosParametroCompra() {
		return isTienePermisosParametroCompra;
	}

	public void setIsTienePermisosParametroCompra(Boolean isTienePermisosParametroCompra) {
		this.isTienePermisosParametroCompra= isTienePermisosParametroCompra;
	}


	public Boolean isTienePermisosFacturaProveedorServicio=false;

	public Boolean getIsTienePermisosFacturaProveedorServicio() {
		return isTienePermisosFacturaProveedorServicio;
	}

	public void setIsTienePermisosFacturaProveedorServicio(Boolean isTienePermisosFacturaProveedorServicio) {
		this.isTienePermisosFacturaProveedorServicio= isTienePermisosFacturaProveedorServicio;
	}


	public Boolean isTienePermisosSecuencial=false;

	public Boolean getIsTienePermisosSecuencial() {
		return isTienePermisosSecuencial;
	}

	public void setIsTienePermisosSecuencial(Boolean isTienePermisosSecuencial) {
		this.isTienePermisosSecuencial= isTienePermisosSecuencial;
	}


	public Boolean isTienePermisosTipoDocumento=false;

	public Boolean getIsTienePermisosTipoDocumento() {
		return isTienePermisosTipoDocumento;
	}

	public void setIsTienePermisosTipoDocumento(Boolean isTienePermisosTipoDocumento) {
		this.isTienePermisosTipoDocumento= isTienePermisosTipoDocumento;
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
	
	public Boolean isPermisoTodoTipoMovimientoModulo;
	public Boolean isPermisoNuevoTipoMovimientoModulo;
	public Boolean isPermisoActualizarTipoMovimientoModulo;
	public Boolean isPermisoActualizarOriginalTipoMovimientoModulo;
	public Boolean isPermisoEliminarTipoMovimientoModulo;
	public Boolean isPermisoGuardarCambiosTipoMovimientoModulo;
	public Boolean isPermisoConsultaTipoMovimientoModulo;
	public Boolean isPermisoBusquedaTipoMovimientoModulo;
	public Boolean isPermisoReporteTipoMovimientoModulo;
	public Boolean isPermisoPaginacionMedioTipoMovimientoModulo;
	public Boolean isPermisoPaginacionAltoTipoMovimientoModulo;
	public Boolean isPermisoPaginacionTodoTipoMovimientoModulo;
	public Boolean isPermisoCopiarTipoMovimientoModulo;
	public Boolean isPermisoVerFormTipoMovimientoModulo;
	public Boolean isPermisoDuplicarTipoMovimientoModulo;
	public Boolean isPermisoOrdenTipoMovimientoModulo;
	
	
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
	
	public TipoMovimientoModuloParameterReturnGeneral tipomovimientomoduloReturnGeneral;
	public TipoMovimientoModuloParameterReturnGeneral tipomovimientomoduloParameterGeneral;
	
	

	public ParametroCompraLogic parametrocompraLogic=null;

	public ParametroCompraLogic getParametroCompraLogic() {
		return parametrocompraLogic;
	}

	public void setParametroCompraLogic(ParametroCompraLogic parametrocompraLogic) {
		this.parametrocompraLogic = parametrocompraLogic;
	}


	public FacturaProveedorServicioLogic facturaproveedorservicioLogic=null;

	public FacturaProveedorServicioLogic getFacturaProveedorServicioLogic() {
		return facturaproveedorservicioLogic;
	}

	public void setFacturaProveedorServicioLogic(FacturaProveedorServicioLogic facturaproveedorservicioLogic) {
		this.facturaproveedorservicioLogic = facturaproveedorservicioLogic;
	}


	public SecuencialLogic secuencialLogic=null;

	public SecuencialLogic getSecuencialLogic() {
		return secuencialLogic;
	}

	public void setSecuencialLogic(SecuencialLogic secuencialLogic) {
		this.secuencialLogic = secuencialLogic;
	}


	public TipoDocumentoLogic tipodocumentoLogic=null;

	public TipoDocumentoLogic getTipoDocumentoLogic() {
		return tipodocumentoLogic;
	}

	public void setTipoDocumentoLogic(TipoDocumentoLogic tipodocumentoLogic) {
		this.tipodocumentoLogic = tipodocumentoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoMovimientoModulo=false;
	public Boolean esParaAccionDesdeFormularioTipoMovimientoModulo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoMovimientoModuloSessionBeanAdditional tipomovimientomoduloSessionBeanAdditional=null;
	
	public TipoMovimientoModuloSessionBeanAdditional getTipoMovimientoModuloSessionBeanAdditional() {
		return this.tipomovimientomoduloSessionBeanAdditional;
	}
	
	public void setTipoMovimientoModuloSessionBeanAdditional(TipoMovimientoModuloSessionBeanAdditional tipomovimientomoduloSessionBeanAdditional) {
		try {
			this.tipomovimientomoduloSessionBeanAdditional=tipomovimientomoduloSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoMovimientoModuloBeanSwingJInternalFrameAdditional tipomovimientomoduloBeanSwingJInternalFrameAdditional=null;
	//public class TipoMovimientoModuloBeanSwingJInternalFrame
	
	public TipoMovimientoModuloBeanSwingJInternalFrameAdditional getTipoMovimientoModuloBeanSwingJInternalFrameAdditional() {
		return this.tipomovimientomoduloBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoMovimientoModuloBeanSwingJInternalFrameAdditional(TipoMovimientoModuloBeanSwingJInternalFrameAdditional tipomovimientomoduloBeanSwingJInternalFrameAdditional) {
		try {
			this.tipomovimientomoduloBeanSwingJInternalFrameAdditional=tipomovimientomoduloBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoMovimientoModuloLogic tipomovimientomoduloLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoMovimientoModulo tipomovimientomoduloBean;
	public TipoMovimientoModuloConstantesFunciones tipomovimientomoduloConstantesFunciones;
	//public TipoMovimientoModuloParameterReturnGeneral tipomovimientomoduloReturnGeneral;
	
	//FK
	
	public ModuloLogic moduloLogic;
	
	//PARAMETROS
	
	
	//public List<TipoMovimientoModulo> tipomovimientomodulos;	
	//public List<TipoMovimientoModulo> tipomovimientomodulosEliminados;
	//public List<TipoMovimientoModulo> tipomovimientomodulosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoMovimientoModulo=false;
	public Boolean isVisibilidadCeldaDuplicarTipoMovimientoModulo=true;
	public Boolean isVisibilidadCeldaCopiarTipoMovimientoModulo=true;
	public Boolean isVisibilidadCeldaVerFormTipoMovimientoModulo=true;
	public Boolean isVisibilidadCeldaOrdenTipoMovimientoModulo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;
	public Boolean isVisibilidadCeldaModificarTipoMovimientoModulo=false;
	public Boolean isVisibilidadCeldaActualizarTipoMovimientoModulo=false;
	public Boolean isVisibilidadCeldaEliminarTipoMovimientoModulo=false;
	public Boolean isVisibilidadCeldaCancelarTipoMovimientoModulo=false;
	public Boolean isVisibilidadCeldaGuardarTipoMovimientoModulo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=false;	
	
	
	public Boolean isVisibilidadBusquedaPorCodigo=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadFK_IdModulo=false;
	
	public Long getiIdNuevoTipoMovimientoModulo() {
		return this.iIdNuevoTipoMovimientoModulo;
	}

	public void setiIdNuevoTipoMovimientoModulo(Long iIdNuevoTipoMovimientoModulo) {
		this.iIdNuevoTipoMovimientoModulo = iIdNuevoTipoMovimientoModulo;
	}
	
	public Long getidTipoMovimientoModuloActual() {
		return this.idTipoMovimientoModuloActual;
	}

	public void setidTipoMovimientoModuloActual(Long idTipoMovimientoModuloActual) {
		this.idTipoMovimientoModuloActual = idTipoMovimientoModuloActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoMovimientoModulo gettipomovimientomodulo() {
		return this.tipomovimientomodulo;
	}

	public void settipomovimientomodulo(TipoMovimientoModulo tipomovimientomodulo) {
		this.tipomovimientomodulo = tipomovimientomodulo;
	}
	
	public TipoMovimientoModulo gettipomovimientomoduloAux() {
		return this.tipomovimientomoduloAux;
	}

	public void settipomovimientomoduloAux(TipoMovimientoModulo tipomovimientomoduloAux) {
		this.tipomovimientomoduloAux = tipomovimientomoduloAux;
	}				
	
	public TipoMovimientoModulo gettipomovimientomoduloAnterior() {
		return this.tipomovimientomoduloAnterior;
	}

	public void settipomovimientomoduloAnterior(TipoMovimientoModulo tipomovimientomoduloAnterior) {
		this.tipomovimientomoduloAnterior = tipomovimientomoduloAnterior;
	}	
	
	public TipoMovimientoModulo gettipomovimientomoduloTotales() {
		return this.tipomovimientomoduloTotales;
	}

	public void settipomovimientomoduloTotales(TipoMovimientoModulo tipomovimientomoduloTotales) {
		this.tipomovimientomoduloTotales = tipomovimientomoduloTotales;
	}	
	
	public TipoMovimientoModulo gettipomovimientomoduloBean() {
		return this.tipomovimientomoduloBean;
	}

	public void settipomovimientomoduloBean(TipoMovimientoModulo tipomovimientomoduloBean) {
		this.tipomovimientomoduloBean = tipomovimientomoduloBean;
	}	
	
	public TipoMovimientoModuloParameterReturnGeneral gettipomovimientomoduloReturnGeneral() {
		return this.tipomovimientomoduloReturnGeneral;
	}

	public void settipomovimientomoduloReturnGeneral(TipoMovimientoModuloParameterReturnGeneral tipomovimientomoduloReturnGeneral) {
		this.tipomovimientomoduloReturnGeneral = tipomovimientomoduloReturnGeneral;
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

	public Long id_moduloFK_IdModulo=-1L;

	public Long getid_moduloFK_IdModulo() {
		return this.id_moduloFK_IdModulo;
	}

	public void setid_moduloFK_IdModulo(Long id_moduloFK_IdModulo) {
		this.id_moduloFK_IdModulo = id_moduloFK_IdModulo;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoMovimientoModuloLogic getTipoMovimientoModuloLogic()	{		
		return tipomovimientomoduloLogic;
	}

	public void setTipoMovimientoModuloLogic(TipoMovimientoModuloLogic tipomovimientomoduloLogic) {
		this.tipomovimientomoduloLogic = tipomovimientomoduloLogic;
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
	
	public Boolean getIsEsNuevoTipoMovimientoModulo() {
		return isEsNuevoTipoMovimientoModulo;
	}

	public void setIsEsNuevoTipoMovimientoModulo(Boolean isEsNuevoTipoMovimientoModulo) {
		this.isEsNuevoTipoMovimientoModulo = isEsNuevoTipoMovimientoModulo;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoMovimientoModulo() {
		return esParaAccionDesdeFormularioTipoMovimientoModulo;
	}
	
	public void setEsParaAccionDesdeFormularioTipoMovimientoModulo(Boolean esParaAccionDesdeFormularioTipoMovimientoModulo) {
		this.esParaAccionDesdeFormularioTipoMovimientoModulo = esParaAccionDesdeFormularioTipoMovimientoModulo;
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
	
	
	public void cargarCombosModulosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.modulosForeignKey=new ArrayList<Modulo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ModuloLogic moduloLogic=new ModuloLogic();

			moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

			if(this.tipomovimientomoduloSessionBean==null) {
				this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
			}

			if(!this.tipomovimientomoduloSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getModuloDataAccess().setIsForForeingKeyData(true);

					moduloLogic.getTodosModulosWithConnection(sFinalQuery,new Pagination());

					this.modulosForeignKey=moduloLogic.getModulos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaModulo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					moduloLogic.getEntityWithConnection(tipomovimientomoduloSessionBean.getlidModuloActual());
					this.modulosForeignKey.add(moduloLogic.getModulo());
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

	
	
	public void setActualModuloForeignKey(Long idModuloSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(moduloTemp!=null) {

					if(this.tipomovimientomodulo!=null) {
						this.tipomovimientomodulo.setModulo(moduloTemp);
					}

					if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
						this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.setSelectedItem(moduloTemp);
					}
				} else {
					//jComboBoxid_moduloTipoMovimientoModulo.setSelectedItem(moduloTemp);
					if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
						if(this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){
					if(moduloTemp!=null && jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo!=null) {
						jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.setSelectedItem(moduloTemp);
					} else {
						if(jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo!=null) {
							//jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.setSelectedItem(moduloTemp);
							if(jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.getItemCount()>0) {
								jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.setSelectedIndex(0);
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

	public String getActualModuloForeignKeyDescripcion(Long idModuloSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}


			sDescripcion=ModuloConstantesFunciones.getModuloDescripcion(moduloTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualModuloForeignKeyGenerico(Long idModuloSeleccionado,JComboBox jComboBoxid_moduloTipoMovimientoModuloGenerico)throws Exception
	{
		try
		{
			Modulo  moduloTemp=null;

			for(Modulo moduloAux:modulosForeignKey) {
				if(moduloAux.getId()!=null && moduloAux.getId().equals(idModuloSeleccionado)) {
					moduloTemp=moduloAux;
					break;
				}
			}

			if(moduloTemp!=null) {
				jComboBoxid_moduloTipoMovimientoModuloGenerico.setSelectedItem(moduloTemp);
			} else {
				if(jComboBoxid_moduloTipoMovimientoModuloGenerico!=null && jComboBoxid_moduloTipoMovimientoModuloGenerico.getItemCount()>0) {
					jComboBoxid_moduloTipoMovimientoModuloGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarModuloForeignKey(TipoMovimientoModulo tipomovimientomodulo,JComboBox jComboBoxid_moduloTipoMovimientoModuloGenerico)throws Exception
	{
		try
		{
			Modulo  moduloAux=new Modulo();

			if(jComboBoxid_moduloTipoMovimientoModuloGenerico==null) {
				moduloAux=(Modulo)this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.getSelectedItem();
			} else {
				moduloAux=(Modulo)jComboBoxid_moduloTipoMovimientoModuloGenerico.getSelectedItem();
			}

			if(moduloAux!=null && moduloAux.getId()!=null) {
				tipomovimientomodulo.setid_modulo(moduloAux.getId());
				tipomovimientomodulo.setmodulo_descripcion(TipoMovimientoModuloConstantesFunciones.getModuloDescripcion(moduloAux));
				tipomovimientomodulo.setModulo(moduloAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameModulosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingModulo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { 
							this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.addItem(modulo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { 
					}

					if(!TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdModulo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.removeAllItems();

							for(Modulo modulo:this.modulosForeignKey) {
								this.jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.addItem(modulo);
							}
						}

						if(!TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameModuloForeignKey(Modulo modulo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
							this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.setSelectedItem(modulo);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
							this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.setSelectedItem(modulo);
						} else {
							this.jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTipoMovimientoModulo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoMovimientoModuloConstantesFunciones.refrescarForeignKeysDescripcionesTipoMovimientoModulo(this.tipomovimientomoduloLogic.getTipoMovimientoModulos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoMovimientoModuloConstantesFunciones.refrescarForeignKeysDescripcionesTipoMovimientoModulo(this.tipomovimientomodulos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Modulo.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipomovimientomoduloLogic.setTipoMovimientoModulos(this.tipomovimientomodulos);
			tipomovimientomoduloLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoMovimientoModuloParameterReturnGeneral getTipoMovimientoModuloParameterGeneral() {
		return this.tipomovimientomoduloParameterGeneral;
	}
	
	public void setTipoMovimientoModuloParameterGeneral(TipoMovimientoModuloParameterReturnGeneral tipomovimientomoduloParameterGeneral) {
		this.tipomovimientomoduloParameterGeneral = tipomovimientomoduloParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoMovimientoModulo() {
		return isPermisoTodoTipoMovimientoModulo;
	}

	public void setIsPermisoTodoTipoMovimientoModulo(Boolean isPermisoTodoTipoMovimientoModulo) {
		this.isPermisoTodoTipoMovimientoModulo = isPermisoTodoTipoMovimientoModulo;
	}

	public Boolean getIsPermisoNuevoTipoMovimientoModulo() {
		return isPermisoNuevoTipoMovimientoModulo;
	}

	public void setIsPermisoNuevoTipoMovimientoModulo(Boolean isPermisoNuevoTipoMovimientoModulo) {
		this.isPermisoNuevoTipoMovimientoModulo = isPermisoNuevoTipoMovimientoModulo;
	}

	public Boolean getIsPermisoActualizarTipoMovimientoModulo() {
		return isPermisoActualizarTipoMovimientoModulo;
	}

	public void setIsPermisoActualizarTipoMovimientoModulo(Boolean isPermisoActualizarTipoMovimientoModulo) {
		this.isPermisoActualizarTipoMovimientoModulo = isPermisoActualizarTipoMovimientoModulo;
	}

	public Boolean getIsPermisoEliminarTipoMovimientoModulo() {
		return isPermisoEliminarTipoMovimientoModulo;
	}

	public void setIsPermisoEliminarTipoMovimientoModulo(Boolean isPermisoEliminarTipoMovimientoModulo) {
		this.isPermisoEliminarTipoMovimientoModulo = isPermisoEliminarTipoMovimientoModulo;
	}

	public Boolean getIsPermisoGuardarCambiosTipoMovimientoModulo() {
		return isPermisoGuardarCambiosTipoMovimientoModulo;
	}

	public void setIsPermisoGuardarCambiosTipoMovimientoModulo(Boolean isPermisoGuardarCambiosTipoMovimientoModulo) {
		this.isPermisoGuardarCambiosTipoMovimientoModulo = isPermisoGuardarCambiosTipoMovimientoModulo;
	}
	
	public Boolean getIsPermisoConsultaTipoMovimientoModulo() {
		return isPermisoConsultaTipoMovimientoModulo;
	}

	public void setIsPermisoConsultaTipoMovimientoModulo(Boolean isPermisoConsultaTipoMovimientoModulo) {
		this.isPermisoConsultaTipoMovimientoModulo = isPermisoConsultaTipoMovimientoModulo;
	}

	public Boolean getIsPermisoBusquedaTipoMovimientoModulo() {
		return isPermisoBusquedaTipoMovimientoModulo;
	}

	public void setIsPermisoBusquedaTipoMovimientoModulo(Boolean isPermisoBusquedaTipoMovimientoModulo) {
		this.isPermisoBusquedaTipoMovimientoModulo = isPermisoBusquedaTipoMovimientoModulo;
	}

	public Boolean getIsPermisoReporteTipoMovimientoModulo() {
		return isPermisoReporteTipoMovimientoModulo;
	}

	public void setIsPermisoReporteTipoMovimientoModulo(Boolean isPermisoReporteTipoMovimientoModulo) {
		this.isPermisoReporteTipoMovimientoModulo = isPermisoReporteTipoMovimientoModulo;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoMovimientoModulo() {
		return isPermisoPaginacionMedioTipoMovimientoModulo;
	}

	public void setIsPermisoPaginacionMedioTipoMovimientoModulo(Boolean isPermisoPaginacionMedioTipoMovimientoModulo) {
		this.isPermisoPaginacionMedioTipoMovimientoModulo = isPermisoPaginacionMedioTipoMovimientoModulo;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoMovimientoModulo() {
		return isPermisoPaginacionTodoTipoMovimientoModulo;
	}

	public void setIsPermisoPaginacionTodoTipoMovimientoModulo(Boolean isPermisoPaginacionTodoTipoMovimientoModulo) {
		this.isPermisoPaginacionTodoTipoMovimientoModulo = isPermisoPaginacionTodoTipoMovimientoModulo;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoMovimientoModulo() {
		return isPermisoPaginacionAltoTipoMovimientoModulo;
	}

	public void setIsPermisoPaginacionAltoTipoMovimientoModulo(Boolean isPermisoPaginacionAltoTipoMovimientoModulo) {
		this.isPermisoPaginacionAltoTipoMovimientoModulo = isPermisoPaginacionAltoTipoMovimientoModulo;
	}
	
	public Boolean getIsPermisoCopiarTipoMovimientoModulo() {
		return isPermisoCopiarTipoMovimientoModulo;
	}

	public void setIsPermisoCopiarTipoMovimientoModulo(Boolean isPermisoCopiarTipoMovimientoModulo) {
		this.isPermisoCopiarTipoMovimientoModulo = isPermisoCopiarTipoMovimientoModulo;
	}
	
	public Boolean getIsPermisoVerFormTipoMovimientoModulo() {
		return isPermisoVerFormTipoMovimientoModulo;
	}

	public void setIsPermisoVerFormTipoMovimientoModulo(Boolean isPermisoVerFormTipoMovimientoModulo) {
		this.isPermisoVerFormTipoMovimientoModulo = isPermisoVerFormTipoMovimientoModulo;
	}
	
	public Boolean getIsPermisoDuplicarTipoMovimientoModulo() {
		return isPermisoDuplicarTipoMovimientoModulo;
	}

	public void setIsPermisoDuplicarTipoMovimientoModulo(Boolean isPermisoDuplicarTipoMovimientoModulo) {
		this.isPermisoDuplicarTipoMovimientoModulo = isPermisoDuplicarTipoMovimientoModulo;
	}
	
	public Boolean getIsPermisoOrdenTipoMovimientoModulo() {
		return isPermisoOrdenTipoMovimientoModulo;
	}

	public void setIsPermisoOrdenTipoMovimientoModulo(Boolean isPermisoOrdenTipoMovimientoModulo) {
		this.isPermisoOrdenTipoMovimientoModulo = isPermisoOrdenTipoMovimientoModulo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoMovimientoModulo() {
		return isVisibilidadCeldaNuevoTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaNuevoTipoMovimientoModulo(Boolean isVisibilidadCeldaNuevoTipoMovimientoModulo) {
		this.isVisibilidadCeldaNuevoTipoMovimientoModulo = isVisibilidadCeldaNuevoTipoMovimientoModulo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoMovimientoModulo() {
		return isVisibilidadCeldaDuplicarTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaDuplicarTipoMovimientoModulo(Boolean isVisibilidadCeldaDuplicarTipoMovimientoModulo) {
		this.isVisibilidadCeldaDuplicarTipoMovimientoModulo = isVisibilidadCeldaDuplicarTipoMovimientoModulo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoMovimientoModulo() {
		return isVisibilidadCeldaCopiarTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaCopiarTipoMovimientoModulo(Boolean isVisibilidadCeldaCopiarTipoMovimientoModulo) {
		this.isVisibilidadCeldaCopiarTipoMovimientoModulo = isVisibilidadCeldaCopiarTipoMovimientoModulo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoMovimientoModulo() {
		return isVisibilidadCeldaVerFormTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaVerFormTipoMovimientoModulo(Boolean isVisibilidadCeldaVerFormTipoMovimientoModulo) {
		this.isVisibilidadCeldaVerFormTipoMovimientoModulo = isVisibilidadCeldaVerFormTipoMovimientoModulo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoMovimientoModulo() {
		return isVisibilidadCeldaOrdenTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaOrdenTipoMovimientoModulo(Boolean isVisibilidadCeldaOrdenTipoMovimientoModulo) {
		this.isVisibilidadCeldaOrdenTipoMovimientoModulo = isVisibilidadCeldaOrdenTipoMovimientoModulo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo() {
		return isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo(Boolean isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo) {
		this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo = isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoMovimientoModulo() {
		return isVisibilidadCeldaModificarTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaModificarTipoMovimientoModulo(Boolean isVisibilidadCeldaModificarTipoMovimientoModulo) {
		this.isVisibilidadCeldaModificarTipoMovimientoModulo = isVisibilidadCeldaModificarTipoMovimientoModulo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoMovimientoModulo() {
		return isVisibilidadCeldaActualizarTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaActualizarTipoMovimientoModulo(Boolean isVisibilidadCeldaActualizarTipoMovimientoModulo) {
		this.isVisibilidadCeldaActualizarTipoMovimientoModulo = isVisibilidadCeldaActualizarTipoMovimientoModulo;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoMovimientoModulo() {
		return isVisibilidadCeldaEliminarTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaEliminarTipoMovimientoModulo(Boolean isVisibilidadCeldaEliminarTipoMovimientoModulo) {
		this.isVisibilidadCeldaEliminarTipoMovimientoModulo = isVisibilidadCeldaEliminarTipoMovimientoModulo;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoMovimientoModulo() {
		return isVisibilidadCeldaCancelarTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaCancelarTipoMovimientoModulo(Boolean isVisibilidadCeldaCancelarTipoMovimientoModulo) {
		this.isVisibilidadCeldaCancelarTipoMovimientoModulo = isVisibilidadCeldaCancelarTipoMovimientoModulo;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoMovimientoModulo() {
		return isVisibilidadCeldaGuardarTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaGuardarTipoMovimientoModulo(Boolean isVisibilidadCeldaGuardarTipoMovimientoModulo) {
		this.isVisibilidadCeldaGuardarTipoMovimientoModulo = isVisibilidadCeldaGuardarTipoMovimientoModulo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoMovimientoModulo() {
		return isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoMovimientoModulo(Boolean isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo) {
		this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo = isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo;
	}
		
	public TipoMovimientoModuloSessionBean gettipomovimientomoduloSessionBean() {
		return this.tipomovimientomoduloSessionBean;
	}
	
	public void settipomovimientomoduloSessionBean(TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean) {
		this.tipomovimientomoduloSessionBean=tipomovimientomoduloSessionBean;
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

	public Boolean getisVisibilidadFK_IdModulo() {
		return this.isVisibilidadFK_IdModulo;
	}

	public void setisVisibilidadFK_IdModulo(Boolean isVisibilidadFK_IdModulo) {
		this.isVisibilidadFK_IdModulo=isVisibilidadFK_IdModulo;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo)throws Exception {
		try {
			
				this.setActualParaGuardarModuloForeignKey(tipomovimientomodulo,null);
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
	
	public void bugActualizarReferenciaActual(TipoMovimientoModulo tipomovimientomodulo,TipoMovimientoModulo tipomovimientomoduloAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoMovimientoModulo(tipomovimientomodulo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipomovimientomoduloAux.setId(tipomovimientomodulo.getId());
		tipomovimientomoduloAux.setVersionRow(tipomovimientomodulo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoMovimientoModulo();
		
			int intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipomovimientomoduloValidator.getInvalidValues(this.tipomovimientomodulo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipomovimientomoduloLogic.setDatosCliente(datosCliente);
			tipomovimientomoduloLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipomovimientomoduloAux=new  TipoMovimientoModulo();
				
				tipomovimientomoduloAux.setIsNew(true);
				tipomovimientomoduloAux.setIsChanged(true);
				
				tipomovimientomoduloAux.setTipoMovimientoModuloOriginal(this.tipomovimientomodulo);
				
				tipomovimientomoduloAux.setId(this.tipomovimientomodulo.getId());	
				tipomovimientomoduloAux.setVersionRow(this.tipomovimientomodulo.getVersionRow());	
				tipomovimientomoduloAux.setid_modulo(this.tipomovimientomodulo.getid_modulo());	
				tipomovimientomoduloAux.setcodigo(this.tipomovimientomodulo.getcodigo());	
				tipomovimientomoduloAux.setnombre(this.tipomovimientomodulo.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipomovimientomoduloAux,tipomovimientomoduloLogic.getTipoMovimientoModulos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimientomoduloAux,tipomovimientomodulos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomoduloLogic.saveTipoMovimientoModulos();//WithConnection
						//tipomovimientomoduloLogic.getSetVersionRowTipoMovimientoModulos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomovimientomodulo,tipomovimientomoduloAux);
					
					this.refrescarForeignKeysDescripcionesTipoMovimientoModulo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialsEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompras.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencials.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialsEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentos.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomovimientomoduloLogic.saveTipoMovimientoModuloRelaciones(tipomovimientomoduloAux,this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras(),this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios(),this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials(),this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos());//WithConnection
								//tipomovimientomoduloLogic.getSetVersionRowTipoMovimientoModulos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomovimientomodulo,tipomovimientomoduloAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(new ArrayList<ParametroCompra>());
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(new ArrayList<FacturaProveedorServicio>());
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.setSecuencials(new ArrayList<Secuencial>());
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompras= new ArrayList<ParametroCompra>();
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios= new ArrayList<FacturaProveedorServicio>();
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencials= new ArrayList<Secuencial>();
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentos= new ArrayList<TipoDocumento>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setParametroCompras(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setSecuencials(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials());

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setTipoDocumentos(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomovimientomoduloAux,tipomovimientomoduloLogic.getTipoMovimientoModulos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomovimientomoduloAux,tipomovimientomodulos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomovimientomodulo,tipomovimientomoduloAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipomovimientomoduloAux=new  TipoMovimientoModulo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado() 
					|| (this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado() && this.tipomovimientomodulo.getId()>=0)) {
						
					tipomovimientomoduloAux.setIsNew(false);
				}
				
				tipomovimientomoduloAux.setIsDeleted(false);
			
				tipomovimientomoduloAux.setId(this.tipomovimientomodulo.getId());	
				tipomovimientomoduloAux.setVersionRow(this.tipomovimientomodulo.getVersionRow());	
				tipomovimientomoduloAux.setid_modulo(this.tipomovimientomodulo.getid_modulo());	
				tipomovimientomoduloAux.setcodigo(this.tipomovimientomodulo.getcodigo());	
				tipomovimientomoduloAux.setnombre(this.tipomovimientomodulo.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomovimientomoduloAux,tipomovimientomoduloLogic.getTipoMovimientoModulos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimientomoduloAux,tipomovimientomodulos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomoduloLogic.saveTipoMovimientoModulos();//WithConnection
						//tipomovimientomoduloLogic.getSetVersionRowTipoMovimientoModulos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipomovimientomodulo,tipomovimientomoduloAux);
					
					this.refrescarForeignKeysDescripcionesTipoMovimientoModulo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialsEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompras.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencials.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialsEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentos.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomovimientomoduloLogic.saveTipoMovimientoModuloRelaciones(tipomovimientomoduloAux,this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras(),this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios(),this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials(),this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos());//WithConnection
								//tipomovimientomoduloLogic.getSetVersionRowTipoMovimientoModulos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipomovimientomodulo,tipomovimientomoduloAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(new ArrayList<ParametroCompra>());
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(new ArrayList<FacturaProveedorServicio>());
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.setSecuencials(new ArrayList<Secuencial>());
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompras= new ArrayList<ParametroCompra>();
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios= new ArrayList<FacturaProveedorServicio>();
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencials= new ArrayList<Secuencial>();
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentos= new ArrayList<TipoDocumento>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setParametroCompras(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setSecuencials(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials());

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setTipoDocumentos(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipomovimientomoduloAux,tipomovimientomoduloLogic.getTipoMovimientoModulos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipomovimientomoduloAux,tipomovimientomodulos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipomovimientomodulo,tipomovimientomoduloAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipomovimientomoduloAux=new  TipoMovimientoModulo();
				
				tipomovimientomoduloAux.setIsNew(false);
				tipomovimientomoduloAux.setIsChanged(false);
				
				tipomovimientomoduloAux.setIsDeleted(true);
				
				tipomovimientomoduloAux.setId(this.tipomovimientomodulo.getId());	
				tipomovimientomoduloAux.setVersionRow(this.tipomovimientomodulo.getVersionRow());	
				tipomovimientomoduloAux.setid_modulo(this.tipomovimientomodulo.getid_modulo());	
				tipomovimientomoduloAux.setcodigo(this.tipomovimientomodulo.getcodigo());	
				tipomovimientomoduloAux.setnombre(this.tipomovimientomodulo.getnombre());	
				
				if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipomovimientomoduloAux.getId()>=0) {	
						this.tipomovimientomodulosEliminados.add(tipomovimientomoduloAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipomovimientomoduloAux,tipomovimientomoduloLogic.getTipoMovimientoModulos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimientomoduloAux,tipomovimientomodulos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomoduloLogic.saveTipoMovimientoModulos();//WithConnection
						//tipomovimientomoduloLogic.getSetVersionRowTipoMovimientoModulos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialsEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos().addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompras.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocomprasEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorserviciosEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencials.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialsEliminados);
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentos.addAll(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipomovimientomoduloLogic.saveTipoMovimientoModuloRelaciones(tipomovimientomoduloAux,this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras(),this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios(),this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials(),this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos());//WithConnection
								//tipomovimientomoduloLogic.getSetVersionRowTipoMovimientoModulos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(new ArrayList<ParametroCompra>());
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(new ArrayList<FacturaProveedorServicio>());
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.setSecuencials(new ArrayList<Secuencial>());
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.setTipoDocumentos(new ArrayList<TipoDocumento>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompras= new ArrayList<ParametroCompra>();
							this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios= new ArrayList<FacturaProveedorServicio>();
							this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencials= new ArrayList<Secuencial>();
							this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentos= new ArrayList<TipoDocumento>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setParametroCompras(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setSecuencials(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials());

							if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipomovimientomoduloAux.setTipoDocumentos(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipomovimientomoduloAux,tipomovimientomoduloLogic.getTipoMovimientoModulos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipomovimientomoduloAux,tipomovimientomodulos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.getTipoMovimientoModulos().addAll(this.tipomovimientomodulosEliminados);
					
					tipomovimientomoduloLogic.saveTipoMovimientoModulos();//WithConnection
					//tipomovimientomoduloLogic.getSetVersionRowTipoMovimientoModulos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoMovimientoModulo();
				
				this.tipomovimientomodulosEliminados= new ArrayList<TipoMovimientoModulo>();		
			}
			
			if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Movimiento Modulo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipomovimientomodulo=tipomovimientomoduloAux;
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
      		//this.finishProcessTipoMovimientoModulo();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoMovimientoModulo tipomovimientomoduloLocal) throws Exception {
		
		if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipomovimientomoduloLocal.setParametroCompras(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());
				tipomovimientomoduloLocal.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());
				tipomovimientomoduloLocal.setSecuencials(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials());
				tipomovimientomoduloLocal.setTipoDocumentos(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos());
			
			} else {
			
				tipomovimientomoduloLocal.setParametroCompras(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompras);
				tipomovimientomoduloLocal.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicios);
				tipomovimientomoduloLocal.setSecuencials(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencials);
				tipomovimientomoduloLocal.setTipoDocumentos(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoMovimientoModulo tipomovimientomoduloLocal) throws Exception {	
		if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ModuloDetalleFormJInternalFrame.class)) {
				ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrameLocal=(ModuloBeanSwingJInternalFrame) ((ModuloDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				moduloBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoModulo(moduloBeanSwingJInternalFrameLocal.getmodulo(),true);
				moduloBeanSwingJInternalFrameLocal.actualizarLista(moduloBeanSwingJInternalFrameLocal.modulo,this.modulosForeignKey);

				moduloBeanSwingJInternalFrameLocal.actualizarRelaciones(moduloBeanSwingJInternalFrameLocal.modulo);

				tipomovimientomoduloLocal.setModulo(moduloBeanSwingJInternalFrameLocal.modulo);

				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey("Formulario");
				this.setActualModuloForeignKey(moduloBeanSwingJInternalFrameLocal.modulo.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoMovimientoModuloActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipomovimientomoduloValidator.getInvalidValues(this.tipomovimientomodulo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoMovimientoModulo tipomovimientomodulo,List<TipoMovimientoModulo> tipomovimientomodulos) throws Exception {
		try	{		
			TipoMovimientoModuloConstantesFunciones.actualizarLista(tipomovimientomodulo,tipomovimientomodulos,this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoMovimientoModulo tipomovimientomodulo,List<TipoMovimientoModulo> tipomovimientomodulos) throws Exception {
		try	{			
			TipoMovimientoModuloConstantesFunciones.actualizarSelectedLista(tipomovimientomodulo,tipomovimientomodulos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoMovimientoModulo> tipomovimientomodulosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipomovimientomodulosLocal=this.tipomovimientomoduloLogic.getTipoMovimientoModulos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipomovimientomodulosLocal=this.tipomovimientomodulos;
			}
			//ARCHITECTURE
		
			for(TipoMovimientoModulo tipomovimientomoduloLocal:tipomovimientomodulosLocal) {
				if(this.permiteMantenimiento(tipomovimientomoduloLocal) && tipomovimientomoduloLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoMovimientoModuloConstantesFunciones.getTipoMovimientoModuloLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoMovimientoModuloConstantesFunciones.IDMODULO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimientoModulo.jLabelid_moduloTipoMovimientoModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMovimientoModuloConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimientoModulo.jLabelcodigoTipoMovimientoModulo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoMovimientoModuloConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimientoModulo.jLabelnombreTipoMovimientoModulo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMovimientoModulo.jLabelid_moduloTipoMovimientoModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMovimientoModulo.jLabelcodigoTipoMovimientoModulo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoMovimientoModulo.jLabelnombreTipoMovimientoModulo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ParametroCompra")) {
			if(this.tipomovimientomodulo==null) {
				this.tipomovimientomodulo= new TipoMovimientoModulo();
			}

			if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoMovimientoModulo
				this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);

				this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.getparametrocompra().setTipoMovimientoModulo(this.tipomovimientomodulo);
			}

			return;
		}
		 else  if(sTipo.equals("FacturaProveedorServicio")) {
			if(this.tipomovimientomodulo==null) {
				this.tipomovimientomodulo= new TipoMovimientoModulo();
			}

			if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoMovimientoModulo
				this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);

				this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.getfacturaproveedorservicio().setTipoMovimientoModulo(this.tipomovimientomodulo);
			}

			return;
		}
		 else  if(sTipo.equals("Secuencial")) {
			if(this.tipomovimientomodulo==null) {
				this.tipomovimientomodulo= new TipoMovimientoModulo();
			}

			if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoMovimientoModulo
				this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);

				this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.getsecuencial().setTipoMovimientoModulo(this.tipomovimientomodulo);
			}

			return;
		}
		 else  if(sTipo.equals("TipoDocumento")) {
			if(this.tipomovimientomodulo==null) {
				this.tipomovimientomodulo= new TipoMovimientoModulo();
			}

			if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoMovimientoModulo
				this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);

				this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.gettipodocumento().setTipoMovimientoModulo(this.tipomovimientomodulo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoMovimientoModulo--;	
		
		
		this.tipomovimientomoduloAux=new TipoMovimientoModulo();
		
		this.tipomovimientomoduloAux.setId(this.iIdNuevoTipoMovimientoModulo);
		this.tipomovimientomoduloAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipomovimientomoduloLogic.getTipoMovimientoModulos().add(this.tipomovimientomoduloAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipomovimientomodulos.add(this.tipomovimientomoduloAux);
		}
		//ARCHITECTURE
		
		this.tipomovimientomodulo=this.tipomovimientomoduloAux;
		
		if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoMovimientoModulo(this.tipomovimientomodulo);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimientoModulo(this.tipomovimientomodulo);
		}
				
		//this.setDefaultControlesTipoMovimientoModulo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoMovimientoModulo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoMovimientoModulo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMovimientoModulo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMovimientoModulo(this.tipomovimientomoduloBean,this.tipomovimientomodulo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
			classes=TipoMovimientoModuloConstantesFunciones.getClassesRelationshipsOfTipoMovimientoModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipomovimientomoduloReturnGeneral=tipomovimientomoduloLogic.procesarEventosTipoMovimientoModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovimientomoduloLogic.getTipoMovimientoModulos(),this.tipomovimientomodulo,this.tipomovimientomoduloParameterGeneral,this.isEsNuevoTipoMovimientoModulo,classes);//this.tipomovimientomoduloLogic.getTipoMovimientoModulo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoMovimientoModulo(this.tipomovimientomoduloReturnGeneral,this.tipomovimientomoduloBean,false);
		
		if(this.tipomovimientomoduloReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimientoModulo(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoMovimientoModulo(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo());
		}
		
		if(this.tipomovimientomoduloReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoMovimientoModulo(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo(),classes);//this.tipomovimientomoduloBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoMovimientoModulo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoMovimientoModulo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.RecargarFormTipoMovimientoModulo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoMovimientoModulo(false);
						
			if(tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.getEsGuardarRelacionado() && ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCompraActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() && FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaProveedorServicioActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialSessionBean.getEsGuardarRelacionado() && SecuencialJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSecuencialActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.getEsGuardarRelacionado() && TipoDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoDocumentoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMovimientoModulo();
			}
			
			this.actualizarVisualTableDatosTipoMovimientoModulo();
			
			this.jTableDatosTipoMovimientoModulo.setRowSelectionInterval(this.getIndiceNuevoTipoMovimientoModulo(), this.getIndiceNuevoTipoMovimientoModulo());
			
			this.seleccionarFilaTablaTipoMovimientoModuloActual();
						
			this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoMovimientoModulo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldcodigoTipoMovimientoModulo.setEnabled(isHabilitar && this.tipomovimientomoduloConstantesFunciones.activarcodigoTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextAreanombreTipoMovimientoModulo.setEnabled(isHabilitar && this.tipomovimientomoduloConstantesFunciones.activarnombreTipoMovimientoModulo);	
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.setEnabled(isHabilitar && this.tipomovimientomoduloConstantesFunciones.activarid_moduloTipoMovimientoModulo);
	};
	
	public void setDefaultControlesTipoMovimientoModulo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoMovimientoModulo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipomovimientomoduloSessionBean.setConGuardarRelaciones(true);			
			this.tipomovimientomoduloSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipomovimientomoduloSessionBean.setConGuardarRelaciones(false);			
			this.tipomovimientomoduloSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoMovimientoModulo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
				if(tipomovimientomoduloAux.getId().equals(this.iIdNuevoTipoMovimientoModulo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomodulos) {
				if(tipomovimientomoduloAux.getId().equals(this.iIdNuevoTipoMovimientoModulo)) {
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
	
	public int getIndiceActualTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
				if(tipomovimientomoduloAux.getId().equals(tipomovimientomodulo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomodulos) {
				if(tipomovimientomoduloAux.getId().equals(tipomovimientomodulo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomoduloOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
				if(tipomovimientomoduloAux.getTipoMovimientoModuloOriginal().getId().equals(tipomovimientomoduloOriginal.getId())) {
					existe=true;
					tipomovimientomoduloOriginal.setId(tipomovimientomoduloAux.getId());
					tipomovimientomoduloOriginal.setVersionRow(tipomovimientomoduloAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomodulos) {
				if(tipomovimientomoduloAux.getTipoMovimientoModuloOriginal().getId().equals(tipomovimientomoduloOriginal.getId())) {
					existe=true;
					tipomovimientomoduloOriginal.setId(tipomovimientomoduloAux.getId());
					tipomovimientomoduloOriginal.setVersionRow(tipomovimientomoduloAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoMovimientoModulo(Boolean esParaCancelar) throws Exception {
		tipomovimientomodulosAux=new ArrayList<TipoMovimientoModulo>();
		tipomovimientomoduloAux=new TipoMovimientoModulo();
		
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
					if(tipomovimientomoduloAux.getId()<0) {
						tipomovimientomodulosAux.add(tipomovimientomoduloAux);
					}		
				}
				this.iIdNuevoTipoMovimientoModulo=0L;
				this.tipomovimientomoduloLogic.getTipoMovimientoModulos().removeAll(tipomovimientomodulosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomodulos) {
					if(tipomovimientomoduloAux.getId()<0) {
						tipomovimientomodulosAux.add(tipomovimientomoduloAux);
					}		
				}
				this.iIdNuevoTipoMovimientoModulo=0L;
				this.tipomovimientomodulos.removeAll(tipomovimientomodulosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoMovimientoModulo 
					&& this.tipomovimientomoduloLogic.getTipoMovimientoModulos().size()>0
					) {
					tipomovimientomoduloAux=this.tipomovimientomoduloLogic.getTipoMovimientoModulos().get(this.tipomovimientomoduloLogic.getTipoMovimientoModulos().size() - 1);
				
					if(tipomovimientomoduloAux.getId()<0) {
						this.tipomovimientomoduloLogic.getTipoMovimientoModulos().remove(tipomovimientomoduloAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoMovimientoModulo && this.tipomovimientomodulos.size()>0) {
					tipomovimientomoduloAux=this.tipomovimientomodulos.get(this.tipomovimientomodulos.size() - 1);
				
					if(tipomovimientomoduloAux.getId()<0) {
						this.tipomovimientomodulos.remove(tipomovimientomoduloAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoMovimientoModulo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipomovimientomodulo.getId()<0) {
				this.tipomovimientomoduloLogic.getTipoMovimientoModulos().remove(this.tipomovimientomodulo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipomovimientomodulo.getId()<0) {
				this.tipomovimientomodulos.remove(this.tipomovimientomodulo);
			}
		}			
	}
	
	public void setEstadosInicialesTipoMovimientoModulo(List<TipoMovimientoModulo> tipomovimientomodulosAux) throws Exception {
		TipoMovimientoModuloConstantesFunciones.setEstadosInicialesTipoMovimientoModulo(tipomovimientomodulosAux);
	}
	
	public void setEstadosInicialesTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomoduloAux) throws Exception {
		TipoMovimientoModuloConstantesFunciones.setEstadosInicialesTipoMovimientoModulo(tipomovimientomoduloAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoMovimientoModuloActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoMovimientoModuloActual()) {
				if(!this.isEsNuevoTipoMovimientoModulo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoMovimientoModulo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoMovimientoModuloActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Movimiento Modulo ?", "MANTENIMIENTO DE Tipo Movimiento Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoMovimientoModulo tipomovimientomodulo) throws Exception {
		TipoMovimientoModuloConstantesFunciones.seleccionarAsignar(this.tipomovimientomodulo,tipomovimientomodulo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoMovimientoModulo=this.isPermisoActualizarOriginalTipoMovimientoModulo;
			
			
			this.seleccionarAsignar(tipomovimientomodulo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoMovimientoModuloConstantesFunciones.quitarEspaciosTipoMovimientoModulo(this.tipomovimientomodulo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipomovimientomoduloSessionBean.setsFuncionBusquedaRapida(this.tipomovimientomoduloSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoMovimientoModulo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoMovimientoModulo(esParaCancelar);				
				this.cancelarNuevoTipoMovimientoModulo(esParaCancelar);								
			}
			
			this.tipomovimientomodulo=new TipoMovimientoModulo();
			
			this.inicializarTipoMovimientoModulo();
			
			this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoMovimientoModulo() throws Exception {
		try {
			TipoMovimientoModuloConstantesFunciones.inicializarTipoMovimientoModulo(this.tipomovimientomodulo);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipomovimientomoduloLogic.getTipoMovimientoModulos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoMovimientoModulos(String sAccionBusqueda,List<TipoMovimientoModulo> tipomovimientomodulosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoMovimientoModulo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoMovimientoModuloMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoMovimientoModuloMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoMovimientoModulo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Movimiento Modulos");		
		parameters.put("busquedapor", TipoMovimientoModuloConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ParametroCompra.class));
			classes.add(new Classe(FacturaProveedorServicio.class));
			classes.add(new Classe(Secuencial.class));
			classes.add(new Classe(TipoDocumento.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoMovimientoModuloLogic tipomovimientomoduloLogicAuxiliar=new TipoMovimientoModuloLogic();
					tipomovimientomoduloLogicAuxiliar.setDatosCliente(tipomovimientomoduloLogic.getDatosCliente());				
					tipomovimientomoduloLogicAuxiliar.setTipoMovimientoModulos(tipomovimientomodulosParaReportes);
					
					tipomovimientomoduloLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoMovimientoModuloWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipomovimientomodulosParaReportes=tipomovimientomoduloLogicAuxiliar.getTipoMovimientoModulos();
					
					//tipomovimientomoduloLogic.getNewConnexionToDeep();
					
					//for (TipoMovimientoModulo tipomovimientomodulo:tipomovimientomodulosParaReportes) {
					//	tipomovimientomoduloLogic.deepLoad(tipomovimientomodulo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipomovimientomoduloLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipomovimientomoduloLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileParametroCompra = AuxiliarReportes.class.getResourceAsStream("ParametroCompraDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocompra", reportFileParametroCompra);

			InputStream reportFileFacturaProveedorServicio = AuxiliarReportes.class.getResourceAsStream("FacturaProveedorServicioDetalleRelacionesDesign.jasper");
			parameters.put("subreport_facturaproveedorservicio", reportFileFacturaProveedorServicio);

			InputStream reportFileSecuencial = AuxiliarReportes.class.getResourceAsStream("SecuencialDetalleRelacionesDesign.jasper");
			parameters.put("subreport_secuencial", reportFileSecuencial);

			InputStream reportFileTipoDocumento = AuxiliarReportes.class.getResourceAsStream("TipoDocumentoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tipodocumento", reportFileTipoDocumento);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoMovimientoModulo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoMovimientoModuloConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoMovimientoModuloConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoMovimientoModulo=new JRBeanArrayDataSource(TipoMovimientoModuloJInternalFrame.TraerTipoMovimientoModuloBeans(tipomovimientomodulosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoMovimientoModulo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoMovimientoModuloConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoMovimientoModuloConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoMovimientoModuloBean.TraerTipoMovimientoModuloBeans(tipomovimientomodulosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoMovimientoModulos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientomodulosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoMovimientoModulos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientomodulosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoMovimientoModuloActionPerformed(null);
					//this.generarExcelReporteTipoMovimientoModulos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientomodulosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoMovimientoModulos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientomodulosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoMovimientoModulos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientomodulosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoMovimientoModulos(sAccionBusqueda,sTipoArchivoReporte,tipomovimientomodulosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoMovimientoModulos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMovimientoModulo> tipomovimientomodulosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimientomodulo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMovimientoModulos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMovimientoModulo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoMovimientoModulo tipomovimientomodulo : tipomovimientomodulosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoMovimientoModuloConstantesFunciones.generarExcelReporteDataTipoMovimientoModulo("NORMAL",row,workbook,tipomovimientomodulo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoMovimientoModulo(String sTipo,Row row,Workbook workbook) {
		
		TipoMovimientoModuloConstantesFunciones.generarExcelReporteHeaderTipoMovimientoModulo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoMovimientoModulos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMovimientoModulo> tipomovimientomodulosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimientomodulo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMovimientoModulos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoMovimientoModulo tipomovimientomodulo : tipomovimientomodulosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoMovimientoModuloConstantesFunciones.getTipoMovimientoModuloDescripcion(tipomovimientomodulo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovimientomodulo.getmodulo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovimientomodulo.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipomovimientomodulo.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoMovimientoModulos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoMovimientoModulo> tipomovimientomodulosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoMovimientoModulo> tipomovimientomodulosRespaldo=null;
		
		classes=TipoMovimientoModuloConstantesFunciones.getClassesRelationshipsOfTipoMovimientoModulo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipomovimientomoduloLogic.setDatosCliente(this.datosCliente);
		this.tipomovimientomoduloLogic.setDatosDeep(this.datosDeep);
		this.tipomovimientomoduloLogic.setIsConDeep(true);
		
		tipomovimientomodulosRespaldo=this.tipomovimientomoduloLogic.getTipoMovimientoModulos();
		
		this.tipomovimientomoduloLogic.setTipoMovimientoModulos(tipomovimientomodulosParaReportes);	
		this.tipomovimientomoduloLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipomovimientomodulosParaReportes=this.tipomovimientomoduloLogic.getTipoMovimientoModulos();
		this.tipomovimientomoduloLogic.setTipoMovimientoModulos(tipomovimientomodulosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimientomodulo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoMovimientoModulos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoMovimientoModulo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoMovimientoModulo tipomovimientomodulo : tipomovimientomodulosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoMovimientoModulo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoMovimientoModuloConstantesFunciones.generarExcelReporteDataTipoMovimientoModulo("NORMAL",row,workbook,tipomovimientomodulo,cellStyleDataAux);
		
			
			


				//ParametroCompra
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCompraConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipomovimientomodulo.getParametroCompras()!=null && tipomovimientomodulo.getParametroCompras().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCompraConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCompraConstantesFunciones.generarExcelReporteHeaderParametroCompra("RELACIONADO",row,workbook);
				}

				if(tipomovimientomodulo.getParametroCompras()!=null) {
					i2=0;
					for(ParametroCompra parametrocompra : tipomovimientomodulo.getParametroCompras()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCompraConstantesFunciones.generarExcelReporteDataParametroCompra("RELACIONADO",row,workbook,parametrocompra,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//FacturaProveedorServicio
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipomovimientomodulo.getFacturaProveedorServicios()!=null && tipomovimientomodulo.getFacturaProveedorServicios().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaProveedorServicioConstantesFunciones.generarExcelReporteHeaderFacturaProveedorServicio("RELACIONADO",row,workbook);
				}

				if(tipomovimientomodulo.getFacturaProveedorServicios()!=null) {
					i2=0;
					for(FacturaProveedorServicio facturaproveedorservicio : tipomovimientomodulo.getFacturaProveedorServicios()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaProveedorServicioConstantesFunciones.generarExcelReporteDataFacturaProveedorServicio("RELACIONADO",row,workbook,facturaproveedorservicio,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Secuencial
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(SecuencialConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipomovimientomodulo.getSecuencials()!=null && tipomovimientomodulo.getSecuencials().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(SecuencialConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					SecuencialConstantesFunciones.generarExcelReporteHeaderSecuencial("RELACIONADO",row,workbook);
				}

				if(tipomovimientomodulo.getSecuencials()!=null) {
					i2=0;
					for(Secuencial secuencial : tipomovimientomodulo.getSecuencials()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						SecuencialConstantesFunciones.generarExcelReporteDataSecuencial("RELACIONADO",row,workbook,secuencial,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//TipoDocumento
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TipoDocumentoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipomovimientomodulo.getTipoDocumentos()!=null && tipomovimientomodulo.getTipoDocumentos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TipoDocumentoConstantesFunciones.generarExcelReporteHeaderTipoDocumento("RELACIONADO",row,workbook);
				}

				if(tipomovimientomodulo.getTipoDocumentos()!=null) {
					i2=0;
					for(TipoDocumento tipodocumento : tipomovimientomodulo.getTipoDocumentos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TipoDocumentoConstantesFunciones.generarExcelReporteDataTipoDocumento("RELACIONADO",row,workbook,tipodocumento,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoMovimientoModuloConstantesFunciones.getTipoMovimientoModuloDescripcion(tipomovimientomodulo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoMovimientoModulo() throws Exception {		
		this.startProcessTipoMovimientoModulo(true);
	}
	
	public void startProcessTipoMovimientoModulo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoMovimientoModulo ,this.jPanelParametrosReportesTipoMovimientoModulo, this.jScrollPanelDatosTipoMovimientoModulo,this.jPanelPaginacionTipoMovimientoModulo, this.jScrollPanelDatosEdicionTipoMovimientoModulo, this.jPanelAccionesTipoMovimientoModulo,this.jPanelAccionesFormularioTipoMovimientoModulo,this.jmenuBarTipoMovimientoModulo,this.jmenuBarDetalleTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,this.jTtoolBarDetalleTipoMovimientoModulo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMovimientoModulo=this.jTabbedPaneBusquedasTipoMovimientoModulo; 
		
		final JPanel jPanelParametrosReportesTipoMovimientoModulo=this.jPanelParametrosReportesTipoMovimientoModulo;
		//final JScrollPane jScrollPanelDatosTipoMovimientoModulo=this.jScrollPanelDatosTipoMovimientoModulo;
		final JTable jTableDatosTipoMovimientoModulo=this.jTableDatosTipoMovimientoModulo;		
		final JPanel jPanelPaginacionTipoMovimientoModulo=this.jPanelPaginacionTipoMovimientoModulo;
		//final JScrollPane jScrollPanelDatosEdicionTipoMovimientoModulo=this.jScrollPanelDatosEdicionTipoMovimientoModulo;
		final JPanel jPanelAccionesTipoMovimientoModulo=this.jPanelAccionesTipoMovimientoModulo;
		
		JPanel jPanelCamposAuxiliarTipoMovimientoModulo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoMovimientoModulo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			jPanelCamposAuxiliarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jPanelCamposTipoMovimientoModulo;
			jPanelAccionesFormularioAuxiliarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jPanelAccionesFormularioTipoMovimientoModulo;
		}
		
		final JPanel jPanelCamposTipoMovimientoModulo=jPanelCamposAuxiliarTipoMovimientoModulo;
		final JPanel jPanelAccionesFormularioTipoMovimientoModulo=jPanelAccionesFormularioAuxiliarTipoMovimientoModulo;
		
		
		final JMenuBar jmenuBarTipoMovimientoModulo=this.jmenuBarTipoMovimientoModulo;
		final JToolBar jTtoolBarTipoMovimientoModulo=this.jTtoolBarTipoMovimientoModulo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoMovimientoModulo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMovimientoModulo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			jmenuBarDetalleAuxiliarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jmenuBarDetalleTipoMovimientoModulo;
			jTtoolBarDetalleAuxiliarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jTtoolBarDetalleTipoMovimientoModulo;
		}
		
		final JMenuBar jmenuBarDetalleTipoMovimientoModulo=jmenuBarDetalleAuxiliarTipoMovimientoModulo;
		final JToolBar jTtoolBarDetalleTipoMovimientoModulo=jTtoolBarDetalleAuxiliarTipoMovimientoModulo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMovimientoModulo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMovimientoModulo;
			processRunnable.jTableDatos=jTableDatosTipoMovimientoModulo;
			processRunnable.jPanelCampos=jPanelCamposTipoMovimientoModulo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMovimientoModulo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMovimientoModulo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMovimientoModulo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMovimientoModulo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMovimientoModulo;
			processRunnable.jTtoolBar=jTtoolBarTipoMovimientoModulo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMovimientoModulo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMovimientoModulo ,jPanelParametrosReportesTipoMovimientoModulo,jTableDatosTipoMovimientoModulo, /*jScrollPanelDatosTipoMovimientoModulo,*/jPanelCamposTipoMovimientoModulo,jPanelPaginacionTipoMovimientoModulo, /*jScrollPanelDatosEdicionTipoMovimientoModulo,*/ jPanelAccionesTipoMovimientoModulo,jPanelAccionesFormularioTipoMovimientoModulo,jmenuBarTipoMovimientoModulo,jmenuBarDetalleTipoMovimientoModulo,jTtoolBarTipoMovimientoModulo,jTtoolBarDetalleTipoMovimientoModulo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoMovimientoModulo ,jPanelParametrosReportesTipoMovimientoModulo, jScrollPanelDatosTipoMovimientoModulo,jPanelPaginacionTipoMovimientoModulo, jScrollPanelDatosEdicionTipoMovimientoModulo, jPanelAccionesTipoMovimientoModulo,jPanelAccionesFormularioTipoMovimientoModulo,jmenuBarTipoMovimientoModulo,jmenuBarDetalleTipoMovimientoModulo,jTtoolBarTipoMovimientoModulo,jTtoolBarDetalleTipoMovimientoModulo);
						
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
	
	public void finishProcessTipoMovimientoModulo() {// throws Exception 
		this.finishProcessTipoMovimientoModulo(true);
	}
	
	public void finishProcessTipoMovimientoModulo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoMovimientoModulo ,this.jPanelParametrosReportesTipoMovimientoModulo, this.jScrollPanelDatosTipoMovimientoModulo,this.jPanelPaginacionTipoMovimientoModulo, this.jScrollPanelDatosEdicionTipoMovimientoModulo, this.jPanelAccionesTipoMovimientoModulo,this.jPanelAccionesFormularioTipoMovimientoModulo,this.jmenuBarTipoMovimientoModulo,this.jmenuBarDetalleTipoMovimientoModulo,this.jTtoolBarTipoMovimientoModulo,this.jTtoolBarDetalleTipoMovimientoModulo);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoMovimientoModulo=this.jTabbedPaneBusquedasTipoMovimientoModulo; 
		
		final JPanel jPanelParametrosReportesTipoMovimientoModulo=this.jPanelParametrosReportesTipoMovimientoModulo;
		//final JScrollPane jScrollPanelDatosTipoMovimientoModulo=this.jScrollPanelDatosTipoMovimientoModulo;
		final JTable jTableDatosTipoMovimientoModulo=this.jTableDatosTipoMovimientoModulo;		
		final JPanel jPanelPaginacionTipoMovimientoModulo=this.jPanelPaginacionTipoMovimientoModulo;
		//final JScrollPane jScrollPanelDatosEdicionTipoMovimientoModulo=this.jScrollPanelDatosEdicionTipoMovimientoModulo;
		final JPanel jPanelAccionesTipoMovimientoModulo=this.jPanelAccionesTipoMovimientoModulo;
		
		JPanel jPanelCamposAuxiliarTipoMovimientoModulo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoMovimientoModulo=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			jPanelCamposAuxiliarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jPanelCamposTipoMovimientoModulo;
			jPanelAccionesFormularioAuxiliarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jPanelAccionesFormularioTipoMovimientoModulo;
		}
		
		final JPanel jPanelCamposTipoMovimientoModulo=jPanelCamposAuxiliarTipoMovimientoModulo;
		final JPanel jPanelAccionesFormularioTipoMovimientoModulo=jPanelAccionesFormularioAuxiliarTipoMovimientoModulo;
		
		
		final JMenuBar jmenuBarTipoMovimientoModulo=this.jmenuBarTipoMovimientoModulo;		
		final JToolBar jTtoolBarTipoMovimientoModulo=this.jTtoolBarTipoMovimientoModulo;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoMovimientoModulo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoMovimientoModulo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			jmenuBarDetalleAuxiliarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jmenuBarDetalleTipoMovimientoModulo;
			jTtoolBarDetalleAuxiliarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jTtoolBarDetalleTipoMovimientoModulo;		
		}
		
		final JMenuBar jmenuBarDetalleTipoMovimientoModulo=jmenuBarDetalleAuxiliarTipoMovimientoModulo;
		final JToolBar jTtoolBarDetalleTipoMovimientoModulo=jTtoolBarDetalleAuxiliarTipoMovimientoModulo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoMovimientoModulo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoMovimientoModulo;
			processRunnable.jTableDatos=jTableDatosTipoMovimientoModulo;
			processRunnable.jPanelCampos=jPanelCamposTipoMovimientoModulo;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoMovimientoModulo;
			processRunnable.jPanelAcciones=jPanelAccionesTipoMovimientoModulo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoMovimientoModulo;
			
			
			processRunnable.jmenuBar=jmenuBarTipoMovimientoModulo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoMovimientoModulo;
			processRunnable.jTtoolBar=jTtoolBarTipoMovimientoModulo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoMovimientoModulo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoMovimientoModulo ,jPanelParametrosReportesTipoMovimientoModulo, jTableDatosTipoMovimientoModulo,/*jScrollPanelDatosTipoMovimientoModulo,*/jPanelCamposTipoMovimientoModulo,jPanelPaginacionTipoMovimientoModulo, /*jScrollPanelDatosEdicionTipoMovimientoModulo,*/ jPanelAccionesTipoMovimientoModulo,jPanelAccionesFormularioTipoMovimientoModulo,jmenuBarTipoMovimientoModulo,jmenuBarDetalleTipoMovimientoModulo,jTtoolBarTipoMovimientoModulo,jTtoolBarDetalleTipoMovimientoModulo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoMovimientoModulo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoMovimientoModulo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoMovimientoModulo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoMovimientoModulo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoMovimientoModulo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoMovimientoModulo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoMovimientoModulo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoMovimientoModulo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoMovimientoModulo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipomovimientomoduloConstantesFunciones.getsFinalQueryTipoMovimientoModulo();
		String  finalQueryPaginacionTodos=this.tipomovimientomoduloConstantesFunciones.getsFinalQueryTipoMovimientoModulo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoMovimientoModuloConstantesFunciones.getArrayColumnasGlobalesNoTipoMovimientoModulo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoMovimientoModuloConstantesFunciones.getArrayColumnasGlobalesTipoMovimientoModulo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoMovimientoModuloConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipomovimientomodulosEliminados= new ArrayList<TipoMovimientoModulo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoMovimientoModulo();
		
				///*TipoMovimientoModuloSessionBean*/this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
			
			if(this.tipomovimientomoduloSessionBean==null) {
				this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
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
					this.iNumeroPaginacion=TipoMovimientoModuloConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoMovimientoModuloConstantesFunciones.getClassesForeignKeysOfTipoMovimientoModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipomovimientomodulo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipomovimientomodulosAux= new ArrayList<TipoMovimientoModulo>();
			
				
			tipomovimientomoduloLogic.setDatosCliente(this.datosCliente);
			tipomovimientomoduloLogic.setDatosDeep(this.datosDeep);
			tipomovimientomoduloLogic.setIsConDeep(true);
			
			
			tipomovimientomoduloLogic.getTipoMovimientoModuloDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipomovimientomoduloLogic.getTodosTipoMovimientoModulos(finalQueryGlobal,pagination);
					
					//tipomovimientomoduloLogic.getTodosTipoMovimientoModulosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipomovimientomoduloLogic.getTipoMovimientoModulos()==null|| tipomovimientomoduloLogic.getTipoMovimientoModulos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovimientomodulosAux= new ArrayList<TipoMovimientoModulo>();
							tipomovimientomodulosAux.addAll(tipomovimientomoduloLogic.getTipoMovimientoModulos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientomodulosAux= new ArrayList<TipoMovimientoModulo>();
							tipomovimientomodulosAux.addAll(tipomovimientomodulos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovimientomoduloLogic.getTodosTipoMovimientoModulos(finalQueryGlobal+"",this.pagination);												
							
							//tipomovimientomoduloLogic.getTodosTipoMovimientoModulosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoMovimientoModulos("Todos",tipomovimientomoduloLogic.getTipoMovimientoModulos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipomovimientomoduloLogic.setTipoMovimientoModulos(new ArrayList<TipoMovimientoModulo>());					
							tipomovimientomoduloLogic.getTipoMovimientoModulos().addAll(tipomovimientomodulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
							tipomovimientomodulos.addAll(tipomovimientomodulosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoMovimientoModulo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoMovimientoModulo=this.idActual;
				
				} else if(this.idTipoMovimientoModuloActual!=null && this.idTipoMovimientoModuloActual!=0L) {
					idTipoMovimientoModulo=idTipoMovimientoModuloActual;
				}
				
					
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndicePorId(idTipoMovimientoModulo);
				
				this.tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipomovimientomoduloLogic.getEntity(idTipoMovimientoModulo);
					
					//tipomovimientomoduloLogic.getEntityWithConnection(idTipoMovimientoModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientomoduloLogic.setTipoMovimientoModulos(new ArrayList<TipoMovimientoModulo>());
					tipomovimientomoduloLogic.getTipoMovimientoModulos().add(tipomovimientomoduloLogic.getTipoMovimientoModulo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
					this.tipomovimientomodulos.add(tipomovimientomodulo);
				}
				
				if(tipomovimientomoduloLogic.getTipoMovimientoModulo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorCodigo")) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomovimientomoduloLogic.getTipoMovimientoModulosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomovimientomoduloLogic.getTipoMovimientoModulos()==null||tipomovimientomoduloLogic.getTipoMovimientoModulos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomovimientomodulos==null|| tipomovimientomodulos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomodulosAux=new ArrayList<TipoMovimientoModulo>();
						tipomovimientomodulosAux.addAll(tipomovimientomoduloLogic.getTipoMovimientoModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientomodulosAux=new ArrayList<TipoMovimientoModulo>();
							tipomovimientomodulosAux.addAll(tipomovimientomodulos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomovimientomoduloLogic.getTipoMovimientoModulosBusquedaPorCodigo(finalQueryGlobal,pagination,codigoBusquedaPorCodigo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorCodigo(codigoBusquedaPorCodigo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMovimientoModulos("BusquedaPorCodigo",tipomovimientomoduloLogic.getTipoMovimientoModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMovimientoModulos("BusquedaPorCodigo",tipomovimientomodulos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomoduloLogic.setTipoMovimientoModulos(new ArrayList<TipoMovimientoModulo>());
						tipomovimientomoduloLogic.getTipoMovimientoModulos().addAll(tipomovimientomodulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
							tipomovimientomodulos.addAll(tipomovimientomodulosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomovimientomoduloLogic.getTipoMovimientoModulosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomovimientomoduloLogic.getTipoMovimientoModulos()==null||tipomovimientomoduloLogic.getTipoMovimientoModulos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomovimientomodulos==null|| tipomovimientomodulos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomodulosAux=new ArrayList<TipoMovimientoModulo>();
						tipomovimientomodulosAux.addAll(tipomovimientomoduloLogic.getTipoMovimientoModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientomodulosAux=new ArrayList<TipoMovimientoModulo>();
							tipomovimientomodulosAux.addAll(tipomovimientomodulos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomovimientomoduloLogic.getTipoMovimientoModulosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMovimientoModulos("BusquedaPorNombre",tipomovimientomoduloLogic.getTipoMovimientoModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMovimientoModulos("BusquedaPorNombre",tipomovimientomodulos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomoduloLogic.setTipoMovimientoModulos(new ArrayList<TipoMovimientoModulo>());
						tipomovimientomoduloLogic.getTipoMovimientoModulos().addAll(tipomovimientomodulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
							tipomovimientomodulos.addAll(tipomovimientomodulosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdModulo")) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipomovimientomoduloLogic.getTipoMovimientoModulosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipomovimientomoduloLogic.getTipoMovimientoModulos()==null||tipomovimientomoduloLogic.getTipoMovimientoModulos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipomovimientomodulos==null|| tipomovimientomodulos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomodulosAux=new ArrayList<TipoMovimientoModulo>();
						tipomovimientomodulosAux.addAll(tipomovimientomoduloLogic.getTipoMovimientoModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientomodulosAux=new ArrayList<TipoMovimientoModulo>();
							tipomovimientomodulosAux.addAll(tipomovimientomodulos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipomovimientomoduloLogic.getTipoMovimientoModulosFK_IdModulo(finalQueryGlobal,pagination,id_moduloFK_IdModulo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoMovimientoModuloConstantesFunciones.getDetalleIndiceFK_IdModulo(id_moduloFK_IdModulo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoMovimientoModulos("FK_IdModulo",tipomovimientomoduloLogic.getTipoMovimientoModulos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoMovimientoModulos("FK_IdModulo",tipomovimientomodulos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomoduloLogic.setTipoMovimientoModulos(new ArrayList<TipoMovimientoModulo>());
						tipomovimientomoduloLogic.getTipoMovimientoModulos().addAll(tipomovimientomodulosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
							tipomovimientomodulos.addAll(tipomovimientomodulosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoMovimientoModulo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoMovimientoModulo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomovimientomoduloLogic.getTipoMovimientoModulos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovimientomodulos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipomovimientomoduloLogic.getTipoMovimientoModulos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipomovimientomodulos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoMovimientoModulo tipomovimientomodulo) {
		Boolean permite=true;
		
		if(this.tipomovimientomodulo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoMovimientoModuloConstantesFunciones.getOrderByListaTipoMovimientoModulo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoMovimientoModuloConstantesFunciones.getOrderByListaTipoMovimientoModulo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimientoModulo tipomovimientomodulo:tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
				if(tipomovimientomodulo.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimientomoduloTotales=tipomovimientomodulo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimientoModulo tipomovimientomodulo:this.tipomovimientomodulos) {
				if(tipomovimientomodulo.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimientomoduloTotales=tipomovimientomodulo;
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
			this.tipomovimientomoduloAux=new TipoMovimientoModulo();
			this.tipomovimientomoduloAux.setsType(Constantes2.S_TOTALES);
			this.tipomovimientomoduloAux.setIsNew(false);
			this.tipomovimientomoduloAux.setIsChanged(false);
			this.tipomovimientomoduloAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoMovimientoModuloConstantesFunciones.TotalizarValoresFilaTipoMovimientoModulo(this.tipomovimientomoduloLogic.getTipoMovimientoModulos(),this.tipomovimientomoduloAux);
				
				this.tipomovimientomoduloLogic.getTipoMovimientoModulos().add(this.tipomovimientomoduloAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoMovimientoModuloConstantesFunciones.TotalizarValoresFilaTipoMovimientoModulo(this.tipomovimientomodulos,this.tipomovimientomoduloAux);
				
				this.tipomovimientomodulos.add(this.tipomovimientomoduloAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipomovimientomoduloTotales=new TipoMovimientoModulo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomovimientomoduloLogic.getTipoMovimientoModulos().remove(tipomovimientomoduloTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipomovimientomodulos.remove(tipomovimientomoduloTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipomovimientomoduloTotales=new TipoMovimientoModulo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoMovimientoModulo tipomovimientomodulo:tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
				if(tipomovimientomodulo.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimientomoduloTotales=tipomovimientomodulo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMovimientoModuloConstantesFunciones.TotalizarValoresFilaTipoMovimientoModulo(this.tipomovimientomoduloLogic.getTipoMovimientoModulos(),tipomovimientomoduloTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoMovimientoModulo tipomovimientomodulo:this.tipomovimientomodulos) {
				if(tipomovimientomodulo.getsType().equals(Constantes2.S_TOTALES)) {
					tipomovimientomoduloTotales=tipomovimientomodulo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoMovimientoModuloConstantesFunciones.TotalizarValoresFilaTipoMovimientoModulo(this.tipomovimientomodulos,tipomovimientomoduloTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoMovimientoModulosBusquedaPorCodigo()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoMovimientoModulosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoMovimientoModulosFK_IdModulo()throws Exception {
		try {
			sAccionBusqueda="FK_IdModulo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoMovimientoModuloPorIdModuloPorCodigo()throws Exception {
		try {
			sAccionBusqueda="PorIdModuloPorCodigo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoMovimientoModulosBusquedaPorCodigo(String sFinalQuery,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientomoduloLogic.getTipoMovimientoModulosBusquedaPorCodigo(sFinalQuery,this.pagination,codigo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoMovimientoModulosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientomoduloLogic.getTipoMovimientoModulosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoMovimientoModulosFK_IdModulo(String sFinalQuery,Long id_modulo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientomoduloLogic.getTipoMovimientoModulosFK_IdModulo(sFinalQuery,this.pagination,id_modulo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoMovimientoModuloPorIdModuloPorCodigo(Long id_modulo,String codigo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientomoduloLogic.getTipoMovimientoModuloPorIdModuloPorCodigo(id_modulo,codigo);
				
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
	
	public void inicializarPermisosTipoMovimientoModulo() {
		this.isPermisoTodoTipoMovimientoModulo=false;
		this.isPermisoNuevoTipoMovimientoModulo=false;
		this.isPermisoActualizarTipoMovimientoModulo=false;
		this.isPermisoActualizarOriginalTipoMovimientoModulo=false;
		this.isPermisoEliminarTipoMovimientoModulo=false;
		this.isPermisoGuardarCambiosTipoMovimientoModulo=false;
		this.isPermisoConsultaTipoMovimientoModulo=false;
		this.isPermisoBusquedaTipoMovimientoModulo=false;
		this.isPermisoReporteTipoMovimientoModulo=false;		
		this.isPermisoOrdenTipoMovimientoModulo=false;		
		this.isPermisoPaginacionMedioTipoMovimientoModulo=false;		
		this.isPermisoPaginacionAltoTipoMovimientoModulo=false;
		this.isPermisoPaginacionTodoTipoMovimientoModulo=false;
		this.isPermisoCopiarTipoMovimientoModulo=false;		
		this.isPermisoVerFormTipoMovimientoModulo=false;		
		this.isPermisoDuplicarTipoMovimientoModulo=false;		
		this.isPermisoOrdenTipoMovimientoModulo=false;		
	}
	
	public void setPermisosUsuarioTipoMovimientoModulo(Boolean isPermiso) {
		this.isPermisoTodoTipoMovimientoModulo=isPermiso;
		this.isPermisoNuevoTipoMovimientoModulo=isPermiso;
		this.isPermisoActualizarTipoMovimientoModulo=isPermiso;
		this.isPermisoActualizarOriginalTipoMovimientoModulo=isPermiso;
		this.isPermisoEliminarTipoMovimientoModulo=isPermiso;
		this.isPermisoGuardarCambiosTipoMovimientoModulo=isPermiso;
		this.isPermisoConsultaTipoMovimientoModulo=isPermiso;
		this.isPermisoBusquedaTipoMovimientoModulo=isPermiso;
		this.isPermisoReporteTipoMovimientoModulo=isPermiso;
		this.isPermisoOrdenTipoMovimientoModulo=isPermiso;		
		this.isPermisoPaginacionMedioTipoMovimientoModulo=isPermiso;		
		this.isPermisoPaginacionAltoTipoMovimientoModulo=isPermiso;		
		this.isPermisoPaginacionTodoTipoMovimientoModulo=isPermiso;		
		this.isPermisoCopiarTipoMovimientoModulo=isPermiso;		
		this.isPermisoVerFormTipoMovimientoModulo=isPermiso;		
		this.isPermisoDuplicarTipoMovimientoModulo=isPermiso;
		this.isPermisoOrdenTipoMovimientoModulo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoMovimientoModulo(Boolean isPermiso) {
		//this.isPermisoTodoTipoMovimientoModulo=isPermiso;
		this.isPermisoNuevoTipoMovimientoModulo=isPermiso;
		this.isPermisoActualizarTipoMovimientoModulo=isPermiso;
		this.isPermisoActualizarOriginalTipoMovimientoModulo=isPermiso;
		this.isPermisoEliminarTipoMovimientoModulo=isPermiso;
		this.isPermisoGuardarCambiosTipoMovimientoModulo=isPermiso;
		//this.isPermisoConsultaTipoMovimientoModulo=isPermiso;
		//this.isPermisoBusquedaTipoMovimientoModulo=isPermiso;
		//this.isPermisoReporteTipoMovimientoModulo=isPermiso;
		//this.isPermisoOrdenTipoMovimientoModulo=isPermiso;		
		//this.isPermisoPaginacionMedioTipoMovimientoModulo=isPermiso;		
		//this.isPermisoPaginacionAltoTipoMovimientoModulo=isPermiso;		
		//this.isPermisoPaginacionTodoTipoMovimientoModulo=isPermiso;		
		//this.isPermisoCopiarTipoMovimientoModulo=isPermiso;		
		//this.isPermisoDuplicarTipoMovimientoModulo=isPermiso;
		//this.isPermisoOrdenTipoMovimientoModulo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoMovimientoModuloClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ParametroCompraConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(FacturaProveedorServicioConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(SecuencialConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(TipoDocumentoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoMovimientoModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosParametroCompra=false;
		this.isTienePermisosParametroCompra=this.verificarGetPermisosUsuarioOpcionTipoMovimientoModuloClaseRelacionada(this.opcionsRelacionadas,ParametroCompraConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosFacturaProveedorServicio=false;
		this.isTienePermisosFacturaProveedorServicio=this.verificarGetPermisosUsuarioOpcionTipoMovimientoModuloClaseRelacionada(this.opcionsRelacionadas,FacturaProveedorServicioConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosSecuencial=false;
		this.isTienePermisosSecuencial=this.verificarGetPermisosUsuarioOpcionTipoMovimientoModuloClaseRelacionada(this.opcionsRelacionadas,SecuencialConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosTipoDocumento=false;
		this.isTienePermisosTipoDocumento=this.verificarGetPermisosUsuarioOpcionTipoMovimientoModuloClaseRelacionada(this.opcionsRelacionadas,TipoDocumentoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoMovimientoModulo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoMovimientoModuloClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosParametroCompra=conPermiso;
		this.isTienePermisosFacturaProveedorServicio=conPermiso;
		this.isTienePermisosSecuencial=conPermiso;
		this.isTienePermisosTipoDocumento=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoMovimientoModuloClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoMovimientoModuloClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoMovimientoModuloClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosParametroCompra && this.jInternalFrameDetalleFormTipoMovimientoModulo!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.remove(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosFacturaProveedorServicio && this.jInternalFrameDetalleFormTipoMovimientoModulo!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.remove(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosSecuencial && this.jInternalFrameDetalleFormTipoMovimientoModulo!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.remove(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosTipoDocumento && this.jInternalFrameDetalleFormTipoMovimientoModulo!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.remove(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoMovimientoModulo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoMovimientoModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoMovimientoModuloConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoMovimientoModulo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoMovimientoModulo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoMovimientoModulo=this.isPermisoActualizarTipoMovimientoModulo;
			this.isPermisoEliminarTipoMovimientoModulo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoMovimientoModulo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoMovimientoModulo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoMovimientoModulo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoMovimientoModulo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoMovimientoModulo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMovimientoModulo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoMovimientoModulo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoMovimientoModulo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoMovimientoModulo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoMovimientoModulo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoMovimientoModulo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoMovimientoModulo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoMovimientoModulo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoMovimientoModulo.setToolTipText(this.jTableDatosTipoMovimientoModulo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoMovimientoModulo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoMovimientoModulo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoMovimientoModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoMovimientoModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoMovimientoModulo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosParametroCompra && this.tipomovimientomoduloConstantesFunciones.mostrarParametroCompraTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Compra");
			reporte.setsDescripcion("Parametro Compra");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosFacturaProveedorServicio && this.tipomovimientomoduloConstantesFunciones.mostrarFacturaProveedorServicioTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura Proveedor");
			reporte.setsDescripcion("Factura Proveedor");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosSecuencial && this.tipomovimientomoduloConstantesFunciones.mostrarSecuencialTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Secuencial");
			reporte.setsDescripcion("Secuencial");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosTipoDocumento && this.tipomovimientomoduloConstantesFunciones.mostrarTipoDocumentoTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tipo Documento");
			reporte.setsDescripcion("Tipo Documento");
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
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTipoMovimientoModuloListas()throws Exception {
		try	{						
			
				this.modulosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoMovimientoModuloListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoMovimientoModuloJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoMovimientoModuloListas(false);
			} else {
			
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyModuloListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ModuloConstantesFunciones.SFINALQUERY;

				this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTipoMovimientoModuloListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoMovimientoModuloParameterReturnGeneral tipomovimientomoduloReturnGeneral=new TipoMovimientoModuloParameterReturnGeneral();
						
			


				String finalQueryGlobalModulo="";

				if(((this.modulosForeignKey==null||this.modulosForeignKey.size()<=0) && this.tipomovimientomoduloConstantesFunciones.cargarid_moduloTipoMovimientoModulo)
					 || (this.esRecargarFks && this.tipomovimientomoduloConstantesFunciones.cargarid_moduloTipoMovimientoModulo)) {

					if(!this.tipomovimientomoduloSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ModuloConstantesFunciones.getArrayColumnasGlobalesModulo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalModulo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ModuloConstantesFunciones.TABLENAME);

						finalQueryGlobalModulo=Funciones.GetFinalQueryAppend(finalQueryGlobalModulo, "");
						finalQueryGlobalModulo+=ModuloConstantesFunciones.SFINALQUERY;

						//this.cargarCombosModulosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalModulo=" WHERE " + ConstantesSql.ID + "="+tipomovimientomoduloSessionBean.getlidModuloActual();
					}
				} else {
					finalQueryGlobalModulo="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipomovimientomoduloReturnGeneral=tipomovimientomoduloLogic.cargarCombosLoteForeignKeyTipoMovimientoModulo(finalQueryGlobalModulo);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalModulo.equals("NONE")) {
				this.modulosForeignKey=tipomovimientomoduloReturnGeneral.getmodulosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoMovimientoModulo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyModulo();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyModulo()throws Exception {
		try {
			if(this.tipomovimientomoduloSessionBean==null) {
				this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
			}

			if(!this.tipomovimientomoduloSessionBean.getisBusquedaDesdeForeignKeySesionModulo()) {
				Modulo modulo=new Modulo();
				ModuloConstantesFunciones.setModuloDescripcion(modulo,Constantes.SMENSAJE_ESCOJA_OPCION);
				modulo.setId(null);

				if(!ModuloConstantesFunciones.ExisteEnLista(this.modulosForeignKey,modulo,true)) {

					this.modulosForeignKey.add(0,modulo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTipoMovimientoModulo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoMovimientoModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoMovimientoModulo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMovimientoModulo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo)throws Exception {	
		try {
			
			this.setActualModuloForeignKey(tipomovimientomodulo.getid_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoMovimientoModulo()throws Exception {	
		try {
			
			this.setActualModuloForeignKey(this.tipomovimientomoduloConstantesFunciones.getid_modulo(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoMovimientoModulo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoMovimientoModulo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoMovimientoModulo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoMovimientoModulo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoMovimientoModulo()throws Exception {
		try {
			

			this.cargarCombosFrameModulosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoMovimientoModulo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoMovimientoModulo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoMovimientoModuloBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoMovimientoModuloBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoMovimientoModuloBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean(); 
		this.tipomovimientomoduloConstantesFunciones=new TipoMovimientoModuloConstantesFunciones(); 
		this.tipomovimientomoduloBean=new TipoMovimientoModulo();//(this.tipomovimientomoduloConstantesFunciones); 		
		this.tipomovimientomoduloReturnGeneral=new TipoMovimientoModuloParameterReturnGeneral(); 
		
		this.tipomovimientomoduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipomovimientomoduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoMovimientoModuloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoMovimientoModuloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoMovimientoModuloBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoMovimientoModulo(true);
			
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
			
			this.tipomovimientomoduloConstantesFunciones=new TipoMovimientoModuloConstantesFunciones(); 
			this.tipomovimientomoduloBean=new TipoMovimientoModulo();//this.tipomovimientomoduloConstantesFunciones); 			
			this.tipomovimientomoduloReturnGeneral=new TipoMovimientoModuloParameterReturnGeneral(); 
		
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Movimiento Modulo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipomovimientomodulo=new TipoMovimientoModulo();
			this.tipomovimientomodulos = new ArrayList<TipoMovimientoModulo>();
			this.tipomovimientomodulosAux = new ArrayList<TipoMovimientoModulo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic=new TipoMovimientoModuloLogic();
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}
			
			//this.tipomovimientomoduloSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipomovimientomoduloSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoMovimientoModulo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMovimientoModulo);	
					}
					
					if(this.jInternalFrameImportacionTipoMovimientoModulo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMovimientoModulo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoMovimientoModulo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoMovimientoModulo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMovimientoModulo);
				this.jInternalFrameDetalleFormTipoMovimientoModulo.setVisible(false);
				this.jInternalFrameDetalleFormTipoMovimientoModulo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMovimientoModulo);
					this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoMovimientoModulo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoMovimientoModulo);
					this.jInternalFrameImportacionTipoMovimientoModulo.setVisible(false);
					this.jInternalFrameImportacionTipoMovimientoModulo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoMovimientoModulo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoMovimientoModulo);
					this.jInternalFrameOrderByTipoMovimientoModulo.setVisible(false);
					this.jInternalFrameOrderByTipoMovimientoModulo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoMovimientoModuloActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoMovimientoModuloConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipomovimientomoduloReturnGeneral=new TipoMovimientoModuloParameterReturnGeneral();
			
			this.tipomovimientomoduloParameterGeneral=new TipoMovimientoModuloParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipomovimientomoduloLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoMovimientoModuloJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ParametroCompraConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(FacturaProveedorServicioConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(SecuencialConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(TipoDocumentoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMovimientoModuloConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado(),this.tipomovimientomoduloSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoMovimientoModuloConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado(),this.tipomovimientomoduloSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=false;
			this.isVisibilidadCeldaDuplicarTipoMovimientoModulo=true;
			this.isVisibilidadCeldaCopiarTipoMovimientoModulo=true;
			this.isVisibilidadCeldaVerFormTipoMovimientoModulo=true;
			this.isVisibilidadCeldaOrdenTipoMovimientoModulo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=false;
			
			
			this.isVisibilidadBusquedaPorCodigo=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadFK_IdModulo=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoMovimientoModulo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoMovimientoModulo(false);
			
			this.setPermisosUsuarioTipoMovimientoModulo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado() 
				|| (this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado() && this.tipomovimientomoduloSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoMovimientoModuloClasesRelacionadas();
			}
			
			if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoMovimientoModuloClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoMovimientoModulo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoMovimientoModulo();
			}
			
			if(!this.isPermisoBusquedaTipoMovimientoModulo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoMovimientoModulo,this.isPermisoPaginacionMedioTipoMovimientoModulo,this.isPermisoPaginacionTodoTipoMovimientoModulo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoMovimientoModuloConstantesFunciones.getTiposSeleccionarTipoMovimientoModulo());
				
				this.tiposColumnasSelect=TipoMovimientoModuloConstantesFunciones.getTiposSeleccionarTipoMovimientoModulo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoMovimientoModulo();				
				//this.tiposRelacionesSelect=TipoMovimientoModuloConstantesFunciones.getTiposRelacionesTipoMovimientoModulo(true);
				
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
			//if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoMovimientoModulo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoMovimientoModulo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoMovimientoModulo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimientoModulo() ;
			
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
			
			
			this.parametrocompraLogic=new ParametroCompraLogic();
			this.facturaproveedorservicioLogic=new FacturaProveedorServicioLogic();
			this.secuencialLogic=new SecuencialLogic();
			this.tipodocumentoLogic=new TipoDocumentoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.moduloLogic=new ModuloLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				tipomovimientomoduloImplementable= (TipoMovimientoModuloImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMovimientoModuloConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipomovimientomoduloImplementableHome= (TipoMovimientoModuloImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoMovimientoModuloConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipomovimientomodulos= new ArrayList<TipoMovimientoModulo>();
			this.tipomovimientomodulosEliminados= new ArrayList<TipoMovimientoModulo>();
						
			this.isEsNuevoTipoMovimientoModulo=false;
			this.esParaAccionDesdeFormularioTipoMovimientoModulo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.modulosForeignKey=new ArrayList<Modulo>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoMovimientoModulo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoMovimientoModulo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoMovimientoModuloConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoMovimientoModulo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoMovimientoModulo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoMovimientoModulo();
			}
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoMovimientoModulo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoMovimientoModulo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoMovimientoModulo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoMovimientoModulo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoMovimientoModulo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoMovimientoModulo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(SecuencialConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(SecuencialConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoMovimientoModulo")) {
				iIndex=this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();	
				
				

				if(sTitle.equals("Factura Proveedors")) {
					if(!FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoMovimientoModulo();

						this.cargarParteTabPanelRelacionadaFacturaProveedorServicio(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Compraes")) {
					if(!ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoMovimientoModulo();

						this.cargarParteTabPanelRelacionadaParametroCompra(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Secuenciales")) {
					if(!SecuencialJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoMovimientoModulo();

						this.cargarParteTabPanelRelacionadaSecuencial(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Tipo Documentos")) {
					if(!TipoDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoMovimientoModulo();

						this.cargarParteTabPanelRelacionadaTipoDocumento(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoMovimientoModulo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFacturaProveedorServicio(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoMovimientoModulo.cargarSessionConBeanSwingJInternalFrameFacturaProveedorServicio(false,true,iIndex);
		this.jButtonFacturaProveedorServicioActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFacturaProveedorServicio();

		//this.jTabbedPaneRelacionesTipoMovimientoModulo.updateUI();
		//this.jTabbedPaneRelacionesTipoMovimientoModulo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoMovimientoModulo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCompra(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoMovimientoModulo.cargarSessionConBeanSwingJInternalFrameParametroCompra(false,true,iIndex);
		this.jButtonParametroCompraActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCompra();

		//this.jTabbedPaneRelacionesTipoMovimientoModulo.updateUI();
		//this.jTabbedPaneRelacionesTipoMovimientoModulo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoMovimientoModulo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaSecuencial(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoMovimientoModulo.cargarSessionConBeanSwingJInternalFrameSecuencial(false,true,iIndex);
		this.jButtonSecuencialActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaSecuencial();

		//this.jTabbedPaneRelacionesTipoMovimientoModulo.updateUI();
		//this.jTabbedPaneRelacionesTipoMovimientoModulo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoMovimientoModulo.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTipoDocumento(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoMovimientoModulo.cargarSessionConBeanSwingJInternalFrameTipoDocumento(false,true,iIndex);
		this.jButtonTipoDocumentoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTipoDocumento();

		//this.jTabbedPaneRelacionesTipoMovimientoModulo.updateUI();
		//this.jTabbedPaneRelacionesTipoMovimientoModulo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoMovimientoModulo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ParametroCompra")) {
				int row=this.jTableDatosTipoMovimientoModulo.getSelectedRow();
				jButtonParametroCompraActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("FacturaProveedorServicio")) {
				int row=this.jTableDatosTipoMovimientoModulo.getSelectedRow();
				jButtonFacturaProveedorServicioActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Secuencial")) {
				int row=this.jTableDatosTipoMovimientoModulo.getSelectedRow();
				jButtonSecuencialActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("TipoDocumento")) {
				int row=this.jTableDatosTipoMovimientoModulo.getSelectedRow();
				jButtonTipoDocumentoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Parametro Compra")) {

					if(this.isTienePermisosParametroCompra && this.tipomovimientomoduloConstantesFunciones.mostrarParametroCompraTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Compraes"+"("+ParametroCompraConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Compraes");

						if(tipomovimientomoduloConstantesFunciones.resaltarParametroCompraTipoMovimientoModulo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipomovimientomoduloConstantesFunciones.resaltarParametroCompraTipoMovimientoModulo);
						}

						jmenuItem.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarParametroCompraTipoMovimientoModulo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCompra"));

						

						this.jInternalFrameDetalleFormTipoMovimientoModulo.jmenuDetalleTipoMovimientoModulo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Factura Proveedor")) {

					if(this.isTienePermisosFacturaProveedorServicio && this.tipomovimientomoduloConstantesFunciones.mostrarFacturaProveedorServicioTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Factura Proveedors"+"("+FacturaProveedorServicioConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Factura Proveedors");

						if(tipomovimientomoduloConstantesFunciones.resaltarFacturaProveedorServicioTipoMovimientoModulo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipomovimientomoduloConstantesFunciones.resaltarFacturaProveedorServicioTipoMovimientoModulo);
						}

						jmenuItem.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarFacturaProveedorServicioTipoMovimientoModulo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"FacturaProveedorServicio"));

						

						this.jInternalFrameDetalleFormTipoMovimientoModulo.jmenuDetalleTipoMovimientoModulo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Secuencial")) {

					if(this.isTienePermisosSecuencial && this.tipomovimientomoduloConstantesFunciones.mostrarSecuencialTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Secuenciales"+"("+SecuencialConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Secuenciales");

						if(tipomovimientomoduloConstantesFunciones.resaltarSecuencialTipoMovimientoModulo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipomovimientomoduloConstantesFunciones.resaltarSecuencialTipoMovimientoModulo);
						}

						jmenuItem.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarSecuencialTipoMovimientoModulo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Secuencial"));

						

						this.jInternalFrameDetalleFormTipoMovimientoModulo.jmenuDetalleTipoMovimientoModulo.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Tipo Documento")) {

					if(this.isTienePermisosTipoDocumento && this.tipomovimientomoduloConstantesFunciones.mostrarTipoDocumentoTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tipo Documentos"+"("+TipoDocumentoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tipo Documentos");

						if(tipomovimientomoduloConstantesFunciones.resaltarTipoDocumentoTipoMovimientoModulo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipomovimientomoduloConstantesFunciones.resaltarTipoDocumentoTipoMovimientoModulo);
						}

						jmenuItem.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarTipoDocumentoTipoMovimientoModulo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TipoDocumento"));

						

						this.jInternalFrameDetalleFormTipoMovimientoModulo.jmenuDetalleTipoMovimientoModulo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoMovimientoModulo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoMovimientoModulo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoMovimientoModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoMovimientoModuloListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoMovimientoModulo();
		
		this.cargarCombosFrameForeignKeyTipoMovimientoModulo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoMovimientoModulo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoMovimientoModulo();
		}
	}
	
	

	public void cargarCombosForeignKeyModulo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyModuloListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyModulo();
				this.cargarCombosFrameModulosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaModulo(this.modulosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTipoMovimientoModuloActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
			
			if(jTableDatosTipoMovimientoModulo.getRowCount()>=1) {
				jTableDatosTipoMovimientoModulo.removeRowSelectionInterval(0, jTableDatosTipoMovimientoModulo.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoMovimientoModulo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoMovimientoModulo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoMovimientoModulo(true);			
			//this.tipomovimientomodulo=new TipoMovimientoModulo();
			//this.tipomovimientomodulo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMovimientoModulo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimientoModulo() ;
			
			if(TipoMovimientoModuloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMovimientoModulo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipomovimientomodulo);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);				
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
			if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoMovimientoModulo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoMovimientoModuloActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoMovimientoModulo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoMovimientoModulo.getSelectedRows().length;			
			}
			
			tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoMovimientoModulo--;			
				//TipoMovimientoModulo tipomovimientomoduloAux= new TipoMovimientoModulo();			
				//tipomovimientomoduloAux.setId(this.iIdNuevoTipoMovimientoModulo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoMovimientoModulo tipomovimientomoduloOrigen=new TipoMovimientoModulo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoMovimientoModulo tipomovimientomoduloOrigen : tipomovimientomodulosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipomovimientomoduloOrigen =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipomovimientomoduloOrigen =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoMovimientoModulo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipomovimientomodulo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoMovimientoModulo(tipomovimientomoduloOrigen,this.tipomovimientomodulo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomovimientomoduloLogic.getTipoMovimientoModulos().add(this.tipomovimientomoduloAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomovimientomodulos.add(this.tipomovimientomoduloAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
				
				this.jTableDatosTipoMovimientoModulo.setRowSelectionInterval(this.getIndiceNuevoTipoMovimientoModulo(), this.getIndiceNuevoTipoMovimientoModulo());
				
				int iLastRow =  this.jTableDatosTipoMovimientoModulo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMovimientoModulo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMovimientoModulo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();									
		
			TipoMovimientoModulo tipomovimientomoduloOrigen=new TipoMovimientoModulo();
			TipoMovimientoModulo tipomovimientomoduloDestino=new TipoMovimientoModulo();
				
			tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoMovimientoModulo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipomovimientomodulosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoMovimientoModulo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomoduloOrigen =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomovimientomoduloOrigen =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipomovimientomoduloDestino =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipomovimientomoduloDestino =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipomovimientomoduloOrigen =tipomovimientomodulosSeleccionados.get(0);
				tipomovimientomoduloDestino =tipomovimientomodulosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoMovimientoModulo(tipomovimientomoduloOrigen,tipomovimientomoduloDestino,true,false);
				
				tipomovimientomoduloDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipomovimientomoduloDestino,tipomovimientomoduloLogic.getTipoMovimientoModulos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipomovimientomoduloDestino,tipomovimientomodulos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
				
				//this.jTableDatosTipoMovimientoModulo.setRowSelectionInterval(this.getIndiceNuevoTipoMovimientoModulo(), this.getIndiceNuevoTipoMovimientoModulo());
				
				int iLastRow =  this.jTableDatosTipoMovimientoModulo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoMovimientoModulo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoMovimientoModulo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoMovimientoModulo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoMovimientoModulo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(!isVisible);
			this.jPanelPaginacionTipoMovimientoModulo.setVisible(!isVisible);
			this.jPanelAccionesTipoMovimientoModulo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoMovimientoModulo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoMovimientoModulo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoMovimientoModulo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoMovimientoModulo();
			
			this.abrirFrameOrderByTipoMovimientoModulo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoMovimientoModulo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoMovimientoModulo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMovimientoModulo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.isMaximum()) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoMovimientoModulo.setSize(this.jInternalFrameDetalleFormTipoMovimientoModulo.iWidthFormulario,this.jInternalFrameDetalleFormTipoMovimientoModulo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoMovimientoModulo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoMovimientoModulo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoMovimientoModulo.isMaximum()) {
						this.jInternalFrameDetalleFormTipoMovimientoModulo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.jContentPaneDetalleTipoMovimientoModulo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoMovimientoModulo.jContentPaneDetalleTipoMovimientoModulo.getWidth(),TipoMovimientoModuloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoMovimientoModulo.jContentPaneDetalleTipoMovimientoModulo.getWidth(),TipoMovimientoModuloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoMovimientoModulo.jContentPaneDetalleTipoMovimientoModulo.getWidth(),TipoMovimientoModuloConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFacturaProveedorServicio();
					}

					if(ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCompra();
					}

					if(SecuencialJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaSecuencial();
					}

					if(TipoDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTipoDocumento();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoMovimientoModulo.setVisible(true);
	        this.jInternalFrameDetalleFormTipoMovimientoModulo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoMovimientoModulo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoMovimientoModulo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoMovimientoModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimientoModulo,false,this);
				} else {
					this.jInternalFrameOrderByTipoMovimientoModulo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoMovimientoModulo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoMovimientoModulo);
				this.jInternalFrameOrderByTipoMovimientoModulo.setVisible(false);
				this.jInternalFrameOrderByTipoMovimientoModulo.setSelected(false);
				
				this.jInternalFrameOrderByTipoMovimientoModulo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMovimientoModulo"));
				
				this.inicializarActualizarBindingTablaOrderByTipoMovimientoModulo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoMovimientoModulo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoMovimientoModulo==null) {
				
				this.jInternalFrameImportacionTipoMovimientoModulo=new ImportacionJInternalFrame(TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoMovimientoModulo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoMovimientoModulo);
				this.jInternalFrameImportacionTipoMovimientoModulo.setVisible(false);
				this.jInternalFrameImportacionTipoMovimientoModulo.setSelected(false);


				this.jInternalFrameImportacionTipoMovimientoModulo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMovimientoModulo"));
				this.jInternalFrameImportacionTipoMovimientoModulo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMovimientoModulo"));
				this.jInternalFrameImportacionTipoMovimientoModulo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMovimientoModulo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoMovimientoModulo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo==null) {
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo=new ReporteDinamicoJInternalFrame(TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoMovimientoModulo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoMovimientoModulo);
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMovimientoModulo"));
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMovimientoModulo"));
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMovimientoModulo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMovimientoModulo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFacturaProveedorServicio() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoMovimientoModulo.jContentPaneDetalleTipoMovimientoModulo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCompra() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoMovimientoModulo.jContentPaneDetalleTipoMovimientoModulo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaSecuencial() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.jScrollPanelDatosSecuencial.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoMovimientoModulo.jContentPaneDetalleTipoMovimientoModulo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.jScrollPanelDatosSecuencial.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.jScrollPanelDatosSecuencial.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.jScrollPanelDatosSecuencial.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTipoDocumento() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoMovimientoModulo.jContentPaneDetalleTipoMovimientoModulo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoMovimientoModulo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoMovimientoModulo);
			
	       	this.jInternalFrameDetalleFormTipoMovimientoModulo.setVisible(false);
	        this.jInternalFrameDetalleFormTipoMovimientoModulo.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoMovimientoModulo.dispose();
			//this.jInternalFrameDetalleFormTipoMovimientoModulo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoMovimientoModulo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoMovimientoModulo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoMovimientoModulo.setVisible(true);
	        this.jInternalFrameImportacionTipoMovimientoModulo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoMovimientoModulo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoMovimientoModulo.setVisible(true);
	        this.jInternalFrameOrderByTipoMovimientoModulo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoMovimientoModulo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoMovimientoModulo.setVisible(false);
	        this.jInternalFrameOrderByTipoMovimientoModulo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoMovimientoModulo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoMovimientoModulo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoMovimientoModulo.setVisible(false);
	        this.jInternalFrameImportacionTipoMovimientoModulo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoMovimientoModulo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoMovimientoModulo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoMovimientoModulo(true);
			//this.isEsNuevoTipoMovimientoModulo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMovimientoModulo(false) ;
			
			if(tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.getEsGuardarRelacionado() && ParametroCompraJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCompraActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.getEsGuardarRelacionado() && FacturaProveedorServicioJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaProveedorServicioActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialSessionBean.getEsGuardarRelacionado() && SecuencialJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonSecuencialActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.getEsGuardarRelacionado() && TipoDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoDocumentoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoMovimientoModuloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMovimientoModulo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimientoModulo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoMovimientoModuloActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoMovimientoModulo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoMovimientoModulo(true);
			//this.isEsNuevoTipoMovimientoModulo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipomovimientomodulo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoMovimientoModulo(false) ;
			
			if(TipoMovimientoModuloJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoMovimientoModulo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimientoModulo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaModulo(List<Modulo> modulosForeignKey)throws Exception{
		TableColumn tableColumnModulo=this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoModulo,TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO));
		TableCellEditor tableCellEditorModulo =tableColumnModulo.getCellEditor();

		ModuloTableCell moduloTableCellFk=(ModuloTableCell)tableCellEditorModulo;

		if(moduloTableCellFk!=null) {
			moduloTableCellFk.setmodulosForeignKey(modulosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTipoMovimientoModulo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//moduloTableCellFk.setRowActual(intSelectedRow);
			//moduloTableCellFk.setmodulosForeignKeyActual(modulosForeignKey);
		//}


		if(moduloTableCellFk!=null) {
			moduloTableCellFk.RecargarModulosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoMovimientoModulo(false);
			
			//if(!this.isEsNuevoTipoMovimientoModulo) {								
				int intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
				
			}
			
			if(this.permiteMantenimiento(this.tipomovimientomodulo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoMovimientoModulo=true;
					this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
					this.isEsNuevoTipoMovimientoModulo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoMovimientoModulo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoMovimientoModulo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMovimientoModulo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMovimientoModulo(false);
				
				this.habilitarDeshabilitarControlesTipoMovimientoModulo(false);
			
												
				
				if(TipoMovimientoModuloJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoMovimientoModulo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoMovimientoModuloActionPerformed(evt,tipomovimientomoduloSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoMovimientoModulo(this.tipomovimientomodulo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoMovimientoModulo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipomovimientomoduloSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipomovimientomodulo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				this.tipomovimientomodulo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				this.tipomovimientomodulo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipomovimientomodulo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoMovimientoModuloModel) this.jTableDatosTipoMovimientoModulo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoMovimientoModulo=true;
				this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
				this.isEsNuevoTipoMovimientoModulo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoMovimientoModulo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMovimientoModulo(false);
				
				this.habilitarDeshabilitarControlesTipoMovimientoModulo(false);
				
				
				
				if(TipoMovimientoModuloJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoMovimientoModulo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoMovimientoModulo.getRowCount()>=1) {
				jTableDatosTipoMovimientoModulo.removeRowSelectionInterval(0, jTableDatosTipoMovimientoModulo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoMovimientoModulo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoMovimientoModulo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoMovimientoModulo(false) ;
			
			this.isEsNuevoTipoMovimientoModulo=false;
			
			if(TipoMovimientoModuloJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoMovimientoModulo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoMovimientoModulo(false);
				
				//SI ES MANUAL
				if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoMovimientoModulo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoMovimientoModulo--;			
			//TipoMovimientoModulo tipomovimientomoduloAux= new TipoMovimientoModulo();			
			//tipomovimientomoduloAux.setId(this.iIdNuevoTipoMovimientoModulo);
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoMovimientoModulo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
			
			this.tipomovimientomodulo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipomovimientomoduloLogic.getTipoMovimientoModulos().add(this.tipomovimientomoduloAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipomovimientomodulos.add(this.tipomovimientomoduloAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
			
			this.jTableDatosTipoMovimientoModulo.setRowSelectionInterval(this.getIndiceNuevoTipoMovimientoModulo(), this.getIndiceNuevoTipoMovimientoModulo());
			
			int iLastRow =  this.jTableDatosTipoMovimientoModulo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoMovimientoModulo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoMovimientoModulo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimientoModulo(false);
			
			//SI ES MANUAL
			if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMovimientoModulo();
			}
			
			//this.abrirFrameTreeTipoMovimientoModulo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Movimiento ModuloS ?", "MANTENIMIENTO DE Tipo Movimiento Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoMovimientoModulo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoMovimientoModulo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipomovimientomoduloReturnGeneral=tipomovimientomoduloLogic.procesarImportacionTipoMovimientoModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipomovimientomoduloParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoMovimientoModuloReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoMovimientoModulo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoMovimientoModulo.setFileImportacion(this.jInternalFrameImportacionTipoMovimientoModulo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoMovimientoModulo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoMovimientoModulo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoMovimientoModulo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoMovimientoModulo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();		

		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoMovimientoModuloBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoMovimientoModuloBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoMovimientoModulos("Todos",tipomovimientomodulosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Modulo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Modulo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Modulo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Modulo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoria="id_modulo";
					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO:
					sNombreCampoCategoriaValor="id_modulo";
					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Modulo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_modulo");
					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();		
		
		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimientomodulo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoMovimientoModulos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO);
					iRow++;

					for(TipoMovimientoModulo tipomovimientomodulo:tipomovimientomodulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovimientomodulo.getmodulo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoMovimientoModulo tipomovimientomodulo:tipomovimientomodulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovimientomodulo.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoMovimientoModulo tipomovimientomodulo:tipomovimientomodulosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipomovimientomodulo.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoMovimientoModulo(row);				
			//	iRow++;
			//}				
			
			//for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoMovimientoModulo(tipomovimientomoduloAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimientoModulo(false);
			
			//SI ES MANUAL
			if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoMovimientoModulo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimientoModulo(false);
			
			//SI ES MANUAL
			if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMovimientoModulo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoMovimientoModulo(false);
			
			//SI ES MANUAL
			if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoMovimientoModulo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoMovimientoModulo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoMovimientoModulo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoMovimientoModulo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoMovimientoModulo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoMovimientoModulo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoMovimientoModulo.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoMovimientoModulo.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoMovimientoModulo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoMovimientoModulo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoMovimientoModulo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoMovimientoModulo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoMovimientoModulo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoMovimientoModulo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoMovimientoModulo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimientoModulo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoMovimientoModulo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoMovimientoModulo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoMovimientoModulo();
		
		this.inicializarActualizarBindingBotonesManualTipoMovimientoModulo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMovimientoModulo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimientoModulo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMovimientoModulo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMovimientoModulo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoMovimientoModulo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoMovimientoModulo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoMovimientoModulo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jCheckBoxPostAccionNuevoTipoMovimientoModulo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoMovimientoModulo.jCheckBoxPostAccionSinCerrarTipoMovimientoModulo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoMovimientoModulo.jCheckBoxPostAccionSinMensajeTipoMovimientoModulo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoMovimientoModulo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoMovimientoModulo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoMovimientoModulo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.jCheckBoxPostAccionNuevoTipoMovimientoModulo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoMovimientoModulo.jCheckBoxPostAccionSinCerrarTipoMovimientoModulo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoMovimientoModulo.jCheckBoxPostAccionSinMensajeTipoMovimientoModulo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoMovimientoModulo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoMovimientoModulo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoMovimientoModulo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoMovimientoModulo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoMovimientoModulo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoMovimientoModulo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoMovimientoModulo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoMovimientoModulo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoMovimientoModulo(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoMovimientoModulo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoMovimientoModulo() throws Exception {
		try	{
			if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMovimientoModulo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMovimientoModulo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoMovimientoModulo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoMovimientoModulo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoMovimientoModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoMovimientoModulo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoMovimientoModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoMovimientoModulo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoMovimientoModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoMovimientoModulo.addItem(reporte);
			}
			
			
			if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoMovimientoModulo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoMovimientoModulo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoMovimientoModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoMovimientoModulo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoMovimientoModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoMovimientoModulo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoMovimientoModulo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoMovimientoModulo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoMovimientoModulo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMovimientoModulo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoMovimientoModulo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo!=null) {
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo!=null) {
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoMovimientoModulo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.codigoBusquedaPorCodigo=this.jTextFieldcodigoBusquedaPorCodigoTipoMovimientoModulo.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoMovimientoModulo.getText();
		if(this.jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.getSelectedItem()!=null){this.id_moduloFK_IdModulo=((Modulo)this.jComboBoxid_moduloFK_IdModuloTipoMovimientoModulo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoMovimientoModulo(Boolean esInicializar) throws Exception {				
		if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoMovimientoModulo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoMovimientoModulo() throws Exception {
		this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoMovimientoModulo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoMovimientoModuloPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoMovimientoModuloPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoMovimientoModuloOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoModuloOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoMovimientoModuloPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoMovimientoModuloPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoMovimientoModulo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipomovimientomoduloLogic.getTipoMovimientoModulos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipomovimientomodulos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoMovimientoModulo.setModel(new TipoMovimientoModuloModel(this.tipomovimientomoduloLogic.getTipoMovimientoModulos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoMovimientoModulo.setModel(new TipoMovimientoModuloModel(this.tipomovimientomodulos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoMovimientoModulo!=null && this.jInternalFrameOrderByTipoMovimientoModulo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoMovimientoModulo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoModulo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoMovimientoModuloPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO,tipomovimientomoduloConstantesFunciones.resaltarSeleccionarTipoMovimientoModulo,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoMovimientoModuloConstantesFunciones.SCLASSWEBTITULO,tipomovimientomoduloConstantesFunciones.resaltarSeleccionarTipoMovimientoModulo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoModulo,TipoMovimientoModuloConstantesFunciones.LABEL_ID));

		if(this.tipomovimientomoduloConstantesFunciones.mostraridTipoMovimientoModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimientoModuloConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipomovimientomoduloConstantesFunciones.resaltaridTipoMovimientoModulo,this.tipomovimientomoduloConstantesFunciones.activaridTipoMovimientoModulo,this,true,"idTipoMovimientoModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovimientomoduloConstantesFunciones.resaltaridTipoMovimientoModulo,this.tipomovimientomoduloConstantesFunciones.activaridTipoMovimientoModulo,this,true,"idTipoMovimientoModulo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoModulo,TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO));

		if(this.tipomovimientomoduloConstantesFunciones.mostrarid_moduloTipoMovimientoModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ModuloTableCell(this.modulosForeignKey,this.tipomovimientomoduloConstantesFunciones.resaltarid_moduloTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarid_moduloTipoMovimientoModulo));
			tableColumn.setCellEditor(new ModuloTableCell(this.modulosForeignKey,this.tipomovimientomoduloConstantesFunciones.resaltarid_moduloTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarid_moduloTipoMovimientoModulo,true,"id_moduloTipoMovimientoModulo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoMovimientoModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoModulo,TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO));

		if(this.tipomovimientomoduloConstantesFunciones.mostrarcodigoTipoMovimientoModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomovimientomoduloConstantesFunciones.resaltarcodigoTipoMovimientoModulo,this.tipomovimientomoduloConstantesFunciones.activarcodigoTipoMovimientoModulo,this,true,"codigoTipoMovimientoModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovimientomoduloConstantesFunciones.resaltarcodigoTipoMovimientoModulo,this.tipomovimientomoduloConstantesFunciones.activarcodigoTipoMovimientoModulo,this,true,"codigoTipoMovimientoModulo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoMovimientoModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoModulo,TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE));

		if(this.tipomovimientomoduloConstantesFunciones.mostrarnombreTipoMovimientoModulo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipomovimientomoduloConstantesFunciones.resaltarnombreTipoMovimientoModulo,this.tipomovimientomoduloConstantesFunciones.activarnombreTipoMovimientoModulo,this,true,"nombreTipoMovimientoModulo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipomovimientomoduloConstantesFunciones.resaltarnombreTipoMovimientoModulo,this.tipomovimientomoduloConstantesFunciones.activarnombreTipoMovimientoModulo,this,true,"nombreTipoMovimientoModulo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new TipoMovimientoModuloPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosParametroCompra && this.tipomovimientomoduloConstantesFunciones.mostrarParametroCompraTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Compraes");
				tableColumn.setHeaderValue("Parametro Compraes");
				tableColumn.setCellRenderer(new ParametroCompraTableCell(tipomovimientomoduloConstantesFunciones.resaltarParametroCompraTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarParametroCompraTipoMovimientoModulo));
				tableColumn.setCellEditor(new ParametroCompraTableCell(tipomovimientomoduloConstantesFunciones.resaltarParametroCompraTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarParametroCompraTipoMovimientoModulo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoMovimientoModulo.addColumn(tableColumn);
			}

			if(this.isTienePermisosFacturaProveedorServicio && this.tipomovimientomoduloConstantesFunciones.mostrarFacturaProveedorServicioTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Factura Proveedors");
				tableColumn.setHeaderValue("Factura Proveedors");
				tableColumn.setCellRenderer(new FacturaProveedorServicioTableCell(tipomovimientomoduloConstantesFunciones.resaltarFacturaProveedorServicioTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarFacturaProveedorServicioTipoMovimientoModulo));
				tableColumn.setCellEditor(new FacturaProveedorServicioTableCell(tipomovimientomoduloConstantesFunciones.resaltarFacturaProveedorServicioTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarFacturaProveedorServicioTipoMovimientoModulo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoMovimientoModulo.addColumn(tableColumn);
			}

			if(this.isTienePermisosSecuencial && this.tipomovimientomoduloConstantesFunciones.mostrarSecuencialTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Secuenciales");
				tableColumn.setHeaderValue("Secuenciales");
				tableColumn.setCellRenderer(new SecuencialTableCell(tipomovimientomoduloConstantesFunciones.resaltarSecuencialTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarSecuencialTipoMovimientoModulo));
				tableColumn.setCellEditor(new SecuencialTableCell(tipomovimientomoduloConstantesFunciones.resaltarSecuencialTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarSecuencialTipoMovimientoModulo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoMovimientoModulo.addColumn(tableColumn);
			}

			if(this.isTienePermisosTipoDocumento && this.tipomovimientomoduloConstantesFunciones.mostrarTipoDocumentoTipoMovimientoModulo && !TipoMovimientoModuloConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tipo Documentos");
				tableColumn.setHeaderValue("Tipo Documentos");
				tableColumn.setCellRenderer(new TipoDocumentoTableCell(tipomovimientomoduloConstantesFunciones.resaltarTipoDocumentoTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarTipoDocumentoTipoMovimientoModulo));
				tableColumn.setCellEditor(new TipoDocumentoTableCell(tipomovimientomoduloConstantesFunciones.resaltarTipoDocumentoTipoMovimientoModulo,this,this.tipomovimientomoduloConstantesFunciones.activarTipoDocumentoTipoMovimientoModulo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoMovimientoModulo.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMovimientoModulo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoMovimientoModulo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoMovimientoModulo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoMovimientoModulo.addColumn(tableColumn);
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
			
			this.jTableDatosTipoMovimientoModulo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoMovimientoModulo.moveColumn(this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoMovimientoModulo.moveColumn(this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoMovimientoModulo.moveColumn(this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoMovimientoModulo.moveColumn(this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoMovimientoModulo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoMovimientoModulo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoMovimientoModulo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoMovimientoModulo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoMovimientoModulo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoMovimientoModulo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipomovimientomoduloLogic.getTipoMovimientoModulos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipomovimientomodulos.size()-1;
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
		//this.jTableDatosTipoMovimientoModulo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoMovimientoModulo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoMovimientoModulo();
			
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
				
				//this.isEsNuevoTipoMovimientoModulo=false;
					
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
				if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMovimientoModulo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMovimientoModulo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipomovimientomodulo.getsType().equals("DUPLICADO")
				   || this.tipomovimientomodulo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoMovimientoModulo=true;
				
				} else {
					this.isEsNuevoTipoMovimientoModulo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
					if(this.tipomovimientomodulo.getId()>=0 && !this.tipomovimientomodulo.getIsNew()) {						
						this.isEsNuevoTipoMovimientoModulo=false;
						
					} else {
						this.isEsNuevoTipoMovimientoModulo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoMovimientoModulo(esRelaciones);						
				
				this.seleccionarTipoMovimientoModulo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipomovimientomodulo.getId()<0) {
					this.isEsNuevoTipoMovimientoModulo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoMovimientoModulo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoMovimientoModulo(evt,rowIndex);
				}	
				
				if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoMovimientoModulo: " + this.dDif); 
					}
				}								
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoMovimientoModulo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipomovimientomodulo)) {
					if(this.tipomovimientomodulo.getId()>0) {
						this.tipomovimientomodulo.setIsDeleted(true);
						
						this.tipomovimientomodulosEliminados.add(this.tipomovimientomodulo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipomovimientomoduloLogic.getTipoMovimientoModulos().remove(this.tipomovimientomodulo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipomovimientomodulos.remove(this.tipomovimientomodulo);				
					}
					
					
					((TipoMovimientoModuloModel) this.jTableDatosTipoMovimientoModulo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoMovimientoModulo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoMovimientoModulo) {
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoMovimientoModulo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoMovimientoModulo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoMovimientoModulo(this.tipomovimientomodulo);
				}
				
				//ARCHITECTURE
				try {
					

					//Modulo
					if(!this.tipomovimientomoduloConstantesFunciones.cargarid_moduloTipoMovimientoModulo || this.tipomovimientomoduloConstantesFunciones.event_dependid_moduloTipoMovimientoModulo) {
						//this.cargarCombosModulosForeignKeyLista(" where id="+this.tipomovimientomodulo.getid_modulo());
									//this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
						this.modulosForeignKey=new ArrayList<Modulo>();

						if(tipomovimientomodulo.getModulo()!=null) {
							this.modulosForeignKey.add(tipomovimientomodulo.getModulo());
						}

						this.addItemDefectoCombosForeignKeyModulo();
						this.cargarCombosFrameModulosForeignKey("Todos");
					}
					this.setActualModuloForeignKey(this.tipomovimientomodulo.getid_modulo(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoMovimientoModulo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoMovimientoModulo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoMovimientoModulo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoMovimientoModulo(tipomovimientomodulo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoMovimientoModulo(tipomovimientomodulo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoMovimientoModulo(tipomovimientomodulo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimientoModulo(tipomovimientomodulo);
	}
	
	public void setVariablesObjetoActualToFormularioTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.setText(tipomovimientomodulo.getId().toString());
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldcodigoTipoMovimientoModulo.setText(tipomovimientomodulo.getcodigo());
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextAreanombreTipoMovimientoModulo.setText(tipomovimientomodulo.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoMovimientoModulo tipomovimientomoduloLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipomovimientomoduloLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoMovimientoModulo tipomovimientomoduloLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipomovimientomoduloLocal=this.tipomovimientomodulo;
			} else {
				tipomovimientomoduloLocal=this.tipomovimientomoduloAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipomovimientomoduloLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoMovimientoModulo(tipomovimientomoduloLocal,true);
					
					if(tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipomovimientomoduloLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipomovimientomoduloLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(tipomovimientomodulo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(tipomovimientomodulo);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(tipomovimientomodulo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.getText()==null || this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.getText()=="" || this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.setText("0");
			}

			if(conColumnasBase) {tipomovimientomodulo.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMovimientoModuloConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimientoModulo.jLabelIdTipoMovimientoModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomovimientomodulo.setcodigo(this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldcodigoTipoMovimientoModulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimientoModulo.jLabelcodigoTipoMovimientoModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipomovimientomodulo.setnombre(this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextAreanombreTipoMovimientoModulo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoMovimientoModulo.jLabelnombreTipoMovimientoModulo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomoduloBean,TipoMovimientoModulo tipomovimientomodulo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && tipomovimientomoduloBean.getid_modulo()!=null && !tipomovimientomoduloBean.getid_modulo().equals(-1L))) {tipomovimientomodulo.setid_modulo(tipomovimientomoduloBean.getid_modulo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomoduloOrigen,TipoMovimientoModulo tipomovimientomodulo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomovimientomoduloOrigen.getId()!=null && !tipomovimientomoduloOrigen.getId().equals(0L))) {tipomovimientomodulo.setId(tipomovimientomoduloOrigen.getId());}}
			if(conDefault || (!conDefault && tipomovimientomoduloOrigen.getid_modulo()!=null && !tipomovimientomoduloOrigen.getid_modulo().equals(-1L))) {tipomovimientomodulo.setid_modulo(tipomovimientomoduloOrigen.getid_modulo());}
			if(conDefault || (!conDefault && tipomovimientomoduloOrigen.getcodigo()!=null && !tipomovimientomoduloOrigen.getcodigo().equals(""))) {tipomovimientomodulo.setcodigo(tipomovimientomoduloOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipomovimientomoduloOrigen.getnombre()!=null && !tipomovimientomoduloOrigen.getnombre().equals(""))) {tipomovimientomodulo.setnombre(tipomovimientomoduloOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.setText(tipomovimientomodulo.getId().toString());
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldcodigoTipoMovimientoModulo.setText(tipomovimientomodulo.getcodigo());
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextAreanombreTipoMovimientoModulo.setText(tipomovimientomodulo.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoMovimientoModulo(TipoMovimientoModuloBean tipomovimientomoduloBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.setText(tipomovimientomoduloBean.getId().toString());
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldcodigoTipoMovimientoModulo.setText(tipomovimientomoduloBean.getcodigo());
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextAreanombreTipoMovimientoModulo.setText(tipomovimientomoduloBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoMovimientoModulo(TipoMovimientoModuloParameterReturnGeneral tipomovimientomoduloReturnGeneral,TipoMovimientoModuloBean tipomovimientomoduloBean,Boolean conDefault) throws Exception { 
		try {
			TipoMovimientoModulo tipomovimientomoduloLocal=new TipoMovimientoModulo();
			
			tipomovimientomoduloLocal=tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipomovimientomoduloLocal.getId()!=null && !tipomovimientomoduloLocal.getId().equals(0L))) {tipomovimientomoduloBean.setId(tipomovimientomoduloLocal.getId());}}
			if(conDefault || (!conDefault && tipomovimientomoduloLocal.getid_modulo()!=null && !tipomovimientomoduloLocal.getid_modulo().equals(-1L))) {tipomovimientomoduloBean.setid_modulo(tipomovimientomoduloLocal.getid_modulo());}
			if(conDefault || (!conDefault && tipomovimientomoduloLocal.getcodigo()!=null && !tipomovimientomoduloLocal.getcodigo().equals(""))) {tipomovimientomoduloBean.setcodigo(tipomovimientomoduloLocal.getcodigo());}
			if(conDefault || (!conDefault && tipomovimientomoduloLocal.getnombre()!=null && !tipomovimientomoduloLocal.getnombre().equals(""))) {tipomovimientomoduloBean.setnombre(tipomovimientomoduloLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoMovimientoModuloGenerico(Long idTipoMovimientoModuloSeleccionado,JComboBox jComboBoxTipoMovimientoModulo,List<TipoMovimientoModulo> tipomovimientomodulosLocal)throws Exception {
		try {
			TipoMovimientoModulo  tipomovimientomoduloTemp=null;

			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosLocal) {
				if(tipomovimientomoduloAux.getId()!=null && tipomovimientomoduloAux.getId().equals(idTipoMovimientoModuloSeleccionado)) {
					tipomovimientomoduloTemp=tipomovimientomoduloAux;
					break;
				}
			}

			jComboBoxTipoMovimientoModulo.setSelectedItem(tipomovimientomoduloTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoMovimientoModuloGenerico(JComboBox jComboBoxTipoMovimientoModulo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoMovimientoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMovimientoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoMovimientoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoMovimientoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMovimientoModulo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoMovimientoModulo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoMovimientoModulo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoMovimientoModulo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoMovimientoModulo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoMovimientoModulo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ParametroCompra")) {
			jButtonParametroCompraActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("FacturaProveedorServicio")) {
			jButtonFacturaProveedorServicioActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Secuencial")) {
			jButtonSecuencialActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("TipoDocumento")) {
			jButtonTipoDocumentoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovimientomodulo=(TipoMovimientoModulo) tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomovimientomodulo =(TipoMovimientoModulo) tipomovimientomodulos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Modulo")) {
			//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
			if(!tipomovimientomodulo.getIsNew() && !tipomovimientomodulo.getIsChanged() && !tipomovimientomodulo.getIsDeleted()) {
				sDescripcion=tipomovimientomodulo.getmodulo_descripcion();
			} else {
				//sDescripcion=this.getActualModuloForeignKeyDescripcion((Long)value);
				sDescripcion=tipomovimientomodulo.getmodulo_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoMovimientoModulo tipomovimientomoduloRow=new TipoMovimientoModulo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovimientomoduloRow=(TipoMovimientoModulo) tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipomovimientomoduloRow=(TipoMovimientoModulo) tipomovimientomodulos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonParametroCompraActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoMovimientoModulo tipomovimientomodulo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomodulo = (TipoMovimientoModulo)this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipomovimientomodulo = (TipoMovimientoModulo)this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipomovimientomodulo!=null) {
						this.tipomovimientomodulo = tipomovimientomodulo;
					} else {
						this.tipomovimientomodulo = new TipoMovimientoModulo();
					}
				}

				if(this.isTienePermisosParametroCompra && this.permiteMantenimiento(this.tipomovimientomodulo)) {
					ParametroCompraBeanSwingJInternalFrame parametrocompraBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFramePopup=new ParametroCompraBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFramePopup;
					} else {
						parametrocompraBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame;
					}

					List<TipoMovimientoModulo> tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
					tipomovimientomodulos.add(this.tipomovimientomodulo);
					if(!esRelacionado) {
						//parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setConGuardarRelaciones(false);
						//parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocompraBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoMovimientoModulo.cargarParametroCompraBeanSwingJInternalFrame(tipomovimientomodulos,this.tipomovimientomodulo,parametrocompraBeanSwingJInternalFrame,/*conInicializar,*/parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.getConGuardarRelaciones(),parametrocompraBeanSwingJInternalFrame.parametrocompraSessionBean.getEsGuardarRelacionado());
					parametrocompraBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocompraBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCompra("no_relacionado");

						parametrocompraBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCompraConstantesFunciones.ITAMANIOFILATABLA + (ParametroCompraConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocompraBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoMovimientoModulo=(TitledBorder)this.jScrollPanelDatosTipoMovimientoModulo.getBorder();
						TitledBorder titledBorderParametroCompra=(TitledBorder)parametrocompraBeanSwingJInternalFrame.jScrollPanelDatosParametroCompra.getBorder();

						titledBorderParametroCompra.setTitle(titledBorderTipoMovimientoModulo.getTitle() + " -> Parametro Compra");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocompraBeanSwingJInternalFrame);
						}

						parametrocompraBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocompraBeanSwingJInternalFrame);

						parametrocompraBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Compra",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonFacturaProveedorServicioActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoMovimientoModulo tipomovimientomodulo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomodulo = (TipoMovimientoModulo)this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipomovimientomodulo = (TipoMovimientoModulo)this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipomovimientomodulo!=null) {
						this.tipomovimientomodulo = tipomovimientomodulo;
					} else {
						this.tipomovimientomodulo = new TipoMovimientoModulo();
					}
				}

				if(this.isTienePermisosFacturaProveedorServicio && this.permiteMantenimiento(this.tipomovimientomodulo)) {
					FacturaProveedorServicioBeanSwingJInternalFrame facturaproveedorservicioBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFramePopup=new FacturaProveedorServicioBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturaproveedorservicioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFramePopup;
					} else {
						facturaproveedorservicioBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame;
					}

					List<TipoMovimientoModulo> tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
					tipomovimientomodulos.add(this.tipomovimientomodulo);
					if(!esRelacionado) {
						//facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setConGuardarRelaciones(false);
						//facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturaproveedorservicioBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoMovimientoModulo.cargarFacturaProveedorServicioBeanSwingJInternalFrame(tipomovimientomodulos,this.tipomovimientomodulo,facturaproveedorservicioBeanSwingJInternalFrame,/*conInicializar,*/facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.getConGuardarRelaciones(),facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioSessionBean.getEsGuardarRelacionado());
					facturaproveedorservicioBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturaproveedorservicioBeanSwingJInternalFrame.actualizarEstadoPanelsFacturaProveedorServicio("no_relacionado");

						facturaproveedorservicioBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaProveedorServicioConstantesFunciones.ITAMANIOFILATABLA + (FacturaProveedorServicioConstantesFunciones.ITAMANIOFILATABLA/2));

						facturaproveedorservicioBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoMovimientoModulo=(TitledBorder)this.jScrollPanelDatosTipoMovimientoModulo.getBorder();
						TitledBorder titledBorderFacturaProveedorServicio=(TitledBorder)facturaproveedorservicioBeanSwingJInternalFrame.jScrollPanelDatosFacturaProveedorServicio.getBorder();

						titledBorderFacturaProveedorServicio.setTitle(titledBorderTipoMovimientoModulo.getTitle() + " -> Factura Proveedor");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturaproveedorservicioBeanSwingJInternalFrame);
						}

						facturaproveedorservicioBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturaproveedorservicioBeanSwingJInternalFrame);

						facturaproveedorservicioBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura Proveedor",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonSecuencialActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoMovimientoModulo tipomovimientomodulo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomodulo = (TipoMovimientoModulo)this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipomovimientomodulo = (TipoMovimientoModulo)this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipomovimientomodulo!=null) {
						this.tipomovimientomodulo = tipomovimientomodulo;
					} else {
						this.tipomovimientomodulo = new TipoMovimientoModulo();
					}
				}

				if(this.isTienePermisosSecuencial && this.permiteMantenimiento(this.tipomovimientomodulo)) {
					SecuencialBeanSwingJInternalFrame secuencialBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFramePopup=new SecuencialBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						secuencialBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFramePopup;
					} else {
						secuencialBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame;
					}

					List<TipoMovimientoModulo> tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
					tipomovimientomodulos.add(this.tipomovimientomodulo);
					if(!esRelacionado) {
						//secuencialBeanSwingJInternalFrame.secuencialSessionBean.setConGuardarRelaciones(false);
						//secuencialBeanSwingJInternalFrame.secuencialSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					secuencialBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoMovimientoModulo.cargarSecuencialBeanSwingJInternalFrame(tipomovimientomodulos,this.tipomovimientomodulo,secuencialBeanSwingJInternalFrame,/*conInicializar,*/secuencialBeanSwingJInternalFrame.secuencialSessionBean.getConGuardarRelaciones(),secuencialBeanSwingJInternalFrame.secuencialSessionBean.getEsGuardarRelacionado());
					secuencialBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						secuencialBeanSwingJInternalFrame.actualizarEstadoPanelsSecuencial("no_relacionado");

						secuencialBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(SecuencialConstantesFunciones.ITAMANIOFILATABLA + (SecuencialConstantesFunciones.ITAMANIOFILATABLA/2));

						secuencialBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoMovimientoModulo=(TitledBorder)this.jScrollPanelDatosTipoMovimientoModulo.getBorder();
						TitledBorder titledBorderSecuencial=(TitledBorder)secuencialBeanSwingJInternalFrame.jScrollPanelDatosSecuencial.getBorder();

						titledBorderSecuencial.setTitle(titledBorderTipoMovimientoModulo.getTitle() + " -> Secuencial");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,secuencialBeanSwingJInternalFrame);
						}

						secuencialBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(secuencialBeanSwingJInternalFrame);

						secuencialBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Secuencial",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonTipoDocumentoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoMovimientoModulo tipomovimientomodulo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomodulo = (TipoMovimientoModulo)this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipomovimientomodulo = (TipoMovimientoModulo)this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipomovimientomodulo!=null) {
						this.tipomovimientomodulo = tipomovimientomodulo;
					} else {
						this.tipomovimientomodulo = new TipoMovimientoModulo();
					}
				}

				if(this.isTienePermisosTipoDocumento && this.permiteMantenimiento(this.tipomovimientomodulo)) {
					TipoDocumentoBeanSwingJInternalFrame tipodocumentoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFramePopup=new TipoDocumentoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tipodocumentoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFramePopup;
					} else {
						tipodocumentoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame;
					}

					List<TipoMovimientoModulo> tipomovimientomodulos=new ArrayList<TipoMovimientoModulo>();
					tipomovimientomodulos.add(this.tipomovimientomodulo);
					if(!esRelacionado) {
						//tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.setConGuardarRelaciones(false);
						//tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tipodocumentoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoMovimientoModulo.cargarTipoDocumentoBeanSwingJInternalFrame(tipomovimientomodulos,this.tipomovimientomodulo,tipodocumentoBeanSwingJInternalFrame,/*conInicializar,*/tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.getConGuardarRelaciones(),tipodocumentoBeanSwingJInternalFrame.tipodocumentoSessionBean.getEsGuardarRelacionado());
					tipodocumentoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tipodocumentoBeanSwingJInternalFrame.actualizarEstadoPanelsTipoDocumento("no_relacionado");

						tipodocumentoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TipoDocumentoConstantesFunciones.ITAMANIOFILATABLA + (TipoDocumentoConstantesFunciones.ITAMANIOFILATABLA/2));

						tipodocumentoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoMovimientoModulo=(TitledBorder)this.jScrollPanelDatosTipoMovimientoModulo.getBorder();
						TitledBorder titledBorderTipoDocumento=(TitledBorder)tipodocumentoBeanSwingJInternalFrame.jScrollPanelDatosTipoDocumento.getBorder();

						titledBorderTipoDocumento.setTitle(titledBorderTipoMovimientoModulo.getTitle() + " -> Tipo Documento");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tipodocumentoBeanSwingJInternalFrame);
						}

						tipodocumentoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tipodocumentoBeanSwingJInternalFrame);

						tipodocumentoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tipo Documento",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoMovimientoModulo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaNuevoTipoMovimientoModulo && this.isPermisoNuevoTipoMovimientoModulo));			
			this.jButtonDuplicarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaDuplicarTipoMovimientoModulo && this.isPermisoDuplicarTipoMovimientoModulo));			
			this.jButtonCopiarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaCopiarTipoMovimientoModulo && this.isPermisoCopiarTipoMovimientoModulo));
			this.jButtonVerFormTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaVerFormTipoMovimientoModulo && this.isPermisoVerFormTipoMovimientoModulo));
			
			this.jButtonAbrirOrderByTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaOrdenTipoMovimientoModulo && this.isPermisoOrdenTipoMovimientoModulo));			
			
			this.jButtonNuevoRelacionesTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo && this.isPermisoNuevoTipoMovimientoModulo));			
			this.jButtonNuevoGuardarCambiosTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaNuevoTipoMovimientoModulo && this.isPermisoNuevoTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonModificarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaModificarTipoMovimientoModulo && this.isPermisoActualizarTipoMovimientoModulo));	
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaActualizarTipoMovimientoModulo && this.isPermisoActualizarTipoMovimientoModulo));	
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaEliminarTipoMovimientoModulo && this.isPermisoEliminarTipoMovimientoModulo));
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarTipoMovimientoModulo.setVisible(this.isVisibilidadCeldaCancelarTipoMovimientoModulo);							
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaGuardarTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaNuevoTipoMovimientoModulo && this.isPermisoNuevoTipoMovimientoModulo));						
			this.jButtonDuplicarToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaDuplicarTipoMovimientoModulo && this.isPermisoDuplicarTipoMovimientoModulo));						
			this.jButtonCopiarToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaCopiarTipoMovimientoModulo && this.isPermisoCopiarTipoMovimientoModulo));			
			this.jButtonVerFormToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaVerFormTipoMovimientoModulo && this.isPermisoVerFormTipoMovimientoModulo));			
			this.jButtonAbrirOrderByToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaOrdenTipoMovimientoModulo && this.isPermisoOrdenTipoMovimientoModulo));
			this.jButtonNuevoRelacionesToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo && this.isPermisoNuevoTipoMovimientoModulo));			
			this.jButtonNuevoGuardarCambiosToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaNuevoTipoMovimientoModulo && this.isPermisoNuevoTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));			
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonModificarToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaModificarTipoMovimientoModulo && this.isPermisoActualizarTipoMovimientoModulo));	
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaActualizarTipoMovimientoModulo  && this.isPermisoActualizarTipoMovimientoModulo));	
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaEliminarTipoMovimientoModulo && this.isPermisoEliminarTipoMovimientoModulo));
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarToolBarTipoMovimientoModulo.setVisible(this.isVisibilidadCeldaCancelarTipoMovimientoModulo);				
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaGuardarTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaNuevoTipoMovimientoModulo && this.isPermisoNuevoTipoMovimientoModulo));			
			this.jMenuItemDuplicarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaDuplicarTipoMovimientoModulo && this.isPermisoDuplicarTipoMovimientoModulo));			
			this.jMenuItemCopiarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaCopiarTipoMovimientoModulo && this.isPermisoCopiarTipoMovimientoModulo));			
			this.jMenuItemVerFormTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaVerFormTipoMovimientoModulo && this.isPermisoVerFormTipoMovimientoModulo));			
			this.jMenuItemAbrirOrderByTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaOrdenTipoMovimientoModulo && this.isPermisoOrdenTipoMovimientoModulo));			
			//this.jMenuItemMostrarOcultarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaOrdenTipoMovimientoModulo && this.isPermisoOrdenTipoMovimientoModulo));
			this.jMenuItemDetalleAbrirOrderByTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaOrdenTipoMovimientoModulo && this.isPermisoOrdenTipoMovimientoModulo));			
			//this.jMenuItemDetalleMostrarOcultarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaOrdenTipoMovimientoModulo && this.isPermisoOrdenTipoMovimientoModulo));			
			this.jMenuItemNuevoRelacionesTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo && this.isPermisoNuevoTipoMovimientoModulo));			
			this.jMenuItemNuevoGuardarCambiosTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaNuevoTipoMovimientoModulo && this.isPermisoNuevoTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));									
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemModificarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaModificarTipoMovimientoModulo && this.isPermisoActualizarTipoMovimientoModulo));	
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemActualizarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaActualizarTipoMovimientoModulo && this.isPermisoActualizarTipoMovimientoModulo));	
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemEliminarTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaEliminarTipoMovimientoModulo && this.isPermisoEliminarTipoMovimientoModulo));
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemCancelarTipoMovimientoModulo.setVisible(this.isVisibilidadCeldaCancelarTipoMovimientoModulo);				
			}
			
			this.jMenuItemGuardarCambiosTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaGuardarTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));						
			this.jMenuItemGuardarCambiosTablaTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=this.jButtonNuevoTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaDuplicarTipoMovimientoModulo=this.jButtonDuplicarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaCopiarTipoMovimientoModulo=this.jButtonCopiarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaVerFormTipoMovimientoModulo=this.jButtonVerFormTipoMovimientoModulo.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoMovimientoModulo=this.jButtonAbrirOrderByTipoMovimientoModulo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=this.jButtonNuevoRelacionesTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=this.jButtonModificarTipoMovimientoModulo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaGuardarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosTipoMovimientoModulo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=this.jButtonGuardarCambiosTablaTipoMovimientoModulo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=this.jButtonNuevoToolBarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=this.jButtonNuevoRelacionesToolBarTipoMovimientoModulo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonModificarToolBarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarToolBarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarToolBarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarToolBarTipoMovimientoModulo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMovimientoModulo=this.jButtonGuardarCambiosToolBarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=this.jButtonGuardarCambiosTablaToolBarTipoMovimientoModulo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=this.jMenuItemNuevoTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=this.jMenuItemNuevoRelacionesTipoMovimientoModulo.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemModificarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemActualizarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemEliminarTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemCancelarTipoMovimientoModulo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoMovimientoModulo=this.jMenuItemGuardarCambiosTipoMovimientoModulo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=this.jMenuItemGuardarCambiosTablaTipoMovimientoModulo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoMovimientoModulo(Boolean esInicializar) {
		if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
				//if(this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMovimientoModulo();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoMovimientoModulo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoMovimientoModulo() {
		this.jButtonNuevoTipoMovimientoModulo.setVisible(this.isPermisoNuevoTipoMovimientoModulo);			
		this.jButtonDuplicarTipoMovimientoModulo.setVisible(this.isPermisoDuplicarTipoMovimientoModulo);			
		this.jButtonCopiarTipoMovimientoModulo.setVisible(this.isPermisoCopiarTipoMovimientoModulo);			
		this.jButtonVerFormTipoMovimientoModulo.setVisible(this.isPermisoVerFormTipoMovimientoModulo);			
		
		this.jButtonAbrirOrderByTipoMovimientoModulo.setVisible(this.isPermisoOrdenTipoMovimientoModulo);					
		
		this.jButtonNuevoRelacionesTipoMovimientoModulo.setVisible(this.isPermisoNuevoTipoMovimientoModulo);			
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonModificarTipoMovimientoModulo.setVisible(this.isPermisoActualizarTipoMovimientoModulo);	
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarTipoMovimientoModulo.setVisible(this.isPermisoActualizarTipoMovimientoModulo);	
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarTipoMovimientoModulo.setVisible(this.isPermisoEliminarTipoMovimientoModulo);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarTipoMovimientoModulo.setVisible(this.isVisibilidadCeldaCancelarTipoMovimientoModulo);						
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosTipoMovimientoModulo.setVisible(this.isPermisoGuardarCambiosTipoMovimientoModulo);							
		}
		
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo.setVisible(this.isPermisoActualizarTipoMovimientoModulo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMovimientoModulo() {
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonModificarTipoMovimientoModulo.setVisible(this.isPermisoActualizarTipoMovimientoModulo);	
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarTipoMovimientoModulo.setVisible(this.isPermisoActualizarTipoMovimientoModulo);	
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarTipoMovimientoModulo.setVisible(this.isPermisoEliminarTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarTipoMovimientoModulo.setVisible(this.isVisibilidadCeldaCancelarTipoMovimientoModulo);							
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosTipoMovimientoModulo.setVisible((this.isVisibilidadCeldaGuardarTipoMovimientoModulo && this.isPermisoGuardarCambiosTipoMovimientoModulo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoMovimientoModulo() {
		if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoMovimientoModulo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoMovimientoModulo() {
	}
	
	public void jTableDatosTipoMovimientoModuloListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoMovimientoModulo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoMovimientoModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.gettipomovimientomodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimientomodulo==null) {
						this.tipomovimientomodulo = new TipoMovimientoModulo();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
				}

				if(this.tipomovimientomodulo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipomovimientomodulo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimientoModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_moduloTipoMovimientoModuloUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomodulo=true;

			idTienePermisomodulo=this.tienePermisosUsuarioEnPaginaWebTipoMovimientoModulo(ModuloConstantesFunciones.CLASSNAME);

			if(idTienePermisomodulo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoMovimientoModulo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoMovimientoModulo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.gettipomovimientomodulo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);

				this.moduloBeanSwingJInternalFrame=new ModuloBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.moduloBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.moduloBeanSwingJInternalFrame.getModuloLogic().setConnexion(this.tipomovimientomoduloLogic.getConnexion());

				if(this.tipomovimientomodulo.getid_modulo()!=null) {
					this.moduloBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.moduloBeanSwingJInternalFrame.setIdActual(this.tipomovimientomodulo.getid_modulo());
					this.moduloBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.moduloBeanSwingJInternalFrame.inicializarActualizarBindingTablaModulo();
				}

				JInternalFrameBase jinternalFrame =this.moduloBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoMovimientoModulo=(TitledBorder)this.jScrollPanelDatosTipoMovimientoModulo.getBorder();
				TitledBorder titledBordermodulo=(TitledBorder)this.moduloBeanSwingJInternalFrame.jScrollPanelDatosModulo.getBorder();

				titledBordermodulo.setTitle(titledBorderTipoMovimientoModulo.getTitle() + " -> Modulo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_moduloTipoMovimientoModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.gettipomovimientomodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimientomodulo==null) {
						this.tipomovimientomodulo = new TipoMovimientoModulo();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
				}

				if(this.tipomovimientomodulo.getid_modulo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_modulo = "+this.tipomovimientomodulo.getid_modulo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimientoModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoMovimientoModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.gettipomovimientomodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimientomodulo==null) {
						this.tipomovimientomodulo = new TipoMovimientoModulo();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
				}

				if(this.tipomovimientomodulo.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipomovimientomodulo.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimientoModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoMovimientoModuloBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.gettipomovimientomodulo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipomovimientomodulo==null) {
						this.tipomovimientomodulo = new TipoMovimientoModulo();
					}

					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);
				}

				if(this.tipomovimientomodulo.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipomovimientomodulo.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoMovimientoModulo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorCodigoTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMovimientoModulo(false,false);

			this.getTipoMovimientoModulosBusquedaPorCodigo();

			this.inicializarActualizarBindingTipoMovimientoModulo(false);

			//if(TipoMovimientoModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMovimientoModulo(false,false);

			this.getTipoMovimientoModulosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoMovimientoModulo(false);

			//if(TipoMovimientoModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdModuloTipoMovimientoModuloActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoMovimientoModulo(false,false);

			this.getTipoMovimientoModulosFK_IdModulo();

			this.inicializarActualizarBindingTipoMovimientoModulo(false);

			//if(TipoMovimientoModuloBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipomovimientomoduloLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoMovimientoModulo() {
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
		

		if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoMovimientoModulo.dispose();
			this.jInternalFrameDetalleFormTipoMovimientoModulo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo!=null) {
			this.jInternalFrameReporteDinamicoTipoMovimientoModulo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoMovimientoModulo.dispose();
			this.jInternalFrameReporteDinamicoTipoMovimientoModulo=null;
		}
		
		if(this.jInternalFrameImportacionTipoMovimientoModulo!=null) {
			this.jInternalFrameImportacionTipoMovimientoModulo.setVisible(false);	    			
			this.jInternalFrameImportacionTipoMovimientoModulo.dispose();
			this.jInternalFrameImportacionTipoMovimientoModulo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoMovimientoModulo();
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoMovimientoModulo")) {
				jButtonNuevoTipoMovimientoModuloActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoMovimientoModulo")) {
				jButtonDuplicarTipoMovimientoModuloActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoMovimientoModulo")) {
				jButtonCopiarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoMovimientoModulo")) {
				jButtonVerFormTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoMovimientoModulo")) {
				jButtonNuevoTipoMovimientoModuloActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoMovimientoModulo")) {
				jButtonDuplicarTipoMovimientoModuloActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoMovimientoModulo")) {
				jButtonNuevoTipoMovimientoModuloActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoMovimientoModulo")) {
				jButtonDuplicarTipoMovimientoModuloActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoMovimientoModulo")) {
				jButtonNuevoTipoMovimientoModuloActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoMovimientoModulo")) {
				jButtonNuevoTipoMovimientoModuloActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoMovimientoModulo")) {
				jButtonNuevoTipoMovimientoModuloActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoMovimientoModulo")) {
				jButtonModificarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoMovimientoModulo")) {
				jButtonModificarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoMovimientoModulo")) {
				jButtonModificarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoMovimientoModulo")) {
				jButtonActualizarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoMovimientoModulo")) {
				jButtonActualizarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoMovimientoModulo")) {
				jButtonActualizarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoMovimientoModulo")) {
				jButtonEliminarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoMovimientoModulo")) {
				jButtonEliminarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoMovimientoModulo")) {
				jButtonEliminarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoMovimientoModulo")) {
				jButtonCancelarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoMovimientoModulo")) {
				jButtonCancelarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoMovimientoModulo")) {
				jButtonCancelarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoMovimientoModulo")) {
				jButtonCerrarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoMovimientoModulo")) {
				jButtonCerrarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoMovimientoModulo")) {
				jButtonCerrarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoMovimientoModulo")) {
				jButtonMostrarOcultarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoMovimientoModulo")) {
				jButtonCancelarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoMovimientoModulo")) {
				jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoMovimientoModulo")) {
				jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoMovimientoModulo")) {
				jButtonCopiarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoMovimientoModulo")) {
				jButtonVerFormTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoMovimientoModulo")) {
				jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoMovimientoModulo")) {
				jButtonCopiarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoMovimientoModulo")) {
				jButtonVerFormTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoMovimientoModulo")) {
				jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoMovimientoModulo")) {
				jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoMovimientoModulo")) {
				jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoMovimientoModulo")) {
				jButtonRecargarInformacionTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoMovimientoModulo")) {
				jButtonRecargarInformacionTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoMovimientoModulo")) {
				jButtonRecargarInformacionTipoMovimientoModuloActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoMovimientoModulo")) {
				jButtonAnterioresTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoMovimientoModulo")) {
				jButtonAnterioresTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoMovimientoModulo")) {
				jButtonAnterioresTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoMovimientoModulo")) {
				jButtonSiguientesTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoMovimientoModulo")) {
				jButtonSiguientesTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoMovimientoModulo")) {
				jButtonSiguientesTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoMovimientoModulo") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoMovimientoModulo")) {
				jButtonAbrirOrderByTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoMovimientoModulo") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoMovimientoModulo")) {
				jButtonMostrarOcultarTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMovimientoModulo")) {
				jButtonNuevoGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoMovimientoModulo")) {
				jButtonNuevoGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoMovimientoModulo")) {
				jButtonNuevoGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoMovimientoModulo")) {
				jButtonCerrarReporteDinamicoTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoMovimientoModulo")) {
				jButtonGenerarReporteDinamicoTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoMovimientoModulo")) {
				
				jButtonGenerarExcelReporteDinamicoTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoMovimientoModulo")) {
				jButtonCerrarImportacionTipoMovimientoModuloActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoMovimientoModulo")) {
				
				jButtonGenerarImportacionTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoMovimientoModulo")) {
				
				jButtonAbrirImportacionTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoMovimientoModulo")) {
				jComboBoxTiposAccionesTipoMovimientoModuloActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoMovimientoModulo")) {
				jComboBoxTiposRelacionesTipoMovimientoModuloActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoMovimientoModulo")) {
				jComboBoxTiposAccionesTipoMovimientoModuloActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoMovimientoModulo")) {
				
				jComboBoxTiposSeleccionarTipoMovimientoModuloActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoMovimientoModulo")) {
				jTextFieldValorCampoGeneralTipoMovimientoModuloActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoMovimientoModulo")) {
				jButtonAbrirOrderByTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoMovimientoModulo")) {
				jButtonAbrirOrderByTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoMovimientoModulo")) {
				jButtonCerrarOrderByTipoMovimientoModuloActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMovimientoModuloBusqueda")) {
				this.jButtonidTipoMovimientoModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoMovimientoModuloUpdate")) {
				this.jButtonid_moduloTipoMovimientoModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoMovimientoModuloBusqueda")) {
				this.jButtonid_moduloTipoMovimientoModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMovimientoModuloBusqueda")) {
				this.jButtoncodigoTipoMovimientoModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMovimientoModuloBusqueda")) {
				this.jButtonnombreTipoMovimientoModuloBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorCodigoTipoMovimientoModulo")) {
				this.jButtonBusquedaPorCodigoTipoMovimientoModuloActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoMovimientoModulo")) {
				this.jButtonBusquedaPorNombreTipoMovimientoModuloActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdModuloTipoMovimientoModulo")) {
				this.jButtonFK_IdModuloTipoMovimientoModuloActionPerformed(evt);
			}
			
			;
			
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoMovimientoModulo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				


				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoMovimientoModulo tipomovimientomoduloLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipomovimientomoduloLocal=this.tipomovimientomodulo;
			} else {
				tipomovimientomoduloLocal=this.tipomovimientomoduloAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
							
				
				


				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
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
			
			


			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoModuloActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
								
						
				


				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
								
				
				


				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoModuloActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
							
				
				


				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
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
			
			


			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
								
				
				


				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoModuloActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoModuloActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoMovimientoModulo")) {
					jCheckBoxSeleccionarTodosTipoMovimientoModuloItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoMovimientoModulo")) {
					jCheckBoxSeleccionadosTipoMovimientoModuloItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoMovimientoModulo")) {
					
				}
				
				


				
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
												
				
				


				
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoModuloActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
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
			
			


			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipomovimientomodulo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipomovimientomodulo);
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
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
				
				


				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoMovimientoModulo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoMovimientoModulo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoMovimientoModuloActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipomovimientomoduloAnterior =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoMovimientoModulo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoMovimientoModuloListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoMovimientoModulo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipomovimientomodulo =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipomovimientomodulo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoMovimientoModulo")) {
				
				}
				
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoMovimientoModulo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoMovimientoModulo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoMovimientoModulo")) {
			
			}
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoMovimientoModulo();
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
			if(sTipo.equals("NuevoTipoMovimientoModulo")) {
				jButtonNuevoTipoMovimientoModuloActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoMovimientoModulo")) {
				jButtonDuplicarTipoMovimientoModuloActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoMovimientoModulo")) {
				jButtonCopiarTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoMovimientoModulo")) {
				jButtonVerFormTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoMovimientoModulo")) {
				jButtonNuevoTipoMovimientoModuloActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoMovimientoModulo")) {
				jButtonModificarTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoMovimientoModulo")) {
				jButtonActualizarTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoMovimientoModulo")) {
				jButtonEliminarTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoMovimientoModulo")) {
				jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoMovimientoModulo")) {
				jButtonCancelarTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoMovimientoModulo")) {
				jButtonCerrarTipoMovimientoModuloActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoMovimientoModulo")) {
				jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoMovimientoModulo")) {
				jButtonNuevoGuardarCambiosTipoMovimientoModuloActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoMovimientoModulo")) {
				jButtonAbrirOrderByTipoMovimientoModuloActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoMovimientoModulo")) {
				jButtonRecargarInformacionTipoMovimientoModuloActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoMovimientoModulo")) {
				jButtonAnterioresTipoMovimientoModuloActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoMovimientoModulo")) {
				jButtonSiguientesTipoMovimientoModuloActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoMovimientoModuloBusqueda")) {
				this.jButtonidTipoMovimientoModuloBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_moduloTipoMovimientoModuloUpdate")) {
				this.jButtonid_moduloTipoMovimientoModuloUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_moduloTipoMovimientoModuloBusqueda")) {
				this.jButtonid_moduloTipoMovimientoModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoMovimientoModuloBusqueda")) {
				this.jButtoncodigoTipoMovimientoModuloBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoMovimientoModuloBusqueda")) {
				this.jButtonnombreTipoMovimientoModuloBusquedaActionPerformed(evt);
			}
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoMovimientoModulo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoMovimientoModulo")) {
				closingInternalFrameTipoMovimientoModulo();
				
			} else if(sTipo.equals("jButtonCancelarTipoMovimientoModulo")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoMovimientoModulo = (JInternalFrameBase)evt.getSource();
	            	
	            TipoMovimientoModuloBeanSwingJInternalFrame jInternalFrameParent=(TipoMovimientoModuloBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMovimientoModulo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoMovimientoModuloActionPerformed(null);
			}
			
			TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipomovimientomodulo,new Object(),this.tipomovimientomoduloParameterGeneral,this.tipomovimientomoduloReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoMovimientoModulo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoMovimientoModulo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoMovimientoModulo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipomovimientomodulo)) {
			if(!esControlTabla) {
				if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);			
				}
				
				if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomovimientomoduloReturnGeneral=tipomovimientomoduloLogic.procesarEventosTipoMovimientoModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimientomoduloLogic.getTipoMovimientoModulos(),this.tipomovimientomodulo,this.tipomovimientomoduloParameterGeneral,this.isEsNuevoTipoMovimientoModulo,classes);//this.tipomovimientomoduloLogic.getTipoMovimientoModulo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoMovimientoModulo(this.tipomovimientomoduloReturnGeneral,this.tipomovimientomoduloBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoMovimientoModulo(classes,this.tipomovimientomoduloReturnGeneral,this.tipomovimientomoduloBean,false);
					}
						
					if(this.tipomovimientomoduloReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoMovimientoModulo(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoMovimientoModulo(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo());	
					}
						
					if(this.tipomovimientomoduloReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoMovimientoModulo(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo(),classes);//this.tipomovimientomoduloBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoMovimientoModulo(this.tipomovimientomodulo,classes);//this.tipomovimientomoduloBean);									
				}
			
				if(TipoMovimientoModuloJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoMovimientoModulo(this.tipomovimientomodulo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoMovimientoModulo(this.tipomovimientomodulo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipomovimientomoduloAnterior!=null) {
						this.tipomovimientomodulo=this.tipomovimientomoduloAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipomovimientomoduloReturnGeneral=tipomovimientomoduloLogic.procesarEventosTipoMovimientoModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimientomoduloLogic.getTipoMovimientoModulos(),this.tipomovimientomodulo,this.tipomovimientomoduloParameterGeneral,this.isEsNuevoTipoMovimientoModulo,classes);//this.tipomovimientomoduloLogic.getTipoMovimientoModulo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipomovimientomoduloSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo(),tipomovimientomoduloLogic.getTipoMovimientoModulos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo(),this.tipomovimientomodulos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoMovimientoModulo.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoMovimientoModulo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoMovimientoModulo();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoMovimientoModulo() throws Exception {
		
		TipoMovimientoModuloModel tipomovimientomoduloModel=(TipoMovimientoModuloModel)this.jTableDatosTipoMovimientoModulo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipomovimientomoduloModel.tipomovimientomodulos=this.tipomovimientomoduloLogic.getTipoMovimientoModulos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipomovimientomoduloModel.tipomovimientomodulos=this.tipomovimientomodulos;
		}
		
		
		((TipoMovimientoModuloModel) this.jTableDatosTipoMovimientoModulo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoMovimientoModulo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipomovimientomoduloAnterior(),this.tipomovimientomoduloLogic.getTipoMovimientoModulos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipomovimientomoduloAnterior(),this.tipomovimientomodulos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoMovimientoModulo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCompra.class)) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(tipomovimientomodulo.getParametroCompras());
					this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCompra(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaProveedorServicio.class)) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(tipomovimientomodulo.getFacturaProveedorServicios());
					this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaProveedorServicio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Secuencial.class)) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.setSecuencials(tipomovimientomodulo.getSecuencials());
					this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.inicializarActualizarBindingTablaSecuencial(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoDocumento.class)) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.setTipoDocumentos(tipomovimientomodulo.getTipoDocumentos());
					this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
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
										
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimientomodulo,new Object(),generalEntityParameterGeneral,this.tipomovimientomoduloReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoMovimientoModuloConstantesFunciones.getClassesRelationshipsOfTipoMovimientoModulo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoMovimientoModuloConstantesFunciones.getClassesRelationshipsFromStringsOfTipoMovimientoModulo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoMovimientoModulo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoMovimientoModuloBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipomovimientomodulo,new Object(),generalEntityParameterGeneral,this.tipomovimientomoduloReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoMovimientoModulo(TipoMovimientoModuloBean tipomovimientomoduloBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCompra.class)) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.setParametroCompras(tipomovimientomodulo.getParametroCompras());
					this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCompra(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaProveedorServicio.class)) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.setFacturaProveedorServicios(tipomovimientomodulo.getFacturaProveedorServicios());
					this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaFacturaProveedorServicio(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Secuencial.class)) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.setSecuencials(tipomovimientomodulo.getSecuencials());
					this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.inicializarActualizarBindingTablaSecuencial(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoDocumento.class)) {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.setTipoDocumentos(tipomovimientomodulo.getTipoDocumentos());
					this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoDocumento(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoMovimientoModulo(ArrayList<Classe> classes,TipoMovimientoModuloReturnGeneral tipomovimientomoduloReturnGeneral,TipoMovimientoModuloBean tipomovimientomoduloBean,Boolean conDefault) throws Exception {
		
			this.tipomovimientomoduloBean.setParametroCompras(tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo().getParametroCompras());
			this.tipomovimientomoduloBean.setFacturaProveedorServicios(tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo().getFacturaProveedorServicios());
			this.tipomovimientomoduloBean.setSecuencials(tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo().getSecuencials());
			this.tipomovimientomoduloBean.setTipoDocumentos(tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo().getTipoDocumentos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCompra.class)) {
					tipomovimientomodulo.setParametroCompras(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraBeanSwingJInternalFrame.parametrocompraLogic.getParametroCompras());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(FacturaProveedorServicio.class)) {
					tipomovimientomodulo.setFacturaProveedorServicios(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioBeanSwingJInternalFrame.facturaproveedorservicioLogic.getFacturaProveedorServicios());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Secuencial.class)) {
					tipomovimientomodulo.setSecuencials(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialBeanSwingJInternalFrame.secuencialLogic.getSecuencials());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoDocumento.class)) {
					tipomovimientomodulo.setTipoDocumentos(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoBeanSwingJInternalFrame.tipodocumentoLogic.getTipoDocumentos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipomovimientomodulo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo = new TipoMovimientoModuloDetalleFormJInternalFrame(jDesktopPane,this.tipomovimientomoduloSessionBean.getConGuardarRelaciones(),this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.setVisible(false);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.tipomovimientomoduloLogic=this.tipomovimientomoduloLogic;
		
		this.cargarCombosFrameForeignKeyTipoMovimientoModulo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoMovimientoModulo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoMovimientoModulo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoMovimientoModulo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoMovimientoModulo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMovimientoModulo"));
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonModificarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"ModificarTipoMovimientoModulo"));

		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonModificarToolBarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMovimientoModulo"));
					
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemModificarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMovimientoModulo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"ActualizarTipoMovimientoModulo"));
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarToolBarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMovimientoModulo"));
						
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemActualizarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMovimientoModulo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"EliminarTipoMovimientoModulo"));
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMovimientoModulo"));
								
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemEliminarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMovimientoModulo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"CancelarTipoMovimientoModulo"));
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMovimientoModulo"));
					
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemCancelarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMovimientoModulo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemDetalleCerrarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMovimientoModulo"));		
		
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMovimientoModulo"));
		
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMovimientoModulo"));
		
		
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMovimientoModulo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonidTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMovimientoModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonid_moduloTipoMovimientoModuloUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoMovimientoModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonid_moduloTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoMovimientoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtoncodigoTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMovimientoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonnombreTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMovimientoModuloBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMovimientoModulo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoMovimientoModulo"));
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoMovimientoModulo"));
		}
		
		this.jTableDatosTipoMovimientoModulo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoMovimientoModulo"));
		
		this.jTableDatosTipoMovimientoModulo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoMovimientoModulo"));
		
		this.jButtonNuevoTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"NuevoTipoMovimientoModulo"));
		
		this.jButtonDuplicarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"DuplicarTipoMovimientoModulo"));
		
		this.jButtonCopiarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"CopiarTipoMovimientoModulo"));
		
		this.jButtonVerFormTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"VerFormTipoMovimientoModulo"));
		
		
		this.jButtonNuevoToolBarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoMovimientoModulo"));
			
		this.jButtonDuplicarToolBarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoMovimientoModulo"));
			
		this.jMenuItemNuevoTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoMovimientoModulo"));
			
		this.jMenuItemDuplicarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoMovimientoModulo"));		
		
		
		this.jButtonNuevoRelacionesTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoMovimientoModulo"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoMovimientoModulo"));
			
		this.jMenuItemNuevoRelacionesTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoMovimientoModulo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonModificarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"ModificarTipoMovimientoModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonModificarToolBarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoMovimientoModulo"));
			
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemModificarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoMovimientoModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"ActualizarTipoMovimientoModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonActualizarToolBarTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoMovimientoModulo"));
				
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemActualizarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoMovimientoModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"EliminarTipoMovimientoModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonEliminarToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoMovimientoModulo"));
						
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemEliminarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoMovimientoModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"CancelarTipoMovimientoModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonCancelarToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoMovimientoModulo"));
			
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemCancelarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoMovimientoModulo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoMovimientoModulo"));		
		
		
		this.jButtonCerrarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"CerrarTipoMovimientoModulo"));
		
		
		this.jButtonCerrarToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoMovimientoModulo"));
			
		this.jMenuItemCerrarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoMovimientoModulo"));
			
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jMenuItemDetalleCerrarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoMovimientoModulo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoMovimientoModulo"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoMovimientoModulo"));
		}
		
		this.jButtonCopiarToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoMovimientoModulo"));
			
		this.jButtonVerFormToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoMovimientoModulo"));
		
		this.jMenuItemGuardarCambiosTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoMovimientoModulo"));
			
		this.jMenuItemCopiarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoMovimientoModulo"));		
		
		this.jMenuItemVerFormTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoMovimientoModulo"));		
		
		
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMovimientoModulo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoMovimientoModulo"));
			
		this.jMenuItemGuardarCambiosTablaTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoMovimientoModulo"));		
		
		
		
		this.jButtonRecargarInformacionTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoMovimientoModulo"));
					
		this.jButtonRecargarInformacionToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoMovimientoModulo"));
		
		this.jMenuItemRecargarInformacionTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoMovimientoModulo"));		
		
		
		
		this.jButtonAnterioresTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"AnterioresTipoMovimientoModulo"));
		
		
		this.jButtonAnterioresToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoMovimientoModulo"));
		
		this.jMenuItemAnterioresTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoMovimientoModulo"));		
		
		
		this.jButtonSiguientesTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"SiguientesTipoMovimientoModulo"));
		
		
		this.jButtonSiguientesToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoMovimientoModulo"));
			
		this.jMenuItemSiguientesTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoMovimientoModulo"));
			
		this.jMenuItemAbrirOrderByTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoMovimientoModulo"));
			
		this.jMenuItemMostrarOcultarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoMovimientoModulo"));
			
		this.jMenuItemDetalleAbrirOrderByTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoMovimientoModulo"));
			
		this.jMenuItemDetalleMostarOcultarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoMovimientoModulo"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoMovimientoModulo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoMovimientoModulo"));
			
		this.jMenuItemNuevoGuardarCambiosTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoMovimientoModulo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoMovimientoModulo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoMovimientoModulo"));

		this.jCheckBoxSeleccionadosTipoMovimientoModulo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoMovimientoModulo"));
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoMovimientoModulo"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoMovimientoModulo"));
			
		this.jComboBoxTiposAccionesTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoMovimientoModulo"));
					
		this.jComboBoxTiposSeleccionarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoMovimientoModulo"));
			
		this.jTextFieldValorCampoGeneralTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoMovimientoModulo"));		
		
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonidTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMovimientoModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonid_moduloTipoMovimientoModuloUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoMovimientoModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonid_moduloTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoMovimientoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtoncodigoTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMovimientoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonnombreTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMovimientoModuloBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorCodigoTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoMovimientoModulo"));

			this.jButtonBusquedaPorNombreTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoMovimientoModulo"));

			this.jButtonFK_IdModuloTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"FK_IdModuloTipoMovimientoModulo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoMovimientoModulo!=null) {
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMovimientoModulo"));
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMovimientoModulo"));
				this.jInternalFrameReporteDinamicoTipoMovimientoModulo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMovimientoModulo"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoMovimientoModulo"));				
			//this.jButtonGenerarReporteDinamicoTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoMovimientoModulo"));
			//this.jButtonGenerarExcelReporteDinamicoTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoMovimientoModulo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoMovimientoModulo!=null) {
				this.jInternalFrameImportacionTipoMovimientoModulo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoMovimientoModulo"));
				this.jInternalFrameImportacionTipoMovimientoModulo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoMovimientoModulo"));
				this.jInternalFrameImportacionTipoMovimientoModulo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoMovimientoModulo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoMovimientoModulo"));
			
			this.jButtonAbrirOrderByToolBarTipoMovimientoModulo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoMovimientoModulo"));			
			
			if(this.jInternalFrameOrderByTipoMovimientoModulo!=null) {
				this.jInternalFrameOrderByTipoMovimientoModulo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoMovimientoModulo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoMovimientoModulo.jTabbedPaneRelacionesTipoMovimientoModulo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoMovimientoModulo"));
		
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
            		closingInternalFrameTipoMovimientoModulo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoMovimientoModulo = (JInternalFrameBase)event.getSource();
	            	
	            TipoMovimientoModuloBeanSwingJInternalFrame jInternalFrameParent=(TipoMovimientoModuloBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoMovimientoModulo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoMovimientoModuloActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoMovimientoModulo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoMovimientoModuloListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoMovimientoModulo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoMovimientoModulo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoModuloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoModuloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoModuloActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoMovimientoModulo";
		inputMap = this.jButtonNuevoTipoMovimientoModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoMovimientoModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMovimientoModuloActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoModuloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoModuloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoMovimientoModuloActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoMovimientoModulo";
		inputMap = this.jButtonNuevoRelacionesTipoMovimientoModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoMovimientoModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoMovimientoModuloActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoMovimientoModulo";
		inputMap = this.jButtonModificarTipoMovimientoModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoMovimientoModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoMovimientoModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoMovimientoModulo";
		inputMap = this.jButtonActualizarTipoMovimientoModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoMovimientoModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoMovimientoModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoMovimientoModulo";
		inputMap = this.jButtonEliminarTipoMovimientoModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoMovimientoModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoMovimientoModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoMovimientoModulo";
		inputMap = this.jButtonCancelarTipoMovimientoModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoMovimientoModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoMovimientoModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoMovimientoModulo";
		inputMap = this.jButtonCerrarTipoMovimientoModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoMovimientoModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoMovimientoModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoMovimientoModulo";
		inputMap = this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosTipoMovimientoModulo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonGuardarCambiosTipoMovimientoModulo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoMovimientoModuloActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoMovimientoModulo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoMovimientoModuloItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoMovimientoModulo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoMovimientoModuloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoMovimientoModulo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoMovimientoModuloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoMovimientoModulo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoMovimientoModuloActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonidTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"idTipoMovimientoModuloBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonid_moduloTipoMovimientoModuloUpdate.addActionListener(new ButtonActionListener(this,"id_moduloTipoMovimientoModuloUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonid_moduloTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"id_moduloTipoMovimientoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtoncodigoTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoMovimientoModuloBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jButtonnombreTipoMovimientoModuloBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoMovimientoModuloBusqueda"));
		
		
		this.jButtonBusquedaPorCodigoTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorCodigoTipoMovimientoModulo"));

		this.jButtonBusquedaPorNombreTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoMovimientoModulo"));

		this.jButtonFK_IdModuloTipoMovimientoModulo.addActionListener(new ButtonActionListener(this,"FK_IdModuloTipoMovimientoModulo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoMovimientoModulo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoMovimientoModuloActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoMovimientoModuloActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoMovimientoModulo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoMovimientoModulo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
					tipomovimientomoduloAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulos) {
					tipomovimientomoduloAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoMovimientoModuloItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
						tipomovimientomoduloAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulos) {
						tipomovimientomoduloAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMovimientoModulo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMovimientoModulo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoModulo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoMovimientoModuloItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoMovimientoModulo.getSelectedRows();
			
			TipoMovimientoModulo tipomovimientomoduloLocal=new TipoMovimientoModulo();
			
			//this.seleccionarTodosTipoMovimientoModulo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipomovimientomoduloLocal =(TipoMovimientoModulo) this.tipomovimientomoduloLogic.getTipoMovimientoModulos().toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipomovimientomoduloLocal =(TipoMovimientoModulo) this.tipomovimientomodulos.toArray()[this.jTableDatosTipoMovimientoModulo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipomovimientomoduloLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
						tipomovimientomoduloAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulos) {
						tipomovimientomoduloAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoMovimientoModulo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoMovimientoModulo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoMovimientoModulo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoMovimientoModuloItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoMovimientoModuloParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoMovimientoModuloActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoMovimientoModulo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
				
						if(sTipoSeleccionar.equals(TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomovimientomoduloAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomovimientomoduloAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulos) {
					
						if(sTipoSeleccionar.equals(TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipomovimientomoduloAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipomovimientomoduloAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoMovimientoModuloActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoMovimientoModulo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoMovimientoModulo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoMovimientoModulo) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoMovimientoModulo(conSplash);
				
					this.generarReporteTipoMovimientoModulosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoMovimientoModulosSeleccionados();
				//this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMovimientoModulosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoMovimientoModulosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMovimientoModulo();
				
				this.exportarTipoMovimientoModulosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoMovimientoModulos();
				//this.importarTipoMovimientoModulos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoMovimientoModulo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoMovimientoModulosSeleccionados();
				//this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Movimiento Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoMovimientoModulo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoMovimientoModulo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoMovimientoModulo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoMovimientoModuloBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoMovimientoModulo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoMovimientoModulo(conSplash);
					
						//this.actualizarParametrosGeneralTipoMovimientoModulo();
						
						this.generarReporteProcesoAccionTipoMovimientoModulosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoMovimientoModuloBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Movimiento ModuloS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Movimiento Modulo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoMovimientoModulo();
				
						this.actualizarParametrosGeneralTipoMovimientoModulo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipomovimientomoduloReturnGeneral=tipomovimientomoduloLogic.procesarAccionTipoMovimientoModulosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipomovimientomoduloLogic.getTipoMovimientoModulos(),this.tipomovimientomoduloParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoMovimientoModuloReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoMovimientoModulo();
					
					TipoMovimientoModuloBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoMovimientoModuloReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoMovimientoModulo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxTiposAccionesFormularioTipoMovimientoModulo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoMovimientoModulo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoMovimientoModuloActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoMovimientoModulo();
			
			if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();		
			TipoMovimientoModulo tipomovimientomodulo=new TipoMovimientoModulo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoMovimientoModulo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoMovimientoModulo.getSelectedItem();
			
			
			
			
			tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipomovimientomodulosSeleccionados.size()==1) {
				for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosSeleccionados) {
					tipomovimientomodulo=tipomovimientomoduloAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Parametro Compra")) {
					jButtonParametroCompraActionPerformed(null,rowIndex,true,false,tipomovimientomodulo);
				}
				else if(this.sTipoRelacion.equals("Factura Proveedor")) {
					jButtonFacturaProveedorServicioActionPerformed(null,rowIndex,true,false,tipomovimientomodulo);
				}
				else if(this.sTipoRelacion.equals("Secuencial")) {
					jButtonSecuencialActionPerformed(null,rowIndex,true,false,tipomovimientomodulo);
				}
				else if(this.sTipoRelacion.equals("Tipo Documento")) {
					jButtonTipoDocumentoActionPerformed(null,rowIndex,true,false,tipomovimientomodulo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoMovimientoModulo();
			
      		//this.finishProcessTipoMovimientoModulo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoMovimientoModuloReturnGeneral() throws Exception {
		if(this.tipomovimientomoduloReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipomovimientomoduloReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipomovimientomoduloReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipomovimientomoduloReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipomovimientomoduloReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipomovimientomoduloReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoMovimientoModulo(false);
		}
		
		if(this.tipomovimientomoduloReturnGeneral.getConRetornoLista() || this.tipomovimientomoduloReturnGeneral.getConRetornoObjeto()) {
			if(this.tipomovimientomoduloReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomovimientomoduloLogic.setTipoMovimientoModulos(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipomovimientomoduloReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipomovimientomoduloLogic.setTipoMovimientoModulo(this.tipomovimientomoduloReturnGeneral.getTipoMovimientoModulo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoMovimientoModulo(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoMovimientoModulo() throws Exception {
		
		
	}
	
	public ArrayList<TipoMovimientoModulo> getTipoMovimientoModulosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoMovimientoModulo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomoduloLogic.getTipoMovimientoModulos()) {
					if(tipomovimientomoduloAux.getIsSelected()) {
						tipomovimientomodulosSeleccionados.add(tipomovimientomoduloAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoMovimientoModulo tipomovimientomoduloAux:this.tipomovimientomodulos) {
					if(tipomovimientomoduloAux.getIsSelected()) {
						tipomovimientomodulosSeleccionados.add(tipomovimientomoduloAux);				
					}
				}
			}
			
			if(tipomovimientomodulosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipomovimientomodulosSeleccionados.addAll(this.tipomovimientomoduloLogic.getTipoMovimientoModulos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipomovimientomodulosSeleccionados.addAll(this.tipomovimientomodulos);				
					}
				}
			}
		} else {
			tipomovimientomodulosSeleccionados.add(this.tipomovimientomodulo);
		}
		
		return tipomovimientomodulosSeleccionados;
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
	
	public void generarReporteTipoMovimientoModulosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoMovimientoModulosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoMovimientoModulosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMovimientoModulosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoMovimientoModulosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoMovimientoModulosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Movimiento Modulo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoMovimientoModulosSeleccionados() throws Exception {
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();		
		
		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoMovimientoModulos("Todos",tipomovimientomodulosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoMovimientoModulosSeleccionados() throws Exception {
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();		
		
		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoMovimientoModulos("Todos",tipomovimientomodulosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoMovimientoModulosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();
		
		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoMovimientoModulos("Todos",tipomovimientomodulosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoMovimientoModulosSeleccionados() throws Exception {
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoMovimientoModulo();
		
		
		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoMovimientoModulo();
		
		
		//this.generarReporteTipoMovimientoModulos("Todos",tipomovimientomodulosSeleccionados ,tipomovimientomoduloImplementable,tipomovimientomoduloImplementableHome);
	}
	
	public void mostrarImportacionTipoMovimientoModulos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoMovimientoModulo();
		
		this.abrirFrameImportacionTipoMovimientoModulo();		
		
			
		//this.generarReporteTipoMovimientoModulos("Todos",tipomovimientomodulosSeleccionados ,tipomovimientomoduloImplementable,tipomovimientomoduloImplementableHome);
	}
	
	public void importarTipoMovimientoModulos() throws Exception {		
	
	}
	
	public void exportarTipoMovimientoModulosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoMovimientoModulosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoMovimientoModulosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoMovimientoModulosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Movimiento Modulo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoMovimientoModulosSeleccionados() throws Exception {
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();		
		
		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimientomodulo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoMovimientoModulo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoMovimientoModulo(tipomovimientomoduloAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipomovimientomoduloAux.setsDetalleGeneralEntityReporte(tipomovimientomoduloAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoMovimientoModulo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoMovimientoModuloConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimientoModuloConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipomovimientomodulo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimientomodulo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimientomodulo.getmodulo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimientomodulo.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipomovimientomodulo.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoMovimientoModulosSeleccionados() throws Exception {
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();		
		
		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimientomodulo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoMovimientoModulos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoMovimientoModulo(row);				
				iRow++;
			}				
			
			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoMovimientoModulo(tipomovimientomoduloAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoMovimientoModulosSeleccionados() throws Exception {
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();		
		
		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipomovimientomodulo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipomovimientomodulos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipomovimientomodulo");
			//elementRoot.appendChild(element);
		
			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosSeleccionados) {
				element = document.createElement("tipomovimientomodulo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoMovimientoModulo(tipomovimientomoduloAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Movimiento Modulo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoMovimientoModulo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimientomodulo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimientomodulo.getmodulo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimientomodulo.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipomovimientomodulo.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoMovimientoModulo(TipoMovimientoModulo tipomovimientomodulo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoMovimientoModuloConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipomovimientomodulo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoMovimientoModuloConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipomovimientomodulo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementmodulo_descripcion = document.createElement(TipoMovimientoModuloConstantesFunciones.IDMODULO);
		elementmodulo_descripcion.appendChild(document.createTextNode(tipomovimientomodulo.getmodulo_descripcion()));
		element.appendChild(elementmodulo_descripcion);

		Element elementcodigo = document.createElement(TipoMovimientoModuloConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipomovimientomodulo.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoMovimientoModuloConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipomovimientomodulo.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoMovimientoModulosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados=new ArrayList<TipoMovimientoModulo>();
		
		tipomovimientomodulosSeleccionados=this.getTipoMovimientoModulosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoMovimientoModulo(tipomovimientomodulosSeleccionados);
		
		this.generarReporteTipoMovimientoModulos("Todos",tipomovimientomodulosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoMovimientoModulo(ArrayList<TipoMovimientoModulo> tipomovimientomodulosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoMovimientoModulo tipomovimientomoduloAux:tipomovimientomodulosSeleccionados) {
				tipomovimientomoduloAux.setsDetalleGeneralEntityReporte(tipomovimientomoduloAux.toString());
			
				if(sTipoSeleccionar.equals(TipoMovimientoModuloConstantesFunciones.LABEL_IDMODULO)) {
					existe=true;
					tipomovimientomoduloAux.setsDescripcionGeneralEntityReporte1(tipomovimientomoduloAux.getmodulo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoMovimientoModuloConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipomovimientomoduloAux.setsDescripcionGeneralEntityReporte1(tipomovimientomoduloAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoMovimientoModuloConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipomovimientomoduloAux.setsDescripcionGeneralEntityReporte1(tipomovimientomoduloAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoMovimientoModuloConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoMovimientoModulo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoMovimientoModulo=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=true;
				this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=true;
			}
			
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=false;
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=true;
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=false;
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=true;
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=true;
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=false;
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=true;
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=true;
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=false;
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=false;
			this.isVisibilidadCeldaModificarTipoMovimientoModulo=true;
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaCancelarTipoMovimientoModulo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoMovimientoModulo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoMovimientoModuloJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=true;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=true;
		} else {
			this.actualizarEstadoPanelsTipoMovimientoModulo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoMovimientoModulo=false;
			//this.isVisibilidadCeldaVerFormTipoMovimientoModulo=false;
			this.isVisibilidadCeldaDuplicarTipoMovimientoModulo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoMovimientoModulo=false;
			this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			if(!tipomovimientomoduloSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;												
			}
			
			this.jButtonCerrarTipoMovimientoModulo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoMovimientoModulo=false;
		}
		
		if(!this.permiteMantenimiento(this.tipomovimientomodulo)) {
			this.isVisibilidadCeldaActualizarTipoMovimientoModulo=false;
			this.isVisibilidadCeldaEliminarTipoMovimientoModulo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoMovimientoModulo() {
		this.isVisibilidadCeldaNuevoTipoMovimientoModulo=false;
		this.isVisibilidadCeldaGuardarCambiosTipoMovimientoModulo=false;
	}
	
	public void actualizarEstadoPanelsTipoMovimientoModulo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosEdicionTipoMovimientoModulo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimientoModulo!=null) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosTipoMovimientoModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimientoModulo!=null) {
				this.jPanelPaginacionTipoMovimientoModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimientoModulo!=null) {
				this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosEdicionTipoMovimientoModulo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimientoModulo!=null) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosTipoMovimientoModulo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMovimientoModulo!=null) {
				this.jPanelPaginacionTipoMovimientoModulo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMovimientoModulo!=null) {
				this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosEdicionTipoMovimientoModulo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimientoModulo!=null) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosTipoMovimientoModulo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMovimientoModulo!=null) {
				this.jPanelPaginacionTipoMovimientoModulo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMovimientoModulo!=null) {
				this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosEdicionTipoMovimientoModulo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimientoModulo!=null) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosTipoMovimientoModulo.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoMovimientoModulo!=null) {
				this.jPanelPaginacionTipoMovimientoModulo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoMovimientoModulo!=null) {
				this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosEdicionTipoMovimientoModulo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimientoModulo!=null) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosTipoMovimientoModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimientoModulo!=null) {
				this.jPanelPaginacionTipoMovimientoModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimientoModulo!=null) {
				this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosEdicionTipoMovimientoModulo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimientoModulo!=null) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosTipoMovimientoModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimientoModulo!=null) {
				this.jPanelPaginacionTipoMovimientoModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimientoModulo!=null) {
				this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosEdicionTipoMovimientoModulo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimientoModulo!=null) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoMovimientoModulo!=null) {
				this.jScrollPanelDatosTipoMovimientoModulo.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoMovimientoModulo!=null) {
				this.jPanelPaginacionTipoMovimientoModulo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoMovimientoModulo!=null) {
				this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoMovimientoModulo!=null) {
					this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoMovimientoModulo!=null) {
				this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipomovimientomoduloSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoMovimientoModulo!=null) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoMovimientoModulo!=null) {
				this.jPanelParametrosReportesTipoMovimientoModulo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaModulo(Boolean isParaModulo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaModuloNegation=!isParaModulo;

			this.isVisibilidadBusquedaPorCodigo=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorCodigo) {this.jTabbedPaneBusquedasTipoMovimientoModulo.remove(jPanelBusquedaPorCodigoTipoMovimientoModulo);}

			this.isVisibilidadBusquedaPorNombre=isParaModuloNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasTipoMovimientoModulo.remove(jPanelBusquedaPorNombreTipoMovimientoModulo);}

			this.isVisibilidadFK_IdModulo=isParaModulo;
			if(!this.isVisibilidadFK_IdModulo) {this.jTabbedPaneBusquedasTipoMovimientoModulo.remove(jPanelFK_IdModuloTipoMovimientoModulo);}
		}
		
	}
	
	

	public String registrarSesionTipoMovimientoModuloParaParametroCompraes() throws Exception {
		Boolean isPaginaPopupParametroCompra=false;

		try {

			if(this.tipomovimientomoduloSessionBean==null) {
				this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraSessionBean==null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraSessionBean=new ParametroCompraSessionBean();
			}

			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraSessionBean.setsPathNavegacionActual(tipomovimientomoduloSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCompraConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCompra=this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCompra(true);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCompra(TipoMovimientoModuloConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraSessionBean.setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(true);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.parametrocompraSessionBean.setlidTipoMovimientoModuloActual(this.idTipoMovimientoModuloActual);

			tipomovimientomoduloSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoMovimientoModulo(true);
			tipomovimientomoduloSessionBean.setlIdTipoMovimientoModuloActualForeignKey(this.idTipoMovimientoModuloActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoMovimientoModuloParaFacturaProveedorServicios() throws Exception {
		Boolean isPaginaPopupFacturaProveedorServicio=false;

		try {

			if(this.tipomovimientomoduloSessionBean==null) {
				this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioSessionBean==null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioSessionBean=new FacturaProveedorServicioSessionBean();
			}

			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioSessionBean.setsPathNavegacionActual(tipomovimientomoduloSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaProveedorServicioConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFacturaProveedorServicio=this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFacturaProveedorServicio(true);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFacturaProveedorServicio(TipoMovimientoModuloConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioSessionBean.setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(true);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.facturaproveedorservicioSessionBean.setlidTipoMovimientoModuloActual(this.idTipoMovimientoModuloActual);

			tipomovimientomoduloSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoMovimientoModulo(true);
			tipomovimientomoduloSessionBean.setlIdTipoMovimientoModuloActualForeignKey(this.idTipoMovimientoModuloActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoMovimientoModuloParaSecuenciales() throws Exception {
		Boolean isPaginaPopupSecuencial=false;

		try {

			if(this.tipomovimientomoduloSessionBean==null) {
				this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialSessionBean==null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialSessionBean=new SecuencialSessionBean();
			}

			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialSessionBean.setsPathNavegacionActual(tipomovimientomoduloSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+SecuencialConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupSecuencial=this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeSecuencial(true);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeSecuencial(TipoMovimientoModuloConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialSessionBean.setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(true);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.secuencialSessionBean.setlidTipoMovimientoModuloActual(this.idTipoMovimientoModuloActual);

			tipomovimientomoduloSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoMovimientoModulo(true);
			tipomovimientomoduloSessionBean.setlIdTipoMovimientoModuloActualForeignKey(this.idTipoMovimientoModuloActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoMovimientoModuloParaTipoDocumentos() throws Exception {
		Boolean isPaginaPopupTipoDocumento=false;

		try {

			if(this.tipomovimientomoduloSessionBean==null) {
				this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoSessionBean=new TipoDocumentoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoSessionBean.setsPathNavegacionActual(tipomovimientomoduloSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TipoDocumentoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTipoDocumento=this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTipoDocumento(true);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoDocumento(TipoMovimientoModuloConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoSessionBean.setisBusquedaDesdeForeignKeySesionTipoMovimientoModulo(true);
			this.jInternalFrameDetalleFormTipoMovimientoModulo.tipodocumentoSessionBean.setlidTipoMovimientoModuloActual(this.idTipoMovimientoModuloActual);

			tipomovimientomoduloSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoMovimientoModulo(true);
			tipomovimientomoduloSessionBean.setlIdTipoMovimientoModuloActualForeignKey(this.idTipoMovimientoModuloActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
		
		if(this.tipomovimientomoduloSessionBean==null) {
			this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
		}
		
		this.tipomovimientomoduloSessionBean.setsUltimaBusquedaTipoMovimientoModulo(this.getsAccionBusqueda());
		this.tipomovimientomoduloSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipomovimientomoduloSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
			tipomovimientomoduloSessionBean.setcodigo(this.getcodigoBusquedaPorCodigo());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipomovimientomoduloSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
			tipomovimientomoduloSessionBean.setid_modulo(this.getid_moduloFK_IdModulo());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoMovimientoModuloSessionBean tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
		
		if(this.tipomovimientomoduloSessionBean==null) {
			this.tipomovimientomoduloSessionBean=new TipoMovimientoModuloSessionBean();
		}
		
		if(this.tipomovimientomoduloSessionBean.getsUltimaBusquedaTipoMovimientoModulo()!=null&&!this.tipomovimientomoduloSessionBean.getsUltimaBusquedaTipoMovimientoModulo().equals("")) {
			this.setsAccionBusqueda(tipomovimientomoduloSessionBean.getsUltimaBusquedaTipoMovimientoModulo());
			this.setiNumeroPaginacion(tipomovimientomoduloSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipomovimientomoduloSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorCodigo")) {
				this.setcodigoBusquedaPorCodigo(tipomovimientomoduloSessionBean.getcodigo());
				tipomovimientomoduloSessionBean.setcodigo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipomovimientomoduloSessionBean.getnombre());
				tipomovimientomoduloSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdModulo")) {
				this.setid_moduloFK_IdModulo(tipomovimientomoduloSessionBean.getid_modulo());
				tipomovimientomoduloSessionBean.setid_modulo(-1L);
			}
		}
		
		this.tipomovimientomoduloSessionBean.setsUltimaBusquedaTipoMovimientoModulo("");
		this.tipomovimientomoduloSessionBean.setiNumeroPaginacion(TipoMovimientoModuloConstantesFunciones.INUMEROPAGINACION);
		this.tipomovimientomoduloSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoMovimientoModulo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoMovimientoModulo() {
		this.updateBorderResaltarBusquedasFormularioTipoMovimientoModulo();
		this.updateVisibilidadBusquedasFormularioTipoMovimientoModulo();
		this.updateHabilitarBusquedasFormularioTipoMovimientoModulo();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoMovimientoModulo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponents().length>0) {
	

		if(this.tipomovimientomoduloConstantesFunciones.resaltarBusquedaPorCodigoTipoMovimientoModulo!=null) {
			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelBusquedaPorCodigoTipoMovimientoModulo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);
				jPanel.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltarBusquedaPorCodigoTipoMovimientoModulo);
			}
		}

		if(this.tipomovimientomoduloConstantesFunciones.resaltarBusquedaPorNombreTipoMovimientoModulo!=null) {
			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelBusquedaPorNombreTipoMovimientoModulo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);
				jPanel.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltarBusquedaPorNombreTipoMovimientoModulo);
			}
		}

		if(this.tipomovimientomoduloConstantesFunciones.resaltarFK_IdModuloTipoMovimientoModulo!=null) {
			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelFK_IdModuloTipoMovimientoModulo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);
				jPanel.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltarFK_IdModuloTipoMovimientoModulo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoMovimientoModulo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelBusquedaPorCodigoTipoMovimientoModulo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipomovimientomoduloConstantesFunciones.mostrarBusquedaPorCodigoTipoMovimientoModulo);
			if(!this.tipomovimientomoduloConstantesFunciones.mostrarBusquedaPorCodigoTipoMovimientoModulo && index>-1) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelBusquedaPorNombreTipoMovimientoModulo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipomovimientomoduloConstantesFunciones.mostrarBusquedaPorNombreTipoMovimientoModulo);
			if(!this.tipomovimientomoduloConstantesFunciones.mostrarBusquedaPorNombreTipoMovimientoModulo && index>-1) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelFK_IdModuloTipoMovimientoModulo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipomovimientomoduloConstantesFunciones.mostrarFK_IdModuloTipoMovimientoModulo);
			if(!this.tipomovimientomoduloConstantesFunciones.mostrarFK_IdModuloTipoMovimientoModulo && index>-1) {
				this.jTabbedPaneBusquedasTipoMovimientoModulo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoMovimientoModulo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelBusquedaPorCodigoTipoMovimientoModulo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarBusquedaPorCodigoTipoMovimientoModulo);
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setEnabledAt(index,this.tipomovimientomoduloConstantesFunciones.activarBusquedaPorCodigoTipoMovimientoModulo);
			}

			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelBusquedaPorNombreTipoMovimientoModulo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarBusquedaPorNombreTipoMovimientoModulo);
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setEnabledAt(index,this.tipomovimientomoduloConstantesFunciones.activarBusquedaPorNombreTipoMovimientoModulo);
			}

			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelFK_IdModuloTipoMovimientoModulo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarFK_IdModuloTipoMovimientoModulo);
				this.jTabbedPaneBusquedasTipoMovimientoModulo.setEnabledAt(index,this.tipomovimientomoduloConstantesFunciones.activarFK_IdModuloTipoMovimientoModulo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoMovimientoModulo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorCodigo")) {
			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelBusquedaPorCodigoTipoMovimientoModulo);

			this.jTabbedPaneBusquedasTipoMovimientoModulo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);

			this.tipomovimientomoduloConstantesFunciones.setResaltarBusquedaPorCodigoTipoMovimientoModulo(resaltar);

			jPanel.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltarBusquedaPorCodigoTipoMovimientoModulo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelBusquedaPorNombreTipoMovimientoModulo);

			this.jTabbedPaneBusquedasTipoMovimientoModulo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);

			this.tipomovimientomoduloConstantesFunciones.setResaltarBusquedaPorNombreTipoMovimientoModulo(resaltar);

			jPanel.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltarBusquedaPorNombreTipoMovimientoModulo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdModulo")) {
			index= this.jTabbedPaneBusquedasTipoMovimientoModulo.indexOfComponent(this.jPanelFK_IdModuloTipoMovimientoModulo);

			this.jTabbedPaneBusquedasTipoMovimientoModulo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoMovimientoModulo.getComponent(index);

			this.tipomovimientomoduloConstantesFunciones.setResaltarFK_IdModuloTipoMovimientoModulo(resaltar);

			jPanel.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltarFK_IdModuloTipoMovimientoModulo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoMovimientoModulo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoMovimientoModulo() throws Exception {

		if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoMovimientoModulo();
		this.updateVisibilidadResaltarControlesFormularioTipoMovimientoModulo();
		this.updateHabilitarResaltarControlesFormularioTipoMovimientoModulo();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoMovimientoModulo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipomovimientomoduloConstantesFunciones.resaltaridTipoMovimientoModulo!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltaridTipoMovimientoModulo);}
		if(this.tipomovimientomoduloConstantesFunciones.resaltarid_moduloTipoMovimientoModulo!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltarid_moduloTipoMovimientoModulo);}
		if(this.tipomovimientomoduloConstantesFunciones.resaltarcodigoTipoMovimientoModulo!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldcodigoTipoMovimientoModulo.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltarcodigoTipoMovimientoModulo);}
		if(this.tipomovimientomoduloConstantesFunciones.resaltarnombreTipoMovimientoModulo!=null && this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextAreanombreTipoMovimientoModulo.setBorder(this.tipomovimientomoduloConstantesFunciones.resaltarnombreTipoMovimientoModulo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoMovimientoModulo() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
	
		//this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.setVisible(this.tipomovimientomoduloConstantesFunciones.mostraridTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jPanelidTipoMovimientoModulo.setVisible(this.tipomovimientomoduloConstantesFunciones.mostraridTipoMovimientoModulo);
		//this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.setVisible(this.tipomovimientomoduloConstantesFunciones.mostrarid_moduloTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jPanelid_moduloTipoMovimientoModulo.setVisible(this.tipomovimientomoduloConstantesFunciones.mostrarid_moduloTipoMovimientoModulo);
		//this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldcodigoTipoMovimientoModulo.setVisible(this.tipomovimientomoduloConstantesFunciones.mostrarcodigoTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jPanelcodigoTipoMovimientoModulo.setVisible(this.tipomovimientomoduloConstantesFunciones.mostrarcodigoTipoMovimientoModulo);
		//this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextAreanombreTipoMovimientoModulo.setVisible(this.tipomovimientomoduloConstantesFunciones.mostrarnombreTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jPanelnombreTipoMovimientoModulo.setVisible(this.tipomovimientomoduloConstantesFunciones.mostrarnombreTipoMovimientoModulo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoMovimientoModulo() throws Exception {
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoMovimientoModulo!=null) {
	
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldidTipoMovimientoModulo.setEnabled(this.tipomovimientomoduloConstantesFunciones.activaridTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jComboBoxid_moduloTipoMovimientoModulo.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarid_moduloTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextFieldcodigoTipoMovimientoModulo.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarcodigoTipoMovimientoModulo);
		this.jInternalFrameDetalleFormTipoMovimientoModulo.jTextAreanombreTipoMovimientoModulo.setEnabled(this.tipomovimientomoduloConstantesFunciones.activarnombreTipoMovimientoModulo);
		}
	}
	
		
}