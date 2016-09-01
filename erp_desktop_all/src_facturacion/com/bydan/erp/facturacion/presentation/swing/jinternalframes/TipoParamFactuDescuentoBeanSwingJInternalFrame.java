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

import com.bydan.erp.facturacion.util.TipoParamFactuDescuentoConstantesFunciones;
import com.bydan.erp.facturacion.util.TipoParamFactuDescuentoParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TipoParamFactuDescuentoParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TipoParamFactuDescuentoBean;
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


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
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




@SuppressWarnings("unused")
public class TipoParamFactuDescuentoBeanSwingJInternalFrame extends TipoParamFactuDescuentoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoParamFactuDescuentoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoParamFactuDescuento> tipoparamfactudescuentoValidator = new ClassValidator<TipoParamFactuDescuento>(TipoParamFactuDescuento.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoParamFactuDescuento tipoparamfactudescuento;	
	public TipoParamFactuDescuento tipoparamfactudescuentoAux;
	public TipoParamFactuDescuento tipoparamfactudescuentoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoParamFactuDescuento tipoparamfactudescuentoTotales;
	public Long idTipoParamFactuDescuentoActual;
	public Long iIdNuevoTipoParamFactuDescuento=0L;
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
	
	public Boolean isPermisoTodoTipoParamFactuDescuento;
	public Boolean isPermisoNuevoTipoParamFactuDescuento;
	public Boolean isPermisoActualizarTipoParamFactuDescuento;
	public Boolean isPermisoActualizarOriginalTipoParamFactuDescuento;
	public Boolean isPermisoEliminarTipoParamFactuDescuento;
	public Boolean isPermisoGuardarCambiosTipoParamFactuDescuento;
	public Boolean isPermisoConsultaTipoParamFactuDescuento;
	public Boolean isPermisoBusquedaTipoParamFactuDescuento;
	public Boolean isPermisoReporteTipoParamFactuDescuento;
	public Boolean isPermisoPaginacionMedioTipoParamFactuDescuento;
	public Boolean isPermisoPaginacionAltoTipoParamFactuDescuento;
	public Boolean isPermisoPaginacionTodoTipoParamFactuDescuento;
	public Boolean isPermisoCopiarTipoParamFactuDescuento;
	public Boolean isPermisoVerFormTipoParamFactuDescuento;
	public Boolean isPermisoDuplicarTipoParamFactuDescuento;
	public Boolean isPermisoOrdenTipoParamFactuDescuento;
	
	
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
	
	public TipoParamFactuDescuentoParameterReturnGeneral tipoparamfactudescuentoReturnGeneral;
	public TipoParamFactuDescuentoParameterReturnGeneral tipoparamfactudescuentoParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoParamFactuDescuento=false;
	public Boolean esParaAccionDesdeFormularioTipoParamFactuDescuento=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TipoParamFactuDescuentoSessionBeanAdditional tipoparamfactudescuentoSessionBeanAdditional=null;
	
	public TipoParamFactuDescuentoSessionBeanAdditional getTipoParamFactuDescuentoSessionBeanAdditional() {
		return this.tipoparamfactudescuentoSessionBeanAdditional;
	}
	
	public void setTipoParamFactuDescuentoSessionBeanAdditional(TipoParamFactuDescuentoSessionBeanAdditional tipoparamfactudescuentoSessionBeanAdditional) {
		try {
			this.tipoparamfactudescuentoSessionBeanAdditional=tipoparamfactudescuentoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional tipoparamfactudescuentoBeanSwingJInternalFrameAdditional=null;
	//public class TipoParamFactuDescuentoBeanSwingJInternalFrame
	
	public TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional getTipoParamFactuDescuentoBeanSwingJInternalFrameAdditional() {
		return this.tipoparamfactudescuentoBeanSwingJInternalFrameAdditional;
	}
	
	public void setTipoParamFactuDescuentoBeanSwingJInternalFrameAdditional(TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional tipoparamfactudescuentoBeanSwingJInternalFrameAdditional) {
		try {
			this.tipoparamfactudescuentoBeanSwingJInternalFrameAdditional=tipoparamfactudescuentoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoParamFactuDescuentoLogic tipoparamfactudescuentoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoParamFactuDescuento tipoparamfactudescuentoBean;
	public TipoParamFactuDescuentoConstantesFunciones tipoparamfactudescuentoConstantesFunciones;
	//public TipoParamFactuDescuentoParameterReturnGeneral tipoparamfactudescuentoReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoParamFactuDescuento> tipoparamfactudescuentos;	
	//public List<TipoParamFactuDescuento> tipoparamfactudescuentosEliminados;
	//public List<TipoParamFactuDescuento> tipoparamfactudescuentosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoParamFactuDescuento=false;
	public Boolean isVisibilidadCeldaDuplicarTipoParamFactuDescuento=true;
	public Boolean isVisibilidadCeldaCopiarTipoParamFactuDescuento=true;
	public Boolean isVisibilidadCeldaVerFormTipoParamFactuDescuento=true;
	public Boolean isVisibilidadCeldaOrdenTipoParamFactuDescuento=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;
	public Boolean isVisibilidadCeldaModificarTipoParamFactuDescuento=false;
	public Boolean isVisibilidadCeldaActualizarTipoParamFactuDescuento=false;
	public Boolean isVisibilidadCeldaEliminarTipoParamFactuDescuento=false;
	public Boolean isVisibilidadCeldaCancelarTipoParamFactuDescuento=false;
	public Boolean isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=false;	
	
	
	public Boolean isVisibilidadBusquedaPorNombre=false;
	
	public Long getiIdNuevoTipoParamFactuDescuento() {
		return this.iIdNuevoTipoParamFactuDescuento;
	}

	public void setiIdNuevoTipoParamFactuDescuento(Long iIdNuevoTipoParamFactuDescuento) {
		this.iIdNuevoTipoParamFactuDescuento = iIdNuevoTipoParamFactuDescuento;
	}
	
	public Long getidTipoParamFactuDescuentoActual() {
		return this.idTipoParamFactuDescuentoActual;
	}

	public void setidTipoParamFactuDescuentoActual(Long idTipoParamFactuDescuentoActual) {
		this.idTipoParamFactuDescuentoActual = idTipoParamFactuDescuentoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoParamFactuDescuento gettipoparamfactudescuento() {
		return this.tipoparamfactudescuento;
	}

	public void settipoparamfactudescuento(TipoParamFactuDescuento tipoparamfactudescuento) {
		this.tipoparamfactudescuento = tipoparamfactudescuento;
	}
	
	public TipoParamFactuDescuento gettipoparamfactudescuentoAux() {
		return this.tipoparamfactudescuentoAux;
	}

	public void settipoparamfactudescuentoAux(TipoParamFactuDescuento tipoparamfactudescuentoAux) {
		this.tipoparamfactudescuentoAux = tipoparamfactudescuentoAux;
	}				
	
	public TipoParamFactuDescuento gettipoparamfactudescuentoAnterior() {
		return this.tipoparamfactudescuentoAnterior;
	}

	public void settipoparamfactudescuentoAnterior(TipoParamFactuDescuento tipoparamfactudescuentoAnterior) {
		this.tipoparamfactudescuentoAnterior = tipoparamfactudescuentoAnterior;
	}	
	
	public TipoParamFactuDescuento gettipoparamfactudescuentoTotales() {
		return this.tipoparamfactudescuentoTotales;
	}

	public void settipoparamfactudescuentoTotales(TipoParamFactuDescuento tipoparamfactudescuentoTotales) {
		this.tipoparamfactudescuentoTotales = tipoparamfactudescuentoTotales;
	}	
	
	public TipoParamFactuDescuento gettipoparamfactudescuentoBean() {
		return this.tipoparamfactudescuentoBean;
	}

	public void settipoparamfactudescuentoBean(TipoParamFactuDescuento tipoparamfactudescuentoBean) {
		this.tipoparamfactudescuentoBean = tipoparamfactudescuentoBean;
	}	
	
	public TipoParamFactuDescuentoParameterReturnGeneral gettipoparamfactudescuentoReturnGeneral() {
		return this.tipoparamfactudescuentoReturnGeneral;
	}

	public void settipoparamfactudescuentoReturnGeneral(TipoParamFactuDescuentoParameterReturnGeneral tipoparamfactudescuentoReturnGeneral) {
		this.tipoparamfactudescuentoReturnGeneral = tipoparamfactudescuentoReturnGeneral;
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
	
	
	public TipoParamFactuDescuentoLogic getTipoParamFactuDescuentoLogic()	{		
		return tipoparamfactudescuentoLogic;
	}

	public void setTipoParamFactuDescuentoLogic(TipoParamFactuDescuentoLogic tipoparamfactudescuentoLogic) {
		this.tipoparamfactudescuentoLogic = tipoparamfactudescuentoLogic;
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
	
	public Boolean getIsEsNuevoTipoParamFactuDescuento() {
		return isEsNuevoTipoParamFactuDescuento;
	}

	public void setIsEsNuevoTipoParamFactuDescuento(Boolean isEsNuevoTipoParamFactuDescuento) {
		this.isEsNuevoTipoParamFactuDescuento = isEsNuevoTipoParamFactuDescuento;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoParamFactuDescuento() {
		return esParaAccionDesdeFormularioTipoParamFactuDescuento;
	}
	
	public void setEsParaAccionDesdeFormularioTipoParamFactuDescuento(Boolean esParaAccionDesdeFormularioTipoParamFactuDescuento) {
		this.esParaAccionDesdeFormularioTipoParamFactuDescuento = esParaAccionDesdeFormularioTipoParamFactuDescuento;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoParamFactuDescuento() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoParamFactuDescuentoConstantesFunciones.refrescarForeignKeysDescripcionesTipoParamFactuDescuento(this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoParamFactuDescuentoConstantesFunciones.refrescarForeignKeysDescripcionesTipoParamFactuDescuento(this.tipoparamfactudescuentos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipoparamfactudescuentoLogic.setTipoParamFactuDescuentos(this.tipoparamfactudescuentos);
			tipoparamfactudescuentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoParamFactuDescuentoParameterReturnGeneral getTipoParamFactuDescuentoParameterGeneral() {
		return this.tipoparamfactudescuentoParameterGeneral;
	}
	
	public void setTipoParamFactuDescuentoParameterGeneral(TipoParamFactuDescuentoParameterReturnGeneral tipoparamfactudescuentoParameterGeneral) {
		this.tipoparamfactudescuentoParameterGeneral = tipoparamfactudescuentoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoParamFactuDescuento() {
		return isPermisoTodoTipoParamFactuDescuento;
	}

	public void setIsPermisoTodoTipoParamFactuDescuento(Boolean isPermisoTodoTipoParamFactuDescuento) {
		this.isPermisoTodoTipoParamFactuDescuento = isPermisoTodoTipoParamFactuDescuento;
	}

	public Boolean getIsPermisoNuevoTipoParamFactuDescuento() {
		return isPermisoNuevoTipoParamFactuDescuento;
	}

	public void setIsPermisoNuevoTipoParamFactuDescuento(Boolean isPermisoNuevoTipoParamFactuDescuento) {
		this.isPermisoNuevoTipoParamFactuDescuento = isPermisoNuevoTipoParamFactuDescuento;
	}

	public Boolean getIsPermisoActualizarTipoParamFactuDescuento() {
		return isPermisoActualizarTipoParamFactuDescuento;
	}

	public void setIsPermisoActualizarTipoParamFactuDescuento(Boolean isPermisoActualizarTipoParamFactuDescuento) {
		this.isPermisoActualizarTipoParamFactuDescuento = isPermisoActualizarTipoParamFactuDescuento;
	}

	public Boolean getIsPermisoEliminarTipoParamFactuDescuento() {
		return isPermisoEliminarTipoParamFactuDescuento;
	}

	public void setIsPermisoEliminarTipoParamFactuDescuento(Boolean isPermisoEliminarTipoParamFactuDescuento) {
		this.isPermisoEliminarTipoParamFactuDescuento = isPermisoEliminarTipoParamFactuDescuento;
	}

	public Boolean getIsPermisoGuardarCambiosTipoParamFactuDescuento() {
		return isPermisoGuardarCambiosTipoParamFactuDescuento;
	}

	public void setIsPermisoGuardarCambiosTipoParamFactuDescuento(Boolean isPermisoGuardarCambiosTipoParamFactuDescuento) {
		this.isPermisoGuardarCambiosTipoParamFactuDescuento = isPermisoGuardarCambiosTipoParamFactuDescuento;
	}
	
	public Boolean getIsPermisoConsultaTipoParamFactuDescuento() {
		return isPermisoConsultaTipoParamFactuDescuento;
	}

	public void setIsPermisoConsultaTipoParamFactuDescuento(Boolean isPermisoConsultaTipoParamFactuDescuento) {
		this.isPermisoConsultaTipoParamFactuDescuento = isPermisoConsultaTipoParamFactuDescuento;
	}

	public Boolean getIsPermisoBusquedaTipoParamFactuDescuento() {
		return isPermisoBusquedaTipoParamFactuDescuento;
	}

	public void setIsPermisoBusquedaTipoParamFactuDescuento(Boolean isPermisoBusquedaTipoParamFactuDescuento) {
		this.isPermisoBusquedaTipoParamFactuDescuento = isPermisoBusquedaTipoParamFactuDescuento;
	}

	public Boolean getIsPermisoReporteTipoParamFactuDescuento() {
		return isPermisoReporteTipoParamFactuDescuento;
	}

	public void setIsPermisoReporteTipoParamFactuDescuento(Boolean isPermisoReporteTipoParamFactuDescuento) {
		this.isPermisoReporteTipoParamFactuDescuento = isPermisoReporteTipoParamFactuDescuento;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoParamFactuDescuento() {
		return isPermisoPaginacionMedioTipoParamFactuDescuento;
	}

	public void setIsPermisoPaginacionMedioTipoParamFactuDescuento(Boolean isPermisoPaginacionMedioTipoParamFactuDescuento) {
		this.isPermisoPaginacionMedioTipoParamFactuDescuento = isPermisoPaginacionMedioTipoParamFactuDescuento;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoParamFactuDescuento() {
		return isPermisoPaginacionTodoTipoParamFactuDescuento;
	}

	public void setIsPermisoPaginacionTodoTipoParamFactuDescuento(Boolean isPermisoPaginacionTodoTipoParamFactuDescuento) {
		this.isPermisoPaginacionTodoTipoParamFactuDescuento = isPermisoPaginacionTodoTipoParamFactuDescuento;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoParamFactuDescuento() {
		return isPermisoPaginacionAltoTipoParamFactuDescuento;
	}

	public void setIsPermisoPaginacionAltoTipoParamFactuDescuento(Boolean isPermisoPaginacionAltoTipoParamFactuDescuento) {
		this.isPermisoPaginacionAltoTipoParamFactuDescuento = isPermisoPaginacionAltoTipoParamFactuDescuento;
	}
	
	public Boolean getIsPermisoCopiarTipoParamFactuDescuento() {
		return isPermisoCopiarTipoParamFactuDescuento;
	}

	public void setIsPermisoCopiarTipoParamFactuDescuento(Boolean isPermisoCopiarTipoParamFactuDescuento) {
		this.isPermisoCopiarTipoParamFactuDescuento = isPermisoCopiarTipoParamFactuDescuento;
	}
	
	public Boolean getIsPermisoVerFormTipoParamFactuDescuento() {
		return isPermisoVerFormTipoParamFactuDescuento;
	}

	public void setIsPermisoVerFormTipoParamFactuDescuento(Boolean isPermisoVerFormTipoParamFactuDescuento) {
		this.isPermisoVerFormTipoParamFactuDescuento = isPermisoVerFormTipoParamFactuDescuento;
	}
	
	public Boolean getIsPermisoDuplicarTipoParamFactuDescuento() {
		return isPermisoDuplicarTipoParamFactuDescuento;
	}

	public void setIsPermisoDuplicarTipoParamFactuDescuento(Boolean isPermisoDuplicarTipoParamFactuDescuento) {
		this.isPermisoDuplicarTipoParamFactuDescuento = isPermisoDuplicarTipoParamFactuDescuento;
	}
	
	public Boolean getIsPermisoOrdenTipoParamFactuDescuento() {
		return isPermisoOrdenTipoParamFactuDescuento;
	}

	public void setIsPermisoOrdenTipoParamFactuDescuento(Boolean isPermisoOrdenTipoParamFactuDescuento) {
		this.isPermisoOrdenTipoParamFactuDescuento = isPermisoOrdenTipoParamFactuDescuento;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoParamFactuDescuento() {
		return isVisibilidadCeldaNuevoTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaNuevoTipoParamFactuDescuento(Boolean isVisibilidadCeldaNuevoTipoParamFactuDescuento) {
		this.isVisibilidadCeldaNuevoTipoParamFactuDescuento = isVisibilidadCeldaNuevoTipoParamFactuDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoParamFactuDescuento() {
		return isVisibilidadCeldaDuplicarTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaDuplicarTipoParamFactuDescuento(Boolean isVisibilidadCeldaDuplicarTipoParamFactuDescuento) {
		this.isVisibilidadCeldaDuplicarTipoParamFactuDescuento = isVisibilidadCeldaDuplicarTipoParamFactuDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoParamFactuDescuento() {
		return isVisibilidadCeldaCopiarTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaCopiarTipoParamFactuDescuento(Boolean isVisibilidadCeldaCopiarTipoParamFactuDescuento) {
		this.isVisibilidadCeldaCopiarTipoParamFactuDescuento = isVisibilidadCeldaCopiarTipoParamFactuDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoParamFactuDescuento() {
		return isVisibilidadCeldaVerFormTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaVerFormTipoParamFactuDescuento(Boolean isVisibilidadCeldaVerFormTipoParamFactuDescuento) {
		this.isVisibilidadCeldaVerFormTipoParamFactuDescuento = isVisibilidadCeldaVerFormTipoParamFactuDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoParamFactuDescuento() {
		return isVisibilidadCeldaOrdenTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaOrdenTipoParamFactuDescuento(Boolean isVisibilidadCeldaOrdenTipoParamFactuDescuento) {
		this.isVisibilidadCeldaOrdenTipoParamFactuDescuento = isVisibilidadCeldaOrdenTipoParamFactuDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento() {
		return isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento(Boolean isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento) {
		this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento = isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoParamFactuDescuento() {
		return isVisibilidadCeldaModificarTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaModificarTipoParamFactuDescuento(Boolean isVisibilidadCeldaModificarTipoParamFactuDescuento) {
		this.isVisibilidadCeldaModificarTipoParamFactuDescuento = isVisibilidadCeldaModificarTipoParamFactuDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoParamFactuDescuento() {
		return isVisibilidadCeldaActualizarTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaActualizarTipoParamFactuDescuento(Boolean isVisibilidadCeldaActualizarTipoParamFactuDescuento) {
		this.isVisibilidadCeldaActualizarTipoParamFactuDescuento = isVisibilidadCeldaActualizarTipoParamFactuDescuento;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoParamFactuDescuento() {
		return isVisibilidadCeldaEliminarTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaEliminarTipoParamFactuDescuento(Boolean isVisibilidadCeldaEliminarTipoParamFactuDescuento) {
		this.isVisibilidadCeldaEliminarTipoParamFactuDescuento = isVisibilidadCeldaEliminarTipoParamFactuDescuento;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoParamFactuDescuento() {
		return isVisibilidadCeldaCancelarTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaCancelarTipoParamFactuDescuento(Boolean isVisibilidadCeldaCancelarTipoParamFactuDescuento) {
		this.isVisibilidadCeldaCancelarTipoParamFactuDescuento = isVisibilidadCeldaCancelarTipoParamFactuDescuento;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoParamFactuDescuento() {
		return isVisibilidadCeldaGuardarTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaGuardarTipoParamFactuDescuento(Boolean isVisibilidadCeldaGuardarTipoParamFactuDescuento) {
		this.isVisibilidadCeldaGuardarTipoParamFactuDescuento = isVisibilidadCeldaGuardarTipoParamFactuDescuento;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento() {
		return isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento(Boolean isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento) {
		this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento = isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento;
	}
		
	public TipoParamFactuDescuentoSessionBean gettipoparamfactudescuentoSessionBean() {
		return this.tipoparamfactudescuentoSessionBean;
	}
	
	public void settipoparamfactudescuentoSessionBean(TipoParamFactuDescuentoSessionBean tipoparamfactudescuentoSessionBean) {
		this.tipoparamfactudescuentoSessionBean=tipoparamfactudescuentoSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoParamFactuDescuento tipoparamfactudescuento,TipoParamFactuDescuento tipoparamfactudescuentoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoParamFactuDescuento(tipoparamfactudescuento);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipoparamfactudescuentoAux.setId(tipoparamfactudescuento.getId());
		tipoparamfactudescuentoAux.setVersionRow(tipoparamfactudescuento.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoParamFactuDescuento();
		
			int intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(this.tipoparamfactudescuento,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipoparamfactudescuentoValidator.getInvalidValues(this.tipoparamfactudescuento);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipoparamfactudescuentoLogic.setDatosCliente(datosCliente);
			tipoparamfactudescuentoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipoparamfactudescuentoAux=new  TipoParamFactuDescuento();
				
				tipoparamfactudescuentoAux.setIsNew(true);
				tipoparamfactudescuentoAux.setIsChanged(true);
				
				tipoparamfactudescuentoAux.setTipoParamFactuDescuentoOriginal(this.tipoparamfactudescuento);
				
				tipoparamfactudescuentoAux.setId(this.tipoparamfactudescuento.getId());	
				tipoparamfactudescuentoAux.setVersionRow(this.tipoparamfactudescuento.getVersionRow());	
				tipoparamfactudescuentoAux.setnombre(this.tipoparamfactudescuento.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactudescuentoLogic.saveTipoParamFactuDescuentos();//WithConnection
						//tipoparamfactudescuentoLogic.getSetVersionRowTipoParamFactuDescuentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparamfactudescuento,tipoparamfactudescuentoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactudescuentoLogic.saveTipoParamFactuDescuentoRelaciones(tipoparamfactudescuentoAux);//WithConnection
								//tipoparamfactudescuentoLogic.getSetVersionRowTipoParamFactuDescuentos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparamfactudescuento,tipoparamfactudescuentoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparamfactudescuento,tipoparamfactudescuentoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipoparamfactudescuentoAux=new  TipoParamFactuDescuento();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado() 
					|| (this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado() && this.tipoparamfactudescuento.getId()>=0)) {
						
					tipoparamfactudescuentoAux.setIsNew(false);
				}
				
				tipoparamfactudescuentoAux.setIsDeleted(false);
			
				tipoparamfactudescuentoAux.setId(this.tipoparamfactudescuento.getId());	
				tipoparamfactudescuentoAux.setVersionRow(this.tipoparamfactudescuento.getVersionRow());	
				tipoparamfactudescuentoAux.setnombre(this.tipoparamfactudescuento.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactudescuentoLogic.saveTipoParamFactuDescuentos();//WithConnection
						//tipoparamfactudescuentoLogic.getSetVersionRowTipoParamFactuDescuentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipoparamfactudescuento,tipoparamfactudescuentoAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactudescuentoLogic.saveTipoParamFactuDescuentoRelaciones(tipoparamfactudescuentoAux);//WithConnection
								//tipoparamfactudescuentoLogic.getSetVersionRowTipoParamFactuDescuentos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.tipoparamfactudescuento,tipoparamfactudescuentoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.tipoparamfactudescuento,tipoparamfactudescuentoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipoparamfactudescuentoAux=new  TipoParamFactuDescuento();
				
				tipoparamfactudescuentoAux.setIsNew(false);
				tipoparamfactudescuentoAux.setIsChanged(false);
				
				tipoparamfactudescuentoAux.setIsDeleted(true);
				
				tipoparamfactudescuentoAux.setId(this.tipoparamfactudescuento.getId());	
				tipoparamfactudescuentoAux.setVersionRow(this.tipoparamfactudescuento.getVersionRow());	
				tipoparamfactudescuentoAux.setnombre(this.tipoparamfactudescuento.getnombre());	
				
				if(this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipoparamfactudescuentoAux.getId()>=0) {	
						this.tipoparamfactudescuentosEliminados.add(tipoparamfactudescuentoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactudescuentoLogic.saveTipoParamFactuDescuentos();//WithConnection
						//tipoparamfactudescuentoLogic.getSetVersionRowTipoParamFactuDescuentos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								tipoparamfactudescuentoLogic.saveTipoParamFactuDescuentoRelaciones(tipoparamfactudescuentoAux);//WithConnection
								//tipoparamfactudescuentoLogic.getSetVersionRowTipoParamFactuDescuentos();//WithConnection
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
							if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipoparamfactudescuentoAux,tipoparamfactudescuentos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().addAll(this.tipoparamfactudescuentosEliminados);
					
					tipoparamfactudescuentoLogic.saveTipoParamFactuDescuentos();//WithConnection
					//tipoparamfactudescuentoLogic.getSetVersionRowTipoParamFactuDescuentos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipoparamfactudescuentosEliminados= new ArrayList<TipoParamFactuDescuento>();		
			}
			
			if(this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Descuento GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipoparamfactudescuento=tipoparamfactudescuentoAux;
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
      		//this.finishProcessTipoParamFactuDescuento();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoParamFactuDescuento tipoparamfactudescuentoLocal) throws Exception {
		
		if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoParamFactuDescuento tipoparamfactudescuentoLocal) throws Exception {	
		if(this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoParamFactuDescuentoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipoparamfactudescuentoValidator.getInvalidValues(this.tipoparamfactudescuento);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoParamFactuDescuento tipoparamfactudescuento,List<TipoParamFactuDescuento> tipoparamfactudescuentos) throws Exception {
		try	{		
			TipoParamFactuDescuentoConstantesFunciones.actualizarLista(tipoparamfactudescuento,tipoparamfactudescuentos,this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoParamFactuDescuento tipoparamfactudescuento,List<TipoParamFactuDescuento> tipoparamfactudescuentos) throws Exception {
		try	{			
			TipoParamFactuDescuentoConstantesFunciones.actualizarSelectedLista(tipoparamfactudescuento,tipoparamfactudescuentos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoParamFactuDescuento> tipoparamfactudescuentosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipoparamfactudescuentosLocal=this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipoparamfactudescuentosLocal=this.tipoparamfactudescuentos;
			}
			//ARCHITECTURE
		
			for(TipoParamFactuDescuento tipoparamfactudescuentoLocal:tipoparamfactudescuentosLocal) {
				if(this.permiteMantenimiento(tipoparamfactudescuentoLocal) && tipoparamfactudescuentoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoParamFactuDescuentoConstantesFunciones.getTipoParamFactuDescuentoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoParamFactuDescuentoConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuDescuento.jLabelnombreTipoParamFactuDescuento,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoParamFactuDescuento.jLabelnombreTipoParamFactuDescuento,"");
		
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
		this.iIdNuevoTipoParamFactuDescuento--;	
		
		
		this.tipoparamfactudescuentoAux=new TipoParamFactuDescuento();
		
		this.tipoparamfactudescuentoAux.setId(this.iIdNuevoTipoParamFactuDescuento);
		this.tipoparamfactudescuentoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().add(this.tipoparamfactudescuentoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipoparamfactudescuentos.add(this.tipoparamfactudescuentoAux);
		}
		//ARCHITECTURE
		
		this.tipoparamfactudescuento=this.tipoparamfactudescuentoAux;
		
		if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoParamFactuDescuento(this.tipoparamfactudescuento);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuDescuento(this.tipoparamfactudescuento);
		}
				
		//this.setDefaultControlesTipoParamFactuDescuento();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoParamFactuDescuento();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoParamFactuDescuento();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuDescuento();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParamFactuDescuento(this.tipoparamfactudescuentoBean,this.tipoparamfactudescuento,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
			classes=TipoParamFactuDescuentoConstantesFunciones.getClassesRelationshipsOfTipoParamFactuDescuento(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipoparamfactudescuentoReturnGeneral=tipoparamfactudescuentoLogic.procesarEventosTipoParamFactuDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos(),this.tipoparamfactudescuento,this.tipoparamfactudescuentoParameterGeneral,this.isEsNuevoTipoParamFactuDescuento,classes);//this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuento()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoParamFactuDescuento(this.tipoparamfactudescuentoReturnGeneral,this.tipoparamfactudescuentoBean,false);
		
		if(this.tipoparamfactudescuentoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuDescuento(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoParamFactuDescuento(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento());
		}
		
		if(this.tipoparamfactudescuentoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuDescuento(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento(),classes);//this.tipoparamfactudescuentoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(this.tipoparamfactudescuento,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoParamFactuDescuento();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoParamFactuDescuento();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.RecargarFormTipoParamFactuDescuento(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoParamFactuDescuento(false);
						
			if(tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuDescuento();
			}
			
			this.actualizarVisualTableDatosTipoParamFactuDescuento();
			
			this.jTableDatosTipoParamFactuDescuento.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuDescuento(), this.getIndiceNuevoTipoParamFactuDescuento());
			
			this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
						
			this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoParamFactuDescuento(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextAreanombreTipoParamFactuDescuento.setEnabled(isHabilitar && this.tipoparamfactudescuentoConstantesFunciones.activarnombreTipoParamFactuDescuento);	
		
	};
	
	public void setDefaultControlesTipoParamFactuDescuento() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoParamFactuDescuento(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipoparamfactudescuentoSessionBean.setConGuardarRelaciones(true);			
			this.tipoparamfactudescuentoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTabbedPaneRelacionesTipoParamFactuDescuento.setVisible(true);
			
					
		} else {
			//this.tipoparamfactudescuentoSessionBean.setConGuardarRelaciones(false);			
			this.tipoparamfactudescuentoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTabbedPaneRelacionesTipoParamFactuDescuento.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTipoParamFactuDescuento() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
				if(tipoparamfactudescuentoAux.getId().equals(this.iIdNuevoTipoParamFactuDescuento)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentos) {
				if(tipoparamfactudescuentoAux.getId().equals(this.iIdNuevoTipoParamFactuDescuento)) {
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
	
	public int getIndiceActualTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
				if(tipoparamfactudescuentoAux.getId().equals(tipoparamfactudescuento.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentos) {
				if(tipoparamfactudescuentoAux.getId().equals(tipoparamfactudescuento.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuentoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
				if(tipoparamfactudescuentoAux.getTipoParamFactuDescuentoOriginal().getId().equals(tipoparamfactudescuentoOriginal.getId())) {
					existe=true;
					tipoparamfactudescuentoOriginal.setId(tipoparamfactudescuentoAux.getId());
					tipoparamfactudescuentoOriginal.setVersionRow(tipoparamfactudescuentoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentos) {
				if(tipoparamfactudescuentoAux.getTipoParamFactuDescuentoOriginal().getId().equals(tipoparamfactudescuentoOriginal.getId())) {
					existe=true;
					tipoparamfactudescuentoOriginal.setId(tipoparamfactudescuentoAux.getId());
					tipoparamfactudescuentoOriginal.setVersionRow(tipoparamfactudescuentoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoParamFactuDescuento(Boolean esParaCancelar) throws Exception {
		tipoparamfactudescuentosAux=new ArrayList<TipoParamFactuDescuento>();
		tipoparamfactudescuentoAux=new TipoParamFactuDescuento();
		
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
					if(tipoparamfactudescuentoAux.getId()<0) {
						tipoparamfactudescuentosAux.add(tipoparamfactudescuentoAux);
					}		
				}
				this.iIdNuevoTipoParamFactuDescuento=0L;
				this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().removeAll(tipoparamfactudescuentosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentos) {
					if(tipoparamfactudescuentoAux.getId()<0) {
						tipoparamfactudescuentosAux.add(tipoparamfactudescuentoAux);
					}		
				}
				this.iIdNuevoTipoParamFactuDescuento=0L;
				this.tipoparamfactudescuentos.removeAll(tipoparamfactudescuentosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoParamFactuDescuento 
					&& this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size()>0
					) {
					tipoparamfactudescuentoAux=this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().get(this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size() - 1);
				
					if(tipoparamfactudescuentoAux.getId()<0) {
						this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().remove(tipoparamfactudescuentoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoParamFactuDescuento && this.tipoparamfactudescuentos.size()>0) {
					tipoparamfactudescuentoAux=this.tipoparamfactudescuentos.get(this.tipoparamfactudescuentos.size() - 1);
				
					if(tipoparamfactudescuentoAux.getId()<0) {
						this.tipoparamfactudescuentos.remove(tipoparamfactudescuentoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoParamFactuDescuento(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipoparamfactudescuento.getId()<0) {
				this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().remove(this.tipoparamfactudescuento);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipoparamfactudescuento.getId()<0) {
				this.tipoparamfactudescuentos.remove(this.tipoparamfactudescuento);
			}
		}			
	}
	
	public void setEstadosInicialesTipoParamFactuDescuento(List<TipoParamFactuDescuento> tipoparamfactudescuentosAux) throws Exception {
		TipoParamFactuDescuentoConstantesFunciones.setEstadosInicialesTipoParamFactuDescuento(tipoparamfactudescuentosAux);
	}
	
	public void setEstadosInicialesTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuentoAux) throws Exception {
		TipoParamFactuDescuentoConstantesFunciones.setEstadosInicialesTipoParamFactuDescuento(tipoparamfactudescuentoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoParamFactuDescuentoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoParamFactuDescuentoActual()) {
				if(!this.isEsNuevoTipoParamFactuDescuento) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoParamFactuDescuento=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoParamFactuDescuentoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Descuento ?", "MANTENIMIENTO DE Tipo Descuento", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoParamFactuDescuento tipoparamfactudescuento) throws Exception {
		TipoParamFactuDescuentoConstantesFunciones.seleccionarAsignar(this.tipoparamfactudescuento,tipoparamfactudescuento);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoParamFactuDescuento=this.isPermisoActualizarOriginalTipoParamFactuDescuento;
			
			
			this.seleccionarAsignar(tipoparamfactudescuento);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoParamFactuDescuentoConstantesFunciones.quitarEspaciosTipoParamFactuDescuento(this.tipoparamfactudescuento,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipoparamfactudescuentoSessionBean.setsFuncionBusquedaRapida(this.tipoparamfactudescuentoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoParamFactuDescuento) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoParamFactuDescuento(esParaCancelar);				
				this.cancelarNuevoTipoParamFactuDescuento(esParaCancelar);								
			}
			
			this.tipoparamfactudescuento=new TipoParamFactuDescuento();
			
			this.inicializarTipoParamFactuDescuento();
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoParamFactuDescuento() throws Exception {
		try {
			TipoParamFactuDescuentoConstantesFunciones.inicializarTipoParamFactuDescuento(this.tipoparamfactudescuento);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoParamFactuDescuentos(String sAccionBusqueda,List<TipoParamFactuDescuento> tipoparamfactudescuentosParaReportes) throws Exception {
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
					sPathReporteFinal="TipoParamFactuDescuento"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoParamFactuDescuentoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoParamFactuDescuentoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoParamFactuDescuento"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Descuentos");		
		parameters.put("busquedapor", TipoParamFactuDescuentoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoParamFactuDescuento=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoParamFactuDescuentoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoParamFactuDescuentoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoParamFactuDescuento=new JRBeanArrayDataSource(TipoParamFactuDescuentoJInternalFrame.TraerTipoParamFactuDescuentoBeans(tipoparamfactudescuentosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoParamFactuDescuento);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoParamFactuDescuentoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoParamFactuDescuentoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoParamFactuDescuentoBean.TraerTipoParamFactuDescuentoBeans(tipoparamfactudescuentosParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoParamFactuDescuentos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactudescuentosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoParamFactuDescuentos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactudescuentosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuentoActionPerformed(null);
					//this.generarExcelReporteTipoParamFactuDescuentos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactudescuentosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoParamFactuDescuentos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactudescuentosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoParamFactuDescuentos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactudescuentosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoParamFactuDescuentos(sAccionBusqueda,sTipoArchivoReporte,tipoparamfactudescuentosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoParamFactuDescuentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuDescuento> tipoparamfactudescuentosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactudescuento";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuDescuentos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParamFactuDescuento("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoParamFactuDescuento tipoparamfactudescuento : tipoparamfactudescuentosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoParamFactuDescuentoConstantesFunciones.generarExcelReporteDataTipoParamFactuDescuento("NORMAL",row,workbook,tipoparamfactudescuento,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoParamFactuDescuento(String sTipo,Row row,Workbook workbook) {
		
		TipoParamFactuDescuentoConstantesFunciones.generarExcelReporteHeaderTipoParamFactuDescuento(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoParamFactuDescuentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuDescuento> tipoparamfactudescuentosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactudescuento_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuDescuentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoParamFactuDescuento tipoparamfactudescuento : tipoparamfactudescuentosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoParamFactuDescuentoConstantesFunciones.getTipoParamFactuDescuentoDescripcion(tipoparamfactudescuento));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipoparamfactudescuento.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoParamFactuDescuentos(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoParamFactuDescuento> tipoparamfactudescuentosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoParamFactuDescuento> tipoparamfactudescuentosRespaldo=null;
		
		classes=TipoParamFactuDescuentoConstantesFunciones.getClassesRelationshipsOfTipoParamFactuDescuento(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipoparamfactudescuentoLogic.setDatosCliente(this.datosCliente);
		this.tipoparamfactudescuentoLogic.setDatosDeep(this.datosDeep);
		this.tipoparamfactudescuentoLogic.setIsConDeep(true);
		
		tipoparamfactudescuentosRespaldo=this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos();
		
		this.tipoparamfactudescuentoLogic.setTipoParamFactuDescuentos(tipoparamfactudescuentosParaReportes);	
		this.tipoparamfactudescuentoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipoparamfactudescuentosParaReportes=this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos();
		this.tipoparamfactudescuentoLogic.setTipoParamFactuDescuentos(tipoparamfactudescuentosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactudescuento_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoParamFactuDescuentos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoParamFactuDescuento("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoParamFactuDescuento tipoparamfactudescuento : tipoparamfactudescuentosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoParamFactuDescuento("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoParamFactuDescuentoConstantesFunciones.generarExcelReporteDataTipoParamFactuDescuento("NORMAL",row,workbook,tipoparamfactudescuento,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TipoParamFactuDescuentoConstantesFunciones.getTipoParamFactuDescuentoDescripcion(tipoparamfactudescuento));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoParamFactuDescuento() throws Exception {		
		this.startProcessTipoParamFactuDescuento(true);
	}
	
	public void startProcessTipoParamFactuDescuento(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTipoParamFactuDescuento ,this.jPanelParametrosReportesTipoParamFactuDescuento, this.jScrollPanelDatosTipoParamFactuDescuento,this.jPanelPaginacionTipoParamFactuDescuento, this.jScrollPanelDatosEdicionTipoParamFactuDescuento, this.jPanelAccionesTipoParamFactuDescuento,this.jPanelAccionesFormularioTipoParamFactuDescuento,this.jmenuBarTipoParamFactuDescuento,this.jmenuBarDetalleTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,this.jTtoolBarDetalleTipoParamFactuDescuento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParamFactuDescuento=this.jTabbedPaneBusquedasTipoParamFactuDescuento; 
		
		final JPanel jPanelParametrosReportesTipoParamFactuDescuento=this.jPanelParametrosReportesTipoParamFactuDescuento;
		//final JScrollPane jScrollPanelDatosTipoParamFactuDescuento=this.jScrollPanelDatosTipoParamFactuDescuento;
		final JTable jTableDatosTipoParamFactuDescuento=this.jTableDatosTipoParamFactuDescuento;		
		final JPanel jPanelPaginacionTipoParamFactuDescuento=this.jPanelPaginacionTipoParamFactuDescuento;
		//final JScrollPane jScrollPanelDatosEdicionTipoParamFactuDescuento=this.jScrollPanelDatosEdicionTipoParamFactuDescuento;
		final JPanel jPanelAccionesTipoParamFactuDescuento=this.jPanelAccionesTipoParamFactuDescuento;
		
		JPanel jPanelCamposAuxiliarTipoParamFactuDescuento=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoParamFactuDescuento=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			jPanelCamposAuxiliarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jPanelCamposTipoParamFactuDescuento;
			jPanelAccionesFormularioAuxiliarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jPanelAccionesFormularioTipoParamFactuDescuento;
		}
		
		final JPanel jPanelCamposTipoParamFactuDescuento=jPanelCamposAuxiliarTipoParamFactuDescuento;
		final JPanel jPanelAccionesFormularioTipoParamFactuDescuento=jPanelAccionesFormularioAuxiliarTipoParamFactuDescuento;
		
		
		final JMenuBar jmenuBarTipoParamFactuDescuento=this.jmenuBarTipoParamFactuDescuento;
		final JToolBar jTtoolBarTipoParamFactuDescuento=this.jTtoolBarTipoParamFactuDescuento;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoParamFactuDescuento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParamFactuDescuento=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			jmenuBarDetalleAuxiliarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jmenuBarDetalleTipoParamFactuDescuento;
			jTtoolBarDetalleAuxiliarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTtoolBarDetalleTipoParamFactuDescuento;
		}
		
		final JMenuBar jmenuBarDetalleTipoParamFactuDescuento=jmenuBarDetalleAuxiliarTipoParamFactuDescuento;
		final JToolBar jTtoolBarDetalleTipoParamFactuDescuento=jTtoolBarDetalleAuxiliarTipoParamFactuDescuento;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParamFactuDescuento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParamFactuDescuento;
			processRunnable.jTableDatos=jTableDatosTipoParamFactuDescuento;
			processRunnable.jPanelCampos=jPanelCamposTipoParamFactuDescuento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParamFactuDescuento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParamFactuDescuento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParamFactuDescuento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParamFactuDescuento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParamFactuDescuento;
			processRunnable.jTtoolBar=jTtoolBarTipoParamFactuDescuento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParamFactuDescuento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParamFactuDescuento ,jPanelParametrosReportesTipoParamFactuDescuento,jTableDatosTipoParamFactuDescuento, /*jScrollPanelDatosTipoParamFactuDescuento,*/jPanelCamposTipoParamFactuDescuento,jPanelPaginacionTipoParamFactuDescuento, /*jScrollPanelDatosEdicionTipoParamFactuDescuento,*/ jPanelAccionesTipoParamFactuDescuento,jPanelAccionesFormularioTipoParamFactuDescuento,jmenuBarTipoParamFactuDescuento,jmenuBarDetalleTipoParamFactuDescuento,jTtoolBarTipoParamFactuDescuento,jTtoolBarDetalleTipoParamFactuDescuento);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoParamFactuDescuento ,jPanelParametrosReportesTipoParamFactuDescuento, jScrollPanelDatosTipoParamFactuDescuento,jPanelPaginacionTipoParamFactuDescuento, jScrollPanelDatosEdicionTipoParamFactuDescuento, jPanelAccionesTipoParamFactuDescuento,jPanelAccionesFormularioTipoParamFactuDescuento,jmenuBarTipoParamFactuDescuento,jmenuBarDetalleTipoParamFactuDescuento,jTtoolBarTipoParamFactuDescuento,jTtoolBarDetalleTipoParamFactuDescuento);
						
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
	
	public void finishProcessTipoParamFactuDescuento() {// throws Exception 
		this.finishProcessTipoParamFactuDescuento(true);
	}
	
	public void finishProcessTipoParamFactuDescuento(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTipoParamFactuDescuento ,this.jPanelParametrosReportesTipoParamFactuDescuento, this.jScrollPanelDatosTipoParamFactuDescuento,this.jPanelPaginacionTipoParamFactuDescuento, this.jScrollPanelDatosEdicionTipoParamFactuDescuento, this.jPanelAccionesTipoParamFactuDescuento,this.jPanelAccionesFormularioTipoParamFactuDescuento,this.jmenuBarTipoParamFactuDescuento,this.jmenuBarDetalleTipoParamFactuDescuento,this.jTtoolBarTipoParamFactuDescuento,this.jTtoolBarDetalleTipoParamFactuDescuento);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoParamFactuDescuento=this.jTabbedPaneBusquedasTipoParamFactuDescuento; 
		
		final JPanel jPanelParametrosReportesTipoParamFactuDescuento=this.jPanelParametrosReportesTipoParamFactuDescuento;
		//final JScrollPane jScrollPanelDatosTipoParamFactuDescuento=this.jScrollPanelDatosTipoParamFactuDescuento;
		final JTable jTableDatosTipoParamFactuDescuento=this.jTableDatosTipoParamFactuDescuento;		
		final JPanel jPanelPaginacionTipoParamFactuDescuento=this.jPanelPaginacionTipoParamFactuDescuento;
		//final JScrollPane jScrollPanelDatosEdicionTipoParamFactuDescuento=this.jScrollPanelDatosEdicionTipoParamFactuDescuento;
		final JPanel jPanelAccionesTipoParamFactuDescuento=this.jPanelAccionesTipoParamFactuDescuento;
		
		JPanel jPanelCamposAuxiliarTipoParamFactuDescuento=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoParamFactuDescuento=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			jPanelCamposAuxiliarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jPanelCamposTipoParamFactuDescuento;
			jPanelAccionesFormularioAuxiliarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jPanelAccionesFormularioTipoParamFactuDescuento;
		}
		
		final JPanel jPanelCamposTipoParamFactuDescuento=jPanelCamposAuxiliarTipoParamFactuDescuento;
		final JPanel jPanelAccionesFormularioTipoParamFactuDescuento=jPanelAccionesFormularioAuxiliarTipoParamFactuDescuento;
		
		
		final JMenuBar jmenuBarTipoParamFactuDescuento=this.jmenuBarTipoParamFactuDescuento;		
		final JToolBar jTtoolBarTipoParamFactuDescuento=this.jTtoolBarTipoParamFactuDescuento;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoParamFactuDescuento=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoParamFactuDescuento=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			jmenuBarDetalleAuxiliarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jmenuBarDetalleTipoParamFactuDescuento;
			jTtoolBarDetalleAuxiliarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTtoolBarDetalleTipoParamFactuDescuento;		
		}
		
		final JMenuBar jmenuBarDetalleTipoParamFactuDescuento=jmenuBarDetalleAuxiliarTipoParamFactuDescuento;
		final JToolBar jTtoolBarDetalleTipoParamFactuDescuento=jTtoolBarDetalleAuxiliarTipoParamFactuDescuento;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoParamFactuDescuento;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoParamFactuDescuento;
			processRunnable.jTableDatos=jTableDatosTipoParamFactuDescuento;
			processRunnable.jPanelCampos=jPanelCamposTipoParamFactuDescuento;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoParamFactuDescuento;
			processRunnable.jPanelAcciones=jPanelAccionesTipoParamFactuDescuento;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoParamFactuDescuento;
			
			
			processRunnable.jmenuBar=jmenuBarTipoParamFactuDescuento;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoParamFactuDescuento;
			processRunnable.jTtoolBar=jTtoolBarTipoParamFactuDescuento;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoParamFactuDescuento;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoParamFactuDescuento ,jPanelParametrosReportesTipoParamFactuDescuento, jTableDatosTipoParamFactuDescuento,/*jScrollPanelDatosTipoParamFactuDescuento,*/jPanelCamposTipoParamFactuDescuento,jPanelPaginacionTipoParamFactuDescuento, /*jScrollPanelDatosEdicionTipoParamFactuDescuento,*/ jPanelAccionesTipoParamFactuDescuento,jPanelAccionesFormularioTipoParamFactuDescuento,jmenuBarTipoParamFactuDescuento,jmenuBarDetalleTipoParamFactuDescuento,jTtoolBarTipoParamFactuDescuento,jTtoolBarDetalleTipoParamFactuDescuento));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoParamFactuDescuento(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoParamFactuDescuento(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoParamFactuDescuento(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoParamFactuDescuento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoParamFactuDescuento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoParamFactuDescuento,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoParamFactuDescuento(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoParamFactuDescuento,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoParamFactuDescuento,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipoparamfactudescuentoConstantesFunciones.getsFinalQueryTipoParamFactuDescuento();
		String  finalQueryPaginacionTodos=this.tipoparamfactudescuentoConstantesFunciones.getsFinalQueryTipoParamFactuDescuento();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoParamFactuDescuentoConstantesFunciones.getArrayColumnasGlobalesNoTipoParamFactuDescuento(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoParamFactuDescuentoConstantesFunciones.getArrayColumnasGlobalesTipoParamFactuDescuento(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoParamFactuDescuentoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipoparamfactudescuentosEliminados= new ArrayList<TipoParamFactuDescuento>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoParamFactuDescuento();
		
				///*TipoParamFactuDescuentoSessionBean*/this.tipoparamfactudescuentoSessionBean=new TipoParamFactuDescuentoSessionBean();
			
			if(this.tipoparamfactudescuentoSessionBean==null) {
				this.tipoparamfactudescuentoSessionBean=new TipoParamFactuDescuentoSessionBean();
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
					this.iNumeroPaginacion=TipoParamFactuDescuentoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoParamFactuDescuentoConstantesFunciones.getClassesForeignKeysOfTipoParamFactuDescuento(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipoparamfactudescuento."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipoparamfactudescuentosAux= new ArrayList<TipoParamFactuDescuento>();
			
				
			tipoparamfactudescuentoLogic.setDatosCliente(this.datosCliente);
			tipoparamfactudescuentoLogic.setDatosDeep(this.datosDeep);
			tipoparamfactudescuentoLogic.setIsConDeep(true);
			
			
			tipoparamfactudescuentoLogic.getTipoParamFactuDescuentoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipoparamfactudescuentoLogic.getTodosTipoParamFactuDescuentos(finalQueryGlobal,pagination);
					
					//tipoparamfactudescuentoLogic.getTodosTipoParamFactuDescuentosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()==null|| tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactudescuentosAux= new ArrayList<TipoParamFactuDescuento>();
							tipoparamfactudescuentosAux.addAll(tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactudescuentosAux= new ArrayList<TipoParamFactuDescuento>();
							tipoparamfactudescuentosAux.addAll(tipoparamfactudescuentos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactudescuentoLogic.getTodosTipoParamFactuDescuentos(finalQueryGlobal+"",this.pagination);												
							
							//tipoparamfactudescuentoLogic.getTodosTipoParamFactuDescuentosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoParamFactuDescuentos("Todos",tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipoparamfactudescuentoLogic.setTipoParamFactuDescuentos(new ArrayList<TipoParamFactuDescuento>());					
							tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().addAll(tipoparamfactudescuentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactudescuentos=new ArrayList<TipoParamFactuDescuento>();
							tipoparamfactudescuentos.addAll(tipoparamfactudescuentosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoParamFactuDescuento=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoParamFactuDescuento=this.idActual;
				
				} else if(this.idTipoParamFactuDescuentoActual!=null && this.idTipoParamFactuDescuentoActual!=0L) {
					idTipoParamFactuDescuento=idTipoParamFactuDescuentoActual;
				}
				
					
				this.sDetalleReporte=TipoParamFactuDescuentoConstantesFunciones.getDetalleIndicePorId(idTipoParamFactuDescuento);
				
				this.tipoparamfactudescuentos=new ArrayList<TipoParamFactuDescuento>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipoparamfactudescuentoLogic.getEntity(idTipoParamFactuDescuento);
					
					//tipoparamfactudescuentoLogic.getEntityWithConnection(idTipoParamFactuDescuento);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactudescuentoLogic.setTipoParamFactuDescuentos(new ArrayList<TipoParamFactuDescuento>());
					tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().add(tipoparamfactudescuentoLogic.getTipoParamFactuDescuento());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparamfactudescuentos=new ArrayList<TipoParamFactuDescuento>();
					this.tipoparamfactudescuentos.add(tipoparamfactudescuento);
				}
				
				if(tipoparamfactudescuentoLogic.getTipoParamFactuDescuento()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=TipoParamFactuDescuentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					tipoparamfactudescuentoLogic.getTipoParamFactuDescuentosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParamFactuDescuentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParamFactuDescuentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()==null||tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=tipoparamfactudescuentos==null|| tipoparamfactudescuentos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactudescuentosAux=new ArrayList<TipoParamFactuDescuento>();
						tipoparamfactudescuentosAux.addAll(tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactudescuentosAux=new ArrayList<TipoParamFactuDescuento>();
							tipoparamfactudescuentosAux.addAll(tipoparamfactudescuentos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							tipoparamfactudescuentoLogic.getTipoParamFactuDescuentosBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TipoParamFactuDescuentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TipoParamFactuDescuentoConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTipoParamFactuDescuentos("BusquedaPorNombre",tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTipoParamFactuDescuentos("BusquedaPorNombre",tipoparamfactudescuentos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactudescuentoLogic.setTipoParamFactuDescuentos(new ArrayList<TipoParamFactuDescuento>());
						tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().addAll(tipoparamfactudescuentosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactudescuentos=new ArrayList<TipoParamFactuDescuento>();
							tipoparamfactudescuentos.addAll(tipoparamfactudescuentosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoParamFactuDescuento();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoParamFactuDescuento();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactudescuentos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipoparamfactudescuentos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoParamFactuDescuento tipoparamfactudescuento) {
		Boolean permite=true;
		
		if(this.tipoparamfactudescuento.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoParamFactuDescuentoConstantesFunciones.getOrderByListaTipoParamFactuDescuento();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoParamFactuDescuentoConstantesFunciones.getOrderByListaTipoParamFactuDescuento();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuDescuento tipoparamfactudescuento:tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
				if(tipoparamfactudescuento.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactudescuentoTotales=tipoparamfactudescuento;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuDescuento tipoparamfactudescuento:this.tipoparamfactudescuentos) {
				if(tipoparamfactudescuento.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactudescuentoTotales=tipoparamfactudescuento;
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
			this.tipoparamfactudescuentoAux=new TipoParamFactuDescuento();
			this.tipoparamfactudescuentoAux.setsType(Constantes2.S_TOTALES);
			this.tipoparamfactudescuentoAux.setIsNew(false);
			this.tipoparamfactudescuentoAux.setIsChanged(false);
			this.tipoparamfactudescuentoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoParamFactuDescuentoConstantesFunciones.TotalizarValoresFilaTipoParamFactuDescuento(this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos(),this.tipoparamfactudescuentoAux);
				
				this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().add(this.tipoparamfactudescuentoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoParamFactuDescuentoConstantesFunciones.TotalizarValoresFilaTipoParamFactuDescuento(this.tipoparamfactudescuentos,this.tipoparamfactudescuentoAux);
				
				this.tipoparamfactudescuentos.add(this.tipoparamfactudescuentoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipoparamfactudescuentoTotales=new TipoParamFactuDescuento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().remove(tipoparamfactudescuentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipoparamfactudescuentos.remove(tipoparamfactudescuentoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipoparamfactudescuentoTotales=new TipoParamFactuDescuento();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoParamFactuDescuento tipoparamfactudescuento:tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
				if(tipoparamfactudescuento.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactudescuentoTotales=tipoparamfactudescuento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParamFactuDescuentoConstantesFunciones.TotalizarValoresFilaTipoParamFactuDescuento(this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos(),tipoparamfactudescuentoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoParamFactuDescuento tipoparamfactudescuento:this.tipoparamfactudescuentos) {
				if(tipoparamfactudescuento.getsType().equals(Constantes2.S_TOTALES)) {
					tipoparamfactudescuentoTotales=tipoparamfactudescuento;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoParamFactuDescuentoConstantesFunciones.TotalizarValoresFilaTipoParamFactuDescuento(this.tipoparamfactudescuentos,tipoparamfactudescuentoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTipoParamFactuDescuentosBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTipoParamFactuDescuentoPorNombre()throws Exception {
		try {
			sAccionBusqueda="PorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			throw e;
		}
	}

	
	
	public void getTipoParamFactuDescuentosBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactudescuentoLogic.getTipoParamFactuDescuentosBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTipoParamFactuDescuentoPorNombre(String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactudescuentoLogic.getTipoParamFactuDescuentoPorNombre(nombre);
				
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
	
	public void inicializarPermisosTipoParamFactuDescuento() {
		this.isPermisoTodoTipoParamFactuDescuento=false;
		this.isPermisoNuevoTipoParamFactuDescuento=false;
		this.isPermisoActualizarTipoParamFactuDescuento=false;
		this.isPermisoActualizarOriginalTipoParamFactuDescuento=false;
		this.isPermisoEliminarTipoParamFactuDescuento=false;
		this.isPermisoGuardarCambiosTipoParamFactuDescuento=false;
		this.isPermisoConsultaTipoParamFactuDescuento=false;
		this.isPermisoBusquedaTipoParamFactuDescuento=false;
		this.isPermisoReporteTipoParamFactuDescuento=false;		
		this.isPermisoOrdenTipoParamFactuDescuento=false;		
		this.isPermisoPaginacionMedioTipoParamFactuDescuento=false;		
		this.isPermisoPaginacionAltoTipoParamFactuDescuento=false;
		this.isPermisoPaginacionTodoTipoParamFactuDescuento=false;
		this.isPermisoCopiarTipoParamFactuDescuento=false;		
		this.isPermisoVerFormTipoParamFactuDescuento=false;		
		this.isPermisoDuplicarTipoParamFactuDescuento=false;		
		this.isPermisoOrdenTipoParamFactuDescuento=false;		
	}
	
	public void setPermisosUsuarioTipoParamFactuDescuento(Boolean isPermiso) {
		this.isPermisoTodoTipoParamFactuDescuento=isPermiso;
		this.isPermisoNuevoTipoParamFactuDescuento=isPermiso;
		this.isPermisoActualizarTipoParamFactuDescuento=isPermiso;
		this.isPermisoActualizarOriginalTipoParamFactuDescuento=isPermiso;
		this.isPermisoEliminarTipoParamFactuDescuento=isPermiso;
		this.isPermisoGuardarCambiosTipoParamFactuDescuento=isPermiso;
		this.isPermisoConsultaTipoParamFactuDescuento=isPermiso;
		this.isPermisoBusquedaTipoParamFactuDescuento=isPermiso;
		this.isPermisoReporteTipoParamFactuDescuento=isPermiso;
		this.isPermisoOrdenTipoParamFactuDescuento=isPermiso;		
		this.isPermisoPaginacionMedioTipoParamFactuDescuento=isPermiso;		
		this.isPermisoPaginacionAltoTipoParamFactuDescuento=isPermiso;		
		this.isPermisoPaginacionTodoTipoParamFactuDescuento=isPermiso;		
		this.isPermisoCopiarTipoParamFactuDescuento=isPermiso;		
		this.isPermisoVerFormTipoParamFactuDescuento=isPermiso;		
		this.isPermisoDuplicarTipoParamFactuDescuento=isPermiso;
		this.isPermisoOrdenTipoParamFactuDescuento=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoParamFactuDescuento(Boolean isPermiso) {
		//this.isPermisoTodoTipoParamFactuDescuento=isPermiso;
		this.isPermisoNuevoTipoParamFactuDescuento=isPermiso;
		this.isPermisoActualizarTipoParamFactuDescuento=isPermiso;
		this.isPermisoActualizarOriginalTipoParamFactuDescuento=isPermiso;
		this.isPermisoEliminarTipoParamFactuDescuento=isPermiso;
		this.isPermisoGuardarCambiosTipoParamFactuDescuento=isPermiso;
		//this.isPermisoConsultaTipoParamFactuDescuento=isPermiso;
		//this.isPermisoBusquedaTipoParamFactuDescuento=isPermiso;
		//this.isPermisoReporteTipoParamFactuDescuento=isPermiso;
		//this.isPermisoOrdenTipoParamFactuDescuento=isPermiso;		
		//this.isPermisoPaginacionMedioTipoParamFactuDescuento=isPermiso;		
		//this.isPermisoPaginacionAltoTipoParamFactuDescuento=isPermiso;		
		//this.isPermisoPaginacionTodoTipoParamFactuDescuento=isPermiso;		
		//this.isPermisoCopiarTipoParamFactuDescuento=isPermiso;		
		//this.isPermisoDuplicarTipoParamFactuDescuento=isPermiso;
		//this.isPermisoOrdenTipoParamFactuDescuento=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoParamFactuDescuentoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TipoParamFactuDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoParamFactuDescuento(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoParamFactuDescuentoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTipoParamFactuDescuentoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoParamFactuDescuentoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoParamFactuDescuentoClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTipoParamFactuDescuento() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoParamFactuDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoParamFactuDescuentoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoParamFactuDescuento=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoParamFactuDescuento=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoParamFactuDescuento=this.isPermisoActualizarTipoParamFactuDescuento;
			this.isPermisoEliminarTipoParamFactuDescuento=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoParamFactuDescuento=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoParamFactuDescuento=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoParamFactuDescuento=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoParamFactuDescuento=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoParamFactuDescuento=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParamFactuDescuento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoParamFactuDescuento=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoParamFactuDescuento=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoParamFactuDescuento=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoParamFactuDescuento=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoParamFactuDescuento=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoParamFactuDescuento=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoParamFactuDescuento=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoParamFactuDescuento.setToolTipText(this.jTableDatosTipoParamFactuDescuento.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoParamFactuDescuento(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoParamFactuDescuento(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoParamFactuDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoParamFactuDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoParamFactuDescuento() throws Exception {
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
	
		
	public void inicializarCombosForeignKeyTipoParamFactuDescuentoListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoParamFactuDescuentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoParamFactuDescuentoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoParamFactuDescuentoListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoParamFactuDescuentoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoParamFactuDescuento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoParamFactuDescuento()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoParamFactuDescuento(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoParamFactuDescuento()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuDescuento();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoParamFactuDescuento()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoParamFactuDescuento()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoParamFactuDescuento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoParamFactuDescuento()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoParamFactuDescuento()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoParamFactuDescuento()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoParamFactuDescuento(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoParamFactuDescuento()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoParamFactuDescuentoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoParamFactuDescuentoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoParamFactuDescuentoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipoparamfactudescuentoSessionBean=new TipoParamFactuDescuentoSessionBean(); 
		this.tipoparamfactudescuentoConstantesFunciones=new TipoParamFactuDescuentoConstantesFunciones(); 
		this.tipoparamfactudescuentoBean=new TipoParamFactuDescuento();//(this.tipoparamfactudescuentoConstantesFunciones); 		
		this.tipoparamfactudescuentoReturnGeneral=new TipoParamFactuDescuentoParameterReturnGeneral(); 
		
		this.tipoparamfactudescuentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipoparamfactudescuentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoParamFactuDescuentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoParamFactuDescuentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoParamFactuDescuentoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoParamFactuDescuento(true);
			
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
			
			this.tipoparamfactudescuentoConstantesFunciones=new TipoParamFactuDescuentoConstantesFunciones(); 
			this.tipoparamfactudescuentoBean=new TipoParamFactuDescuento();//this.tipoparamfactudescuentoConstantesFunciones); 			
			this.tipoparamfactudescuentoReturnGeneral=new TipoParamFactuDescuentoParameterReturnGeneral(); 
		
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Descuento Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipoparamfactudescuento=new TipoParamFactuDescuento();
			this.tipoparamfactudescuentos = new ArrayList<TipoParamFactuDescuento>();
			this.tipoparamfactudescuentosAux = new ArrayList<TipoParamFactuDescuento>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic=new TipoParamFactuDescuentoLogic();
				this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
			}
			
			//this.tipoparamfactudescuentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipoparamfactudescuentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoParamFactuDescuento);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParamFactuDescuento);	
					}
					
					if(this.jInternalFrameImportacionTipoParamFactuDescuento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParamFactuDescuento);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoParamFactuDescuento!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoParamFactuDescuento);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParamFactuDescuento);
				this.jInternalFrameDetalleFormTipoParamFactuDescuento.setVisible(false);
				this.jInternalFrameDetalleFormTipoParamFactuDescuento.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento);
					this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoParamFactuDescuento!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoParamFactuDescuento);
					this.jInternalFrameImportacionTipoParamFactuDescuento.setVisible(false);
					this.jInternalFrameImportacionTipoParamFactuDescuento.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoParamFactuDescuento!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoParamFactuDescuento);
					this.jInternalFrameOrderByTipoParamFactuDescuento.setVisible(false);
					this.jInternalFrameOrderByTipoParamFactuDescuento.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoParamFactuDescuentoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoParamFactuDescuentoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipoparamfactudescuentoReturnGeneral=new TipoParamFactuDescuentoParameterReturnGeneral();
			
			this.tipoparamfactudescuentoParameterGeneral=new TipoParamFactuDescuentoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipoparamfactudescuentoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoParamFactuDescuentoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParamFactuDescuentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado(),this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoParamFactuDescuentoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado(),this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaDuplicarTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaCopiarTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaVerFormTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaOrdenTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=false;
			
			
			this.isVisibilidadBusquedaPorNombre=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoParamFactuDescuento();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoParamFactuDescuento(false);
			
			this.setPermisosUsuarioTipoParamFactuDescuento();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado() 
				|| (this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado() && this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoParamFactuDescuentoClasesRelacionadas();
			}
			
			if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoParamFactuDescuentoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoParamFactuDescuento();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoParamFactuDescuento();
			}
			
			if(!this.isPermisoBusquedaTipoParamFactuDescuento) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoParamFactuDescuento,this.isPermisoPaginacionMedioTipoParamFactuDescuento,this.isPermisoPaginacionTodoTipoParamFactuDescuento);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoParamFactuDescuentoConstantesFunciones.getTiposSeleccionarTipoParamFactuDescuento());
				
				this.tiposColumnasSelect=TipoParamFactuDescuentoConstantesFunciones.getTiposSeleccionarTipoParamFactuDescuento(true);
				
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
			//if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoParamFactuDescuento();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoParamFactuDescuento(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoParamFactuDescuento(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuDescuento() ;
			
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
				tipoparamfactudescuentoImplementable= (TipoParamFactuDescuentoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParamFactuDescuentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipoparamfactudescuentoImplementableHome= (TipoParamFactuDescuentoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoParamFactuDescuentoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipoparamfactudescuentos= new ArrayList<TipoParamFactuDescuento>();
			this.tipoparamfactudescuentosEliminados= new ArrayList<TipoParamFactuDescuento>();
						
			this.isEsNuevoTipoParamFactuDescuento=false;
			this.esParaAccionDesdeFormularioTipoParamFactuDescuento=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoParamFactuDescuento(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoParamFactuDescuento();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoParamFactuDescuentoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoParamFactuDescuento(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoParamFactuDescuento();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoParamFactuDescuento();
			}
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTipoParamFactuDescuento.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTipoParamFactuDescuento.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTipoParamFactuDescuento.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoParamFactuDescuento(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoParamFactuDescuento: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoParamFactuDescuento() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoParamFactuDescuento")) {
				iIndex=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTabbedPaneRelacionesTipoParamFactuDescuento.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTabbedPaneRelacionesTipoParamFactuDescuento.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoParamFactuDescuento();	
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
	
	public void cargarCombosForeignKeyTipoParamFactuDescuento(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoParamFactuDescuento(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoParamFactuDescuento(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoParamFactuDescuentoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoParamFactuDescuento();
		
		this.cargarCombosFrameForeignKeyTipoParamFactuDescuento();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoParamFactuDescuento();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoParamFactuDescuento();
		}
	}
	
	
	
	public void jButtonNuevoTipoParamFactuDescuentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
			
			if(jTableDatosTipoParamFactuDescuento.getRowCount()>=1) {
				jTableDatosTipoParamFactuDescuento.removeRowSelectionInterval(0, jTableDatosTipoParamFactuDescuento.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoParamFactuDescuento=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoParamFactuDescuento(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoParamFactuDescuento(true);			
			//this.tipoparamfactudescuento=new TipoParamFactuDescuento();
			//this.tipoparamfactudescuento.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuDescuento(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuDescuento() ;
			
			if(TipoParamFactuDescuentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuDescuento(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipoparamfactudescuento);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);				
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
			if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoParamFactuDescuento: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoParamFactuDescuentoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoParamFactuDescuento.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoParamFactuDescuento.getSelectedRows().length;			
			}
			
			tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoParamFactuDescuento--;			
				//TipoParamFactuDescuento tipoparamfactudescuentoAux= new TipoParamFactuDescuento();			
				//tipoparamfactudescuentoAux.setId(this.iIdNuevoTipoParamFactuDescuento);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoParamFactuDescuento tipoparamfactudescuentoOrigen=new TipoParamFactuDescuento();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoParamFactuDescuento tipoparamfactudescuentoOrigen : tipoparamfactudescuentosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipoparamfactudescuentoOrigen =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipoparamfactudescuentoOrigen =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoParamFactuDescuento();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipoparamfactudescuento.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoParamFactuDescuento(tipoparamfactudescuentoOrigen,this.tipoparamfactudescuento,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().add(this.tipoparamfactudescuentoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparamfactudescuentos.add(this.tipoparamfactudescuentoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
				
				this.jTableDatosTipoParamFactuDescuento.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuDescuento(), this.getIndiceNuevoTipoParamFactuDescuento());
				
				int iLastRow =  this.jTableDatosTipoParamFactuDescuento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParamFactuDescuento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParamFactuDescuento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();									
		
			TipoParamFactuDescuento tipoparamfactudescuentoOrigen=new TipoParamFactuDescuento();
			TipoParamFactuDescuento tipoparamfactudescuentoDestino=new TipoParamFactuDescuento();
				
			tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoParamFactuDescuento.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipoparamfactudescuentosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoParamFactuDescuento.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactudescuentoOrigen =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparamfactudescuentoOrigen =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipoparamfactudescuentoDestino =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipoparamfactudescuentoDestino =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipoparamfactudescuentoOrigen =tipoparamfactudescuentosSeleccionados.get(0);
				tipoparamfactudescuentoDestino =tipoparamfactudescuentosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoParamFactuDescuento(tipoparamfactudescuentoOrigen,tipoparamfactudescuentoDestino,true,false);
				
				tipoparamfactudescuentoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipoparamfactudescuentoDestino,tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipoparamfactudescuentoDestino,tipoparamfactudescuentos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
				
				//this.jTableDatosTipoParamFactuDescuento.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuDescuento(), this.getIndiceNuevoTipoParamFactuDescuento());
				
				int iLastRow =  this.jTableDatosTipoParamFactuDescuento.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoParamFactuDescuento.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoParamFactuDescuento.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoParamFactuDescuento.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(!isVisible);
			this.jPanelPaginacionTipoParamFactuDescuento.setVisible(!isVisible);
			this.jPanelAccionesTipoParamFactuDescuento.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoParamFactuDescuento();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoParamFactuDescuento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoParamFactuDescuento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoParamFactuDescuento();
			
			this.abrirFrameOrderByTipoParamFactuDescuento();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoParamFactuDescuento();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoParamFactuDescuento(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParamFactuDescuento);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoParamFactuDescuento.isMaximum()) {
					this.jInternalFrameDetalleFormTipoParamFactuDescuento.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoParamFactuDescuento.setSize(this.jInternalFrameDetalleFormTipoParamFactuDescuento.iWidthFormulario,this.jInternalFrameDetalleFormTipoParamFactuDescuento.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoParamFactuDescuento.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoParamFactuDescuento.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoParamFactuDescuento.isMaximum()) {
						this.jInternalFrameDetalleFormTipoParamFactuDescuento.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoParamFactuDescuento.jContentPaneDetalleTipoParamFactuDescuento.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTabbedPaneRelacionesTipoParamFactuDescuento.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuDescuento.jContentPaneDetalleTipoParamFactuDescuento.getWidth(),TipoParamFactuDescuentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTabbedPaneRelacionesTipoParamFactuDescuento.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuDescuento.jContentPaneDetalleTipoParamFactuDescuento.getWidth(),TipoParamFactuDescuentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTabbedPaneRelacionesTipoParamFactuDescuento.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoParamFactuDescuento.jContentPaneDetalleTipoParamFactuDescuento.getWidth(),TipoParamFactuDescuentoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoParamFactuDescuento.setVisible(true);
	        this.jInternalFrameDetalleFormTipoParamFactuDescuento.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoParamFactuDescuento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoParamFactuDescuento==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoParamFactuDescuento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuDescuento,false,this);
				} else {
					this.jInternalFrameOrderByTipoParamFactuDescuento=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoParamFactuDescuento,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoParamFactuDescuento);
				this.jInternalFrameOrderByTipoParamFactuDescuento.setVisible(false);
				this.jInternalFrameOrderByTipoParamFactuDescuento.setSelected(false);
				
				this.jInternalFrameOrderByTipoParamFactuDescuento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParamFactuDescuento"));
				
				this.inicializarActualizarBindingTablaOrderByTipoParamFactuDescuento();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoParamFactuDescuento() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoParamFactuDescuento==null) {
				
				this.jInternalFrameImportacionTipoParamFactuDescuento=new ImportacionJInternalFrame(TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoParamFactuDescuento);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoParamFactuDescuento);
				this.jInternalFrameImportacionTipoParamFactuDescuento.setVisible(false);
				this.jInternalFrameImportacionTipoParamFactuDescuento.setSelected(false);


				this.jInternalFrameImportacionTipoParamFactuDescuento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParamFactuDescuento"));
				this.jInternalFrameImportacionTipoParamFactuDescuento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParamFactuDescuento"));
				this.jInternalFrameImportacionTipoParamFactuDescuento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParamFactuDescuento"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoParamFactuDescuento() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento==null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento=new ReporteDinamicoJInternalFrame(TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoParamFactuDescuento);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento);
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuDescuento"));
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuDescuento"));
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuDescuento"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuDescuento();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleTipoParamFactuDescuento() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoParamFactuDescuento);
			
	       	this.jInternalFrameDetalleFormTipoParamFactuDescuento.setVisible(false);
	        this.jInternalFrameDetalleFormTipoParamFactuDescuento.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoParamFactuDescuento.dispose();
			//this.jInternalFrameDetalleFormTipoParamFactuDescuento=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoParamFactuDescuento() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoParamFactuDescuento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoParamFactuDescuento.setVisible(true);
	        this.jInternalFrameImportacionTipoParamFactuDescuento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoParamFactuDescuento() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoParamFactuDescuento.setVisible(true);
	        this.jInternalFrameOrderByTipoParamFactuDescuento.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoParamFactuDescuento() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoParamFactuDescuento.setVisible(false);
	        this.jInternalFrameOrderByTipoParamFactuDescuento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoParamFactuDescuento() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoParamFactuDescuento() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoParamFactuDescuento.setVisible(false);
	        this.jInternalFrameImportacionTipoParamFactuDescuento.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoParamFactuDescuento(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoParamFactuDescuento(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoParamFactuDescuento(true);
			//this.isEsNuevoTipoParamFactuDescuento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuDescuento(false) ;
			
			if(tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TipoParamFactuDescuentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuDescuento(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuDescuento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoParamFactuDescuentoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoParamFactuDescuento(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoParamFactuDescuento(true);
			//this.isEsNuevoTipoParamFactuDescuento=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipoparamfactudescuento.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoParamFactuDescuento(false) ;
			
			if(TipoParamFactuDescuentoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoParamFactuDescuento(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuDescuento(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoParamFactuDescuento(false);
			
			//if(!this.isEsNuevoTipoParamFactuDescuento) {								
				int intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(this.tipoparamfactudescuento,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);
				
			}
			
			if(this.permiteMantenimiento(this.tipoparamfactudescuento)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoParamFactuDescuento=true;
					this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
					this.isEsNuevoTipoParamFactuDescuento=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoParamFactuDescuento=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoParamFactuDescuento=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParamFactuDescuento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuDescuento(false);
				
				this.habilitarDeshabilitarControlesTipoParamFactuDescuento(false);
			
												
				
				if(TipoParamFactuDescuentoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoParamFactuDescuento();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,tipoparamfactudescuentoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoParamFactuDescuento(this.tipoparamfactudescuento,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoParamFactuDescuento.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipoparamfactudescuentoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipoparamfactudescuento.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				this.tipoparamfactudescuento.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				this.tipoparamfactudescuento.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipoparamfactudescuento)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoParamFactuDescuentoModel) this.jTableDatosTipoParamFactuDescuento.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoParamFactuDescuento=true;
				this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
				this.isEsNuevoTipoParamFactuDescuento=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoParamFactuDescuento(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuDescuento(false);
				
				this.habilitarDeshabilitarControlesTipoParamFactuDescuento(false);
				
				
				
				if(TipoParamFactuDescuentoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoParamFactuDescuento();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoParamFactuDescuento.getRowCount()>=1) {
				jTableDatosTipoParamFactuDescuento.removeRowSelectionInterval(0, jTableDatosTipoParamFactuDescuento.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoParamFactuDescuento(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoParamFactuDescuento(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoParamFactuDescuento(false) ;
			
			this.isEsNuevoTipoParamFactuDescuento=false;
			
			if(TipoParamFactuDescuentoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoParamFactuDescuento();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoParamFactuDescuento(false);
				
				//SI ES MANUAL
				if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoParamFactuDescuento();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoParamFactuDescuento--;			
			//TipoParamFactuDescuento tipoparamfactudescuentoAux= new TipoParamFactuDescuento();			
			//tipoparamfactudescuentoAux.setId(this.iIdNuevoTipoParamFactuDescuento);
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoParamFactuDescuento();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);
			
			this.tipoparamfactudescuento.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().add(this.tipoparamfactudescuentoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipoparamfactudescuentos.add(this.tipoparamfactudescuentoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
			
			this.jTableDatosTipoParamFactuDescuento.setRowSelectionInterval(this.getIndiceNuevoTipoParamFactuDescuento(), this.getIndiceNuevoTipoParamFactuDescuento());
			
			int iLastRow =  this.jTableDatosTipoParamFactuDescuento.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoParamFactuDescuento.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoParamFactuDescuento.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoParamFactuDescuento(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuDescuento(false);
			
			//SI ES MANUAL
			if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuDescuento();
			}
			
			//this.abrirFrameTreeTipoParamFactuDescuento();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo DescuentoS ?", "MANTENIMIENTO DE Tipo Descuento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoParamFactuDescuento.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoParamFactuDescuento();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipoparamfactudescuentoReturnGeneral=tipoparamfactudescuentoLogic.procesarImportacionTipoParamFactuDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipoparamfactudescuentoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoParamFactuDescuentoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoParamFactuDescuento.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoParamFactuDescuento.setFileImportacion(this.jInternalFrameImportacionTipoParamFactuDescuento.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoParamFactuDescuento.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoParamFactuDescuento.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoParamFactuDescuento.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoParamFactuDescuento.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();		

		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoParamFactuDescuentoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoParamFactuDescuentoBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoParamFactuDescuentos("Todos",tipoparamfactudescuentosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();		
		
		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactudescuento";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoParamFactuDescuentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoParamFactuDescuento tipoparamfactudescuento:tipoparamfactudescuentosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipoparamfactudescuento.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoParamFactuDescuento(row);				
			//	iRow++;
			//}				
			
			//for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoParamFactuDescuento(tipoparamfactudescuentoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuDescuento(false);
			
			//SI ES MANUAL
			if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoParamFactuDescuento();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuDescuento(false);
			
			//SI ES MANUAL
			if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParamFactuDescuento();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoParamFactuDescuento(false);
			
			//SI ES MANUAL
			if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoParamFactuDescuento();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoParamFactuDescuento() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoParamFactuDescuento.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoParamFactuDescuento.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoParamFactuDescuento.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoParamFactuDescuento.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoParamFactuDescuento.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoParamFactuDescuento.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoParamFactuDescuento.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoParamFactuDescuento(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoParamFactuDescuento(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoParamFactuDescuento(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoParamFactuDescuento(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoParamFactuDescuento(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoParamFactuDescuento(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuDescuento(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoParamFactuDescuento(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoParamFactuDescuento() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoParamFactuDescuento();
		
		this.inicializarActualizarBindingBotonesManualTipoParamFactuDescuento(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParamFactuDescuento();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuDescuento() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuDescuento(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuDescuento(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoParamFactuDescuento.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoParamFactuDescuento.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jCheckBoxPostAccionNuevoTipoParamFactuDescuento.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jCheckBoxPostAccionSinCerrarTipoParamFactuDescuento.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jCheckBoxPostAccionSinMensajeTipoParamFactuDescuento.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoParamFactuDescuento.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoParamFactuDescuento.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
				this.jInternalFrameDetalleFormTipoParamFactuDescuento.jCheckBoxPostAccionNuevoTipoParamFactuDescuento.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoParamFactuDescuento.jCheckBoxPostAccionSinCerrarTipoParamFactuDescuento.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoParamFactuDescuento.jCheckBoxPostAccionSinMensajeTipoParamFactuDescuento.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoParamFactuDescuento.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoParamFactuDescuento.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoParamFactuDescuento.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoParamFactuDescuento.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoParamFactuDescuento.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoParamFactuDescuento.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoParamFactuDescuento(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoParamFactuDescuento(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoParamFactuDescuento() throws Exception {
		try	{
			if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParamFactuDescuento();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParamFactuDescuento() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoParamFactuDescuento() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoParamFactuDescuento.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoParamFactuDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoParamFactuDescuento.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoParamFactuDescuento.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoParamFactuDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoParamFactuDescuento.addItem(reporte);
			}
			
			
			if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoParamFactuDescuento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoParamFactuDescuento.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoParamFactuDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoParamFactuDescuento.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoParamFactuDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoParamFactuDescuento.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuDescuento();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoParamFactuDescuento() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoParamFactuDescuento()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreTipoParamFactuDescuento.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoParamFactuDescuento(Boolean esInicializar) throws Exception {				
		if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoParamFactuDescuento();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoParamFactuDescuento() throws Exception {
		this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoParamFactuDescuento() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoParamFactuDescuentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoParamFactuDescuentoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoParamFactuDescuentoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuDescuentoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoParamFactuDescuentoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoParamFactuDescuentoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoParamFactuDescuento(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipoparamfactudescuentos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoParamFactuDescuento.setModel(new TipoParamFactuDescuentoModel(this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoParamFactuDescuento.setModel(new TipoParamFactuDescuentoModel(this.tipoparamfactudescuentos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoParamFactuDescuento!=null && this.jInternalFrameOrderByTipoParamFactuDescuento.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoParamFactuDescuento();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuDescuento,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoParamFactuDescuentoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO,tipoparamfactudescuentoConstantesFunciones.resaltarSeleccionarTipoParamFactuDescuento,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoParamFactuDescuentoConstantesFunciones.SCLASSWEBTITULO,tipoparamfactudescuentoConstantesFunciones.resaltarSeleccionarTipoParamFactuDescuento,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuDescuento,TipoParamFactuDescuentoConstantesFunciones.LABEL_ID));

		if(this.tipoparamfactudescuentoConstantesFunciones.mostraridTipoParamFactuDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParamFactuDescuentoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipoparamfactudescuentoConstantesFunciones.resaltaridTipoParamFactuDescuento,this.tipoparamfactudescuentoConstantesFunciones.activaridTipoParamFactuDescuento,this,true,"idTipoParamFactuDescuento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparamfactudescuentoConstantesFunciones.resaltaridTipoParamFactuDescuento,this.tipoparamfactudescuentoConstantesFunciones.activaridTipoParamFactuDescuento,this,true,"idTipoParamFactuDescuento","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuDescuento,TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE));

		if(this.tipoparamfactudescuentoConstantesFunciones.mostrarnombreTipoParamFactuDescuento && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipoparamfactudescuentoConstantesFunciones.resaltarnombreTipoParamFactuDescuento,this.tipoparamfactudescuentoConstantesFunciones.activarnombreTipoParamFactuDescuento,this,true,"nombreTipoParamFactuDescuento","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipoparamfactudescuentoConstantesFunciones.resaltarnombreTipoParamFactuDescuento,this.tipoparamfactudescuentoConstantesFunciones.activarnombreTipoParamFactuDescuento,this,true,"nombreTipoParamFactuDescuento","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new TipoParamFactuDescuentoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParamFactuDescuento.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoParamFactuDescuento.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoParamFactuDescuento.addColumn(tableColumn);
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
			
			this.jTableDatosTipoParamFactuDescuento.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoParamFactuDescuento.moveColumn(this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoParamFactuDescuento.moveColumn(this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoParamFactuDescuento.moveColumn(this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoParamFactuDescuento.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoParamFactuDescuento.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoParamFactuDescuento,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoParamFactuDescuento.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoParamFactuDescuento.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoParamFactuDescuento.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipoparamfactudescuentos.size()-1;
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
		//this.jTableDatosTipoParamFactuDescuento.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoParamFactuDescuento.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoParamFactuDescuento();
			
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
				
				//this.isEsNuevoTipoParamFactuDescuento=false;
					
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
				if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParamFactuDescuento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParamFactuDescuento.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipoparamfactudescuento.getsType().equals("DUPLICADO")
				   || this.tipoparamfactudescuento.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoParamFactuDescuento=true;
				
				} else {
					this.isEsNuevoTipoParamFactuDescuento=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
					if(this.tipoparamfactudescuento.getId()>=0 && !this.tipoparamfactudescuento.getIsNew()) {						
						this.isEsNuevoTipoParamFactuDescuento=false;
						
					} else {
						this.isEsNuevoTipoParamFactuDescuento=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoParamFactuDescuento(esRelaciones);						
				
				this.seleccionarTipoParamFactuDescuento(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipoparamfactudescuento.getId()<0) {
					this.isEsNuevoTipoParamFactuDescuento=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoParamFactuDescuento(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoParamFactuDescuento(evt,rowIndex);
				}	
				
				if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoParamFactuDescuento: " + this.dDif); 
					}
				}								
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoParamFactuDescuento(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipoparamfactudescuento)) {
					if(this.tipoparamfactudescuento.getId()>0) {
						this.tipoparamfactudescuento.setIsDeleted(true);
						
						this.tipoparamfactudescuentosEliminados.add(this.tipoparamfactudescuento);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().remove(this.tipoparamfactudescuento);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipoparamfactudescuentos.remove(this.tipoparamfactudescuento);				
					}
					
					
					((TipoParamFactuDescuentoModel) this.jTableDatosTipoParamFactuDescuento.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoParamFactuDescuento(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoParamFactuDescuento) {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoParamFactuDescuento.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoParamFactuDescuento.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoParamFactuDescuento(this.tipoparamfactudescuento);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoParamFactuDescuento("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoParamFactuDescuento(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoParamFactuDescuento() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoParamFactuDescuento(tipoparamfactudescuento,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoParamFactuDescuento(tipoparamfactudescuento);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoParamFactuDescuento(tipoparamfactudescuento,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuDescuento(tipoparamfactudescuento);
	}
	
	public void setVariablesObjetoActualToFormularioTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.setText(tipoparamfactudescuento.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextAreanombreTipoParamFactuDescuento.setText(tipoparamfactudescuento.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoParamFactuDescuento tipoparamfactudescuentoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipoparamfactudescuentoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoParamFactuDescuento tipoparamfactudescuentoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipoparamfactudescuentoLocal=this.tipoparamfactudescuento;
			} else {
				tipoparamfactudescuentoLocal=this.tipoparamfactudescuentoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipoparamfactudescuentoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoParamFactuDescuento(tipoparamfactudescuentoLocal,true);
					
					if(tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipoparamfactudescuentoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipoparamfactudescuentoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(tipoparamfactudescuento,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(tipoparamfactudescuento);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(tipoparamfactudescuento,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.getText()==null || this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.getText()=="" || this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.setText("0");
			}

			if(conColumnasBase) {tipoparamfactudescuento.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParamFactuDescuentoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuDescuento.jLabelIdTipoParamFactuDescuento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipoparamfactudescuento.setnombre(this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextAreanombreTipoParamFactuDescuento.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoParamFactuDescuento.jLabelnombreTipoParamFactuDescuento,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuentoBean,TipoParamFactuDescuento tipoparamfactudescuento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuentoOrigen,TipoParamFactuDescuento tipoparamfactudescuento,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparamfactudescuentoOrigen.getId()!=null && !tipoparamfactudescuentoOrigen.getId().equals(0L))) {tipoparamfactudescuento.setId(tipoparamfactudescuentoOrigen.getId());}}
			if(conDefault || (!conDefault && tipoparamfactudescuentoOrigen.getnombre()!=null && !tipoparamfactudescuentoOrigen.getnombre().equals(""))) {tipoparamfactudescuento.setnombre(tipoparamfactudescuentoOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.setText(tipoparamfactudescuento.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextAreanombreTipoParamFactuDescuento.setText(tipoparamfactudescuento.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoParamFactuDescuento(TipoParamFactuDescuentoBean tipoparamfactudescuentoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.setText(tipoparamfactudescuentoBean.getId().toString());
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextAreanombreTipoParamFactuDescuento.setText(tipoparamfactudescuentoBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoParamFactuDescuento(TipoParamFactuDescuentoParameterReturnGeneral tipoparamfactudescuentoReturnGeneral,TipoParamFactuDescuentoBean tipoparamfactudescuentoBean,Boolean conDefault) throws Exception { 
		try {
			TipoParamFactuDescuento tipoparamfactudescuentoLocal=new TipoParamFactuDescuento();
			
			tipoparamfactudescuentoLocal=tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipoparamfactudescuentoLocal.getId()!=null && !tipoparamfactudescuentoLocal.getId().equals(0L))) {tipoparamfactudescuentoBean.setId(tipoparamfactudescuentoLocal.getId());}}
			if(conDefault || (!conDefault && tipoparamfactudescuentoLocal.getnombre()!=null && !tipoparamfactudescuentoLocal.getnombre().equals(""))) {tipoparamfactudescuentoBean.setnombre(tipoparamfactudescuentoLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoParamFactuDescuentoGenerico(Long idTipoParamFactuDescuentoSeleccionado,JComboBox jComboBoxTipoParamFactuDescuento,List<TipoParamFactuDescuento> tipoparamfactudescuentosLocal)throws Exception {
		try {
			TipoParamFactuDescuento  tipoparamfactudescuentoTemp=null;

			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentosLocal) {
				if(tipoparamfactudescuentoAux.getId()!=null && tipoparamfactudescuentoAux.getId().equals(idTipoParamFactuDescuentoSeleccionado)) {
					tipoparamfactudescuentoTemp=tipoparamfactudescuentoAux;
					break;
				}
			}

			jComboBoxTipoParamFactuDescuento.setSelectedItem(tipoparamfactudescuentoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoParamFactuDescuentoGenerico(JComboBox jComboBoxTipoParamFactuDescuento,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoParamFactuDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParamFactuDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoParamFactuDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoParamFactuDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParamFactuDescuento.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoParamFactuDescuento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoParamFactuDescuento.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoParamFactuDescuento.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoParamFactuDescuento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoParamFactuDescuento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactudescuento=(TipoParamFactuDescuento) tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparamfactudescuento =(TipoParamFactuDescuento) tipoparamfactudescuentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoParamFactuDescuento tipoparamfactudescuentoRow=new TipoParamFactuDescuento();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactudescuentoRow=(TipoParamFactuDescuento) tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipoparamfactudescuentoRow=(TipoParamFactuDescuento) tipoparamfactudescuentos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoParamFactuDescuento(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuDescuento && this.isPermisoNuevoTipoParamFactuDescuento));			
			this.jButtonDuplicarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuDescuento && this.isPermisoDuplicarTipoParamFactuDescuento));			
			this.jButtonCopiarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuDescuento && this.isPermisoCopiarTipoParamFactuDescuento));
			this.jButtonVerFormTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuDescuento && this.isPermisoVerFormTipoParamFactuDescuento));
			
			this.jButtonAbrirOrderByTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuDescuento && this.isPermisoOrdenTipoParamFactuDescuento));			
			
			this.jButtonNuevoRelacionesTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento && this.isPermisoNuevoTipoParamFactuDescuento));			
			this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuDescuento && this.isPermisoNuevoTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonModificarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuDescuento && this.isPermisoActualizarTipoParamFactuDescuento));	
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuDescuento && this.isPermisoActualizarTipoParamFactuDescuento));	
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuDescuento && this.isPermisoEliminarTipoParamFactuDescuento));
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarTipoParamFactuDescuento.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuDescuento);							
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuDescuento && this.isPermisoNuevoTipoParamFactuDescuento));						
			this.jButtonDuplicarToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuDescuento && this.isPermisoDuplicarTipoParamFactuDescuento));						
			this.jButtonCopiarToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuDescuento && this.isPermisoCopiarTipoParamFactuDescuento));			
			this.jButtonVerFormToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuDescuento && this.isPermisoVerFormTipoParamFactuDescuento));			
			this.jButtonAbrirOrderByToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuDescuento && this.isPermisoOrdenTipoParamFactuDescuento));
			this.jButtonNuevoRelacionesToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento && this.isPermisoNuevoTipoParamFactuDescuento));			
			this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuDescuento && this.isPermisoNuevoTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));			
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonModificarToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuDescuento && this.isPermisoActualizarTipoParamFactuDescuento));	
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuDescuento  && this.isPermisoActualizarTipoParamFactuDescuento));	
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuDescuento && this.isPermisoEliminarTipoParamFactuDescuento));
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarToolBarTipoParamFactuDescuento.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuDescuento);				
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuDescuento && this.isPermisoNuevoTipoParamFactuDescuento));			
			this.jMenuItemDuplicarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaDuplicarTipoParamFactuDescuento && this.isPermisoDuplicarTipoParamFactuDescuento));			
			this.jMenuItemCopiarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaCopiarTipoParamFactuDescuento && this.isPermisoCopiarTipoParamFactuDescuento));			
			this.jMenuItemVerFormTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaVerFormTipoParamFactuDescuento && this.isPermisoVerFormTipoParamFactuDescuento));			
			this.jMenuItemAbrirOrderByTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuDescuento && this.isPermisoOrdenTipoParamFactuDescuento));			
			//this.jMenuItemMostrarOcultarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuDescuento && this.isPermisoOrdenTipoParamFactuDescuento));
			this.jMenuItemDetalleAbrirOrderByTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuDescuento && this.isPermisoOrdenTipoParamFactuDescuento));			
			//this.jMenuItemDetalleMostrarOcultarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaOrdenTipoParamFactuDescuento && this.isPermisoOrdenTipoParamFactuDescuento));			
			this.jMenuItemNuevoRelacionesTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento && this.isPermisoNuevoTipoParamFactuDescuento));			
			this.jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaNuevoTipoParamFactuDescuento && this.isPermisoNuevoTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));									
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemModificarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaModificarTipoParamFactuDescuento && this.isPermisoActualizarTipoParamFactuDescuento));	
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemActualizarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaActualizarTipoParamFactuDescuento && this.isPermisoActualizarTipoParamFactuDescuento));	
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemEliminarTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaEliminarTipoParamFactuDescuento && this.isPermisoEliminarTipoParamFactuDescuento));
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemCancelarTipoParamFactuDescuento.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuDescuento);				
			}
			
			this.jMenuItemGuardarCambiosTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));						
			this.jMenuItemGuardarCambiosTablaTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=this.jButtonNuevoTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaDuplicarTipoParamFactuDescuento=this.jButtonDuplicarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaCopiarTipoParamFactuDescuento=this.jButtonCopiarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaVerFormTipoParamFactuDescuento=this.jButtonVerFormTipoParamFactuDescuento.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoParamFactuDescuento=this.jButtonAbrirOrderByTipoParamFactuDescuento.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=this.jButtonNuevoRelacionesTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=this.jButtonModificarTipoParamFactuDescuento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosTipoParamFactuDescuento.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=this.jButtonNuevoToolBarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=this.jButtonNuevoRelacionesToolBarTipoParamFactuDescuento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonModificarToolBarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarToolBarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarToolBarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarToolBarTipoParamFactuDescuento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=this.jButtonGuardarCambiosToolBarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=this.jButtonGuardarCambiosTablaToolBarTipoParamFactuDescuento.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=this.jMenuItemNuevoTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=this.jMenuItemNuevoRelacionesTipoParamFactuDescuento.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemModificarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemActualizarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemEliminarTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemCancelarTipoParamFactuDescuento.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=this.jMenuItemGuardarCambiosTipoParamFactuDescuento.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=this.jMenuItemGuardarCambiosTablaTipoParamFactuDescuento.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoParamFactuDescuento(Boolean esInicializar) {
		if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
				//if(this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParamFactuDescuento();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoParamFactuDescuento(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoParamFactuDescuento() {
		this.jButtonNuevoTipoParamFactuDescuento.setVisible(this.isPermisoNuevoTipoParamFactuDescuento);			
		this.jButtonDuplicarTipoParamFactuDescuento.setVisible(this.isPermisoDuplicarTipoParamFactuDescuento);			
		this.jButtonCopiarTipoParamFactuDescuento.setVisible(this.isPermisoCopiarTipoParamFactuDescuento);			
		this.jButtonVerFormTipoParamFactuDescuento.setVisible(this.isPermisoVerFormTipoParamFactuDescuento);			
		
		this.jButtonAbrirOrderByTipoParamFactuDescuento.setVisible(this.isPermisoOrdenTipoParamFactuDescuento);					
		
		this.jButtonNuevoRelacionesTipoParamFactuDescuento.setVisible(this.isPermisoNuevoTipoParamFactuDescuento);			
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonModificarTipoParamFactuDescuento.setVisible(this.isPermisoActualizarTipoParamFactuDescuento);	
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarTipoParamFactuDescuento.setVisible(this.isPermisoActualizarTipoParamFactuDescuento);	
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarTipoParamFactuDescuento.setVisible(this.isPermisoEliminarTipoParamFactuDescuento);
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarTipoParamFactuDescuento.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuDescuento);						
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosTipoParamFactuDescuento.setVisible(this.isPermisoGuardarCambiosTipoParamFactuDescuento);							
		}
		
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.setVisible(this.isPermisoActualizarTipoParamFactuDescuento);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParamFactuDescuento() {
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonModificarTipoParamFactuDescuento.setVisible(this.isPermisoActualizarTipoParamFactuDescuento);	
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarTipoParamFactuDescuento.setVisible(this.isPermisoActualizarTipoParamFactuDescuento);	
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarTipoParamFactuDescuento.setVisible(this.isPermisoEliminarTipoParamFactuDescuento);
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarTipoParamFactuDescuento.setVisible(this.isVisibilidadCeldaCancelarTipoParamFactuDescuento);							
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosTipoParamFactuDescuento.setVisible((this.isVisibilidadCeldaGuardarTipoParamFactuDescuento && this.isPermisoGuardarCambiosTipoParamFactuDescuento));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoParamFactuDescuento() {
		if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoParamFactuDescuento();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoParamFactuDescuento() {
	}
	
	public void jTableDatosTipoParamFactuDescuentoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoParamFactuDescuento(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoParamFactuDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(this.gettipoparamfactudescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparamfactudescuento==null) {
						this.tipoparamfactudescuento = new TipoParamFactuDescuento();
					}

					this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(this.tipoparamfactudescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);
				}

				if(this.tipoparamfactudescuento.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipoparamfactudescuento.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParamFactuDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoParamFactuDescuentoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(this.gettipoparamfactudescuento(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipoparamfactudescuento==null) {
						this.tipoparamfactudescuento = new TipoParamFactuDescuento();
					}

					this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(this.tipoparamfactudescuento,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);
				}

				if(this.tipoparamfactudescuento.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipoparamfactudescuento.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoParamFactuDescuento(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorNombreTipoParamFactuDescuentoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTipoParamFactuDescuento(false,false);

			this.getTipoParamFactuDescuentosBusquedaPorNombre();

			this.inicializarActualizarBindingTipoParamFactuDescuento(false);

			//if(TipoParamFactuDescuentoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTipoParamFactuDescuento(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipoparamfactudescuentoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTipoParamFactuDescuento() {
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.dispose();
			this.jInternalFrameDetalleFormTipoParamFactuDescuento=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento!=null) {
			this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.dispose();
			this.jInternalFrameReporteDinamicoTipoParamFactuDescuento=null;
		}
		
		if(this.jInternalFrameImportacionTipoParamFactuDescuento!=null) {
			this.jInternalFrameImportacionTipoParamFactuDescuento.setVisible(false);	    			
			this.jInternalFrameImportacionTipoParamFactuDescuento.dispose();
			this.jInternalFrameImportacionTipoParamFactuDescuento=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoParamFactuDescuento();
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoParamFactuDescuento")) {
				jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoParamFactuDescuento")) {
				jButtonDuplicarTipoParamFactuDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoParamFactuDescuento")) {
				jButtonCopiarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoParamFactuDescuento")) {
				jButtonVerFormTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoParamFactuDescuento")) {
				jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoParamFactuDescuento")) {
				jButtonDuplicarTipoParamFactuDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoParamFactuDescuento")) {
				jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoParamFactuDescuento")) {
				jButtonDuplicarTipoParamFactuDescuentoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoParamFactuDescuento")) {
				jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoParamFactuDescuento")) {
				jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoParamFactuDescuento")) {
				jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoParamFactuDescuento")) {
				jButtonModificarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoParamFactuDescuento")) {
				jButtonModificarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoParamFactuDescuento")) {
				jButtonModificarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoParamFactuDescuento")) {
				jButtonActualizarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoParamFactuDescuento")) {
				jButtonActualizarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoParamFactuDescuento")) {
				jButtonActualizarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoParamFactuDescuento")) {
				jButtonEliminarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoParamFactuDescuento")) {
				jButtonEliminarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoParamFactuDescuento")) {
				jButtonEliminarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoParamFactuDescuento")) {
				jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoParamFactuDescuento")) {
				jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoParamFactuDescuento")) {
				jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoParamFactuDescuento")) {
				jButtonCerrarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoParamFactuDescuento")) {
				jButtonCerrarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoParamFactuDescuento")) {
				jButtonCerrarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoParamFactuDescuento")) {
				jButtonMostrarOcultarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoParamFactuDescuento")) {
				jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoParamFactuDescuento")) {
				jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoParamFactuDescuento")) {
				jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoParamFactuDescuento")) {
				jButtonCopiarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoParamFactuDescuento")) {
				jButtonVerFormTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoParamFactuDescuento")) {
				jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoParamFactuDescuento")) {
				jButtonCopiarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoParamFactuDescuento")) {
				jButtonVerFormTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoParamFactuDescuento")) {
				jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoParamFactuDescuento")) {
				jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoParamFactuDescuento")) {
				jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoParamFactuDescuento")) {
				jButtonRecargarInformacionTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoParamFactuDescuento")) {
				jButtonRecargarInformacionTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoParamFactuDescuento")) {
				jButtonRecargarInformacionTipoParamFactuDescuentoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoParamFactuDescuento")) {
				jButtonAnterioresTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoParamFactuDescuento")) {
				jButtonAnterioresTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoParamFactuDescuento")) {
				jButtonAnterioresTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoParamFactuDescuento")) {
				jButtonSiguientesTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoParamFactuDescuento")) {
				jButtonSiguientesTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoParamFactuDescuento")) {
				jButtonSiguientesTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoParamFactuDescuento") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoParamFactuDescuento")) {
				jButtonAbrirOrderByTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoParamFactuDescuento") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoParamFactuDescuento")) {
				jButtonMostrarOcultarTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParamFactuDescuento")) {
				jButtonNuevoGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoParamFactuDescuento")) {
				jButtonNuevoGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoParamFactuDescuento")) {
				jButtonNuevoGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoParamFactuDescuento")) {
				jButtonCerrarReporteDinamicoTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoParamFactuDescuento")) {
				jButtonGenerarReporteDinamicoTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoParamFactuDescuento")) {
				
				jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoParamFactuDescuento")) {
				jButtonCerrarImportacionTipoParamFactuDescuentoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoParamFactuDescuento")) {
				
				jButtonGenerarImportacionTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoParamFactuDescuento")) {
				
				jButtonAbrirImportacionTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoParamFactuDescuento")) {
				jComboBoxTiposAccionesTipoParamFactuDescuentoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoParamFactuDescuento")) {
				jComboBoxTiposRelacionesTipoParamFactuDescuentoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoParamFactuDescuento")) {
				jComboBoxTiposAccionesTipoParamFactuDescuentoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoParamFactuDescuento")) {
				
				jComboBoxTiposSeleccionarTipoParamFactuDescuentoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoParamFactuDescuento")) {
				jTextFieldValorCampoGeneralTipoParamFactuDescuentoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoParamFactuDescuento")) {
				jButtonAbrirOrderByTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoParamFactuDescuento")) {
				jButtonAbrirOrderByTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoParamFactuDescuento")) {
				jButtonCerrarOrderByTipoParamFactuDescuentoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParamFactuDescuentoBusqueda")) {
				this.jButtonidTipoParamFactuDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParamFactuDescuentoBusqueda")) {
				this.jButtonnombreTipoParamFactuDescuentoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorNombreTipoParamFactuDescuento")) {
				this.jButtonBusquedaPorNombreTipoParamFactuDescuentoActionPerformed(evt);
			}
			
			;
			
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoParamFactuDescuento();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				


				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoParamFactuDescuento tipoparamfactudescuentoLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipoparamfactudescuentoLocal=this.tipoparamfactudescuento;
			} else {
				tipoparamfactudescuentoLocal=this.tipoparamfactudescuentoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
							
				
				


				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
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
			
			


			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
								
						
				


				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
								
				
				


				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
							
				
				


				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
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
			
			


			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
								
				
				


				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoParamFactuDescuento")) {
					jCheckBoxSeleccionarTodosTipoParamFactuDescuentoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoParamFactuDescuento")) {
					jCheckBoxSeleccionadosTipoParamFactuDescuentoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoParamFactuDescuento")) {
					
				}
				
				


				
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
												
				
				


				
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
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
			
			


			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipoparamfactudescuento);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipoparamfactudescuento);
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
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
				
				


				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoParamFactuDescuento.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoParamFactuDescuento.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoParamFactuDescuentoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipoparamfactudescuentoAnterior =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoParamFactuDescuento")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoParamFactuDescuentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoParamFactuDescuento.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipoparamfactudescuento =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipoparamfactudescuento);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoParamFactuDescuento")) {
				
				}
				
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoParamFactuDescuento")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoParamFactuDescuento.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoParamFactuDescuento")) {
			
			}
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoParamFactuDescuento();
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
			if(sTipo.equals("NuevoTipoParamFactuDescuento")) {
				jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoParamFactuDescuento")) {
				jButtonDuplicarTipoParamFactuDescuentoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoParamFactuDescuento")) {
				jButtonCopiarTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoParamFactuDescuento")) {
				jButtonVerFormTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoParamFactuDescuento")) {
				jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoParamFactuDescuento")) {
				jButtonModificarTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoParamFactuDescuento")) {
				jButtonActualizarTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoParamFactuDescuento")) {
				jButtonEliminarTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoParamFactuDescuento")) {
				jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoParamFactuDescuento")) {
				jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoParamFactuDescuento")) {
				jButtonCerrarTipoParamFactuDescuentoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoParamFactuDescuento")) {
				jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoParamFactuDescuento")) {
				jButtonNuevoGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoParamFactuDescuento")) {
				jButtonAbrirOrderByTipoParamFactuDescuentoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoParamFactuDescuento")) {
				jButtonRecargarInformacionTipoParamFactuDescuentoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoParamFactuDescuento")) {
				jButtonAnterioresTipoParamFactuDescuentoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoParamFactuDescuento")) {
				jButtonSiguientesTipoParamFactuDescuentoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoParamFactuDescuentoBusqueda")) {
				this.jButtonidTipoParamFactuDescuentoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoParamFactuDescuentoBusqueda")) {
				this.jButtonnombreTipoParamFactuDescuentoBusquedaActionPerformed(evt);
			}
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoParamFactuDescuento();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoParamFactuDescuento")) {
				closingInternalFrameTipoParamFactuDescuento();
				
			} else if(sTipo.equals("jButtonCancelarTipoParamFactuDescuento")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoParamFactuDescuento = (JInternalFrameBase)evt.getSource();
	            	
	            TipoParamFactuDescuentoBeanSwingJInternalFrame jInternalFrameParent=(TipoParamFactuDescuentoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParamFactuDescuento.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoParamFactuDescuentoActionPerformed(null);
			}
			
			TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipoparamfactudescuento,new Object(),this.tipoparamfactudescuentoParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoParamFactuDescuento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoParamFactuDescuento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoParamFactuDescuento(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipoparamfactudescuento)) {
			if(!esControlTabla) {
				if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(this.tipoparamfactudescuento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);			
				}
				
				if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoParamFactuDescuento(this.tipoparamfactudescuento,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparamfactudescuentoReturnGeneral=tipoparamfactudescuentoLogic.procesarEventosTipoParamFactuDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos(),this.tipoparamfactudescuento,this.tipoparamfactudescuentoParameterGeneral,this.isEsNuevoTipoParamFactuDescuento,classes);//this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoParamFactuDescuento(this.tipoparamfactudescuentoReturnGeneral,this.tipoparamfactudescuentoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoParamFactuDescuento(classes,this.tipoparamfactudescuentoReturnGeneral,this.tipoparamfactudescuentoBean,false);
					}
						
					if(this.tipoparamfactudescuentoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoParamFactuDescuento(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoParamFactuDescuento(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento());	
					}
						
					if(this.tipoparamfactudescuentoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuDescuento(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento(),classes);//this.tipoparamfactudescuentoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoParamFactuDescuento(this.tipoparamfactudescuento,classes);//this.tipoparamfactudescuentoBean);									
				}
			
				if(TipoParamFactuDescuentoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoParamFactuDescuento(this.tipoparamfactudescuento,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoParamFactuDescuento(this.tipoparamfactudescuento);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipoparamfactudescuentoAnterior!=null) {
						this.tipoparamfactudescuento=this.tipoparamfactudescuentoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipoparamfactudescuentoReturnGeneral=tipoparamfactudescuentoLogic.procesarEventosTipoParamFactuDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos(),this.tipoparamfactudescuento,this.tipoparamfactudescuentoParameterGeneral,this.isEsNuevoTipoParamFactuDescuento,classes);//this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuento()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipoparamfactudescuentoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento(),tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento(),this.tipoparamfactudescuentos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoParamFactuDescuento.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoParamFactuDescuento.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoParamFactuDescuento();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoParamFactuDescuento() throws Exception {
		
		TipoParamFactuDescuentoModel tipoparamfactudescuentoModel=(TipoParamFactuDescuentoModel)this.jTableDatosTipoParamFactuDescuento.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipoparamfactudescuentoModel.tipoparamfactudescuentos=this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipoparamfactudescuentoModel.tipoparamfactudescuentos=this.tipoparamfactudescuentos;
		}
		
		
		((TipoParamFactuDescuentoModel) this.jTableDatosTipoParamFactuDescuento.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoParamFactuDescuento() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipoparamfactudescuentoAnterior(),this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipoparamfactudescuentoAnterior(),this.tipoparamfactudescuentos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoParamFactuDescuento();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
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
										
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactudescuento,new Object(),generalEntityParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoParamFactuDescuentoConstantesFunciones.getClassesRelationshipsOfTipoParamFactuDescuento(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoParamFactuDescuentoConstantesFunciones.getClassesRelationshipsFromStringsOfTipoParamFactuDescuento(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoParamFactuDescuento(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipoparamfactudescuento,new Object(),generalEntityParameterGeneral,this.tipoparamfactudescuentoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoParamFactuDescuento(TipoParamFactuDescuentoBean tipoparamfactudescuentoBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoParamFactuDescuento(ArrayList<Classe> classes,TipoParamFactuDescuentoReturnGeneral tipoparamfactudescuentoReturnGeneral,TipoParamFactuDescuentoBean tipoparamfactudescuentoBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.tipoparamfactudescuento)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento = new TipoParamFactuDescuentoDetalleFormJInternalFrame(jDesktopPane,this.tipoparamfactudescuentoSessionBean.getConGuardarRelaciones(),this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoParamFactuDescuento);
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.setVisible(false);
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.tipoparamfactudescuentoLogic=this.tipoparamfactudescuentoLogic;
		
		this.cargarCombosFrameForeignKeyTipoParamFactuDescuento("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoParamFactuDescuento();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoParamFactuDescuento();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoParamFactuDescuento("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoParamFactuDescuento();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParamFactuDescuento"));
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonModificarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"ModificarTipoParamFactuDescuento"));

		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonModificarToolBarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParamFactuDescuento"));
					
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemModificarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParamFactuDescuento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"ActualizarTipoParamFactuDescuento"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarToolBarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParamFactuDescuento"));
						
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemActualizarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParamFactuDescuento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"EliminarTipoParamFactuDescuento"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParamFactuDescuento"));
								
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemEliminarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParamFactuDescuento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"CancelarTipoParamFactuDescuento"));
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParamFactuDescuento"));
					
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemCancelarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParamFactuDescuento"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemDetalleCerrarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParamFactuDescuento"));		
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuDescuento"));
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuDescuento"));
		
		
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParamFactuDescuento"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonidTipoParamFactuDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonnombreTipoParamFactuDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuDescuentoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTabbedPaneRelacionesTipoParamFactuDescuento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParamFactuDescuento"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoParamFactuDescuento"));
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoParamFactuDescuento"));
		}
		
		this.jTableDatosTipoParamFactuDescuento.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoParamFactuDescuento"));
		
		this.jTableDatosTipoParamFactuDescuento.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoParamFactuDescuento"));
		
		this.jButtonNuevoTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"NuevoTipoParamFactuDescuento"));
		
		this.jButtonDuplicarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"DuplicarTipoParamFactuDescuento"));
		
		this.jButtonCopiarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"CopiarTipoParamFactuDescuento"));
		
		this.jButtonVerFormTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"VerFormTipoParamFactuDescuento"));
		
		
		this.jButtonNuevoToolBarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoParamFactuDescuento"));
			
		this.jButtonDuplicarToolBarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoParamFactuDescuento"));
			
		this.jMenuItemNuevoTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoParamFactuDescuento"));
			
		this.jMenuItemDuplicarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoParamFactuDescuento"));		
		
		
		this.jButtonNuevoRelacionesTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoParamFactuDescuento"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoParamFactuDescuento"));
			
		this.jMenuItemNuevoRelacionesTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoParamFactuDescuento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonModificarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"ModificarTipoParamFactuDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonModificarToolBarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoParamFactuDescuento"));
			
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemModificarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoParamFactuDescuento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"ActualizarTipoParamFactuDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonActualizarToolBarTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoParamFactuDescuento"));
				
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemActualizarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoParamFactuDescuento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"EliminarTipoParamFactuDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonEliminarToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoParamFactuDescuento"));
						
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemEliminarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoParamFactuDescuento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"CancelarTipoParamFactuDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonCancelarToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoParamFactuDescuento"));
			
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemCancelarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoParamFactuDescuento"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoParamFactuDescuento"));		
		
		
		this.jButtonCerrarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"CerrarTipoParamFactuDescuento"));
		
		
		this.jButtonCerrarToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoParamFactuDescuento"));
			
		this.jMenuItemCerrarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoParamFactuDescuento"));
			
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jMenuItemDetalleCerrarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoParamFactuDescuento"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoParamFactuDescuento"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoParamFactuDescuento"));
		}
		
		this.jButtonCopiarToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoParamFactuDescuento"));
			
		this.jButtonVerFormToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoParamFactuDescuento"));
		
		this.jMenuItemGuardarCambiosTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoParamFactuDescuento"));
			
		this.jMenuItemCopiarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoParamFactuDescuento"));		
		
		this.jMenuItemVerFormTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoParamFactuDescuento"));		
		
		
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParamFactuDescuento"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoParamFactuDescuento"));
			
		this.jMenuItemGuardarCambiosTablaTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoParamFactuDescuento"));		
		
		
		
		this.jButtonRecargarInformacionTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoParamFactuDescuento"));
					
		this.jButtonRecargarInformacionToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoParamFactuDescuento"));
		
		this.jMenuItemRecargarInformacionTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoParamFactuDescuento"));		
		
		
		
		this.jButtonAnterioresTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"AnterioresTipoParamFactuDescuento"));
		
		
		this.jButtonAnterioresToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoParamFactuDescuento"));
		
		this.jMenuItemAnterioresTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoParamFactuDescuento"));		
		
		
		this.jButtonSiguientesTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"SiguientesTipoParamFactuDescuento"));
		
		
		this.jButtonSiguientesToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoParamFactuDescuento"));
			
		this.jMenuItemSiguientesTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoParamFactuDescuento"));
			
		this.jMenuItemAbrirOrderByTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoParamFactuDescuento"));
			
		this.jMenuItemMostrarOcultarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoParamFactuDescuento"));
			
		this.jMenuItemDetalleAbrirOrderByTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoParamFactuDescuento"));
			
		this.jMenuItemDetalleMostarOcultarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoParamFactuDescuento"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoParamFactuDescuento"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoParamFactuDescuento"));
			
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoParamFactuDescuento"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoParamFactuDescuento"));

		this.jCheckBoxSeleccionadosTipoParamFactuDescuento.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoParamFactuDescuento"));
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoParamFactuDescuento"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoParamFactuDescuento"));
			
		this.jComboBoxTiposAccionesTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoParamFactuDescuento"));
					
		this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoParamFactuDescuento"));
			
		this.jTextFieldValorCampoGeneralTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoParamFactuDescuento"));		
		
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonidTipoParamFactuDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonnombreTipoParamFactuDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuDescuentoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorNombreTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoParamFactuDescuento"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoParamFactuDescuento!=null) {
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuDescuento"));
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuDescuento"));
				this.jInternalFrameReporteDinamicoTipoParamFactuDescuento.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuDescuento"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoParamFactuDescuento"));				
			//this.jButtonGenerarReporteDinamicoTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoParamFactuDescuento"));
			//this.jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoParamFactuDescuento"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoParamFactuDescuento!=null) {
				this.jInternalFrameImportacionTipoParamFactuDescuento.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoParamFactuDescuento"));
				this.jInternalFrameImportacionTipoParamFactuDescuento.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoParamFactuDescuento"));
				this.jInternalFrameImportacionTipoParamFactuDescuento.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoParamFactuDescuento"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoParamFactuDescuento"));
			
			this.jButtonAbrirOrderByToolBarTipoParamFactuDescuento.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoParamFactuDescuento"));			
			
			if(this.jInternalFrameOrderByTipoParamFactuDescuento!=null) {
				this.jInternalFrameOrderByTipoParamFactuDescuento.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoParamFactuDescuento"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTabbedPaneRelacionesTipoParamFactuDescuento.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoParamFactuDescuento"));
		
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
            		closingInternalFrameTipoParamFactuDescuento();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoParamFactuDescuento = (JInternalFrameBase)event.getSource();
	            	
	            TipoParamFactuDescuentoBeanSwingJInternalFrame jInternalFrameParent=(TipoParamFactuDescuentoBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoParamFactuDescuento.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoParamFactuDescuentoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoParamFactuDescuento.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoParamFactuDescuentoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoParamFactuDescuento.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoParamFactuDescuento.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoParamFactuDescuento";
		inputMap = this.jButtonNuevoTipoParamFactuDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoParamFactuDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoParamFactuDescuento";
		inputMap = this.jButtonNuevoRelacionesTipoParamFactuDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoParamFactuDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoParamFactuDescuentoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoParamFactuDescuento";
		inputMap = this.jButtonModificarTipoParamFactuDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoParamFactuDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoParamFactuDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoParamFactuDescuento";
		inputMap = this.jButtonActualizarTipoParamFactuDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoParamFactuDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoParamFactuDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoParamFactuDescuento";
		inputMap = this.jButtonEliminarTipoParamFactuDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoParamFactuDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoParamFactuDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoParamFactuDescuento";
		inputMap = this.jButtonCancelarTipoParamFactuDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoParamFactuDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoParamFactuDescuento";
		inputMap = this.jButtonCerrarTipoParamFactuDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoParamFactuDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoParamFactuDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoParamFactuDescuento";
		inputMap = this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosTipoParamFactuDescuento.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonGuardarCambiosTipoParamFactuDescuento.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoParamFactuDescuento.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoParamFactuDescuentoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoParamFactuDescuento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoParamFactuDescuentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoParamFactuDescuentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoParamFactuDescuento.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoParamFactuDescuentoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonidTipoParamFactuDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"idTipoParamFactuDescuentoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jButtonnombreTipoParamFactuDescuentoBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoParamFactuDescuentoBusqueda"));
		
		
		this.jButtonBusquedaPorNombreTipoParamFactuDescuento.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreTipoParamFactuDescuento"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoParamFactuDescuento.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoParamFactuDescuentoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoParamFactuDescuentoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoParamFactuDescuento.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoParamFactuDescuento(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
					tipoparamfactudescuentoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentos) {
					tipoparamfactudescuentoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoParamFactuDescuentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParamFactuDescuento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
						tipoparamfactudescuentoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentos) {
						tipoparamfactudescuentoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParamFactuDescuento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParamFactuDescuento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuDescuento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoParamFactuDescuentoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoParamFactuDescuento(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoParamFactuDescuento.getSelectedRows();
			
			TipoParamFactuDescuento tipoparamfactudescuentoLocal=new TipoParamFactuDescuento();
			
			//this.seleccionarTodosTipoParamFactuDescuento(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoparamfactudescuentoLocal =(TipoParamFactuDescuento) this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos().toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipoparamfactudescuentoLocal =(TipoParamFactuDescuento) this.tipoparamfactudescuentos.toArray()[this.jTableDatosTipoParamFactuDescuento.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipoparamfactudescuentoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
						tipoparamfactudescuentoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentos) {
						tipoparamfactudescuentoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoParamFactuDescuento.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoParamFactuDescuento.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoParamFactuDescuento,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoParamFactuDescuentoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoParamFactuDescuentoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoParamFactuDescuentoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoParamFactuDescuento(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoParamFactuDescuento.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
				
						if(sTipoSeleccionar.equals(TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparamfactudescuentoAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentos) {
					
						if(sTipoSeleccionar.equals(TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipoparamfactudescuentoAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoParamFactuDescuentoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoParamFactuDescuento(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoParamFactuDescuento=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoParamFactuDescuento.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoParamFactuDescuento) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoParamFactuDescuento(conSplash);
				
					this.generarReporteTipoParamFactuDescuentosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoParamFactuDescuentosSeleccionados();
				//this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParamFactuDescuentosSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoParamFactuDescuentosSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParamFactuDescuento();
				
				this.exportarTipoParamFactuDescuentosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoParamFactuDescuentos();
				//this.importarTipoParamFactuDescuentos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoParamFactuDescuento();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoParamFactuDescuentosSeleccionados();
				//this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Descuento", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoParamFactuDescuento();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoParamFactuDescuento)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoParamFactuDescuento(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setSelectedIndex(0);					
				}	
			} 			
			else if(TipoParamFactuDescuentoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTipoParamFactuDescuento) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTipoParamFactuDescuento(conSplash);
					
						//this.actualizarParametrosGeneralTipoParamFactuDescuento();
						
						this.generarReporteProcesoAccionTipoParamFactuDescuentosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Tipo DescuentoS SELECCIONADOS?", "MANTENIMIENTO DE Tipo Descuento", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTipoParamFactuDescuento();
				
						this.actualizarParametrosGeneralTipoParamFactuDescuento();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.tipoparamfactudescuentoReturnGeneral=tipoparamfactudescuentoLogic.procesarAccionTipoParamFactuDescuentosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos(),this.tipoparamfactudescuentoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTipoParamFactuDescuentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoParamFactuDescuento();
					
					TipoParamFactuDescuentoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTipoParamFactuDescuentoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTipoParamFactuDescuento.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTipoParamFactuDescuento.jComboBoxTiposAccionesFormularioTipoParamFactuDescuento.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoParamFactuDescuento(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoParamFactuDescuentoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoParamFactuDescuento();
			
			if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();		
			TipoParamFactuDescuento tipoparamfactudescuento=new TipoParamFactuDescuento();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoParamFactuDescuento(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoParamFactuDescuento.getSelectedItem();
			
			
			
			
			tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipoparamfactudescuentosSeleccionados.size()==1) {
				for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentosSeleccionados) {
					tipoparamfactudescuento=tipoparamfactudescuentoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoParamFactuDescuento();
			
      		//this.finishProcessTipoParamFactuDescuento(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoParamFactuDescuentoReturnGeneral() throws Exception {
		if(this.tipoparamfactudescuentoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipoparamfactudescuentoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipoparamfactudescuentoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipoparamfactudescuentoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipoparamfactudescuentoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipoparamfactudescuentoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoParamFactuDescuento(false);
		}
		
		if(this.tipoparamfactudescuentoReturnGeneral.getConRetornoLista() || this.tipoparamfactudescuentoReturnGeneral.getConRetornoObjeto()) {
			if(this.tipoparamfactudescuentoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparamfactudescuentoLogic.setTipoParamFactuDescuentos(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuentos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipoparamfactudescuentoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipoparamfactudescuentoLogic.setTipoParamFactuDescuento(this.tipoparamfactudescuentoReturnGeneral.getTipoParamFactuDescuento());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoParamFactuDescuento(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoParamFactuDescuento() throws Exception {
		
		
	}
	
	public ArrayList<TipoParamFactuDescuento> getTipoParamFactuDescuentosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoParamFactuDescuento) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos()) {
					if(tipoparamfactudescuentoAux.getIsSelected()) {
						tipoparamfactudescuentosSeleccionados.add(tipoparamfactudescuentoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoParamFactuDescuento tipoparamfactudescuentoAux:this.tipoparamfactudescuentos) {
					if(tipoparamfactudescuentoAux.getIsSelected()) {
						tipoparamfactudescuentosSeleccionados.add(tipoparamfactudescuentoAux);				
					}
				}
			}
			
			if(tipoparamfactudescuentosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipoparamfactudescuentosSeleccionados.addAll(this.tipoparamfactudescuentoLogic.getTipoParamFactuDescuentos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipoparamfactudescuentosSeleccionados.addAll(this.tipoparamfactudescuentos);				
					}
				}
			}
		} else {
			tipoparamfactudescuentosSeleccionados.add(this.tipoparamfactudescuento);
		}
		
		return tipoparamfactudescuentosSeleccionados;
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
	
	public void generarReporteTipoParamFactuDescuentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoParamFactuDescuentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoParamFactuDescuentosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParamFactuDescuentosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoParamFactuDescuentosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Descuento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoParamFactuDescuentosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();		
		
		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoParamFactuDescuentos("Todos",tipoparamfactudescuentosSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoParamFactuDescuentosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();		
		
		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoParamFactuDescuentos("Todos",tipoparamfactudescuentosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoParamFactuDescuentosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();
		
		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoParamFactuDescuentos("Todos",tipoparamfactudescuentosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoParamFactuDescuentosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoParamFactuDescuento();
		
		
		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoParamFactuDescuento();
		
		
		//this.generarReporteTipoParamFactuDescuentos("Todos",tipoparamfactudescuentosSeleccionados ,tipoparamfactudescuentoImplementable,tipoparamfactudescuentoImplementableHome);
	}
	
	public void mostrarImportacionTipoParamFactuDescuentos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoParamFactuDescuento();
		
		this.abrirFrameImportacionTipoParamFactuDescuento();		
		
			
		//this.generarReporteTipoParamFactuDescuentos("Todos",tipoparamfactudescuentosSeleccionados ,tipoparamfactudescuentoImplementable,tipoparamfactudescuentoImplementableHome);
	}
	
	public void importarTipoParamFactuDescuentos() throws Exception {		
	
	}
	
	public void exportarTipoParamFactuDescuentosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoParamFactuDescuentosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoParamFactuDescuentosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoParamFactuDescuentosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Descuento",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoParamFactuDescuentosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();		
		
		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactudescuento."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoParamFactuDescuento(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoParamFactuDescuento(tipoparamfactudescuentoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipoparamfactudescuentoAux.setsDetalleGeneralEntityReporte(tipoparamfactudescuentoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoParamFactuDescuento(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoParamFactuDescuentoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParamFactuDescuentoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipoparamfactudescuento.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparamfactudescuento.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipoparamfactudescuento.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoParamFactuDescuentosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();		
		
		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactudescuento.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoParamFactuDescuentos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoParamFactuDescuento(row);				
				iRow++;
			}				
			
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoParamFactuDescuento(tipoparamfactudescuentoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoParamFactuDescuentosSeleccionados() throws Exception {
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();		
		
		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipoparamfactudescuento.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipoparamfactudescuentos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipoparamfactudescuento");
			//elementRoot.appendChild(element);
		
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentosSeleccionados) {
				element = document.createElement("tipoparamfactudescuento");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoParamFactuDescuento(tipoparamfactudescuentoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Descuento",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoParamFactuDescuento(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuDescuentoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuDescuentoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparamfactudescuento.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipoparamfactudescuento.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoParamFactuDescuento(TipoParamFactuDescuento tipoparamfactudescuento,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoParamFactuDescuentoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipoparamfactudescuento.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoParamFactuDescuentoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipoparamfactudescuento.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementnombre = document.createElement(TipoParamFactuDescuentoConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipoparamfactudescuento.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoParamFactuDescuentosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados=new ArrayList<TipoParamFactuDescuento>();
		
		tipoparamfactudescuentosSeleccionados=this.getTipoParamFactuDescuentosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoParamFactuDescuento(tipoparamfactudescuentosSeleccionados);
		
		this.generarReporteTipoParamFactuDescuentos("Todos",tipoparamfactudescuentosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoParamFactuDescuento(ArrayList<TipoParamFactuDescuento> tipoparamfactudescuentosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoParamFactuDescuento tipoparamfactudescuentoAux:tipoparamfactudescuentosSeleccionados) {
				tipoparamfactudescuentoAux.setsDetalleGeneralEntityReporte(tipoparamfactudescuentoAux.toString());
			
				if(sTipoSeleccionar.equals(TipoParamFactuDescuentoConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipoparamfactudescuentoAux.setsDescripcionGeneralEntityReporte1(tipoparamfactudescuentoAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoParamFactuDescuentoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoParamFactuDescuento(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=true;
				this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=true;
			}
			
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaModificarTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaCancelarTipoParamFactuDescuento=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoParamFactuDescuento=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoParamFactuDescuentoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=true;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=true;
		} else {
			this.actualizarEstadoPanelsTipoParamFactuDescuento(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoParamFactuDescuento=false;
			//this.isVisibilidadCeldaVerFormTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaDuplicarTipoParamFactuDescuento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaGuardarCambiosTipoParamFactuDescuento=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			if(!tipoparamfactudescuentoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;												
			}
			
			this.jButtonCerrarTipoParamFactuDescuento.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoParamFactuDescuento=false;
		}
		
		if(!this.permiteMantenimiento(this.tipoparamfactudescuento)) {
			this.isVisibilidadCeldaActualizarTipoParamFactuDescuento=false;
			this.isVisibilidadCeldaEliminarTipoParamFactuDescuento=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoParamFactuDescuento() {
	}
	
	public void actualizarEstadoPanelsTipoParamFactuDescuento(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuDescuento!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosTipoParamFactuDescuento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuDescuento!=null) {
				this.jPanelPaginacionTipoParamFactuDescuento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuDescuento!=null) {
				this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuDescuento!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosTipoParamFactuDescuento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuDescuento!=null) {
				this.jPanelPaginacionTipoParamFactuDescuento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuDescuento!=null) {
				this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuDescuento!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosTipoParamFactuDescuento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuDescuento!=null) {
				this.jPanelPaginacionTipoParamFactuDescuento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuDescuento!=null) {
				this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuDescuento!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosTipoParamFactuDescuento.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoParamFactuDescuento!=null) {
				this.jPanelPaginacionTipoParamFactuDescuento.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuDescuento!=null) {
				this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuDescuento!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosTipoParamFactuDescuento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuDescuento!=null) {
				this.jPanelPaginacionTipoParamFactuDescuento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuDescuento!=null) {
				this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuDescuento!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosTipoParamFactuDescuento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuDescuento!=null) {
				this.jPanelPaginacionTipoParamFactuDescuento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuDescuento!=null) {
				this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosEdicionTipoParamFactuDescuento.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuDescuento!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoParamFactuDescuento!=null) {
				this.jScrollPanelDatosTipoParamFactuDescuento.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoParamFactuDescuento!=null) {
				this.jPanelPaginacionTipoParamFactuDescuento.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuDescuento!=null) {
				this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTipoParamFactuDescuento!=null) {
					this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuDescuento!=null) {
				this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.tipoparamfactudescuentoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTipoParamFactuDescuento!=null) {
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTipoParamFactuDescuento!=null) {
				this.jPanelParametrosReportesTipoParamFactuDescuento.setVisible(true);
			}
		}
	}	
	
	
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoParamFactuDescuentoSessionBean tipoparamfactudescuentoSessionBean=new TipoParamFactuDescuentoSessionBean();
		
		if(this.tipoparamfactudescuentoSessionBean==null) {
			this.tipoparamfactudescuentoSessionBean=new TipoParamFactuDescuentoSessionBean();
		}
		
		this.tipoparamfactudescuentoSessionBean.setsUltimaBusquedaTipoParamFactuDescuento(this.getsAccionBusqueda());
		this.tipoparamfactudescuentoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipoparamfactudescuentoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			tipoparamfactudescuentoSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoParamFactuDescuentoSessionBean tipoparamfactudescuentoSessionBean=new TipoParamFactuDescuentoSessionBean();
		
		if(this.tipoparamfactudescuentoSessionBean==null) {
			this.tipoparamfactudescuentoSessionBean=new TipoParamFactuDescuentoSessionBean();
		}
		
		if(this.tipoparamfactudescuentoSessionBean.getsUltimaBusquedaTipoParamFactuDescuento()!=null&&!this.tipoparamfactudescuentoSessionBean.getsUltimaBusquedaTipoParamFactuDescuento().equals("")) {
			this.setsAccionBusqueda(tipoparamfactudescuentoSessionBean.getsUltimaBusquedaTipoParamFactuDescuento());
			this.setiNumeroPaginacion(tipoparamfactudescuentoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipoparamfactudescuentoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(tipoparamfactudescuentoSessionBean.getnombre());
				tipoparamfactudescuentoSessionBean.setnombre("");
			}
		}
		
		this.tipoparamfactudescuentoSessionBean.setsUltimaBusquedaTipoParamFactuDescuento("");
		this.tipoparamfactudescuentoSessionBean.setiNumeroPaginacion(TipoParamFactuDescuentoConstantesFunciones.INUMEROPAGINACION);
		this.tipoparamfactudescuentoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoParamFactuDescuento(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoParamFactuDescuento() {
		this.updateBorderResaltarBusquedasFormularioTipoParamFactuDescuento();
		this.updateVisibilidadBusquedasFormularioTipoParamFactuDescuento();
		this.updateHabilitarBusquedasFormularioTipoParamFactuDescuento();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoParamFactuDescuento() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTipoParamFactuDescuento.getComponents().length>0) {
	

		if(this.tipoparamfactudescuentoConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuDescuento!=null) {
			index= this.jTabbedPaneBusquedasTipoParamFactuDescuento.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuDescuento);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuDescuento.getComponent(index);
				jPanel.setBorder(this.tipoparamfactudescuentoConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuDescuento);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTipoParamFactuDescuento() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTipoParamFactuDescuento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoParamFactuDescuento.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuDescuento);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuDescuento.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.tipoparamfactudescuentoConstantesFunciones.mostrarBusquedaPorNombreTipoParamFactuDescuento);
			if(!this.tipoparamfactudescuentoConstantesFunciones.mostrarBusquedaPorNombreTipoParamFactuDescuento && index>-1) {
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTipoParamFactuDescuento() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTipoParamFactuDescuento.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTipoParamFactuDescuento.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuDescuento);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuDescuento.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.tipoparamfactudescuentoConstantesFunciones.activarBusquedaPorNombreTipoParamFactuDescuento);
				this.jTabbedPaneBusquedasTipoParamFactuDescuento.setEnabledAt(index,this.tipoparamfactudescuentoConstantesFunciones.activarBusquedaPorNombreTipoParamFactuDescuento);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTipoParamFactuDescuento(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasTipoParamFactuDescuento.indexOfComponent(this.jPanelBusquedaPorNombreTipoParamFactuDescuento);

			this.jTabbedPaneBusquedasTipoParamFactuDescuento.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTipoParamFactuDescuento.getComponent(index);

			this.tipoparamfactudescuentoConstantesFunciones.setResaltarBusquedaPorNombreTipoParamFactuDescuento(resaltar);

			jPanel.setBorder(this.tipoparamfactudescuentoConstantesFunciones.resaltarBusquedaPorNombreTipoParamFactuDescuento);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTipoParamFactuDescuento.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTipoParamFactuDescuento() throws Exception {

		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoParamFactuDescuento();
		this.updateVisibilidadResaltarControlesFormularioTipoParamFactuDescuento();
		this.updateHabilitarResaltarControlesFormularioTipoParamFactuDescuento();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoParamFactuDescuento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipoparamfactudescuentoConstantesFunciones.resaltaridTipoParamFactuDescuento!=null && this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.setBorder(this.tipoparamfactudescuentoConstantesFunciones.resaltaridTipoParamFactuDescuento);}
		if(this.tipoparamfactudescuentoConstantesFunciones.resaltarnombreTipoParamFactuDescuento!=null && this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextAreanombreTipoParamFactuDescuento.setBorder(this.tipoparamfactudescuentoConstantesFunciones.resaltarnombreTipoParamFactuDescuento);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoParamFactuDescuento() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
	
		//this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.setVisible(this.tipoparamfactudescuentoConstantesFunciones.mostraridTipoParamFactuDescuento);
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jPanelidTipoParamFactuDescuento.setVisible(this.tipoparamfactudescuentoConstantesFunciones.mostraridTipoParamFactuDescuento);
		//this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextAreanombreTipoParamFactuDescuento.setVisible(this.tipoparamfactudescuentoConstantesFunciones.mostrarnombreTipoParamFactuDescuento);
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jPanelnombreTipoParamFactuDescuento.setVisible(this.tipoparamfactudescuentoConstantesFunciones.mostrarnombreTipoParamFactuDescuento);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoParamFactuDescuento() throws Exception {
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoParamFactuDescuento!=null) {
	
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextFieldidTipoParamFactuDescuento.setEnabled(this.tipoparamfactudescuentoConstantesFunciones.activaridTipoParamFactuDescuento);
		this.jInternalFrameDetalleFormTipoParamFactuDescuento.jTextAreanombreTipoParamFactuDescuento.setEnabled(this.tipoparamfactudescuentoConstantesFunciones.activarnombreTipoParamFactuDescuento);
		}
	}
	
		
}