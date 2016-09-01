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

import com.bydan.erp.inventario.util.TipoListaPrecioConstantesFunciones;
import com.bydan.erp.inventario.util.TipoListaPrecioParameterReturnGeneral;
//import com.bydan.erp.inventario.util.TipoListaPrecioParameterGeneral;
//import com.bydan.erp.inventario.presentation.report.source.TipoListaPrecioBean;
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
import com.bydan.erp.cartera.business.logic.*;
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

import com.bydan.erp.inventario.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.business.entity.*;
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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
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
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
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
public class TipoListaPrecioBeanSwingJInternalFrame extends TipoListaPrecioJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoListaPrecioBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoListaPrecio> tipolistaprecioValidator = new ClassValidator<TipoListaPrecio>(TipoListaPrecio.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoListaPrecio tipolistaprecio;	
	public TipoListaPrecio tipolistaprecioAux;
	public TipoListaPrecio tipolistaprecioAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoListaPrecio tipolistaprecioTotales;
	public Long idTipoListaPrecioActual;
	public Long iIdNuevoTipoListaPrecio=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosCliente=false;

	public Boolean getIsTienePermisosCliente() {
		return isTienePermisosCliente;
	}

	public void setIsTienePermisosCliente(Boolean isTienePermisosCliente) {
		this.isTienePermisosCliente= isTienePermisosCliente;
	}


	public Boolean isTienePermisosParametroCarteraDefecto=false;

	public Boolean getIsTienePermisosParametroCarteraDefecto() {
		return isTienePermisosParametroCarteraDefecto;
	}

	public void setIsTienePermisosParametroCarteraDefecto(Boolean isTienePermisosParametroCarteraDefecto) {
		this.isTienePermisosParametroCarteraDefecto= isTienePermisosParametroCarteraDefecto;
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
	
	public Boolean isPermisoTodoTipoListaPrecio;
	public Boolean isPermisoNuevoTipoListaPrecio;
	public Boolean isPermisoActualizarTipoListaPrecio;
	public Boolean isPermisoActualizarOriginalTipoListaPrecio;
	public Boolean isPermisoEliminarTipoListaPrecio;
	public Boolean isPermisoGuardarCambiosTipoListaPrecio;
	public Boolean isPermisoConsultaTipoListaPrecio;
	public Boolean isPermisoBusquedaTipoListaPrecio;
	public Boolean isPermisoReporteTipoListaPrecio;
	public Boolean isPermisoPaginacionMedioTipoListaPrecio;
	public Boolean isPermisoPaginacionAltoTipoListaPrecio;
	public Boolean isPermisoPaginacionTodoTipoListaPrecio;
	public Boolean isPermisoCopiarTipoListaPrecio;
	public Boolean isPermisoVerFormTipoListaPrecio;
	public Boolean isPermisoDuplicarTipoListaPrecio;
	public Boolean isPermisoOrdenTipoListaPrecio;
	
	
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
	
	public TipoListaPrecioParameterReturnGeneral tipolistaprecioReturnGeneral;
	public TipoListaPrecioParameterReturnGeneral tipolistaprecioParameterGeneral;
	
	

	public ClienteLogic clienteLogic=null;

	public ClienteLogic getClienteLogic() {
		return clienteLogic;
	}

	public void setClienteLogic(ClienteLogic clienteLogic) {
		this.clienteLogic = clienteLogic;
	}


	public ParametroCarteraDefectoLogic parametrocarteradefectoLogic=null;

	public ParametroCarteraDefectoLogic getParametroCarteraDefectoLogic() {
		return parametrocarteradefectoLogic;
	}

	public void setParametroCarteraDefectoLogic(ParametroCarteraDefectoLogic parametrocarteradefectoLogic) {
		this.parametrocarteradefectoLogic = parametrocarteradefectoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoListaPrecio=false;
	public Boolean esParaAccionDesdeFormularioTipoListaPrecio=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoListaPrecioSessionBeanAdditional tipolistaprecioSessionBeanAdditional=null;
	
	public TipoListaPrecioSessionBeanAdditional getTipoListaPrecioSessionBeanAdditional() {
		return this.tipolistaprecioSessionBeanAdditional;
	}
	
	public void setTipoListaPrecioSessionBeanAdditional(TipoListaPrecioSessionBeanAdditional tipolistaprecioSessionBeanAdditional) {
		try {
			this.tipolistaprecioSessionBeanAdditional=tipolistaprecioSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoListaPrecioBeanSwingJInternalFrameAdditional tipolistaprecioBeanSwingJInternalFrameAdditional=null;
	//public class TipoListaPrecioBeanSwingJInternalFrame
	
	public TipoListaPrecioBeanSwingJInternalFrameAdditional getTipoListaPrecioBeanSwingJInternalFrameAdditional() {
		return this.tipolistaprecioBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoListaPrecioBeanSwingJInternalFrameAdditional(TipoListaPrecioBeanSwingJInternalFrameAdditional tipolistaprecioBeanSwingJInternalFrameAdditional) {
		try {
			this.tipolistaprecioBeanSwingJInternalFrameAdditional=tipolistaprecioBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoListaPrecioLogic tipolistaprecioLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoListaPrecio tipolistaprecioBean;
	public TipoListaPrecioConstantesFunciones tipolistaprecioConstantesFunciones;
	//public TipoListaPrecioParameterReturnGeneral tipolistaprecioReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<TipoListaPrecio> tipolistaprecios;	
	//public List<TipoListaPrecio> tipolistapreciosEliminados;
	//public List<TipoListaPrecio> tipolistapreciosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoListaPrecio=false;
	public Boolean isVisibilidadCeldaDuplicarTipoListaPrecio=true;
	public Boolean isVisibilidadCeldaCopiarTipoListaPrecio=true;
	public Boolean isVisibilidadCeldaVerFormTipoListaPrecio=true;
	public Boolean isVisibilidadCeldaOrdenTipoListaPrecio=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;
	public Boolean isVisibilidadCeldaModificarTipoListaPrecio=false;
	public Boolean isVisibilidadCeldaActualizarTipoListaPrecio=false;
	public Boolean isVisibilidadCeldaEliminarTipoListaPrecio=false;
	public Boolean isVisibilidadCeldaCancelarTipoListaPrecio=false;
	public Boolean isVisibilidadCeldaGuardarTipoListaPrecio=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoListaPrecio=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoTipoListaPrecio() {
		return this.iIdNuevoTipoListaPrecio;
	}

	public void setiIdNuevoTipoListaPrecio(Long iIdNuevoTipoListaPrecio) {
		this.iIdNuevoTipoListaPrecio = iIdNuevoTipoListaPrecio;
	}
	
	public Long getidTipoListaPrecioActual() {
		return this.idTipoListaPrecioActual;
	}

	public void setidTipoListaPrecioActual(Long idTipoListaPrecioActual) {
		this.idTipoListaPrecioActual = idTipoListaPrecioActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoListaPrecio gettipolistaprecio() {
		return this.tipolistaprecio;
	}

	public void settipolistaprecio(TipoListaPrecio tipolistaprecio) {
		this.tipolistaprecio = tipolistaprecio;
	}
	
	public TipoListaPrecio gettipolistaprecioAux() {
		return this.tipolistaprecioAux;
	}

	public void settipolistaprecioAux(TipoListaPrecio tipolistaprecioAux) {
		this.tipolistaprecioAux = tipolistaprecioAux;
	}				
	
	public TipoListaPrecio gettipolistaprecioAnterior() {
		return this.tipolistaprecioAnterior;
	}

	public void settipolistaprecioAnterior(TipoListaPrecio tipolistaprecioAnterior) {
		this.tipolistaprecioAnterior = tipolistaprecioAnterior;
	}	
	
	public TipoListaPrecio gettipolistaprecioTotales() {
		return this.tipolistaprecioTotales;
	}

	public void settipolistaprecioTotales(TipoListaPrecio tipolistaprecioTotales) {
		this.tipolistaprecioTotales = tipolistaprecioTotales;
	}	
	
	public TipoListaPrecio gettipolistaprecioBean() {
		return this.tipolistaprecioBean;
	}

	public void settipolistaprecioBean(TipoListaPrecio tipolistaprecioBean) {
		this.tipolistaprecioBean = tipolistaprecioBean;
	}	
	
	public TipoListaPrecioParameterReturnGeneral gettipolistaprecioReturnGeneral() {
		return this.tipolistaprecioReturnGeneral;
	}

	public void settipolistaprecioReturnGeneral(TipoListaPrecioParameterReturnGeneral tipolistaprecioReturnGeneral) {
		this.tipolistaprecioReturnGeneral = tipolistaprecioReturnGeneral;
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
	
	
	public TipoListaPrecioLogic getTipoListaPrecioLogic()	{		
		return tipolistaprecioLogic;
	}

	public void setTipoListaPrecioLogic(TipoListaPrecioLogic tipolistaprecioLogic) {
		this.tipolistaprecioLogic = tipolistaprecioLogic;
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
	
	public Boolean getIsEsNuevoTipoListaPrecio() {
		return isEsNuevoTipoListaPrecio;
	}

	public void setIsEsNuevoTipoListaPrecio(Boolean isEsNuevoTipoListaPrecio) {
		this.isEsNuevoTipoListaPrecio = isEsNuevoTipoListaPrecio;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoListaPrecio() {
		return esParaAccionDesdeFormularioTipoListaPrecio;
	}
	
	public void setEsParaAccionDesdeFormularioTipoListaPrecio(Boolean esParaAccionDesdeFormularioTipoListaPrecio) {
		this.esParaAccionDesdeFormularioTipoListaPrecio = esParaAccionDesdeFormularioTipoListaPrecio;
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

			if(this.tipolistaprecioSessionBean==null) {
				this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
			}

			if(!this.tipolistaprecioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(tipolistaprecioSessionBean.getlidEmpresaActual());
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

					if(this.tipolistaprecio!=null) {
						this.tipolistaprecio.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
						this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTipoListaPrecio.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
						if(this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.getItemCount()>0) {
							this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTipoListaPrecioGenerico)throws Exception
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
				jComboBoxid_empresaTipoListaPrecioGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTipoListaPrecioGenerico!=null && jComboBoxid_empresaTipoListaPrecioGenerico.getItemCount()>0) {
					jComboBoxid_empresaTipoListaPrecioGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TipoListaPrecio tipolistaprecio,JComboBox jComboBoxid_empresaTipoListaPrecioGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTipoListaPrecioGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTipoListaPrecioGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				tipolistaprecio.setid_empresa(empresaAux.getId());
				tipolistaprecio.setempresa_descripcion(TipoListaPrecioConstantesFunciones.getEmpresaDescripcion(empresaAux));
				tipolistaprecio.setEmpresa(empresaAux);			}
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

					if(!TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { 
							this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { 
					}

					if(!TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
							this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
							this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesTipoListaPrecio() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoListaPrecioConstantesFunciones.refrescarForeignKeysDescripcionesTipoListaPrecio(this.tipolistaprecioLogic.getTipoListaPrecios());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoListaPrecioConstantesFunciones.refrescarForeignKeysDescripcionesTipoListaPrecio(this.tipolistaprecios);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipolistaprecioLogic.setTipoListaPrecios(this.tipolistaprecios);
			tipolistaprecioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoListaPrecioParameterReturnGeneral getTipoListaPrecioParameterGeneral() {
		return this.tipolistaprecioParameterGeneral;
	}
	
	public void setTipoListaPrecioParameterGeneral(TipoListaPrecioParameterReturnGeneral tipolistaprecioParameterGeneral) {
		this.tipolistaprecioParameterGeneral = tipolistaprecioParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoListaPrecio() {
		return isPermisoTodoTipoListaPrecio;
	}

	public void setIsPermisoTodoTipoListaPrecio(Boolean isPermisoTodoTipoListaPrecio) {
		this.isPermisoTodoTipoListaPrecio = isPermisoTodoTipoListaPrecio;
	}

	public Boolean getIsPermisoNuevoTipoListaPrecio() {
		return isPermisoNuevoTipoListaPrecio;
	}

	public void setIsPermisoNuevoTipoListaPrecio(Boolean isPermisoNuevoTipoListaPrecio) {
		this.isPermisoNuevoTipoListaPrecio = isPermisoNuevoTipoListaPrecio;
	}

	public Boolean getIsPermisoActualizarTipoListaPrecio() {
		return isPermisoActualizarTipoListaPrecio;
	}

	public void setIsPermisoActualizarTipoListaPrecio(Boolean isPermisoActualizarTipoListaPrecio) {
		this.isPermisoActualizarTipoListaPrecio = isPermisoActualizarTipoListaPrecio;
	}

	public Boolean getIsPermisoEliminarTipoListaPrecio() {
		return isPermisoEliminarTipoListaPrecio;
	}

	public void setIsPermisoEliminarTipoListaPrecio(Boolean isPermisoEliminarTipoListaPrecio) {
		this.isPermisoEliminarTipoListaPrecio = isPermisoEliminarTipoListaPrecio;
	}

	public Boolean getIsPermisoGuardarCambiosTipoListaPrecio() {
		return isPermisoGuardarCambiosTipoListaPrecio;
	}

	public void setIsPermisoGuardarCambiosTipoListaPrecio(Boolean isPermisoGuardarCambiosTipoListaPrecio) {
		this.isPermisoGuardarCambiosTipoListaPrecio = isPermisoGuardarCambiosTipoListaPrecio;
	}
	
	public Boolean getIsPermisoConsultaTipoListaPrecio() {
		return isPermisoConsultaTipoListaPrecio;
	}

	public void setIsPermisoConsultaTipoListaPrecio(Boolean isPermisoConsultaTipoListaPrecio) {
		this.isPermisoConsultaTipoListaPrecio = isPermisoConsultaTipoListaPrecio;
	}

	public Boolean getIsPermisoBusquedaTipoListaPrecio() {
		return isPermisoBusquedaTipoListaPrecio;
	}

	public void setIsPermisoBusquedaTipoListaPrecio(Boolean isPermisoBusquedaTipoListaPrecio) {
		this.isPermisoBusquedaTipoListaPrecio = isPermisoBusquedaTipoListaPrecio;
	}

	public Boolean getIsPermisoReporteTipoListaPrecio() {
		return isPermisoReporteTipoListaPrecio;
	}

	public void setIsPermisoReporteTipoListaPrecio(Boolean isPermisoReporteTipoListaPrecio) {
		this.isPermisoReporteTipoListaPrecio = isPermisoReporteTipoListaPrecio;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoListaPrecio() {
		return isPermisoPaginacionMedioTipoListaPrecio;
	}

	public void setIsPermisoPaginacionMedioTipoListaPrecio(Boolean isPermisoPaginacionMedioTipoListaPrecio) {
		this.isPermisoPaginacionMedioTipoListaPrecio = isPermisoPaginacionMedioTipoListaPrecio;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoListaPrecio() {
		return isPermisoPaginacionTodoTipoListaPrecio;
	}

	public void setIsPermisoPaginacionTodoTipoListaPrecio(Boolean isPermisoPaginacionTodoTipoListaPrecio) {
		this.isPermisoPaginacionTodoTipoListaPrecio = isPermisoPaginacionTodoTipoListaPrecio;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoListaPrecio() {
		return isPermisoPaginacionAltoTipoListaPrecio;
	}

	public void setIsPermisoPaginacionAltoTipoListaPrecio(Boolean isPermisoPaginacionAltoTipoListaPrecio) {
		this.isPermisoPaginacionAltoTipoListaPrecio = isPermisoPaginacionAltoTipoListaPrecio;
	}
	
	public Boolean getIsPermisoCopiarTipoListaPrecio() {
		return isPermisoCopiarTipoListaPrecio;
	}

	public void setIsPermisoCopiarTipoListaPrecio(Boolean isPermisoCopiarTipoListaPrecio) {
		this.isPermisoCopiarTipoListaPrecio = isPermisoCopiarTipoListaPrecio;
	}
	
	public Boolean getIsPermisoVerFormTipoListaPrecio() {
		return isPermisoVerFormTipoListaPrecio;
	}

	public void setIsPermisoVerFormTipoListaPrecio(Boolean isPermisoVerFormTipoListaPrecio) {
		this.isPermisoVerFormTipoListaPrecio = isPermisoVerFormTipoListaPrecio;
	}
	
	public Boolean getIsPermisoDuplicarTipoListaPrecio() {
		return isPermisoDuplicarTipoListaPrecio;
	}

	public void setIsPermisoDuplicarTipoListaPrecio(Boolean isPermisoDuplicarTipoListaPrecio) {
		this.isPermisoDuplicarTipoListaPrecio = isPermisoDuplicarTipoListaPrecio;
	}
	
	public Boolean getIsPermisoOrdenTipoListaPrecio() {
		return isPermisoOrdenTipoListaPrecio;
	}

	public void setIsPermisoOrdenTipoListaPrecio(Boolean isPermisoOrdenTipoListaPrecio) {
		this.isPermisoOrdenTipoListaPrecio = isPermisoOrdenTipoListaPrecio;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoListaPrecio() {
		return isVisibilidadCeldaNuevoTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaNuevoTipoListaPrecio(Boolean isVisibilidadCeldaNuevoTipoListaPrecio) {
		this.isVisibilidadCeldaNuevoTipoListaPrecio = isVisibilidadCeldaNuevoTipoListaPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoListaPrecio() {
		return isVisibilidadCeldaDuplicarTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaDuplicarTipoListaPrecio(Boolean isVisibilidadCeldaDuplicarTipoListaPrecio) {
		this.isVisibilidadCeldaDuplicarTipoListaPrecio = isVisibilidadCeldaDuplicarTipoListaPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoListaPrecio() {
		return isVisibilidadCeldaCopiarTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaCopiarTipoListaPrecio(Boolean isVisibilidadCeldaCopiarTipoListaPrecio) {
		this.isVisibilidadCeldaCopiarTipoListaPrecio = isVisibilidadCeldaCopiarTipoListaPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoListaPrecio() {
		return isVisibilidadCeldaVerFormTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaVerFormTipoListaPrecio(Boolean isVisibilidadCeldaVerFormTipoListaPrecio) {
		this.isVisibilidadCeldaVerFormTipoListaPrecio = isVisibilidadCeldaVerFormTipoListaPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoListaPrecio() {
		return isVisibilidadCeldaOrdenTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaOrdenTipoListaPrecio(Boolean isVisibilidadCeldaOrdenTipoListaPrecio) {
		this.isVisibilidadCeldaOrdenTipoListaPrecio = isVisibilidadCeldaOrdenTipoListaPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoListaPrecio() {
		return isVisibilidadCeldaNuevoRelacionesTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoListaPrecio(Boolean isVisibilidadCeldaNuevoRelacionesTipoListaPrecio) {
		this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio = isVisibilidadCeldaNuevoRelacionesTipoListaPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoListaPrecio() {
		return isVisibilidadCeldaModificarTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaModificarTipoListaPrecio(Boolean isVisibilidadCeldaModificarTipoListaPrecio) {
		this.isVisibilidadCeldaModificarTipoListaPrecio = isVisibilidadCeldaModificarTipoListaPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoListaPrecio() {
		return isVisibilidadCeldaActualizarTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaActualizarTipoListaPrecio(Boolean isVisibilidadCeldaActualizarTipoListaPrecio) {
		this.isVisibilidadCeldaActualizarTipoListaPrecio = isVisibilidadCeldaActualizarTipoListaPrecio;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoListaPrecio() {
		return isVisibilidadCeldaEliminarTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaEliminarTipoListaPrecio(Boolean isVisibilidadCeldaEliminarTipoListaPrecio) {
		this.isVisibilidadCeldaEliminarTipoListaPrecio = isVisibilidadCeldaEliminarTipoListaPrecio;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoListaPrecio() {
		return isVisibilidadCeldaCancelarTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaCancelarTipoListaPrecio(Boolean isVisibilidadCeldaCancelarTipoListaPrecio) {
		this.isVisibilidadCeldaCancelarTipoListaPrecio = isVisibilidadCeldaCancelarTipoListaPrecio;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoListaPrecio() {
		return isVisibilidadCeldaGuardarTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaGuardarTipoListaPrecio(Boolean isVisibilidadCeldaGuardarTipoListaPrecio) {
		this.isVisibilidadCeldaGuardarTipoListaPrecio = isVisibilidadCeldaGuardarTipoListaPrecio;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoListaPrecio() {
		return isVisibilidadCeldaGuardarCambiosTipoListaPrecio;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoListaPrecio(Boolean isVisibilidadCeldaGuardarCambiosTipoListaPrecio) {
		this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio = isVisibilidadCeldaGuardarCambiosTipoListaPrecio;
	}
		
	public TipoListaPrecioSessionBean gettipolistaprecioSessionBean() {
		return this.tipolistaprecioSessionBean;
	}
	
	public void settipolistaprecioSessionBean(TipoListaPrecioSessionBean tipolistaprecioSessionBean) {
		this.tipolistaprecioSessionBean=tipolistaprecioSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(TipoListaPrecio tipolistaprecio)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(tipolistaprecio,null);
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
	
	public void bugActualizarReferenciaActual(TipoListaPrecio tipolistaprecio,TipoListaPrecio tipolistaprecioAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoListaPrecio(tipolistaprecio);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipolistaprecioAux.setId(tipolistaprecio.getId());
		tipolistaprecioAux.setVersionRow(tipolistaprecio.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoListaPrecio();
		
			int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipolistaprecioValidator.getInvalidValues(this.tipolistaprecio);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipolistaprecioLogic.setDatosCliente(datosCliente);
			tipolistaprecioLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipolistaprecioAux=new  TipoListaPrecio();
				
				tipolistaprecioAux.setIsNew(true);
				tipolistaprecioAux.setIsChanged(true);
				
				tipolistaprecioAux.setTipoListaPrecioOriginal(this.tipolistaprecio);
				
				tipolistaprecioAux.setId(this.tipolistaprecio.getId());	
				tipolistaprecioAux.setVersionRow(this.tipolistaprecio.getVersionRow());	
				tipolistaprecioAux.setid_empresa(this.tipolistaprecio.getid_empresa());	
				tipolistaprecioAux.setcodigo(this.tipolistaprecio.getcodigo());	
				tipolistaprecioAux.setnombre(this.tipolistaprecio.getnombre());	
				tipolistaprecioAux.setfecha_desde(this.tipolistaprecio.getfecha_desde());	
				tipolistaprecioAux.setfecha_hasta(this.tipolistaprecio.getfecha_hasta());	
				tipolistaprecioAux.setesta_activo(this.tipolistaprecio.getesta_activo());	
				tipolistaprecioAux.setdescripcion(this.tipolistaprecio.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipolistaprecioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipolistaprecioAux,tipolistaprecioLogic.getTipoListaPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolistaprecioAux,tipolistaprecios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolistaprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolistaprecioLogic.saveTipoListaPrecios();//WithConnection
						//tipolistaprecioLogic.getSetVersionRowTipoListaPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipolistaprecio,tipolistaprecioAux);
					
					this.refrescarForeignKeysDescripcionesTipoListaPrecio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolistaprecioLogic.saveTipoListaPrecioRelaciones(tipolistaprecioAux,this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//tipolistaprecioLogic.getSetVersionRowTipoListaPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipolistaprecio,tipolistaprecioAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolistaprecioAux.setClientes(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolistaprecioAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipolistaprecioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipolistaprecioAux,tipolistaprecioLogic.getTipoListaPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipolistaprecioAux,tipolistaprecios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipolistaprecio,tipolistaprecioAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipolistaprecioAux=new  TipoListaPrecio();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado() 
					|| (this.tipolistaprecioSessionBean.getEsGuardarRelacionado() && this.tipolistaprecio.getId()>=0)) {
						
					tipolistaprecioAux.setIsNew(false);
				}
				
				tipolistaprecioAux.setIsDeleted(false);
			
				tipolistaprecioAux.setId(this.tipolistaprecio.getId());	
				tipolistaprecioAux.setVersionRow(this.tipolistaprecio.getVersionRow());	
				tipolistaprecioAux.setid_empresa(this.tipolistaprecio.getid_empresa());	
				tipolistaprecioAux.setcodigo(this.tipolistaprecio.getcodigo());	
				tipolistaprecioAux.setnombre(this.tipolistaprecio.getnombre());	
				tipolistaprecioAux.setfecha_desde(this.tipolistaprecio.getfecha_desde());	
				tipolistaprecioAux.setfecha_hasta(this.tipolistaprecio.getfecha_hasta());	
				tipolistaprecioAux.setesta_activo(this.tipolistaprecio.getesta_activo());	
				tipolistaprecioAux.setdescripcion(this.tipolistaprecio.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipolistaprecioAux,tipolistaprecioLogic.getTipoListaPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolistaprecioAux,tipolistaprecios);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolistaprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolistaprecioLogic.saveTipoListaPrecios();//WithConnection
						//tipolistaprecioLogic.getSetVersionRowTipoListaPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipolistaprecio,tipolistaprecioAux);
					
					this.refrescarForeignKeysDescripcionesTipoListaPrecio();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolistaprecioLogic.saveTipoListaPrecioRelaciones(tipolistaprecioAux,this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//tipolistaprecioLogic.getSetVersionRowTipoListaPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipolistaprecio,tipolistaprecioAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolistaprecioAux.setClientes(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolistaprecioAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipolistaprecioSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipolistaprecioAux,tipolistaprecioLogic.getTipoListaPrecios());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipolistaprecioAux,tipolistaprecios);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipolistaprecio,tipolistaprecioAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipolistaprecioAux=new  TipoListaPrecio();
				
				tipolistaprecioAux.setIsNew(false);
				tipolistaprecioAux.setIsChanged(false);
				
				tipolistaprecioAux.setIsDeleted(true);
				
				tipolistaprecioAux.setId(this.tipolistaprecio.getId());	
				tipolistaprecioAux.setVersionRow(this.tipolistaprecio.getVersionRow());	
				tipolistaprecioAux.setid_empresa(this.tipolistaprecio.getid_empresa());	
				tipolistaprecioAux.setcodigo(this.tipolistaprecio.getcodigo());	
				tipolistaprecioAux.setnombre(this.tipolistaprecio.getnombre());	
				tipolistaprecioAux.setfecha_desde(this.tipolistaprecio.getfecha_desde());	
				tipolistaprecioAux.setfecha_hasta(this.tipolistaprecio.getfecha_hasta());	
				tipolistaprecioAux.setesta_activo(this.tipolistaprecio.getesta_activo());	
				tipolistaprecioAux.setdescripcion(this.tipolistaprecio.getdescripcion());	
				
				if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipolistaprecioAux.getId()>=0) {	
						this.tipolistapreciosEliminados.add(tipolistaprecioAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipolistaprecioAux,tipolistaprecioLogic.getTipoListaPrecios());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolistaprecioAux,tipolistaprecios);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipolistaprecioSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolistaprecioLogic.saveTipoListaPrecios();//WithConnection
						//tipolistaprecioLogic.getSetVersionRowTipoListaPrecios();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes().addAll(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos().addAll(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientes.addAll(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientesEliminados);
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos.addAll(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipolistaprecioLogic.saveTipoListaPrecioRelaciones(tipolistaprecioAux,this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes(),this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());//WithConnection
								//tipolistaprecioLogic.getSetVersionRowTipoListaPrecios();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(new ArrayList<Cliente>());
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(new ArrayList<ParametroCarteraDefecto>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientes= new ArrayList<Cliente>();
							this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos= new ArrayList<ParametroCarteraDefecto>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolistaprecioAux.setClientes(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());

							if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipolistaprecioAux.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipolistaprecioSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipolistaprecioAux,tipolistaprecioLogic.getTipoListaPrecios());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipolistaprecioAux,tipolistaprecios);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getTipoListaPrecios().addAll(this.tipolistapreciosEliminados);
					
					tipolistaprecioLogic.saveTipoListaPrecios();//WithConnection
					//tipolistaprecioLogic.getSetVersionRowTipoListaPrecios();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTipoListaPrecio();
				
				this.tipolistapreciosEliminados= new ArrayList<TipoListaPrecio>();		
			}
			
			if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Lista Precio GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipolistaprecio=tipolistaprecioAux;
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
      		//this.finishProcessTipoListaPrecio();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoListaPrecio tipolistaprecioLocal) throws Exception {
		
		if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipolistaprecioLocal.setClientes(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
				tipolistaprecioLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
			
			} else {
			
				tipolistaprecioLocal.setClientes(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clientes);
				tipolistaprecioLocal.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoListaPrecio tipolistaprecioLocal) throws Exception {	
		if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				tipolistaprecioLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTipoListaPrecioActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipolistaprecioValidator.getInvalidValues(this.tipolistaprecio);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoListaPrecio tipolistaprecio,List<TipoListaPrecio> tipolistaprecios) throws Exception {
		try	{		
			TipoListaPrecioConstantesFunciones.actualizarLista(tipolistaprecio,tipolistaprecios,this.tipolistaprecioSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoListaPrecio tipolistaprecio,List<TipoListaPrecio> tipolistaprecios) throws Exception {
		try	{			
			TipoListaPrecioConstantesFunciones.actualizarSelectedLista(tipolistaprecio,tipolistaprecios);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoListaPrecio> tipolistapreciosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipolistapreciosLocal=this.tipolistaprecioLogic.getTipoListaPrecios();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipolistapreciosLocal=this.tipolistaprecios;
			}
			//ARCHITECTURE
		
			for(TipoListaPrecio tipolistaprecioLocal:tipolistapreciosLocal) {
				if(this.permiteMantenimiento(tipolistaprecioLocal) && tipolistaprecioLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoListaPrecioConstantesFunciones.getTipoListaPrecioLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoListaPrecioConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelid_empresaTipoListaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoListaPrecioConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelcodigoTipoListaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoListaPrecioConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelnombreTipoListaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoListaPrecioConstantesFunciones.FECHADESDE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelfecha_desdeTipoListaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoListaPrecioConstantesFunciones.FECHAHASTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelfecha_hastaTipoListaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoListaPrecioConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelesta_activoTipoListaPrecio,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoListaPrecioConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabeldescripcionTipoListaPrecio,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelid_empresaTipoListaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelcodigoTipoListaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelnombreTipoListaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelfecha_desdeTipoListaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelfecha_hastaTipoListaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelesta_activoTipoListaPrecio,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoListaPrecio.jLabeldescripcionTipoListaPrecio,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Cliente")) {
			if(this.tipolistaprecio==null) {
				this.tipolistaprecio= new TipoListaPrecio();
			}

			if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoListaPrecio
				this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);

				this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.getcliente().setTipoListaPrecio(this.tipolistaprecio);
			}

			return;
		}
		 else  if(sTipo.equals("ParametroCarteraDefecto")) {
			if(this.tipolistaprecio==null) {
				this.tipolistaprecio= new TipoListaPrecio();
			}

			if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoListaPrecio
				this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);

				this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.getparametrocarteradefecto().setTipoListaPrecio(this.tipolistaprecio);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoListaPrecio--;	
		
		
		this.tipolistaprecioAux=new TipoListaPrecio();
		
		this.tipolistaprecioAux.setId(this.iIdNuevoTipoListaPrecio);
		this.tipolistaprecioAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipolistaprecioLogic.getTipoListaPrecios().add(this.tipolistaprecioAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipolistaprecios.add(this.tipolistaprecioAux);
		}
		//ARCHITECTURE
		
		this.tipolistaprecio=this.tipolistaprecioAux;
		
		if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoListaPrecio(this.tipolistaprecio);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoListaPrecio(this.tipolistaprecio);
		}
				
		//this.setDefaultControlesTipoListaPrecio();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoListaPrecio();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoListaPrecio();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoListaPrecio();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoListaPrecio(this.tipolistaprecioBean,this.tipolistaprecio,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoListaPrecioConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
			classes=TipoListaPrecioConstantesFunciones.getClassesRelationshipsOfTipoListaPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipolistaprecioReturnGeneral=tipolistaprecioLogic.procesarEventosTipoListaPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolistaprecioLogic.getTipoListaPrecios(),this.tipolistaprecio,this.tipolistaprecioParameterGeneral,this.isEsNuevoTipoListaPrecio,classes);//this.tipolistaprecioLogic.getTipoListaPrecio()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoListaPrecio(this.tipolistaprecioReturnGeneral,this.tipolistaprecioBean,false);
		
		if(this.tipolistaprecioReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoListaPrecio(this.tipolistaprecioReturnGeneral.getTipoListaPrecio());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoListaPrecio(this.tipolistaprecioReturnGeneral.getTipoListaPrecio());
		}
		
		if(this.tipolistaprecioReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoListaPrecio(this.tipolistaprecioReturnGeneral.getTipoListaPrecio(),classes);//this.tipolistaprecioBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoListaPrecio();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoListaPrecio();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.RecargarFormTipoListaPrecio(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoListaPrecio(false);
						
			if(tipolistaprecioSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoListaPrecio();
			}
			
			this.actualizarVisualTableDatosTipoListaPrecio();
			
			this.jTableDatosTipoListaPrecio.setRowSelectionInterval(this.getIndiceNuevoTipoListaPrecio(), this.getIndiceNuevoTipoListaPrecio());
			
			this.seleccionarFilaTablaTipoListaPrecioActual();
						
			this.actualizarEstadoCeldasBotonesTipoListaPrecio("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoListaPrecio(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreacodigoTipoListaPrecio.setEnabled(isHabilitar && this.tipolistaprecioConstantesFunciones.activarcodigoTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreanombreTipoListaPrecio.setEnabled(isHabilitar && this.tipolistaprecioConstantesFunciones.activarnombreTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_desdeTipoListaPrecio.setEnabled(isHabilitar && this.tipolistaprecioConstantesFunciones.activarfecha_desdeTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_hastaTipoListaPrecio.setEnabled(isHabilitar && this.tipolistaprecioConstantesFunciones.activarfecha_hastaTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxesta_activoTipoListaPrecio.setEnabled(isHabilitar && this.tipolistaprecioConstantesFunciones.activaresta_activoTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreadescripcionTipoListaPrecio.setEnabled(isHabilitar && this.tipolistaprecioConstantesFunciones.activardescripcionTipoListaPrecio);	
		//
		this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.setEnabled(isHabilitar && this.tipolistaprecioConstantesFunciones.activarid_empresaTipoListaPrecio);
	};
	
	public void setDefaultControlesTipoListaPrecio() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoListaPrecio(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipolistaprecioSessionBean.setConGuardarRelaciones(true);			
			this.tipolistaprecioSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipolistaprecioSessionBean.setConGuardarRelaciones(false);			
			this.tipolistaprecioSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoListaPrecio() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecioLogic.getTipoListaPrecios()) {
				if(tipolistaprecioAux.getId().equals(this.iIdNuevoTipoListaPrecio)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecios) {
				if(tipolistaprecioAux.getId().equals(this.iIdNuevoTipoListaPrecio)) {
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
	
	public int getIndiceActualTipoListaPrecio(TipoListaPrecio tipolistaprecio,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecioLogic.getTipoListaPrecios()) {
				if(tipolistaprecioAux.getId().equals(tipolistaprecio.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecios) {
				if(tipolistaprecioAux.getId().equals(tipolistaprecio.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoListaPrecio(TipoListaPrecio tipolistaprecioOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecioLogic.getTipoListaPrecios()) {
				if(tipolistaprecioAux.getTipoListaPrecioOriginal().getId().equals(tipolistaprecioOriginal.getId())) {
					existe=true;
					tipolistaprecioOriginal.setId(tipolistaprecioAux.getId());
					tipolistaprecioOriginal.setVersionRow(tipolistaprecioAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecios) {
				if(tipolistaprecioAux.getTipoListaPrecioOriginal().getId().equals(tipolistaprecioOriginal.getId())) {
					existe=true;
					tipolistaprecioOriginal.setId(tipolistaprecioAux.getId());
					tipolistaprecioOriginal.setVersionRow(tipolistaprecioAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoListaPrecio(Boolean esParaCancelar) throws Exception {
		tipolistapreciosAux=new ArrayList<TipoListaPrecio>();
		tipolistaprecioAux=new TipoListaPrecio();
		
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecioLogic.getTipoListaPrecios()) {
					if(tipolistaprecioAux.getId()<0) {
						tipolistapreciosAux.add(tipolistaprecioAux);
					}		
				}
				this.iIdNuevoTipoListaPrecio=0L;
				this.tipolistaprecioLogic.getTipoListaPrecios().removeAll(tipolistapreciosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecios) {
					if(tipolistaprecioAux.getId()<0) {
						tipolistapreciosAux.add(tipolistaprecioAux);
					}		
				}
				this.iIdNuevoTipoListaPrecio=0L;
				this.tipolistaprecios.removeAll(tipolistapreciosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoListaPrecio 
					&& this.tipolistaprecioLogic.getTipoListaPrecios().size()>0
					) {
					tipolistaprecioAux=this.tipolistaprecioLogic.getTipoListaPrecios().get(this.tipolistaprecioLogic.getTipoListaPrecios().size() - 1);
				
					if(tipolistaprecioAux.getId()<0) {
						this.tipolistaprecioLogic.getTipoListaPrecios().remove(tipolistaprecioAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoListaPrecio && this.tipolistaprecios.size()>0) {
					tipolistaprecioAux=this.tipolistaprecios.get(this.tipolistaprecios.size() - 1);
				
					if(tipolistaprecioAux.getId()<0) {
						this.tipolistaprecios.remove(tipolistaprecioAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoListaPrecio(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipolistaprecio.getId()<0) {
				this.tipolistaprecioLogic.getTipoListaPrecios().remove(this.tipolistaprecio);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipolistaprecio.getId()<0) {
				this.tipolistaprecios.remove(this.tipolistaprecio);
			}
		}			
	}
	
	public void setEstadosInicialesTipoListaPrecio(List<TipoListaPrecio> tipolistapreciosAux) throws Exception {
		TipoListaPrecioConstantesFunciones.setEstadosInicialesTipoListaPrecio(tipolistapreciosAux);
	}
	
	public void setEstadosInicialesTipoListaPrecio(TipoListaPrecio tipolistaprecioAux) throws Exception {
		TipoListaPrecioConstantesFunciones.setEstadosInicialesTipoListaPrecio(tipolistaprecioAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoListaPrecioActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoListaPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoListaPrecioActual()) {
				if(!this.isEsNuevoTipoListaPrecio) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoListaPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoListaPrecio=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoListaPrecioActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Lista Precio ?", "MANTENIMIENTO DE Tipo Lista Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoListaPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoListaPrecio tipolistaprecio) throws Exception {
		TipoListaPrecioConstantesFunciones.seleccionarAsignar(this.tipolistaprecio,tipolistaprecio);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoListaPrecio=this.isPermisoActualizarOriginalTipoListaPrecio;
			
			
			this.seleccionarAsignar(tipolistaprecio);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoListaPrecioConstantesFunciones.quitarEspaciosTipoListaPrecio(this.tipolistaprecio,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoListaPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipolistaprecioSessionBean.setsFuncionBusquedaRapida(this.tipolistaprecioSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoListaPrecio) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoListaPrecio(esParaCancelar);				
				this.cancelarNuevoTipoListaPrecio(esParaCancelar);								
			}
			
			this.tipolistaprecio=new TipoListaPrecio();
			
			this.inicializarTipoListaPrecio();
			
			this.actualizarEstadoCeldasBotonesTipoListaPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoListaPrecio() throws Exception {
		try {
			TipoListaPrecioConstantesFunciones.inicializarTipoListaPrecio(this.tipolistaprecio);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipolistaprecioLogic.getTipoListaPrecios().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoListaPrecios(String sAccionBusqueda,List<TipoListaPrecio> tipolistapreciosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoListaPrecio"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoListaPrecioMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoListaPrecioMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoListaPrecio"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Lista Precioes");		
		parameters.put("busquedapor", TipoListaPrecioConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Cliente.class));
			classes.add(new Classe(ParametroCarteraDefecto.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoListaPrecioLogic tipolistaprecioLogicAuxiliar=new TipoListaPrecioLogic();
					tipolistaprecioLogicAuxiliar.setDatosCliente(tipolistaprecioLogic.getDatosCliente());				
					tipolistaprecioLogicAuxiliar.setTipoListaPrecios(tipolistapreciosParaReportes);
					
					tipolistaprecioLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoListaPrecioWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipolistapreciosParaReportes=tipolistaprecioLogicAuxiliar.getTipoListaPrecios();
					
					//tipolistaprecioLogic.getNewConnexionToDeep();
					
					//for (TipoListaPrecio tipolistaprecio:tipolistapreciosParaReportes) {
					//	tipolistaprecioLogic.deepLoad(tipolistaprecio, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipolistaprecioLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipolistaprecioLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileCliente = AuxiliarReportes.class.getResourceAsStream("ClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_cliente", reportFileCliente);

			InputStream reportFileParametroCarteraDefecto = AuxiliarReportes.class.getResourceAsStream("ParametroCarteraDefectoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_parametrocarteradefecto", reportFileParametroCarteraDefecto);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoListaPrecio=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoListaPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoListaPrecioConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoListaPrecio=new JRBeanArrayDataSource(TipoListaPrecioJInternalFrame.TraerTipoListaPrecioBeans(tipolistapreciosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoListaPrecio);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoListaPrecioConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoListaPrecioConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoListaPrecioBean.TraerTipoListaPrecioBeans(tipolistapreciosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoListaPrecios(sAccionBusqueda,sTipoArchivoReporte,tipolistapreciosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoListaPrecios(sAccionBusqueda,sTipoArchivoReporte,tipolistapreciosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoListaPrecioActionPerformed(null);
					//this.generarExcelReporteTipoListaPrecios(sAccionBusqueda,sTipoArchivoReporte,tipolistapreciosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoListaPrecios(sAccionBusqueda,sTipoArchivoReporte,tipolistapreciosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoListaPrecios(sAccionBusqueda,sTipoArchivoReporte,tipolistapreciosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoListaPrecios(sAccionBusqueda,sTipoArchivoReporte,tipolistapreciosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoListaPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoListaPrecio> tipolistapreciosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolistaprecio";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoListaPrecios");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoListaPrecio("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoListaPrecio tipolistaprecio : tipolistapreciosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoListaPrecioConstantesFunciones.generarExcelReporteDataTipoListaPrecio("NORMAL",row,workbook,tipolistaprecio,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoListaPrecio(String sTipo,Row row,Workbook workbook) {
		
		TipoListaPrecioConstantesFunciones.generarExcelReporteHeaderTipoListaPrecio(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoListaPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoListaPrecio> tipolistapreciosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolistaprecio_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoListaPrecios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoListaPrecio tipolistaprecio : tipolistapreciosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoListaPrecioConstantesFunciones.getTipoListaPrecioDescripcion(tipolistaprecio));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolistaprecio.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoListaPrecioConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolistaprecio.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoListaPrecioConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolistaprecio.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolistaprecio.getfecha_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolistaprecio.getfecha_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(tipolistaprecio.getesta_activo()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipolistaprecio.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoListaPrecios(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoListaPrecio> tipolistapreciosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoListaPrecio> tipolistapreciosRespaldo=null;
		
		classes=TipoListaPrecioConstantesFunciones.getClassesRelationshipsOfTipoListaPrecio(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipolistaprecioLogic.setDatosCliente(this.datosCliente);
		this.tipolistaprecioLogic.setDatosDeep(this.datosDeep);
		this.tipolistaprecioLogic.setIsConDeep(true);
		
		tipolistapreciosRespaldo=this.tipolistaprecioLogic.getTipoListaPrecios();
		
		this.tipolistaprecioLogic.setTipoListaPrecios(tipolistapreciosParaReportes);	
		this.tipolistaprecioLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipolistapreciosParaReportes=this.tipolistaprecioLogic.getTipoListaPrecios();
		this.tipolistaprecioLogic.setTipoListaPrecios(tipolistapreciosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolistaprecio_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoListaPrecios");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoListaPrecio("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoListaPrecio tipolistaprecio : tipolistapreciosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoListaPrecio("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoListaPrecioConstantesFunciones.generarExcelReporteDataTipoListaPrecio("NORMAL",row,workbook,tipolistaprecio,cellStyleDataAux);
		
			
			


				//Cliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipolistaprecio.getClientes()!=null && tipolistaprecio.getClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ClienteConstantesFunciones.generarExcelReporteHeaderCliente("RELACIONADO",row,workbook);
				}

				if(tipolistaprecio.getClientes()!=null) {
					i2=0;
					for(Cliente cliente : tipolistaprecio.getClientes()) {
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


				//ParametroCarteraDefecto
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipolistaprecio.getParametroCarteraDefectos()!=null && tipolistaprecio.getParametroCarteraDefectos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ParametroCarteraDefectoConstantesFunciones.generarExcelReporteHeaderParametroCarteraDefecto("RELACIONADO",row,workbook);
				}

				if(tipolistaprecio.getParametroCarteraDefectos()!=null) {
					i2=0;
					for(ParametroCarteraDefecto parametrocarteradefecto : tipolistaprecio.getParametroCarteraDefectos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ParametroCarteraDefectoConstantesFunciones.generarExcelReporteDataParametroCarteraDefecto("RELACIONADO",row,workbook,parametrocarteradefecto,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoListaPrecioConstantesFunciones.getTipoListaPrecioDescripcion(tipolistaprecio));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoListaPrecio() throws Exception {		
		this.startProcessTipoListaPrecio(true);
	}
	
	public void startProcessTipoListaPrecio(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoListaPrecio ,this.jPanelParametrosReportesTipoListaPrecio, this.jScrollPanelDatosTipoListaPrecio,this.jPanelPaginacionTipoListaPrecio, this.jScrollPanelDatosEdicionTipoListaPrecio, this.jPanelAccionesTipoListaPrecio,this.jPanelAccionesFormularioTipoListaPrecio,this.jmenuBarTipoListaPrecio,this.jmenuBarDetalleTipoListaPrecio,this.jTtoolBarTipoListaPrecio,this.jTtoolBarDetalleTipoListaPrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoListaPrecio=this.jTabbedPaneBusquedasTipoListaPrecio; 
		
		final JPanel jPanelParametrosReportesTipoListaPrecio=this.jPanelParametrosReportesTipoListaPrecio;
		//final JScrollPane jScrollPanelDatosTipoListaPrecio=this.jScrollPanelDatosTipoListaPrecio;
		final JTable jTableDatosTipoListaPrecio=this.jTableDatosTipoListaPrecio;		
		final JPanel jPanelPaginacionTipoListaPrecio=this.jPanelPaginacionTipoListaPrecio;
		//final JScrollPane jScrollPanelDatosEdicionTipoListaPrecio=this.jScrollPanelDatosEdicionTipoListaPrecio;
		final JPanel jPanelAccionesTipoListaPrecio=this.jPanelAccionesTipoListaPrecio;
		
		JPanel jPanelCamposAuxiliarTipoListaPrecio=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoListaPrecio=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			jPanelCamposAuxiliarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jPanelCamposTipoListaPrecio;
			jPanelAccionesFormularioAuxiliarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jPanelAccionesFormularioTipoListaPrecio;
		}
		
		final JPanel jPanelCamposTipoListaPrecio=jPanelCamposAuxiliarTipoListaPrecio;
		final JPanel jPanelAccionesFormularioTipoListaPrecio=jPanelAccionesFormularioAuxiliarTipoListaPrecio;
		
		
		final JMenuBar jmenuBarTipoListaPrecio=this.jmenuBarTipoListaPrecio;
		final JToolBar jTtoolBarTipoListaPrecio=this.jTtoolBarTipoListaPrecio;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoListaPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoListaPrecio=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			jmenuBarDetalleAuxiliarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jmenuBarDetalleTipoListaPrecio;
			jTtoolBarDetalleAuxiliarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jTtoolBarDetalleTipoListaPrecio;
		}
		
		final JMenuBar jmenuBarDetalleTipoListaPrecio=jmenuBarDetalleAuxiliarTipoListaPrecio;
		final JToolBar jTtoolBarDetalleTipoListaPrecio=jTtoolBarDetalleAuxiliarTipoListaPrecio;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoListaPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoListaPrecio;
			processRunnable.jTableDatos=jTableDatosTipoListaPrecio;
			processRunnable.jPanelCampos=jPanelCamposTipoListaPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoListaPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoListaPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoListaPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoListaPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoListaPrecio;
			processRunnable.jTtoolBar=jTtoolBarTipoListaPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoListaPrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoListaPrecio ,jPanelParametrosReportesTipoListaPrecio,jTableDatosTipoListaPrecio, /*jScrollPanelDatosTipoListaPrecio,*/jPanelCamposTipoListaPrecio,jPanelPaginacionTipoListaPrecio, /*jScrollPanelDatosEdicionTipoListaPrecio,*/ jPanelAccionesTipoListaPrecio,jPanelAccionesFormularioTipoListaPrecio,jmenuBarTipoListaPrecio,jmenuBarDetalleTipoListaPrecio,jTtoolBarTipoListaPrecio,jTtoolBarDetalleTipoListaPrecio);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoListaPrecio ,jPanelParametrosReportesTipoListaPrecio, jScrollPanelDatosTipoListaPrecio,jPanelPaginacionTipoListaPrecio, jScrollPanelDatosEdicionTipoListaPrecio, jPanelAccionesTipoListaPrecio,jPanelAccionesFormularioTipoListaPrecio,jmenuBarTipoListaPrecio,jmenuBarDetalleTipoListaPrecio,jTtoolBarTipoListaPrecio,jTtoolBarDetalleTipoListaPrecio);
						
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
	
	public void finishProcessTipoListaPrecio() {// throws Exception 
		this.finishProcessTipoListaPrecio(true);
	}
	
	public void finishProcessTipoListaPrecio(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoListaPrecio ,this.jPanelParametrosReportesTipoListaPrecio, this.jScrollPanelDatosTipoListaPrecio,this.jPanelPaginacionTipoListaPrecio, this.jScrollPanelDatosEdicionTipoListaPrecio, this.jPanelAccionesTipoListaPrecio,this.jPanelAccionesFormularioTipoListaPrecio,this.jmenuBarTipoListaPrecio,this.jmenuBarDetalleTipoListaPrecio,this.jTtoolBarTipoListaPrecio,this.jTtoolBarDetalleTipoListaPrecio);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoListaPrecio=this.jTabbedPaneBusquedasTipoListaPrecio; 
		
		final JPanel jPanelParametrosReportesTipoListaPrecio=this.jPanelParametrosReportesTipoListaPrecio;
		//final JScrollPane jScrollPanelDatosTipoListaPrecio=this.jScrollPanelDatosTipoListaPrecio;
		final JTable jTableDatosTipoListaPrecio=this.jTableDatosTipoListaPrecio;		
		final JPanel jPanelPaginacionTipoListaPrecio=this.jPanelPaginacionTipoListaPrecio;
		//final JScrollPane jScrollPanelDatosEdicionTipoListaPrecio=this.jScrollPanelDatosEdicionTipoListaPrecio;
		final JPanel jPanelAccionesTipoListaPrecio=this.jPanelAccionesTipoListaPrecio;
		
		JPanel jPanelCamposAuxiliarTipoListaPrecio=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoListaPrecio=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			jPanelCamposAuxiliarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jPanelCamposTipoListaPrecio;
			jPanelAccionesFormularioAuxiliarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jPanelAccionesFormularioTipoListaPrecio;
		}
		
		final JPanel jPanelCamposTipoListaPrecio=jPanelCamposAuxiliarTipoListaPrecio;
		final JPanel jPanelAccionesFormularioTipoListaPrecio=jPanelAccionesFormularioAuxiliarTipoListaPrecio;
		
		
		final JMenuBar jmenuBarTipoListaPrecio=this.jmenuBarTipoListaPrecio;		
		final JToolBar jTtoolBarTipoListaPrecio=this.jTtoolBarTipoListaPrecio;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoListaPrecio=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoListaPrecio=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			jmenuBarDetalleAuxiliarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jmenuBarDetalleTipoListaPrecio;
			jTtoolBarDetalleAuxiliarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jTtoolBarDetalleTipoListaPrecio;		
		}
		
		final JMenuBar jmenuBarDetalleTipoListaPrecio=jmenuBarDetalleAuxiliarTipoListaPrecio;
		final JToolBar jTtoolBarDetalleTipoListaPrecio=jTtoolBarDetalleAuxiliarTipoListaPrecio;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoListaPrecio;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoListaPrecio;
			processRunnable.jTableDatos=jTableDatosTipoListaPrecio;
			processRunnable.jPanelCampos=jPanelCamposTipoListaPrecio;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoListaPrecio;
			processRunnable.jPanelAcciones=jPanelAccionesTipoListaPrecio;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoListaPrecio;
			
			
			processRunnable.jmenuBar=jmenuBarTipoListaPrecio;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoListaPrecio;
			processRunnable.jTtoolBar=jTtoolBarTipoListaPrecio;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoListaPrecio;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoListaPrecio ,jPanelParametrosReportesTipoListaPrecio, jTableDatosTipoListaPrecio,/*jScrollPanelDatosTipoListaPrecio,*/jPanelCamposTipoListaPrecio,jPanelPaginacionTipoListaPrecio, /*jScrollPanelDatosEdicionTipoListaPrecio,*/ jPanelAccionesTipoListaPrecio,jPanelAccionesFormularioTipoListaPrecio,jmenuBarTipoListaPrecio,jmenuBarDetalleTipoListaPrecio,jTtoolBarTipoListaPrecio,jTtoolBarDetalleTipoListaPrecio));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoListaPrecio(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoListaPrecio(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoListaPrecio(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoListaPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoListaPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoListaPrecio,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoListaPrecio(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoListaPrecio,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoListaPrecio,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipolistaprecioConstantesFunciones.getsFinalQueryTipoListaPrecio();
		String  finalQueryPaginacionTodos=this.tipolistaprecioConstantesFunciones.getsFinalQueryTipoListaPrecio();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoListaPrecioConstantesFunciones.getArrayColumnasGlobalesNoTipoListaPrecio(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoListaPrecioConstantesFunciones.getArrayColumnasGlobalesTipoListaPrecio(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoListaPrecioConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipolistapreciosEliminados= new ArrayList<TipoListaPrecio>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoListaPrecio();
		
				///*TipoListaPrecioSessionBean*/this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
			
			if(this.tipolistaprecioSessionBean==null) {
				this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
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
					this.iNumeroPaginacion=TipoListaPrecioConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoListaPrecioConstantesFunciones.getClassesForeignKeysOfTipoListaPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipolistaprecio."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipolistapreciosAux= new ArrayList<TipoListaPrecio>();
			
				
			tipolistaprecioLogic.setDatosCliente(this.datosCliente);
			tipolistaprecioLogic.setDatosDeep(this.datosDeep);
			tipolistaprecioLogic.setIsConDeep(true);
			
			
			tipolistaprecioLogic.getTipoListaPrecioDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipolistaprecioLogic.getTodosTipoListaPrecios(finalQueryGlobal,pagination);
					
					//tipolistaprecioLogic.getTodosTipoListaPreciosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipolistaprecioLogic.getTipoListaPrecios()==null|| tipolistaprecioLogic.getTipoListaPrecios().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolistapreciosAux= new ArrayList<TipoListaPrecio>();
							tipolistapreciosAux.addAll(tipolistaprecioLogic.getTipoListaPrecios());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolistapreciosAux= new ArrayList<TipoListaPrecio>();
							tipolistapreciosAux.addAll(tipolistaprecios);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolistaprecioLogic.getTodosTipoListaPrecios(finalQueryGlobal+"",this.pagination);												
							
							//tipolistaprecioLogic.getTodosTipoListaPreciosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoListaPrecios("Todos",tipolistaprecioLogic.getTipoListaPrecios() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipolistaprecioLogic.setTipoListaPrecios(new ArrayList<TipoListaPrecio>());					
							tipolistaprecioLogic.getTipoListaPrecios().addAll(tipolistapreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolistaprecios=new ArrayList<TipoListaPrecio>();
							tipolistaprecios.addAll(tipolistapreciosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoListaPrecio=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoListaPrecio=this.idActual;
				
				} else if(this.idTipoListaPrecioActual!=null && this.idTipoListaPrecioActual!=0L) {
					idTipoListaPrecio=idTipoListaPrecioActual;
				}
				
					
				this.sDetalleReporte=TipoListaPrecioConstantesFunciones.getDetalleIndicePorId(idTipoListaPrecio);
				
				this.tipolistaprecios=new ArrayList<TipoListaPrecio>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipolistaprecioLogic.getEntity(idTipoListaPrecio);
					
					//tipolistaprecioLogic.getEntityWithConnection(idTipoListaPrecio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolistaprecioLogic.setTipoListaPrecios(new ArrayList<TipoListaPrecio>());
					tipolistaprecioLogic.getTipoListaPrecios().add(tipolistaprecioLogic.getTipoListaPrecio());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolistaprecios=new ArrayList<TipoListaPrecio>();
					this.tipolistaprecios.add(tipolistaprecio);
				}
				
				if(tipolistaprecioLogic.getTipoListaPrecio()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TipoListaPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipolistaprecioLogic.getTipoListaPreciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoListaPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoListaPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipolistaprecioLogic.getTipoListaPrecios()==null||tipolistaprecioLogic.getTipoListaPrecios().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipolistaprecios==null|| tipolistaprecios.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolistapreciosAux=new ArrayList<TipoListaPrecio>();
						tipolistapreciosAux.addAll(tipolistaprecioLogic.getTipoListaPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolistapreciosAux=new ArrayList<TipoListaPrecio>();
							tipolistapreciosAux.addAll(tipolistaprecios);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipolistaprecioLogic.getTipoListaPreciosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoListaPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoListaPrecioConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoListaPrecios("FK_IdEmpresa",tipolistaprecioLogic.getTipoListaPrecios());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoListaPrecios("FK_IdEmpresa",tipolistaprecios);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolistaprecioLogic.setTipoListaPrecios(new ArrayList<TipoListaPrecio>());
						tipolistaprecioLogic.getTipoListaPrecios().addAll(tipolistapreciosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolistaprecios=new ArrayList<TipoListaPrecio>();
							tipolistaprecios.addAll(tipolistapreciosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoListaPrecio();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoListaPrecio();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipolistaprecioLogic.getTipoListaPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolistaprecios.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipolistaprecioLogic.getTipoListaPrecios().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipolistaprecios.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoListaPrecio tipolistaprecio) {
		Boolean permite=true;
		
		if(this.tipolistaprecio.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoListaPrecioConstantesFunciones.getOrderByListaTipoListaPrecio();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoListaPrecioConstantesFunciones.getOrderByListaTipoListaPrecio();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoListaPrecio tipolistaprecio:tipolistaprecioLogic.getTipoListaPrecios()) {
				if(tipolistaprecio.getsType().equals(Constantes2.S_TOTALES)) {
					tipolistaprecioTotales=tipolistaprecio;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoListaPrecio tipolistaprecio:this.tipolistaprecios) {
				if(tipolistaprecio.getsType().equals(Constantes2.S_TOTALES)) {
					tipolistaprecioTotales=tipolistaprecio;
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
			this.tipolistaprecioAux=new TipoListaPrecio();
			this.tipolistaprecioAux.setsType(Constantes2.S_TOTALES);
			this.tipolistaprecioAux.setIsNew(false);
			this.tipolistaprecioAux.setIsChanged(false);
			this.tipolistaprecioAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoListaPrecioConstantesFunciones.TotalizarValoresFilaTipoListaPrecio(this.tipolistaprecioLogic.getTipoListaPrecios(),this.tipolistaprecioAux);
				
				this.tipolistaprecioLogic.getTipoListaPrecios().add(this.tipolistaprecioAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoListaPrecioConstantesFunciones.TotalizarValoresFilaTipoListaPrecio(this.tipolistaprecios,this.tipolistaprecioAux);
				
				this.tipolistaprecios.add(this.tipolistaprecioAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipolistaprecioTotales=new TipoListaPrecio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipolistaprecioLogic.getTipoListaPrecios().remove(tipolistaprecioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipolistaprecios.remove(tipolistaprecioTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipolistaprecioTotales=new TipoListaPrecio();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoListaPrecio tipolistaprecio:tipolistaprecioLogic.getTipoListaPrecios()) {
				if(tipolistaprecio.getsType().equals(Constantes2.S_TOTALES)) {
					tipolistaprecioTotales=tipolistaprecio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoListaPrecioConstantesFunciones.TotalizarValoresFilaTipoListaPrecio(this.tipolistaprecioLogic.getTipoListaPrecios(),tipolistaprecioTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoListaPrecio tipolistaprecio:this.tipolistaprecios) {
				if(tipolistaprecio.getsType().equals(Constantes2.S_TOTALES)) {
					tipolistaprecioTotales=tipolistaprecio;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoListaPrecioConstantesFunciones.TotalizarValoresFilaTipoListaPrecio(this.tipolistaprecios,tipolistaprecioTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoListaPreciosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTipoListaPreciosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolistaprecioLogic.getTipoListaPreciosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosTipoListaPrecio() {
		this.isPermisoTodoTipoListaPrecio=false;
		this.isPermisoNuevoTipoListaPrecio=false;
		this.isPermisoActualizarTipoListaPrecio=false;
		this.isPermisoActualizarOriginalTipoListaPrecio=false;
		this.isPermisoEliminarTipoListaPrecio=false;
		this.isPermisoGuardarCambiosTipoListaPrecio=false;
		this.isPermisoConsultaTipoListaPrecio=false;
		this.isPermisoBusquedaTipoListaPrecio=false;
		this.isPermisoReporteTipoListaPrecio=false;		
		this.isPermisoOrdenTipoListaPrecio=false;		
		this.isPermisoPaginacionMedioTipoListaPrecio=false;		
		this.isPermisoPaginacionAltoTipoListaPrecio=false;
		this.isPermisoPaginacionTodoTipoListaPrecio=false;
		this.isPermisoCopiarTipoListaPrecio=false;		
		this.isPermisoVerFormTipoListaPrecio=false;		
		this.isPermisoDuplicarTipoListaPrecio=false;		
		this.isPermisoOrdenTipoListaPrecio=false;		
	}
	
	public void setPermisosUsuarioTipoListaPrecio(Boolean isPermiso) {
		this.isPermisoTodoTipoListaPrecio=isPermiso;
		this.isPermisoNuevoTipoListaPrecio=isPermiso;
		this.isPermisoActualizarTipoListaPrecio=isPermiso;
		this.isPermisoActualizarOriginalTipoListaPrecio=isPermiso;
		this.isPermisoEliminarTipoListaPrecio=isPermiso;
		this.isPermisoGuardarCambiosTipoListaPrecio=isPermiso;
		this.isPermisoConsultaTipoListaPrecio=isPermiso;
		this.isPermisoBusquedaTipoListaPrecio=isPermiso;
		this.isPermisoReporteTipoListaPrecio=isPermiso;
		this.isPermisoOrdenTipoListaPrecio=isPermiso;		
		this.isPermisoPaginacionMedioTipoListaPrecio=isPermiso;		
		this.isPermisoPaginacionAltoTipoListaPrecio=isPermiso;		
		this.isPermisoPaginacionTodoTipoListaPrecio=isPermiso;		
		this.isPermisoCopiarTipoListaPrecio=isPermiso;		
		this.isPermisoVerFormTipoListaPrecio=isPermiso;		
		this.isPermisoDuplicarTipoListaPrecio=isPermiso;
		this.isPermisoOrdenTipoListaPrecio=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoListaPrecio(Boolean isPermiso) {
		//this.isPermisoTodoTipoListaPrecio=isPermiso;
		this.isPermisoNuevoTipoListaPrecio=isPermiso;
		this.isPermisoActualizarTipoListaPrecio=isPermiso;
		this.isPermisoActualizarOriginalTipoListaPrecio=isPermiso;
		this.isPermisoEliminarTipoListaPrecio=isPermiso;
		this.isPermisoGuardarCambiosTipoListaPrecio=isPermiso;
		//this.isPermisoConsultaTipoListaPrecio=isPermiso;
		//this.isPermisoBusquedaTipoListaPrecio=isPermiso;
		//this.isPermisoReporteTipoListaPrecio=isPermiso;
		//this.isPermisoOrdenTipoListaPrecio=isPermiso;		
		//this.isPermisoPaginacionMedioTipoListaPrecio=isPermiso;		
		//this.isPermisoPaginacionAltoTipoListaPrecio=isPermiso;		
		//this.isPermisoPaginacionTodoTipoListaPrecio=isPermiso;		
		//this.isPermisoCopiarTipoListaPrecio=isPermiso;		
		//this.isPermisoDuplicarTipoListaPrecio=isPermiso;
		//this.isPermisoOrdenTipoListaPrecio=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoListaPrecioClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
		if(TipoListaPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
		this.isTienePermisosCliente=this.verificarGetPermisosUsuarioOpcionTipoListaPrecioClaseRelacionada(this.opcionsRelacionadas,ClienteConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosParametroCarteraDefecto=false;
		this.isTienePermisosParametroCarteraDefecto=this.verificarGetPermisosUsuarioOpcionTipoListaPrecioClaseRelacionada(this.opcionsRelacionadas,ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoListaPrecio(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoListaPrecioClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosCliente=conPermiso;
		this.isTienePermisosParametroCarteraDefecto=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoListaPrecioClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoListaPrecioClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoListaPrecioClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosCliente && this.jInternalFrameDetalleFormTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.remove(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosParametroCarteraDefecto && this.jInternalFrameDetalleFormTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.remove(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoListaPrecio() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoListaPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoListaPrecioConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoListaPrecio=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoListaPrecio=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoListaPrecio=this.isPermisoActualizarTipoListaPrecio;
			this.isPermisoEliminarTipoListaPrecio=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoListaPrecio=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoListaPrecio=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoListaPrecio=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoListaPrecio=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoListaPrecio=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoListaPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoListaPrecio=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoListaPrecio=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoListaPrecio=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoListaPrecio=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoListaPrecio=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoListaPrecio=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoListaPrecio=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoListaPrecio.setToolTipText(this.jTableDatosTipoListaPrecio.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoListaPrecio(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoListaPrecio(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoListaPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoListaPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoListaPrecio() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosCliente && this.tipolistaprecioConstantesFunciones.mostrarClienteTipoListaPrecio && !TipoListaPrecioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Cliente");
			reporte.setsDescripcion("Cliente");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosParametroCarteraDefecto && this.tipolistaprecioConstantesFunciones.mostrarParametroCarteraDefectoTipoListaPrecio && !TipoListaPrecioConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Parametro Cartera Defecto");
			reporte.setsDescripcion("Parametro Cartera Defecto");
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
	public void inicializarCombosForeignKeyTipoListaPrecioListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoListaPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoListaPrecioJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoListaPrecioListas(false);
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
	
	public void cargarCombosLoteForeignKeyTipoListaPrecioListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TipoListaPrecioParameterReturnGeneral tipolistaprecioReturnGeneral=new TipoListaPrecioParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.tipolistaprecioConstantesFunciones.cargarid_empresaTipoListaPrecio)
					 || (this.esRecargarFks && this.tipolistaprecioConstantesFunciones.cargarid_empresaTipoListaPrecio)) {

					if(!this.tipolistaprecioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+tipolistaprecioSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				tipolistaprecioReturnGeneral=tipolistaprecioLogic.cargarCombosLoteForeignKeyTipoListaPrecio(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=tipolistaprecioReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoListaPrecio()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.tipolistaprecioSessionBean==null) {
				this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
			}

			if(!this.tipolistaprecioSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyTipoListaPrecio()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoListaPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoListaPrecio()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.tipolistaprecio.setfecha_desde(this.parametroGeneralUsuario.getfecha_sistema());
				this.tipolistaprecio.setfecha_hasta(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoListaPrecio();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoListaPrecio(TipoListaPrecio tipolistaprecio)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoListaPrecio(TipoListaPrecio tipolistaprecio,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoListaPrecio()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoListaPrecio()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoListaPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoListaPrecio()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoListaPrecio()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoListaPrecio()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoListaPrecio(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoListaPrecio()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.getItemCount()>0) {
				this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public TipoListaPrecioBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoListaPrecioBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoListaPrecioBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean(); 
		this.tipolistaprecioConstantesFunciones=new TipoListaPrecioConstantesFunciones(); 
		this.tipolistaprecioBean=new TipoListaPrecio();//(this.tipolistaprecioConstantesFunciones); 		
		this.tipolistaprecioReturnGeneral=new TipoListaPrecioParameterReturnGeneral(); 
		
		this.tipolistaprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipolistaprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoListaPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoListaPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoListaPrecioBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoListaPrecio(true);
			
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
			
			this.tipolistaprecioConstantesFunciones=new TipoListaPrecioConstantesFunciones(); 
			this.tipolistaprecioBean=new TipoListaPrecio();//this.tipolistaprecioConstantesFunciones); 			
			this.tipolistaprecioReturnGeneral=new TipoListaPrecioParameterReturnGeneral(); 
		
			TipoListaPrecioBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Lista Precio Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipolistaprecio=new TipoListaPrecio();
			this.tipolistaprecios = new ArrayList<TipoListaPrecio>();
			this.tipolistapreciosAux = new ArrayList<TipoListaPrecio>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic=new TipoListaPrecioLogic();
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}
			
			//this.tipolistaprecioSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipolistaprecioSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoListaPrecio);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoListaPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoListaPrecio);	
					}
					
					if(this.jInternalFrameImportacionTipoListaPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoListaPrecio);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoListaPrecio!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoListaPrecio);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoListaPrecio);
				this.jInternalFrameDetalleFormTipoListaPrecio.setVisible(false);
				this.jInternalFrameDetalleFormTipoListaPrecio.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoListaPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoListaPrecio);
					this.jInternalFrameReporteDinamicoTipoListaPrecio.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoListaPrecio.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoListaPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoListaPrecio);
					this.jInternalFrameImportacionTipoListaPrecio.setVisible(false);
					this.jInternalFrameImportacionTipoListaPrecio.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoListaPrecio!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoListaPrecio);
					this.jInternalFrameOrderByTipoListaPrecio.setVisible(false);
					this.jInternalFrameOrderByTipoListaPrecio.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoListaPrecioActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoListaPrecioConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipolistaprecioReturnGeneral=new TipoListaPrecioParameterReturnGeneral();
			
			this.tipolistaprecioParameterGeneral=new TipoListaPrecioParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipolistaprecioLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoListaPrecioJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ClienteConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ParametroCarteraDefectoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoListaPrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipolistaprecioSessionBean.getEsGuardarRelacionado(),this.tipolistaprecioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoListaPrecioConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipolistaprecioSessionBean.getEsGuardarRelacionado(),this.tipolistaprecioSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoListaPrecio=false;
			this.isVisibilidadCeldaDuplicarTipoListaPrecio=true;
			this.isVisibilidadCeldaCopiarTipoListaPrecio=true;
			this.isVisibilidadCeldaVerFormTipoListaPrecio=true;
			this.isVisibilidadCeldaOrdenTipoListaPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;
			this.isVisibilidadCeldaModificarTipoListaPrecio=false;
			this.isVisibilidadCeldaActualizarTipoListaPrecio=false;
			this.isVisibilidadCeldaEliminarTipoListaPrecio=false;
			this.isVisibilidadCeldaCancelarTipoListaPrecio=false;
			this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoListaPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoListaPrecio();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoListaPrecio(false);
			
			this.setPermisosUsuarioTipoListaPrecio();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado() 
				|| (this.tipolistaprecioSessionBean.getEsGuardarRelacionado() && this.tipolistaprecioSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoListaPrecioClasesRelacionadas();
			}
			
			if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoListaPrecioClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoListaPrecio();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoListaPrecio();
			}
			
			if(!this.isPermisoBusquedaTipoListaPrecio) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoListaPrecio,this.isPermisoPaginacionMedioTipoListaPrecio,this.isPermisoPaginacionTodoTipoListaPrecio);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoListaPrecioConstantesFunciones.getTiposSeleccionarTipoListaPrecio());
				
				this.tiposColumnasSelect=TipoListaPrecioConstantesFunciones.getTiposSeleccionarTipoListaPrecio(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoListaPrecio();				
				//this.tiposRelacionesSelect=TipoListaPrecioConstantesFunciones.getTiposRelacionesTipoListaPrecio(true);
				
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
			//if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoListaPrecio();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTipoListaPrecio(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTipoListaPrecio(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoListaPrecio() ;
			
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
			this.parametrocarteradefectoLogic=new ParametroCarteraDefectoLogic(); 
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
				tipolistaprecioImplementable= (TipoListaPrecioImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoListaPrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipolistaprecioImplementableHome= (TipoListaPrecioImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoListaPrecioConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipolistaprecios= new ArrayList<TipoListaPrecio>();
			this.tipolistapreciosEliminados= new ArrayList<TipoListaPrecio>();
						
			this.isEsNuevoTipoListaPrecio=false;
			this.esParaAccionDesdeFormularioTipoListaPrecio=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoListaPrecio(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoListaPrecio();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoListaPrecioBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoListaPrecioConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoListaPrecio("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoListaPrecio(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoListaPrecio();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoListaPrecio();
			}
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoListaPrecio.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoListaPrecio.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoListaPrecio.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoListaPrecio(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoListaPrecio: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoListaPrecio() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoListaPrecio")) {
				iIndex=this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();	
				
				

				if(sTitle.equals("Clientes")) {
					if(!ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoListaPrecio();

						this.cargarParteTabPanelRelacionadaCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Parametro Cartera Defectos")) {
					if(!ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoListaPrecio();

						this.cargarParteTabPanelRelacionadaParametroCarteraDefecto(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoListaPrecio();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoListaPrecio.cargarSessionConBeanSwingJInternalFrameCliente(false,true,iIndex);
		this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaCliente();

		//this.jTabbedPaneRelacionesTipoListaPrecio.updateUI();
		//this.jTabbedPaneRelacionesTipoListaPrecio.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoListaPrecio.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaParametroCarteraDefecto(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoListaPrecio.cargarSessionConBeanSwingJInternalFrameParametroCarteraDefecto(false,true,iIndex);
		this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();

		//this.jTabbedPaneRelacionesTipoListaPrecio.updateUI();
		//this.jTabbedPaneRelacionesTipoListaPrecio.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoListaPrecio.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Cliente")) {
				int row=this.jTableDatosTipoListaPrecio.getSelectedRow();
				jButtonClienteActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ParametroCarteraDefecto")) {
				int row=this.jTableDatosTipoListaPrecio.getSelectedRow();
				jButtonParametroCarteraDefectoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Cliente")) {

					if(this.isTienePermisosCliente && this.tipolistaprecioConstantesFunciones.mostrarClienteTipoListaPrecio && !TipoListaPrecioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Clientes"+"("+ClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Clientes");

						if(tipolistaprecioConstantesFunciones.resaltarClienteTipoListaPrecio!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipolistaprecioConstantesFunciones.resaltarClienteTipoListaPrecio);
						}

						jmenuItem.setEnabled(this.tipolistaprecioConstantesFunciones.activarClienteTipoListaPrecio);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Cliente"));

						

						this.jInternalFrameDetalleFormTipoListaPrecio.jmenuDetalleTipoListaPrecio.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Parametro Cartera Defecto")) {

					if(this.isTienePermisosParametroCarteraDefecto && this.tipolistaprecioConstantesFunciones.mostrarParametroCarteraDefectoTipoListaPrecio && !TipoListaPrecioConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Parametro Cartera Defectos"+"("+ParametroCarteraDefectoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Parametro Cartera Defectos");

						if(tipolistaprecioConstantesFunciones.resaltarParametroCarteraDefectoTipoListaPrecio!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipolistaprecioConstantesFunciones.resaltarParametroCarteraDefectoTipoListaPrecio);
						}

						jmenuItem.setEnabled(this.tipolistaprecioConstantesFunciones.activarParametroCarteraDefectoTipoListaPrecio);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ParametroCarteraDefecto"));

						

						this.jInternalFrameDetalleFormTipoListaPrecio.jmenuDetalleTipoListaPrecio.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoListaPrecio(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoListaPrecio(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoListaPrecio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoListaPrecioListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoListaPrecio();
		
		this.cargarCombosFrameForeignKeyTipoListaPrecio();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoListaPrecio();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoListaPrecio();
		}
	}
	
	
	
	public void jButtonNuevoTipoListaPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
			
			if(jTableDatosTipoListaPrecio.getRowCount()>=1) {
				jTableDatosTipoListaPrecio.removeRowSelectionInterval(0, jTableDatosTipoListaPrecio.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoListaPrecio=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoListaPrecio(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoListaPrecio(true);			
			//this.tipolistaprecio=new TipoListaPrecio();
			//this.tipolistaprecio.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoListaPrecio(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoListaPrecio() ;
			
			if(TipoListaPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoListaPrecio(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipolistaprecio);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);				
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
			if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoListaPrecio: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoListaPrecioActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoListaPrecio.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoListaPrecio.getSelectedRows().length;			
			}
			
			tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoListaPrecio--;			
				//TipoListaPrecio tipolistaprecioAux= new TipoListaPrecio();			
				//tipolistaprecioAux.setId(this.iIdNuevoTipoListaPrecio);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoListaPrecio tipolistaprecioOrigen=new TipoListaPrecio();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoListaPrecio tipolistaprecioOrigen : tipolistapreciosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipolistaprecioOrigen =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipolistaprecioOrigen =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoListaPrecio();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipolistaprecio.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoListaPrecio(tipolistaprecioOrigen,this.tipolistaprecio,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipolistaprecioLogic.getTipoListaPrecios().add(this.tipolistaprecioAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipolistaprecios.add(this.tipolistaprecioAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoListaPrecio(false);
				
				this.jTableDatosTipoListaPrecio.setRowSelectionInterval(this.getIndiceNuevoTipoListaPrecio(), this.getIndiceNuevoTipoListaPrecio());
				
				int iLastRow =  this.jTableDatosTipoListaPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoListaPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoListaPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoListaPrecio(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();									
		
			TipoListaPrecio tipolistaprecioOrigen=new TipoListaPrecio();
			TipoListaPrecio tipolistaprecioDestino=new TipoListaPrecio();
				
			tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoListaPrecio.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipolistapreciosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoListaPrecio.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolistaprecioOrigen =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipolistaprecioOrigen =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipolistaprecioDestino =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipolistaprecioDestino =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipolistaprecioOrigen =tipolistapreciosSeleccionados.get(0);
				tipolistaprecioDestino =tipolistapreciosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoListaPrecio(tipolistaprecioOrigen,tipolistaprecioDestino,true,false);
				
				tipolistaprecioDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipolistaprecioDestino,tipolistaprecioLogic.getTipoListaPrecios());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipolistaprecioDestino,tipolistaprecios);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoListaPrecio(false);
				
				//this.jTableDatosTipoListaPrecio.setRowSelectionInterval(this.getIndiceNuevoTipoListaPrecio(), this.getIndiceNuevoTipoListaPrecio());
				
				int iLastRow =  this.jTableDatosTipoListaPrecio.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoListaPrecio.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoListaPrecio.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoListaPrecio(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoListaPrecio.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoListaPrecio.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoListaPrecio.setVisible(!isVisible);
			this.jPanelPaginacionTipoListaPrecio.setVisible(!isVisible);
			this.jPanelAccionesTipoListaPrecio.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoListaPrecio();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoListaPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoListaPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoListaPrecio();
			
			this.abrirFrameOrderByTipoListaPrecio();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoListaPrecio();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoListaPrecio(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoListaPrecio);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoListaPrecio.isMaximum()) {
					this.jInternalFrameDetalleFormTipoListaPrecio.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoListaPrecio.setSize(this.jInternalFrameDetalleFormTipoListaPrecio.iWidthFormulario,this.jInternalFrameDetalleFormTipoListaPrecio.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoListaPrecio.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoListaPrecio.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoListaPrecio.isMaximum()) {
						this.jInternalFrameDetalleFormTipoListaPrecio.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoListaPrecio.jContentPaneDetalleTipoListaPrecio.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoListaPrecio.jContentPaneDetalleTipoListaPrecio.getWidth(),TipoListaPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoListaPrecio.jContentPaneDetalleTipoListaPrecio.getWidth(),TipoListaPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoListaPrecio.jContentPaneDetalleTipoListaPrecio.getWidth(),TipoListaPrecioConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaCliente();
					}

					if(ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaParametroCarteraDefecto();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoListaPrecio.setVisible(true);
	        this.jInternalFrameDetalleFormTipoListaPrecio.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoListaPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoListaPrecio==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoListaPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoListaPrecio,false,this);
				} else {
					this.jInternalFrameOrderByTipoListaPrecio=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoListaPrecio,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoListaPrecio);
				this.jInternalFrameOrderByTipoListaPrecio.setVisible(false);
				this.jInternalFrameOrderByTipoListaPrecio.setSelected(false);
				
				this.jInternalFrameOrderByTipoListaPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoListaPrecio"));
				
				this.inicializarActualizarBindingTablaOrderByTipoListaPrecio();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoListaPrecio() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoListaPrecio==null) {
				
				this.jInternalFrameImportacionTipoListaPrecio=new ImportacionJInternalFrame(TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoListaPrecio);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoListaPrecio);
				this.jInternalFrameImportacionTipoListaPrecio.setVisible(false);
				this.jInternalFrameImportacionTipoListaPrecio.setSelected(false);


				this.jInternalFrameImportacionTipoListaPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoListaPrecio"));
				this.jInternalFrameImportacionTipoListaPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoListaPrecio"));
				this.jInternalFrameImportacionTipoListaPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoListaPrecio"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoListaPrecio() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoListaPrecio==null) {
				this.jInternalFrameReporteDinamicoTipoListaPrecio=new ReporteDinamicoJInternalFrame(TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoListaPrecio);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoListaPrecio);
				this.jInternalFrameReporteDinamicoTipoListaPrecio.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoListaPrecio.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoListaPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoListaPrecio"));
				this.jInternalFrameReporteDinamicoTipoListaPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoListaPrecio"));
				this.jInternalFrameReporteDinamicoTipoListaPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoListaPrecio"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoListaPrecio();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoListaPrecio.jContentPaneDetalleTipoListaPrecio.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaParametroCarteraDefecto() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoListaPrecio.jContentPaneDetalleTipoListaPrecio.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoListaPrecio() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoListaPrecio);
			
	       	this.jInternalFrameDetalleFormTipoListaPrecio.setVisible(false);
	        this.jInternalFrameDetalleFormTipoListaPrecio.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoListaPrecio.dispose();
			//this.jInternalFrameDetalleFormTipoListaPrecio=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoListaPrecio() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoListaPrecio.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoListaPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoListaPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoListaPrecio.setVisible(true);
	        this.jInternalFrameImportacionTipoListaPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoListaPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoListaPrecio.setVisible(true);
	        this.jInternalFrameOrderByTipoListaPrecio.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoListaPrecio() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoListaPrecio.setVisible(false);
	        this.jInternalFrameOrderByTipoListaPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoListaPrecio() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoListaPrecio.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoListaPrecio.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoListaPrecio() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoListaPrecio.setVisible(false);
	        this.jInternalFrameImportacionTipoListaPrecio.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoListaPrecio(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoListaPrecio(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoListaPrecio(true);
			//this.isEsNuevoTipoListaPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoListaPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoListaPrecio(false) ;
			
			if(tipolistaprecioSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado() && ClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonClienteActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado() && ParametroCarteraDefectoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonParametroCarteraDefectoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoListaPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoListaPrecio(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoListaPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoListaPrecioActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoListaPrecio(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoListaPrecio(true);
			//this.isEsNuevoTipoListaPrecio=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipolistaprecio.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoListaPrecio("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoListaPrecio(false) ;
			
			if(TipoListaPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoListaPrecio(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoListaPrecio(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoListaPrecio(false);
			
			//if(!this.isEsNuevoTipoListaPrecio) {								
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				
			}
			
			if(this.permiteMantenimiento(this.tipolistaprecio)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoListaPrecio=true;
					this.inicializarActualizarBindingTablaTipoListaPrecio(false);
					this.isEsNuevoTipoListaPrecio=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoListaPrecio=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoListaPrecio=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoListaPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoListaPrecio(false);
				
				this.habilitarDeshabilitarControlesTipoListaPrecio(false);
			
												
				
				if(TipoListaPrecioJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoListaPrecio();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoListaPrecioActionPerformed(evt,tipolistaprecioSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoListaPrecio(this.tipolistaprecio,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoListaPrecio.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipolistaprecioSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipolistaprecio.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				this.tipolistaprecio.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				this.tipolistaprecio.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipolistaprecio)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoListaPrecioModel) this.jTableDatosTipoListaPrecio.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoListaPrecio=true;
				this.inicializarActualizarBindingTablaTipoListaPrecio(false);
				this.isEsNuevoTipoListaPrecio=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoListaPrecio(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoListaPrecio(false);
				
				this.habilitarDeshabilitarControlesTipoListaPrecio(false);
				
				
				
				if(TipoListaPrecioJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoListaPrecio();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoListaPrecio.getRowCount()>=1) {
				jTableDatosTipoListaPrecio.removeRowSelectionInterval(0, jTableDatosTipoListaPrecio.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoListaPrecio(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoListaPrecio(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoListaPrecio(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoListaPrecio(false) ;
			
			this.isEsNuevoTipoListaPrecio=false;
			
			if(TipoListaPrecioJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoListaPrecio();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoListaPrecio(false);
				
				//SI ES MANUAL
				if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoListaPrecio();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoListaPrecio--;			
			//TipoListaPrecio tipolistaprecioAux= new TipoListaPrecio();			
			//tipolistaprecioAux.setId(this.iIdNuevoTipoListaPrecio);
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoListaPrecio();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
			
			this.tipolistaprecio.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipolistaprecioLogic.getTipoListaPrecios().add(this.tipolistaprecioAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipolistaprecios.add(this.tipolistaprecioAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoListaPrecio(false);
			
			this.jTableDatosTipoListaPrecio.setRowSelectionInterval(this.getIndiceNuevoTipoListaPrecio(), this.getIndiceNuevoTipoListaPrecio());
			
			int iLastRow =  this.jTableDatosTipoListaPrecio.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoListaPrecio.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoListaPrecio.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoListaPrecio(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoListaPrecio(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoListaPrecio(false);
			
			//SI ES MANUAL
			if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoListaPrecio();
			}
			
			//this.abrirFrameTreeTipoListaPrecio();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Lista PrecioES ?", "MANTENIMIENTO DE Tipo Lista Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoListaPrecio.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoListaPrecio();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipolistaprecioReturnGeneral=tipolistaprecioLogic.procesarImportacionTipoListaPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipolistaprecioParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoListaPrecioReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoListaPrecio.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoListaPrecio.setFileImportacion(this.jInternalFrameImportacionTipoListaPrecio.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoListaPrecio.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoListaPrecio.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoListaPrecio.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoListaPrecio.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();		

		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoListaPrecioBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoListaPrecioBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoListaPrecios("Todos",tipolistapreciosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoListaPrecioConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoListaPrecioConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaDesde_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaDesde_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaDesde_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaDesde_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaHasta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaHasta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaHasta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaHasta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoTipoListaPrecio.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE:
					sNombreCampoCategoria="fecha_desde";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA:
					sNombreCampoCategoria="fecha_hasta";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE:
					sNombreCampoCategoriaValor="fecha_desde";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA:
					sNombreCampoCategoriaValor="fecha_hasta";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Desde",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_desde");
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Hasta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_hasta");
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();		
		
		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolistaprecio";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoListaPrecios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TipoListaPrecio tipolistaprecio:tipolistapreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolistaprecio.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoListaPrecio tipolistaprecio:tipolistapreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolistaprecio.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoListaPrecio tipolistaprecio:tipolistapreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolistaprecio.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE);
					iRow++;

					for(TipoListaPrecio tipolistaprecio:tipolistapreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolistaprecio.getfecha_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA);
					iRow++;

					for(TipoListaPrecio tipolistaprecio:tipolistapreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolistaprecio.getfecha_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(TipoListaPrecio tipolistaprecio:tipolistapreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolistaprecio.getesta_activo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TipoListaPrecio tipolistaprecio:tipolistapreciosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipolistaprecio.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelTipoListaPrecio(row);				
			//	iRow++;
			//}				
			
			//for(TipoListaPrecio tipolistaprecioAux:tipolistapreciosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoListaPrecio(tipolistaprecioAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoListaPrecio(false);
			
			//SI ES MANUAL
			if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoListaPrecio();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoListaPrecio(false);
			
			//SI ES MANUAL
			if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoListaPrecio();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoListaPrecio(false);
			
			//SI ES MANUAL
			if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoListaPrecio();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoListaPrecio() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoListaPrecio.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoListaPrecio.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoListaPrecio.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoListaPrecio.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoListaPrecio.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoListaPrecio.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoListaPrecio.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoListaPrecio(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoListaPrecio(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoListaPrecio(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoListaPrecio(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoListaPrecio(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoListaPrecio(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoListaPrecio(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoListaPrecio(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoListaPrecio() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoListaPrecio();
		
		this.inicializarActualizarBindingBotonesManualTipoListaPrecio(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoListaPrecio();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoListaPrecio() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoListaPrecio(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoListaPrecio(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoListaPrecio.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoListaPrecio.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoListaPrecio.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxPostAccionNuevoTipoListaPrecio.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxPostAccionSinCerrarTipoListaPrecio.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxPostAccionSinMensajeTipoListaPrecio.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoListaPrecio.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoListaPrecio.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoListaPrecio.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
				this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxPostAccionNuevoTipoListaPrecio.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxPostAccionSinCerrarTipoListaPrecio.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxPostAccionSinMensajeTipoListaPrecio.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoListaPrecio.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoListaPrecio.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoListaPrecio.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoListaPrecio!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoListaPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoListaPrecio.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoListaPrecio.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoListaPrecio.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoListaPrecio!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoListaPrecio.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoListaPrecio.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoListaPrecio(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoListaPrecio(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoListaPrecio() throws Exception {
		try	{
			if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoListaPrecio();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoListaPrecio() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoListaPrecio() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoListaPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoListaPrecio.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoListaPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoListaPrecio.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoListaPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoListaPrecio.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoListaPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoListaPrecio.addItem(reporte);
			}
			
			
			if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoListaPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoListaPrecio.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoListaPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoListaPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoListaPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoListaPrecio.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoListaPrecio.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoListaPrecio.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoListaPrecio.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoListaPrecio();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoListaPrecio() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoListaPrecio!=null) {
				this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoListaPrecio!=null) {
				this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoListaPrecio.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoListaPrecio!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoListaPrecio.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoListaPrecio()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoListaPrecio(Boolean esInicializar) throws Exception {				
		if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoListaPrecio();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoListaPrecio() throws Exception {
		this.inicializarActualizarBindingTablaTipoListaPrecio(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoListaPrecio() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoListaPrecioOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecioOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoListaPrecio(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipolistaprecioLogic.getTipoListaPrecios().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipolistaprecios.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoListaPrecio.setModel(new TipoListaPrecioModel(this.tipolistaprecioLogic.getTipoListaPrecios(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoListaPrecio.setModel(new TipoListaPrecioModel(this.tipolistaprecios,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoListaPrecio!=null && this.jInternalFrameOrderByTipoListaPrecio.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoListaPrecio();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO,tipolistaprecioConstantesFunciones.resaltarSeleccionarTipoListaPrecio,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoListaPrecioConstantesFunciones.SCLASSWEBTITULO,tipolistaprecioConstantesFunciones.resaltarSeleccionarTipoListaPrecio,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,TipoListaPrecioConstantesFunciones.LABEL_ID));

		if(this.tipolistaprecioConstantesFunciones.mostraridTipoListaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoListaPrecioConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipolistaprecioConstantesFunciones.resaltaridTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activaridTipoListaPrecio,this,true,"idTipoListaPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolistaprecioConstantesFunciones.resaltaridTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activaridTipoListaPrecio,this,true,"idTipoListaPrecio","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA));

		if(this.tipolistaprecioConstantesFunciones.mostrarid_empresaTipoListaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.tipolistaprecioConstantesFunciones.resaltarid_empresaTipoListaPrecio,this,this.tipolistaprecioConstantesFunciones.activarid_empresaTipoListaPrecio));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.tipolistaprecioConstantesFunciones.resaltarid_empresaTipoListaPrecio,this,this.tipolistaprecioConstantesFunciones.activarid_empresaTipoListaPrecio,false,"id_empresaTipoListaPrecio","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,TipoListaPrecioConstantesFunciones.LABEL_CODIGO));

		if(this.tipolistaprecioConstantesFunciones.mostrarcodigoTipoListaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoListaPrecioConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipolistaprecioConstantesFunciones.resaltarcodigoTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activarcodigoTipoListaPrecio,this,true,"codigoTipoListaPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolistaprecioConstantesFunciones.resaltarcodigoTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activarcodigoTipoListaPrecio,this,true,"codigoTipoListaPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,TipoListaPrecioConstantesFunciones.LABEL_NOMBRE));

		if(this.tipolistaprecioConstantesFunciones.mostrarnombreTipoListaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoListaPrecioConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipolistaprecioConstantesFunciones.resaltarnombreTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activarnombreTipoListaPrecio,this,true,"nombreTipoListaPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolistaprecioConstantesFunciones.resaltarnombreTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activarnombreTipoListaPrecio,this,true,"nombreTipoListaPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE));

		if(this.tipolistaprecioConstantesFunciones.mostrarfecha_desdeTipoListaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tipolistaprecioConstantesFunciones.resaltarfecha_desdeTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activarfecha_desdeTipoListaPrecio,this,true,"fecha_desdeTipoListaPrecio","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tipolistaprecioConstantesFunciones.resaltarfecha_desdeTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activarfecha_desdeTipoListaPrecio,this,true,"fecha_desdeTipoListaPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA));

		if(this.tipolistaprecioConstantesFunciones.mostrarfecha_hastaTipoListaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.tipolistaprecioConstantesFunciones.resaltarfecha_hastaTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activarfecha_hastaTipoListaPrecio,this,true,"fecha_hastaTipoListaPrecio","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.tipolistaprecioConstantesFunciones.resaltarfecha_hastaTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activarfecha_hastaTipoListaPrecio,this,true,"fecha_hastaTipoListaPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.tipolistaprecioConstantesFunciones.mostraresta_activoTipoListaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.tipolistaprecioConstantesFunciones.resaltaresta_activoTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activaresta_activoTipoListaPrecio));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.tipolistaprecioConstantesFunciones.resaltaresta_activoTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activaresta_activoTipoListaPrecio,this,true,"esta_activoTipoListaPrecio","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION));

		if(this.tipolistaprecioConstantesFunciones.mostrardescripcionTipoListaPrecio && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipolistaprecioConstantesFunciones.resaltardescripcionTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activardescripcionTipoListaPrecio,this,true,"descripcionTipoListaPrecio","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipolistaprecioConstantesFunciones.resaltardescripcionTipoListaPrecio,this.tipolistaprecioConstantesFunciones.activardescripcionTipoListaPrecio,this,true,"descripcionTipoListaPrecio","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoListaPrecioPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosCliente && this.tipolistaprecioConstantesFunciones.mostrarClienteTipoListaPrecio && !TipoListaPrecioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Clientes");
				tableColumn.setHeaderValue("Clientes");
				tableColumn.setCellRenderer(new ClienteTableCell(tipolistaprecioConstantesFunciones.resaltarClienteTipoListaPrecio,this,this.tipolistaprecioConstantesFunciones.activarClienteTipoListaPrecio));
				tableColumn.setCellEditor(new ClienteTableCell(tipolistaprecioConstantesFunciones.resaltarClienteTipoListaPrecio,this,this.tipolistaprecioConstantesFunciones.activarClienteTipoListaPrecio));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoListaPrecio.addColumn(tableColumn);
			}

			if(this.isTienePermisosParametroCarteraDefecto && this.tipolistaprecioConstantesFunciones.mostrarParametroCarteraDefectoTipoListaPrecio && !TipoListaPrecioConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Parametro Cartera Defectos");
				tableColumn.setHeaderValue("Parametro Cartera Defectos");
				tableColumn.setCellRenderer(new ParametroCarteraDefectoTableCell(tipolistaprecioConstantesFunciones.resaltarParametroCarteraDefectoTipoListaPrecio,this,this.tipolistaprecioConstantesFunciones.activarParametroCarteraDefectoTipoListaPrecio));
				tableColumn.setCellEditor(new ParametroCarteraDefectoTableCell(tipolistaprecioConstantesFunciones.resaltarParametroCarteraDefectoTipoListaPrecio,this,this.tipolistaprecioConstantesFunciones.activarParametroCarteraDefectoTipoListaPrecio));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoListaPrecio.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipolistaprecioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipolistaprecioSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoListaPrecio.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipolistaprecioSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipolistaprecioSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoListaPrecio.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipolistaprecioSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipolistaprecioSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoListaPrecio.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoListaPrecio.addColumn(tableColumn);
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
			
			this.jTableDatosTipoListaPrecio.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoListaPrecio.moveColumn(this.jTableDatosTipoListaPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoListaPrecio.moveColumn(this.jTableDatosTipoListaPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoListaPrecio.moveColumn(this.jTableDatosTipoListaPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoListaPrecio.moveColumn(this.jTableDatosTipoListaPrecio.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoListaPrecio.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoListaPrecio.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoListaPrecio,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoListaPrecio.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoListaPrecio.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoListaPrecio.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoListaPrecio.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipolistaprecioLogic.getTipoListaPrecios().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipolistaprecios.size()-1;
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
		//this.jTableDatosTipoListaPrecio.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoListaPrecio.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoListaPrecio();
			
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
				
				//this.isEsNuevoTipoListaPrecio=false;
					
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
				if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoListaPrecio==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoListaPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoListaPrecio.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipolistaprecio.getsType().equals("DUPLICADO")
				   || this.tipolistaprecio.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoListaPrecio=true;
				
				} else {
					this.isEsNuevoTipoListaPrecio=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
					if(this.tipolistaprecio.getId()>=0 && !this.tipolistaprecio.getIsNew()) {						
						this.isEsNuevoTipoListaPrecio=false;
						
					} else {
						this.isEsNuevoTipoListaPrecio=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoListaPrecio(esRelaciones);						
				
				this.seleccionarTipoListaPrecio(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipolistaprecio.getId()<0) {
					this.isEsNuevoTipoListaPrecio=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoListaPrecio(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoListaPrecio(evt,rowIndex);
				}	
				
				if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoListaPrecio: " + this.dDif); 
					}
				}								
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoListaPrecio(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipolistaprecio)) {
					if(this.tipolistaprecio.getId()>0) {
						this.tipolistaprecio.setIsDeleted(true);
						
						this.tipolistapreciosEliminados.add(this.tipolistaprecio);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipolistaprecioLogic.getTipoListaPrecios().remove(this.tipolistaprecio);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipolistaprecios.remove(this.tipolistaprecio);				
					}
					
					
					((TipoListaPrecioModel) this.jTableDatosTipoListaPrecio.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoListaPrecio(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoListaPrecio(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoListaPrecio) {
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoListaPrecio.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoListaPrecio.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoListaPrecio(this.tipolistaprecio);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.tipolistaprecioConstantesFunciones.cargarid_empresaTipoListaPrecio || this.tipolistaprecioConstantesFunciones.event_dependid_empresaTipoListaPrecio) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.tipolistaprecio.getid_empresa());
									//this.inicializarActualizarBindingTipoListaPrecio(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(tipolistaprecio.getEmpresa()!=null) {
							this.empresasForeignKey.add(tipolistaprecio.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.tipolistaprecio.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoListaPrecio("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoListaPrecio(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoListaPrecio() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoListaPrecio(TipoListaPrecio tipolistaprecio) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoListaPrecio(tipolistaprecio,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoListaPrecio(TipoListaPrecio tipolistaprecio,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoListaPrecio(tipolistaprecio);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoListaPrecio(tipolistaprecio,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoListaPrecio(tipolistaprecio);
	}
	
	public void setVariablesObjetoActualToFormularioTipoListaPrecio(TipoListaPrecio tipolistaprecio) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.setText(tipolistaprecio.getId().toString());
			this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreacodigoTipoListaPrecio.setText(tipolistaprecio.getcodigo());
			this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreanombreTipoListaPrecio.setText(tipolistaprecio.getnombre());
			this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_desdeTipoListaPrecio.setDate(tipolistaprecio.getfecha_desde());
			this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_hastaTipoListaPrecio.setDate(tipolistaprecio.getfecha_hasta());
			this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxesta_activoTipoListaPrecio.setSelected(tipolistaprecio.getesta_activo());
			this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreadescripcionTipoListaPrecio.setText(tipolistaprecio.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoListaPrecio tipolistaprecioLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipolistaprecioLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoListaPrecio tipolistaprecioLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipolistaprecioLocal=this.tipolistaprecio;
			} else {
				tipolistaprecioLocal=this.tipolistaprecioAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipolistaprecioLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoListaPrecio(tipolistaprecioLocal,true);
					
					if(tipolistaprecioSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipolistaprecioLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipolistaprecioLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoListaPrecio(TipoListaPrecio tipolistaprecio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoListaPrecio(tipolistaprecio,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(tipolistaprecio);
	}
	
	public void setVariablesFormularioToObjetoActualTipoListaPrecio(TipoListaPrecio tipolistaprecio,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoListaPrecio(tipolistaprecio,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoListaPrecio(TipoListaPrecio tipolistaprecio,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.getText()==null || this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.getText()=="" || this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.setText("0");
			}

			if(conColumnasBase) {tipolistaprecio.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoListaPrecioConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelIdTipoListaPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolistaprecio.setcodigo(this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreacodigoTipoListaPrecio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoListaPrecioConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelcodigoTipoListaPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolistaprecio.setnombre(this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreanombreTipoListaPrecio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoListaPrecioConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelnombreTipoListaPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolistaprecio.setfecha_desde(this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_desdeTipoListaPrecio.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelfecha_desdeTipoListaPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolistaprecio.setfecha_hasta(this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_hastaTipoListaPrecio.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelfecha_hastaTipoListaPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolistaprecio.setesta_activo(this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxesta_activoTipoListaPrecio.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabelesta_activoTipoListaPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipolistaprecio.setdescripcion(this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreadescripcionTipoListaPrecio.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoListaPrecio.jLabeldescripcionTipoListaPrecio,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoListaPrecio(TipoListaPrecio tipolistaprecioBean,TipoListaPrecio tipolistaprecio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoListaPrecio(TipoListaPrecio tipolistaprecioOrigen,TipoListaPrecio tipolistaprecio,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipolistaprecioOrigen.getId()!=null && !tipolistaprecioOrigen.getId().equals(0L))) {tipolistaprecio.setId(tipolistaprecioOrigen.getId());}}
			if(conDefault || (!conDefault && tipolistaprecioOrigen.getcodigo()!=null && !tipolistaprecioOrigen.getcodigo().equals(""))) {tipolistaprecio.setcodigo(tipolistaprecioOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipolistaprecioOrigen.getnombre()!=null && !tipolistaprecioOrigen.getnombre().equals(""))) {tipolistaprecio.setnombre(tipolistaprecioOrigen.getnombre());}
			if(conDefault || (!conDefault && tipolistaprecioOrigen.getfecha_desde()!=null && !tipolistaprecioOrigen.getfecha_desde().equals(new Date()))) {tipolistaprecio.setfecha_desde(tipolistaprecioOrigen.getfecha_desde());}
			if(conDefault || (!conDefault && tipolistaprecioOrigen.getfecha_hasta()!=null && !tipolistaprecioOrigen.getfecha_hasta().equals(new Date()))) {tipolistaprecio.setfecha_hasta(tipolistaprecioOrigen.getfecha_hasta());}
			if(conDefault || (!conDefault && tipolistaprecioOrigen.getesta_activo()!=null && !tipolistaprecioOrigen.getesta_activo().equals(false))) {tipolistaprecio.setesta_activo(tipolistaprecioOrigen.getesta_activo());}
			if(conDefault || (!conDefault && tipolistaprecioOrigen.getdescripcion()!=null && !tipolistaprecioOrigen.getdescripcion().equals(""))) {tipolistaprecio.setdescripcion(tipolistaprecioOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoListaPrecio(TipoListaPrecio tipolistaprecio) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.setText(tipolistaprecio.getId().toString());
			this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreacodigoTipoListaPrecio.setText(tipolistaprecio.getcodigo());
			this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreanombreTipoListaPrecio.setText(tipolistaprecio.getnombre());
			this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_desdeTipoListaPrecio.setDate(tipolistaprecio.getfecha_desde());
			this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_hastaTipoListaPrecio.setDate(tipolistaprecio.getfecha_hasta());
			this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxesta_activoTipoListaPrecio.setSelected(tipolistaprecio.getesta_activo());
			this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreadescripcionTipoListaPrecio.setText(tipolistaprecio.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoListaPrecio(TipoListaPrecioBean tipolistaprecioBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.setText(tipolistaprecioBean.getId().toString());
			this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreacodigoTipoListaPrecio.setText(tipolistaprecioBean.getcodigo());
			this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreanombreTipoListaPrecio.setText(tipolistaprecioBean.getnombre());
			this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_desdeTipoListaPrecio.setDate(tipolistaprecioBean.getfecha_desde());
			this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_hastaTipoListaPrecio.setDate(tipolistaprecioBean.getfecha_hasta());
			this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxesta_activoTipoListaPrecio.setSelected(tipolistaprecioBean.getesta_activo());
			this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreadescripcionTipoListaPrecio.setText(tipolistaprecioBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoListaPrecio(TipoListaPrecioParameterReturnGeneral tipolistaprecioReturnGeneral,TipoListaPrecioBean tipolistaprecioBean,Boolean conDefault) throws Exception { 
		try {
			TipoListaPrecio tipolistaprecioLocal=new TipoListaPrecio();
			
			tipolistaprecioLocal=tipolistaprecioReturnGeneral.getTipoListaPrecio();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipolistaprecioLocal.getId()!=null && !tipolistaprecioLocal.getId().equals(0L))) {tipolistaprecioBean.setId(tipolistaprecioLocal.getId());}}
			if(conDefault || (!conDefault && tipolistaprecioLocal.getcodigo()!=null && !tipolistaprecioLocal.getcodigo().equals(""))) {tipolistaprecioBean.setcodigo(tipolistaprecioLocal.getcodigo());}
			if(conDefault || (!conDefault && tipolistaprecioLocal.getnombre()!=null && !tipolistaprecioLocal.getnombre().equals(""))) {tipolistaprecioBean.setnombre(tipolistaprecioLocal.getnombre());}
			if(conDefault || (!conDefault && tipolistaprecioLocal.getfecha_desde()!=null && !tipolistaprecioLocal.getfecha_desde().equals(new Date()))) {tipolistaprecioBean.setfecha_desde(tipolistaprecioLocal.getfecha_desde());}
			if(conDefault || (!conDefault && tipolistaprecioLocal.getfecha_hasta()!=null && !tipolistaprecioLocal.getfecha_hasta().equals(new Date()))) {tipolistaprecioBean.setfecha_hasta(tipolistaprecioLocal.getfecha_hasta());}
			if(conDefault || (!conDefault && tipolistaprecioLocal.getesta_activo()!=null && !tipolistaprecioLocal.getesta_activo().equals(false))) {tipolistaprecioBean.setesta_activo(tipolistaprecioLocal.getesta_activo());}
			if(conDefault || (!conDefault && tipolistaprecioLocal.getdescripcion()!=null && !tipolistaprecioLocal.getdescripcion().equals(""))) {tipolistaprecioBean.setdescripcion(tipolistaprecioLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoListaPrecioGenerico(Long idTipoListaPrecioSeleccionado,JComboBox jComboBoxTipoListaPrecio,List<TipoListaPrecio> tipolistapreciosLocal)throws Exception {
		try {
			TipoListaPrecio  tipolistaprecioTemp=null;

			for(TipoListaPrecio tipolistaprecioAux:tipolistapreciosLocal) {
				if(tipolistaprecioAux.getId()!=null && tipolistaprecioAux.getId().equals(idTipoListaPrecioSeleccionado)) {
					tipolistaprecioTemp=tipolistaprecioAux;
					break;
				}
			}

			jComboBoxTipoListaPrecio.setSelectedItem(tipolistaprecioTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoListaPrecioGenerico(JComboBox jComboBoxTipoListaPrecio,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoListaPrecio.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoListaPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoListaPrecio.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoListaPrecio.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoListaPrecio.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoListaPrecio.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
		 else if(sTipo.equals("ParametroCarteraDefecto")) {
			jButtonParametroCarteraDefectoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolistaprecio=(TipoListaPrecio) tipolistaprecioLogic.getTipoListaPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipolistaprecio =(TipoListaPrecio) tipolistaprecios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!tipolistaprecio.getIsNew() && !tipolistaprecio.getIsChanged() && !tipolistaprecio.getIsDeleted()) {
				sDescripcion=tipolistaprecio.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=tipolistaprecio.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoListaPrecio tipolistaprecioRow=new TipoListaPrecio();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolistaprecioRow=(TipoListaPrecio) tipolistaprecioLogic.getTipoListaPrecios().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipolistaprecioRow=(TipoListaPrecio) tipolistaprecios.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoListaPrecio tipolistaprecio) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoListaPrecio==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio = (TipoListaPrecio)this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipolistaprecio = (TipoListaPrecio)this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipolistaprecio!=null) {
						this.tipolistaprecio = tipolistaprecio;
					} else {
						this.tipolistaprecio = new TipoListaPrecio();
					}
				}

				if(this.isTienePermisosCliente && this.permiteMantenimiento(this.tipolistaprecio)) {
					ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFramePopup=new ClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFramePopup;
					} else {
						clienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame;
					}

					List<TipoListaPrecio> tipolistaprecios=new ArrayList<TipoListaPrecio>();
					tipolistaprecios.add(this.tipolistaprecio);
					if(!esRelacionado) {
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setConGuardarRelaciones(false);
						//clienteBeanSwingJInternalFrame.clienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoListaPrecio.cargarClienteBeanSwingJInternalFrame(tipolistaprecios,this.tipolistaprecio,clienteBeanSwingJInternalFrame,/*conInicializar,*/clienteBeanSwingJInternalFrame.clienteSessionBean.getConGuardarRelaciones(),clienteBeanSwingJInternalFrame.clienteSessionBean.getEsGuardarRelacionado());
					clienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						clienteBeanSwingJInternalFrame.actualizarEstadoPanelsCliente("no_relacionado");

						clienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ClienteConstantesFunciones.ITAMANIOFILATABLA + (ClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						clienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoListaPrecio=(TitledBorder)this.jScrollPanelDatosTipoListaPrecio.getBorder();
						TitledBorder titledBorderCliente=(TitledBorder)clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

						titledBorderCliente.setTitle(titledBorderTipoListaPrecio.getTitle() + " -> Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,clienteBeanSwingJInternalFrame);
						}

						clienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(clienteBeanSwingJInternalFrame);

						clienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonParametroCarteraDefectoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoListaPrecio tipolistaprecio) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoListaPrecio==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio = (TipoListaPrecio)this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipolistaprecio = (TipoListaPrecio)this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipolistaprecio!=null) {
						this.tipolistaprecio = tipolistaprecio;
					} else {
						this.tipolistaprecio = new TipoListaPrecio();
					}
				}

				if(this.isTienePermisosParametroCarteraDefecto && this.permiteMantenimiento(this.tipolistaprecio)) {
					ParametroCarteraDefectoBeanSwingJInternalFrame parametrocarteradefectoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFramePopup=new ParametroCarteraDefectoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFramePopup;
					} else {
						parametrocarteradefectoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame;
					}

					List<TipoListaPrecio> tipolistaprecios=new ArrayList<TipoListaPrecio>();
					tipolistaprecios.add(this.tipolistaprecio);
					if(!esRelacionado) {
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setConGuardarRelaciones(false);
						//parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoListaPrecio.cargarParametroCarteraDefectoBeanSwingJInternalFrame(tipolistaprecios,this.tipolistaprecio,parametrocarteradefectoBeanSwingJInternalFrame,/*conInicializar,*/parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getConGuardarRelaciones(),parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoSessionBean.getEsGuardarRelacionado());
					parametrocarteradefectoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						parametrocarteradefectoBeanSwingJInternalFrame.actualizarEstadoPanelsParametroCarteraDefecto("no_relacionado");

						parametrocarteradefectoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA + (ParametroCarteraDefectoConstantesFunciones.ITAMANIOFILATABLA/2));

						parametrocarteradefectoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoListaPrecio=(TitledBorder)this.jScrollPanelDatosTipoListaPrecio.getBorder();
						TitledBorder titledBorderParametroCarteraDefecto=(TitledBorder)parametrocarteradefectoBeanSwingJInternalFrame.jScrollPanelDatosParametroCarteraDefecto.getBorder();

						titledBorderParametroCarteraDefecto.setTitle(titledBorderTipoListaPrecio.getTitle() + " -> Parametro Cartera Defecto");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,parametrocarteradefectoBeanSwingJInternalFrame);
						}

						parametrocarteradefectoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(parametrocarteradefectoBeanSwingJInternalFrame);

						parametrocarteradefectoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Parametro Cartera Defecto",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoListaPrecio(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoListaPrecio.setVisible((this.isVisibilidadCeldaNuevoTipoListaPrecio && this.isPermisoNuevoTipoListaPrecio));			
			this.jButtonDuplicarTipoListaPrecio.setVisible((this.isVisibilidadCeldaDuplicarTipoListaPrecio && this.isPermisoDuplicarTipoListaPrecio));			
			this.jButtonCopiarTipoListaPrecio.setVisible((this.isVisibilidadCeldaCopiarTipoListaPrecio && this.isPermisoCopiarTipoListaPrecio));
			this.jButtonVerFormTipoListaPrecio.setVisible((this.isVisibilidadCeldaVerFormTipoListaPrecio && this.isPermisoVerFormTipoListaPrecio));
			
			this.jButtonAbrirOrderByTipoListaPrecio.setVisible((this.isVisibilidadCeldaOrdenTipoListaPrecio && this.isPermisoOrdenTipoListaPrecio));			
			
			this.jButtonNuevoRelacionesTipoListaPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio && this.isPermisoNuevoTipoListaPrecio));			
			this.jButtonNuevoGuardarCambiosTipoListaPrecio.setVisible((this.isVisibilidadCeldaNuevoTipoListaPrecio && this.isPermisoNuevoTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonModificarTipoListaPrecio.setVisible((this.isVisibilidadCeldaModificarTipoListaPrecio && this.isPermisoActualizarTipoListaPrecio));	
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarTipoListaPrecio.setVisible((this.isVisibilidadCeldaActualizarTipoListaPrecio && this.isPermisoActualizarTipoListaPrecio));	
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarTipoListaPrecio.setVisible((this.isVisibilidadCeldaEliminarTipoListaPrecio && this.isPermisoEliminarTipoListaPrecio));
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarTipoListaPrecio.setVisible(this.isVisibilidadCeldaCancelarTipoListaPrecio);							
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosTipoListaPrecio.setVisible((this.isVisibilidadCeldaGuardarTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoListaPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaNuevoTipoListaPrecio && this.isPermisoNuevoTipoListaPrecio));						
			this.jButtonDuplicarToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaDuplicarTipoListaPrecio && this.isPermisoDuplicarTipoListaPrecio));						
			this.jButtonCopiarToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaCopiarTipoListaPrecio && this.isPermisoCopiarTipoListaPrecio));			
			this.jButtonVerFormToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaVerFormTipoListaPrecio && this.isPermisoVerFormTipoListaPrecio));			
			this.jButtonAbrirOrderByToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaOrdenTipoListaPrecio && this.isPermisoOrdenTipoListaPrecio));
			this.jButtonNuevoRelacionesToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio && this.isPermisoNuevoTipoListaPrecio));			
			this.jButtonNuevoGuardarCambiosToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaNuevoTipoListaPrecio && this.isPermisoNuevoTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));			
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonModificarToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaModificarTipoListaPrecio && this.isPermisoActualizarTipoListaPrecio));	
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaActualizarTipoListaPrecio  && this.isPermisoActualizarTipoListaPrecio));	
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaEliminarTipoListaPrecio && this.isPermisoEliminarTipoListaPrecio));
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarToolBarTipoListaPrecio.setVisible(this.isVisibilidadCeldaCancelarTipoListaPrecio);				
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaGuardarTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoListaPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoListaPrecio.setVisible((this.isVisibilidadCeldaNuevoTipoListaPrecio && this.isPermisoNuevoTipoListaPrecio));			
			this.jMenuItemDuplicarTipoListaPrecio.setVisible((this.isVisibilidadCeldaDuplicarTipoListaPrecio && this.isPermisoDuplicarTipoListaPrecio));			
			this.jMenuItemCopiarTipoListaPrecio.setVisible((this.isVisibilidadCeldaCopiarTipoListaPrecio && this.isPermisoCopiarTipoListaPrecio));			
			this.jMenuItemVerFormTipoListaPrecio.setVisible((this.isVisibilidadCeldaVerFormTipoListaPrecio && this.isPermisoVerFormTipoListaPrecio));			
			this.jMenuItemAbrirOrderByTipoListaPrecio.setVisible((this.isVisibilidadCeldaOrdenTipoListaPrecio && this.isPermisoOrdenTipoListaPrecio));			
			//this.jMenuItemMostrarOcultarTipoListaPrecio.setVisible((this.isVisibilidadCeldaOrdenTipoListaPrecio && this.isPermisoOrdenTipoListaPrecio));
			this.jMenuItemDetalleAbrirOrderByTipoListaPrecio.setVisible((this.isVisibilidadCeldaOrdenTipoListaPrecio && this.isPermisoOrdenTipoListaPrecio));			
			//this.jMenuItemDetalleMostrarOcultarTipoListaPrecio.setVisible((this.isVisibilidadCeldaOrdenTipoListaPrecio && this.isPermisoOrdenTipoListaPrecio));			
			this.jMenuItemNuevoRelacionesTipoListaPrecio.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio && this.isPermisoNuevoTipoListaPrecio));			
			this.jMenuItemNuevoGuardarCambiosTipoListaPrecio.setVisible((this.isVisibilidadCeldaNuevoTipoListaPrecio && this.isPermisoNuevoTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));									
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemModificarTipoListaPrecio.setVisible((this.isVisibilidadCeldaModificarTipoListaPrecio && this.isPermisoActualizarTipoListaPrecio));	
			this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemActualizarTipoListaPrecio.setVisible((this.isVisibilidadCeldaActualizarTipoListaPrecio && this.isPermisoActualizarTipoListaPrecio));	
			this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemEliminarTipoListaPrecio.setVisible((this.isVisibilidadCeldaEliminarTipoListaPrecio && this.isPermisoEliminarTipoListaPrecio));
			this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemCancelarTipoListaPrecio.setVisible(this.isVisibilidadCeldaCancelarTipoListaPrecio);				
			}
			
			this.jMenuItemGuardarCambiosTipoListaPrecio.setVisible((this.isVisibilidadCeldaGuardarTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));						
			this.jMenuItemGuardarCambiosTablaTipoListaPrecio.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoListaPrecio=this.jButtonNuevoTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaDuplicarTipoListaPrecio=this.jButtonDuplicarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaCopiarTipoListaPrecio=this.jButtonCopiarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaVerFormTipoListaPrecio=this.jButtonVerFormTipoListaPrecio.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoListaPrecio=this.jButtonAbrirOrderByTipoListaPrecio.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=this.jButtonNuevoRelacionesTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaModificarTipoListaPrecio=this.jButtonModificarTipoListaPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			this.isVisibilidadCeldaActualizarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaEliminarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaCancelarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaGuardarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosTipoListaPrecio.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=this.jButtonGuardarCambiosTablaTipoListaPrecio.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoListaPrecio=this.jButtonNuevoToolBarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=this.jButtonNuevoRelacionesToolBarTipoListaPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			this.isVisibilidadCeldaModificarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jButtonModificarToolBarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaActualizarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarToolBarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaEliminarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarToolBarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaCancelarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarToolBarTipoListaPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoListaPrecio=this.jButtonGuardarCambiosToolBarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=this.jButtonGuardarCambiosTablaToolBarTipoListaPrecio.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoListaPrecio=this.jMenuItemNuevoTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=this.jMenuItemNuevoRelacionesTipoListaPrecio.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			this.isVisibilidadCeldaModificarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemModificarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaActualizarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemActualizarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaEliminarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemEliminarTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaCancelarTipoListaPrecio=this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemCancelarTipoListaPrecio.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoListaPrecio=this.jMenuItemGuardarCambiosTipoListaPrecio.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=this.jMenuItemGuardarCambiosTablaTipoListaPrecio.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoListaPrecio(Boolean esInicializar) {
		if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
				//if(this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoListaPrecio();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoListaPrecio(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoListaPrecio() {
		this.jButtonNuevoTipoListaPrecio.setVisible(this.isPermisoNuevoTipoListaPrecio);			
		this.jButtonDuplicarTipoListaPrecio.setVisible(this.isPermisoDuplicarTipoListaPrecio);			
		this.jButtonCopiarTipoListaPrecio.setVisible(this.isPermisoCopiarTipoListaPrecio);			
		this.jButtonVerFormTipoListaPrecio.setVisible(this.isPermisoVerFormTipoListaPrecio);			
		
		this.jButtonAbrirOrderByTipoListaPrecio.setVisible(this.isPermisoOrdenTipoListaPrecio);					
		
		this.jButtonNuevoRelacionesTipoListaPrecio.setVisible(this.isPermisoNuevoTipoListaPrecio);			
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonModificarTipoListaPrecio.setVisible(this.isPermisoActualizarTipoListaPrecio);	
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarTipoListaPrecio.setVisible(this.isPermisoActualizarTipoListaPrecio);	
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarTipoListaPrecio.setVisible(this.isPermisoEliminarTipoListaPrecio);
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarTipoListaPrecio.setVisible(this.isVisibilidadCeldaCancelarTipoListaPrecio);						
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosTipoListaPrecio.setVisible(this.isPermisoGuardarCambiosTipoListaPrecio);							
		}
		
		this.jButtonGuardarCambiosTablaTipoListaPrecio.setVisible(this.isPermisoActualizarTipoListaPrecio);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoListaPrecio() {
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonModificarTipoListaPrecio.setVisible(this.isPermisoActualizarTipoListaPrecio);	
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarTipoListaPrecio.setVisible(this.isPermisoActualizarTipoListaPrecio);	
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarTipoListaPrecio.setVisible(this.isPermisoEliminarTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarTipoListaPrecio.setVisible(this.isVisibilidadCeldaCancelarTipoListaPrecio);							
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosTipoListaPrecio.setVisible((this.isVisibilidadCeldaGuardarTipoListaPrecio && this.isPermisoGuardarCambiosTipoListaPrecio));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoListaPrecio() {
		if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoListaPrecio();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoListaPrecio() {
	}
	
	public void jTableDatosTipoListaPrecioListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoListaPrecio(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoListaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.gettipolistaprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolistaprecio==null) {
						this.tipolistaprecio = new TipoListaPrecio();
					}

					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				}

				if(this.tipolistaprecio.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipolistaprecio.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoListaPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTipoListaPrecioUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTipoListaPrecio(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTipoListaPrecio.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTipoListaPrecio.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.gettipolistaprecio(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.tipolistaprecioLogic.getConnexion());

				if(this.tipolistaprecio.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.tipolistaprecio.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTipoListaPrecio=(TitledBorder)this.jScrollPanelDatosTipoListaPrecio.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTipoListaPrecio.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTipoListaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.gettipolistaprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolistaprecio==null) {
						this.tipolistaprecio = new TipoListaPrecio();
					}

					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				}

				if(this.tipolistaprecio.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.tipolistaprecio.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoListaPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoListaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.gettipolistaprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolistaprecio==null) {
						this.tipolistaprecio = new TipoListaPrecio();
					}

					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				}

				if(this.tipolistaprecio.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipolistaprecio.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoListaPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoListaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.gettipolistaprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolistaprecio==null) {
						this.tipolistaprecio = new TipoListaPrecio();
					}

					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				}

				if(this.tipolistaprecio.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipolistaprecio.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoListaPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_desdeTipoListaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.gettipolistaprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolistaprecio==null) {
						this.tipolistaprecio = new TipoListaPrecio();
					}

					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				}

				if(this.tipolistaprecio.getfecha_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_desde = '"+Funciones2.getStringPostgresDate(this.tipolistaprecio.getfecha_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoListaPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_hastaTipoListaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.gettipolistaprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolistaprecio==null) {
						this.tipolistaprecio = new TipoListaPrecio();
					}

					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				}

				if(this.tipolistaprecio.getfecha_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_hasta = '"+Funciones2.getStringPostgresDate(this.tipolistaprecio.getfecha_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoListaPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoTipoListaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.gettipolistaprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolistaprecio==null) {
						this.tipolistaprecio = new TipoListaPrecio();
					}

					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				}

				if(this.tipolistaprecio.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.tipolistaprecio.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoListaPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTipoListaPrecioBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.gettipolistaprecio(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipolistaprecio==null) {
						this.tipolistaprecio = new TipoListaPrecio();
					}

					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);
				}

				if(this.tipolistaprecio.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.tipolistaprecio.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoListaPrecio(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTipoListaPrecioActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoListaPrecio(false,false);

			this.getTipoListaPreciosFK_IdEmpresa();

			this.inicializarActualizarBindingTipoListaPrecio(false);

			//if(TipoListaPrecioBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoListaPrecio(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipolistaprecioLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoListaPrecio() {
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
		

		if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
			this.jInternalFrameDetalleFormTipoListaPrecio.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoListaPrecio.dispose();
			this.jInternalFrameDetalleFormTipoListaPrecio=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoListaPrecio!=null) {
			this.jInternalFrameReporteDinamicoTipoListaPrecio.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoListaPrecio.dispose();
			this.jInternalFrameReporteDinamicoTipoListaPrecio=null;
		}
		
		if(this.jInternalFrameImportacionTipoListaPrecio!=null) {
			this.jInternalFrameImportacionTipoListaPrecio.setVisible(false);	    			
			this.jInternalFrameImportacionTipoListaPrecio.dispose();
			this.jInternalFrameImportacionTipoListaPrecio=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoListaPrecio();
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoListaPrecio")) {
				jButtonNuevoTipoListaPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoListaPrecio")) {
				jButtonDuplicarTipoListaPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoListaPrecio")) {
				jButtonCopiarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoListaPrecio")) {
				jButtonVerFormTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoListaPrecio")) {
				jButtonNuevoTipoListaPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoListaPrecio")) {
				jButtonDuplicarTipoListaPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoListaPrecio")) {
				jButtonNuevoTipoListaPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoListaPrecio")) {
				jButtonDuplicarTipoListaPrecioActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoListaPrecio")) {
				jButtonNuevoTipoListaPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoListaPrecio")) {
				jButtonNuevoTipoListaPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoListaPrecio")) {
				jButtonNuevoTipoListaPrecioActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoListaPrecio")) {
				jButtonModificarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoListaPrecio")) {
				jButtonModificarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoListaPrecio")) {
				jButtonModificarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoListaPrecio")) {
				jButtonActualizarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoListaPrecio")) {
				jButtonActualizarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoListaPrecio")) {
				jButtonActualizarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoListaPrecio")) {
				jButtonEliminarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoListaPrecio")) {
				jButtonEliminarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoListaPrecio")) {
				jButtonEliminarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoListaPrecio")) {
				jButtonCancelarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoListaPrecio")) {
				jButtonCancelarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoListaPrecio")) {
				jButtonCancelarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoListaPrecio")) {
				jButtonCerrarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoListaPrecio")) {
				jButtonCerrarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoListaPrecio")) {
				jButtonCerrarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoListaPrecio")) {
				jButtonMostrarOcultarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoListaPrecio")) {
				jButtonCancelarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoListaPrecio")) {
				jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoListaPrecio")) {
				jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoListaPrecio")) {
				jButtonCopiarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoListaPrecio")) {
				jButtonVerFormTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoListaPrecio")) {
				jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoListaPrecio")) {
				jButtonCopiarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoListaPrecio")) {
				jButtonVerFormTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoListaPrecio")) {
				jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoListaPrecio")) {
				jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoListaPrecio")) {
				jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoListaPrecio")) {
				jButtonRecargarInformacionTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoListaPrecio")) {
				jButtonRecargarInformacionTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoListaPrecio")) {
				jButtonRecargarInformacionTipoListaPrecioActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoListaPrecio")) {
				jButtonAnterioresTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoListaPrecio")) {
				jButtonAnterioresTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoListaPrecio")) {
				jButtonAnterioresTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoListaPrecio")) {
				jButtonSiguientesTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoListaPrecio")) {
				jButtonSiguientesTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoListaPrecio")) {
				jButtonSiguientesTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoListaPrecio") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoListaPrecio")) {
				jButtonAbrirOrderByTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoListaPrecio") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoListaPrecio")) {
				jButtonMostrarOcultarTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoListaPrecio")) {
				jButtonNuevoGuardarCambiosTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoListaPrecio")) {
				jButtonNuevoGuardarCambiosTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoListaPrecio")) {
				jButtonNuevoGuardarCambiosTipoListaPrecioActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoListaPrecio")) {
				jButtonCerrarReporteDinamicoTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoListaPrecio")) {
				jButtonGenerarReporteDinamicoTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoListaPrecio")) {
				
				jButtonGenerarExcelReporteDinamicoTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoListaPrecio")) {
				jButtonCerrarImportacionTipoListaPrecioActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoListaPrecio")) {
				
				jButtonGenerarImportacionTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoListaPrecio")) {
				
				jButtonAbrirImportacionTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoListaPrecio")) {
				jComboBoxTiposAccionesTipoListaPrecioActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoListaPrecio")) {
				jComboBoxTiposRelacionesTipoListaPrecioActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoListaPrecio")) {
				jComboBoxTiposAccionesTipoListaPrecioActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoListaPrecio")) {
				
				jComboBoxTiposSeleccionarTipoListaPrecioActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoListaPrecio")) {
				jTextFieldValorCampoGeneralTipoListaPrecioActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoListaPrecio")) {
				jButtonAbrirOrderByTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoListaPrecio")) {
				jButtonAbrirOrderByTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoListaPrecio")) {
				jButtonCerrarOrderByTipoListaPrecioActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoListaPrecioBusqueda")) {
				this.jButtonidTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoListaPrecioUpdate")) {
				this.jButtonid_empresaTipoListaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoListaPrecioBusqueda")) {
				this.jButtonid_empresaTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoListaPrecioBusqueda")) {
				this.jButtoncodigoTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoListaPrecioBusqueda")) {
				this.jButtonnombreTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeTipoListaPrecioBusqueda")) {
				this.jButtonfecha_desdeTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaTipoListaPrecioBusqueda")) {
				this.jButtonfecha_hastaTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoTipoListaPrecioBusqueda")) {
				this.jButtonesta_activoTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoListaPrecioBusqueda")) {
				this.jButtondescripcionTipoListaPrecioBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoListaPrecio();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoListaPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				


				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoListaPrecio tipolistaprecioLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipolistaprecioLocal=this.tipolistaprecio;
			} else {
				tipolistaprecioLocal=this.tipolistaprecioAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
							
				
				


				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoListaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
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
			
			


			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoListaPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
								
						
				


				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
								
				
				


				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoListaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoListaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoListaPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
							
				
				


				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoListaPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
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
			
			


			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoListaPrecioActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
								
				
				


				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoListaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoListaPrecioActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoListaPrecioActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoListaPrecio")) {
					jCheckBoxSeleccionarTodosTipoListaPrecioItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoListaPrecio")) {
					jCheckBoxSeleccionadosTipoListaPrecioItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoListaPrecio")) {
					
				}
				
				


				
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
												
				
				


				
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoListaPrecioActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoListaPrecioActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
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
			
			


			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoListaPrecioActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipolistaprecio);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipolistaprecio);
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
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
				
				


				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoListaPrecio.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoListaPrecio.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoListaPrecioActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipolistaprecioAnterior =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoListaPrecio")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoListaPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoListaPrecio.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipolistaprecio =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipolistaprecio);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoListaPrecio")) {
				
				}
				
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoListaPrecio")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoListaPrecio.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoListaPrecio")) {
			
			}
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoListaPrecio();
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
			if(sTipo.equals("NuevoTipoListaPrecio")) {
				jButtonNuevoTipoListaPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoListaPrecio")) {
				jButtonDuplicarTipoListaPrecioActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoListaPrecio")) {
				jButtonCopiarTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoListaPrecio")) {
				jButtonVerFormTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoListaPrecio")) {
				jButtonNuevoTipoListaPrecioActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoListaPrecio")) {
				jButtonModificarTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoListaPrecio")) {
				jButtonActualizarTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoListaPrecio")) {
				jButtonEliminarTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoListaPrecio")) {
				jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoListaPrecio")) {
				jButtonCancelarTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoListaPrecio")) {
				jButtonCerrarTipoListaPrecioActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoListaPrecio")) {
				jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoListaPrecio")) {
				jButtonNuevoGuardarCambiosTipoListaPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoListaPrecio")) {
				jButtonAbrirOrderByTipoListaPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoListaPrecio")) {
				jButtonRecargarInformacionTipoListaPrecioActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoListaPrecio")) {
				jButtonAnterioresTipoListaPrecioActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoListaPrecio")) {
				jButtonSiguientesTipoListaPrecioActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoListaPrecioBusqueda")) {
				this.jButtonidTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTipoListaPrecioUpdate")) {
				this.jButtonid_empresaTipoListaPrecioUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTipoListaPrecioBusqueda")) {
				this.jButtonid_empresaTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoListaPrecioBusqueda")) {
				this.jButtoncodigoTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoListaPrecioBusqueda")) {
				this.jButtonnombreTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_desdeTipoListaPrecioBusqueda")) {
				this.jButtonfecha_desdeTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_hastaTipoListaPrecioBusqueda")) {
				this.jButtonfecha_hastaTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoTipoListaPrecioBusqueda")) {
				this.jButtonesta_activoTipoListaPrecioBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTipoListaPrecioBusqueda")) {
				this.jButtondescripcionTipoListaPrecioBusquedaActionPerformed(evt);
			}
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoListaPrecio();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoListaPrecio")) {
				closingInternalFrameTipoListaPrecio();
				
			} else if(sTipo.equals("jButtonCancelarTipoListaPrecio")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoListaPrecio = (JInternalFrameBase)evt.getSource();
	            	
	            TipoListaPrecioBeanSwingJInternalFrame jInternalFrameParent=(TipoListaPrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoListaPrecio.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoListaPrecioActionPerformed(null);
			}
			
			TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipolistaprecio,new Object(),this.tipolistaprecioParameterGeneral,this.tipolistaprecioReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoListaPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoListaPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoListaPrecio(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipolistaprecio)) {
			if(!esControlTabla) {
				if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);			
				}
				
				if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoListaPrecio(this.tipolistaprecio,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipolistaprecioReturnGeneral=tipolistaprecioLogic.procesarEventosTipoListaPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolistaprecioLogic.getTipoListaPrecios(),this.tipolistaprecio,this.tipolistaprecioParameterGeneral,this.isEsNuevoTipoListaPrecio,classes);//this.tipolistaprecioLogic.getTipoListaPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoListaPrecio(this.tipolistaprecioReturnGeneral,this.tipolistaprecioBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoListaPrecio(classes,this.tipolistaprecioReturnGeneral,this.tipolistaprecioBean,false);
					}
						
					if(this.tipolistaprecioReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoListaPrecio(this.tipolistaprecioReturnGeneral.getTipoListaPrecio());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoListaPrecio(this.tipolistaprecioReturnGeneral.getTipoListaPrecio());	
					}
						
					if(this.tipolistaprecioReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoListaPrecio(this.tipolistaprecioReturnGeneral.getTipoListaPrecio(),classes);//this.tipolistaprecioBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoListaPrecio(this.tipolistaprecio,classes);//this.tipolistaprecioBean);									
				}
			
				if(TipoListaPrecioJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoListaPrecio(this.tipolistaprecio,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoListaPrecio(this.tipolistaprecio);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipolistaprecioAnterior!=null) {
						this.tipolistaprecio=this.tipolistaprecioAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipolistaprecioReturnGeneral=tipolistaprecioLogic.procesarEventosTipoListaPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolistaprecioLogic.getTipoListaPrecios(),this.tipolistaprecio,this.tipolistaprecioParameterGeneral,this.isEsNuevoTipoListaPrecio,classes);//this.tipolistaprecioLogic.getTipoListaPrecio()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipolistaprecioSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipolistaprecioSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipolistaprecioReturnGeneral.getTipoListaPrecio(),tipolistaprecioLogic.getTipoListaPrecios());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipolistaprecioReturnGeneral.getTipoListaPrecio(),this.tipolistaprecios);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoListaPrecio.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoListaPrecio.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoListaPrecio();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoListaPrecio() throws Exception {
		
		TipoListaPrecioModel tipolistaprecioModel=(TipoListaPrecioModel)this.jTableDatosTipoListaPrecio.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipolistaprecioModel.tipolistaprecios=this.tipolistaprecioLogic.getTipoListaPrecios();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipolistaprecioModel.tipolistaprecios=this.tipolistaprecios;
		}
		
		
		((TipoListaPrecioModel) this.jTableDatosTipoListaPrecio.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoListaPrecio() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipolistaprecioAnterior(),this.tipolistaprecioLogic.getTipoListaPrecios());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipolistaprecioAnterior(),this.tipolistaprecios);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoListaPrecio();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoListaPrecio(TipoListaPrecio tipolistaprecio,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipolistaprecio.getClientes());
					this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(tipolistaprecio.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
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
										
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolistaprecio,new Object(),generalEntityParameterGeneral,this.tipolistaprecioReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipolistaprecioSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoListaPrecioConstantesFunciones.getClassesRelationshipsOfTipoListaPrecio(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoListaPrecioConstantesFunciones.getClassesRelationshipsFromStringsOfTipoListaPrecio(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoListaPrecio(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoListaPrecioBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipolistaprecio,new Object(),generalEntityParameterGeneral,this.tipolistaprecioReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoListaPrecio(TipoListaPrecioBean tipolistaprecioBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.setClientes(tipolistaprecio.getClientes());
					this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.setParametroCarteraDefectos(tipolistaprecio.getParametroCarteraDefectos());
					this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.inicializarActualizarBindingTablaParametroCarteraDefecto(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoListaPrecio(ArrayList<Classe> classes,TipoListaPrecioReturnGeneral tipolistaprecioReturnGeneral,TipoListaPrecioBean tipolistaprecioBean,Boolean conDefault) throws Exception {
		
			this.tipolistaprecioBean.setClientes(tipolistaprecioReturnGeneral.getTipoListaPrecio().getClientes());
			this.tipolistaprecioBean.setParametroCarteraDefectos(tipolistaprecioReturnGeneral.getTipoListaPrecio().getParametroCarteraDefectos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoListaPrecio(TipoListaPrecio tipolistaprecio,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Cliente.class)) {
					tipolistaprecio.setClientes(this.jInternalFrameDetalleFormTipoListaPrecio.clienteBeanSwingJInternalFrame.clienteLogic.getClientes());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ParametroCarteraDefecto.class)) {
					tipolistaprecio.setParametroCarteraDefectos(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoBeanSwingJInternalFrame.parametrocarteradefectoLogic.getParametroCarteraDefectos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipolistaprecio)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoListaPrecio = new TipoListaPrecioDetalleFormJInternalFrame(jDesktopPane,this.tipolistaprecioSessionBean.getConGuardarRelaciones(),this.tipolistaprecioSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.setVisible(false);
		this.jInternalFrameDetalleFormTipoListaPrecio.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoListaPrecio.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoListaPrecio.tipolistaprecioLogic=this.tipolistaprecioLogic;
		
		this.cargarCombosFrameForeignKeyTipoListaPrecio("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoListaPrecio();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoListaPrecio();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoListaPrecio("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoListaPrecio();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoListaPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoListaPrecio"));
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonModificarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"ModificarTipoListaPrecio"));

		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonModificarToolBarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoListaPrecio"));
					
		this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemModificarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoListaPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"ActualizarTipoListaPrecio"));
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarToolBarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoListaPrecio"));
						
		this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemActualizarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoListaPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"EliminarTipoListaPrecio"));
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoListaPrecio"));
								
		this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemEliminarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoListaPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"CancelarTipoListaPrecio"));
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoListaPrecio"));
					
		this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemCancelarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoListaPrecio"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemDetalleCerrarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoListaPrecio"));		
		
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoListaPrecio"));
		
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoListaPrecio"));
		
		
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoListaPrecio"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonidTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoListaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonid_empresaTipoListaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoListaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonid_empresaTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtoncodigoTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonnombreTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonfecha_desdeTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonfecha_hastaTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonesta_activoTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtondescripcionTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoListaPrecioBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoListaPrecio"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoListaPrecio"));
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoListaPrecio"));
		}
		
		this.jTableDatosTipoListaPrecio.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoListaPrecio"));
		
		this.jTableDatosTipoListaPrecio.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoListaPrecio"));
		
		this.jButtonNuevoTipoListaPrecio.addActionListener(new ButtonActionListener(this,"NuevoTipoListaPrecio"));
		
		this.jButtonDuplicarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"DuplicarTipoListaPrecio"));
		
		this.jButtonCopiarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"CopiarTipoListaPrecio"));
		
		this.jButtonVerFormTipoListaPrecio.addActionListener(new ButtonActionListener(this,"VerFormTipoListaPrecio"));
		
		
		this.jButtonNuevoToolBarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoListaPrecio"));
			
		this.jButtonDuplicarToolBarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoListaPrecio"));
			
		this.jMenuItemNuevoTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoListaPrecio"));
			
		this.jMenuItemDuplicarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoListaPrecio"));		
		
		
		this.jButtonNuevoRelacionesTipoListaPrecio.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoListaPrecio"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoListaPrecio"));
			
		this.jMenuItemNuevoRelacionesTipoListaPrecio.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoListaPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonModificarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"ModificarTipoListaPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonModificarToolBarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoListaPrecio"));
			
			this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemModificarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoListaPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"ActualizarTipoListaPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonActualizarToolBarTipoListaPrecio.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoListaPrecio"));
				
			this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemActualizarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoListaPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"EliminarTipoListaPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonEliminarToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoListaPrecio"));
						
			this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemEliminarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoListaPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"CancelarTipoListaPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonCancelarToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoListaPrecio"));
			
			this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemCancelarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoListaPrecio"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoListaPrecio"));		
		
		
		this.jButtonCerrarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"CerrarTipoListaPrecio"));
		
		
		this.jButtonCerrarToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoListaPrecio"));
			
		this.jMenuItemCerrarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoListaPrecio"));
			
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jMenuItemDetalleCerrarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoListaPrecio"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosTipoListaPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoListaPrecio"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoListaPrecio"));
		}
		
		this.jButtonCopiarToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoListaPrecio"));
			
		this.jButtonVerFormToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoListaPrecio"));
		
		this.jMenuItemGuardarCambiosTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoListaPrecio"));
			
		this.jMenuItemCopiarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoListaPrecio"));		
		
		this.jMenuItemVerFormTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoListaPrecio"));		
		
		
		this.jButtonGuardarCambiosTablaTipoListaPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoListaPrecio"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoListaPrecio"));
			
		this.jMenuItemGuardarCambiosTablaTipoListaPrecio.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoListaPrecio"));		
		
		
		
		this.jButtonRecargarInformacionTipoListaPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoListaPrecio"));
					
		this.jButtonRecargarInformacionToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoListaPrecio"));
		
		this.jMenuItemRecargarInformacionTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoListaPrecio"));		
		
		
		
		this.jButtonAnterioresTipoListaPrecio.addActionListener (new ButtonActionListener(this,"AnterioresTipoListaPrecio"));
		
		
		this.jButtonAnterioresToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoListaPrecio"));
		
		this.jMenuItemAnterioresTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoListaPrecio"));		
		
		
		this.jButtonSiguientesTipoListaPrecio.addActionListener (new ButtonActionListener(this,"SiguientesTipoListaPrecio"));
		
		
		this.jButtonSiguientesToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoListaPrecio"));
			
		this.jMenuItemSiguientesTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoListaPrecio"));
			
		this.jMenuItemAbrirOrderByTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoListaPrecio"));
			
		this.jMenuItemMostrarOcultarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoListaPrecio"));
			
		this.jMenuItemDetalleAbrirOrderByTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoListaPrecio"));
			
		this.jMenuItemDetalleMostarOcultarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoListaPrecio"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoListaPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoListaPrecio"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoListaPrecio"));
			
		this.jMenuItemNuevoGuardarCambiosTipoListaPrecio.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoListaPrecio"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoListaPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoListaPrecio"));

		this.jCheckBoxSeleccionadosTipoListaPrecio.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoListaPrecio"));
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoListaPrecio"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoListaPrecio.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoListaPrecio"));
			
		this.jComboBoxTiposAccionesTipoListaPrecio.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoListaPrecio"));
					
		this.jComboBoxTiposSeleccionarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoListaPrecio"));
			
		this.jTextFieldValorCampoGeneralTipoListaPrecio.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoListaPrecio"));		
		
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonidTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoListaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonid_empresaTipoListaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoListaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonid_empresaTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtoncodigoTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonnombreTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonfecha_desdeTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonfecha_hastaTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonesta_activoTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtondescripcionTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoListaPrecioBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoListaPrecio!=null) {
				this.jInternalFrameReporteDinamicoTipoListaPrecio.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoListaPrecio"));
				this.jInternalFrameReporteDinamicoTipoListaPrecio.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoListaPrecio"));
				this.jInternalFrameReporteDinamicoTipoListaPrecio.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoListaPrecio"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoListaPrecio.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoListaPrecio"));				
			//this.jButtonGenerarReporteDinamicoTipoListaPrecio.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoListaPrecio"));
			//this.jButtonGenerarExcelReporteDinamicoTipoListaPrecio.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoListaPrecio"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoListaPrecio!=null) {
				this.jInternalFrameImportacionTipoListaPrecio.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoListaPrecio"));
				this.jInternalFrameImportacionTipoListaPrecio.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoListaPrecio"));
				this.jInternalFrameImportacionTipoListaPrecio.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoListaPrecio"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoListaPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoListaPrecio"));
			
			this.jButtonAbrirOrderByToolBarTipoListaPrecio.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoListaPrecio"));			
			
			if(this.jInternalFrameOrderByTipoListaPrecio!=null) {
				this.jInternalFrameOrderByTipoListaPrecio.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoListaPrecio"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoListaPrecio.jTabbedPaneRelacionesTipoListaPrecio.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoListaPrecio"));
		
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
            		closingInternalFrameTipoListaPrecio();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoListaPrecio.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoListaPrecio = (JInternalFrameBase)event.getSource();
	            	
	            TipoListaPrecioBeanSwingJInternalFrame jInternalFrameParent=(TipoListaPrecioBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoListaPrecio.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoListaPrecioActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoListaPrecio.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoListaPrecioListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoListaPrecio.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoListaPrecio.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoListaPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoListaPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoListaPrecioActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoListaPrecio";
		inputMap = this.jButtonNuevoTipoListaPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoListaPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoListaPrecioActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoListaPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoListaPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoListaPrecioActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoListaPrecio";
		inputMap = this.jButtonNuevoRelacionesTipoListaPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoListaPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoListaPrecioActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoListaPrecio";
		inputMap = this.jButtonModificarTipoListaPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoListaPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoListaPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoListaPrecio";
		inputMap = this.jButtonActualizarTipoListaPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoListaPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoListaPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoListaPrecio";
		inputMap = this.jButtonEliminarTipoListaPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoListaPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoListaPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoListaPrecio";
		inputMap = this.jButtonCancelarTipoListaPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoListaPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoListaPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoListaPrecio";
		inputMap = this.jButtonCerrarTipoListaPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoListaPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoListaPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoListaPrecio";
		inputMap = this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosTipoListaPrecio.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonGuardarCambiosTipoListaPrecio.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoListaPrecioActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoListaPrecio.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoListaPrecioItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoListaPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoListaPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoListaPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoListaPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoListaPrecio.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoListaPrecioActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonidTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"idTipoListaPrecioBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonid_empresaTipoListaPrecioUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTipoListaPrecioUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonid_empresaTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtoncodigoTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonnombreTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonfecha_desdeTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_desdeTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonfecha_hastaTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"fecha_hastaTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtonesta_activoTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoTipoListaPrecioBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoListaPrecio.jButtondescripcionTipoListaPrecioBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTipoListaPrecioBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoListaPrecio.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoListaPrecioActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoListaPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoListaPrecio.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoListaPrecio(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecioLogic.getTipoListaPrecios()) {
					tipolistaprecioAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoListaPrecio tipolistaprecioAux:tipolistaprecios) {
					tipolistaprecioAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoListaPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoListaPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecioLogic.getTipoListaPrecios()) {
						tipolistaprecioAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoListaPrecio tipolistaprecioAux:tipolistaprecios) {
						tipolistaprecioAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecioLogic.getTipoListaPrecios()) {
					
						if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							tipolistaprecioAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoListaPrecio tipolistaprecioAux:tipolistaprecios) {
						
						if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							tipolistaprecioAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoListaPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoListaPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoListaPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoListaPrecioItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoListaPrecio(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoListaPrecio.getSelectedRows();
			
			TipoListaPrecio tipolistaprecioLocal=new TipoListaPrecio();
			
			//this.seleccionarTodosTipoListaPrecio(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipolistaprecioLocal =(TipoListaPrecio) this.tipolistaprecioLogic.getTipoListaPrecios().toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipolistaprecioLocal =(TipoListaPrecio) this.tipolistaprecios.toArray()[this.jTableDatosTipoListaPrecio.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipolistaprecioLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecioLogic.getTipoListaPrecios()) {
						tipolistaprecioAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoListaPrecio tipolistaprecioAux:tipolistaprecios) {
						tipolistaprecioAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoListaPrecio(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoListaPrecio.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoListaPrecio.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoListaPrecio,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoListaPrecioItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoListaPrecioParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoListaPrecioActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoListaPrecio(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoListaPrecio.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecioLogic.getTipoListaPrecios()) {
				
						if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipolistaprecioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipolistaprecioAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							tipolistaprecioAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							tipolistaprecioAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipolistaprecioAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoListaPrecio tipolistaprecioAux:tipolistaprecios) {
					
						if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipolistaprecioAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipolistaprecioAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE)) {
							existe=true;
							tipolistaprecioAux.setfecha_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA)) {
							existe=true;
							tipolistaprecioAux.setfecha_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							tipolistaprecioAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoListaPrecio(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoListaPrecioActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoListaPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoListaPrecio=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoListaPrecio.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoListaPrecio) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoListaPrecio(conSplash);
				
					this.generarReporteTipoListaPreciosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoListaPreciosSeleccionados();
				//this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoListaPreciosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoListaPreciosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoListaPrecio();
				
				this.exportarTipoListaPreciosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoListaPrecios();
				//this.importarTipoListaPrecios();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoListaPrecio();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoListaPreciosSeleccionados();
				//this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Lista Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoListaPrecio();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoListaPrecio)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoListaPrecio(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoListaPrecioBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoListaPrecio) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoListaPrecio(conSplash);
					
						//this.actualizarParametrosGeneralTipoListaPrecio();
						
						this.generarReporteProcesoAccionTipoListaPreciosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoListaPrecioBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Lista PrecioES SELECCIONADOS?", "MANTENIMIENTO DE Tipo Lista Precio", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoListaPrecio();
				
						this.actualizarParametrosGeneralTipoListaPrecio();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipolistaprecioReturnGeneral=tipolistaprecioLogic.procesarAccionTipoListaPreciosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipolistaprecioLogic.getTipoListaPrecios(),this.tipolistaprecioParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoListaPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoListaPrecio();
					
					TipoListaPrecioBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoListaPrecioReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoListaPrecio.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxTiposAccionesFormularioTipoListaPrecio.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoListaPrecio(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoListaPrecioActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoListaPrecio();
			
			if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();		
			TipoListaPrecio tipolistaprecio=new TipoListaPrecio();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoListaPrecio(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoListaPrecio.getSelectedItem();
			
			
			
			
			tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipolistapreciosSeleccionados.size()==1) {
				for(TipoListaPrecio tipolistaprecioAux:tipolistapreciosSeleccionados) {
					tipolistaprecio=tipolistaprecioAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Cliente")) {
					jButtonClienteActionPerformed(null,rowIndex,true,false,tipolistaprecio);
				}
				else if(this.sTipoRelacion.equals("Parametro Cartera Defecto")) {
					jButtonParametroCarteraDefectoActionPerformed(null,rowIndex,true,false,tipolistaprecio);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoListaPrecio();
			
      		//this.finishProcessTipoListaPrecio(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoListaPrecioReturnGeneral() throws Exception {
		if(this.tipolistaprecioReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipolistaprecioReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipolistaprecioReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipolistaprecioReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipolistaprecioReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipolistaprecioReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoListaPrecio(false);
		}
		
		if(this.tipolistaprecioReturnGeneral.getConRetornoLista() || this.tipolistaprecioReturnGeneral.getConRetornoObjeto()) {
			if(this.tipolistaprecioReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipolistaprecioLogic.setTipoListaPrecios(this.tipolistaprecioReturnGeneral.getTipoListaPrecios());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipolistaprecioReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipolistaprecioLogic.setTipoListaPrecio(this.tipolistaprecioReturnGeneral.getTipoListaPrecio());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoListaPrecio(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoListaPrecio() throws Exception {
		
		
	}
	
	public ArrayList<TipoListaPrecio> getTipoListaPreciosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoListaPrecio) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoListaPrecio tipolistaprecioAux:tipolistaprecioLogic.getTipoListaPrecios()) {
					if(tipolistaprecioAux.getIsSelected()) {
						tipolistapreciosSeleccionados.add(tipolistaprecioAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoListaPrecio tipolistaprecioAux:this.tipolistaprecios) {
					if(tipolistaprecioAux.getIsSelected()) {
						tipolistapreciosSeleccionados.add(tipolistaprecioAux);				
					}
				}
			}
			
			if(tipolistapreciosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipolistapreciosSeleccionados.addAll(this.tipolistaprecioLogic.getTipoListaPrecios());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipolistapreciosSeleccionados.addAll(this.tipolistaprecios);				
					}
				}
			}
		} else {
			tipolistapreciosSeleccionados.add(this.tipolistaprecio);
		}
		
		return tipolistapreciosSeleccionados;
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
	
	public void generarReporteTipoListaPreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoListaPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoListaPreciosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoListaPreciosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoListaPreciosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoListaPreciosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Lista Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoListaPreciosSeleccionados() throws Exception {
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();		
		
		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoListaPrecios("Todos",tipolistapreciosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoListaPreciosSeleccionados() throws Exception {
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();		
		
		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoListaPrecios("Todos",tipolistapreciosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoListaPreciosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();
		
		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoListaPrecios("Todos",tipolistapreciosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoListaPreciosSeleccionados() throws Exception {
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoListaPrecio();
		
		
		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoListaPrecio();
		
		
		//this.generarReporteTipoListaPrecios("Todos",tipolistapreciosSeleccionados ,tipolistaprecioImplementable,tipolistaprecioImplementableHome);
	}
	
	public void mostrarImportacionTipoListaPrecios() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoListaPrecio();
		
		this.abrirFrameImportacionTipoListaPrecio();		
		
			
		//this.generarReporteTipoListaPrecios("Todos",tipolistapreciosSeleccionados ,tipolistaprecioImplementable,tipolistaprecioImplementableHome);
	}
	
	public void importarTipoListaPrecios() throws Exception {		
	
	}
	
	public void exportarTipoListaPreciosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoListaPreciosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoListaPreciosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoListaPreciosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Lista Precio",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoListaPreciosSeleccionados() throws Exception {
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();		
		
		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolistaprecio."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoListaPrecio(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoListaPrecio tipolistaprecioAux:tipolistapreciosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoListaPrecio(tipolistaprecioAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipolistaprecioAux.setsDetalleGeneralEntityReporte(tipolistaprecioAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoListaPrecio(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoListaPrecioConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoListaPrecioConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoListaPrecioConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoListaPrecioConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoListaPrecio(TipoListaPrecio tipolistaprecio,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipolistaprecio.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolistaprecio.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolistaprecio.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolistaprecio.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolistaprecio.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolistaprecio.getfecha_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolistaprecio.getfecha_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolistaprecio.getesta_activo().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipolistaprecio.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoListaPreciosSeleccionados() throws Exception {
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();		
		
		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolistaprecio.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoListaPrecios");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoListaPrecio(row);				
				iRow++;
			}				
			
			for(TipoListaPrecio tipolistaprecioAux:tipolistapreciosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoListaPrecio(tipolistaprecioAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoListaPreciosSeleccionados() throws Exception {
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();		
		
		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipolistaprecio.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipolistaprecios");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipolistaprecio");
			//elementRoot.appendChild(element);
		
			for(TipoListaPrecio tipolistaprecioAux:tipolistapreciosSeleccionados) {
				element = document.createElement("tipolistaprecio");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoListaPrecio(tipolistaprecioAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Lista Precio",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoListaPrecio(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoListaPrecio(TipoListaPrecio tipolistaprecio,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipolistaprecio.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolistaprecio.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolistaprecio.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolistaprecio.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolistaprecio.getfecha_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolistaprecio.getfecha_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolistaprecio.getesta_activo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipolistaprecio.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlTipoListaPrecio(TipoListaPrecio tipolistaprecio,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoListaPrecioConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipolistaprecio.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoListaPrecioConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipolistaprecio.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TipoListaPrecioConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(tipolistaprecio.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(TipoListaPrecioConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipolistaprecio.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoListaPrecioConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipolistaprecio.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementfecha_desde = document.createElement(TipoListaPrecioConstantesFunciones.FECHADESDE);
		elementfecha_desde.appendChild(document.createTextNode(tipolistaprecio.getfecha_desde().toString().trim()));
		element.appendChild(elementfecha_desde);

		Element elementfecha_hasta = document.createElement(TipoListaPrecioConstantesFunciones.FECHAHASTA);
		elementfecha_hasta.appendChild(document.createTextNode(tipolistaprecio.getfecha_hasta().toString().trim()));
		element.appendChild(elementfecha_hasta);

		Element elementesta_activo = document.createElement(TipoListaPrecioConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(tipolistaprecio.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);

		Element elementdescripcion = document.createElement(TipoListaPrecioConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(tipolistaprecio.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoTipoListaPreciosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados=new ArrayList<TipoListaPrecio>();
		
		tipolistapreciosSeleccionados=this.getTipoListaPreciosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoListaPrecio(tipolistapreciosSeleccionados);
		
		this.generarReporteTipoListaPrecios("Todos",tipolistapreciosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoListaPrecio(ArrayList<TipoListaPrecio> tipolistapreciosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoListaPrecio tipolistaprecioAux:tipolistapreciosSeleccionados) {
				tipolistaprecioAux.setsDetalleGeneralEntityReporte(tipolistaprecioAux.toString());
			
				if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					tipolistaprecioAux.setsDescripcionGeneralEntityReporte1(tipolistaprecioAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipolistaprecioAux.setsDescripcionGeneralEntityReporte1(tipolistaprecioAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipolistaprecioAux.setsDescripcionGeneralEntityReporte1(tipolistaprecioAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_FECHADESDE)) {
					existe=true;
					tipolistaprecioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tipolistaprecioAux.getfecha_desde()));
				}
				 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_FECHAHASTA)) {
					existe=true;
					tipolistaprecioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(tipolistaprecioAux.getfecha_hasta()));
				}
				 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					tipolistaprecioAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(tipolistaprecioAux.getesta_activo()));
				}
				 else if(sTipoSeleccionar.equals(TipoListaPrecioConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					tipolistaprecioAux.setsDescripcionGeneralEntityReporte1(tipolistaprecioAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoListaPrecioConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoListaPrecio(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoListaPrecio=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=true;
				this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=true;
			}
			
			this.isVisibilidadCeldaModificarTipoListaPrecio=false;
			this.isVisibilidadCeldaActualizarTipoListaPrecio=false;
			this.isVisibilidadCeldaEliminarTipoListaPrecio=false;
			this.isVisibilidadCeldaCancelarTipoListaPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoListaPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=false;
			this.isVisibilidadCeldaModificarTipoListaPrecio=false;
			this.isVisibilidadCeldaActualizarTipoListaPrecio=true;
			this.isVisibilidadCeldaEliminarTipoListaPrecio=false;
			this.isVisibilidadCeldaCancelarTipoListaPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoListaPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=false;
			this.isVisibilidadCeldaModificarTipoListaPrecio=false;
			this.isVisibilidadCeldaActualizarTipoListaPrecio=true;
			this.isVisibilidadCeldaEliminarTipoListaPrecio=true;
			this.isVisibilidadCeldaCancelarTipoListaPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoListaPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=false;
			this.isVisibilidadCeldaModificarTipoListaPrecio=false;
			this.isVisibilidadCeldaActualizarTipoListaPrecio=true;
			this.isVisibilidadCeldaEliminarTipoListaPrecio=false;
			this.isVisibilidadCeldaCancelarTipoListaPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoListaPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=true;
			this.isVisibilidadCeldaModificarTipoListaPrecio=false;
			this.isVisibilidadCeldaActualizarTipoListaPrecio=false;
			this.isVisibilidadCeldaEliminarTipoListaPrecio=false;
			this.isVisibilidadCeldaCancelarTipoListaPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoListaPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=false;
			this.isVisibilidadCeldaActualizarTipoListaPrecio=false;
			this.isVisibilidadCeldaEliminarTipoListaPrecio=false;
			this.isVisibilidadCeldaCancelarTipoListaPrecio=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoListaPrecio=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=false;
			this.isVisibilidadCeldaModificarTipoListaPrecio=true;
			this.isVisibilidadCeldaActualizarTipoListaPrecio=false;
			this.isVisibilidadCeldaEliminarTipoListaPrecio=false;
			this.isVisibilidadCeldaCancelarTipoListaPrecio=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoListaPrecio=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoListaPrecioJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoListaPrecio=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=true;
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=true;
		} else {
			this.actualizarEstadoPanelsTipoListaPrecio(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoListaPrecio=false;
			//this.isVisibilidadCeldaVerFormTipoListaPrecio=false;
			this.isVisibilidadCeldaDuplicarTipoListaPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipolistaprecioSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoListaPrecio=false;
			this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			if(!tipolistaprecioSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;												
			}
			
			this.jButtonCerrarTipoListaPrecio.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoListaPrecio=false;
		}
		
		if(!this.permiteMantenimiento(this.tipolistaprecio)) {
			this.isVisibilidadCeldaActualizarTipoListaPrecio=false;
			this.isVisibilidadCeldaEliminarTipoListaPrecio=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoListaPrecio() {
		this.isVisibilidadCeldaNuevoTipoListaPrecio=false;
		this.isVisibilidadCeldaGuardarCambiosTipoListaPrecio=false;
	}
	
	public void actualizarEstadoPanelsTipoListaPrecio(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoListaPrecio!=null) {
				this.jScrollPanelDatosEdicionTipoListaPrecio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoListaPrecio!=null) {
				this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoListaPrecio!=null) {
				this.jScrollPanelDatosTipoListaPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoListaPrecio!=null) {
				this.jPanelPaginacionTipoListaPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoListaPrecio!=null) {
				this.jPanelParametrosReportesTipoListaPrecio.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoListaPrecio!=null) {
				this.jScrollPanelDatosEdicionTipoListaPrecio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoListaPrecio!=null) {
				this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoListaPrecio!=null) {
				this.jScrollPanelDatosTipoListaPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoListaPrecio!=null) {
				this.jPanelPaginacionTipoListaPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoListaPrecio!=null) {
				this.jPanelParametrosReportesTipoListaPrecio.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoListaPrecio!=null) {
				this.jScrollPanelDatosEdicionTipoListaPrecio.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoListaPrecio!=null) {
				this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoListaPrecio!=null) {
				this.jScrollPanelDatosTipoListaPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoListaPrecio!=null) {
				this.jPanelPaginacionTipoListaPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoListaPrecio!=null) {
				this.jPanelParametrosReportesTipoListaPrecio.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoListaPrecio!=null) {
				this.jScrollPanelDatosEdicionTipoListaPrecio.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoListaPrecio!=null) {
				this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoListaPrecio!=null) {
				this.jScrollPanelDatosTipoListaPrecio.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoListaPrecio!=null) {
				this.jPanelPaginacionTipoListaPrecio.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoListaPrecio!=null) {
				this.jPanelParametrosReportesTipoListaPrecio.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoListaPrecio!=null) {
				this.jScrollPanelDatosEdicionTipoListaPrecio.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoListaPrecio!=null) {
				this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoListaPrecio!=null) {
				this.jScrollPanelDatosTipoListaPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoListaPrecio!=null) {
				this.jPanelPaginacionTipoListaPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoListaPrecio!=null) {
				this.jPanelParametrosReportesTipoListaPrecio.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoListaPrecio!=null) {
				this.jScrollPanelDatosEdicionTipoListaPrecio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoListaPrecio!=null) {
				this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoListaPrecio!=null) {
				this.jScrollPanelDatosTipoListaPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoListaPrecio!=null) {
				this.jPanelPaginacionTipoListaPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoListaPrecio!=null) {
				this.jPanelParametrosReportesTipoListaPrecio.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoListaPrecio!=null) {
				this.jScrollPanelDatosEdicionTipoListaPrecio.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoListaPrecio!=null) {
				this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoListaPrecio!=null) {
				this.jScrollPanelDatosTipoListaPrecio.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoListaPrecio!=null) {
				this.jPanelPaginacionTipoListaPrecio.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoListaPrecio!=null) {
				this.jPanelParametrosReportesTipoListaPrecio.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoListaPrecio!=null) {
					this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoListaPrecio!=null) {
				this.jPanelParametrosReportesTipoListaPrecio.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipolistaprecioSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoListaPrecio!=null) {
				this.jTabbedPaneBusquedasTipoListaPrecio.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoListaPrecio!=null) {
				this.jPanelParametrosReportesTipoListaPrecio.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionTipoListaPrecioParaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(this.tipolistaprecioSessionBean==null) {
				this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoListaPrecio.clienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoListaPrecio.clienteSessionBean=new ClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoListaPrecio.clienteSessionBean.setsPathNavegacionActual(tipolistaprecioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupCliente=this.jInternalFrameDetalleFormTipoListaPrecio.clienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TipoListaPrecioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoListaPrecio(true);
			this.jInternalFrameDetalleFormTipoListaPrecio.clienteSessionBean.setlidTipoListaPrecioActual(this.idTipoListaPrecioActual);

			tipolistaprecioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio(true);
			tipolistaprecioSessionBean.setlIdTipoListaPrecioActualForeignKey(this.idTipoListaPrecioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoListaPrecioParaParametroCarteraDefectos() throws Exception {
		Boolean isPaginaPopupParametroCarteraDefecto=false;

		try {

			if(this.tipolistaprecioSessionBean==null) {
				this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoSessionBean=new ParametroCarteraDefectoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoSessionBean.setsPathNavegacionActual(tipolistaprecioSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ParametroCarteraDefectoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupParametroCarteraDefecto=this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(true);
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeParametroCarteraDefecto(TipoListaPrecioConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoSessionBean.setisBusquedaDesdeForeignKeySesionTipoListaPrecio(true);
			this.jInternalFrameDetalleFormTipoListaPrecio.parametrocarteradefectoSessionBean.setlidTipoListaPrecioActual(this.idTipoListaPrecioActual);

			tipolistaprecioSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoListaPrecio(true);
			tipolistaprecioSessionBean.setlIdTipoListaPrecioActualForeignKey(this.idTipoListaPrecioActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoListaPrecioSessionBean tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
		
		if(this.tipolistaprecioSessionBean==null) {
			this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
		}
		
		this.tipolistaprecioSessionBean.setsUltimaBusquedaTipoListaPrecio(this.getsAccionBusqueda());
		this.tipolistaprecioSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipolistaprecioSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			tipolistaprecioSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoListaPrecioSessionBean tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
		
		if(this.tipolistaprecioSessionBean==null) {
			this.tipolistaprecioSessionBean=new TipoListaPrecioSessionBean();
		}
		
		if(this.tipolistaprecioSessionBean.getsUltimaBusquedaTipoListaPrecio()!=null&&!this.tipolistaprecioSessionBean.getsUltimaBusquedaTipoListaPrecio().equals("")) {
			this.setsAccionBusqueda(tipolistaprecioSessionBean.getsUltimaBusquedaTipoListaPrecio());
			this.setiNumeroPaginacion(tipolistaprecioSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipolistaprecioSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(tipolistaprecioSessionBean.getid_empresa());
				tipolistaprecioSessionBean.setid_empresa(-1L);
			}
		}
		
		this.tipolistaprecioSessionBean.setsUltimaBusquedaTipoListaPrecio("");
		this.tipolistaprecioSessionBean.setiNumeroPaginacion(TipoListaPrecioConstantesFunciones.INUMEROPAGINACION);
		this.tipolistaprecioSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoListaPrecio(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoListaPrecio() {
		this.updateBorderResaltarBusquedasFormularioTipoListaPrecio();
		this.updateVisibilidadBusquedasFormularioTipoListaPrecio();
		this.updateHabilitarBusquedasFormularioTipoListaPrecio();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoListaPrecio() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoListaPrecio.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoListaPrecio() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoListaPrecio.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoListaPrecio() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoListaPrecio.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoListaPrecio(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarTipoListaPrecio.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoListaPrecio() throws Exception {

		if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoListaPrecio();
		this.updateVisibilidadResaltarControlesFormularioTipoListaPrecio();
		this.updateHabilitarResaltarControlesFormularioTipoListaPrecio();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoListaPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipolistaprecioConstantesFunciones.resaltaridTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio!=null) {this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.setBorder(this.tipolistaprecioConstantesFunciones.resaltaridTipoListaPrecio);}
		if(this.tipolistaprecioConstantesFunciones.resaltarid_empresaTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio!=null) {this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.setBorder(this.tipolistaprecioConstantesFunciones.resaltarid_empresaTipoListaPrecio);}
		if(this.tipolistaprecioConstantesFunciones.resaltarcodigoTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio!=null) {this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreacodigoTipoListaPrecio.setBorder(this.tipolistaprecioConstantesFunciones.resaltarcodigoTipoListaPrecio);}
		if(this.tipolistaprecioConstantesFunciones.resaltarnombreTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio!=null) {this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreanombreTipoListaPrecio.setBorder(this.tipolistaprecioConstantesFunciones.resaltarnombreTipoListaPrecio);}
		if(this.tipolistaprecioConstantesFunciones.resaltarfecha_desdeTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio!=null) {this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_desdeTipoListaPrecio.setBorder(this.tipolistaprecioConstantesFunciones.resaltarfecha_desdeTipoListaPrecio);}
		if(this.tipolistaprecioConstantesFunciones.resaltarfecha_hastaTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio!=null) {this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_hastaTipoListaPrecio.setBorder(this.tipolistaprecioConstantesFunciones.resaltarfecha_hastaTipoListaPrecio);}
		if(this.tipolistaprecioConstantesFunciones.resaltaresta_activoTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio!=null) {this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxesta_activoTipoListaPrecio.setBorderPainted(true);this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxesta_activoTipoListaPrecio.setBorder(this.tipolistaprecioConstantesFunciones.resaltaresta_activoTipoListaPrecio);}
		if(this.tipolistaprecioConstantesFunciones.resaltardescripcionTipoListaPrecio!=null && this.jInternalFrameDetalleFormTipoListaPrecio!=null) {this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreadescripcionTipoListaPrecio.setBorder(this.tipolistaprecioConstantesFunciones.resaltardescripcionTipoListaPrecio);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoListaPrecio() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
	
		//this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostraridTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jPanelidTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostraridTipoListaPrecio);
		//this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarid_empresaTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jPanelid_empresaTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarid_empresaTipoListaPrecio);
		//this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreacodigoTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarcodigoTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jPanelcodigoTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarcodigoTipoListaPrecio);
		//this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreanombreTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarnombreTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jPanelnombreTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarnombreTipoListaPrecio);
		//this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_desdeTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarfecha_desdeTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jPanelfecha_desdeTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarfecha_desdeTipoListaPrecio);
		//this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_hastaTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarfecha_hastaTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jPanelfecha_hastaTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrarfecha_hastaTipoListaPrecio);
		//this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxesta_activoTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostraresta_activoTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jPanelesta_activoTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostraresta_activoTipoListaPrecio);
		//this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreadescripcionTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrardescripcionTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jPaneldescripcionTipoListaPrecio.setVisible(this.tipolistaprecioConstantesFunciones.mostrardescripcionTipoListaPrecio);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoListaPrecio() throws Exception {
		if(this.jInternalFrameDetalleFormTipoListaPrecio==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoListaPrecio!=null) {
	
		this.jInternalFrameDetalleFormTipoListaPrecio.jLabelidTipoListaPrecio.setEnabled(this.tipolistaprecioConstantesFunciones.activaridTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jComboBoxid_empresaTipoListaPrecio.setEnabled(this.tipolistaprecioConstantesFunciones.activarid_empresaTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreacodigoTipoListaPrecio.setEnabled(this.tipolistaprecioConstantesFunciones.activarcodigoTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreanombreTipoListaPrecio.setEnabled(this.tipolistaprecioConstantesFunciones.activarnombreTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_desdeTipoListaPrecio.setEnabled(this.tipolistaprecioConstantesFunciones.activarfecha_desdeTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jDateChooserfecha_hastaTipoListaPrecio.setEnabled(this.tipolistaprecioConstantesFunciones.activarfecha_hastaTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jCheckBoxesta_activoTipoListaPrecio.setEnabled(this.tipolistaprecioConstantesFunciones.activaresta_activoTipoListaPrecio);
		this.jInternalFrameDetalleFormTipoListaPrecio.jTextAreadescripcionTipoListaPrecio.setEnabled(this.tipolistaprecioConstantesFunciones.activardescripcionTipoListaPrecio);
		}
	}
	
		
}