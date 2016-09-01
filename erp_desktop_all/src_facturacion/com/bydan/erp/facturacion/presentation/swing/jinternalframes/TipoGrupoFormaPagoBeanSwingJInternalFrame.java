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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;




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

import com.bydan.erp.facturacion.util.TipoGrupoFormaPagoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoGrupoFormaPagoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoGrupoFormaPagoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoGrupoFormaPagoBean;
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

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.puntoventa.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.puntoventa.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.puntoventa.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.puntoventa.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.puntoventa.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoGrupoFormaPagoBeanSwingJInternalFrame extends TipoGrupoFormaPagoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoGrupoFormaPagoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoGrupoFormaPago> tipogrupoformapagoValidator = new ClassValidator<TipoGrupoFormaPago>(TipoGrupoFormaPago.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoGrupoFormaPago tipogrupoformapago;	
	public TipoGrupoFormaPago tipogrupoformapagoAux;
	public TipoGrupoFormaPago tipogrupoformapagoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoGrupoFormaPago tipogrupoformapagoTotales;
	public Long idTipoGrupoFormaPagoActual;
	public Long iIdNuevoTipoGrupoFormaPago=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosTipoFormaPago=false;

	public Boolean getIsTienePermisosTipoFormaPago() {
		return isTienePermisosTipoFormaPago;
	}

	public void setIsTienePermisosTipoFormaPago(Boolean isTienePermisosTipoFormaPago) {
		this.isTienePermisosTipoFormaPago= isTienePermisosTipoFormaPago;
	}


	public Boolean isTienePermisosDatoGeneralEmpleado=false;

	public Boolean getIsTienePermisosDatoGeneralEmpleado() {
		return isTienePermisosDatoGeneralEmpleado;
	}

	public void setIsTienePermisosDatoGeneralEmpleado(Boolean isTienePermisosDatoGeneralEmpleado) {
		this.isTienePermisosDatoGeneralEmpleado= isTienePermisosDatoGeneralEmpleado;
	}


	public Boolean isTienePermisosAnticipoCliente=false;

	public Boolean getIsTienePermisosAnticipoCliente() {
		return isTienePermisosAnticipoCliente;
	}

	public void setIsTienePermisosAnticipoCliente(Boolean isTienePermisosAnticipoCliente) {
		this.isTienePermisosAnticipoCliente= isTienePermisosAnticipoCliente;
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
	
	public Boolean isPermisoTodoTipoGrupoFormaPago;
	public Boolean isPermisoNuevoTipoGrupoFormaPago;
	public Boolean isPermisoActualizarTipoGrupoFormaPago;
	public Boolean isPermisoActualizarOriginalTipoGrupoFormaPago;
	public Boolean isPermisoEliminarTipoGrupoFormaPago;
	public Boolean isPermisoGuardarCambiosTipoGrupoFormaPago;
	public Boolean isPermisoConsultaTipoGrupoFormaPago;
	public Boolean isPermisoBusquedaTipoGrupoFormaPago;
	public Boolean isPermisoReporteTipoGrupoFormaPago;
	public Boolean isPermisoPaginacionMedioTipoGrupoFormaPago;
	public Boolean isPermisoPaginacionAltoTipoGrupoFormaPago;
	public Boolean isPermisoPaginacionTodoTipoGrupoFormaPago;
	public Boolean isPermisoCopiarTipoGrupoFormaPago;
	public Boolean isPermisoVerFormTipoGrupoFormaPago;
	public Boolean isPermisoDuplicarTipoGrupoFormaPago;
	public Boolean isPermisoOrdenTipoGrupoFormaPago;
	
	
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
	
	public TipoGrupoFormaPagoParameterReturnGeneral tipogrupoformapagoReturnGeneral;
	public TipoGrupoFormaPagoParameterReturnGeneral tipogrupoformapagoParameterGeneral;
	
	

	public TipoFormaPagoLogic tipoformapagoLogic=null;

	public TipoFormaPagoLogic getTipoFormaPagoLogic() {
		return tipoformapagoLogic;
	}

	public void setTipoFormaPagoLogic(TipoFormaPagoLogic tipoformapagoLogic) {
		this.tipoformapagoLogic = tipoformapagoLogic;
	}


	public DatoGeneralEmpleadoLogic datogeneralempleadoLogic=null;

	public DatoGeneralEmpleadoLogic getDatoGeneralEmpleadoLogic() {
		return datogeneralempleadoLogic;
	}

	public void setDatoGeneralEmpleadoLogic(DatoGeneralEmpleadoLogic datogeneralempleadoLogic) {
		this.datogeneralempleadoLogic = datogeneralempleadoLogic;
	}


	public AnticipoClienteLogic anticipoclienteLogic=null;

	public AnticipoClienteLogic getAnticipoClienteLogic() {
		return anticipoclienteLogic;
	}

	public void setAnticipoClienteLogic(AnticipoClienteLogic anticipoclienteLogic) {
		this.anticipoclienteLogic = anticipoclienteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoGrupoFormaPago=false;
	public Boolean esParaAccionDesdeFormularioTipoGrupoFormaPago=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoGrupoFormaPagoSessionBeanAdditional tipogrupoformapagoSessionBeanAdditional=null;
	
	public TipoGrupoFormaPagoSessionBeanAdditional getTipoGrupoFormaPagoSessionBeanAdditional() {
		return this.tipogrupoformapagoSessionBeanAdditional;
	}
	
	public void setTipoGrupoFormaPagoSessionBeanAdditional(TipoGrupoFormaPagoSessionBeanAdditional tipogrupoformapagoSessionBeanAdditional) {
		try {
			this.tipogrupoformapagoSessionBeanAdditional=tipogrupoformapagoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional tipogrupoformapagoBeanSwingJInternalFrameAdditional=null;
	//public class TipoGrupoFormaPagoBeanSwingJInternalFrame
	
	public TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional getTipoGrupoFormaPagoBeanSwingJInternalFrameAdditional() {
		return this.tipogrupoformapagoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoGrupoFormaPagoBeanSwingJInternalFrameAdditional(TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional tipogrupoformapagoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipogrupoformapagoBeanSwingJInternalFrameAdditional=tipogrupoformapagoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoGrupoFormaPagoLogic tipogrupoformapagoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoGrupoFormaPago tipogrupoformapagoBean;
	public TipoGrupoFormaPagoConstantesFunciones tipogrupoformapagoConstantesFunciones;
	//public TipoGrupoFormaPagoParameterReturnGeneral tipogrupoformapagoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoGrupoFormaPago> tipogrupoformapagos;	
	//public List<TipoGrupoFormaPago> tipogrupoformapagosEliminados;
	//public List<TipoGrupoFormaPago> tipogrupoformapagosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoGrupoFormaPago=false;
	public Boolean isVisibilidadCeldaDuplicarTipoGrupoFormaPago=true;
	public Boolean isVisibilidadCeldaCopiarTipoGrupoFormaPago=true;
	public Boolean isVisibilidadCeldaVerFormTipoGrupoFormaPago=true;
	public Boolean isVisibilidadCeldaOrdenTipoGrupoFormaPago=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;
	public Boolean isVisibilidadCeldaModificarTipoGrupoFormaPago=false;
	public Boolean isVisibilidadCeldaActualizarTipoGrupoFormaPago=false;
	public Boolean isVisibilidadCeldaEliminarTipoGrupoFormaPago=false;
	public Boolean isVisibilidadCeldaCancelarTipoGrupoFormaPago=false;
	public Boolean isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=false;	
	
	
	public Boolean isVisibilidadBusquedaPorId=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoGrupoFormaPago() {
		return this.iIdNuevoTipoGrupoFormaPago;
	}

	public void setiIdNuevoTipoGrupoFormaPago(Long iIdNuevoTipoGrupoFormaPago) {
		this.iIdNuevoTipoGrupoFormaPago = iIdNuevoTipoGrupoFormaPago;
	}
	
	public Long getidTipoGrupoFormaPagoActual() {
		return this.idTipoGrupoFormaPagoActual;
	}

	public void setidTipoGrupoFormaPagoActual(Long idTipoGrupoFormaPagoActual) {
		this.idTipoGrupoFormaPagoActual = idTipoGrupoFormaPagoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoGrupoFormaPago gettipogrupoformapago() {
		return this.tipogrupoformapago;
	}

	public void settipogrupoformapago(TipoGrupoFormaPago tipogrupoformapago) {
		this.tipogrupoformapago = tipogrupoformapago;
	}
	
	public TipoGrupoFormaPago gettipogrupoformapagoAux() {
		return this.tipogrupoformapagoAux;
	}

	public void settipogrupoformapagoAux(TipoGrupoFormaPago tipogrupoformapagoAux) {
		this.tipogrupoformapagoAux = tipogrupoformapagoAux;
	}				
	
	public TipoGrupoFormaPago gettipogrupoformapagoAnterior() {
		return this.tipogrupoformapagoAnterior;
	}

	public void settipogrupoformapagoAnterior(TipoGrupoFormaPago tipogrupoformapagoAnterior) {
		this.tipogrupoformapagoAnterior = tipogrupoformapagoAnterior;
	}	
	
	public TipoGrupoFormaPago gettipogrupoformapagoTotales() {
		return this.tipogrupoformapagoTotales;
	}

	public void settipogrupoformapagoTotales(TipoGrupoFormaPago tipogrupoformapagoTotales) {
		this.tipogrupoformapagoTotales = tipogrupoformapagoTotales;
	}	
	
	public TipoGrupoFormaPago gettipogrupoformapagoBean() {
		return this.tipogrupoformapagoBean;
	}

	public void settipogrupoformapagoBean(TipoGrupoFormaPago tipogrupoformapagoBean) {
		this.tipogrupoformapagoBean = tipogrupoformapagoBean;
	}	
	
	public TipoGrupoFormaPagoParameterReturnGeneral gettipogrupoformapagoReturnGeneral() {
		return this.tipogrupoformapagoReturnGeneral;
	}

	public void settipogrupoformapagoReturnGeneral(TipoGrupoFormaPagoParameterReturnGeneral tipogrupoformapagoReturnGeneral) {
		this.tipogrupoformapagoReturnGeneral = tipogrupoformapagoReturnGeneral;
	}	
	
	
	public Long idBusquedaPorId=0L;

	public Long getidBusquedaPorId() {
		return this.idBusquedaPorId;
	}

	public void setidBusquedaPorId(Long idBusquedaPorId) {
		this.idBusquedaPorId = idBusquedaPorId;
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
	
	
	public TipoGrupoFormaPagoLogic getTipoGrupoFormaPagoLogic()	{		
		return tipogrupoformapagoLogic;
	}

	public void setTipoGrupoFormaPagoLogic(TipoGrupoFormaPagoLogic tipogrupoformapagoLogic) {
		this.tipogrupoformapagoLogic = tipogrupoformapagoLogic;
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
	
	public Boolean getIsEsNuevoTipoGrupoFormaPago() {
		return isEsNuevoTipoGrupoFormaPago;
	}

	public void setIsEsNuevoTipoGrupoFormaPago(Boolean isEsNuevoTipoGrupoFormaPago) {
		this.isEsNuevoTipoGrupoFormaPago = isEsNuevoTipoGrupoFormaPago;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoGrupoFormaPago() {
		return esParaAccionDesdeFormularioTipoGrupoFormaPago;
	}
	
	public void setEsParaAccionDesdeFormularioTipoGrupoFormaPago(Boolean esParaAccionDesdeFormularioTipoGrupoFormaPago) {
		this.esParaAccionDesdeFormularioTipoGrupoFormaPago = esParaAccionDesdeFormularioTipoGrupoFormaPago;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoGrupoFormaPago() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoGrupoFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoGrupoFormaPago(this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoGrupoFormaPagoConstantesFunciones.refrescarForeignKeysDescripcionesTipoGrupoFormaPago(this.tipogrupoformapagos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipogrupoformapagoLogic.setTipoGrupoFormaPagos(this.tipogrupoformapagos);
			tipogrupoformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoGrupoFormaPagoParameterReturnGeneral getTipoGrupoFormaPagoParameterGeneral() {
		return this.tipogrupoformapagoParameterGeneral;
	}
	
	public void setTipoGrupoFormaPagoParameterGeneral(TipoGrupoFormaPagoParameterReturnGeneral tipogrupoformapagoParameterGeneral) {
		this.tipogrupoformapagoParameterGeneral = tipogrupoformapagoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoGrupoFormaPago() {
		return isPermisoTodoTipoGrupoFormaPago;
	}

	public void setIsPermisoTodoTipoGrupoFormaPago(Boolean isPermisoTodoTipoGrupoFormaPago) {
		this.isPermisoTodoTipoGrupoFormaPago = isPermisoTodoTipoGrupoFormaPago;
	}

	public Boolean getIsPermisoNuevoTipoGrupoFormaPago() {
		return isPermisoNuevoTipoGrupoFormaPago;
	}

	public void setIsPermisoNuevoTipoGrupoFormaPago(Boolean isPermisoNuevoTipoGrupoFormaPago) {
		this.isPermisoNuevoTipoGrupoFormaPago = isPermisoNuevoTipoGrupoFormaPago;
	}

	public Boolean getIsPermisoActualizarTipoGrupoFormaPago() {
		return isPermisoActualizarTipoGrupoFormaPago;
	}

	public void setIsPermisoActualizarTipoGrupoFormaPago(Boolean isPermisoActualizarTipoGrupoFormaPago) {
		this.isPermisoActualizarTipoGrupoFormaPago = isPermisoActualizarTipoGrupoFormaPago;
	}

	public Boolean getIsPermisoEliminarTipoGrupoFormaPago() {
		return isPermisoEliminarTipoGrupoFormaPago;
	}

	public void setIsPermisoEliminarTipoGrupoFormaPago(Boolean isPermisoEliminarTipoGrupoFormaPago) {
		this.isPermisoEliminarTipoGrupoFormaPago = isPermisoEliminarTipoGrupoFormaPago;
	}

	public Boolean getIsPermisoGuardarCambiosTipoGrupoFormaPago() {
		return isPermisoGuardarCambiosTipoGrupoFormaPago;
	}

	public void setIsPermisoGuardarCambiosTipoGrupoFormaPago(Boolean isPermisoGuardarCambiosTipoGrupoFormaPago) {
		this.isPermisoGuardarCambiosTipoGrupoFormaPago = isPermisoGuardarCambiosTipoGrupoFormaPago;
	}
	
	public Boolean getIsPermisoConsultaTipoGrupoFormaPago() {
		return isPermisoConsultaTipoGrupoFormaPago;
	}

	public void setIsPermisoConsultaTipoGrupoFormaPago(Boolean isPermisoConsultaTipoGrupoFormaPago) {
		this.isPermisoConsultaTipoGrupoFormaPago = isPermisoConsultaTipoGrupoFormaPago;
	}

	public Boolean getIsPermisoBusquedaTipoGrupoFormaPago() {
		return isPermisoBusquedaTipoGrupoFormaPago;
	}

	public void setIsPermisoBusquedaTipoGrupoFormaPago(Boolean isPermisoBusquedaTipoGrupoFormaPago) {
		this.isPermisoBusquedaTipoGrupoFormaPago = isPermisoBusquedaTipoGrupoFormaPago;
	}

	public Boolean getIsPermisoReporteTipoGrupoFormaPago() {
		return isPermisoReporteTipoGrupoFormaPago;
	}

	public void setIsPermisoReporteTipoGrupoFormaPago(Boolean isPermisoReporteTipoGrupoFormaPago) {
		this.isPermisoReporteTipoGrupoFormaPago = isPermisoReporteTipoGrupoFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoGrupoFormaPago() {
		return isPermisoPaginacionMedioTipoGrupoFormaPago;
	}

	public void setIsPermisoPaginacionMedioTipoGrupoFormaPago(Boolean isPermisoPaginacionMedioTipoGrupoFormaPago) {
		this.isPermisoPaginacionMedioTipoGrupoFormaPago = isPermisoPaginacionMedioTipoGrupoFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoGrupoFormaPago() {
		return isPermisoPaginacionTodoTipoGrupoFormaPago;
	}

	public void setIsPermisoPaginacionTodoTipoGrupoFormaPago(Boolean isPermisoPaginacionTodoTipoGrupoFormaPago) {
		this.isPermisoPaginacionTodoTipoGrupoFormaPago = isPermisoPaginacionTodoTipoGrupoFormaPago;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoGrupoFormaPago() {
		return isPermisoPaginacionAltoTipoGrupoFormaPago;
	}

	public void setIsPermisoPaginacionAltoTipoGrupoFormaPago(Boolean isPermisoPaginacionAltoTipoGrupoFormaPago) {
		this.isPermisoPaginacionAltoTipoGrupoFormaPago = isPermisoPaginacionAltoTipoGrupoFormaPago;
	}
	
	public Boolean getIsPermisoCopiarTipoGrupoFormaPago() {
		return isPermisoCopiarTipoGrupoFormaPago;
	}

	public void setIsPermisoCopiarTipoGrupoFormaPago(Boolean isPermisoCopiarTipoGrupoFormaPago) {
		this.isPermisoCopiarTipoGrupoFormaPago = isPermisoCopiarTipoGrupoFormaPago;
	}
	
	public Boolean getIsPermisoVerFormTipoGrupoFormaPago() {
		return isPermisoVerFormTipoGrupoFormaPago;
	}

	public void setIsPermisoVerFormTipoGrupoFormaPago(Boolean isPermisoVerFormTipoGrupoFormaPago) {
		this.isPermisoVerFormTipoGrupoFormaPago = isPermisoVerFormTipoGrupoFormaPago;
	}
	
	public Boolean getIsPermisoDuplicarTipoGrupoFormaPago() {
		return isPermisoDuplicarTipoGrupoFormaPago;
	}

	public void setIsPermisoDuplicarTipoGrupoFormaPago(Boolean isPermisoDuplicarTipoGrupoFormaPago) {
		this.isPermisoDuplicarTipoGrupoFormaPago = isPermisoDuplicarTipoGrupoFormaPago;
	}
	
	public Boolean getIsPermisoOrdenTipoGrupoFormaPago() {
		return isPermisoOrdenTipoGrupoFormaPago;
	}

	public void setIsPermisoOrdenTipoGrupoFormaPago(Boolean isPermisoOrdenTipoGrupoFormaPago) {
		this.isPermisoOrdenTipoGrupoFormaPago = isPermisoOrdenTipoGrupoFormaPago;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoGrupoFormaPago() {
		return isVisibilidadCeldaNuevoTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoTipoGrupoFormaPago(Boolean isVisibilidadCeldaNuevoTipoGrupoFormaPago) {
		this.isVisibilidadCeldaNuevoTipoGrupoFormaPago = isVisibilidadCeldaNuevoTipoGrupoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoGrupoFormaPago() {
		return isVisibilidadCeldaDuplicarTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaDuplicarTipoGrupoFormaPago(Boolean isVisibilidadCeldaDuplicarTipoGrupoFormaPago) {
		this.isVisibilidadCeldaDuplicarTipoGrupoFormaPago = isVisibilidadCeldaDuplicarTipoGrupoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoGrupoFormaPago() {
		return isVisibilidadCeldaCopiarTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaCopiarTipoGrupoFormaPago(Boolean isVisibilidadCeldaCopiarTipoGrupoFormaPago) {
		this.isVisibilidadCeldaCopiarTipoGrupoFormaPago = isVisibilidadCeldaCopiarTipoGrupoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoGrupoFormaPago() {
		return isVisibilidadCeldaVerFormTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaVerFormTipoGrupoFormaPago(Boolean isVisibilidadCeldaVerFormTipoGrupoFormaPago) {
		this.isVisibilidadCeldaVerFormTipoGrupoFormaPago = isVisibilidadCeldaVerFormTipoGrupoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoGrupoFormaPago() {
		return isVisibilidadCeldaOrdenTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaOrdenTipoGrupoFormaPago(Boolean isVisibilidadCeldaOrdenTipoGrupoFormaPago) {
		this.isVisibilidadCeldaOrdenTipoGrupoFormaPago = isVisibilidadCeldaOrdenTipoGrupoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago() {
		return isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago(Boolean isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago) {
		this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago = isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoGrupoFormaPago() {
		return isVisibilidadCeldaModificarTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaModificarTipoGrupoFormaPago(Boolean isVisibilidadCeldaModificarTipoGrupoFormaPago) {
		this.isVisibilidadCeldaModificarTipoGrupoFormaPago = isVisibilidadCeldaModificarTipoGrupoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoGrupoFormaPago() {
		return isVisibilidadCeldaActualizarTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaActualizarTipoGrupoFormaPago(Boolean isVisibilidadCeldaActualizarTipoGrupoFormaPago) {
		this.isVisibilidadCeldaActualizarTipoGrupoFormaPago = isVisibilidadCeldaActualizarTipoGrupoFormaPago;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoGrupoFormaPago() {
		return isVisibilidadCeldaEliminarTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaEliminarTipoGrupoFormaPago(Boolean isVisibilidadCeldaEliminarTipoGrupoFormaPago) {
		this.isVisibilidadCeldaEliminarTipoGrupoFormaPago = isVisibilidadCeldaEliminarTipoGrupoFormaPago;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoGrupoFormaPago() {
		return isVisibilidadCeldaCancelarTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaCancelarTipoGrupoFormaPago(Boolean isVisibilidadCeldaCancelarTipoGrupoFormaPago) {
		this.isVisibilidadCeldaCancelarTipoGrupoFormaPago = isVisibilidadCeldaCancelarTipoGrupoFormaPago;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoGrupoFormaPago() {
		return isVisibilidadCeldaGuardarTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarTipoGrupoFormaPago(Boolean isVisibilidadCeldaGuardarTipoGrupoFormaPago) {
		this.isVisibilidadCeldaGuardarTipoGrupoFormaPago = isVisibilidadCeldaGuardarTipoGrupoFormaPago;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago() {
		return isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago(Boolean isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago) {
		this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago = isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago;
	}
		
	public TipoGrupoFormaPagoSessionBean gettipogrupoformapagoSessionBean() {
		return this.tipogrupoformapagoSessionBean;
	}
	
	public void settipogrupoformapagoSessionBean(TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean) {
		this.tipogrupoformapagoSessionBean=tipogrupoformapagoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorId() {
		return this.isVisibilidadBusquedaPorId;
	}

	public void setisVisibilidadBusquedaPorId(Boolean isVisibilidadBusquedaPorId) {
		this.isVisibilidadBusquedaPorId=isVisibilidadBusquedaPorId;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoGrupoFormaPago tipogrupoformapago,TipoGrupoFormaPago tipogrupoformapagoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoGrupoFormaPago(tipogrupoformapago);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipogrupoformapagoAux.setId(tipogrupoformapago.getId());
		tipogrupoformapagoAux.setVersionRow(tipogrupoformapago.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoGrupoFormaPago();
		
			int intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipogrupoformapagoValidator.getInvalidValues(this.tipogrupoformapago);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipogrupoformapagoLogic.setDatosCliente(datosCliente);
			tipogrupoformapagoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipogrupoformapagoAux=new  TipoGrupoFormaPago();
				
				tipogrupoformapagoAux.setIsNew(true);
				tipogrupoformapagoAux.setIsChanged(true);
				
				tipogrupoformapagoAux.setTipoGrupoFormaPagoOriginal(this.tipogrupoformapago);
				
				tipogrupoformapagoAux.setId(this.tipogrupoformapago.getId());	
				tipogrupoformapagoAux.setVersionRow(this.tipogrupoformapago.getVersionRow());	
				tipogrupoformapagoAux.setnombre(this.tipogrupoformapago.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipogrupoformapagoAux,tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoformapagoAux,tipogrupoformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoformapagoLogic.saveTipoGrupoFormaPagos();//WithConnection
						//tipogrupoformapagoLogic.getSetVersionRowTipoGrupoFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogrupoformapago,tipogrupoformapagoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos().addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes().addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagos.addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientes.addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogrupoformapagoLogic.saveTipoGrupoFormaPagoRelaciones(tipogrupoformapagoAux,this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos(),this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());//WithConnection
								//tipogrupoformapagoLogic.getSetVersionRowTipoGrupoFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipogrupoformapago,tipogrupoformapagoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.setTipoFormaPagos(new ArrayList<TipoFormaPago>());
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagos= new ArrayList<TipoFormaPago>();
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientes= new ArrayList<AnticipoCliente>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoformapagoAux.setTipoFormaPagos(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos());

							if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoformapagoAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoformapagoAux.setAnticipoClientes(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipogrupoformapagoAux,tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipogrupoformapagoAux,tipogrupoformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipogrupoformapago,tipogrupoformapagoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipogrupoformapagoAux=new  TipoGrupoFormaPago();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado() && this.tipogrupoformapago.getId()>=0)) {
						
					tipogrupoformapagoAux.setIsNew(false);
				}
				
				tipogrupoformapagoAux.setIsDeleted(false);
			
				tipogrupoformapagoAux.setId(this.tipogrupoformapago.getId());	
				tipogrupoformapagoAux.setVersionRow(this.tipogrupoformapago.getVersionRow());	
				tipogrupoformapagoAux.setnombre(this.tipogrupoformapago.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogrupoformapagoAux,tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoformapagoAux,tipogrupoformapagos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoformapagoLogic.saveTipoGrupoFormaPagos();//WithConnection
						//tipogrupoformapagoLogic.getSetVersionRowTipoGrupoFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipogrupoformapago,tipogrupoformapagoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos().addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes().addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagos.addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientes.addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogrupoformapagoLogic.saveTipoGrupoFormaPagoRelaciones(tipogrupoformapagoAux,this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos(),this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());//WithConnection
								//tipogrupoformapagoLogic.getSetVersionRowTipoGrupoFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipogrupoformapago,tipogrupoformapagoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.setTipoFormaPagos(new ArrayList<TipoFormaPago>());
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagos= new ArrayList<TipoFormaPago>();
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientes= new ArrayList<AnticipoCliente>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoformapagoAux.setTipoFormaPagos(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos());

							if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoformapagoAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoformapagoAux.setAnticipoClientes(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipogrupoformapagoAux,tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipogrupoformapagoAux,tipogrupoformapagos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipogrupoformapago,tipogrupoformapagoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipogrupoformapagoAux=new  TipoGrupoFormaPago();
				
				tipogrupoformapagoAux.setIsNew(false);
				tipogrupoformapagoAux.setIsChanged(false);
				
				tipogrupoformapagoAux.setIsDeleted(true);
				
				tipogrupoformapagoAux.setId(this.tipogrupoformapago.getId());	
				tipogrupoformapagoAux.setVersionRow(this.tipogrupoformapago.getVersionRow());	
				tipogrupoformapagoAux.setnombre(this.tipogrupoformapago.getnombre());	
				
				if(this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipogrupoformapagoAux.getId()>=0) {	
						this.tipogrupoformapagosEliminados.add(tipogrupoformapagoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipogrupoformapagoAux,tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoformapagoAux,tipogrupoformapagos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoformapagoLogic.saveTipoGrupoFormaPagos();//WithConnection
						//tipogrupoformapagoLogic.getSetVersionRowTipoGrupoFormaPagos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos().addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados().addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes().addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagos.addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados.addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadosEliminados);
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientes.addAll(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipogrupoformapagoLogic.saveTipoGrupoFormaPagoRelaciones(tipogrupoformapagoAux,this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos(),this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados(),this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());//WithConnection
								//tipogrupoformapagoLogic.getSetVersionRowTipoGrupoFormaPagos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.setTipoFormaPagos(new ArrayList<TipoFormaPago>());
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(new ArrayList<DatoGeneralEmpleado>());
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(new ArrayList<AnticipoCliente>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagos= new ArrayList<TipoFormaPago>();
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados= new ArrayList<DatoGeneralEmpleado>();
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientes= new ArrayList<AnticipoCliente>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoformapagoAux.setTipoFormaPagos(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos());

							if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoformapagoAux.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());

							if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.quitarFilaTotales();}
							tipogrupoformapagoAux.setAnticipoClientes(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipogrupoformapagoAux,tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipogrupoformapagoAux,tipogrupoformapagos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().addAll(this.tipogrupoformapagosEliminados);
					
					tipogrupoformapagoLogic.saveTipoGrupoFormaPagos();//WithConnection
					//tipogrupoformapagoLogic.getSetVersionRowTipoGrupoFormaPagos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipogrupoformapagosEliminados= new ArrayList<TipoGrupoFormaPago>();		
			}
			
			if(this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Grupo Forma Pago GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipogrupoformapago=tipogrupoformapagoAux;
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
      		//this.finishProcessTipoGrupoFormaPago();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoGrupoFormaPago tipogrupoformapagoLocal) throws Exception {
		
		if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipogrupoformapagoLocal.setTipoFormaPagos(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos());
				tipogrupoformapagoLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
				tipogrupoformapagoLocal.setAnticipoClientes(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
			
			} else {
			
				tipogrupoformapagoLocal.setTipoFormaPagos(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagos);
				tipogrupoformapagoLocal.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleados);
				tipogrupoformapagoLocal.setAnticipoClientes(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclientes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoGrupoFormaPago tipogrupoformapagoLocal) throws Exception {	
		if(this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoGrupoFormaPagoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipogrupoformapagoValidator.getInvalidValues(this.tipogrupoformapago);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoGrupoFormaPago tipogrupoformapago,List<TipoGrupoFormaPago> tipogrupoformapagos) throws Exception {
		try	{		
			TipoGrupoFormaPagoConstantesFunciones.actualizarLista(tipogrupoformapago,tipogrupoformapagos,this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoGrupoFormaPago tipogrupoformapago,List<TipoGrupoFormaPago> tipogrupoformapagos) throws Exception {
		try	{			
			TipoGrupoFormaPagoConstantesFunciones.actualizarSelectedLista(tipogrupoformapago,tipogrupoformapagos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoGrupoFormaPago> tipogrupoformapagosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipogrupoformapagosLocal=this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipogrupoformapagosLocal=this.tipogrupoformapagos;
			}
			//ARCHITECTURE
		
			for(TipoGrupoFormaPago tipogrupoformapagoLocal:tipogrupoformapagosLocal) {
				if(this.permiteMantenimiento(tipogrupoformapagoLocal) && tipogrupoformapagoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoGrupoFormaPagoConstantesFunciones.getTipoGrupoFormaPagoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoGrupoFormaPagoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoFormaPago.jLabelnombreTipoGrupoFormaPago,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoGrupoFormaPago.jLabelnombreTipoGrupoFormaPago,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("TipoFormaPago")) {
			if(this.tipogrupoformapago==null) {
				this.tipogrupoformapago= new TipoGrupoFormaPago();
			}

			if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGrupoFormaPago
				this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);

				this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.gettipoformapago().setTipoGrupoFormaPago(this.tipogrupoformapago);
			}

			return;
		}
		 else  if(sTipo.equals("DatoGeneralEmpleado")) {
			if(this.tipogrupoformapago==null) {
				this.tipogrupoformapago= new TipoGrupoFormaPago();
			}

			if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGrupoFormaPago
				this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);

				this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.getdatogeneralempleado().setTipoGrupoFormaPago(this.tipogrupoformapago);
			}

			return;
		}
		 else  if(sTipo.equals("AnticipoCliente")) {
			if(this.tipogrupoformapago==null) {
				this.tipogrupoformapago= new TipoGrupoFormaPago();
			}

			if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoGrupoFormaPago
				this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);

				this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.getanticipocliente().setTipoGrupoFormaPago(this.tipogrupoformapago);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoGrupoFormaPago--;	
		
		
		this.tipogrupoformapagoAux=new TipoGrupoFormaPago();
		
		this.tipogrupoformapagoAux.setId(this.iIdNuevoTipoGrupoFormaPago);
		this.tipogrupoformapagoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().add(this.tipogrupoformapagoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipogrupoformapagos.add(this.tipogrupoformapagoAux);
		}
		//ARCHITECTURE
		
		this.tipogrupoformapago=this.tipogrupoformapagoAux;
		
		if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoGrupoFormaPago(this.tipogrupoformapago);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFormaPago(this.tipogrupoformapago);
		}
				
		//this.setDefaultControlesTipoGrupoFormaPago();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoGrupoFormaPago();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoGrupoFormaPago();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoFormaPago();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapagoBean,this.tipogrupoformapago,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
			classes=TipoGrupoFormaPagoConstantesFunciones.getClassesRelationshipsOfTipoGrupoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipogrupoformapagoReturnGeneral=tipogrupoformapagoLogic.procesarEventosTipoGrupoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos(),this.tipogrupoformapago,this.tipogrupoformapagoParameterGeneral,this.isEsNuevoTipoGrupoFormaPago,classes);//this.tipogrupoformapagoLogic.getTipoGrupoFormaPago()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoGrupoFormaPago(this.tipogrupoformapagoReturnGeneral,this.tipogrupoformapagoBean,false);
		
		if(this.tipogrupoformapagoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFormaPago(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoGrupoFormaPago(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago());
		}
		
		if(this.tipogrupoformapagoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoFormaPago(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago(),classes);//this.tipogrupoformapagoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoGrupoFormaPago();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoGrupoFormaPago();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.RecargarFormTipoGrupoFormaPago(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoGrupoFormaPago(false);
						
			if(tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.getEsGuardarRelacionado() && TipoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoFormaPagoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.getEsGuardarRelacionado() && AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAnticipoClienteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoFormaPago();
			}
			
			this.actualizarVisualTableDatosTipoGrupoFormaPago();
			
			this.jTableDatosTipoGrupoFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoFormaPago(), this.getIndiceNuevoTipoGrupoFormaPago());
			
			this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
						
			this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoGrupoFormaPago(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextAreanombreTipoGrupoFormaPago.setEnabled(isHabilitar && this.tipogrupoformapagoConstantesFunciones.activarnombreTipoGrupoFormaPago);	
		
	};
	
	public void setDefaultControlesTipoGrupoFormaPago() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoGrupoFormaPago(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipogrupoformapagoSessionBean.setConGuardarRelaciones(true);			
			this.tipogrupoformapagoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipogrupoformapagoSessionBean.setConGuardarRelaciones(false);			
			this.tipogrupoformapagoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoGrupoFormaPago() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
				if(tipogrupoformapagoAux.getId().equals(this.iIdNuevoTipoGrupoFormaPago)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagos) {
				if(tipogrupoformapagoAux.getId().equals(this.iIdNuevoTipoGrupoFormaPago)) {
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
	
	public int getIndiceActualTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
				if(tipogrupoformapagoAux.getId().equals(tipogrupoformapago.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagos) {
				if(tipogrupoformapagoAux.getId().equals(tipogrupoformapago.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapagoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
				if(tipogrupoformapagoAux.getTipoGrupoFormaPagoOriginal().getId().equals(tipogrupoformapagoOriginal.getId())) {
					existe=true;
					tipogrupoformapagoOriginal.setId(tipogrupoformapagoAux.getId());
					tipogrupoformapagoOriginal.setVersionRow(tipogrupoformapagoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagos) {
				if(tipogrupoformapagoAux.getTipoGrupoFormaPagoOriginal().getId().equals(tipogrupoformapagoOriginal.getId())) {
					existe=true;
					tipogrupoformapagoOriginal.setId(tipogrupoformapagoAux.getId());
					tipogrupoformapagoOriginal.setVersionRow(tipogrupoformapagoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoGrupoFormaPago(Boolean esParaCancelar) throws Exception {
		tipogrupoformapagosAux=new ArrayList<TipoGrupoFormaPago>();
		tipogrupoformapagoAux=new TipoGrupoFormaPago();
		
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
					if(tipogrupoformapagoAux.getId()<0) {
						tipogrupoformapagosAux.add(tipogrupoformapagoAux);
					}		
				}
				this.iIdNuevoTipoGrupoFormaPago=0L;
				this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().removeAll(tipogrupoformapagosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagos) {
					if(tipogrupoformapagoAux.getId()<0) {
						tipogrupoformapagosAux.add(tipogrupoformapagoAux);
					}		
				}
				this.iIdNuevoTipoGrupoFormaPago=0L;
				this.tipogrupoformapagos.removeAll(tipogrupoformapagosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoGrupoFormaPago 
					&& this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size()>0
					) {
					tipogrupoformapagoAux=this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().get(this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size() - 1);
				
					if(tipogrupoformapagoAux.getId()<0) {
						this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().remove(tipogrupoformapagoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoGrupoFormaPago && this.tipogrupoformapagos.size()>0) {
					tipogrupoformapagoAux=this.tipogrupoformapagos.get(this.tipogrupoformapagos.size() - 1);
				
					if(tipogrupoformapagoAux.getId()<0) {
						this.tipogrupoformapagos.remove(tipogrupoformapagoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoGrupoFormaPago(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipogrupoformapago.getId()<0) {
				this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().remove(this.tipogrupoformapago);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipogrupoformapago.getId()<0) {
				this.tipogrupoformapagos.remove(this.tipogrupoformapago);
			}
		}			
	}
	
	public void setEstadosInicialesTipoGrupoFormaPago(List<TipoGrupoFormaPago> tipogrupoformapagosAux) throws Exception {
		TipoGrupoFormaPagoConstantesFunciones.setEstadosInicialesTipoGrupoFormaPago(tipogrupoformapagosAux);
	}
	
	public void setEstadosInicialesTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapagoAux) throws Exception {
		TipoGrupoFormaPagoConstantesFunciones.setEstadosInicialesTipoGrupoFormaPago(tipogrupoformapagoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoGrupoFormaPagoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoGrupoFormaPagoActual()) {
				if(!this.isEsNuevoTipoGrupoFormaPago) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoGrupoFormaPago=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoGrupoFormaPagoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Grupo Forma Pago ?", "MANTENIMIENTO DE Tipo Grupo Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoGrupoFormaPago tipogrupoformapago) throws Exception {
		TipoGrupoFormaPagoConstantesFunciones.seleccionarAsignar(this.tipogrupoformapago,tipogrupoformapago);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoGrupoFormaPago=this.isPermisoActualizarOriginalTipoGrupoFormaPago;
			
			
			this.seleccionarAsignar(tipogrupoformapago);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoGrupoFormaPagoConstantesFunciones.quitarEspaciosTipoGrupoFormaPago(this.tipogrupoformapago,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipogrupoformapagoSessionBean.setsFuncionBusquedaRapida(this.tipogrupoformapagoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoGrupoFormaPago) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoGrupoFormaPago(esParaCancelar);				
				this.cancelarNuevoTipoGrupoFormaPago(esParaCancelar);								
			}
			
			this.tipogrupoformapago=new TipoGrupoFormaPago();
			
			this.inicializarTipoGrupoFormaPago();
			
			this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoGrupoFormaPago() throws Exception {
		try {
			TipoGrupoFormaPagoConstantesFunciones.inicializarTipoGrupoFormaPago(this.tipogrupoformapago);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoGrupoFormaPagos(String sAccionBusqueda,List<TipoGrupoFormaPago> tipogrupoformapagosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoGrupoFormaPago"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoGrupoFormaPagoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoGrupoFormaPagoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoGrupoFormaPago"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Grupo Forma Pagos");		
		parameters.put("busquedapor", TipoGrupoFormaPagoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(TipoFormaPago.class));
			classes.add(new Classe(DatoGeneralEmpleado.class));
			classes.add(new Classe(AnticipoCliente.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoGrupoFormaPagoLogic tipogrupoformapagoLogicAuxiliar=new TipoGrupoFormaPagoLogic();
					tipogrupoformapagoLogicAuxiliar.setDatosCliente(tipogrupoformapagoLogic.getDatosCliente());				
					tipogrupoformapagoLogicAuxiliar.setTipoGrupoFormaPagos(tipogrupoformapagosParaReportes);
					
					tipogrupoformapagoLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoGrupoFormaPagoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipogrupoformapagosParaReportes=tipogrupoformapagoLogicAuxiliar.getTipoGrupoFormaPagos();
					
					//tipogrupoformapagoLogic.getNewConnexionToDeep();
					
					//for (TipoGrupoFormaPago tipogrupoformapago:tipogrupoformapagosParaReportes) {
					//	tipogrupoformapagoLogic.deepLoad(tipogrupoformapago, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipogrupoformapagoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipogrupoformapagoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileTipoFormaPago = AuxiliarReportes.class.getResourceAsStream("TipoFormaPagoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_tipoformapago", reportFileTipoFormaPago);

			InputStream reportFileDatoGeneralEmpleado = AuxiliarReportes.class.getResourceAsStream("DatoGeneralEmpleadoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_datogeneralempleado", reportFileDatoGeneralEmpleado);

			InputStream reportFileAnticipoCliente = AuxiliarReportes.class.getResourceAsStream("AnticipoClienteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_anticipocliente", reportFileAnticipoCliente);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoGrupoFormaPago=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoGrupoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoGrupoFormaPagoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoGrupoFormaPago=new JRBeanArrayDataSource(TipoGrupoFormaPagoJInternalFrame.TraerTipoGrupoFormaPagoBeans(tipogrupoformapagosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoGrupoFormaPago);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoGrupoFormaPagoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoGrupoFormaPagoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoGrupoFormaPagoBean.TraerTipoGrupoFormaPagoBeans(tipogrupoformapagosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoGrupoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoformapagosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoGrupoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoformapagosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPagoActionPerformed(null);
					//this.generarExcelReporteTipoGrupoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoformapagosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoGrupoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoformapagosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoGrupoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoformapagosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoGrupoFormaPagos(sAccionBusqueda,sTipoArchivoReporte,tipogrupoformapagosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoGrupoFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoFormaPago> tipogrupoformapagosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoformapago";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoFormaPagos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGrupoFormaPago("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoGrupoFormaPago tipogrupoformapago : tipogrupoformapagosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoGrupoFormaPagoConstantesFunciones.generarExcelReporteDataTipoGrupoFormaPago("NORMAL",row,workbook,tipogrupoformapago,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoGrupoFormaPago(String sTipo,Row row,Workbook workbook) {
		
		TipoGrupoFormaPagoConstantesFunciones.generarExcelReporteHeaderTipoGrupoFormaPago(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoGrupoFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoFormaPago> tipogrupoformapagosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoformapago_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoGrupoFormaPago tipogrupoformapago : tipogrupoformapagosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoGrupoFormaPagoConstantesFunciones.getTipoGrupoFormaPagoDescripcion(tipogrupoformapago));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipogrupoformapago.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoGrupoFormaPagos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoGrupoFormaPago> tipogrupoformapagosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoGrupoFormaPago> tipogrupoformapagosRespaldo=null;
		
		classes=TipoGrupoFormaPagoConstantesFunciones.getClassesRelationshipsOfTipoGrupoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipogrupoformapagoLogic.setDatosCliente(this.datosCliente);
		this.tipogrupoformapagoLogic.setDatosDeep(this.datosDeep);
		this.tipogrupoformapagoLogic.setIsConDeep(true);
		
		tipogrupoformapagosRespaldo=this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos();
		
		this.tipogrupoformapagoLogic.setTipoGrupoFormaPagos(tipogrupoformapagosParaReportes);	
		this.tipogrupoformapagoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipogrupoformapagosParaReportes=this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos();
		this.tipogrupoformapagoLogic.setTipoGrupoFormaPagos(tipogrupoformapagosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoformapago_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoGrupoFormaPagos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoGrupoFormaPago("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoGrupoFormaPago tipogrupoformapago : tipogrupoformapagosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoGrupoFormaPago("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoGrupoFormaPagoConstantesFunciones.generarExcelReporteDataTipoGrupoFormaPago("NORMAL",row,workbook,tipogrupoformapago,cellStyleDataAux);
		
			
			


				//TipoFormaPago
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogrupoformapago.getTipoFormaPagos()!=null && tipogrupoformapago.getTipoFormaPagos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					TipoFormaPagoConstantesFunciones.generarExcelReporteHeaderTipoFormaPago("RELACIONADO",row,workbook);
				}

				if(tipogrupoformapago.getTipoFormaPagos()!=null) {
					i2=0;
					for(TipoFormaPago tipoformapago : tipogrupoformapago.getTipoFormaPagos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						TipoFormaPagoConstantesFunciones.generarExcelReporteDataTipoFormaPago("RELACIONADO",row,workbook,tipoformapago,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//DatoGeneralEmpleado
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogrupoformapago.getDatoGeneralEmpleados()!=null && tipogrupoformapago.getDatoGeneralEmpleados().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteHeaderDatoGeneralEmpleado("RELACIONADO",row,workbook);
				}

				if(tipogrupoformapago.getDatoGeneralEmpleados()!=null) {
					i2=0;
					for(DatoGeneralEmpleado datogeneralempleado : tipogrupoformapago.getDatoGeneralEmpleados()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DatoGeneralEmpleadoConstantesFunciones.generarExcelReporteDataDatoGeneralEmpleado("RELACIONADO",row,workbook,datogeneralempleado,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//AnticipoCliente
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipogrupoformapago.getAnticipoClientes()!=null && tipogrupoformapago.getAnticipoClientes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					AnticipoClienteConstantesFunciones.generarExcelReporteHeaderAnticipoCliente("RELACIONADO",row,workbook);
				}

				if(tipogrupoformapago.getAnticipoClientes()!=null) {
					i2=0;
					for(AnticipoCliente anticipocliente : tipogrupoformapago.getAnticipoClientes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						AnticipoClienteConstantesFunciones.generarExcelReporteDataAnticipoCliente("RELACIONADO",row,workbook,anticipocliente,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoGrupoFormaPagoConstantesFunciones.getTipoGrupoFormaPagoDescripcion(tipogrupoformapago));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoGrupoFormaPago() throws Exception {		
		this.startProcessTipoGrupoFormaPago(true);
	}
	
	public void startProcessTipoGrupoFormaPago(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoGrupoFormaPago ,this.jPanelParametrosReportesTipoGrupoFormaPago, this.jScrollPanelDatosTipoGrupoFormaPago,this.jPanelPaginacionTipoGrupoFormaPago, this.jScrollPanelDatosEdicionTipoGrupoFormaPago, this.jPanelAccionesTipoGrupoFormaPago,this.jPanelAccionesFormularioTipoGrupoFormaPago,this.jmenuBarTipoGrupoFormaPago,this.jmenuBarDetalleTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,this.jTtoolBarDetalleTipoGrupoFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGrupoFormaPago=this.jTabbedPaneBusquedasTipoGrupoFormaPago; 
		
		final JPanel jPanelParametrosReportesTipoGrupoFormaPago=this.jPanelParametrosReportesTipoGrupoFormaPago;
		//final JScrollPane jScrollPanelDatosTipoGrupoFormaPago=this.jScrollPanelDatosTipoGrupoFormaPago;
		final JTable jTableDatosTipoGrupoFormaPago=this.jTableDatosTipoGrupoFormaPago;		
		final JPanel jPanelPaginacionTipoGrupoFormaPago=this.jPanelPaginacionTipoGrupoFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoGrupoFormaPago=this.jScrollPanelDatosEdicionTipoGrupoFormaPago;
		final JPanel jPanelAccionesTipoGrupoFormaPago=this.jPanelAccionesTipoGrupoFormaPago;
		
		JPanel jPanelCamposAuxiliarTipoGrupoFormaPago=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoGrupoFormaPago=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			jPanelCamposAuxiliarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jPanelCamposTipoGrupoFormaPago;
			jPanelAccionesFormularioAuxiliarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jPanelAccionesFormularioTipoGrupoFormaPago;
		}
		
		final JPanel jPanelCamposTipoGrupoFormaPago=jPanelCamposAuxiliarTipoGrupoFormaPago;
		final JPanel jPanelAccionesFormularioTipoGrupoFormaPago=jPanelAccionesFormularioAuxiliarTipoGrupoFormaPago;
		
		
		final JMenuBar jmenuBarTipoGrupoFormaPago=this.jmenuBarTipoGrupoFormaPago;
		final JToolBar jTtoolBarTipoGrupoFormaPago=this.jTtoolBarTipoGrupoFormaPago;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoGrupoFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGrupoFormaPago=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			jmenuBarDetalleAuxiliarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jmenuBarDetalleTipoGrupoFormaPago;
			jTtoolBarDetalleAuxiliarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTtoolBarDetalleTipoGrupoFormaPago;
		}
		
		final JMenuBar jmenuBarDetalleTipoGrupoFormaPago=jmenuBarDetalleAuxiliarTipoGrupoFormaPago;
		final JToolBar jTtoolBarDetalleTipoGrupoFormaPago=jTtoolBarDetalleAuxiliarTipoGrupoFormaPago;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGrupoFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGrupoFormaPago;
			processRunnable.jTableDatos=jTableDatosTipoGrupoFormaPago;
			processRunnable.jPanelCampos=jPanelCamposTipoGrupoFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGrupoFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGrupoFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGrupoFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGrupoFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGrupoFormaPago;
			processRunnable.jTtoolBar=jTtoolBarTipoGrupoFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGrupoFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGrupoFormaPago ,jPanelParametrosReportesTipoGrupoFormaPago,jTableDatosTipoGrupoFormaPago, /*jScrollPanelDatosTipoGrupoFormaPago,*/jPanelCamposTipoGrupoFormaPago,jPanelPaginacionTipoGrupoFormaPago, /*jScrollPanelDatosEdicionTipoGrupoFormaPago,*/ jPanelAccionesTipoGrupoFormaPago,jPanelAccionesFormularioTipoGrupoFormaPago,jmenuBarTipoGrupoFormaPago,jmenuBarDetalleTipoGrupoFormaPago,jTtoolBarTipoGrupoFormaPago,jTtoolBarDetalleTipoGrupoFormaPago);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoGrupoFormaPago ,jPanelParametrosReportesTipoGrupoFormaPago, jScrollPanelDatosTipoGrupoFormaPago,jPanelPaginacionTipoGrupoFormaPago, jScrollPanelDatosEdicionTipoGrupoFormaPago, jPanelAccionesTipoGrupoFormaPago,jPanelAccionesFormularioTipoGrupoFormaPago,jmenuBarTipoGrupoFormaPago,jmenuBarDetalleTipoGrupoFormaPago,jTtoolBarTipoGrupoFormaPago,jTtoolBarDetalleTipoGrupoFormaPago);
						
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
	
	public void finishProcessTipoGrupoFormaPago() {// throws Exception 
		this.finishProcessTipoGrupoFormaPago(true);
	}
	
	public void finishProcessTipoGrupoFormaPago(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoGrupoFormaPago ,this.jPanelParametrosReportesTipoGrupoFormaPago, this.jScrollPanelDatosTipoGrupoFormaPago,this.jPanelPaginacionTipoGrupoFormaPago, this.jScrollPanelDatosEdicionTipoGrupoFormaPago, this.jPanelAccionesTipoGrupoFormaPago,this.jPanelAccionesFormularioTipoGrupoFormaPago,this.jmenuBarTipoGrupoFormaPago,this.jmenuBarDetalleTipoGrupoFormaPago,this.jTtoolBarTipoGrupoFormaPago,this.jTtoolBarDetalleTipoGrupoFormaPago);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoGrupoFormaPago=this.jTabbedPaneBusquedasTipoGrupoFormaPago; 
		
		final JPanel jPanelParametrosReportesTipoGrupoFormaPago=this.jPanelParametrosReportesTipoGrupoFormaPago;
		//final JScrollPane jScrollPanelDatosTipoGrupoFormaPago=this.jScrollPanelDatosTipoGrupoFormaPago;
		final JTable jTableDatosTipoGrupoFormaPago=this.jTableDatosTipoGrupoFormaPago;		
		final JPanel jPanelPaginacionTipoGrupoFormaPago=this.jPanelPaginacionTipoGrupoFormaPago;
		//final JScrollPane jScrollPanelDatosEdicionTipoGrupoFormaPago=this.jScrollPanelDatosEdicionTipoGrupoFormaPago;
		final JPanel jPanelAccionesTipoGrupoFormaPago=this.jPanelAccionesTipoGrupoFormaPago;
		
		JPanel jPanelCamposAuxiliarTipoGrupoFormaPago=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoGrupoFormaPago=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			jPanelCamposAuxiliarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jPanelCamposTipoGrupoFormaPago;
			jPanelAccionesFormularioAuxiliarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jPanelAccionesFormularioTipoGrupoFormaPago;
		}
		
		final JPanel jPanelCamposTipoGrupoFormaPago=jPanelCamposAuxiliarTipoGrupoFormaPago;
		final JPanel jPanelAccionesFormularioTipoGrupoFormaPago=jPanelAccionesFormularioAuxiliarTipoGrupoFormaPago;
		
		
		final JMenuBar jmenuBarTipoGrupoFormaPago=this.jmenuBarTipoGrupoFormaPago;		
		final JToolBar jTtoolBarTipoGrupoFormaPago=this.jTtoolBarTipoGrupoFormaPago;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoGrupoFormaPago=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoGrupoFormaPago=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			jmenuBarDetalleAuxiliarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jmenuBarDetalleTipoGrupoFormaPago;
			jTtoolBarDetalleAuxiliarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTtoolBarDetalleTipoGrupoFormaPago;		
		}
		
		final JMenuBar jmenuBarDetalleTipoGrupoFormaPago=jmenuBarDetalleAuxiliarTipoGrupoFormaPago;
		final JToolBar jTtoolBarDetalleTipoGrupoFormaPago=jTtoolBarDetalleAuxiliarTipoGrupoFormaPago;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoGrupoFormaPago;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoGrupoFormaPago;
			processRunnable.jTableDatos=jTableDatosTipoGrupoFormaPago;
			processRunnable.jPanelCampos=jPanelCamposTipoGrupoFormaPago;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoGrupoFormaPago;
			processRunnable.jPanelAcciones=jPanelAccionesTipoGrupoFormaPago;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoGrupoFormaPago;
			
			
			processRunnable.jmenuBar=jmenuBarTipoGrupoFormaPago;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoGrupoFormaPago;
			processRunnable.jTtoolBar=jTtoolBarTipoGrupoFormaPago;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoGrupoFormaPago;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoGrupoFormaPago ,jPanelParametrosReportesTipoGrupoFormaPago, jTableDatosTipoGrupoFormaPago,/*jScrollPanelDatosTipoGrupoFormaPago,*/jPanelCamposTipoGrupoFormaPago,jPanelPaginacionTipoGrupoFormaPago, /*jScrollPanelDatosEdicionTipoGrupoFormaPago,*/ jPanelAccionesTipoGrupoFormaPago,jPanelAccionesFormularioTipoGrupoFormaPago,jmenuBarTipoGrupoFormaPago,jmenuBarDetalleTipoGrupoFormaPago,jTtoolBarTipoGrupoFormaPago,jTtoolBarDetalleTipoGrupoFormaPago));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoGrupoFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoGrupoFormaPago(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoGrupoFormaPago(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoGrupoFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoGrupoFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoGrupoFormaPago,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoGrupoFormaPago(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoGrupoFormaPago,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoGrupoFormaPago,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipogrupoformapagoConstantesFunciones.getsFinalQueryTipoGrupoFormaPago();
		String  finalQueryPaginacionTodos=this.tipogrupoformapagoConstantesFunciones.getsFinalQueryTipoGrupoFormaPago();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoGrupoFormaPagoConstantesFunciones.getArrayColumnasGlobalesNoTipoGrupoFormaPago(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoGrupoFormaPagoConstantesFunciones.getArrayColumnasGlobalesTipoGrupoFormaPago(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoGrupoFormaPagoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipogrupoformapagosEliminados= new ArrayList<TipoGrupoFormaPago>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoGrupoFormaPago();
		
				///*TipoGrupoFormaPagoSessionBean*/this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
			
			if(this.tipogrupoformapagoSessionBean==null) {
				this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
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
					this.iNumeroPaginacion=TipoGrupoFormaPagoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoGrupoFormaPagoConstantesFunciones.getClassesForeignKeysOfTipoGrupoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipogrupoformapago."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipogrupoformapagosAux= new ArrayList<TipoGrupoFormaPago>();
			
				
			tipogrupoformapagoLogic.setDatosCliente(this.datosCliente);
			tipogrupoformapagoLogic.setDatosDeep(this.datosDeep);
			tipogrupoformapagoLogic.setIsConDeep(true);
			
			
			tipogrupoformapagoLogic.getTipoGrupoFormaPagoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipogrupoformapagoLogic.getTodosTipoGrupoFormaPagos(finalQueryGlobal,pagination);
					
					//tipogrupoformapagoLogic.getTodosTipoGrupoFormaPagosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipogrupoformapagoLogic.getTipoGrupoFormaPagos()==null|| tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogrupoformapagosAux= new ArrayList<TipoGrupoFormaPago>();
							tipogrupoformapagosAux.addAll(tipogrupoformapagoLogic.getTipoGrupoFormaPagos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoformapagosAux= new ArrayList<TipoGrupoFormaPago>();
							tipogrupoformapagosAux.addAll(tipogrupoformapagos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogrupoformapagoLogic.getTodosTipoGrupoFormaPagos(finalQueryGlobal+"",this.pagination);												
							
							//tipogrupoformapagoLogic.getTodosTipoGrupoFormaPagosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoGrupoFormaPagos("Todos",tipogrupoformapagoLogic.getTipoGrupoFormaPagos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipogrupoformapagoLogic.setTipoGrupoFormaPagos(new ArrayList<TipoGrupoFormaPago>());					
							tipogrupoformapagoLogic.getTipoGrupoFormaPagos().addAll(tipogrupoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoformapagos=new ArrayList<TipoGrupoFormaPago>();
							tipogrupoformapagos.addAll(tipogrupoformapagosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoGrupoFormaPago=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoGrupoFormaPago=this.idActual;
				
				} else if(this.idTipoGrupoFormaPagoActual!=null && this.idTipoGrupoFormaPagoActual!=0L) {
					idTipoGrupoFormaPago=idTipoGrupoFormaPagoActual;
				}
				
					
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndicePorId(idTipoGrupoFormaPago);
				
				this.tipogrupoformapagos=new ArrayList<TipoGrupoFormaPago>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipogrupoformapagoLogic.getEntity(idTipoGrupoFormaPago);
					
					//tipogrupoformapagoLogic.getEntityWithConnection(idTipoGrupoFormaPago);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoformapagoLogic.setTipoGrupoFormaPagos(new ArrayList<TipoGrupoFormaPago>());
					tipogrupoformapagoLogic.getTipoGrupoFormaPagos().add(tipogrupoformapagoLogic.getTipoGrupoFormaPago());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogrupoformapagos=new ArrayList<TipoGrupoFormaPago>();
					this.tipogrupoformapagos.add(tipogrupoformapago);
				}
				
				if(tipogrupoformapagoLogic.getTipoGrupoFormaPago()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorId")) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogrupoformapagoLogic.getTipoGrupoFormaPagosBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogrupoformapagoLogic.getTipoGrupoFormaPagos()==null||tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogrupoformapagos==null|| tipogrupoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoformapagosAux=new ArrayList<TipoGrupoFormaPago>();
						tipogrupoformapagosAux.addAll(tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoformapagosAux=new ArrayList<TipoGrupoFormaPago>();
							tipogrupoformapagosAux.addAll(tipogrupoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogrupoformapagoLogic.getTipoGrupoFormaPagosBusquedaPorId(finalQueryGlobal,pagination,idBusquedaPorId);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorId(idBusquedaPorId);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGrupoFormaPagos("BusquedaPorId",tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGrupoFormaPagos("BusquedaPorId",tipogrupoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoformapagoLogic.setTipoGrupoFormaPagos(new ArrayList<TipoGrupoFormaPago>());
						tipogrupoformapagoLogic.getTipoGrupoFormaPagos().addAll(tipogrupoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoformapagos=new ArrayList<TipoGrupoFormaPago>();
							tipogrupoformapagos.addAll(tipogrupoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipogrupoformapagoLogic.getTipoGrupoFormaPagosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipogrupoformapagoLogic.getTipoGrupoFormaPagos()==null||tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipogrupoformapagos==null|| tipogrupoformapagos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoformapagosAux=new ArrayList<TipoGrupoFormaPago>();
						tipogrupoformapagosAux.addAll(tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoformapagosAux=new ArrayList<TipoGrupoFormaPago>();
							tipogrupoformapagosAux.addAll(tipogrupoformapagos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipogrupoformapagoLogic.getTipoGrupoFormaPagosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoGrupoFormaPagoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoGrupoFormaPagos("BusquedaPorNombre",tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoGrupoFormaPagos("BusquedaPorNombre",tipogrupoformapagos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoformapagoLogic.setTipoGrupoFormaPagos(new ArrayList<TipoGrupoFormaPago>());
						tipogrupoformapagoLogic.getTipoGrupoFormaPagos().addAll(tipogrupoformapagosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoformapagos=new ArrayList<TipoGrupoFormaPago>();
							tipogrupoformapagos.addAll(tipogrupoformapagosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoGrupoFormaPago();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoGrupoFormaPago();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogrupoformapagos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipogrupoformapagos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoGrupoFormaPago tipogrupoformapago) {
		Boolean permite=true;
		
		if(this.tipogrupoformapago.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoGrupoFormaPagoConstantesFunciones.getOrderByListaTipoGrupoFormaPago();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoGrupoFormaPagoConstantesFunciones.getOrderByListaTipoGrupoFormaPago();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFormaPago tipogrupoformapago:tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
				if(tipogrupoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoformapagoTotales=tipogrupoformapago;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFormaPago tipogrupoformapago:this.tipogrupoformapagos) {
				if(tipogrupoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoformapagoTotales=tipogrupoformapago;
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
			this.tipogrupoformapagoAux=new TipoGrupoFormaPago();
			this.tipogrupoformapagoAux.setsType(Constantes2.S_TOTALES);
			this.tipogrupoformapagoAux.setIsNew(false);
			this.tipogrupoformapagoAux.setIsChanged(false);
			this.tipogrupoformapagoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoGrupoFormaPagoConstantesFunciones.TotalizarValoresFilaTipoGrupoFormaPago(this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos(),this.tipogrupoformapagoAux);
				
				this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().add(this.tipogrupoformapagoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoGrupoFormaPagoConstantesFunciones.TotalizarValoresFilaTipoGrupoFormaPago(this.tipogrupoformapagos,this.tipogrupoformapagoAux);
				
				this.tipogrupoformapagos.add(this.tipogrupoformapagoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipogrupoformapagoTotales=new TipoGrupoFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().remove(tipogrupoformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipogrupoformapagos.remove(tipogrupoformapagoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipogrupoformapagoTotales=new TipoGrupoFormaPago();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoGrupoFormaPago tipogrupoformapago:tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
				if(tipogrupoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoformapagoTotales=tipogrupoformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrupoFormaPagoConstantesFunciones.TotalizarValoresFilaTipoGrupoFormaPago(this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos(),tipogrupoformapagoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoGrupoFormaPago tipogrupoformapago:this.tipogrupoformapagos) {
				if(tipogrupoformapago.getsType().equals(Constantes2.S_TOTALES)) {
					tipogrupoformapagoTotales=tipogrupoformapago;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoGrupoFormaPagoConstantesFunciones.TotalizarValoresFilaTipoGrupoFormaPago(this.tipogrupoformapagos,tipogrupoformapagoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoGrupoFormaPagosBusquedaPorId()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorId";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGrupoFormaPagosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoGrupoFormaPagoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoGrupoFormaPagosBusquedaPorId(String sFinalQuery,Long id)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoformapagoLogic.getTipoGrupoFormaPagosBusquedaPorId(sFinalQuery,this.pagination,id);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGrupoFormaPagosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoformapagoLogic.getTipoGrupoFormaPagosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoGrupoFormaPagoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoformapagoLogic.getTipoGrupoFormaPagoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoGrupoFormaPago() {
		this.isPermisoTodoTipoGrupoFormaPago=false;
		this.isPermisoNuevoTipoGrupoFormaPago=false;
		this.isPermisoActualizarTipoGrupoFormaPago=false;
		this.isPermisoActualizarOriginalTipoGrupoFormaPago=false;
		this.isPermisoEliminarTipoGrupoFormaPago=false;
		this.isPermisoGuardarCambiosTipoGrupoFormaPago=false;
		this.isPermisoConsultaTipoGrupoFormaPago=false;
		this.isPermisoBusquedaTipoGrupoFormaPago=false;
		this.isPermisoReporteTipoGrupoFormaPago=false;		
		this.isPermisoOrdenTipoGrupoFormaPago=false;		
		this.isPermisoPaginacionMedioTipoGrupoFormaPago=false;		
		this.isPermisoPaginacionAltoTipoGrupoFormaPago=false;
		this.isPermisoPaginacionTodoTipoGrupoFormaPago=false;
		this.isPermisoCopiarTipoGrupoFormaPago=false;		
		this.isPermisoVerFormTipoGrupoFormaPago=false;		
		this.isPermisoDuplicarTipoGrupoFormaPago=false;		
		this.isPermisoOrdenTipoGrupoFormaPago=false;		
	}
	
	public void setPermisosUsuarioTipoGrupoFormaPago(Boolean isPermiso) {
		this.isPermisoTodoTipoGrupoFormaPago=isPermiso;
		this.isPermisoNuevoTipoGrupoFormaPago=isPermiso;
		this.isPermisoActualizarTipoGrupoFormaPago=isPermiso;
		this.isPermisoActualizarOriginalTipoGrupoFormaPago=isPermiso;
		this.isPermisoEliminarTipoGrupoFormaPago=isPermiso;
		this.isPermisoGuardarCambiosTipoGrupoFormaPago=isPermiso;
		this.isPermisoConsultaTipoGrupoFormaPago=isPermiso;
		this.isPermisoBusquedaTipoGrupoFormaPago=isPermiso;
		this.isPermisoReporteTipoGrupoFormaPago=isPermiso;
		this.isPermisoOrdenTipoGrupoFormaPago=isPermiso;		
		this.isPermisoPaginacionMedioTipoGrupoFormaPago=isPermiso;		
		this.isPermisoPaginacionAltoTipoGrupoFormaPago=isPermiso;		
		this.isPermisoPaginacionTodoTipoGrupoFormaPago=isPermiso;		
		this.isPermisoCopiarTipoGrupoFormaPago=isPermiso;		
		this.isPermisoVerFormTipoGrupoFormaPago=isPermiso;		
		this.isPermisoDuplicarTipoGrupoFormaPago=isPermiso;
		this.isPermisoOrdenTipoGrupoFormaPago=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoGrupoFormaPago(Boolean isPermiso) {
		//this.isPermisoTodoTipoGrupoFormaPago=isPermiso;
		this.isPermisoNuevoTipoGrupoFormaPago=isPermiso;
		this.isPermisoActualizarTipoGrupoFormaPago=isPermiso;
		this.isPermisoActualizarOriginalTipoGrupoFormaPago=isPermiso;
		this.isPermisoEliminarTipoGrupoFormaPago=isPermiso;
		this.isPermisoGuardarCambiosTipoGrupoFormaPago=isPermiso;
		//this.isPermisoConsultaTipoGrupoFormaPago=isPermiso;
		//this.isPermisoBusquedaTipoGrupoFormaPago=isPermiso;
		//this.isPermisoReporteTipoGrupoFormaPago=isPermiso;
		//this.isPermisoOrdenTipoGrupoFormaPago=isPermiso;		
		//this.isPermisoPaginacionMedioTipoGrupoFormaPago=isPermiso;		
		//this.isPermisoPaginacionAltoTipoGrupoFormaPago=isPermiso;		
		//this.isPermisoPaginacionTodoTipoGrupoFormaPago=isPermiso;		
		//this.isPermisoCopiarTipoGrupoFormaPago=isPermiso;		
		//this.isPermisoDuplicarTipoGrupoFormaPago=isPermiso;
		//this.isPermisoOrdenTipoGrupoFormaPago=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoGrupoFormaPagoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(TipoFormaPagoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(AnticipoClienteConstantesFunciones.SNOMBREOPCION);
		
		if(TipoGrupoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosTipoFormaPago=false;
		this.isTienePermisosTipoFormaPago=this.verificarGetPermisosUsuarioOpcionTipoGrupoFormaPagoClaseRelacionada(this.opcionsRelacionadas,TipoFormaPagoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosDatoGeneralEmpleado=false;
		this.isTienePermisosDatoGeneralEmpleado=this.verificarGetPermisosUsuarioOpcionTipoGrupoFormaPagoClaseRelacionada(this.opcionsRelacionadas,DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosAnticipoCliente=false;
		this.isTienePermisosAnticipoCliente=this.verificarGetPermisosUsuarioOpcionTipoGrupoFormaPagoClaseRelacionada(this.opcionsRelacionadas,AnticipoClienteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoGrupoFormaPago(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoGrupoFormaPagoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosTipoFormaPago=conPermiso;
		this.isTienePermisosDatoGeneralEmpleado=conPermiso;
		this.isTienePermisosAnticipoCliente=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoGrupoFormaPagoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoGrupoFormaPagoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoGrupoFormaPagoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosTipoFormaPago && this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.remove(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosDatoGeneralEmpleado && this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.remove(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosAnticipoCliente && this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.remove(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoGrupoFormaPago() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoGrupoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoGrupoFormaPagoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoGrupoFormaPago=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoGrupoFormaPago=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoGrupoFormaPago=this.isPermisoActualizarTipoGrupoFormaPago;
			this.isPermisoEliminarTipoGrupoFormaPago=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoGrupoFormaPago=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoGrupoFormaPago=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoGrupoFormaPago=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoGrupoFormaPago=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoGrupoFormaPago=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGrupoFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoGrupoFormaPago=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoGrupoFormaPago=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoGrupoFormaPago=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoGrupoFormaPago=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoGrupoFormaPago=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoGrupoFormaPago=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoGrupoFormaPago=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoGrupoFormaPago.setToolTipText(this.jTableDatosTipoGrupoFormaPago.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoGrupoFormaPago(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoGrupoFormaPago(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoGrupoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoGrupoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoGrupoFormaPago() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosTipoFormaPago && this.tipogrupoformapagoConstantesFunciones.mostrarTipoFormaPagoTipoGrupoFormaPago && !TipoGrupoFormaPagoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Tipo Forma Pago");
			reporte.setsDescripcion("Tipo Forma Pago");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosDatoGeneralEmpleado && this.tipogrupoformapagoConstantesFunciones.mostrarDatoGeneralEmpleadoTipoGrupoFormaPago && !TipoGrupoFormaPagoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Dato General Empleado");
			reporte.setsDescripcion("Dato General Empleado");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosAnticipoCliente && this.tipogrupoformapagoConstantesFunciones.mostrarAnticipoClienteTipoGrupoFormaPago && !TipoGrupoFormaPagoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Anticipo Cliente");
			reporte.setsDescripcion("Anticipo Cliente");
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
	
		
	public void inicializarCombosForeignKeyTipoGrupoFormaPagoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoGrupoFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoGrupoFormaPagoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoGrupoFormaPagoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoGrupoFormaPagoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoGrupoFormaPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoGrupoFormaPago()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoGrupoFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoGrupoFormaPago()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoFormaPago();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoGrupoFormaPago()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoGrupoFormaPago()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoGrupoFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoGrupoFormaPago()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoGrupoFormaPago()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoGrupoFormaPago()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoGrupoFormaPago(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoGrupoFormaPago()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoGrupoFormaPagoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoGrupoFormaPagoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoGrupoFormaPagoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean(); 
		this.tipogrupoformapagoConstantesFunciones=new TipoGrupoFormaPagoConstantesFunciones(); 
		this.tipogrupoformapagoBean=new TipoGrupoFormaPago();//(this.tipogrupoformapagoConstantesFunciones); 		
		this.tipogrupoformapagoReturnGeneral=new TipoGrupoFormaPagoParameterReturnGeneral(); 
		
		this.tipogrupoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipogrupoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoGrupoFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoGrupoFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoGrupoFormaPagoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoGrupoFormaPago(true);
			
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
			
			this.tipogrupoformapagoConstantesFunciones=new TipoGrupoFormaPagoConstantesFunciones(); 
			this.tipogrupoformapagoBean=new TipoGrupoFormaPago();//this.tipogrupoformapagoConstantesFunciones); 			
			this.tipogrupoformapagoReturnGeneral=new TipoGrupoFormaPagoParameterReturnGeneral(); 
		
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Grupo Forma Pago Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipogrupoformapago=new TipoGrupoFormaPago();
			this.tipogrupoformapagos = new ArrayList<TipoGrupoFormaPago>();
			this.tipogrupoformapagosAux = new ArrayList<TipoGrupoFormaPago>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic=new TipoGrupoFormaPagoLogic();
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipogrupoformapagoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipogrupoformapagoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoGrupoFormaPago);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGrupoFormaPago);	
					}
					
					if(this.jInternalFrameImportacionTipoGrupoFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGrupoFormaPago);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoGrupoFormaPago!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoGrupoFormaPago);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGrupoFormaPago);
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.setVisible(false);
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago);
					this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoGrupoFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoGrupoFormaPago);
					this.jInternalFrameImportacionTipoGrupoFormaPago.setVisible(false);
					this.jInternalFrameImportacionTipoGrupoFormaPago.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoGrupoFormaPago!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoGrupoFormaPago);
					this.jInternalFrameOrderByTipoGrupoFormaPago.setVisible(false);
					this.jInternalFrameOrderByTipoGrupoFormaPago.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoGrupoFormaPagoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoGrupoFormaPagoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipogrupoformapagoReturnGeneral=new TipoGrupoFormaPagoParameterReturnGeneral();
			
			this.tipogrupoformapagoParameterGeneral=new TipoGrupoFormaPagoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipogrupoformapagoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoGrupoFormaPagoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(TipoFormaPagoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(DatoGeneralEmpleadoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(AnticipoClienteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGrupoFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado(),this.tipogrupoformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoGrupoFormaPagoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado(),this.tipogrupoformapagoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaDuplicarTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaCopiarTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaVerFormTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaOrdenTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=false;
			
			
			this.isVisibilidadBusquedaPorId=true;
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoGrupoFormaPago();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoGrupoFormaPago(false);
			
			this.setPermisosUsuarioTipoGrupoFormaPago();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado() && this.tipogrupoformapagoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoGrupoFormaPagoClasesRelacionadas();
			}
			
			if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoGrupoFormaPagoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoGrupoFormaPago();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoGrupoFormaPago();
			}
			
			if(!this.isPermisoBusquedaTipoGrupoFormaPago) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoGrupoFormaPago,this.isPermisoPaginacionMedioTipoGrupoFormaPago,this.isPermisoPaginacionTodoTipoGrupoFormaPago);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoGrupoFormaPagoConstantesFunciones.getTiposSeleccionarTipoGrupoFormaPago());
				
				this.tiposColumnasSelect=TipoGrupoFormaPagoConstantesFunciones.getTiposSeleccionarTipoGrupoFormaPago(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoGrupoFormaPago();				
				//this.tiposRelacionesSelect=TipoGrupoFormaPagoConstantesFunciones.getTiposRelacionesTipoGrupoFormaPago(true);
				
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
			//if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoGrupoFormaPago();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoGrupoFormaPago(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoGrupoFormaPago(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoFormaPago() ;
			
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
			
			
			this.tipoformapagoLogic=new TipoFormaPagoLogic();
			this.datogeneralempleadoLogic=new DatoGeneralEmpleadoLogic();
			this.anticipoclienteLogic=new AnticipoClienteLogic(); 
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
				tipogrupoformapagoImplementable= (TipoGrupoFormaPagoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGrupoFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipogrupoformapagoImplementableHome= (TipoGrupoFormaPagoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoGrupoFormaPagoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipogrupoformapagos= new ArrayList<TipoGrupoFormaPago>();
			this.tipogrupoformapagosEliminados= new ArrayList<TipoGrupoFormaPago>();
						
			this.isEsNuevoTipoGrupoFormaPago=false;
			this.esParaAccionDesdeFormularioTipoGrupoFormaPago=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoGrupoFormaPago(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoGrupoFormaPago();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoGrupoFormaPagoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoGrupoFormaPago(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoGrupoFormaPago();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoGrupoFormaPago();
			}
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoGrupoFormaPago.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoGrupoFormaPago.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoGrupoFormaPago.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoGrupoFormaPago(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoGrupoFormaPago: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoGrupoFormaPago() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoGrupoFormaPago")) {
				iIndex=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();	
				
				

				if(sTitle.equals("Anticipo Clientes")) {
					if(!AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGrupoFormaPago();

						this.cargarParteTabPanelRelacionadaAnticipoCliente(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Dato General Empleados")) {
					if(!DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGrupoFormaPago();

						this.cargarParteTabPanelRelacionadaDatoGeneralEmpleado(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Tipo Forma Pagos")) {
					if(!TipoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoGrupoFormaPago();

						this.cargarParteTabPanelRelacionadaTipoFormaPago(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoGrupoFormaPago();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaAnticipoCliente(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.cargarSessionConBeanSwingJInternalFrameAnticipoCliente(false,true,iIndex);
		this.jButtonAnticipoClienteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaAnticipoCliente();

		//this.jTabbedPaneRelacionesTipoGrupoFormaPago.updateUI();
		//this.jTabbedPaneRelacionesTipoGrupoFormaPago.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGrupoFormaPago.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaDatoGeneralEmpleado(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.cargarSessionConBeanSwingJInternalFrameDatoGeneralEmpleado(false,true,iIndex);
		this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();

		//this.jTabbedPaneRelacionesTipoGrupoFormaPago.updateUI();
		//this.jTabbedPaneRelacionesTipoGrupoFormaPago.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGrupoFormaPago.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaTipoFormaPago(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.cargarSessionConBeanSwingJInternalFrameTipoFormaPago(false,true,iIndex);
		this.jButtonTipoFormaPagoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaTipoFormaPago();

		//this.jTabbedPaneRelacionesTipoGrupoFormaPago.updateUI();
		//this.jTabbedPaneRelacionesTipoGrupoFormaPago.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoGrupoFormaPago.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("TipoFormaPago")) {
				int row=this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
				jButtonTipoFormaPagoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("DatoGeneralEmpleado")) {
				int row=this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
				jButtonDatoGeneralEmpleadoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("AnticipoCliente")) {
				int row=this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
				jButtonAnticipoClienteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Tipo Forma Pago")) {

					if(this.isTienePermisosTipoFormaPago && this.tipogrupoformapagoConstantesFunciones.mostrarTipoFormaPagoTipoGrupoFormaPago && !TipoGrupoFormaPagoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Tipo Forma Pagos"+"("+TipoFormaPagoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Tipo Forma Pagos");

						if(tipogrupoformapagoConstantesFunciones.resaltarTipoFormaPagoTipoGrupoFormaPago!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrupoformapagoConstantesFunciones.resaltarTipoFormaPagoTipoGrupoFormaPago);
						}

						jmenuItem.setEnabled(this.tipogrupoformapagoConstantesFunciones.activarTipoFormaPagoTipoGrupoFormaPago);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"TipoFormaPago"));

						

						this.jInternalFrameDetalleFormTipoGrupoFormaPago.jmenuDetalleTipoGrupoFormaPago.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Dato General Empleado")) {

					if(this.isTienePermisosDatoGeneralEmpleado && this.tipogrupoformapagoConstantesFunciones.mostrarDatoGeneralEmpleadoTipoGrupoFormaPago && !TipoGrupoFormaPagoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Dato General Empleados"+"("+DatoGeneralEmpleadoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Dato General Empleados");

						if(tipogrupoformapagoConstantesFunciones.resaltarDatoGeneralEmpleadoTipoGrupoFormaPago!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrupoformapagoConstantesFunciones.resaltarDatoGeneralEmpleadoTipoGrupoFormaPago);
						}

						jmenuItem.setEnabled(this.tipogrupoformapagoConstantesFunciones.activarDatoGeneralEmpleadoTipoGrupoFormaPago);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DatoGeneralEmpleado"));

						

						this.jInternalFrameDetalleFormTipoGrupoFormaPago.jmenuDetalleTipoGrupoFormaPago.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Anticipo Cliente")) {

					if(this.isTienePermisosAnticipoCliente && this.tipogrupoformapagoConstantesFunciones.mostrarAnticipoClienteTipoGrupoFormaPago && !TipoGrupoFormaPagoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Anticipo Clientes"+"("+AnticipoClienteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Anticipo Clientes");

						if(tipogrupoformapagoConstantesFunciones.resaltarAnticipoClienteTipoGrupoFormaPago!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipogrupoformapagoConstantesFunciones.resaltarAnticipoClienteTipoGrupoFormaPago);
						}

						jmenuItem.setEnabled(this.tipogrupoformapagoConstantesFunciones.activarAnticipoClienteTipoGrupoFormaPago);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"AnticipoCliente"));

						

						this.jInternalFrameDetalleFormTipoGrupoFormaPago.jmenuDetalleTipoGrupoFormaPago.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoGrupoFormaPago(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoGrupoFormaPago(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoGrupoFormaPago(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoGrupoFormaPagoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoGrupoFormaPago();
		
		this.cargarCombosFrameForeignKeyTipoGrupoFormaPago();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoGrupoFormaPago();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoGrupoFormaPago();
		}
	}
	
	
	
	public void jButtonNuevoTipoGrupoFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
			
			if(jTableDatosTipoGrupoFormaPago.getRowCount()>=1) {
				jTableDatosTipoGrupoFormaPago.removeRowSelectionInterval(0, jTableDatosTipoGrupoFormaPago.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoGrupoFormaPago=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoGrupoFormaPago(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoGrupoFormaPago(true);			
			//this.tipogrupoformapago=new TipoGrupoFormaPago();
			//this.tipogrupoformapago.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoFormaPago(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoFormaPago() ;
			
			if(TipoGrupoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoFormaPago(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipogrupoformapago);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);				
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
			if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoGrupoFormaPago: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoGrupoFormaPagoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoGrupoFormaPago.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoGrupoFormaPago.getSelectedRows().length;			
			}
			
			tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoGrupoFormaPago--;			
				//TipoGrupoFormaPago tipogrupoformapagoAux= new TipoGrupoFormaPago();			
				//tipogrupoformapagoAux.setId(this.iIdNuevoTipoGrupoFormaPago);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoGrupoFormaPago tipogrupoformapagoOrigen=new TipoGrupoFormaPago();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoGrupoFormaPago tipogrupoformapagoOrigen : tipogrupoformapagosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipogrupoformapagoOrigen =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipogrupoformapagoOrigen =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoGrupoFormaPago();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipogrupoformapago.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoGrupoFormaPago(tipogrupoformapagoOrigen,this.tipogrupoformapago,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().add(this.tipogrupoformapagoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogrupoformapagos.add(this.tipogrupoformapagoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
				
				this.jTableDatosTipoGrupoFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoFormaPago(), this.getIndiceNuevoTipoGrupoFormaPago());
				
				int iLastRow =  this.jTableDatosTipoGrupoFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGrupoFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGrupoFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();									
		
			TipoGrupoFormaPago tipogrupoformapagoOrigen=new TipoGrupoFormaPago();
			TipoGrupoFormaPago tipogrupoformapagoDestino=new TipoGrupoFormaPago();
				
			tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoGrupoFormaPago.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipogrupoformapagosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoGrupoFormaPago.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoformapagoOrigen =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogrupoformapagoOrigen =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipogrupoformapagoDestino =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipogrupoformapagoDestino =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipogrupoformapagoOrigen =tipogrupoformapagosSeleccionados.get(0);
				tipogrupoformapagoDestino =tipogrupoformapagosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoGrupoFormaPago(tipogrupoformapagoOrigen,tipogrupoformapagoDestino,true,false);
				
				tipogrupoformapagoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipogrupoformapagoDestino,tipogrupoformapagoLogic.getTipoGrupoFormaPagos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipogrupoformapagoDestino,tipogrupoformapagos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
				
				//this.jTableDatosTipoGrupoFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoFormaPago(), this.getIndiceNuevoTipoGrupoFormaPago());
				
				int iLastRow =  this.jTableDatosTipoGrupoFormaPago.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoGrupoFormaPago.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoGrupoFormaPago.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoGrupoFormaPago.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(!isVisible);
			this.jPanelPaginacionTipoGrupoFormaPago.setVisible(!isVisible);
			this.jPanelAccionesTipoGrupoFormaPago.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoGrupoFormaPago();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoGrupoFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoGrupoFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoGrupoFormaPago();
			
			this.abrirFrameOrderByTipoGrupoFormaPago();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoGrupoFormaPago();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoGrupoFormaPago(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGrupoFormaPago);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.isMaximum()) {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoGrupoFormaPago.setSize(this.jInternalFrameDetalleFormTipoGrupoFormaPago.iWidthFormulario,this.jInternalFrameDetalleFormTipoGrupoFormaPago.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoGrupoFormaPago.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoGrupoFormaPago.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoGrupoFormaPago.isMaximum()) {
						this.jInternalFrameDetalleFormTipoGrupoFormaPago.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jContentPaneDetalleTipoGrupoFormaPago.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jContentPaneDetalleTipoGrupoFormaPago.getWidth(),TipoGrupoFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jContentPaneDetalleTipoGrupoFormaPago.getWidth(),TipoGrupoFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jContentPaneDetalleTipoGrupoFormaPago.getWidth(),TipoGrupoFormaPagoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaAnticipoCliente();
					}

					if(DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDatoGeneralEmpleado();
					}

					if(TipoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaTipoFormaPago();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoGrupoFormaPago.setVisible(true);
	        this.jInternalFrameDetalleFormTipoGrupoFormaPago.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoGrupoFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoGrupoFormaPago==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoGrupoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoFormaPago,false,this);
				} else {
					this.jInternalFrameOrderByTipoGrupoFormaPago=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoGrupoFormaPago,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoGrupoFormaPago);
				this.jInternalFrameOrderByTipoGrupoFormaPago.setVisible(false);
				this.jInternalFrameOrderByTipoGrupoFormaPago.setSelected(false);
				
				this.jInternalFrameOrderByTipoGrupoFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGrupoFormaPago"));
				
				this.inicializarActualizarBindingTablaOrderByTipoGrupoFormaPago();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoGrupoFormaPago() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoGrupoFormaPago==null) {
				
				this.jInternalFrameImportacionTipoGrupoFormaPago=new ImportacionJInternalFrame(TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoGrupoFormaPago);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoGrupoFormaPago);
				this.jInternalFrameImportacionTipoGrupoFormaPago.setVisible(false);
				this.jInternalFrameImportacionTipoGrupoFormaPago.setSelected(false);


				this.jInternalFrameImportacionTipoGrupoFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGrupoFormaPago"));
				this.jInternalFrameImportacionTipoGrupoFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGrupoFormaPago"));
				this.jInternalFrameImportacionTipoGrupoFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGrupoFormaPago"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoGrupoFormaPago() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago==null) {
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago=new ReporteDinamicoJInternalFrame(TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoGrupoFormaPago);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago);
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoFormaPago"));
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoFormaPago"));
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoFormaPago"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoFormaPago();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaAnticipoCliente() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jContentPaneDetalleTipoGrupoFormaPago.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaDatoGeneralEmpleado() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jContentPaneDetalleTipoGrupoFormaPago.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaTipoFormaPago() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jContentPaneDetalleTipoGrupoFormaPago.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoGrupoFormaPago() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoGrupoFormaPago);
			
	       	this.jInternalFrameDetalleFormTipoGrupoFormaPago.setVisible(false);
	        this.jInternalFrameDetalleFormTipoGrupoFormaPago.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoGrupoFormaPago.dispose();
			//this.jInternalFrameDetalleFormTipoGrupoFormaPago=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoGrupoFormaPago() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoGrupoFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoGrupoFormaPago.setVisible(true);
	        this.jInternalFrameImportacionTipoGrupoFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoGrupoFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoGrupoFormaPago.setVisible(true);
	        this.jInternalFrameOrderByTipoGrupoFormaPago.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoGrupoFormaPago() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoGrupoFormaPago.setVisible(false);
	        this.jInternalFrameOrderByTipoGrupoFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoGrupoFormaPago() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoGrupoFormaPago() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoGrupoFormaPago.setVisible(false);
	        this.jInternalFrameImportacionTipoGrupoFormaPago.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoGrupoFormaPago(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoGrupoFormaPago(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoGrupoFormaPago(true);
			//this.isEsNuevoTipoGrupoFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoFormaPago(false) ;
			
			if(tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.getEsGuardarRelacionado() && TipoFormaPagoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonTipoFormaPagoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado() && DatoGeneralEmpleadoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDatoGeneralEmpleadoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.getEsGuardarRelacionado() && AnticipoClienteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonAnticipoClienteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoGrupoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoFormaPago(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoGrupoFormaPagoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoGrupoFormaPago(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoGrupoFormaPago(true);
			//this.isEsNuevoTipoGrupoFormaPago=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipogrupoformapago.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoGrupoFormaPago(false) ;
			
			if(TipoGrupoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoGrupoFormaPago(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoFormaPago(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoGrupoFormaPago(false);
			
			//if(!this.isEsNuevoTipoGrupoFormaPago) {								
				int intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);
				
			}
			
			if(this.permiteMantenimiento(this.tipogrupoformapago)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoGrupoFormaPago=true;
					this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
					this.isEsNuevoTipoGrupoFormaPago=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoGrupoFormaPago=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoGrupoFormaPago=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGrupoFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoFormaPago(false);
				
				this.habilitarDeshabilitarControlesTipoGrupoFormaPago(false);
			
												
				
				if(TipoGrupoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoGrupoFormaPago();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,tipogrupoformapagoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoGrupoFormaPago(this.tipogrupoformapago,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoGrupoFormaPago.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipogrupoformapagoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipogrupoformapago.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.tipogrupoformapago.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				this.tipogrupoformapago.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipogrupoformapago)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoGrupoFormaPagoModel) this.jTableDatosTipoGrupoFormaPago.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoGrupoFormaPago=true;
				this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
				this.isEsNuevoTipoGrupoFormaPago=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoGrupoFormaPago(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoFormaPago(false);
				
				this.habilitarDeshabilitarControlesTipoGrupoFormaPago(false);
				
				
				
				if(TipoGrupoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoGrupoFormaPago();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoGrupoFormaPago.getRowCount()>=1) {
				jTableDatosTipoGrupoFormaPago.removeRowSelectionInterval(0, jTableDatosTipoGrupoFormaPago.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoGrupoFormaPago(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoGrupoFormaPago(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoGrupoFormaPago(false) ;
			
			this.isEsNuevoTipoGrupoFormaPago=false;
			
			if(TipoGrupoFormaPagoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoGrupoFormaPago();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoGrupoFormaPago(false);
				
				//SI ES MANUAL
				if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoGrupoFormaPago();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoGrupoFormaPago--;			
			//TipoGrupoFormaPago tipogrupoformapagoAux= new TipoGrupoFormaPago();			
			//tipogrupoformapagoAux.setId(this.iIdNuevoTipoGrupoFormaPago);
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoGrupoFormaPago();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);
			
			this.tipogrupoformapago.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().add(this.tipogrupoformapagoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipogrupoformapagos.add(this.tipogrupoformapagoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
			
			this.jTableDatosTipoGrupoFormaPago.setRowSelectionInterval(this.getIndiceNuevoTipoGrupoFormaPago(), this.getIndiceNuevoTipoGrupoFormaPago());
			
			int iLastRow =  this.jTableDatosTipoGrupoFormaPago.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoGrupoFormaPago.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoGrupoFormaPago.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoFormaPago(false);
			
			//SI ES MANUAL
			if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoFormaPago();
			}
			
			//this.abrirFrameTreeTipoGrupoFormaPago();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo Grupo Forma PagoS ?", "MANTENIMIENTO DE Tipo Grupo Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoGrupoFormaPago.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoGrupoFormaPago();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipogrupoformapagoReturnGeneral=tipogrupoformapagoLogic.procesarImportacionTipoGrupoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipogrupoformapagoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoGrupoFormaPagoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoGrupoFormaPago.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoGrupoFormaPago.setFileImportacion(this.jInternalFrameImportacionTipoGrupoFormaPago.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoGrupoFormaPago.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoGrupoFormaPago.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoGrupoFormaPago.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoGrupoFormaPago.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();		

		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoGrupoFormaPagoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoGrupoFormaPagoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoGrupoFormaPagos("Todos",tipogrupoformapagosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();		
		
		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoformapago";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoGrupoFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoGrupoFormaPago tipogrupoformapago:tipogrupoformapagosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipogrupoformapago.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoGrupoFormaPago(row);				
			//	iRow++;
			//}				
			
			//for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoGrupoFormaPago(tipogrupoformapagoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoFormaPago(false);
			
			//SI ES MANUAL
			if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoGrupoFormaPago();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoFormaPago(false);
			
			//SI ES MANUAL
			if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGrupoFormaPago();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoGrupoFormaPago(false);
			
			//SI ES MANUAL
			if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoGrupoFormaPago();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoGrupoFormaPago() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoGrupoFormaPago.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoGrupoFormaPago.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoGrupoFormaPago.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoGrupoFormaPago.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoGrupoFormaPago.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoGrupoFormaPago.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoGrupoFormaPago.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoGrupoFormaPago(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoGrupoFormaPago(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoGrupoFormaPago(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoGrupoFormaPago(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoGrupoFormaPago(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoGrupoFormaPago(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoFormaPago(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoGrupoFormaPago(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoGrupoFormaPago() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoGrupoFormaPago();
		
		this.inicializarActualizarBindingBotonesManualTipoGrupoFormaPago(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGrupoFormaPago();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoFormaPago() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoFormaPago(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoFormaPago(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoGrupoFormaPago.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoGrupoFormaPago.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jCheckBoxPostAccionNuevoTipoGrupoFormaPago.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jCheckBoxPostAccionSinCerrarTipoGrupoFormaPago.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jCheckBoxPostAccionSinMensajeTipoGrupoFormaPago.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoGrupoFormaPago.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoGrupoFormaPago.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.jCheckBoxPostAccionNuevoTipoGrupoFormaPago.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.jCheckBoxPostAccionSinCerrarTipoGrupoFormaPago.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.jCheckBoxPostAccionSinMensajeTipoGrupoFormaPago.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoGrupoFormaPago.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoGrupoFormaPago.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoGrupoFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoGrupoFormaPago.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoGrupoFormaPago.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoGrupoFormaPago.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoGrupoFormaPago(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoGrupoFormaPago(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoGrupoFormaPago() throws Exception {
		try	{
			if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGrupoFormaPago();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGrupoFormaPago() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoGrupoFormaPago() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoGrupoFormaPago.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoGrupoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoGrupoFormaPago.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoGrupoFormaPago.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoGrupoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoGrupoFormaPago.addItem(reporte);
			}
			
			
			if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoGrupoFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoGrupoFormaPago.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoGrupoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoGrupoFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoGrupoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoGrupoFormaPago.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoFormaPago();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoGrupoFormaPago() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoGrupoFormaPago()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		//this.idBusquedaPorId=Long.parseLong(this.jTextFieldidTipoGrupoFormaPagoBusquedaPorId.getText());
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoGrupoFormaPago.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoGrupoFormaPago(Boolean esInicializar) throws Exception {				
		if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoGrupoFormaPago();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoGrupoFormaPago() throws Exception {
		this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoGrupoFormaPago() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoGrupoFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoGrupoFormaPagoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoGrupoFormaPagoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFormaPagoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoGrupoFormaPagoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoGrupoFormaPagoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoGrupoFormaPago(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipogrupoformapagos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoGrupoFormaPago.setModel(new TipoGrupoFormaPagoModel(this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoGrupoFormaPago.setModel(new TipoGrupoFormaPagoModel(this.tipogrupoformapagos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoGrupoFormaPago!=null && this.jInternalFrameOrderByTipoGrupoFormaPago.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoGrupoFormaPago();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFormaPago,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoGrupoFormaPagoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO,tipogrupoformapagoConstantesFunciones.resaltarSeleccionarTipoGrupoFormaPago,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoGrupoFormaPagoConstantesFunciones.SCLASSWEBTITULO,tipogrupoformapagoConstantesFunciones.resaltarSeleccionarTipoGrupoFormaPago,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFormaPago,TipoGrupoFormaPagoConstantesFunciones.LABEL_ID));

		if(this.tipogrupoformapagoConstantesFunciones.mostraridTipoGrupoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoFormaPagoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipogrupoformapagoConstantesFunciones.resaltaridTipoGrupoFormaPago,this.tipogrupoformapagoConstantesFunciones.activaridTipoGrupoFormaPago,this,true,"idTipoGrupoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogrupoformapagoConstantesFunciones.resaltaridTipoGrupoFormaPago,this.tipogrupoformapagoConstantesFunciones.activaridTipoGrupoFormaPago,this,true,"idTipoGrupoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFormaPago,TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipogrupoformapagoConstantesFunciones.mostrarnombreTipoGrupoFormaPago && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipogrupoformapagoConstantesFunciones.resaltarnombreTipoGrupoFormaPago,this.tipogrupoformapagoConstantesFunciones.activarnombreTipoGrupoFormaPago,this,true,"nombreTipoGrupoFormaPago","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipogrupoformapagoConstantesFunciones.resaltarnombreTipoGrupoFormaPago,this.tipogrupoformapagoConstantesFunciones.activarnombreTipoGrupoFormaPago,this,true,"nombreTipoGrupoFormaPago","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoGrupoFormaPagoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosTipoFormaPago && this.tipogrupoformapagoConstantesFunciones.mostrarTipoFormaPagoTipoGrupoFormaPago && !TipoGrupoFormaPagoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Tipo Forma Pagos");
				tableColumn.setHeaderValue("Tipo Forma Pagos");
				tableColumn.setCellRenderer(new TipoFormaPagoTableCell(tipogrupoformapagoConstantesFunciones.resaltarTipoFormaPagoTipoGrupoFormaPago,this,this.tipogrupoformapagoConstantesFunciones.activarTipoFormaPagoTipoGrupoFormaPago));
				tableColumn.setCellEditor(new TipoFormaPagoTableCell(tipogrupoformapagoConstantesFunciones.resaltarTipoFormaPagoTipoGrupoFormaPago,this,this.tipogrupoformapagoConstantesFunciones.activarTipoFormaPagoTipoGrupoFormaPago));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGrupoFormaPago.addColumn(tableColumn);
			}

			if(this.isTienePermisosDatoGeneralEmpleado && this.tipogrupoformapagoConstantesFunciones.mostrarDatoGeneralEmpleadoTipoGrupoFormaPago && !TipoGrupoFormaPagoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Dato General Empleados");
				tableColumn.setHeaderValue("Dato General Empleados");
				tableColumn.setCellRenderer(new DatoGeneralEmpleadoTableCell(tipogrupoformapagoConstantesFunciones.resaltarDatoGeneralEmpleadoTipoGrupoFormaPago,this,this.tipogrupoformapagoConstantesFunciones.activarDatoGeneralEmpleadoTipoGrupoFormaPago));
				tableColumn.setCellEditor(new DatoGeneralEmpleadoTableCell(tipogrupoformapagoConstantesFunciones.resaltarDatoGeneralEmpleadoTipoGrupoFormaPago,this,this.tipogrupoformapagoConstantesFunciones.activarDatoGeneralEmpleadoTipoGrupoFormaPago));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGrupoFormaPago.addColumn(tableColumn);
			}

			if(this.isTienePermisosAnticipoCliente && this.tipogrupoformapagoConstantesFunciones.mostrarAnticipoClienteTipoGrupoFormaPago && !TipoGrupoFormaPagoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Anticipo Clientes");
				tableColumn.setHeaderValue("Anticipo Clientes");
				tableColumn.setCellRenderer(new AnticipoClienteTableCell(tipogrupoformapagoConstantesFunciones.resaltarAnticipoClienteTipoGrupoFormaPago,this,this.tipogrupoformapagoConstantesFunciones.activarAnticipoClienteTipoGrupoFormaPago));
				tableColumn.setCellEditor(new AnticipoClienteTableCell(tipogrupoformapagoConstantesFunciones.resaltarAnticipoClienteTipoGrupoFormaPago,this,this.tipogrupoformapagoConstantesFunciones.activarAnticipoClienteTipoGrupoFormaPago));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoGrupoFormaPago.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGrupoFormaPago.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoGrupoFormaPago.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoGrupoFormaPago.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoGrupoFormaPago.addColumn(tableColumn);
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
			
			this.jTableDatosTipoGrupoFormaPago.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoGrupoFormaPago.moveColumn(this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoGrupoFormaPago.moveColumn(this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoGrupoFormaPago.moveColumn(this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoGrupoFormaPago.moveColumn(this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoGrupoFormaPago.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoGrupoFormaPago.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoGrupoFormaPago,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoGrupoFormaPago.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoGrupoFormaPago.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoGrupoFormaPago.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipogrupoformapagoLogic.getTipoGrupoFormaPagos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipogrupoformapagos.size()-1;
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
		//this.jTableDatosTipoGrupoFormaPago.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoGrupoFormaPago.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoGrupoFormaPago();
			
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
				
				//this.isEsNuevoTipoGrupoFormaPago=false;
					
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
				if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGrupoFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGrupoFormaPago.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipogrupoformapago.getsType().equals("DUPLICADO")
				   || this.tipogrupoformapago.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoGrupoFormaPago=true;
				
				} else {
					this.isEsNuevoTipoGrupoFormaPago=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipogrupoformapago.getId()>=0 && !this.tipogrupoformapago.getIsNew()) {						
						this.isEsNuevoTipoGrupoFormaPago=false;
						
					} else {
						this.isEsNuevoTipoGrupoFormaPago=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoGrupoFormaPago(esRelaciones);						
				
				this.seleccionarTipoGrupoFormaPago(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipogrupoformapago.getId()<0) {
					this.isEsNuevoTipoGrupoFormaPago=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoGrupoFormaPago(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoGrupoFormaPago(evt,rowIndex);
				}	
				
				if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoGrupoFormaPago: " + this.dDif); 
					}
				}								
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoGrupoFormaPago(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipogrupoformapago)) {
					if(this.tipogrupoformapago.getId()>0) {
						this.tipogrupoformapago.setIsDeleted(true);
						
						this.tipogrupoformapagosEliminados.add(this.tipogrupoformapago);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().remove(this.tipogrupoformapago);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipogrupoformapagos.remove(this.tipogrupoformapago);				
					}
					
					
					((TipoGrupoFormaPagoModel) this.jTableDatosTipoGrupoFormaPago.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoGrupoFormaPago(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoGrupoFormaPago) {
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoGrupoFormaPago.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoGrupoFormaPago.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoGrupoFormaPago(this.tipogrupoformapago);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoGrupoFormaPago("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoGrupoFormaPago(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoGrupoFormaPago() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoGrupoFormaPago(tipogrupoformapago,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoGrupoFormaPago(tipogrupoformapago);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoGrupoFormaPago(tipogrupoformapago,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFormaPago(tipogrupoformapago);
	}
	
	public void setVariablesObjetoActualToFormularioTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.setText(tipogrupoformapago.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextAreanombreTipoGrupoFormaPago.setText(tipogrupoformapago.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoGrupoFormaPago tipogrupoformapagoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipogrupoformapagoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoGrupoFormaPago tipogrupoformapagoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipogrupoformapagoLocal=this.tipogrupoformapago;
			} else {
				tipogrupoformapagoLocal=this.tipogrupoformapagoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipogrupoformapagoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoGrupoFormaPago(tipogrupoformapagoLocal,true);
					
					if(tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipogrupoformapagoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipogrupoformapagoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(tipogrupoformapago,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(tipogrupoformapago);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(tipogrupoformapago,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.getText()==null || this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.getText()=="" || this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.setText("0");
			}

			if(conColumnasBase) {tipogrupoformapago.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoFormaPagoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoFormaPago.jLabelIdTipoGrupoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipogrupoformapago.setnombre(this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextAreanombreTipoGrupoFormaPago.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoGrupoFormaPago.jLabelnombreTipoGrupoFormaPago,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapagoBean,TipoGrupoFormaPago tipogrupoformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapagoOrigen,TipoGrupoFormaPago tipogrupoformapago,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogrupoformapagoOrigen.getId()!=null && !tipogrupoformapagoOrigen.getId().equals(0L))) {tipogrupoformapago.setId(tipogrupoformapagoOrigen.getId());}}
			if(conDefault || (!conDefault && tipogrupoformapagoOrigen.getnombre()!=null && !tipogrupoformapagoOrigen.getnombre().equals(""))) {tipogrupoformapago.setnombre(tipogrupoformapagoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.setText(tipogrupoformapago.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextAreanombreTipoGrupoFormaPago.setText(tipogrupoformapago.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoGrupoFormaPago(TipoGrupoFormaPagoBean tipogrupoformapagoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.setText(tipogrupoformapagoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextAreanombreTipoGrupoFormaPago.setText(tipogrupoformapagoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoGrupoFormaPago(TipoGrupoFormaPagoParameterReturnGeneral tipogrupoformapagoReturnGeneral,TipoGrupoFormaPagoBean tipogrupoformapagoBean,Boolean conDefault) throws Exception { 
		try {
			TipoGrupoFormaPago tipogrupoformapagoLocal=new TipoGrupoFormaPago();
			
			tipogrupoformapagoLocal=tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipogrupoformapagoLocal.getId()!=null && !tipogrupoformapagoLocal.getId().equals(0L))) {tipogrupoformapagoBean.setId(tipogrupoformapagoLocal.getId());}}
			if(conDefault || (!conDefault && tipogrupoformapagoLocal.getnombre()!=null && !tipogrupoformapagoLocal.getnombre().equals(""))) {tipogrupoformapagoBean.setnombre(tipogrupoformapagoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoGrupoFormaPagoGenerico(Long idTipoGrupoFormaPagoSeleccionado,JComboBox jComboBoxTipoGrupoFormaPago,List<TipoGrupoFormaPago> tipogrupoformapagosLocal)throws Exception {
		try {
			TipoGrupoFormaPago  tipogrupoformapagoTemp=null;

			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosLocal) {
				if(tipogrupoformapagoAux.getId()!=null && tipogrupoformapagoAux.getId().equals(idTipoGrupoFormaPagoSeleccionado)) {
					tipogrupoformapagoTemp=tipogrupoformapagoAux;
					break;
				}
			}

			jComboBoxTipoGrupoFormaPago.setSelectedItem(tipogrupoformapagoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoGrupoFormaPagoGenerico(JComboBox jComboBoxTipoGrupoFormaPago,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoGrupoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrupoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoGrupoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoGrupoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrupoFormaPago.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoGrupoFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoGrupoFormaPago.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoGrupoFormaPago.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoGrupoFormaPago.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoGrupoFormaPago.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("TipoFormaPago")) {
			jButtonTipoFormaPagoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("DatoGeneralEmpleado")) {
			jButtonDatoGeneralEmpleadoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("AnticipoCliente")) {
			jButtonAnticipoClienteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogrupoformapago=(TipoGrupoFormaPago) tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogrupoformapago =(TipoGrupoFormaPago) tipogrupoformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoGrupoFormaPago tipogrupoformapagoRow=new TipoGrupoFormaPago();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogrupoformapagoRow=(TipoGrupoFormaPago) tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipogrupoformapagoRow=(TipoGrupoFormaPago) tipogrupoformapagos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonTipoFormaPagoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGrupoFormaPago tipogrupoformapago) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoformapago = (TipoGrupoFormaPago)this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogrupoformapago = (TipoGrupoFormaPago)this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogrupoformapago!=null) {
						this.tipogrupoformapago = tipogrupoformapago;
					} else {
						this.tipogrupoformapago = new TipoGrupoFormaPago();
					}
				}

				if(this.isTienePermisosTipoFormaPago && this.permiteMantenimiento(this.tipogrupoformapago)) {
					TipoFormaPagoBeanSwingJInternalFrame tipoformapagoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFramePopup=new TipoFormaPagoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						tipoformapagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFramePopup;
					} else {
						tipoformapagoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame;
					}

					List<TipoGrupoFormaPago> tipogrupoformapagos=new ArrayList<TipoGrupoFormaPago>();
					tipogrupoformapagos.add(this.tipogrupoformapago);
					if(!esRelacionado) {
						//tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.setConGuardarRelaciones(false);
						//tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					tipoformapagoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.cargarTipoFormaPagoBeanSwingJInternalFrame(tipogrupoformapagos,this.tipogrupoformapago,tipoformapagoBeanSwingJInternalFrame,/*conInicializar,*/tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.getConGuardarRelaciones(),tipoformapagoBeanSwingJInternalFrame.tipoformapagoSessionBean.getEsGuardarRelacionado());
					tipoformapagoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						tipoformapagoBeanSwingJInternalFrame.actualizarEstadoPanelsTipoFormaPago("no_relacionado");

						tipoformapagoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(TipoFormaPagoConstantesFunciones.ITAMANIOFILATABLA + (TipoFormaPagoConstantesFunciones.ITAMANIOFILATABLA/2));

						tipoformapagoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGrupoFormaPago=(TitledBorder)this.jScrollPanelDatosTipoGrupoFormaPago.getBorder();
						TitledBorder titledBorderTipoFormaPago=(TitledBorder)tipoformapagoBeanSwingJInternalFrame.jScrollPanelDatosTipoFormaPago.getBorder();

						titledBorderTipoFormaPago.setTitle(titledBorderTipoGrupoFormaPago.getTitle() + " -> Tipo Forma Pago");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,tipoformapagoBeanSwingJInternalFrame);
						}

						tipoformapagoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(tipoformapagoBeanSwingJInternalFrame);

						tipoformapagoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Tipo Forma Pago",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonDatoGeneralEmpleadoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGrupoFormaPago tipogrupoformapago) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoformapago = (TipoGrupoFormaPago)this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogrupoformapago = (TipoGrupoFormaPago)this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogrupoformapago!=null) {
						this.tipogrupoformapago = tipogrupoformapago;
					} else {
						this.tipogrupoformapago = new TipoGrupoFormaPago();
					}
				}

				if(this.isTienePermisosDatoGeneralEmpleado && this.permiteMantenimiento(this.tipogrupoformapago)) {
					DatoGeneralEmpleadoBeanSwingJInternalFrame datogeneralempleadoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFramePopup=new DatoGeneralEmpleadoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFramePopup;
					} else {
						datogeneralempleadoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame;
					}

					List<TipoGrupoFormaPago> tipogrupoformapagos=new ArrayList<TipoGrupoFormaPago>();
					tipogrupoformapagos.add(this.tipogrupoformapago);
					if(!esRelacionado) {
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setConGuardarRelaciones(false);
						//datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.cargarDatoGeneralEmpleadoBeanSwingJInternalFrame(tipogrupoformapagos,this.tipogrupoformapago,datogeneralempleadoBeanSwingJInternalFrame,/*conInicializar,*/datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getConGuardarRelaciones(),datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoSessionBean.getEsGuardarRelacionado());
					datogeneralempleadoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						datogeneralempleadoBeanSwingJInternalFrame.actualizarEstadoPanelsDatoGeneralEmpleado("no_relacionado");

						datogeneralempleadoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA + (DatoGeneralEmpleadoConstantesFunciones.ITAMANIOFILATABLA/2));

						datogeneralempleadoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGrupoFormaPago=(TitledBorder)this.jScrollPanelDatosTipoGrupoFormaPago.getBorder();
						TitledBorder titledBorderDatoGeneralEmpleado=(TitledBorder)datogeneralempleadoBeanSwingJInternalFrame.jScrollPanelDatosDatoGeneralEmpleado.getBorder();

						titledBorderDatoGeneralEmpleado.setTitle(titledBorderTipoGrupoFormaPago.getTitle() + " -> Dato General Empleado");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,datogeneralempleadoBeanSwingJInternalFrame);
						}

						datogeneralempleadoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(datogeneralempleadoBeanSwingJInternalFrame);

						datogeneralempleadoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Dato General Empleado",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonAnticipoClienteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoGrupoFormaPago tipogrupoformapago) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoformapago = (TipoGrupoFormaPago)this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipogrupoformapago = (TipoGrupoFormaPago)this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipogrupoformapago!=null) {
						this.tipogrupoformapago = tipogrupoformapago;
					} else {
						this.tipogrupoformapago = new TipoGrupoFormaPago();
					}
				}

				if(this.isTienePermisosAnticipoCliente && this.permiteMantenimiento(this.tipogrupoformapago)) {
					AnticipoClienteBeanSwingJInternalFrame anticipoclienteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFramePopup=new AnticipoClienteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						anticipoclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFramePopup;
					} else {
						anticipoclienteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame;
					}

					List<TipoGrupoFormaPago> tipogrupoformapagos=new ArrayList<TipoGrupoFormaPago>();
					tipogrupoformapagos.add(this.tipogrupoformapago);
					if(!esRelacionado) {
						//anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setConGuardarRelaciones(false);
						//anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					anticipoclienteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.cargarAnticipoClienteBeanSwingJInternalFrame(tipogrupoformapagos,this.tipogrupoformapago,anticipoclienteBeanSwingJInternalFrame,/*conInicializar,*/anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.getConGuardarRelaciones(),anticipoclienteBeanSwingJInternalFrame.anticipoclienteSessionBean.getEsGuardarRelacionado());
					anticipoclienteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						anticipoclienteBeanSwingJInternalFrame.actualizarEstadoPanelsAnticipoCliente("no_relacionado");

						anticipoclienteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(AnticipoClienteConstantesFunciones.ITAMANIOFILATABLA + (AnticipoClienteConstantesFunciones.ITAMANIOFILATABLA/2));

						anticipoclienteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoGrupoFormaPago=(TitledBorder)this.jScrollPanelDatosTipoGrupoFormaPago.getBorder();
						TitledBorder titledBorderAnticipoCliente=(TitledBorder)anticipoclienteBeanSwingJInternalFrame.jScrollPanelDatosAnticipoCliente.getBorder();

						titledBorderAnticipoCliente.setTitle(titledBorderTipoGrupoFormaPago.getTitle() + " -> Anticipo Cliente");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,anticipoclienteBeanSwingJInternalFrame);
						}

						anticipoclienteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(anticipoclienteBeanSwingJInternalFrame);

						anticipoclienteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Anticipo Cliente",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoGrupoFormaPago(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFormaPago && this.isPermisoNuevoTipoGrupoFormaPago));			
			this.jButtonDuplicarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoFormaPago && this.isPermisoDuplicarTipoGrupoFormaPago));			
			this.jButtonCopiarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoFormaPago && this.isPermisoCopiarTipoGrupoFormaPago));
			this.jButtonVerFormTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoFormaPago && this.isPermisoVerFormTipoGrupoFormaPago));
			
			this.jButtonAbrirOrderByTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFormaPago && this.isPermisoOrdenTipoGrupoFormaPago));			
			
			this.jButtonNuevoRelacionesTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago && this.isPermisoNuevoTipoGrupoFormaPago));			
			this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFormaPago && this.isPermisoNuevoTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonModificarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaModificarTipoGrupoFormaPago && this.isPermisoActualizarTipoGrupoFormaPago));	
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoFormaPago && this.isPermisoActualizarTipoGrupoFormaPago));	
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoFormaPago && this.isPermisoEliminarTipoGrupoFormaPago));
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarTipoGrupoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFormaPago);							
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFormaPago && this.isPermisoNuevoTipoGrupoFormaPago));						
			this.jButtonDuplicarToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoFormaPago && this.isPermisoDuplicarTipoGrupoFormaPago));						
			this.jButtonCopiarToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoFormaPago && this.isPermisoCopiarTipoGrupoFormaPago));			
			this.jButtonVerFormToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoFormaPago && this.isPermisoVerFormTipoGrupoFormaPago));			
			this.jButtonAbrirOrderByToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFormaPago && this.isPermisoOrdenTipoGrupoFormaPago));
			this.jButtonNuevoRelacionesToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago && this.isPermisoNuevoTipoGrupoFormaPago));			
			this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFormaPago && this.isPermisoNuevoTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));			
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonModificarToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaModificarTipoGrupoFormaPago && this.isPermisoActualizarTipoGrupoFormaPago));	
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoFormaPago  && this.isPermisoActualizarTipoGrupoFormaPago));	
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoFormaPago && this.isPermisoEliminarTipoGrupoFormaPago));
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarToolBarTipoGrupoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFormaPago);				
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFormaPago && this.isPermisoNuevoTipoGrupoFormaPago));			
			this.jMenuItemDuplicarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaDuplicarTipoGrupoFormaPago && this.isPermisoDuplicarTipoGrupoFormaPago));			
			this.jMenuItemCopiarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaCopiarTipoGrupoFormaPago && this.isPermisoCopiarTipoGrupoFormaPago));			
			this.jMenuItemVerFormTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaVerFormTipoGrupoFormaPago && this.isPermisoVerFormTipoGrupoFormaPago));			
			this.jMenuItemAbrirOrderByTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFormaPago && this.isPermisoOrdenTipoGrupoFormaPago));			
			//this.jMenuItemMostrarOcultarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFormaPago && this.isPermisoOrdenTipoGrupoFormaPago));
			this.jMenuItemDetalleAbrirOrderByTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFormaPago && this.isPermisoOrdenTipoGrupoFormaPago));			
			//this.jMenuItemDetalleMostrarOcultarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaOrdenTipoGrupoFormaPago && this.isPermisoOrdenTipoGrupoFormaPago));			
			this.jMenuItemNuevoRelacionesTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago && this.isPermisoNuevoTipoGrupoFormaPago));			
			this.jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaNuevoTipoGrupoFormaPago && this.isPermisoNuevoTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));									
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemModificarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaModificarTipoGrupoFormaPago && this.isPermisoActualizarTipoGrupoFormaPago));	
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemActualizarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaActualizarTipoGrupoFormaPago && this.isPermisoActualizarTipoGrupoFormaPago));	
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemEliminarTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaEliminarTipoGrupoFormaPago && this.isPermisoEliminarTipoGrupoFormaPago));
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemCancelarTipoGrupoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFormaPago);				
			}
			
			this.jMenuItemGuardarCambiosTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));						
			this.jMenuItemGuardarCambiosTablaTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=this.jButtonNuevoTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaDuplicarTipoGrupoFormaPago=this.jButtonDuplicarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaCopiarTipoGrupoFormaPago=this.jButtonCopiarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaVerFormTipoGrupoFormaPago=this.jButtonVerFormTipoGrupoFormaPago.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoGrupoFormaPago=this.jButtonAbrirOrderByTipoGrupoFormaPago.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=this.jButtonNuevoRelacionesTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=this.jButtonModificarTipoGrupoFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosTipoGrupoFormaPago.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=this.jButtonNuevoToolBarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=this.jButtonNuevoRelacionesToolBarTipoGrupoFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonModificarToolBarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarToolBarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarToolBarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarToolBarTipoGrupoFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=this.jButtonGuardarCambiosToolBarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=this.jButtonGuardarCambiosTablaToolBarTipoGrupoFormaPago.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=this.jMenuItemNuevoTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=this.jMenuItemNuevoRelacionesTipoGrupoFormaPago.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemModificarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemActualizarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemEliminarTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemCancelarTipoGrupoFormaPago.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=this.jMenuItemGuardarCambiosTipoGrupoFormaPago.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=this.jMenuItemGuardarCambiosTablaTipoGrupoFormaPago.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoGrupoFormaPago(Boolean esInicializar) {
		if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGrupoFormaPago();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoGrupoFormaPago(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoGrupoFormaPago() {
		this.jButtonNuevoTipoGrupoFormaPago.setVisible(this.isPermisoNuevoTipoGrupoFormaPago);			
		this.jButtonDuplicarTipoGrupoFormaPago.setVisible(this.isPermisoDuplicarTipoGrupoFormaPago);			
		this.jButtonCopiarTipoGrupoFormaPago.setVisible(this.isPermisoCopiarTipoGrupoFormaPago);			
		this.jButtonVerFormTipoGrupoFormaPago.setVisible(this.isPermisoVerFormTipoGrupoFormaPago);			
		
		this.jButtonAbrirOrderByTipoGrupoFormaPago.setVisible(this.isPermisoOrdenTipoGrupoFormaPago);					
		
		this.jButtonNuevoRelacionesTipoGrupoFormaPago.setVisible(this.isPermisoNuevoTipoGrupoFormaPago);			
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonModificarTipoGrupoFormaPago.setVisible(this.isPermisoActualizarTipoGrupoFormaPago);	
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarTipoGrupoFormaPago.setVisible(this.isPermisoActualizarTipoGrupoFormaPago);	
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarTipoGrupoFormaPago.setVisible(this.isPermisoEliminarTipoGrupoFormaPago);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarTipoGrupoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFormaPago);						
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosTipoGrupoFormaPago.setVisible(this.isPermisoGuardarCambiosTipoGrupoFormaPago);							
		}
		
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.setVisible(this.isPermisoActualizarTipoGrupoFormaPago);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGrupoFormaPago() {
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonModificarTipoGrupoFormaPago.setVisible(this.isPermisoActualizarTipoGrupoFormaPago);	
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarTipoGrupoFormaPago.setVisible(this.isPermisoActualizarTipoGrupoFormaPago);	
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarTipoGrupoFormaPago.setVisible(this.isPermisoEliminarTipoGrupoFormaPago);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarTipoGrupoFormaPago.setVisible(this.isVisibilidadCeldaCancelarTipoGrupoFormaPago);							
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosTipoGrupoFormaPago.setVisible((this.isVisibilidadCeldaGuardarTipoGrupoFormaPago && this.isPermisoGuardarCambiosTipoGrupoFormaPago));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoGrupoFormaPago() {
		if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoGrupoFormaPago();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoGrupoFormaPago() {
	}
	
	public void jTableDatosTipoGrupoFormaPagoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoGrupoFormaPago(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoGrupoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.gettipogrupoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogrupoformapago==null) {
						this.tipogrupoformapago = new TipoGrupoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);
				}

				if(this.tipogrupoformapago.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipogrupoformapago.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoGrupoFormaPagoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.gettipogrupoformapago(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipogrupoformapago==null) {
						this.tipogrupoformapago = new TipoGrupoFormaPago();
					}

					this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);
				}

				if(this.tipogrupoformapago.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipogrupoformapago.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoGrupoFormaPago(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);

			this.getTipoGrupoFormaPagosBusquedaPorId();

			this.inicializarActualizarBindingTipoGrupoFormaPago(false);

			//if(TipoGrupoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreTipoGrupoFormaPagoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);

			this.getTipoGrupoFormaPagosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoGrupoFormaPago(false);

			//if(TipoGrupoFormaPagoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipogrupoformapagoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoGrupoFormaPago() {
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
		

		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.dispose();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago!=null) {
			this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.dispose();
			this.jInternalFrameReporteDinamicoTipoGrupoFormaPago=null;
		}
		
		if(this.jInternalFrameImportacionTipoGrupoFormaPago!=null) {
			this.jInternalFrameImportacionTipoGrupoFormaPago.setVisible(false);	    			
			this.jInternalFrameImportacionTipoGrupoFormaPago.dispose();
			this.jInternalFrameImportacionTipoGrupoFormaPago=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoGrupoFormaPago();
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoGrupoFormaPago")) {
				jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoGrupoFormaPago")) {
				jButtonDuplicarTipoGrupoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoGrupoFormaPago")) {
				jButtonCopiarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoGrupoFormaPago")) {
				jButtonVerFormTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoGrupoFormaPago")) {
				jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoGrupoFormaPago")) {
				jButtonDuplicarTipoGrupoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoGrupoFormaPago")) {
				jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoGrupoFormaPago")) {
				jButtonDuplicarTipoGrupoFormaPagoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoGrupoFormaPago")) {
				jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoGrupoFormaPago")) {
				jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoGrupoFormaPago")) {
				jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoGrupoFormaPago")) {
				jButtonModificarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoGrupoFormaPago")) {
				jButtonModificarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoGrupoFormaPago")) {
				jButtonModificarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoGrupoFormaPago")) {
				jButtonActualizarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoGrupoFormaPago")) {
				jButtonActualizarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoGrupoFormaPago")) {
				jButtonActualizarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoGrupoFormaPago")) {
				jButtonEliminarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoGrupoFormaPago")) {
				jButtonEliminarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoGrupoFormaPago")) {
				jButtonEliminarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoGrupoFormaPago")) {
				jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoGrupoFormaPago")) {
				jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoGrupoFormaPago")) {
				jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoGrupoFormaPago")) {
				jButtonCerrarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoGrupoFormaPago")) {
				jButtonCerrarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoGrupoFormaPago")) {
				jButtonCerrarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoGrupoFormaPago")) {
				jButtonMostrarOcultarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoGrupoFormaPago")) {
				jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoGrupoFormaPago")) {
				jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoGrupoFormaPago")) {
				jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoGrupoFormaPago")) {
				jButtonCopiarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoGrupoFormaPago")) {
				jButtonVerFormTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoGrupoFormaPago")) {
				jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoGrupoFormaPago")) {
				jButtonCopiarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoGrupoFormaPago")) {
				jButtonVerFormTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoGrupoFormaPago")) {
				jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoGrupoFormaPago")) {
				jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoGrupoFormaPago")) {
				jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoGrupoFormaPago")) {
				jButtonRecargarInformacionTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoGrupoFormaPago")) {
				jButtonRecargarInformacionTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoGrupoFormaPago")) {
				jButtonRecargarInformacionTipoGrupoFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoGrupoFormaPago")) {
				jButtonAnterioresTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoGrupoFormaPago")) {
				jButtonAnterioresTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoGrupoFormaPago")) {
				jButtonAnterioresTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoGrupoFormaPago")) {
				jButtonSiguientesTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoGrupoFormaPago")) {
				jButtonSiguientesTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoGrupoFormaPago")) {
				jButtonSiguientesTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoGrupoFormaPago") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoGrupoFormaPago")) {
				jButtonAbrirOrderByTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoGrupoFormaPago") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoGrupoFormaPago")) {
				jButtonMostrarOcultarTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGrupoFormaPago")) {
				jButtonNuevoGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoGrupoFormaPago")) {
				jButtonNuevoGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoGrupoFormaPago")) {
				jButtonNuevoGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoGrupoFormaPago")) {
				jButtonCerrarReporteDinamicoTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoGrupoFormaPago")) {
				jButtonGenerarReporteDinamicoTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoGrupoFormaPago")) {
				
				jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoGrupoFormaPago")) {
				jButtonCerrarImportacionTipoGrupoFormaPagoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoGrupoFormaPago")) {
				
				jButtonGenerarImportacionTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoGrupoFormaPago")) {
				
				jButtonAbrirImportacionTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoGrupoFormaPago")) {
				jComboBoxTiposAccionesTipoGrupoFormaPagoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoGrupoFormaPago")) {
				jComboBoxTiposRelacionesTipoGrupoFormaPagoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoGrupoFormaPago")) {
				jComboBoxTiposAccionesTipoGrupoFormaPagoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoGrupoFormaPago")) {
				
				jComboBoxTiposSeleccionarTipoGrupoFormaPagoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoGrupoFormaPago")) {
				jTextFieldValorCampoGeneralTipoGrupoFormaPagoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoGrupoFormaPago")) {
				jButtonAbrirOrderByTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoGrupoFormaPago")) {
				jButtonAbrirOrderByTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoGrupoFormaPago")) {
				jButtonCerrarOrderByTipoGrupoFormaPagoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGrupoFormaPagoBusqueda")) {
				this.jButtonidTipoGrupoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGrupoFormaPagoBusqueda")) {
				this.jButtonnombreTipoGrupoFormaPagoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorIdTipoGrupoFormaPago")) {
				this.jButtonBusquedaPorIdTipoGrupoFormaPagoActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreTipoGrupoFormaPago")) {
				this.jButtonBusquedaPorNombreTipoGrupoFormaPagoActionPerformed(evt);
			}
			
			;
			
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoGrupoFormaPago();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				


				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoGrupoFormaPago tipogrupoformapagoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipogrupoformapagoLocal=this.tipogrupoformapago;
			} else {
				tipogrupoformapagoLocal=this.tipogrupoformapagoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
							
				
				


				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
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
			
			


			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
								
						
				


				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
								
				
				


				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
							
				
				


				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
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
			
			


			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
								
				
				


				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoGrupoFormaPago")) {
					jCheckBoxSeleccionarTodosTipoGrupoFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoGrupoFormaPago")) {
					jCheckBoxSeleccionadosTipoGrupoFormaPagoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoGrupoFormaPago")) {
					
				}
				
				


				
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
												
				
				


				
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
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
			
			


			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipogrupoformapago);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipogrupoformapago);
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
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
				
				


				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoGrupoFormaPago.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoGrupoFormaPago.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoGrupoFormaPagoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipogrupoformapagoAnterior =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoGrupoFormaPago")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoGrupoFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoGrupoFormaPago.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipogrupoformapago =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipogrupoformapago);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoGrupoFormaPago")) {
				
				}
				
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoGrupoFormaPago")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoGrupoFormaPago.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoGrupoFormaPago")) {
			
			}
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoGrupoFormaPago();
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoGrupoFormaPago")) {
				jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoGrupoFormaPago")) {
				jButtonDuplicarTipoGrupoFormaPagoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoGrupoFormaPago")) {
				jButtonCopiarTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoGrupoFormaPago")) {
				jButtonVerFormTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoGrupoFormaPago")) {
				jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoGrupoFormaPago")) {
				jButtonModificarTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoGrupoFormaPago")) {
				jButtonActualizarTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoGrupoFormaPago")) {
				jButtonEliminarTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoGrupoFormaPago")) {
				jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoGrupoFormaPago")) {
				jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoGrupoFormaPago")) {
				jButtonCerrarTipoGrupoFormaPagoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoGrupoFormaPago")) {
				jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoGrupoFormaPago")) {
				jButtonNuevoGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoGrupoFormaPago")) {
				jButtonAbrirOrderByTipoGrupoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoGrupoFormaPago")) {
				jButtonRecargarInformacionTipoGrupoFormaPagoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoGrupoFormaPago")) {
				jButtonAnterioresTipoGrupoFormaPagoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoGrupoFormaPago")) {
				jButtonSiguientesTipoGrupoFormaPagoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoGrupoFormaPagoBusqueda")) {
				this.jButtonidTipoGrupoFormaPagoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoGrupoFormaPagoBusqueda")) {
				this.jButtonnombreTipoGrupoFormaPagoBusquedaActionPerformed(evt);
			}
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoGrupoFormaPago();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoGrupoFormaPago")) {
				closingInternalFrameTipoGrupoFormaPago();
				
			} else if(sTipo.equals("jButtonCancelarTipoGrupoFormaPago")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoGrupoFormaPago = (JInternalFrameBase)evt.getSource();
	            	
	            TipoGrupoFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoGrupoFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGrupoFormaPago.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoGrupoFormaPagoActionPerformed(null);
			}
			
			TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipogrupoformapago,new Object(),this.tipogrupoformapagoParameterGeneral,this.tipogrupoformapagoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoGrupoFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoGrupoFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoGrupoFormaPago(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipogrupoformapago)) {
			if(!esControlTabla) {
				if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);			
				}
				
				if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogrupoformapagoReturnGeneral=tipogrupoformapagoLogic.procesarEventosTipoGrupoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos(),this.tipogrupoformapago,this.tipogrupoformapagoParameterGeneral,this.isEsNuevoTipoGrupoFormaPago,classes);//this.tipogrupoformapagoLogic.getTipoGrupoFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoGrupoFormaPago(this.tipogrupoformapagoReturnGeneral,this.tipogrupoformapagoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoGrupoFormaPago(classes,this.tipogrupoformapagoReturnGeneral,this.tipogrupoformapagoBean,false);
					}
						
					if(this.tipogrupoformapagoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoGrupoFormaPago(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoGrupoFormaPago(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago());	
					}
						
					if(this.tipogrupoformapagoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoFormaPago(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago(),classes);//this.tipogrupoformapagoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoGrupoFormaPago(this.tipogrupoformapago,classes);//this.tipogrupoformapagoBean);									
				}
			
				if(TipoGrupoFormaPagoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoGrupoFormaPago(this.tipogrupoformapago,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoGrupoFormaPago(this.tipogrupoformapago);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipogrupoformapagoAnterior!=null) {
						this.tipogrupoformapago=this.tipogrupoformapagoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipogrupoformapagoReturnGeneral=tipogrupoformapagoLogic.procesarEventosTipoGrupoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos(),this.tipogrupoformapago,this.tipogrupoformapagoParameterGeneral,this.isEsNuevoTipoGrupoFormaPago,classes);//this.tipogrupoformapagoLogic.getTipoGrupoFormaPago()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipogrupoformapagoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago(),tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago(),this.tipogrupoformapagos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoGrupoFormaPago.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoGrupoFormaPago.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoGrupoFormaPago();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoGrupoFormaPago() throws Exception {
		
		TipoGrupoFormaPagoModel tipogrupoformapagoModel=(TipoGrupoFormaPagoModel)this.jTableDatosTipoGrupoFormaPago.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipogrupoformapagoModel.tipogrupoformapagos=this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipogrupoformapagoModel.tipogrupoformapagos=this.tipogrupoformapagos;
		}
		
		
		((TipoGrupoFormaPagoModel) this.jTableDatosTipoGrupoFormaPago.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoGrupoFormaPago() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipogrupoformapagoAnterior(),this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipogrupoformapagoAnterior(),this.tipogrupoformapagos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoGrupoFormaPago();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoFormaPago.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.setTipoFormaPagos(tipogrupoformapago.getTipoFormaPagos());
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipogrupoformapago.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(AnticipoCliente.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(tipogrupoformapago.getAnticipoClientes());
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnticipoCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
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
										
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoformapago,new Object(),generalEntityParameterGeneral,this.tipogrupoformapagoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoGrupoFormaPagoConstantesFunciones.getClassesRelationshipsOfTipoGrupoFormaPago(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoGrupoFormaPagoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoGrupoFormaPago(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoGrupoFormaPago(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipogrupoformapago,new Object(),generalEntityParameterGeneral,this.tipogrupoformapagoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoGrupoFormaPago(TipoGrupoFormaPagoBean tipogrupoformapagoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoFormaPago.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.setTipoFormaPagos(tipogrupoformapago.getTipoFormaPagos());
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoFormaPago(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.setDatoGeneralEmpleados(tipogrupoformapago.getDatoGeneralEmpleados());
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDatoGeneralEmpleado(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(AnticipoCliente.class)) {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.setAnticipoClientes(tipogrupoformapago.getAnticipoClientes());
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnticipoCliente(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoGrupoFormaPago(ArrayList<Classe> classes,TipoGrupoFormaPagoReturnGeneral tipogrupoformapagoReturnGeneral,TipoGrupoFormaPagoBean tipogrupoformapagoBean,Boolean conDefault) throws Exception {
		
			this.tipogrupoformapagoBean.setTipoFormaPagos(tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago().getTipoFormaPagos());
			this.tipogrupoformapagoBean.setDatoGeneralEmpleados(tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago().getDatoGeneralEmpleados());
			this.tipogrupoformapagoBean.setAnticipoClientes(tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago().getAnticipoClientes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(TipoFormaPago.class)) {
					tipogrupoformapago.setTipoFormaPagos(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoBeanSwingJInternalFrame.tipoformapagoLogic.getTipoFormaPagos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(DatoGeneralEmpleado.class)) {
					tipogrupoformapago.setDatoGeneralEmpleados(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoBeanSwingJInternalFrame.datogeneralempleadoLogic.getDatoGeneralEmpleados());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(AnticipoCliente.class)) {
					tipogrupoformapago.setAnticipoClientes(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteBeanSwingJInternalFrame.anticipoclienteLogic.getAnticipoClientes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipogrupoformapago)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago = new TipoGrupoFormaPagoDetalleFormJInternalFrame(jDesktopPane,this.tipogrupoformapagoSessionBean.getConGuardarRelaciones(),this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoGrupoFormaPago);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.setVisible(false);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipogrupoformapagoLogic=this.tipogrupoformapagoLogic;
		
		this.cargarCombosFrameForeignKeyTipoGrupoFormaPago("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoGrupoFormaPago();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoGrupoFormaPago();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoGrupoFormaPago("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoGrupoFormaPago();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGrupoFormaPago"));
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonModificarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarTipoGrupoFormaPago"));

		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonModificarToolBarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGrupoFormaPago"));
					
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemModificarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGrupoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoGrupoFormaPago"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarToolBarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGrupoFormaPago"));
						
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemActualizarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGrupoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarTipoGrupoFormaPago"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGrupoFormaPago"));
								
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemEliminarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGrupoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarTipoGrupoFormaPago"));
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGrupoFormaPago"));
					
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemCancelarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGrupoFormaPago"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemDetalleCerrarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGrupoFormaPago"));		
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoFormaPago"));
		
		
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGrupoFormaPago"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonidTipoGrupoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonnombreTipoGrupoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoFormaPagoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGrupoFormaPago"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoGrupoFormaPago"));
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoGrupoFormaPago"));
		}
		
		this.jTableDatosTipoGrupoFormaPago.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoGrupoFormaPago"));
		
		this.jTableDatosTipoGrupoFormaPago.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoGrupoFormaPago"));
		
		this.jButtonNuevoTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"NuevoTipoGrupoFormaPago"));
		
		this.jButtonDuplicarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarTipoGrupoFormaPago"));
		
		this.jButtonCopiarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"CopiarTipoGrupoFormaPago"));
		
		this.jButtonVerFormTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"VerFormTipoGrupoFormaPago"));
		
		
		this.jButtonNuevoToolBarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoGrupoFormaPago"));
			
		this.jButtonDuplicarToolBarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoGrupoFormaPago"));
			
		this.jMenuItemNuevoTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoGrupoFormaPago"));
			
		this.jMenuItemDuplicarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoGrupoFormaPago"));		
		
		
		this.jButtonNuevoRelacionesTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoGrupoFormaPago"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoGrupoFormaPago"));
			
		this.jMenuItemNuevoRelacionesTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoGrupoFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonModificarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarTipoGrupoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonModificarToolBarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoGrupoFormaPago"));
			
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemModificarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoGrupoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"ActualizarTipoGrupoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonActualizarToolBarTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoGrupoFormaPago"));
				
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemActualizarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoGrupoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarTipoGrupoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonEliminarToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoGrupoFormaPago"));
						
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemEliminarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoGrupoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarTipoGrupoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonCancelarToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoGrupoFormaPago"));
			
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemCancelarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoGrupoFormaPago"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoGrupoFormaPago"));		
		
		
		this.jButtonCerrarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"CerrarTipoGrupoFormaPago"));
		
		
		this.jButtonCerrarToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoGrupoFormaPago"));
			
		this.jMenuItemCerrarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoGrupoFormaPago"));
			
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jMenuItemDetalleCerrarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoGrupoFormaPago"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoGrupoFormaPago"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoGrupoFormaPago"));
		}
		
		this.jButtonCopiarToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoGrupoFormaPago"));
			
		this.jButtonVerFormToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoGrupoFormaPago"));
		
		this.jMenuItemGuardarCambiosTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoGrupoFormaPago"));
			
		this.jMenuItemCopiarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoGrupoFormaPago"));		
		
		this.jMenuItemVerFormTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoGrupoFormaPago"));		
		
		
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGrupoFormaPago"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoGrupoFormaPago"));
			
		this.jMenuItemGuardarCambiosTablaTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoGrupoFormaPago"));		
		
		
		
		this.jButtonRecargarInformacionTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoGrupoFormaPago"));
					
		this.jButtonRecargarInformacionToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoGrupoFormaPago"));
		
		this.jMenuItemRecargarInformacionTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoGrupoFormaPago"));		
		
		
		
		this.jButtonAnterioresTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresTipoGrupoFormaPago"));
		
		
		this.jButtonAnterioresToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoGrupoFormaPago"));
		
		this.jMenuItemAnterioresTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoGrupoFormaPago"));		
		
		
		this.jButtonSiguientesTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesTipoGrupoFormaPago"));
		
		
		this.jButtonSiguientesToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoGrupoFormaPago"));
			
		this.jMenuItemSiguientesTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoGrupoFormaPago"));
			
		this.jMenuItemAbrirOrderByTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoGrupoFormaPago"));
			
		this.jMenuItemMostrarOcultarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoGrupoFormaPago"));
			
		this.jMenuItemDetalleAbrirOrderByTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoGrupoFormaPago"));
			
		this.jMenuItemDetalleMostarOcultarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoGrupoFormaPago"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoGrupoFormaPago"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoGrupoFormaPago"));
			
		this.jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoGrupoFormaPago"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoGrupoFormaPago"));

		this.jCheckBoxSeleccionadosTipoGrupoFormaPago.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoGrupoFormaPago"));
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoGrupoFormaPago"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoGrupoFormaPago"));
			
		this.jComboBoxTiposAccionesTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoGrupoFormaPago"));
					
		this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoGrupoFormaPago"));
			
		this.jTextFieldValorCampoGeneralTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoGrupoFormaPago"));		
		
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonidTipoGrupoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonnombreTipoGrupoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoFormaPagoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoGrupoFormaPago"));

			this.jButtonBusquedaPorNombreTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGrupoFormaPago"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoGrupoFormaPago!=null) {
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoFormaPago"));
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoFormaPago"));
				this.jInternalFrameReporteDinamicoTipoGrupoFormaPago.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoFormaPago"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoGrupoFormaPago"));				
			//this.jButtonGenerarReporteDinamicoTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoGrupoFormaPago"));
			//this.jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoGrupoFormaPago"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoGrupoFormaPago!=null) {
				this.jInternalFrameImportacionTipoGrupoFormaPago.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoGrupoFormaPago"));
				this.jInternalFrameImportacionTipoGrupoFormaPago.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoGrupoFormaPago"));
				this.jInternalFrameImportacionTipoGrupoFormaPago.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoGrupoFormaPago"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoGrupoFormaPago"));
			
			this.jButtonAbrirOrderByToolBarTipoGrupoFormaPago.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoGrupoFormaPago"));			
			
			if(this.jInternalFrameOrderByTipoGrupoFormaPago!=null) {
				this.jInternalFrameOrderByTipoGrupoFormaPago.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoGrupoFormaPago"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTabbedPaneRelacionesTipoGrupoFormaPago.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoGrupoFormaPago"));
		
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
            		closingInternalFrameTipoGrupoFormaPago();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoGrupoFormaPago = (JInternalFrameBase)event.getSource();
	            	
	            TipoGrupoFormaPagoBeanSwingJInternalFrame jInternalFrameParent=(TipoGrupoFormaPagoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoGrupoFormaPago.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoGrupoFormaPagoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoGrupoFormaPago.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoGrupoFormaPagoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoGrupoFormaPago.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoGrupoFormaPago.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoGrupoFormaPago";
		inputMap = this.jButtonNuevoTipoGrupoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoGrupoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoGrupoFormaPago";
		inputMap = this.jButtonNuevoRelacionesTipoGrupoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoGrupoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoGrupoFormaPagoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoGrupoFormaPago";
		inputMap = this.jButtonModificarTipoGrupoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoGrupoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoGrupoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoGrupoFormaPago";
		inputMap = this.jButtonActualizarTipoGrupoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoGrupoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoGrupoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoGrupoFormaPago";
		inputMap = this.jButtonEliminarTipoGrupoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoGrupoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoGrupoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoGrupoFormaPago";
		inputMap = this.jButtonCancelarTipoGrupoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoGrupoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoGrupoFormaPago";
		inputMap = this.jButtonCerrarTipoGrupoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoGrupoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoGrupoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoGrupoFormaPago";
		inputMap = this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosTipoGrupoFormaPago.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonGuardarCambiosTipoGrupoFormaPago.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoGrupoFormaPago.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoGrupoFormaPagoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoGrupoFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoGrupoFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoGrupoFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoGrupoFormaPago.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoGrupoFormaPagoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonidTipoGrupoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoGrupoFormaPagoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jButtonnombreTipoGrupoFormaPagoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoGrupoFormaPagoBusqueda"));
		
		
		this.jButtonBusquedaPorIdTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaPorIdTipoGrupoFormaPago"));

		this.jButtonBusquedaPorNombreTipoGrupoFormaPago.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoGrupoFormaPago"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoGrupoFormaPago.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoGrupoFormaPagoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoGrupoFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoGrupoFormaPago.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoGrupoFormaPago(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
					tipogrupoformapagoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagos) {
					tipogrupoformapagoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoGrupoFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
						tipogrupoformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagos) {
						tipogrupoformapagoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGrupoFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGrupoFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoGrupoFormaPagoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoGrupoFormaPago.getSelectedRows();
			
			TipoGrupoFormaPago tipogrupoformapagoLocal=new TipoGrupoFormaPago();
			
			//this.seleccionarTodosTipoGrupoFormaPago(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipogrupoformapagoLocal =(TipoGrupoFormaPago) this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos().toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipogrupoformapagoLocal =(TipoGrupoFormaPago) this.tipogrupoformapagos.toArray()[this.jTableDatosTipoGrupoFormaPago.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipogrupoformapagoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
						tipogrupoformapagoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagos) {
						tipogrupoformapagoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoGrupoFormaPago.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoGrupoFormaPago.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoGrupoFormaPago,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoGrupoFormaPagoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoGrupoFormaPagoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoGrupoFormaPagoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoGrupoFormaPago.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
				
						if(sTipoSeleccionar.equals(TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogrupoformapagoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagos) {
					
						if(sTipoSeleccionar.equals(TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipogrupoformapagoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoGrupoFormaPagoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoGrupoFormaPago=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoGrupoFormaPago.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoGrupoFormaPago) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoGrupoFormaPago(conSplash);
				
					this.generarReporteTipoGrupoFormaPagosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoGrupoFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGrupoFormaPagosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoGrupoFormaPagosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGrupoFormaPago();
				
				this.exportarTipoGrupoFormaPagosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoGrupoFormaPagos();
				//this.importarTipoGrupoFormaPagos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoGrupoFormaPago();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoGrupoFormaPagosSeleccionados();
				//this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Grupo Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoGrupoFormaPago();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoGrupoFormaPago)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoGrupoFormaPago(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoGrupoFormaPagoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoGrupoFormaPago) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoGrupoFormaPago(conSplash);
					
						//this.actualizarParametrosGeneralTipoGrupoFormaPago();
						
						this.generarReporteProcesoAccionTipoGrupoFormaPagosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo Grupo Forma PagoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Grupo Forma Pago", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoGrupoFormaPago();
				
						this.actualizarParametrosGeneralTipoGrupoFormaPago();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipogrupoformapagoReturnGeneral=tipogrupoformapagoLogic.procesarAccionTipoGrupoFormaPagosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos(),this.tipogrupoformapagoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoGrupoFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoGrupoFormaPago();
					
					TipoGrupoFormaPagoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoGrupoFormaPagoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoGrupoFormaPago.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoGrupoFormaPago.jComboBoxTiposAccionesFormularioTipoGrupoFormaPago.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoGrupoFormaPago(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoGrupoFormaPagoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoGrupoFormaPago();
			
			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();		
			TipoGrupoFormaPago tipogrupoformapago=new TipoGrupoFormaPago();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoGrupoFormaPago(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoGrupoFormaPago.getSelectedItem();
			
			
			
			
			tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipogrupoformapagosSeleccionados.size()==1) {
				for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosSeleccionados) {
					tipogrupoformapago=tipogrupoformapagoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Tipo Forma Pago")) {
					jButtonTipoFormaPagoActionPerformed(null,rowIndex,true,false,tipogrupoformapago);
				}
				else if(this.sTipoRelacion.equals("Dato General Empleado")) {
					jButtonDatoGeneralEmpleadoActionPerformed(null,rowIndex,true,false,tipogrupoformapago);
				}
				else if(this.sTipoRelacion.equals("Anticipo Cliente")) {
					jButtonAnticipoClienteActionPerformed(null,rowIndex,true,false,tipogrupoformapago);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoGrupoFormaPago();
			
      		//this.finishProcessTipoGrupoFormaPago(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoGrupoFormaPagoReturnGeneral() throws Exception {
		if(this.tipogrupoformapagoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipogrupoformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipogrupoformapagoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipogrupoformapagoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipogrupoformapagoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipogrupoformapagoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoGrupoFormaPago(false);
		}
		
		if(this.tipogrupoformapagoReturnGeneral.getConRetornoLista() || this.tipogrupoformapagoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipogrupoformapagoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogrupoformapagoLogic.setTipoGrupoFormaPagos(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPagos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipogrupoformapagoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipogrupoformapagoLogic.setTipoGrupoFormaPago(this.tipogrupoformapagoReturnGeneral.getTipoGrupoFormaPago());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoGrupoFormaPago(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoGrupoFormaPago() throws Exception {
		
		
	}
	
	public ArrayList<TipoGrupoFormaPago> getTipoGrupoFormaPagosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoGrupoFormaPago) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagoLogic.getTipoGrupoFormaPagos()) {
					if(tipogrupoformapagoAux.getIsSelected()) {
						tipogrupoformapagosSeleccionados.add(tipogrupoformapagoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoGrupoFormaPago tipogrupoformapagoAux:this.tipogrupoformapagos) {
					if(tipogrupoformapagoAux.getIsSelected()) {
						tipogrupoformapagosSeleccionados.add(tipogrupoformapagoAux);				
					}
				}
			}
			
			if(tipogrupoformapagosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipogrupoformapagosSeleccionados.addAll(this.tipogrupoformapagoLogic.getTipoGrupoFormaPagos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipogrupoformapagosSeleccionados.addAll(this.tipogrupoformapagos);				
					}
				}
			}
		} else {
			tipogrupoformapagosSeleccionados.add(this.tipogrupoformapago);
		}
		
		return tipogrupoformapagosSeleccionados;
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
	
	public void generarReporteTipoGrupoFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoGrupoFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoGrupoFormaPagosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGrupoFormaPagosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoGrupoFormaPagosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoGrupoFormaPagosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Grupo Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoGrupoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();		
		
		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoGrupoFormaPagos("Todos",tipogrupoformapagosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoGrupoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();		
		
		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoGrupoFormaPagos("Todos",tipogrupoformapagosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoGrupoFormaPagosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();
		
		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoGrupoFormaPagos("Todos",tipogrupoformapagosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoGrupoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoGrupoFormaPago();
		
		
		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoGrupoFormaPago();
		
		
		//this.generarReporteTipoGrupoFormaPagos("Todos",tipogrupoformapagosSeleccionados ,tipogrupoformapagoImplementable,tipogrupoformapagoImplementableHome);
	}
	
	public void mostrarImportacionTipoGrupoFormaPagos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoGrupoFormaPago();
		
		this.abrirFrameImportacionTipoGrupoFormaPago();		
		
			
		//this.generarReporteTipoGrupoFormaPagos("Todos",tipogrupoformapagosSeleccionados ,tipogrupoformapagoImplementable,tipogrupoformapagoImplementableHome);
	}
	
	public void importarTipoGrupoFormaPagos() throws Exception {		
	
	}
	
	public void exportarTipoGrupoFormaPagosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoGrupoFormaPagosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoGrupoFormaPagosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoGrupoFormaPagosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Grupo Forma Pago",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoGrupoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();		
		
		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoformapago."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoGrupoFormaPago(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoGrupoFormaPago(tipogrupoformapagoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipogrupoformapagoAux.setsDetalleGeneralEntityReporte(tipogrupoformapagoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoGrupoFormaPago(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoGrupoFormaPagoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoFormaPagoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipogrupoformapago.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrupoformapago.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipogrupoformapago.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoGrupoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();		
		
		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoformapago.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoGrupoFormaPagos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoGrupoFormaPago(row);				
				iRow++;
			}				
			
			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoGrupoFormaPago(tipogrupoformapagoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoGrupoFormaPagosSeleccionados() throws Exception {
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();		
		
		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipogrupoformapago.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipogrupoformapagos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipogrupoformapago");
			//elementRoot.appendChild(element);
		
			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosSeleccionados) {
				element = document.createElement("tipogrupoformapago");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoGrupoFormaPago(tipogrupoformapagoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Grupo Forma Pago",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoGrupoFormaPago(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoFormaPagoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoFormaPagoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipogrupoformapago.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipogrupoformapago.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoGrupoFormaPago(TipoGrupoFormaPago tipogrupoformapago,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoGrupoFormaPagoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipogrupoformapago.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoGrupoFormaPagoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipogrupoformapago.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoGrupoFormaPagoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipogrupoformapago.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoGrupoFormaPagosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados=new ArrayList<TipoGrupoFormaPago>();
		
		tipogrupoformapagosSeleccionados=this.getTipoGrupoFormaPagosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoGrupoFormaPago(tipogrupoformapagosSeleccionados);
		
		this.generarReporteTipoGrupoFormaPagos("Todos",tipogrupoformapagosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoGrupoFormaPago(ArrayList<TipoGrupoFormaPago> tipogrupoformapagosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoGrupoFormaPago tipogrupoformapagoAux:tipogrupoformapagosSeleccionados) {
				tipogrupoformapagoAux.setsDetalleGeneralEntityReporte(tipogrupoformapagoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoGrupoFormaPagoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipogrupoformapagoAux.setsDescripcionGeneralEntityReporte1(tipogrupoformapagoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoGrupoFormaPagoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoGrupoFormaPago(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=true;
				this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=true;
			}
			
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaModificarTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaCancelarTipoGrupoFormaPago=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoGrupoFormaPago=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoGrupoFormaPagoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=true;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=true;
		} else {
			this.actualizarEstadoPanelsTipoGrupoFormaPago(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoGrupoFormaPago=false;
			//this.isVisibilidadCeldaVerFormTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaDuplicarTipoGrupoFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!tipogrupoformapagoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;												
			}
			
			this.jButtonCerrarTipoGrupoFormaPago.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoGrupoFormaPago=false;
		}
		
		if(!this.permiteMantenimiento(this.tipogrupoformapago)) {
			this.isVisibilidadCeldaActualizarTipoGrupoFormaPago=false;
			this.isVisibilidadCeldaEliminarTipoGrupoFormaPago=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoGrupoFormaPago() {
		this.isVisibilidadCeldaNuevoTipoGrupoFormaPago=false;
		this.isVisibilidadCeldaGuardarCambiosTipoGrupoFormaPago=false;
	}
	
	public void actualizarEstadoPanelsTipoGrupoFormaPago(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosTipoGrupoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoFormaPago!=null) {
				this.jPanelPaginacionTipoGrupoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFormaPago!=null) {
				this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosTipoGrupoFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoFormaPago!=null) {
				this.jPanelPaginacionTipoGrupoFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFormaPago!=null) {
				this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosTipoGrupoFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoFormaPago!=null) {
				this.jPanelPaginacionTipoGrupoFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFormaPago!=null) {
				this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosTipoGrupoFormaPago.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoGrupoFormaPago!=null) {
				this.jPanelPaginacionTipoGrupoFormaPago.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFormaPago!=null) {
				this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosTipoGrupoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoFormaPago!=null) {
				this.jPanelPaginacionTipoGrupoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFormaPago!=null) {
				this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosTipoGrupoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoFormaPago!=null) {
				this.jPanelPaginacionTipoGrupoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFormaPago!=null) {
				this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosEdicionTipoGrupoFormaPago.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoGrupoFormaPago!=null) {
				this.jScrollPanelDatosTipoGrupoFormaPago.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoGrupoFormaPago!=null) {
				this.jPanelPaginacionTipoGrupoFormaPago.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFormaPago!=null) {
				this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoGrupoFormaPago!=null) {
					this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFormaPago!=null) {
				this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipogrupoformapagoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoGrupoFormaPago!=null) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoGrupoFormaPago!=null) {
				this.jPanelParametrosReportesTipoGrupoFormaPago.setVisible(true);
			}
		}
	}	
	
	
	
	

	public String registrarSesionTipoGrupoFormaPagoParaTipoFormaPagos() throws Exception {
		Boolean isPaginaPopupTipoFormaPago=false;

		try {

			if(this.tipogrupoformapagoSessionBean==null) {
				this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoSessionBean=new TipoFormaPagoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoSessionBean.setsPathNavegacionActual(tipogrupoformapagoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+TipoFormaPagoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupTipoFormaPago=this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeTipoFormaPago(true);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeTipoFormaPago(TipoGrupoFormaPagoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago(true);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.tipoformapagoSessionBean.setlidTipoGrupoFormaPagoActual(this.idTipoGrupoFormaPagoActual);

			tipogrupoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGrupoFormaPago(true);
			tipogrupoformapagoSessionBean.setlIdTipoGrupoFormaPagoActualForeignKey(this.idTipoGrupoFormaPagoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoGrupoFormaPagoParaDatoGeneralEmpleados() throws Exception {
		Boolean isPaginaPopupDatoGeneralEmpleado=false;

		try {

			if(this.tipogrupoformapagoSessionBean==null) {
				this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoSessionBean=new DatoGeneralEmpleadoSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoSessionBean.setsPathNavegacionActual(tipogrupoformapagoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DatoGeneralEmpleadoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDatoGeneralEmpleado=this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(true);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDatoGeneralEmpleado(TipoGrupoFormaPagoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago(true);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.datogeneralempleadoSessionBean.setlidTipoGrupoFormaPagoActual(this.idTipoGrupoFormaPagoActual);

			tipogrupoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGrupoFormaPago(true);
			tipogrupoformapagoSessionBean.setlIdTipoGrupoFormaPagoActualForeignKey(this.idTipoGrupoFormaPagoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionTipoGrupoFormaPagoParaAnticipoClientes() throws Exception {
		Boolean isPaginaPopupAnticipoCliente=false;

		try {

			if(this.tipogrupoformapagoSessionBean==null) {
				this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteSessionBean==null) {
				this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteSessionBean=new AnticipoClienteSessionBean();
			}

			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteSessionBean.setsPathNavegacionActual(tipogrupoformapagoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+AnticipoClienteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupAnticipoCliente=this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeAnticipoCliente(true);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeAnticipoCliente(TipoGrupoFormaPagoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteSessionBean.setisBusquedaDesdeForeignKeySesionTipoGrupoFormaPago(true);
			this.jInternalFrameDetalleFormTipoGrupoFormaPago.anticipoclienteSessionBean.setlidTipoGrupoFormaPagoActual(this.idTipoGrupoFormaPagoActual);

			tipogrupoformapagoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoGrupoFormaPago(true);
			tipogrupoformapagoSessionBean.setlIdTipoGrupoFormaPagoActualForeignKey(this.idTipoGrupoFormaPagoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
		
		if(this.tipogrupoformapagoSessionBean==null) {
			this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
		}
		
		this.tipogrupoformapagoSessionBean.setsUltimaBusquedaTipoGrupoFormaPago(this.getsAccionBusqueda());
		this.tipogrupoformapagoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipogrupoformapagoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
			tipogrupoformapagoSessionBean.setid(this.getidBusquedaPorId());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipogrupoformapagoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoGrupoFormaPagoSessionBean tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
		
		if(this.tipogrupoformapagoSessionBean==null) {
			this.tipogrupoformapagoSessionBean=new TipoGrupoFormaPagoSessionBean();
		}
		
		if(this.tipogrupoformapagoSessionBean.getsUltimaBusquedaTipoGrupoFormaPago()!=null&&!this.tipogrupoformapagoSessionBean.getsUltimaBusquedaTipoGrupoFormaPago().equals("")) {
			this.setsAccionBusqueda(tipogrupoformapagoSessionBean.getsUltimaBusquedaTipoGrupoFormaPago());
			this.setiNumeroPaginacion(tipogrupoformapagoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipogrupoformapagoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorId")) {
				this.setidBusquedaPorId(tipogrupoformapagoSessionBean.getid());
				tipogrupoformapagoSessionBean.setid(0L);
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipogrupoformapagoSessionBean.getnombre());
				tipogrupoformapagoSessionBean.setnombre("");
			}
		}
		
		this.tipogrupoformapagoSessionBean.setsUltimaBusquedaTipoGrupoFormaPago("");
		this.tipogrupoformapagoSessionBean.setiNumeroPaginacion(TipoGrupoFormaPagoConstantesFunciones.INUMEROPAGINACION);
		this.tipogrupoformapagoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoGrupoFormaPago(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoGrupoFormaPago() {
		this.updateBorderResaltarBusquedasFormularioTipoGrupoFormaPago();
		this.updateVisibilidadBusquedasFormularioTipoGrupoFormaPago();
		this.updateHabilitarBusquedasFormularioTipoGrupoFormaPago();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoGrupoFormaPago() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponents().length>0) {
	

		if(this.tipogrupoformapagoConstantesFunciones.resaltarBusquedaPorIdTipoGrupoFormaPago!=null) {
			index= this.jTabbedPaneBusquedasTipoGrupoFormaPago.indexOfComponent(this.jPanelBusquedaPorIdTipoGrupoFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponent(index);
				jPanel.setBorder(this.tipogrupoformapagoConstantesFunciones.resaltarBusquedaPorIdTipoGrupoFormaPago);
			}
		}

		if(this.tipogrupoformapagoConstantesFunciones.resaltarBusquedaPorNombreTipoGrupoFormaPago!=null) {
			index= this.jTabbedPaneBusquedasTipoGrupoFormaPago.indexOfComponent(this.jPanelBusquedaPorNombreTipoGrupoFormaPago);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponent(index);
				jPanel.setBorder(this.tipogrupoformapagoConstantesFunciones.resaltarBusquedaPorNombreTipoGrupoFormaPago);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoGrupoFormaPago() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGrupoFormaPago.indexOfComponent(this.jPanelBusquedaPorIdTipoGrupoFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogrupoformapagoConstantesFunciones.mostrarBusquedaPorIdTipoGrupoFormaPago);
			if(!this.tipogrupoformapagoConstantesFunciones.mostrarBusquedaPorIdTipoGrupoFormaPago && index>-1) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.remove(index);
			}

			index= this.jTabbedPaneBusquedasTipoGrupoFormaPago.indexOfComponent(this.jPanelBusquedaPorNombreTipoGrupoFormaPago);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipogrupoformapagoConstantesFunciones.mostrarBusquedaPorNombreTipoGrupoFormaPago);
			if(!this.tipogrupoformapagoConstantesFunciones.mostrarBusquedaPorNombreTipoGrupoFormaPago && index>-1) {
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoGrupoFormaPago() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoGrupoFormaPago.indexOfComponent(this.jPanelBusquedaPorIdTipoGrupoFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogrupoformapagoConstantesFunciones.activarBusquedaPorIdTipoGrupoFormaPago);
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setEnabledAt(index,this.tipogrupoformapagoConstantesFunciones.activarBusquedaPorIdTipoGrupoFormaPago);
			}

			index= this.jTabbedPaneBusquedasTipoGrupoFormaPago.indexOfComponent(this.jPanelBusquedaPorNombreTipoGrupoFormaPago);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipogrupoformapagoConstantesFunciones.activarBusquedaPorNombreTipoGrupoFormaPago);
				this.jTabbedPaneBusquedasTipoGrupoFormaPago.setEnabledAt(index,this.tipogrupoformapagoConstantesFunciones.activarBusquedaPorNombreTipoGrupoFormaPago);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoGrupoFormaPago(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorId")) {
			index= this.jTabbedPaneBusquedasTipoGrupoFormaPago.indexOfComponent(this.jPanelBusquedaPorIdTipoGrupoFormaPago);

			this.jTabbedPaneBusquedasTipoGrupoFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponent(index);

			this.tipogrupoformapagoConstantesFunciones.setResaltarBusquedaPorIdTipoGrupoFormaPago(resaltar);

			jPanel.setBorder(this.tipogrupoformapagoConstantesFunciones.resaltarBusquedaPorIdTipoGrupoFormaPago);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoGrupoFormaPago.indexOfComponent(this.jPanelBusquedaPorNombreTipoGrupoFormaPago);

			this.jTabbedPaneBusquedasTipoGrupoFormaPago.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoGrupoFormaPago.getComponent(index);

			this.tipogrupoformapagoConstantesFunciones.setResaltarBusquedaPorNombreTipoGrupoFormaPago(resaltar);

			jPanel.setBorder(this.tipogrupoformapagoConstantesFunciones.resaltarBusquedaPorNombreTipoGrupoFormaPago);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoGrupoFormaPago.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoGrupoFormaPago() throws Exception {

		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoGrupoFormaPago();
		this.updateVisibilidadResaltarControlesFormularioTipoGrupoFormaPago();
		this.updateHabilitarResaltarControlesFormularioTipoGrupoFormaPago();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoGrupoFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipogrupoformapagoConstantesFunciones.resaltaridTipoGrupoFormaPago!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.setBorder(this.tipogrupoformapagoConstantesFunciones.resaltaridTipoGrupoFormaPago);}
		if(this.tipogrupoformapagoConstantesFunciones.resaltarnombreTipoGrupoFormaPago!=null && this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextAreanombreTipoGrupoFormaPago.setBorder(this.tipogrupoformapagoConstantesFunciones.resaltarnombreTipoGrupoFormaPago);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoGrupoFormaPago() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
	
		//this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.setVisible(this.tipogrupoformapagoConstantesFunciones.mostraridTipoGrupoFormaPago);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jPanelidTipoGrupoFormaPago.setVisible(this.tipogrupoformapagoConstantesFunciones.mostraridTipoGrupoFormaPago);
		//this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextAreanombreTipoGrupoFormaPago.setVisible(this.tipogrupoformapagoConstantesFunciones.mostrarnombreTipoGrupoFormaPago);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jPanelnombreTipoGrupoFormaPago.setVisible(this.tipogrupoformapagoConstantesFunciones.mostrarnombreTipoGrupoFormaPago);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoGrupoFormaPago() throws Exception {
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoGrupoFormaPago!=null) {
	
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextFieldidTipoGrupoFormaPago.setEnabled(this.tipogrupoformapagoConstantesFunciones.activaridTipoGrupoFormaPago);
		this.jInternalFrameDetalleFormTipoGrupoFormaPago.jTextAreanombreTipoGrupoFormaPago.setEnabled(this.tipogrupoformapagoConstantesFunciones.activarnombreTipoGrupoFormaPago);
		}
	}
	
		
}