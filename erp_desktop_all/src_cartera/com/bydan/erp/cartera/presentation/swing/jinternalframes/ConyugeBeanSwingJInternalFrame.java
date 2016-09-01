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
package com.bydan.erp.cartera.presentation.swing.jinternalframes;




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

import com.bydan.erp.cartera.util.ConyugeConstantesFunciones;
import com.bydan.erp.cartera.util.ConyugeParameterReturnGeneral;
//import com.bydan.erp.cartera.util.ConyugeParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.ConyugeBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.cartera.resources.reportes.AuxiliarReportes;


import com.bydan.erp.cartera.util.*;
import com.bydan.erp.cartera.business.logic.*;


//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
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


import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;

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
public class ConyugeBeanSwingJInternalFrame extends ConyugeJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ConyugeBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Conyuge> conyugeValidator = new ClassValidator<Conyuge>(Conyuge.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Conyuge conyuge;	
	public Conyuge conyugeAux;
	public Conyuge conyugeAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Conyuge conyugeTotales;
	public Long idConyugeActual;
	public Long iIdNuevoConyuge=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

	public String sFinalQueryComboTipoIdentificacion="";

	public List<TipoIdentificacion> tipoidentificacionsForeignKey;

	public List<TipoIdentificacion> gettipoidentificacionsForeignKey() {
		return tipoidentificacionsForeignKey;
	}

	public void settipoidentificacionsForeignKey(List<TipoIdentificacion> tipoidentificacionsForeignKey) {
		this.tipoidentificacionsForeignKey = tipoidentificacionsForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoIdentificacion tipoidentificacionForeignKey;

	public TipoIdentificacion gettipoidentificacionForeignKey() {
		return tipoidentificacionForeignKey;
	}

	public void settipoidentificacionForeignKey(TipoIdentificacion tipoidentificacionForeignKey) {
		this.tipoidentificacionForeignKey = tipoidentificacionForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
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
	
	public Boolean isPermisoTodoConyuge;
	public Boolean isPermisoNuevoConyuge;
	public Boolean isPermisoActualizarConyuge;
	public Boolean isPermisoActualizarOriginalConyuge;
	public Boolean isPermisoEliminarConyuge;
	public Boolean isPermisoGuardarCambiosConyuge;
	public Boolean isPermisoConsultaConyuge;
	public Boolean isPermisoBusquedaConyuge;
	public Boolean isPermisoReporteConyuge;
	public Boolean isPermisoPaginacionMedioConyuge;
	public Boolean isPermisoPaginacionAltoConyuge;
	public Boolean isPermisoPaginacionTodoConyuge;
	public Boolean isPermisoCopiarConyuge;
	public Boolean isPermisoVerFormConyuge;
	public Boolean isPermisoDuplicarConyuge;
	public Boolean isPermisoOrdenConyuge;
	
	
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
	
	public ConyugeParameterReturnGeneral conyugeReturnGeneral;
	public ConyugeParameterReturnGeneral conyugeParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoConyuge=false;
	public Boolean esParaAccionDesdeFormularioConyuge=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ConyugeSessionBeanAdditional conyugeSessionBeanAdditional=null;
	
	public ConyugeSessionBeanAdditional getConyugeSessionBeanAdditional() {
		return this.conyugeSessionBeanAdditional;
	}
	
	public void setConyugeSessionBeanAdditional(ConyugeSessionBeanAdditional conyugeSessionBeanAdditional) {
		try {
			this.conyugeSessionBeanAdditional=conyugeSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ConyugeBeanSwingJInternalFrameAdditional conyugeBeanSwingJInternalFrameAdditional=null;
	//public class ConyugeBeanSwingJInternalFrame
	
	public ConyugeBeanSwingJInternalFrameAdditional getConyugeBeanSwingJInternalFrameAdditional() {
		return this.conyugeBeanSwingJInternalFrameAdditional;
	}
	
	public void setConyugeBeanSwingJInternalFrameAdditional(ConyugeBeanSwingJInternalFrameAdditional conyugeBeanSwingJInternalFrameAdditional) {
		try {
			this.conyugeBeanSwingJInternalFrameAdditional=conyugeBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ConyugeLogic conyugeLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Conyuge conyugeBean;
	public ConyugeConstantesFunciones conyugeConstantesFunciones;
	//public ConyugeParameterReturnGeneral conyugeReturnGeneral;
	
	//FK
	
	public ClienteLogic clienteLogic;
	public TipoIdentificacionLogic tipoidentificacionLogic;
	
	//PARAMETROS
	
	
	//public List<Conyuge> conyuges;	
	//public List<Conyuge> conyugesEliminados;
	//public List<Conyuge> conyugesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoConyuge=false;
	public Boolean isVisibilidadCeldaDuplicarConyuge=true;
	public Boolean isVisibilidadCeldaCopiarConyuge=true;
	public Boolean isVisibilidadCeldaVerFormConyuge=true;
	public Boolean isVisibilidadCeldaOrdenConyuge=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesConyuge=false;
	public Boolean isVisibilidadCeldaModificarConyuge=false;
	public Boolean isVisibilidadCeldaActualizarConyuge=false;
	public Boolean isVisibilidadCeldaEliminarConyuge=false;
	public Boolean isVisibilidadCeldaCancelarConyuge=false;
	public Boolean isVisibilidadCeldaGuardarConyuge=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosConyuge=false;	
	
	
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdValorIdentificacion=false;
	
	public Long getiIdNuevoConyuge() {
		return this.iIdNuevoConyuge;
	}

	public void setiIdNuevoConyuge(Long iIdNuevoConyuge) {
		this.iIdNuevoConyuge = iIdNuevoConyuge;
	}
	
	public Long getidConyugeActual() {
		return this.idConyugeActual;
	}

	public void setidConyugeActual(Long idConyugeActual) {
		this.idConyugeActual = idConyugeActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Conyuge getconyuge() {
		return this.conyuge;
	}

	public void setconyuge(Conyuge conyuge) {
		this.conyuge = conyuge;
	}
	
	public Conyuge getconyugeAux() {
		return this.conyugeAux;
	}

	public void setconyugeAux(Conyuge conyugeAux) {
		this.conyugeAux = conyugeAux;
	}				
	
	public Conyuge getconyugeAnterior() {
		return this.conyugeAnterior;
	}

	public void setconyugeAnterior(Conyuge conyugeAnterior) {
		this.conyugeAnterior = conyugeAnterior;
	}	
	
	public Conyuge getconyugeTotales() {
		return this.conyugeTotales;
	}

	public void setconyugeTotales(Conyuge conyugeTotales) {
		this.conyugeTotales = conyugeTotales;
	}	
	
	public Conyuge getconyugeBean() {
		return this.conyugeBean;
	}

	public void setconyugeBean(Conyuge conyugeBean) {
		this.conyugeBean = conyugeBean;
	}	
	
	public ConyugeParameterReturnGeneral getconyugeReturnGeneral() {
		return this.conyugeReturnGeneral;
	}

	public void setconyugeReturnGeneral(ConyugeParameterReturnGeneral conyugeReturnGeneral) {
		this.conyugeReturnGeneral = conyugeReturnGeneral;
	}	
	
	
	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long idvaloridentificacionFK_IdValorIdentificacion=-1L;

	public Long getidvaloridentificacionFK_IdValorIdentificacion() {
		return this.idvaloridentificacionFK_IdValorIdentificacion;
	}

	public void setidvaloridentificacionFK_IdValorIdentificacion(Long idvaloridentificacionFK_IdValorIdentificacion) {
		this.idvaloridentificacionFK_IdValorIdentificacion = idvaloridentificacionFK_IdValorIdentificacion;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public ConyugeLogic getConyugeLogic()	{		
		return conyugeLogic;
	}

	public void setConyugeLogic(ConyugeLogic conyugeLogic) {
		this.conyugeLogic = conyugeLogic;
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
	
	public Boolean getIsEsNuevoConyuge() {
		return isEsNuevoConyuge;
	}

	public void setIsEsNuevoConyuge(Boolean isEsNuevoConyuge) {
		this.isEsNuevoConyuge = isEsNuevoConyuge;
	}

	public Boolean getEsParaAccionDesdeFormularioConyuge() {
		return esParaAccionDesdeFormularioConyuge;
	}
	
	public void setEsParaAccionDesdeFormularioConyuge(Boolean esParaAccionDesdeFormularioConyuge) {
		this.esParaAccionDesdeFormularioConyuge = esParaAccionDesdeFormularioConyuge;
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
	
	
	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.conyugeSessionBean==null) {
				this.conyugeSessionBean=new ConyugeSessionBean();
			}

			if(!this.conyugeSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(conyugeSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
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

	public void cargarCombosTipoIdentificacionsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoIdentificacionLogic tipoidentificacionLogic=new TipoIdentificacionLogic();

			tipoidentificacionLogic.getTipoIdentificacionDataAccess().setIsForForeingKeyData(true);

			if(this.conyugeSessionBean==null) {
				this.conyugeSessionBean=new ConyugeSessionBean();
			}

			if(!this.conyugeSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLogic.getTipoIdentificacionDataAccess().setIsForForeingKeyData(true);

					tipoidentificacionLogic.getTodosTipoIdentificacionsWithConnection(sFinalQuery,new Pagination());

					this.tipoidentificacionsForeignKey=tipoidentificacionLogic.getTipoIdentificacions();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoIdentificacion(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoidentificacionLogic.getEntityWithConnection(conyugeSessionBean.getlidTipoIdentificacionActual());
					this.tipoidentificacionsForeignKey.add(tipoidentificacionLogic.getTipoIdentificacion());
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

	
	
	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.conyuge!=null) {
						this.conyuge.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormConyuge!=null) {
						this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteConyuge.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormConyuge!=null) {
						if(this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.getItemCount()>0) {
							this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteConyuge!=null) {
						jComboBoxid_clienteFK_IdClienteConyuge.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteConyuge!=null) {
							//jComboBoxid_clienteFK_IdClienteConyuge.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteConyuge.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteConyuge.setSelectedIndex(0);
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

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteConyugeGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteConyugeGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteConyugeGenerico!=null && jComboBoxid_clienteConyugeGenerico.getItemCount()>0) {
					jComboBoxid_clienteConyugeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoIdentificacionForeignKey(Long idTipoIdentificacionSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoidentificacionTemp!=null) {

					if(this.conyuge!=null) {
						this.conyuge.setTipoIdentificacion(tipoidentificacionTemp);
					}

					if(this.jInternalFrameDetalleFormConyuge!=null) {
						this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.setSelectedItem(tipoidentificacionTemp);
					}
				} else {
					//jComboBoxidvaloridentificacionConyuge.setSelectedItem(tipoidentificacionTemp);
					if(this.jInternalFrameDetalleFormConyuge!=null) {
						if(this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.getItemCount()>0) {
							this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdValorIdentificacion") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoidentificacionTemp!=null && jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge!=null) {
						jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.setSelectedItem(tipoidentificacionTemp);
					} else {
						if(jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge!=null) {
							//jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.setSelectedItem(tipoidentificacionTemp);
							if(jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.getItemCount()>0) {
								jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.setSelectedIndex(0);
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

	public String getActualTipoIdentificacionForeignKeyDescripcion(Long idTipoIdentificacionSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}


			sDescripcion=TipoIdentificacionConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacionTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoIdentificacionForeignKeyGenerico(Long idTipoIdentificacionSeleccionado,JComboBox jComboBoxidvaloridentificacionConyugeGenerico)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionTemp=null;

			for(TipoIdentificacion tipoidentificacionAux:tipoidentificacionsForeignKey) {
				if(tipoidentificacionAux.getId()!=null && tipoidentificacionAux.getId().equals(idTipoIdentificacionSeleccionado)) {
					tipoidentificacionTemp=tipoidentificacionAux;
					break;
				}
			}

			if(tipoidentificacionTemp!=null) {
				jComboBoxidvaloridentificacionConyugeGenerico.setSelectedItem(tipoidentificacionTemp);
			} else {
				if(jComboBoxidvaloridentificacionConyugeGenerico!=null && jComboBoxidvaloridentificacionConyugeGenerico.getItemCount()>0) {
					jComboBoxidvaloridentificacionConyugeGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Conyuge conyuge,JComboBox jComboBoxid_clienteConyugeGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteConyugeGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteConyugeGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				conyuge.setid_cliente(clienteAux.getId());
				conyuge.setcliente_descripcion(ConyugeConstantesFunciones.getClienteDescripcion(clienteAux));
				conyuge.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoIdentificacionForeignKey(Conyuge conyuge,JComboBox jComboBoxidvaloridentificacionConyugeGenerico)throws Exception
	{
		try
		{
			TipoIdentificacion  tipoidentificacionAux=new TipoIdentificacion();

			if(jComboBoxidvaloridentificacionConyugeGenerico==null) {
				tipoidentificacionAux=(TipoIdentificacion)this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.getSelectedItem();
			} else {
				tipoidentificacionAux=(TipoIdentificacion)jComboBoxidvaloridentificacionConyugeGenerico.getSelectedItem();
			}

			if(tipoidentificacionAux!=null && tipoidentificacionAux.getId()!=null) {
				conyuge.setidvaloridentificacion(tipoidentificacionAux.getId());
				conyuge.settipoidentificacion_descripcion(ConyugeConstantesFunciones.getTipoIdentificacionDescripcion(tipoidentificacionAux));
				conyuge.setTipoIdentificacion(tipoidentificacionAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConyugeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConyuge!=null) { 
							this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConyuge!=null) { 
					}

					if(!ConyugeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConyugeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteConyuge.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteConyuge.addItem(cliente);
							}
						}

						if(!ConyugeJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoIdentificacionsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoIdentificacion=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ConyugeJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormConyuge!=null) { 
							this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.removeAllItems();

							for(TipoIdentificacion tipoidentificacion:this.tipoidentificacionsForeignKey) {
								this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.addItem(tipoidentificacion);
							}
						}
					}

					if(this.jInternalFrameDetalleFormConyuge!=null) { 
					}

					if(!ConyugeJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdValorIdentificacion") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!ConyugeJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.removeAllItems();

							for(TipoIdentificacion tipoidentificacion:this.tipoidentificacionsForeignKey) {
								this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.addItem(tipoidentificacion);
							}
						}

						if(!ConyugeJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConyuge!=null) {
							this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormConyuge!=null) {
							this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteConyuge.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteConyuge.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoIdentificacionForeignKey(TipoIdentificacion tipoidentificacion,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormConyuge!=null) {
							this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.setSelectedItem(tipoidentificacion);
						}
					} else {
						if(this.jInternalFrameDetalleFormConyuge!=null) {
							this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.setSelectedItem(tipoidentificacion);
						} else {
							this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesConyuge() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ConyugeConstantesFunciones.refrescarForeignKeysDescripcionesConyuge(this.conyugeLogic.getConyuges());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ConyugeConstantesFunciones.refrescarForeignKeysDescripcionesConyuge(this.conyuges);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Cliente.class));
		classes.add(new Classe(TipoIdentificacion.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//conyugeLogic.setConyuges(this.conyuges);
			conyugeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ConyugeParameterReturnGeneral getConyugeParameterGeneral() {
		return this.conyugeParameterGeneral;
	}
	
	public void setConyugeParameterGeneral(ConyugeParameterReturnGeneral conyugeParameterGeneral) {
		this.conyugeParameterGeneral = conyugeParameterGeneral;
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
	
	public Boolean getIsPermisoTodoConyuge() {
		return isPermisoTodoConyuge;
	}

	public void setIsPermisoTodoConyuge(Boolean isPermisoTodoConyuge) {
		this.isPermisoTodoConyuge = isPermisoTodoConyuge;
	}

	public Boolean getIsPermisoNuevoConyuge() {
		return isPermisoNuevoConyuge;
	}

	public void setIsPermisoNuevoConyuge(Boolean isPermisoNuevoConyuge) {
		this.isPermisoNuevoConyuge = isPermisoNuevoConyuge;
	}

	public Boolean getIsPermisoActualizarConyuge() {
		return isPermisoActualizarConyuge;
	}

	public void setIsPermisoActualizarConyuge(Boolean isPermisoActualizarConyuge) {
		this.isPermisoActualizarConyuge = isPermisoActualizarConyuge;
	}

	public Boolean getIsPermisoEliminarConyuge() {
		return isPermisoEliminarConyuge;
	}

	public void setIsPermisoEliminarConyuge(Boolean isPermisoEliminarConyuge) {
		this.isPermisoEliminarConyuge = isPermisoEliminarConyuge;
	}

	public Boolean getIsPermisoGuardarCambiosConyuge() {
		return isPermisoGuardarCambiosConyuge;
	}

	public void setIsPermisoGuardarCambiosConyuge(Boolean isPermisoGuardarCambiosConyuge) {
		this.isPermisoGuardarCambiosConyuge = isPermisoGuardarCambiosConyuge;
	}
	
	public Boolean getIsPermisoConsultaConyuge() {
		return isPermisoConsultaConyuge;
	}

	public void setIsPermisoConsultaConyuge(Boolean isPermisoConsultaConyuge) {
		this.isPermisoConsultaConyuge = isPermisoConsultaConyuge;
	}

	public Boolean getIsPermisoBusquedaConyuge() {
		return isPermisoBusquedaConyuge;
	}

	public void setIsPermisoBusquedaConyuge(Boolean isPermisoBusquedaConyuge) {
		this.isPermisoBusquedaConyuge = isPermisoBusquedaConyuge;
	}

	public Boolean getIsPermisoReporteConyuge() {
		return isPermisoReporteConyuge;
	}

	public void setIsPermisoReporteConyuge(Boolean isPermisoReporteConyuge) {
		this.isPermisoReporteConyuge = isPermisoReporteConyuge;
	}
	
	public Boolean getIsPermisoPaginacionMedioConyuge() {
		return isPermisoPaginacionMedioConyuge;
	}

	public void setIsPermisoPaginacionMedioConyuge(Boolean isPermisoPaginacionMedioConyuge) {
		this.isPermisoPaginacionMedioConyuge = isPermisoPaginacionMedioConyuge;
	}
	
	public Boolean getIsPermisoPaginacionTodoConyuge() {
		return isPermisoPaginacionTodoConyuge;
	}

	public void setIsPermisoPaginacionTodoConyuge(Boolean isPermisoPaginacionTodoConyuge) {
		this.isPermisoPaginacionTodoConyuge = isPermisoPaginacionTodoConyuge;
	}
	
	public Boolean getIsPermisoPaginacionAltoConyuge() {
		return isPermisoPaginacionAltoConyuge;
	}

	public void setIsPermisoPaginacionAltoConyuge(Boolean isPermisoPaginacionAltoConyuge) {
		this.isPermisoPaginacionAltoConyuge = isPermisoPaginacionAltoConyuge;
	}
	
	public Boolean getIsPermisoCopiarConyuge() {
		return isPermisoCopiarConyuge;
	}

	public void setIsPermisoCopiarConyuge(Boolean isPermisoCopiarConyuge) {
		this.isPermisoCopiarConyuge = isPermisoCopiarConyuge;
	}
	
	public Boolean getIsPermisoVerFormConyuge() {
		return isPermisoVerFormConyuge;
	}

	public void setIsPermisoVerFormConyuge(Boolean isPermisoVerFormConyuge) {
		this.isPermisoVerFormConyuge = isPermisoVerFormConyuge;
	}
	
	public Boolean getIsPermisoDuplicarConyuge() {
		return isPermisoDuplicarConyuge;
	}

	public void setIsPermisoDuplicarConyuge(Boolean isPermisoDuplicarConyuge) {
		this.isPermisoDuplicarConyuge = isPermisoDuplicarConyuge;
	}
	
	public Boolean getIsPermisoOrdenConyuge() {
		return isPermisoOrdenConyuge;
	}

	public void setIsPermisoOrdenConyuge(Boolean isPermisoOrdenConyuge) {
		this.isPermisoOrdenConyuge = isPermisoOrdenConyuge;
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
	
	public Boolean getIsVisibilidadCeldaNuevoConyuge() {
		return isVisibilidadCeldaNuevoConyuge;
	}

	public void setIsVisibilidadCeldaNuevoConyuge(Boolean isVisibilidadCeldaNuevoConyuge) {
		this.isVisibilidadCeldaNuevoConyuge = isVisibilidadCeldaNuevoConyuge;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarConyuge() {
		return isVisibilidadCeldaDuplicarConyuge;
	}

	public void setIsVisibilidadCeldaDuplicarConyuge(Boolean isVisibilidadCeldaDuplicarConyuge) {
		this.isVisibilidadCeldaDuplicarConyuge = isVisibilidadCeldaDuplicarConyuge;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarConyuge() {
		return isVisibilidadCeldaCopiarConyuge;
	}

	public void setIsVisibilidadCeldaCopiarConyuge(Boolean isVisibilidadCeldaCopiarConyuge) {
		this.isVisibilidadCeldaCopiarConyuge = isVisibilidadCeldaCopiarConyuge;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormConyuge() {
		return isVisibilidadCeldaVerFormConyuge;
	}

	public void setIsVisibilidadCeldaVerFormConyuge(Boolean isVisibilidadCeldaVerFormConyuge) {
		this.isVisibilidadCeldaVerFormConyuge = isVisibilidadCeldaVerFormConyuge;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenConyuge() {
		return isVisibilidadCeldaOrdenConyuge;
	}

	public void setIsVisibilidadCeldaOrdenConyuge(Boolean isVisibilidadCeldaOrdenConyuge) {
		this.isVisibilidadCeldaOrdenConyuge = isVisibilidadCeldaOrdenConyuge;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesConyuge() {
		return isVisibilidadCeldaNuevoRelacionesConyuge;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesConyuge(Boolean isVisibilidadCeldaNuevoRelacionesConyuge) {
		this.isVisibilidadCeldaNuevoRelacionesConyuge = isVisibilidadCeldaNuevoRelacionesConyuge;
	}
	
	public Boolean getIsVisibilidadCeldaModificarConyuge() {
		return isVisibilidadCeldaModificarConyuge;
	}

	public void setIsVisibilidadCeldaModificarConyuge(Boolean isVisibilidadCeldaModificarConyuge) {
		this.isVisibilidadCeldaModificarConyuge = isVisibilidadCeldaModificarConyuge;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarConyuge() {
		return isVisibilidadCeldaActualizarConyuge;
	}

	public void setIsVisibilidadCeldaActualizarConyuge(Boolean isVisibilidadCeldaActualizarConyuge) {
		this.isVisibilidadCeldaActualizarConyuge = isVisibilidadCeldaActualizarConyuge;
	}

	public Boolean getIsVisibilidadCeldaEliminarConyuge() {
		return isVisibilidadCeldaEliminarConyuge;
	}

	public void setIsVisibilidadCeldaEliminarConyuge(Boolean isVisibilidadCeldaEliminarConyuge) {
		this.isVisibilidadCeldaEliminarConyuge = isVisibilidadCeldaEliminarConyuge;
	}

	public Boolean getIsVisibilidadCeldaCancelarConyuge() {
		return isVisibilidadCeldaCancelarConyuge;
	}

	public void setIsVisibilidadCeldaCancelarConyuge(Boolean isVisibilidadCeldaCancelarConyuge) {
		this.isVisibilidadCeldaCancelarConyuge = isVisibilidadCeldaCancelarConyuge;
	}

	public Boolean getIsVisibilidadCeldaGuardarConyuge() {
		return isVisibilidadCeldaGuardarConyuge;
	}

	public void setIsVisibilidadCeldaGuardarConyuge(Boolean isVisibilidadCeldaGuardarConyuge) {
		this.isVisibilidadCeldaGuardarConyuge = isVisibilidadCeldaGuardarConyuge;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosConyuge() {
		return isVisibilidadCeldaGuardarCambiosConyuge;
	}

	public void setIsVisibilidadCeldaGuardarCambiosConyuge(Boolean isVisibilidadCeldaGuardarCambiosConyuge) {
		this.isVisibilidadCeldaGuardarCambiosConyuge = isVisibilidadCeldaGuardarCambiosConyuge;
	}
		
	public ConyugeSessionBean getconyugeSessionBean() {
		return this.conyugeSessionBean;
	}
	
	public void setconyugeSessionBean(ConyugeSessionBean conyugeSessionBean) {
		this.conyugeSessionBean=conyugeSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdValorIdentificacion() {
		return this.isVisibilidadFK_IdValorIdentificacion;
	}

	public void setisVisibilidadFK_IdValorIdentificacion(Boolean isVisibilidadFK_IdValorIdentificacion) {
		this.isVisibilidadFK_IdValorIdentificacion=isVisibilidadFK_IdValorIdentificacion;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysConyuge(Conyuge conyuge)throws Exception {
		try {
			
				this.setActualParaGuardarClienteForeignKey(conyuge,null);
				this.setActualParaGuardarTipoIdentificacionForeignKey(conyuge,null);
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
	
	public void bugActualizarReferenciaActual(Conyuge conyuge,Conyuge conyugeAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalConyuge(conyuge);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		conyugeAux.setId(conyuge.getId());
		conyugeAux.setVersionRow(conyuge.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessConyuge();
		
			int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = conyugeValidator.getInvalidValues(this.conyuge);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			conyugeLogic.setDatosCliente(datosCliente);
			conyugeLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				conyugeAux=new  Conyuge();
				
				conyugeAux.setIsNew(true);
				conyugeAux.setIsChanged(true);
				
				conyugeAux.setConyugeOriginal(this.conyuge);
				
				conyugeAux.setId(this.conyuge.getId());	
				conyugeAux.setVersionRow(this.conyuge.getVersionRow());	
				conyugeAux.setidvaloridentificacion(this.conyuge.getidvaloridentificacion());	
				conyugeAux.setidentificacion(this.conyuge.getidentificacion());	
				conyugeAux.setapellidopaterno(this.conyuge.getapellidopaterno());	
				conyugeAux.setapellidomaterno(this.conyuge.getapellidomaterno());	
				conyugeAux.setprimernombre(this.conyuge.getprimernombre());	
				conyugeAux.setsegundonombre(this.conyuge.getsegundonombre());	
				conyugeAux.setnombrecorto(this.conyuge.getnombrecorto());	
				conyugeAux.setesactivo(this.conyuge.getesactivo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conyugeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conyugeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(conyugeAux,conyugeLogic.getConyuges());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conyugeAux,conyuges);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.conyugeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conyugeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conyugeLogic.saveConyuges();//WithConnection
						//conyugeLogic.getSetVersionRowConyuges();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.conyuge,conyugeAux);
					
					this.refrescarForeignKeysDescripcionesConyuge();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conyugeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conyugeLogic.saveConyugeRelaciones(conyugeAux);//WithConnection
								//conyugeLogic.getSetVersionRowConyuges();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.conyuge,conyugeAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.conyugeSessionBean.getEstaModoGuardarRelaciones() 
									|| this.conyugeSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(conyugeAux,conyugeLogic.getConyuges());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(conyugeAux,conyuges);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.conyuge,conyugeAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				conyugeAux=new  Conyuge();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.conyugeSessionBean.getEsGuardarRelacionado() 
					|| (this.conyugeSessionBean.getEsGuardarRelacionado() && this.conyuge.getId()>=0)) {
						
					conyugeAux.setIsNew(false);
				}
				
				conyugeAux.setIsDeleted(false);
			
				conyugeAux.setId(this.conyuge.getId());	
				conyugeAux.setVersionRow(this.conyuge.getVersionRow());	
				conyugeAux.setidvaloridentificacion(this.conyuge.getidvaloridentificacion());	
				conyugeAux.setidentificacion(this.conyuge.getidentificacion());	
				conyugeAux.setapellidopaterno(this.conyuge.getapellidopaterno());	
				conyugeAux.setapellidomaterno(this.conyuge.getapellidomaterno());	
				conyugeAux.setprimernombre(this.conyuge.getprimernombre());	
				conyugeAux.setsegundonombre(this.conyuge.getsegundonombre());	
				conyugeAux.setnombrecorto(this.conyuge.getnombrecorto());	
				conyugeAux.setesactivo(this.conyuge.getesactivo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conyugeAux,conyugeLogic.getConyuges());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conyugeAux,conyuges);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.conyugeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conyugeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conyugeLogic.saveConyuges();//WithConnection
						//conyugeLogic.getSetVersionRowConyuges();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.conyuge,conyugeAux);
					
					this.refrescarForeignKeysDescripcionesConyuge();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conyugeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conyugeLogic.saveConyugeRelaciones(conyugeAux);//WithConnection
								//conyugeLogic.getSetVersionRowConyuges();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.conyuge,conyugeAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.conyugeSessionBean.getEstaModoGuardarRelaciones() 
									|| this.conyugeSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(conyugeAux,conyugeLogic.getConyuges());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(conyugeAux,conyuges);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.conyuge,conyugeAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				conyugeAux=new  Conyuge();
				
				conyugeAux.setIsNew(false);
				conyugeAux.setIsChanged(false);
				
				conyugeAux.setIsDeleted(true);
				
				conyugeAux.setId(this.conyuge.getId());	
				conyugeAux.setVersionRow(this.conyuge.getVersionRow());	
				conyugeAux.setidvaloridentificacion(this.conyuge.getidvaloridentificacion());	
				conyugeAux.setidentificacion(this.conyuge.getidentificacion());	
				conyugeAux.setapellidopaterno(this.conyuge.getapellidopaterno());	
				conyugeAux.setapellidomaterno(this.conyuge.getapellidomaterno());	
				conyugeAux.setprimernombre(this.conyuge.getprimernombre());	
				conyugeAux.setsegundonombre(this.conyuge.getsegundonombre());	
				conyugeAux.setnombrecorto(this.conyuge.getnombrecorto());	
				conyugeAux.setesactivo(this.conyuge.getesactivo());	
				
				if(this.conyugeSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.conyugeAux.getId()>=0) {	
						this.conyugesEliminados.add(conyugeAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(conyugeAux,conyugeLogic.getConyuges());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conyugeAux,conyuges);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.conyugeSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.conyugeSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conyugeLogic.saveConyuges();//WithConnection
						//conyugeLogic.getSetVersionRowConyuges();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.conyugeSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								conyugeLogic.saveConyugeRelaciones(conyugeAux);//WithConnection
								//conyugeLogic.getSetVersionRowConyuges();//WithConnection
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
							if(this.conyugeSessionBean.getEstaModoGuardarRelaciones() 
								|| this.conyugeSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(conyugeAux,conyugeLogic.getConyuges());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(conyugeAux,conyuges);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getConyuges().addAll(this.conyugesEliminados);
					
					conyugeLogic.saveConyuges();//WithConnection
					//conyugeLogic.getSetVersionRowConyuges();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesConyuge();
				
				this.conyugesEliminados= new ArrayList<Conyuge>();		
			}
			
			if(this.conyugeSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Conyuge GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.conyuge=conyugeAux;
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
      		//this.finishProcessConyuge();
      	}
		
	}	
	
	public void actualizarRelaciones(Conyuge conyugeLocal) throws Exception {
		
		if(this.conyugeSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Conyuge conyugeLocal) throws Exception {	
		if(this.conyugeSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				conyugeLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoIdentificacionDetalleFormJInternalFrame.class)) {
				TipoIdentificacionBeanSwingJInternalFrame tipoidentificacionBeanSwingJInternalFrameLocal=(TipoIdentificacionBeanSwingJInternalFrame) ((TipoIdentificacionDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoidentificacionBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoIdentificacion(tipoidentificacionBeanSwingJInternalFrameLocal.gettipoidentificacion(),true);
				tipoidentificacionBeanSwingJInternalFrameLocal.actualizarLista(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion,this.tipoidentificacionsForeignKey);

				tipoidentificacionBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion);

				conyugeLocal.setTipoIdentificacion(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion);

				this.addItemDefectoCombosForeignKeyTipoIdentificacion();
				this.cargarCombosFrameTipoIdentificacionsForeignKey("Formulario");
				this.setActualTipoIdentificacionForeignKey(tipoidentificacionBeanSwingJInternalFrameLocal.tipoidentificacion.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarConyugeActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = conyugeValidator.getInvalidValues(this.conyuge);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Conyuge conyuge,List<Conyuge> conyuges) throws Exception {
		try	{		
			ConyugeConstantesFunciones.actualizarLista(conyuge,conyuges,this.conyugeSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Conyuge conyuge,List<Conyuge> conyuges) throws Exception {
		try	{			
			ConyugeConstantesFunciones.actualizarSelectedLista(conyuge,conyuges);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Conyuge> conyugesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				conyugesLocal=this.conyugeLogic.getConyuges();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				conyugesLocal=this.conyuges;
			}
			//ARCHITECTURE
		
			for(Conyuge conyugeLocal:conyugesLocal) {
				if(this.permiteMantenimiento(conyugeLocal) && conyugeLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ConyugeConstantesFunciones.getConyugeLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			
			if(invalidValue.getPropertyName().equals(ConyugeConstantesFunciones.IDTIPOIDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelidvaloridentificacionConyuge,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConyugeConstantesFunciones.IDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelidentificacionConyuge,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConyugeConstantesFunciones.APELLIDOPATERNO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelapellidopaternoConyuge,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConyugeConstantesFunciones.APELLIDOMATERNO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelapellidomaternoConyuge,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConyugeConstantesFunciones.PRIMERNOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelprimernombreConyuge,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConyugeConstantesFunciones.SEGUNDONOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelsegundonombreConyuge,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConyugeConstantesFunciones.NOMBRECORTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelnombrecortoConyuge,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ConyugeConstantesFunciones.ESACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelesactivoConyuge,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormConyuge!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConyuge.jLabelidvaloridentificacionConyuge,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConyuge.jLabelidentificacionConyuge,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConyuge.jLabelapellidopaternoConyuge,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConyuge.jLabelapellidomaternoConyuge,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConyuge.jLabelprimernombreConyuge,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConyuge.jLabelsegundonombreConyuge,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConyuge.jLabelnombrecortoConyuge,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormConyuge.jLabelesactivoConyuge,"");
		
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
		this.iIdNuevoConyuge--;	
		
		
		this.conyugeAux=new Conyuge();
		
		this.conyugeAux.setId(this.iIdNuevoConyuge);
		this.conyugeAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.conyugeLogic.getConyuges().add(this.conyugeAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.conyuges.add(this.conyugeAux);
		}
		//ARCHITECTURE
		
		this.conyuge=this.conyugeAux;
		
		if(ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioConyuge(this.conyuge);
			this.setVariablesObjetoActualToFormularioForeignKeyConyuge(this.conyuge);
		}
				
		//this.setDefaultControlesConyuge();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyConyuge();
		
		//PARA RELACION DE UNO A UNO
		this.conyuge.setId(this.id_clienteFK_IdCliente);
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyConyuge();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyConyuge();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConyuge(this.conyugeBean,this.conyuge,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ConyugeConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.conyugeSessionBean.getConGuardarRelaciones()) {
			classes=ConyugeConstantesFunciones.getClassesRelationshipsOfConyuge(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.conyugeReturnGeneral=conyugeLogic.procesarEventosConyugesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conyugeLogic.getConyuges(),this.conyuge,this.conyugeParameterGeneral,this.isEsNuevoConyuge,classes);//this.conyugeLogic.getConyuge()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanConyuge(this.conyugeReturnGeneral,this.conyugeBean,false);
		
		if(this.conyugeReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyConyuge(this.conyugeReturnGeneral.getConyuge());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioConyuge(this.conyugeReturnGeneral.getConyuge());
		}
		
		if(this.conyugeReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioConyuge(this.conyugeReturnGeneral.getConyuge(),classes);//this.conyugeBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyConyuge();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyConyuge();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConyugeBeanSwingJInternalFrameAdditional.RecargarFormConyuge(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingConyuge(false);
						
			if(conyugeSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ConyugeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConyuge();
			}
			
			this.actualizarVisualTableDatosConyuge();
			
			this.jTableDatosConyuge.setRowSelectionInterval(this.getIndiceNuevoConyuge(), this.getIndiceNuevoConyuge());
			
			this.seleccionarFilaTablaConyugeActual();
						
			this.actualizarEstadoCeldasBotonesConyuge("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesConyuge(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormConyuge.jTextFieldidentificacionConyuge.setEnabled(isHabilitar && this.conyugeConstantesFunciones.activaridentificacionConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreaapellidopaternoConyuge.setEnabled(isHabilitar && this.conyugeConstantesFunciones.activarapellidopaternoConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreaapellidomaternoConyuge.setEnabled(isHabilitar && this.conyugeConstantesFunciones.activarapellidomaternoConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreaprimernombreConyuge.setEnabled(isHabilitar && this.conyugeConstantesFunciones.activarprimernombreConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreasegundonombreConyuge.setEnabled(isHabilitar && this.conyugeConstantesFunciones.activarsegundonombreConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreanombrecortoConyuge.setEnabled(isHabilitar && this.conyugeConstantesFunciones.activarnombrecortoConyuge);
		this.jInternalFrameDetalleFormConyuge.jCheckBoxesactivoConyuge.setEnabled(isHabilitar && this.conyugeConstantesFunciones.activaresactivoConyuge);	
		
		this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.setEnabled(isHabilitar && this.conyugeConstantesFunciones.activaridvaloridentificacionConyuge);
	};
	
	public void setDefaultControlesConyuge() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoConyuge(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.conyugeSessionBean.setConGuardarRelaciones(true);			
			this.conyugeSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormConyuge.jTabbedPaneRelacionesConyuge.setVisible(true);
			
					
		} else {
			//this.conyugeSessionBean.setConGuardarRelaciones(false);			
			this.conyugeSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormConyuge.jTabbedPaneRelacionesConyuge.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoConyuge() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conyuge conyugeAux:this.conyugeLogic.getConyuges()) {
				if(conyugeAux.getId().equals(this.iIdNuevoConyuge)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conyuge conyugeAux:this.conyuges) {
				if(conyugeAux.getId().equals(this.iIdNuevoConyuge)) {
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
	
	public int getIndiceActualConyuge(Conyuge conyuge,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conyuge conyugeAux:this.conyugeLogic.getConyuges()) {
				if(conyugeAux.getId().equals(conyuge.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conyuge conyugeAux:this.conyuges) {
				if(conyugeAux.getId().equals(conyuge.getId())) {
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
	
	public void setCamposBaseDesdeOriginalConyuge(Conyuge conyugeOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conyuge conyugeAux:this.conyugeLogic.getConyuges()) {
				if(conyugeAux.getConyugeOriginal().getId().equals(conyugeOriginal.getId())) {
					existe=true;
					conyugeOriginal.setId(conyugeAux.getId());
					conyugeOriginal.setVersionRow(conyugeAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conyuge conyugeAux:this.conyuges) {
				if(conyugeAux.getConyugeOriginal().getId().equals(conyugeOriginal.getId())) {
					existe=true;
					conyugeOriginal.setId(conyugeAux.getId());
					conyugeOriginal.setVersionRow(conyugeAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosConyuge(Boolean esParaCancelar) throws Exception {
		conyugesAux=new ArrayList<Conyuge>();
		conyugeAux=new Conyuge();
		
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Conyuge conyugeAux:this.conyugeLogic.getConyuges()) {
					if(conyugeAux.getId()<0) {
						conyugesAux.add(conyugeAux);
					}		
				}
				this.iIdNuevoConyuge=0L;
				this.conyugeLogic.getConyuges().removeAll(conyugesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Conyuge conyugeAux:this.conyuges) {
					if(conyugeAux.getId()<0) {
						conyugesAux.add(conyugeAux);
					}		
				}
				this.iIdNuevoConyuge=0L;
				this.conyuges.removeAll(conyugesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoConyuge 
					&& this.conyugeLogic.getConyuges().size()>0
					) {
					conyugeAux=this.conyugeLogic.getConyuges().get(this.conyugeLogic.getConyuges().size() - 1);
				
					if(conyugeAux.getId()<0) {
						this.conyugeLogic.getConyuges().remove(conyugeAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoConyuge && this.conyuges.size()>0) {
					conyugeAux=this.conyuges.get(this.conyuges.size() - 1);
				
					if(conyugeAux.getId()<0) {
						this.conyuges.remove(conyugeAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoConyuge(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(conyuge.getId()<0) {
				this.conyugeLogic.getConyuges().remove(this.conyuge);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(conyuge.getId()<0) {
				this.conyuges.remove(this.conyuge);
			}
		}			
	}
	
	public void setEstadosInicialesConyuge(List<Conyuge> conyugesAux) throws Exception {
		ConyugeConstantesFunciones.setEstadosInicialesConyuge(conyugesAux);
	}
	
	public void setEstadosInicialesConyuge(Conyuge conyugeAux) throws Exception {
		ConyugeConstantesFunciones.setEstadosInicialesConyuge(conyugeAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarConyugeActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesConyuge("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarConyugeActual()) {
				if(!this.isEsNuevoConyuge) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesConyuge("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoConyuge=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarConyugeActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Conyuge ?", "MANTENIMIENTO DE Conyuge", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesConyuge("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Conyuge conyuge) throws Exception {
		ConyugeConstantesFunciones.seleccionarAsignar(this.conyuge,conyuge);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarConyuge=this.isPermisoActualizarOriginalConyuge;
			
			
			this.seleccionarAsignar(conyuge);
			
			

			idClienteActual=conyuge.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ConyugeConstantesFunciones.quitarEspaciosConyuge(this.conyuge,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesConyuge("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.conyugeSessionBean.setsFuncionBusquedaRapida(this.conyugeSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoConyuge) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosConyuge(esParaCancelar);				
				this.cancelarNuevoConyuge(esParaCancelar);								
			}
			
			this.conyuge=new Conyuge();
			
			this.inicializarConyuge();
			
			this.actualizarEstadoCeldasBotonesConyuge("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarConyuge() throws Exception {
		try {
			ConyugeConstantesFunciones.inicializarConyuge(this.conyuge);
			
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
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.conyugeLogic.getConyuges().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteConyuges(String sAccionBusqueda,List<Conyuge> conyugesParaReportes) throws Exception {
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
					sPathReporteFinal="Conyuge"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ConyugeMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ConyugeMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Conyuge"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Conyuges");		
		parameters.put("busquedapor", ConyugeConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceConyuge=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ConyugeConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ConyugeConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceConyuge=new JRBeanArrayDataSource(ConyugeJInternalFrame.TraerConyugeBeans(conyugesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceConyuge);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ConyugeConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ConyugeConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ConyugeBean.TraerConyugeBeans(conyugesParaReportes).toArray()));
							
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
				this.generarExcelReporteConyuges(sAccionBusqueda,sTipoArchivoReporte,conyugesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalConyuges(sAccionBusqueda,sTipoArchivoReporte,conyugesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoConyugeActionPerformed(null);
					//this.generarExcelReporteConyuges(sAccionBusqueda,sTipoArchivoReporte,conyugesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalConyuges(sAccionBusqueda,sTipoArchivoReporte,conyugesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesConyuges(sAccionBusqueda,sTipoArchivoReporte,conyugesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesConyuges(sAccionBusqueda,sTipoArchivoReporte,conyugesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteConyuges(String sAccionBusqueda,String sTipoArchivoReporte,List<Conyuge> conyugesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conyuge";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Conyuges");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConyuge("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Conyuge conyuge : conyugesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ConyugeConstantesFunciones.generarExcelReporteDataConyuge("NORMAL",row,workbook,conyuge,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderConyuge(String sTipo,Row row,Workbook workbook) {
		
		ConyugeConstantesFunciones.generarExcelReporteHeaderConyuge(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalConyuges(String sAccionBusqueda,String sTipoArchivoReporte,List<Conyuge> conyugesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conyuge_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Conyuges");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Conyuge conyuge : conyugesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ConyugeConstantesFunciones.getConyugeDescripcion(conyuge));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conyuge.gettipoidentificacion_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConyugeConstantesFunciones.LABEL_IDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConyugeConstantesFunciones.LABEL_IDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conyuge.getidentificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conyuge.getapellidopaterno());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conyuge.getapellidomaterno());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conyuge.getprimernombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conyuge.getsegundonombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConyugeConstantesFunciones.LABEL_NOMBRECORTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConyugeConstantesFunciones.LABEL_NOMBRECORTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(conyuge.getnombrecorto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ConyugeConstantesFunciones.LABEL_ESACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ConyugeConstantesFunciones.LABEL_ESACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(conyuge.getesactivo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesConyuges(String sAccionBusqueda,String sTipoArchivoReporte,List<Conyuge> conyugesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Conyuge> conyugesRespaldo=null;
		
		classes=ConyugeConstantesFunciones.getClassesRelationshipsOfConyuge(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.conyugeLogic.setDatosCliente(this.datosCliente);
		this.conyugeLogic.setDatosDeep(this.datosDeep);
		this.conyugeLogic.setIsConDeep(true);
		
		conyugesRespaldo=this.conyugeLogic.getConyuges();
		
		this.conyugeLogic.setConyuges(conyugesParaReportes);	
		this.conyugeLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		conyugesParaReportes=this.conyugeLogic.getConyuges();
		this.conyugeLogic.setConyuges(conyugesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conyuge_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Conyuges");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderConyuge("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Conyuge conyuge : conyugesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderConyuge("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ConyugeConstantesFunciones.generarExcelReporteDataConyuge("NORMAL",row,workbook,conyuge,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ConyugeConstantesFunciones.getConyugeDescripcion(conyuge));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoConyuge.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConyuge.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoConyuge.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConyuge.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessConyuge() throws Exception {		
		this.startProcessConyuge(true);
	}
	
	public void startProcessConyuge(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasConyuge ,this.jPanelParametrosReportesConyuge, this.jScrollPanelDatosConyuge,this.jPanelPaginacionConyuge, this.jScrollPanelDatosEdicionConyuge, this.jPanelAccionesConyuge,this.jPanelAccionesFormularioConyuge,this.jmenuBarConyuge,this.jmenuBarDetalleConyuge,this.jTtoolBarConyuge,this.jTtoolBarDetalleConyuge);		
		
		final JTabbedPane jTabbedPaneBusquedasConyuge=this.jTabbedPaneBusquedasConyuge; 
		
		final JPanel jPanelParametrosReportesConyuge=this.jPanelParametrosReportesConyuge;
		//final JScrollPane jScrollPanelDatosConyuge=this.jScrollPanelDatosConyuge;
		final JTable jTableDatosConyuge=this.jTableDatosConyuge;		
		final JPanel jPanelPaginacionConyuge=this.jPanelPaginacionConyuge;
		//final JScrollPane jScrollPanelDatosEdicionConyuge=this.jScrollPanelDatosEdicionConyuge;
		final JPanel jPanelAccionesConyuge=this.jPanelAccionesConyuge;
		
		JPanel jPanelCamposAuxiliarConyuge=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarConyuge=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormConyuge!=null) {
			jPanelCamposAuxiliarConyuge=this.jInternalFrameDetalleFormConyuge.jPanelCamposConyuge;
			jPanelAccionesFormularioAuxiliarConyuge=this.jInternalFrameDetalleFormConyuge.jPanelAccionesFormularioConyuge;
		}
		
		final JPanel jPanelCamposConyuge=jPanelCamposAuxiliarConyuge;
		final JPanel jPanelAccionesFormularioConyuge=jPanelAccionesFormularioAuxiliarConyuge;
		
		
		final JMenuBar jmenuBarConyuge=this.jmenuBarConyuge;
		final JToolBar jTtoolBarConyuge=this.jTtoolBarConyuge;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarConyuge=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConyuge=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) {
			jmenuBarDetalleAuxiliarConyuge=this.jInternalFrameDetalleFormConyuge.jmenuBarDetalleConyuge;
			jTtoolBarDetalleAuxiliarConyuge=this.jInternalFrameDetalleFormConyuge.jTtoolBarDetalleConyuge;
		}
		
		final JMenuBar jmenuBarDetalleConyuge=jmenuBarDetalleAuxiliarConyuge;
		final JToolBar jTtoolBarDetalleConyuge=jTtoolBarDetalleAuxiliarConyuge;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConyuge;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConyuge;
			processRunnable.jTableDatos=jTableDatosConyuge;
			processRunnable.jPanelCampos=jPanelCamposConyuge;
			processRunnable.jPanelPaginacion=jPanelPaginacionConyuge;
			processRunnable.jPanelAcciones=jPanelAccionesConyuge;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConyuge;
			
			
			processRunnable.jmenuBar=jmenuBarConyuge;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConyuge;
			processRunnable.jTtoolBar=jTtoolBarConyuge;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConyuge;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConyuge ,jPanelParametrosReportesConyuge,jTableDatosConyuge, /*jScrollPanelDatosConyuge,*/jPanelCamposConyuge,jPanelPaginacionConyuge, /*jScrollPanelDatosEdicionConyuge,*/ jPanelAccionesConyuge,jPanelAccionesFormularioConyuge,jmenuBarConyuge,jmenuBarDetalleConyuge,jTtoolBarConyuge,jTtoolBarDetalleConyuge);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasConyuge ,jPanelParametrosReportesConyuge, jScrollPanelDatosConyuge,jPanelPaginacionConyuge, jScrollPanelDatosEdicionConyuge, jPanelAccionesConyuge,jPanelAccionesFormularioConyuge,jmenuBarConyuge,jmenuBarDetalleConyuge,jTtoolBarConyuge,jTtoolBarDetalleConyuge);
						
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
	
	public void finishProcessConyuge() {// throws Exception 
		this.finishProcessConyuge(true);
	}
	
	public void finishProcessConyuge(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasConyuge ,this.jPanelParametrosReportesConyuge, this.jScrollPanelDatosConyuge,this.jPanelPaginacionConyuge, this.jScrollPanelDatosEdicionConyuge, this.jPanelAccionesConyuge,this.jPanelAccionesFormularioConyuge,this.jmenuBarConyuge,this.jmenuBarDetalleConyuge,this.jTtoolBarConyuge,this.jTtoolBarDetalleConyuge);		
		
		final JTabbedPane jTabbedPaneBusquedasConyuge=this.jTabbedPaneBusquedasConyuge; 
		
		final JPanel jPanelParametrosReportesConyuge=this.jPanelParametrosReportesConyuge;
		//final JScrollPane jScrollPanelDatosConyuge=this.jScrollPanelDatosConyuge;
		final JTable jTableDatosConyuge=this.jTableDatosConyuge;		
		final JPanel jPanelPaginacionConyuge=this.jPanelPaginacionConyuge;
		//final JScrollPane jScrollPanelDatosEdicionConyuge=this.jScrollPanelDatosEdicionConyuge;
		final JPanel jPanelAccionesConyuge=this.jPanelAccionesConyuge;
		
		JPanel jPanelCamposAuxiliarConyuge=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarConyuge=new JPanel();
		
		if(this.jInternalFrameDetalleFormConyuge!=null) {
			jPanelCamposAuxiliarConyuge=this.jInternalFrameDetalleFormConyuge.jPanelCamposConyuge;
			jPanelAccionesFormularioAuxiliarConyuge=this.jInternalFrameDetalleFormConyuge.jPanelAccionesFormularioConyuge;
		}
		
		final JPanel jPanelCamposConyuge=jPanelCamposAuxiliarConyuge;
		final JPanel jPanelAccionesFormularioConyuge=jPanelAccionesFormularioAuxiliarConyuge;
		
		
		final JMenuBar jmenuBarConyuge=this.jmenuBarConyuge;		
		final JToolBar jTtoolBarConyuge=this.jTtoolBarConyuge;
				
		JMenuBar jmenuBarDetalleAuxiliarConyuge=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarConyuge=new JToolBar();
		
		if(this.jInternalFrameDetalleFormConyuge!=null) {
			jmenuBarDetalleAuxiliarConyuge=this.jInternalFrameDetalleFormConyuge.jmenuBarDetalleConyuge;
			jTtoolBarDetalleAuxiliarConyuge=this.jInternalFrameDetalleFormConyuge.jTtoolBarDetalleConyuge;		
		}
		
		final JMenuBar jmenuBarDetalleConyuge=jmenuBarDetalleAuxiliarConyuge;
		final JToolBar jTtoolBarDetalleConyuge=jTtoolBarDetalleAuxiliarConyuge;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasConyuge;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesConyuge;
			processRunnable.jTableDatos=jTableDatosConyuge;
			processRunnable.jPanelCampos=jPanelCamposConyuge;
			processRunnable.jPanelPaginacion=jPanelPaginacionConyuge;
			processRunnable.jPanelAcciones=jPanelAccionesConyuge;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioConyuge;
			
			
			processRunnable.jmenuBar=jmenuBarConyuge;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleConyuge;
			processRunnable.jTtoolBar=jTtoolBarConyuge;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleConyuge;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasConyuge ,jPanelParametrosReportesConyuge, jTableDatosConyuge,/*jScrollPanelDatosConyuge,*/jPanelCamposConyuge,jPanelPaginacionConyuge, /*jScrollPanelDatosEdicionConyuge,*/ jPanelAccionesConyuge,jPanelAccionesFormularioConyuge,jmenuBarConyuge,jmenuBarDetalleConyuge,jTtoolBarConyuge,jTtoolBarDetalleConyuge));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesConyuge(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarConyuge(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuConyuge(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarConyuge(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarConyuge,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleConyuge,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuConyuge(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarConyuge,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleConyuge,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.conyugeConstantesFunciones.getsFinalQueryConyuge();
		String  finalQueryPaginacionTodos=this.conyugeConstantesFunciones.getsFinalQueryConyuge();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ConyugeConstantesFunciones.getArrayColumnasGlobalesNoConyuge(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ConyugeConstantesFunciones.getArrayColumnasGlobalesConyuge(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ConyugeConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.conyugesEliminados= new ArrayList<Conyuge>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessConyuge();
		
				///*ConyugeSessionBean*/this.conyugeSessionBean=new ConyugeSessionBean();
			
			if(this.conyugeSessionBean==null) {
				this.conyugeSessionBean=new ConyugeSessionBean();
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
					this.iNumeroPaginacion=ConyugeConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ConyugeConstantesFunciones.getClassesForeignKeysOfConyuge(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/conyuge."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			conyugesAux= new ArrayList<Conyuge>();
			
				
			conyugeLogic.setDatosCliente(this.datosCliente);
			conyugeLogic.setDatosDeep(this.datosDeep);
			conyugeLogic.setIsConDeep(true);
			
			
			conyugeLogic.getConyugeDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					conyugeLogic.getTodosConyuges(finalQueryGlobal,pagination);
					
					//conyugeLogic.getTodosConyugesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(conyugeLogic.getConyuges()==null|| conyugeLogic.getConyuges().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conyugesAux= new ArrayList<Conyuge>();
							conyugesAux.addAll(conyugeLogic.getConyuges());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conyugesAux= new ArrayList<Conyuge>();
							conyugesAux.addAll(conyuges);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conyugeLogic.getTodosConyuges(finalQueryGlobal+"",this.pagination);												
							
							//conyugeLogic.getTodosConyugesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteConyuges("Todos",conyugeLogic.getConyuges() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							conyugeLogic.setConyuges(new ArrayList<Conyuge>());					
							conyugeLogic.getConyuges().addAll(conyugesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conyuges=new ArrayList<Conyuge>();
							conyuges.addAll(conyugesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idConyuge=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idConyuge=this.idActual;
				
				} else if(this.idConyugeActual!=null && this.idConyugeActual!=0L) {
					idConyuge=idConyugeActual;
				}
				
					
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndicePorId(idConyuge);
				
				this.conyuges=new ArrayList<Conyuge>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					conyugeLogic.getEntity(idConyuge);
					
					//conyugeLogic.getEntityWithConnection(idConyuge);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conyugeLogic.setConyuges(new ArrayList<Conyuge>());
					conyugeLogic.getConyuges().add(conyugeLogic.getConyuge());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conyuges=new ArrayList<Conyuge>();
					this.conyuges.add(conyuge);
				}
				
				if(conyugeLogic.getConyuge()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conyugeLogic.getConyugesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conyugeLogic.getConyuges()==null||conyugeLogic.getConyuges().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conyuges==null|| conyuges.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conyugesAux=new ArrayList<Conyuge>();
						conyugesAux.addAll(conyugeLogic.getConyuges());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conyugesAux=new ArrayList<Conyuge>();
							conyugesAux.addAll(conyuges);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conyugeLogic.getConyugesFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConyuges("FK_IdCliente",conyugeLogic.getConyuges());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConyuges("FK_IdCliente",conyuges);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conyugeLogic.setConyuges(new ArrayList<Conyuge>());
						conyugeLogic.getConyuges().addAll(conyugesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conyuges=new ArrayList<Conyuge>();
							conyuges.addAll(conyugesAux);
						}
						//ARCHITECTURE
					}
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					Boolean isTieneDatosConyuge=true;
					isTieneDatosConyuge=conyugeLogic.getConyuges()!=null && conyugeLogic.getConyuges().size()>0;

					if(isTieneDatosConyuge) {
					}
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					if(conyuges!=null && conyuges.size()>0) {
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdValorIdentificacion")) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					conyugeLogic.getConyugesFK_IdValorIdentificacion(finalQueryGlobal,pagination,idvaloridentificacionFK_IdValorIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=conyugeLogic.getConyuges()==null||conyugeLogic.getConyuges().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=conyuges==null|| conyuges.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						conyugesAux=new ArrayList<Conyuge>();
						conyugesAux.addAll(conyugeLogic.getConyuges());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conyugesAux=new ArrayList<Conyuge>();
							conyugesAux.addAll(conyuges);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							conyugeLogic.getConyugesFK_IdValorIdentificacion(finalQueryGlobal,pagination,idvaloridentificacionFK_IdValorIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ConyugeConstantesFunciones.getDetalleIndiceFK_IdValorIdentificacion(idvaloridentificacionFK_IdValorIdentificacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteConyuges("FK_IdValorIdentificacion",conyugeLogic.getConyuges());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteConyuges("FK_IdValorIdentificacion",conyuges);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						conyugeLogic.setConyuges(new ArrayList<Conyuge>());
						conyugeLogic.getConyuges().addAll(conyugesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conyuges=new ArrayList<Conyuge>();
							conyuges.addAll(conyugesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesConyuge();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessConyuge();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conyugeLogic.getConyuges().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conyuges.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=conyugeLogic.getConyuges().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=conyuges.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Conyuge conyuge) {
		Boolean permite=true;
		
		if(this.conyuge.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ConyugeConstantesFunciones.getOrderByListaConyuge();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ConyugeConstantesFunciones.getOrderByListaConyuge();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conyuge conyuge:conyugeLogic.getConyuges()) {
				if(conyuge.getsType().equals(Constantes2.S_TOTALES)) {
					conyugeTotales=conyuge;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conyuge conyuge:this.conyuges) {
				if(conyuge.getsType().equals(Constantes2.S_TOTALES)) {
					conyugeTotales=conyuge;
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
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		conyugeTotales=new Conyuge();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conyugeLogic.getConyuges().remove(conyugeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.conyuges.remove(conyugeTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		conyugeTotales=new Conyuge();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Conyuge conyuge:conyugeLogic.getConyuges()) {
				if(conyuge.getsType().equals(Constantes2.S_TOTALES)) {
					conyugeTotales=conyuge;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConyugeConstantesFunciones.TotalizarValoresFilaConyuge(this.conyugeLogic.getConyuges(),conyugeTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Conyuge conyuge:this.conyuges) {
				if(conyuge.getsType().equals(Constantes2.S_TOTALES)) {
					conyugeTotales=conyuge;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ConyugeConstantesFunciones.TotalizarValoresFilaConyuge(this.conyuges,conyugeTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getConyugesFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getConyugesFK_IdValorIdentificacion()throws Exception {
		try {
			sAccionBusqueda="FK_IdValorIdentificacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getConyugesFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conyugeLogic.getConyugesFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getConyugesFK_IdValorIdentificacion(String sFinalQuery,Long idvaloridentificacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conyugeLogic.getConyugesFK_IdValorIdentificacion(sFinalQuery,this.pagination,idvaloridentificacion);
				
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
	
	public void inicializarPermisosConyuge() {
		this.isPermisoTodoConyuge=false;
		this.isPermisoNuevoConyuge=false;
		this.isPermisoActualizarConyuge=false;
		this.isPermisoActualizarOriginalConyuge=false;
		this.isPermisoEliminarConyuge=false;
		this.isPermisoGuardarCambiosConyuge=false;
		this.isPermisoConsultaConyuge=false;
		this.isPermisoBusquedaConyuge=false;
		this.isPermisoReporteConyuge=false;		
		this.isPermisoOrdenConyuge=false;		
		this.isPermisoPaginacionMedioConyuge=false;		
		this.isPermisoPaginacionAltoConyuge=false;
		this.isPermisoPaginacionTodoConyuge=false;
		this.isPermisoCopiarConyuge=false;		
		this.isPermisoVerFormConyuge=false;		
		this.isPermisoDuplicarConyuge=false;		
		this.isPermisoOrdenConyuge=false;		
	}
	
	public void setPermisosUsuarioConyuge(Boolean isPermiso) {
		this.isPermisoTodoConyuge=isPermiso;
		this.isPermisoNuevoConyuge=isPermiso;
		this.isPermisoActualizarConyuge=isPermiso;
		this.isPermisoActualizarOriginalConyuge=isPermiso;
		this.isPermisoEliminarConyuge=isPermiso;
		this.isPermisoGuardarCambiosConyuge=isPermiso;
		this.isPermisoConsultaConyuge=isPermiso;
		this.isPermisoBusquedaConyuge=isPermiso;
		this.isPermisoReporteConyuge=isPermiso;
		this.isPermisoOrdenConyuge=isPermiso;		
		this.isPermisoPaginacionMedioConyuge=isPermiso;		
		this.isPermisoPaginacionAltoConyuge=isPermiso;		
		this.isPermisoPaginacionTodoConyuge=isPermiso;		
		this.isPermisoCopiarConyuge=isPermiso;		
		this.isPermisoVerFormConyuge=isPermiso;		
		this.isPermisoDuplicarConyuge=isPermiso;
		this.isPermisoOrdenConyuge=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioConyuge(Boolean isPermiso) {
		//this.isPermisoTodoConyuge=isPermiso;
		this.isPermisoNuevoConyuge=isPermiso;
		this.isPermisoActualizarConyuge=isPermiso;
		this.isPermisoActualizarOriginalConyuge=isPermiso;
		this.isPermisoEliminarConyuge=isPermiso;
		this.isPermisoGuardarCambiosConyuge=isPermiso;
		//this.isPermisoConsultaConyuge=isPermiso;
		//this.isPermisoBusquedaConyuge=isPermiso;
		//this.isPermisoReporteConyuge=isPermiso;
		//this.isPermisoOrdenConyuge=isPermiso;		
		//this.isPermisoPaginacionMedioConyuge=isPermiso;		
		//this.isPermisoPaginacionAltoConyuge=isPermiso;		
		//this.isPermisoPaginacionTodoConyuge=isPermiso;		
		//this.isPermisoCopiarConyuge=isPermiso;		
		//this.isPermisoDuplicarConyuge=isPermiso;
		//this.isPermisoOrdenConyuge=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioConyugeClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ConyugeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebConyuge(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioConyugeClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioConyugeClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionConyugeClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioConyugeClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioConyuge() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ConyugeJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.conyugeSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ConyugeConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoConyuge=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarConyuge=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalConyuge=this.isPermisoActualizarConyuge;
			this.isPermisoEliminarConyuge=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosConyuge=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaConyuge=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaConyuge=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoConyuge=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteConyuge=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConyuge=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioConyuge=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoConyuge=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoConyuge=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarConyuge=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormConyuge=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarConyuge=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenConyuge=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.conyugeSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosConyuge.setToolTipText(this.jTableDatosConyuge.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioConyuge(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioConyuge(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ConyugeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ConyugeJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioConyuge() throws Exception {
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
	public void inicializarCombosForeignKeyConyugeListas()throws Exception {
		try	{						
			
				this.clientesForeignKey=new ArrayList();
				this.tipoidentificacionsForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyConyugeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ConyugeJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyConyugeListas(false);
			} else {
			
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoIdentificacionListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIdentificacionListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoidentificacionsForeignKey==null||this.tipoidentificacionsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesTipoIdentificacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIdentificacionConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoIdentificacionConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoIdentificacionsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyConyugeListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ConyugeParameterReturnGeneral conyugeReturnGeneral=new ConyugeParameterReturnGeneral();
						
			


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.conyugeConstantesFunciones.cargarid_clienteConyuge)
					 || (this.esRecargarFks && this.conyugeConstantesFunciones.cargarid_clienteConyuge)) {

					if(!this.conyugeSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+conyugeSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}


				String finalQueryGlobalTipoIdentificacion="";

				if(((this.tipoidentificacionsForeignKey==null||this.tipoidentificacionsForeignKey.size()<=0) && this.conyugeConstantesFunciones.cargaridvaloridentificacionConyuge)
					 || (this.esRecargarFks && this.conyugeConstantesFunciones.cargaridvaloridentificacionConyuge)) {

					if(!this.conyugeSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoIdentificacionConstantesFunciones.getArrayColumnasGlobalesTipoIdentificacion(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoIdentificacion=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoIdentificacionConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoIdentificacion=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoIdentificacion, "");
						finalQueryGlobalTipoIdentificacion+=TipoIdentificacionConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoIdentificacionsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoIdentificacion=" WHERE " + ConstantesSql.ID + "="+conyugeSessionBean.getlidTipoIdentificacionActual();
					}
				} else {
					finalQueryGlobalTipoIdentificacion="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				conyugeReturnGeneral=conyugeLogic.cargarCombosLoteForeignKeyConyuge(finalQueryGlobalCliente,finalQueryGlobalTipoIdentificacion);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=conyugeReturnGeneral.getclientesForeignKey();
			}

			if(!finalQueryGlobalTipoIdentificacion.equals("NONE")) {
				this.tipoidentificacionsForeignKey=conyugeReturnGeneral.gettipoidentificacionsForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyConyuge()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyCliente();
			this.addItemDefectoCombosForeignKeyTipoIdentificacion();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {
			if(this.conyugeSessionBean==null) {
				this.conyugeSessionBean=new ConyugeSessionBean();
			}

			if(!this.conyugeSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoIdentificacion()throws Exception {
		try {

			if(!this.conyugeSessionBean.getisBusquedaDesdeForeignKeySesionTipoIdentificacion()) {
				TipoIdentificacion tipoidentificacion=new TipoIdentificacion();
				TipoIdentificacionConstantesFunciones.setTipoIdentificacionDescripcion(tipoidentificacion,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoidentificacion.setId(null);

				if(!TipoIdentificacionConstantesFunciones.ExisteEnLista(this.tipoidentificacionsForeignKey,tipoidentificacion,true)) {

					this.tipoidentificacionsForeignKey.add(0,tipoidentificacion);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyConyuge()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyConyuge(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyConyuge()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyConyuge();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyConyuge(Conyuge conyuge)throws Exception {	
		try {
			
			this.setActualClienteForeignKey(conyuge.getid_cliente(),false,"Formulario");
			this.setActualTipoIdentificacionForeignKey(conyuge.getidvaloridentificacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyConyuge(Conyuge conyuge,String sTipoEvento)throws Exception {	
		try {
			
			

				if(conyuge.getCliente()!=null && !sTipoEvento.equals("id_clienteConyuge")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(conyuge.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyConyuge()throws Exception {	
		try {
			
			this.setActualClienteForeignKey(this.conyugeConstantesFunciones.getid_cliente(),false,"Formulario");
			this.setActualTipoIdentificacionForeignKey(this.conyugeConstantesFunciones.getidvaloridentificacion(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyConyuge()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyConyuge()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyConyuge()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroConyuge()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyConyuge()throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey("Todos");
			this.cargarCombosFrameTipoIdentificacionsForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyConyuge(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoIdentificacionsForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyConyuge()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge!=null && this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.getItemCount()>0) {
				this.jInternalFrameDetalleFormConyuge.jComboBoxid_clienteConyuge.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge!=null && this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.getItemCount()>0) {
				this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public ConyugeBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ConyugeBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ConyugeBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.conyugeSessionBean=new ConyugeSessionBean(); 
		this.conyugeConstantesFunciones=new ConyugeConstantesFunciones(); 
		this.conyugeBean=new Conyuge();//(this.conyugeConstantesFunciones); 		
		this.conyugeReturnGeneral=new ConyugeParameterReturnGeneral(); 
		
		this.conyugeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.conyugeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ConyugeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ConyugeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ConyugeBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessConyuge(true);
			
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
			
			this.conyugeConstantesFunciones=new ConyugeConstantesFunciones(); 
			this.conyugeBean=new Conyuge();//this.conyugeConstantesFunciones); 			
			this.conyugeReturnGeneral=new ConyugeParameterReturnGeneral(); 
		
			ConyugeBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Conyuge Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.conyuge=new Conyuge();
			this.conyuges = new ArrayList<Conyuge>();
			this.conyugesAux = new ArrayList<Conyuge>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic=new ConyugeLogic();
				this.conyugeLogic.getNewConnexionToDeep("");
			}
			
			//this.conyugeSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.conyugeSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormConyuge);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoConyuge!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConyuge);	
					}
					
					if(this.jInternalFrameImportacionConyuge!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConyuge);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByConyuge!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByConyuge);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormConyuge!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormConyuge);
				this.jInternalFrameDetalleFormConyuge.setVisible(false);
				this.jInternalFrameDetalleFormConyuge.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoConyuge!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConyuge);
					this.jInternalFrameReporteDinamicoConyuge.setVisible(false);
					this.jInternalFrameReporteDinamicoConyuge.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionConyuge!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionConyuge);
					this.jInternalFrameImportacionConyuge.setVisible(false);
					this.jInternalFrameImportacionConyuge.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByConyuge!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByConyuge);
					this.jInternalFrameOrderByConyuge.setVisible(false);
					this.jInternalFrameOrderByConyuge.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idConyugeActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ConyugeConstantesFunciones.INUMEROPAGINACION;
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
			
			this.conyugeReturnGeneral=new ConyugeParameterReturnGeneral();
			
			this.conyugeParameterGeneral=new ConyugeParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.conyugeLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ConyugeJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.conyugeSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConyugeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conyugeSessionBean.getEsGuardarRelacionado(),this.conyugeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ConyugeConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.conyugeSessionBean.getEsGuardarRelacionado(),this.conyugeSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoConyuge=false;
			this.isVisibilidadCeldaDuplicarConyuge=true;
			this.isVisibilidadCeldaCopiarConyuge=true;
			this.isVisibilidadCeldaVerFormConyuge=true;
			this.isVisibilidadCeldaOrdenConyuge=true;
			this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
			this.isVisibilidadCeldaModificarConyuge=false;
			this.isVisibilidadCeldaActualizarConyuge=false;
			this.isVisibilidadCeldaEliminarConyuge=false;
			this.isVisibilidadCeldaCancelarConyuge=false;
			this.isVisibilidadCeldaGuardarConyuge=false;
			this.isVisibilidadCeldaGuardarCambiosConyuge=false;
			
			
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdValorIdentificacion=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesConyuge("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosConyuge();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioConyuge(false);
			
			this.setPermisosUsuarioConyuge();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conyugeSessionBean.getEsGuardarRelacionado() 
				|| (this.conyugeSessionBean.getEsGuardarRelacionado() && this.conyugeSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioConyugeClasesRelacionadas();
			}
			
			if(this.conyugeSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioConyugeClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ConyugeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosConyuge();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualConyuge();
			}
			
			if(!this.isPermisoBusquedaConyuge) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasConyuge.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioConyuge,this.isPermisoPaginacionMedioConyuge,this.isPermisoPaginacionTodoConyuge);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ConyugeConstantesFunciones.getTiposSeleccionarConyuge());
				
				this.tiposColumnasSelect=ConyugeConstantesFunciones.getTiposSeleccionarConyuge(true);
				
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
			//if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioConyuge();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioConyuge(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioConyuge(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesConyuge() ;
			
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
			
			this.clienteLogic=new ClienteLogic();
			this.tipoidentificacionLogic=new TipoIdentificacionLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				conyugeImplementable= (ConyugeImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConyugeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				conyugeImplementableHome= (ConyugeImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ConyugeConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.conyuges= new ArrayList<Conyuge>();
			this.conyugesEliminados= new ArrayList<Conyuge>();
						
			this.isEsNuevoConyuge=false;
			this.esParaAccionDesdeFormularioConyuge=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyConyuge(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroConyuge();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ConyugeBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ConyugeConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesConyuge("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingConyuge(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormConyuge!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioConyuge();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioConyuge();
			}
			
			ConyugeBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasConyuge.getTabCount(); i++) {
					this.jTabbedPaneBusquedasConyuge.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasConyuge.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessConyuge(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Conyuge: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectConyuge() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesConyuge")) {
				iIndex=this.jInternalFrameDetalleFormConyuge.jTabbedPaneRelacionesConyuge.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormConyuge.jTabbedPaneRelacionesConyuge.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosConyuge.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessConyuge();	
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
	
	public void cargarCombosForeignKeyConyuge(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyConyuge(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyConyuge(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyConyugeListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyConyuge();
		
		this.cargarCombosFrameForeignKeyConyuge();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyConyuge();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyConyuge();
		}
	}
	
	

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoIdentificacion(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoIdentificacionListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoIdentificacion();
				this.cargarCombosFrameTipoIdentificacionsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoIdentificacion(this.tipoidentificacionsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoConyugeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.conyugeSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
			
			if(jTableDatosConyuge.getRowCount()>=1) {
				jTableDatosConyuge.removeRowSelectionInterval(0, jTableDatosConyuge.getRowCount()-1);						
			}
			
			this.isEsNuevoConyuge=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoConyuge(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesConyuge(true);			
			//this.conyuge=new Conyuge();
			//this.conyuge.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConyuge(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConyuge() ;
			
			if(ConyugeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConyuge(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.conyuge);	
			this.actualizarInformacion("INFO_PADRE",false,this.conyuge);				
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
			if(this.conyugeSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Conyuge: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarConyugeActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosConyuge.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosConyuge.getSelectedRows().length;			
			}
			
			conyugesSeleccionados=this.getConyugesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoConyuge--;			
				//Conyuge conyugeAux= new Conyuge();			
				//conyugeAux.setId(this.iIdNuevoConyuge);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Conyuge conyugeOrigen=new Conyuge();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Conyuge conyugeOrigen : conyugesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							conyugeOrigen =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							conyugeOrigen =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaConyuge();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.conyuge.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosConyuge(conyugeOrigen,this.conyuge,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conyugeLogic.getConyuges().add(this.conyugeAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conyuges.add(this.conyugeAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaConyuge(false);
				
				this.jTableDatosConyuge.setRowSelectionInterval(this.getIndiceNuevoConyuge(), this.getIndiceNuevoConyuge());
				
				int iLastRow =  this.jTableDatosConyuge.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConyuge.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConyuge.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConyuge(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();									
		
			Conyuge conyugeOrigen=new Conyuge();
			Conyuge conyugeDestino=new Conyuge();
				
			conyugesSeleccionados=this.getConyugesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosConyuge.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || conyugesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosConyuge.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conyugeOrigen =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conyugeOrigen =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						conyugeDestino =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						conyugeDestino =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				conyugeOrigen =conyugesSeleccionados.get(0);
				conyugeDestino =conyugesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosConyuge(conyugeOrigen,conyugeDestino,true,false);
				
				conyugeDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(conyugeDestino,conyugeLogic.getConyuges());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(conyugeDestino,conyuges);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaConyuge(false);
				
				//this.jTableDatosConyuge.setRowSelectionInterval(this.getIndiceNuevoConyuge(), this.getIndiceNuevoConyuge());
				
				int iLastRow =  this.jTableDatosConyuge.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosConyuge.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosConyuge.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaConyuge(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormConyuge.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesConyuge.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasConyuge.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesConyuge.setVisible(!isVisible);
			this.jPanelPaginacionConyuge.setVisible(!isVisible);
			this.jPanelAccionesConyuge.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameConyuge();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoConyuge();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionConyuge();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByConyuge();
			
			this.abrirFrameOrderByConyuge();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByConyuge();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleConyuge(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormConyuge);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormConyuge.isMaximum()) {
					this.jInternalFrameDetalleFormConyuge.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormConyuge.setSize(this.jInternalFrameDetalleFormConyuge.iWidthFormulario,this.jInternalFrameDetalleFormConyuge.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormConyuge.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormConyuge.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormConyuge.isMaximum()) {
						this.jInternalFrameDetalleFormConyuge.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormConyuge.jContentPaneDetalleConyuge.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormConyuge.jTabbedPaneRelacionesConyuge.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormConyuge.jContentPaneDetalleConyuge.getWidth(),ConyugeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConyuge.jTabbedPaneRelacionesConyuge.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormConyuge.jContentPaneDetalleConyuge.getWidth(),ConyugeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormConyuge.jTabbedPaneRelacionesConyuge.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormConyuge.jContentPaneDetalleConyuge.getWidth(),ConyugeConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormConyuge.setVisible(true);
	        this.jInternalFrameDetalleFormConyuge.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByConyuge() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByConyuge==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByConyuge=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConyuge,false,this);
				} else {
					this.jInternalFrameOrderByConyuge=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByConyuge,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByConyuge);
				this.jInternalFrameOrderByConyuge.setVisible(false);
				this.jInternalFrameOrderByConyuge.setSelected(false);
				
				this.jInternalFrameOrderByConyuge.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConyuge"));
				
				this.inicializarActualizarBindingTablaOrderByConyuge();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionConyuge() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionConyuge==null) {
				
				this.jInternalFrameImportacionConyuge=new ImportacionJInternalFrame(ConyugeConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionConyuge);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionConyuge);
				this.jInternalFrameImportacionConyuge.setVisible(false);
				this.jInternalFrameImportacionConyuge.setSelected(false);


				this.jInternalFrameImportacionConyuge.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConyuge"));
				this.jInternalFrameImportacionConyuge.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConyuge"));
				this.jInternalFrameImportacionConyuge.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConyuge"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoConyuge() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoConyuge==null) {
				this.jInternalFrameReporteDinamicoConyuge=new ReporteDinamicoJInternalFrame(ConyugeConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoConyuge);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoConyuge);
				this.jInternalFrameReporteDinamicoConyuge.setVisible(false);
				this.jInternalFrameReporteDinamicoConyuge.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoConyuge.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConyuge"));
				this.jInternalFrameReporteDinamicoConyuge.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConyuge"));
				this.jInternalFrameReporteDinamicoConyuge.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConyuge"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConyuge();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleConyuge() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormConyuge);
			
	       	this.jInternalFrameDetalleFormConyuge.setVisible(false);
	        this.jInternalFrameDetalleFormConyuge.setSelected(false);
			
			//this.jInternalFrameDetalleFormConyuge.dispose();
			//this.jInternalFrameDetalleFormConyuge=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoConyuge() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoConyuge.setVisible(true);
	        this.jInternalFrameReporteDinamicoConyuge.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionConyuge() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionConyuge.setVisible(true);
	        this.jInternalFrameImportacionConyuge.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByConyuge() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByConyuge.setVisible(true);
	        this.jInternalFrameOrderByConyuge.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByConyuge() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByConyuge.setVisible(false);
	        this.jInternalFrameOrderByConyuge.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoConyuge() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoConyuge.setVisible(false);
	        this.jInternalFrameReporteDinamicoConyuge.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionConyuge() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionConyuge.setVisible(false);
	        this.jInternalFrameImportacionConyuge.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarConyuge(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarConyuge(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesConyuge(true);
			//this.isEsNuevoConyuge=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesConyuge("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConyuge(false) ;
			
			if(conyugeSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ConyugeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConyuge(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConyuge(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaConyugeActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarConyuge(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesConyuge(true);
			//this.isEsNuevoConyuge=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.conyuge.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesConyuge("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesConyuge(false) ;
			
			if(ConyugeJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleConyuge(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConyuge(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.conyugeConstantesFunciones.cargarid_clienteConyuge) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingConyuge(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_ID));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConyuge.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaTipoIdentificacion(List<TipoIdentificacion> tipoidentificacionsForeignKey)throws Exception{
		TableColumn tableColumnTipoIdentificacion=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION));
		TableCellEditor tableCellEditorTipoIdentificacion =tableColumnTipoIdentificacion.getCellEditor();

		TipoIdentificacionTableCell tipoidentificacionTableCellFk=(TipoIdentificacionTableCell)tableCellEditorTipoIdentificacion;

		if(tipoidentificacionTableCellFk!=null) {
			tipoidentificacionTableCellFk.settipoidentificacionsForeignKey(tipoidentificacionsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosConyuge.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoidentificacionTableCellFk.setRowActual(intSelectedRow);
			//tipoidentificacionTableCellFk.settipoidentificacionsForeignKeyActual(tipoidentificacionsForeignKey);
		//}


		if(tipoidentificacionTableCellFk!=null) {
			tipoidentificacionTableCellFk.RecargarTipoIdentificacionsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesConyuge(false);
			
			//if(!this.isEsNuevoConyuge) {								
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
				this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				
				//OTRA VEZ SE EJECUTA ESTO
				//PARA RELACION DE UNO A UNO
				if(this.isEsNuevoConyuge) {
					this.conyuge.setId(this.id_clienteFK_IdCliente);
				}
			}
			
			if(this.permiteMantenimiento(this.conyuge)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.conyugeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoConyuge=true;
					this.inicializarActualizarBindingTablaConyuge(false);
					this.isEsNuevoConyuge=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoConyuge=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoConyuge=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConyuge(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConyuge(false);
				
				this.habilitarDeshabilitarControlesConyuge(false);
			
												
				
				if(ConyugeJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleConyuge();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoConyugeActionPerformed(evt,conyugeSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualConyuge(this.conyuge,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosConyuge.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,conyugeSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.conyuge.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarConyugeActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				this.conyuge.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				this.conyuge.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.conyuge)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.conyugeSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ConyugeModel) this.jTableDatosConyuge.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoConyuge=true;
				this.inicializarActualizarBindingTablaConyuge(false);
				this.isEsNuevoConyuge=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesConyuge(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConyuge(false);
				
				this.habilitarDeshabilitarControlesConyuge(false);
				
				
				
				if(ConyugeJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleConyuge();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarConyugeActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosConyuge.getRowCount()>=1) {
				jTableDatosConyuge.removeRowSelectionInterval(0, jTableDatosConyuge.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesConyuge(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaConyuge(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesConyuge(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualConyuge(false) ;
			
			this.isEsNuevoConyuge=false;
			
			if(ConyugeJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleConyuge();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosConyugeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingConyuge(false);
				
				//SI ES MANUAL
				if(ConyugeJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualConyuge();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosConyugeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoConyuge--;			
			//Conyuge conyugeAux= new Conyuge();			
			//conyugeAux.setId(this.iIdNuevoConyuge);
			
			if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaConyuge();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
			
			this.conyuge.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.conyugeLogic.getConyuges().add(this.conyugeAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.conyuges.add(this.conyugeAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaConyuge(false);
			
			this.jTableDatosConyuge.setRowSelectionInterval(this.getIndiceNuevoConyuge(), this.getIndiceNuevoConyuge());
			
			int iLastRow =  this.jTableDatosConyuge.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosConyuge.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosConyuge.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaConyuge(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionConyugeActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingConyuge(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConyuge(false);
			
			//SI ES MANUAL
			if(ConyugeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConyuge();
			}
			
			//this.abrirFrameTreeConyuge();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionConyugeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE ConyugeS ?", "MANTENIMIENTO DE Conyuge", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionConyuge.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralConyuge();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.conyugeReturnGeneral=conyugeLogic.procesarImportacionConyugesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.conyugeParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarConyugeReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionConyugeActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionConyuge.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionConyuge.setFileImportacion(this.jInternalFrameImportacionConyuge.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionConyuge.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionConyuge.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionConyuge.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionConyuge.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoConyugeActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();		

		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConyuge.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConyuge.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ConyugeBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ConyugeBaseDesign.jrxml";
			
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
			
			this.generarReporteConyuges("Todos",conyugesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoConyuge.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConyuge.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoIdentificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoIdentificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoIdentificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoIdentificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConyugeConstantesFunciones.LABEL_IDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_entificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_entificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_entificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_entificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellidoPaterno_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellidoPaterno_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellidoPaterno_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellidoPaterno_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellidoMaterno_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellidoMaterno_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellidoMaterno_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellidoMaterno_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_imerNombre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_imerNombre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_imerNombre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_imerNombre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gundoNombre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gundoNombre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gundoNombre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gundoNombre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConyugeConstantesFunciones.LABEL_NOMBRECORTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCorto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCorto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCorto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCorto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ConyugeConstantesFunciones.LABEL_ESACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Activo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Activo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Activo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Activo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoConyuge.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoConyuge.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoConyuge.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					sNombreCampoCategoria="idvaloridentificacion";
					break;

				case ConyugeConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoria="identificacion";
					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO:
					sNombreCampoCategoria="apellidopaterno";
					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO:
					sNombreCampoCategoria="apellidomaterno";
					break;

				case ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE:
					sNombreCampoCategoria="primernombre";
					break;

				case ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE:
					sNombreCampoCategoria="segundonombre";
					break;

				case ConyugeConstantesFunciones.LABEL_NOMBRECORTO:
					sNombreCampoCategoria="nombrecorto";
					break;

				case ConyugeConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoria="esactivo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoConyuge.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					sNombreCampoCategoriaValor="idvaloridentificacion";
					break;

				case ConyugeConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoriaValor="identificacion";
					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO:
					sNombreCampoCategoriaValor="apellidopaterno";
					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO:
					sNombreCampoCategoriaValor="apellidomaterno";
					break;

				case ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE:
					sNombreCampoCategoriaValor="primernombre";
					break;

				case ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE:
					sNombreCampoCategoriaValor="segundonombre";
					break;

				case ConyugeConstantesFunciones.LABEL_NOMBRECORTO:
					sNombreCampoCategoriaValor="nombrecorto";
					break;

				case ConyugeConstantesFunciones.LABEL_ESACTIVO:
					sNombreCampoCategoriaValor="esactivo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoConyuge.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoConyuge.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"idvaloridentificacion");
					break;

				case ConyugeConstantesFunciones.LABEL_IDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"identificacion");
					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido Paterno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellidopaterno");
					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido Materno",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellidomaterno");
					break;

				case ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Primer Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"primernombre");
					break;

				case ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Segundo Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"segundonombre");
					break;

				case ConyugeConstantesFunciones.LABEL_NOMBRECORTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Corto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombrecorto");
					break;

				case ConyugeConstantesFunciones.LABEL_ESACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esactivo");
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
	
	public void jButtonGenerarExcelReporteDinamicoConyugeActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();		
		
		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conyuge";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Conyuges");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoConyuge.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoConyuge.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
					iRow++;

					for(Conyuge conyuge:conyugesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conyuge.gettipoidentificacion_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConyugeConstantesFunciones.LABEL_IDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConyugeConstantesFunciones.LABEL_IDENTIFICACION);
					iRow++;

					for(Conyuge conyuge:conyugesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conyuge.getidentificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO);
					iRow++;

					for(Conyuge conyuge:conyugesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conyuge.getapellidopaterno());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO);
					iRow++;

					for(Conyuge conyuge:conyugesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conyuge.getapellidomaterno());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE);
					iRow++;

					for(Conyuge conyuge:conyugesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conyuge.getprimernombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE);
					iRow++;

					for(Conyuge conyuge:conyugesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conyuge.getsegundonombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConyugeConstantesFunciones.LABEL_NOMBRECORTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConyugeConstantesFunciones.LABEL_NOMBRECORTO);
					iRow++;

					for(Conyuge conyuge:conyugesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conyuge.getnombrecorto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ConyugeConstantesFunciones.LABEL_ESACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ConyugeConstantesFunciones.LABEL_ESACTIVO);
					iRow++;

					for(Conyuge conyuge:conyugesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(conyuge.getesactivo());
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
			//	this.getFilaCabeceraExportarExcelConyuge(row);				
			//	iRow++;
			//}				
			
			//for(Conyuge conyugeAux:conyugesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelConyuge(conyugeAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
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
				this.conyugeLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConyuge(false);
			
			//SI ES MANUAL
			if(ConyugeJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualConyuge();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresConyugeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConyuge(false);
			
			//SI ES MANUAL
			if(ConyugeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConyuge();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesConyugeActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingConyuge(false);
			
			//SI ES MANUAL
			if(ConyugeJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualConyuge();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaConyuge() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosConyuge.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosConyuge.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosConyuge.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosConyuge.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosConyuge.setMinimumSize(dimensionMinimum);
		this.jTableDatosConyuge.setMaximumSize(dimensionMaximum);
		this.jTableDatosConyuge.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingConyuge(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingConyuge(esInicializar,true);
	}
	
	public void inicializarActualizarBindingConyuge(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaConyuge(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesConyuge(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasConyuge(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConyuge(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesConyuge(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ConyugeJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualConyuge() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaConyuge();
		
		this.inicializarActualizarBindingBotonesManualConyuge(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualConyuge();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesConyuge() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualConyuge(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualConyuge(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosConyuge.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosConyuge.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteConyuge.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormConyuge!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormConyuge.jCheckBoxPostAccionNuevoConyuge.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormConyuge.jCheckBoxPostAccionSinCerrarConyuge.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormConyuge.jCheckBoxPostAccionSinMensajeConyuge.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosConyuge.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosConyuge.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteConyuge.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormConyuge!=null) {
				this.jInternalFrameDetalleFormConyuge.jCheckBoxPostAccionNuevoConyuge.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormConyuge.jCheckBoxPostAccionSinCerrarConyuge.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormConyuge.jCheckBoxPostAccionSinMensajeConyuge.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionConyuge.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionConyuge.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormConyuge!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesConyuge.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoConyuge!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConyuge.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesConyuge.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesConyuge.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarConyuge.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesConyuge.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoConyuge!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoConyuge.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesConyuge.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralConyuge.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesConyuge(Boolean esInicializar) throws Exception {
		try	{	
			if(ConyugeJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualConyuge(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesConyuge() throws Exception {
		try	{
			if(ConyugeJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualConyuge();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConyuge() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualConyuge() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesConyuge.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesConyuge.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesConyuge.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesConyuge.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesConyuge.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesConyuge.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionConyuge.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionConyuge.addItem(reporte);
			}
			
			
			if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionConyuge.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionConyuge.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesConyuge.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesConyuge.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesConyuge.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesConyuge.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarConyuge.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarConyuge.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarConyuge.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConyuge();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualConyuge() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConyuge!=null) {
				this.jInternalFrameReporteDinamicoConyuge.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoConyuge.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoConyuge!=null) {
				this.jInternalFrameReporteDinamicoConyuge.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoConyuge.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoConyuge!=null) {
				
				if(this.jInternalFrameReporteDinamicoConyuge.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConyuge.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConyuge.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoConyuge.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoConyuge.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoConyuge.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualConyuge()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_clienteFK_IdClienteConyuge.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteConyuge.getSelectedItem()).getId();}
		if(this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.getSelectedItem()!=null){this.idvaloridentificacionFK_IdValorIdentificacion=((TipoIdentificacion)this.jComboBoxidvaloridentificacionFK_IdValorIdentificacionConyuge.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasConyuge(Boolean esInicializar) throws Exception {				
		if(ConyugeJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualConyuge();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaConyuge() throws Exception {
		this.inicializarActualizarBindingTablaConyuge(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByConyuge() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosConyugeOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyugeOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaConyuge(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=conyugeLogic.getConyuges().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=conyuges.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosConyuge.setModel(new ConyugeModel(this.conyugeLogic.getConyuges(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosConyuge.setModel(new ConyugeModel(this.conyuges,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByConyuge!=null && this.jInternalFrameOrderByConyuge.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByConyuge();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ConyugeConstantesFunciones.SCLASSWEBTITULO,conyugeConstantesFunciones.resaltarSeleccionarConyuge,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ConyugeConstantesFunciones.SCLASSWEBTITULO,conyugeConstantesFunciones.resaltarSeleccionarConyuge,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_ID));

		if(this.conyugeConstantesFunciones.mostrarid_clienteConyuge && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConyugeConstantesFunciones.LABEL_ID,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.conyugeConstantesFunciones.resaltarid_clienteConyuge,this.conyugeConstantesFunciones.activarid_clienteConyuge,this,true,"id_clienteConyuge","CON_BUSQUEDA"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conyugeConstantesFunciones.resaltarid_clienteConyuge,this.conyugeConstantesFunciones.activarid_clienteConyuge,this,true,"id_clienteConyuge","CON_BUSQUEDA",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION));

		if(this.conyugeConstantesFunciones.mostraridvaloridentificacionConyuge && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoIdentificacionTableCell(this.tipoidentificacionsForeignKey,this.conyugeConstantesFunciones.resaltaridvaloridentificacionConyuge,this,this.conyugeConstantesFunciones.activaridvaloridentificacionConyuge));
			tableColumn.setCellEditor(new TipoIdentificacionTableCell(this.tipoidentificacionsForeignKey,this.conyugeConstantesFunciones.resaltaridvaloridentificacionConyuge,this,this.conyugeConstantesFunciones.activaridvaloridentificacionConyuge,true,"idvaloridentificacionConyuge","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_IDENTIFICACION));

		if(this.conyugeConstantesFunciones.mostraridentificacionConyuge && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConyugeConstantesFunciones.LABEL_IDENTIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conyugeConstantesFunciones.resaltaridentificacionConyuge,this.conyugeConstantesFunciones.activaridentificacionConyuge,this,true,"identificacionConyuge","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conyugeConstantesFunciones.resaltaridentificacionConyuge,this.conyugeConstantesFunciones.activaridentificacionConyuge,this,true,"identificacionConyuge","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO));

		if(this.conyugeConstantesFunciones.mostrarapellidopaternoConyuge && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conyugeConstantesFunciones.resaltarapellidopaternoConyuge,this.conyugeConstantesFunciones.activarapellidopaternoConyuge,this,true,"apellidopaternoConyuge","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conyugeConstantesFunciones.resaltarapellidopaternoConyuge,this.conyugeConstantesFunciones.activarapellidopaternoConyuge,this,true,"apellidopaternoConyuge","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO));

		if(this.conyugeConstantesFunciones.mostrarapellidomaternoConyuge && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conyugeConstantesFunciones.resaltarapellidomaternoConyuge,this.conyugeConstantesFunciones.activarapellidomaternoConyuge,this,true,"apellidomaternoConyuge","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conyugeConstantesFunciones.resaltarapellidomaternoConyuge,this.conyugeConstantesFunciones.activarapellidomaternoConyuge,this,true,"apellidomaternoConyuge","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE));

		if(this.conyugeConstantesFunciones.mostrarprimernombreConyuge && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conyugeConstantesFunciones.resaltarprimernombreConyuge,this.conyugeConstantesFunciones.activarprimernombreConyuge,this,true,"primernombreConyuge","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conyugeConstantesFunciones.resaltarprimernombreConyuge,this.conyugeConstantesFunciones.activarprimernombreConyuge,this,true,"primernombreConyuge","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE));

		if(this.conyugeConstantesFunciones.mostrarsegundonombreConyuge && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conyugeConstantesFunciones.resaltarsegundonombreConyuge,this.conyugeConstantesFunciones.activarsegundonombreConyuge,this,true,"segundonombreConyuge","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conyugeConstantesFunciones.resaltarsegundonombreConyuge,this.conyugeConstantesFunciones.activarsegundonombreConyuge,this,true,"segundonombreConyuge","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_NOMBRECORTO));

		if(this.conyugeConstantesFunciones.mostrarnombrecortoConyuge && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConyugeConstantesFunciones.LABEL_NOMBRECORTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.conyugeConstantesFunciones.resaltarnombrecortoConyuge,this.conyugeConstantesFunciones.activarnombrecortoConyuge,this,true,"nombrecortoConyuge","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.conyugeConstantesFunciones.resaltarnombrecortoConyuge,this.conyugeConstantesFunciones.activarnombrecortoConyuge,this,true,"nombrecortoConyuge","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosConyuge,ConyugeConstantesFunciones.LABEL_ESACTIVO));

		if(this.conyugeConstantesFunciones.mostraresactivoConyuge && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ConyugeConstantesFunciones.LABEL_ESACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.conyugeConstantesFunciones.resaltaresactivoConyuge,this.conyugeConstantesFunciones.activaresactivoConyuge));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.conyugeConstantesFunciones.resaltaresactivoConyuge,this.conyugeConstantesFunciones.activaresactivoConyuge,this,true,"esactivoConyuge","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ConyugePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.conyugeSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conyugeSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conyugeSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConyuge.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.conyugeSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.conyugeSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosConyuge.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarConyuge && this.isPermisoGuardarCambiosConyuge) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.conyugeSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.conyugeSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosConyuge.addColumn(tableColumn);
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
			
			this.jTableDatosConyuge.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConyuge && this.isPermisoGuardarCambiosConyuge) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarConyuge && this.isPermisoGuardarCambiosConyuge) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosConyuge.moveColumn(this.jTableDatosConyuge.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosConyuge.moveColumn(this.jTableDatosConyuge.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosConyuge.moveColumn(this.jTableDatosConyuge.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosConyuge.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosConyuge.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosConyuge,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosConyuge.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosConyuge.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosConyuge.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosConyuge.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosConyuge.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
		//this.jTableDatosConyuge.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosConyuge.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosConyuge();
			
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
				
				//this.isEsNuevoConyuge=false;
					
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
				if(this.conyugeSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormConyuge==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConyuge.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConyuge.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.conyuge.getsType().equals("DUPLICADO")
				   || this.conyuge.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoConyuge=true;
				
				} else {
					this.isEsNuevoConyuge=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.conyugeSessionBean.getEsGuardarRelacionado()) {
					if(this.conyuge.getId()>=0 && !this.conyuge.getIsNew()) {						
						this.isEsNuevoConyuge=false;
						
					} else {
						this.isEsNuevoConyuge=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoConyuge(esRelaciones);						
				
				this.seleccionarConyuge(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.conyuge.getId()<0) {
					this.isEsNuevoConyuge=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarConyuge(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarConyuge(evt,rowIndex);
				}	
				
				if(this.conyugeSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Conyuge: " + this.dDif); 
					}
				}								
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarConyuge(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.conyuge)) {
					if(this.conyuge.getId()>0) {
						this.conyuge.setIsDeleted(true);
						
						this.conyugesEliminados.add(this.conyuge);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.conyugeLogic.getConyuges().remove(this.conyuge);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.conyuges.remove(this.conyuge);				
					}
					
					
					((ConyugeModel) this.jTableDatosConyuge.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaConyuge(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarConyuge(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoConyuge) {
			
			if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosConyuge.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosConyuge.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioConyuge(this.conyuge);
				}
				
				//ARCHITECTURE
				try {
					

					//Cliente
					if(!this.conyugeConstantesFunciones.cargarid_clienteConyuge || this.conyugeConstantesFunciones.event_dependid_clienteConyuge) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.conyuge.getid_cliente());
									//this.inicializarActualizarBindingConyuge(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(conyuge.getCliente()!=null) {
							this.clientesForeignKey.add(conyuge.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.conyuge.getid_cliente(),false,"Formulario");

					//TipoIdentificacion
					if(!this.conyugeConstantesFunciones.cargaridvaloridentificacionConyuge || this.conyugeConstantesFunciones.event_dependidvaloridentificacionConyuge) {
						//this.cargarCombosTipoIdentificacionsForeignKeyLista(" where id="+this.conyuge.getidvaloridentificacion());
									//this.inicializarActualizarBindingConyuge(false,false);
						this.tipoidentificacionsForeignKey=new ArrayList<TipoIdentificacion>();

						if(conyuge.getTipoIdentificacion()!=null) {
							this.tipoidentificacionsForeignKey.add(conyuge.getTipoIdentificacion());
						}

						this.addItemDefectoCombosForeignKeyTipoIdentificacion();
						this.cargarCombosFrameTipoIdentificacionsForeignKey("Todos");
					}
					this.setActualTipoIdentificacionForeignKey(this.conyuge.getidvaloridentificacion(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesConyuge("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesConyuge(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualConyuge() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoConyuge(Conyuge conyuge) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoConyuge(conyuge,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoConyuge(Conyuge conyuge,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioConyuge(conyuge);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyConyuge(conyuge,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyConyuge(conyuge);
	}
	
	public void setVariablesObjetoActualToFormularioConyuge(Conyuge conyuge) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.setText(conyuge.getId().toString());
			this.jInternalFrameDetalleFormConyuge.jTextFieldidentificacionConyuge.setText(conyuge.getidentificacion());
			this.jInternalFrameDetalleFormConyuge.jTextAreaapellidopaternoConyuge.setText(conyuge.getapellidopaterno());
			this.jInternalFrameDetalleFormConyuge.jTextAreaapellidomaternoConyuge.setText(conyuge.getapellidomaterno());
			this.jInternalFrameDetalleFormConyuge.jTextAreaprimernombreConyuge.setText(conyuge.getprimernombre());
			this.jInternalFrameDetalleFormConyuge.jTextAreasegundonombreConyuge.setText(conyuge.getsegundonombre());
			this.jInternalFrameDetalleFormConyuge.jTextAreanombrecortoConyuge.setText(conyuge.getnombrecorto());
			this.jInternalFrameDetalleFormConyuge.jCheckBoxesactivoConyuge.setSelected(conyuge.getesactivo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Conyuge conyugeLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,conyugeLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Conyuge conyugeLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				conyugeLocal=this.conyuge;
			} else {
				conyugeLocal=this.conyugeAnterior;
			}
		}
		
		if(this.permiteMantenimiento(conyugeLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoConyuge(conyugeLocal,true);
					
					if(conyugeSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(conyugeLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.conyugeSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(conyugeLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoConyuge(Conyuge conyuge,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConyuge(conyuge,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysConyuge(conyuge);
	}
	
	public void setVariablesFormularioToObjetoActualConyuge(Conyuge conyuge,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualConyuge(conyuge,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualConyuge(Conyuge conyuge,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			
			if(this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.getText()==null || this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.getText()=="" || this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.getText()=="Id") {
				this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.setText("0");
			}

			if(conColumnasBase) {conyuge.setId(Long.parseLong(this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.getText()));}

		try {
			conyuge.setidentificacion(this.jInternalFrameDetalleFormConyuge.jTextFieldidentificacionConyuge.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConyugeConstantesFunciones.LABEL_IDENTIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelidentificacionConyuge,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conyuge.setapellidopaterno(this.jInternalFrameDetalleFormConyuge.jTextAreaapellidopaternoConyuge.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelapellidopaternoConyuge,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conyuge.setapellidomaterno(this.jInternalFrameDetalleFormConyuge.jTextAreaapellidomaternoConyuge.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelapellidomaternoConyuge,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conyuge.setprimernombre(this.jInternalFrameDetalleFormConyuge.jTextAreaprimernombreConyuge.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelprimernombreConyuge,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conyuge.setsegundonombre(this.jInternalFrameDetalleFormConyuge.jTextAreasegundonombreConyuge.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelsegundonombreConyuge,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conyuge.setnombrecorto(this.jInternalFrameDetalleFormConyuge.jTextAreanombrecortoConyuge.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConyugeConstantesFunciones.LABEL_NOMBRECORTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelnombrecortoConyuge,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			conyuge.setesactivo(this.jInternalFrameDetalleFormConyuge.jCheckBoxesactivoConyuge.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ConyugeConstantesFunciones.LABEL_ESACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormConyuge.jLabelesactivoConyuge,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualConyuge(Conyuge conyugeBean,Conyuge conyuge,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conyugeBean.getId()!=null && !conyugeBean.getId().equals(-1L))) {conyuge.setId(conyugeBean.getId());}}
			if(conDefault || (!conDefault && conyugeBean.getidvaloridentificacion()!=null && !conyugeBean.getidvaloridentificacion().equals(-1L))) {conyuge.setidvaloridentificacion(conyugeBean.getidvaloridentificacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosConyuge(Conyuge conyugeOrigen,Conyuge conyuge,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conyugeOrigen.getId()!=null && !conyugeOrigen.getId().equals(-1L))) {conyuge.setId(conyugeOrigen.getId());}}
			if(conDefault || (!conDefault && conyugeOrigen.getidvaloridentificacion()!=null && !conyugeOrigen.getidvaloridentificacion().equals(-1L))) {conyuge.setidvaloridentificacion(conyugeOrigen.getidvaloridentificacion());}
			if(conDefault || (!conDefault && conyugeOrigen.getidentificacion()!=null && !conyugeOrigen.getidentificacion().equals(""))) {conyuge.setidentificacion(conyugeOrigen.getidentificacion());}
			if(conDefault || (!conDefault && conyugeOrigen.getapellidopaterno()!=null && !conyugeOrigen.getapellidopaterno().equals(""))) {conyuge.setapellidopaterno(conyugeOrigen.getapellidopaterno());}
			if(conDefault || (!conDefault && conyugeOrigen.getapellidomaterno()!=null && !conyugeOrigen.getapellidomaterno().equals(""))) {conyuge.setapellidomaterno(conyugeOrigen.getapellidomaterno());}
			if(conDefault || (!conDefault && conyugeOrigen.getprimernombre()!=null && !conyugeOrigen.getprimernombre().equals(""))) {conyuge.setprimernombre(conyugeOrigen.getprimernombre());}
			if(conDefault || (!conDefault && conyugeOrigen.getsegundonombre()!=null && !conyugeOrigen.getsegundonombre().equals(""))) {conyuge.setsegundonombre(conyugeOrigen.getsegundonombre());}
			if(conDefault || (!conDefault && conyugeOrigen.getnombrecorto()!=null && !conyugeOrigen.getnombrecorto().equals(""))) {conyuge.setnombrecorto(conyugeOrigen.getnombrecorto());}
			if(conDefault || (!conDefault && conyugeOrigen.getesactivo()!=null && !conyugeOrigen.getesactivo().equals(false))) {conyuge.setesactivo(conyugeOrigen.getesactivo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConyuge(Conyuge conyuge) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.setText(conyuge.getId().toString());
			this.jInternalFrameDetalleFormConyuge.jTextFieldidentificacionConyuge.setText(conyuge.getidentificacion());
			this.jInternalFrameDetalleFormConyuge.jTextAreaapellidopaternoConyuge.setText(conyuge.getapellidopaterno());
			this.jInternalFrameDetalleFormConyuge.jTextAreaapellidomaternoConyuge.setText(conyuge.getapellidomaterno());
			this.jInternalFrameDetalleFormConyuge.jTextAreaprimernombreConyuge.setText(conyuge.getprimernombre());
			this.jInternalFrameDetalleFormConyuge.jTextAreasegundonombreConyuge.setText(conyuge.getsegundonombre());
			this.jInternalFrameDetalleFormConyuge.jTextAreanombrecortoConyuge.setText(conyuge.getnombrecorto());
			this.jInternalFrameDetalleFormConyuge.jCheckBoxesactivoConyuge.setSelected(conyuge.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioConyuge(ConyugeBean conyugeBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.setText(conyugeBean.getId().toString());
			this.jInternalFrameDetalleFormConyuge.jTextFieldidentificacionConyuge.setText(conyugeBean.getidentificacion());
			this.jInternalFrameDetalleFormConyuge.jTextAreaapellidopaternoConyuge.setText(conyugeBean.getapellidopaterno());
			this.jInternalFrameDetalleFormConyuge.jTextAreaapellidomaternoConyuge.setText(conyugeBean.getapellidomaterno());
			this.jInternalFrameDetalleFormConyuge.jTextAreaprimernombreConyuge.setText(conyugeBean.getprimernombre());
			this.jInternalFrameDetalleFormConyuge.jTextAreasegundonombreConyuge.setText(conyugeBean.getsegundonombre());
			this.jInternalFrameDetalleFormConyuge.jTextAreanombrecortoConyuge.setText(conyugeBean.getnombrecorto());
			this.jInternalFrameDetalleFormConyuge.jCheckBoxesactivoConyuge.setSelected(conyugeBean.getesactivo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanConyuge(ConyugeParameterReturnGeneral conyugeReturnGeneral,ConyugeBean conyugeBean,Boolean conDefault) throws Exception { 
		try {
			Conyuge conyugeLocal=new Conyuge();
			
			conyugeLocal=conyugeReturnGeneral.getConyuge();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && conyugeLocal.getId()!=null && !conyugeLocal.getId().equals(-1L))) {conyugeBean.setId(conyugeLocal.getId());}}
			if(conDefault || (!conDefault && conyugeLocal.getidvaloridentificacion()!=null && !conyugeLocal.getidvaloridentificacion().equals(-1L))) {conyugeBean.setidvaloridentificacion(conyugeLocal.getidvaloridentificacion());}
			if(conDefault || (!conDefault && conyugeLocal.getidentificacion()!=null && !conyugeLocal.getidentificacion().equals(""))) {conyugeBean.setidentificacion(conyugeLocal.getidentificacion());}
			if(conDefault || (!conDefault && conyugeLocal.getapellidopaterno()!=null && !conyugeLocal.getapellidopaterno().equals(""))) {conyugeBean.setapellidopaterno(conyugeLocal.getapellidopaterno());}
			if(conDefault || (!conDefault && conyugeLocal.getapellidomaterno()!=null && !conyugeLocal.getapellidomaterno().equals(""))) {conyugeBean.setapellidomaterno(conyugeLocal.getapellidomaterno());}
			if(conDefault || (!conDefault && conyugeLocal.getprimernombre()!=null && !conyugeLocal.getprimernombre().equals(""))) {conyugeBean.setprimernombre(conyugeLocal.getprimernombre());}
			if(conDefault || (!conDefault && conyugeLocal.getsegundonombre()!=null && !conyugeLocal.getsegundonombre().equals(""))) {conyugeBean.setsegundonombre(conyugeLocal.getsegundonombre());}
			if(conDefault || (!conDefault && conyugeLocal.getnombrecorto()!=null && !conyugeLocal.getnombrecorto().equals(""))) {conyugeBean.setnombrecorto(conyugeLocal.getnombrecorto());}
			if(conDefault || (!conDefault && conyugeLocal.getesactivo()!=null && !conyugeLocal.getesactivo().equals(false))) {conyugeBean.setesactivo(conyugeLocal.getesactivo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxConyugeGenerico(Long idConyugeSeleccionado,JComboBox jComboBoxConyuge,List<Conyuge> conyugesLocal)throws Exception {
		try {
			Conyuge  conyugeTemp=null;

			for(Conyuge conyugeAux:conyugesLocal) {
				if(conyugeAux.getId()!=null && conyugeAux.getId().equals(idConyugeSeleccionado)) {
					conyugeTemp=conyugeAux;
					break;
				}
			}

			jComboBoxConyuge.setSelectedItem(conyugeTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxConyugeGenerico(JComboBox jComboBoxConyuge,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConyuge.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxConyuge.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxConyuge.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxConyuge.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxConyuge.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxConyuge.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conyuge=(Conyuge) conyugeLogic.getConyuges().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conyuge =(Conyuge) conyuges.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!conyuge.getIsNew() && !conyuge.getIsChanged() && !conyuge.getIsDeleted()) {
				sDescripcion=conyuge.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=conyuge.getcliente_descripcion();
			}
		}

		if(sTipo.equals("TipoIdentificacion")) {
			//sDescripcion=this.getActualTipoIdentificacionForeignKeyDescripcion((Long)value);
			if(!conyuge.getIsNew() && !conyuge.getIsChanged() && !conyuge.getIsDeleted()) {
				sDescripcion=conyuge.gettipoidentificacion_descripcion();
			} else {
				//sDescripcion=this.getActualTipoIdentificacionForeignKeyDescripcion((Long)value);
				sDescripcion=conyuge.gettipoidentificacion_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Conyuge conyugeRow=new Conyuge();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conyugeRow=(Conyuge) conyugeLogic.getConyuges().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			conyugeRow=(Conyuge) conyuges.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualConyuge(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoConyuge.setVisible((this.isVisibilidadCeldaNuevoConyuge && this.isPermisoNuevoConyuge));			
			this.jButtonDuplicarConyuge.setVisible((this.isVisibilidadCeldaDuplicarConyuge && this.isPermisoDuplicarConyuge));			
			this.jButtonCopiarConyuge.setVisible((this.isVisibilidadCeldaCopiarConyuge && this.isPermisoCopiarConyuge));
			this.jButtonVerFormConyuge.setVisible((this.isVisibilidadCeldaVerFormConyuge && this.isPermisoVerFormConyuge));
			
			this.jButtonAbrirOrderByConyuge.setVisible((this.isVisibilidadCeldaOrdenConyuge && this.isPermisoOrdenConyuge));			
			
			this.jButtonNuevoRelacionesConyuge.setVisible((this.isVisibilidadCeldaNuevoRelacionesConyuge && this.isPermisoNuevoConyuge));			
			this.jButtonNuevoGuardarCambiosConyuge.setVisible((this.isVisibilidadCeldaNuevoConyuge && this.isPermisoNuevoConyuge && this.isPermisoGuardarCambiosConyuge));
			
			if(this.jInternalFrameDetalleFormConyuge!=null) {
			this.jInternalFrameDetalleFormConyuge.jButtonModificarConyuge.setVisible((this.isVisibilidadCeldaModificarConyuge && this.isPermisoActualizarConyuge));	
			this.jInternalFrameDetalleFormConyuge.jButtonActualizarConyuge.setVisible((this.isVisibilidadCeldaActualizarConyuge && this.isPermisoActualizarConyuge));	
			this.jInternalFrameDetalleFormConyuge.jButtonEliminarConyuge.setVisible((this.isVisibilidadCeldaEliminarConyuge && this.isPermisoEliminarConyuge));
			this.jInternalFrameDetalleFormConyuge.jButtonCancelarConyuge.setVisible(this.isVisibilidadCeldaCancelarConyuge);							
			this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosConyuge.setVisible((this.isVisibilidadCeldaGuardarConyuge && this.isPermisoGuardarCambiosConyuge));			
			
			}
						
			this.jButtonGuardarCambiosTablaConyuge.setVisible((this.isVisibilidadCeldaGuardarCambiosConyuge && this.isPermisoGuardarCambiosConyuge));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarConyuge.setVisible((this.isVisibilidadCeldaNuevoConyuge && this.isPermisoNuevoConyuge));						
			this.jButtonDuplicarToolBarConyuge.setVisible((this.isVisibilidadCeldaDuplicarConyuge && this.isPermisoDuplicarConyuge));						
			this.jButtonCopiarToolBarConyuge.setVisible((this.isVisibilidadCeldaCopiarConyuge && this.isPermisoCopiarConyuge));			
			this.jButtonVerFormToolBarConyuge.setVisible((this.isVisibilidadCeldaVerFormConyuge && this.isPermisoVerFormConyuge));			
			this.jButtonAbrirOrderByToolBarConyuge.setVisible((this.isVisibilidadCeldaOrdenConyuge && this.isPermisoOrdenConyuge));
			this.jButtonNuevoRelacionesToolBarConyuge.setVisible((this.isVisibilidadCeldaNuevoRelacionesConyuge && this.isPermisoNuevoConyuge));			
			this.jButtonNuevoGuardarCambiosToolBarConyuge.setVisible((this.isVisibilidadCeldaNuevoConyuge && this.isPermisoNuevoConyuge && this.isPermisoGuardarCambiosConyuge));			
			
			if(this.jInternalFrameDetalleFormConyuge!=null) {
			this.jInternalFrameDetalleFormConyuge.jButtonModificarToolBarConyuge.setVisible((this.isVisibilidadCeldaModificarConyuge && this.isPermisoActualizarConyuge));	
			this.jInternalFrameDetalleFormConyuge.jButtonActualizarToolBarConyuge.setVisible((this.isVisibilidadCeldaActualizarConyuge  && this.isPermisoActualizarConyuge));	
			this.jInternalFrameDetalleFormConyuge.jButtonEliminarToolBarConyuge.setVisible((this.isVisibilidadCeldaEliminarConyuge && this.isPermisoEliminarConyuge));
			this.jInternalFrameDetalleFormConyuge.jButtonCancelarToolBarConyuge.setVisible(this.isVisibilidadCeldaCancelarConyuge);				
			this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosToolBarConyuge.setVisible((this.isVisibilidadCeldaGuardarConyuge && this.isPermisoGuardarCambiosConyuge));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarConyuge.setVisible((this.isVisibilidadCeldaGuardarCambiosConyuge && this.isPermisoGuardarCambiosConyuge));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoConyuge.setVisible((this.isVisibilidadCeldaNuevoConyuge && this.isPermisoNuevoConyuge));			
			this.jMenuItemDuplicarConyuge.setVisible((this.isVisibilidadCeldaDuplicarConyuge && this.isPermisoDuplicarConyuge));			
			this.jMenuItemCopiarConyuge.setVisible((this.isVisibilidadCeldaCopiarConyuge && this.isPermisoCopiarConyuge));			
			this.jMenuItemVerFormConyuge.setVisible((this.isVisibilidadCeldaVerFormConyuge && this.isPermisoVerFormConyuge));			
			this.jMenuItemAbrirOrderByConyuge.setVisible((this.isVisibilidadCeldaOrdenConyuge && this.isPermisoOrdenConyuge));			
			//this.jMenuItemMostrarOcultarConyuge.setVisible((this.isVisibilidadCeldaOrdenConyuge && this.isPermisoOrdenConyuge));
			this.jMenuItemDetalleAbrirOrderByConyuge.setVisible((this.isVisibilidadCeldaOrdenConyuge && this.isPermisoOrdenConyuge));			
			//this.jMenuItemDetalleMostrarOcultarConyuge.setVisible((this.isVisibilidadCeldaOrdenConyuge && this.isPermisoOrdenConyuge));			
			this.jMenuItemNuevoRelacionesConyuge.setVisible((this.isVisibilidadCeldaNuevoRelacionesConyuge && this.isPermisoNuevoConyuge));			
			this.jMenuItemNuevoGuardarCambiosConyuge.setVisible((this.isVisibilidadCeldaNuevoConyuge && this.isPermisoNuevoConyuge && this.isPermisoGuardarCambiosConyuge));									
			
			if(this.jInternalFrameDetalleFormConyuge!=null) {
			this.jInternalFrameDetalleFormConyuge.jMenuItemModificarConyuge.setVisible((this.isVisibilidadCeldaModificarConyuge && this.isPermisoActualizarConyuge));	
			this.jInternalFrameDetalleFormConyuge.jMenuItemActualizarConyuge.setVisible((this.isVisibilidadCeldaActualizarConyuge && this.isPermisoActualizarConyuge));	
			this.jInternalFrameDetalleFormConyuge.jMenuItemEliminarConyuge.setVisible((this.isVisibilidadCeldaEliminarConyuge && this.isPermisoEliminarConyuge));
			this.jInternalFrameDetalleFormConyuge.jMenuItemCancelarConyuge.setVisible(this.isVisibilidadCeldaCancelarConyuge);				
			}
			
			this.jMenuItemGuardarCambiosConyuge.setVisible((this.isVisibilidadCeldaGuardarConyuge && this.isPermisoGuardarCambiosConyuge));						
			this.jMenuItemGuardarCambiosTablaConyuge.setVisible((this.isVisibilidadCeldaGuardarCambiosConyuge && this.isPermisoGuardarCambiosConyuge));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoConyuge=this.jButtonNuevoConyuge.isVisible();
			this.isVisibilidadCeldaDuplicarConyuge=this.jButtonDuplicarConyuge.isVisible();
			this.isVisibilidadCeldaCopiarConyuge=this.jButtonCopiarConyuge.isVisible();
			this.isVisibilidadCeldaVerFormConyuge=this.jButtonVerFormConyuge.isVisible();
			
			this.isVisibilidadCeldaOrdenConyuge=this.jButtonAbrirOrderByConyuge.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesConyuge=this.jButtonNuevoRelacionesConyuge.isVisible();
			this.isVisibilidadCeldaModificarConyuge=this.jButtonModificarConyuge.isVisible();
			
			if(this.jInternalFrameDetalleFormConyuge!=null) {
			this.isVisibilidadCeldaActualizarConyuge=this.jInternalFrameDetalleFormConyuge.jButtonActualizarConyuge.isVisible();
			this.isVisibilidadCeldaEliminarConyuge=this.jInternalFrameDetalleFormConyuge.jButtonEliminarConyuge.isVisible();
			this.isVisibilidadCeldaCancelarConyuge=this.jInternalFrameDetalleFormConyuge.jButtonCancelarConyuge.isVisible();
			this.isVisibilidadCeldaGuardarConyuge=this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosConyuge.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosConyuge=this.jButtonGuardarCambiosTablaConyuge.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoConyuge=this.jButtonNuevoToolBarConyuge.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConyuge=this.jButtonNuevoRelacionesToolBarConyuge.isVisible();
			
			if(this.jInternalFrameDetalleFormConyuge!=null) {
			this.isVisibilidadCeldaModificarConyuge=this.jInternalFrameDetalleFormConyuge.jButtonModificarToolBarConyuge.isVisible();
			this.isVisibilidadCeldaActualizarConyuge=this.jInternalFrameDetalleFormConyuge.jButtonActualizarToolBarConyuge.isVisible();
			this.isVisibilidadCeldaEliminarConyuge=this.jInternalFrameDetalleFormConyuge.jButtonEliminarToolBarConyuge.isVisible();
			this.isVisibilidadCeldaCancelarConyuge=this.jInternalFrameDetalleFormConyuge.jButtonCancelarToolBarConyuge.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConyuge=this.jButtonGuardarCambiosToolBarConyuge.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConyuge=this.jButtonGuardarCambiosTablaToolBarConyuge.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoConyuge=this.jMenuItemNuevoConyuge.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesConyuge=this.jMenuItemNuevoRelacionesConyuge.isVisible();
			
			if(this.jInternalFrameDetalleFormConyuge!=null) {
			this.isVisibilidadCeldaModificarConyuge=this.jInternalFrameDetalleFormConyuge.jMenuItemModificarConyuge.isVisible();
			this.isVisibilidadCeldaActualizarConyuge=this.jInternalFrameDetalleFormConyuge.jMenuItemActualizarConyuge.isVisible();
			this.isVisibilidadCeldaEliminarConyuge=this.jInternalFrameDetalleFormConyuge.jMenuItemEliminarConyuge.isVisible();
			this.isVisibilidadCeldaCancelarConyuge=this.jInternalFrameDetalleFormConyuge.jMenuItemCancelarConyuge.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarConyuge=this.jMenuItemGuardarCambiosConyuge.isVisible();
			this.isVisibilidadCeldaGuardarCambiosConyuge=this.jMenuItemGuardarCambiosTablaConyuge.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesConyuge(Boolean esInicializar) {
		if(ConyugeJInternalFrame.ISBINDING_MANUAL) {			
			if(this.conyugeSessionBean.getConGuardarRelaciones()) {
				//if(this.conyugeSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesConyuge();
			}
			
			this.inicializarActualizarBindingBotonesManualConyuge(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualConyuge() {
		this.jButtonNuevoConyuge.setVisible(this.isPermisoNuevoConyuge);			
		this.jButtonDuplicarConyuge.setVisible(this.isPermisoDuplicarConyuge);			
		this.jButtonCopiarConyuge.setVisible(this.isPermisoCopiarConyuge);			
		this.jButtonVerFormConyuge.setVisible(this.isPermisoVerFormConyuge);			
		
		this.jButtonAbrirOrderByConyuge.setVisible(this.isPermisoOrdenConyuge);					
		
		this.jButtonNuevoRelacionesConyuge.setVisible(this.isPermisoNuevoConyuge);			
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonModificarConyuge.setVisible(this.isPermisoActualizarConyuge);	
			this.jInternalFrameDetalleFormConyuge.jButtonActualizarConyuge.setVisible(this.isPermisoActualizarConyuge);	
			this.jInternalFrameDetalleFormConyuge.jButtonEliminarConyuge.setVisible(this.isPermisoEliminarConyuge);
			this.jInternalFrameDetalleFormConyuge.jButtonCancelarConyuge.setVisible(this.isVisibilidadCeldaCancelarConyuge);						
			this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosConyuge.setVisible(this.isPermisoGuardarCambiosConyuge);							
		}
		
		this.jButtonGuardarCambiosTablaConyuge.setVisible(this.isPermisoActualizarConyuge);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleConyuge() {
		this.jInternalFrameDetalleFormConyuge.jButtonModificarConyuge.setVisible(this.isPermisoActualizarConyuge);	
		this.jInternalFrameDetalleFormConyuge.jButtonActualizarConyuge.setVisible(this.isPermisoActualizarConyuge);	
		this.jInternalFrameDetalleFormConyuge.jButtonEliminarConyuge.setVisible(this.isPermisoEliminarConyuge);
		this.jInternalFrameDetalleFormConyuge.jButtonCancelarConyuge.setVisible(this.isVisibilidadCeldaCancelarConyuge);							
		this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosConyuge.setVisible((this.isVisibilidadCeldaGuardarConyuge && this.isPermisoGuardarCambiosConyuge));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosConyuge() {
		if(ConyugeJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualConyuge();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesConyuge() {
	}
	
	public void jTableDatosConyugeListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarConyuge(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonid_clienteConyugeActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderConyuge=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosConyuge.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderConyuge=(TitledBorder)this.jScrollPanelDatosConyuge.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderConyuge.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteConyugeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebConyuge(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConyuge.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConyuge.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.conyugeLogic.getConnexion());

				if(this.conyuge.getId()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.conyuge.getId());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConyuge=(TitledBorder)this.jScrollPanelDatosConyuge.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderConyuge.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteConyugeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conyuge==null) {
						this.conyuge = new Conyuge();
					}

					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				}

				if(this.conyuge.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.conyuge.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConyuge(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidvaloridentificacionConyugeUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoidentificacion=true;

			idTienePermisotipoidentificacion=this.tienePermisosUsuarioEnPaginaWebConyuge(TipoIdentificacionConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoidentificacion) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosConyuge.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosConyuge.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);

				this.tipoidentificacionBeanSwingJInternalFrame=new TipoIdentificacionBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoidentificacionBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoidentificacionBeanSwingJInternalFrame.getTipoIdentificacionLogic().setConnexion(this.conyugeLogic.getConnexion());

				if(this.conyuge.getidvaloridentificacion()!=null) {
					this.tipoidentificacionBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoidentificacionBeanSwingJInternalFrame.setIdActual(this.conyuge.getidvaloridentificacion());
					this.tipoidentificacionBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoidentificacionBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoidentificacionBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoIdentificacion();
				}

				JInternalFrameBase jinternalFrame =this.tipoidentificacionBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderConyuge=(TitledBorder)this.jScrollPanelDatosConyuge.getBorder();
				TitledBorder titledBordertipoidentificacion=(TitledBorder)this.tipoidentificacionBeanSwingJInternalFrame.jScrollPanelDatosTipoIdentificacion.getBorder();

				titledBordertipoidentificacion.setTitle(titledBorderConyuge.getTitle() + " -> Tipo Identificacion");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonidvaloridentificacionConyugeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conyuge==null) {
						this.conyuge = new Conyuge();
					}

					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				}

				if(this.conyuge.getidvaloridentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where idvaloridentificacion = "+this.conyuge.getidvaloridentificacion().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConyuge(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidentificacionConyugeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conyuge==null) {
						this.conyuge = new Conyuge();
					}

					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				}

				if(this.conyuge.getidentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where identificacion like '%"+this.conyuge.getidentificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConyuge(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidopaternoConyugeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conyuge==null) {
						this.conyuge = new Conyuge();
					}

					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				}

				if(this.conyuge.getapellidopaterno()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellidopaterno like '%"+this.conyuge.getapellidopaterno()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConyuge(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidomaternoConyugeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conyuge==null) {
						this.conyuge = new Conyuge();
					}

					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				}

				if(this.conyuge.getapellidomaterno()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellidomaterno like '%"+this.conyuge.getapellidomaterno()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConyuge(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprimernombreConyugeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conyuge==null) {
						this.conyuge = new Conyuge();
					}

					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				}

				if(this.conyuge.getprimernombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where primernombre like '%"+this.conyuge.getprimernombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConyuge(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonsegundonombreConyugeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conyuge==null) {
						this.conyuge = new Conyuge();
					}

					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				}

				if(this.conyuge.getsegundonombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where segundonombre like '%"+this.conyuge.getsegundonombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConyuge(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombrecortoConyugeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conyuge==null) {
						this.conyuge = new Conyuge();
					}

					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				}

				if(this.conyuge.getnombrecorto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombrecorto like '%"+this.conyuge.getnombrecorto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConyuge(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesactivoConyugeBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosConyuge.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualConyuge(this.getconyuge(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.conyuge==null) {
						this.conyuge = new Conyuge();
					}

					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);
				}

				if(this.conyuge.getesactivo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esactivo = "+this.conyuge.getesactivo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingConyuge(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdClienteConyugeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConyuge(false,false);

			this.getConyugesFK_IdCliente();

			this.inicializarActualizarBindingConyuge(false);

			//if(ConyugeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConyuge(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdValorIdentificacionConyugeActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingConyuge(false,false);

			this.getConyugesFK_IdValorIdentificacion();

			this.inicializarActualizarBindingConyuge(false);

			//if(ConyugeBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingConyuge(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.conyugeLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameConyuge() {
		if(this.jInternalFrameDetalleFormConyuge!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormConyuge!=null) {
			this.jInternalFrameDetalleFormConyuge.setVisible(false);	    			
			this.jInternalFrameDetalleFormConyuge.dispose();
			this.jInternalFrameDetalleFormConyuge=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoConyuge!=null) {
			this.jInternalFrameReporteDinamicoConyuge.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoConyuge.dispose();
			this.jInternalFrameReporteDinamicoConyuge=null;
		}
		
		if(this.jInternalFrameImportacionConyuge!=null) {
			this.jInternalFrameImportacionConyuge.setVisible(false);	    			
			this.jInternalFrameImportacionConyuge.dispose();
			this.jInternalFrameImportacionConyuge=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessConyuge();
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
			
			if(sTipo.equals("NuevoConyuge")) {
				jButtonNuevoConyugeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarConyuge")) {
				jButtonDuplicarConyugeActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarConyuge")) {
				jButtonCopiarConyugeActionPerformed(evt);
			} else if(sTipo.equals("VerFormConyuge")) {
				jButtonVerFormConyugeActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarConyuge")) {
				jButtonNuevoConyugeActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarConyuge")) {
				jButtonDuplicarConyugeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoConyuge")) {
				jButtonNuevoConyugeActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarConyuge")) {
				jButtonDuplicarConyugeActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesConyuge")) {
				jButtonNuevoConyugeActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarConyuge")) {
				jButtonNuevoConyugeActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesConyuge")) {
				jButtonNuevoConyugeActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarConyuge")) {
				jButtonModificarConyugeActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarConyuge")) {
				jButtonModificarConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarConyuge")) {
				jButtonModificarConyugeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarConyuge")) {
				jButtonActualizarConyugeActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarConyuge")) {
				jButtonActualizarConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarConyuge")) {
				jButtonActualizarConyugeActionPerformed(evt);
			} else if(sTipo.equals("EliminarConyuge")) {
				jButtonEliminarConyugeActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarConyuge")) {
				jButtonEliminarConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarConyuge")) {
				jButtonEliminarConyugeActionPerformed(evt);
			} else if(sTipo.equals("CancelarConyuge")) {
				jButtonCancelarConyugeActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarConyuge")) {
				jButtonCancelarConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarConyuge")) {
				jButtonCancelarConyugeActionPerformed(evt);
			} else if(sTipo.equals("CerrarConyuge")) {
				jButtonCerrarConyugeActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarConyuge")) {
				jButtonCerrarConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarConyuge")) {
				jButtonCerrarConyugeActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarConyuge")) {
				jButtonMostrarOcultarConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarConyuge")) {
				jButtonCancelarConyugeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosConyuge")) {
				jButtonGuardarCambiosConyugeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarConyuge")) {
				jButtonGuardarCambiosConyugeActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarConyuge")) {
				jButtonCopiarConyugeActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarConyuge")) {
				jButtonVerFormConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosConyuge")) {
				jButtonGuardarCambiosConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarConyuge")) {
				jButtonCopiarConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormConyuge")) {
				jButtonVerFormConyugeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaConyuge")) {
				jButtonGuardarCambiosConyugeActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarConyuge")) {
				jButtonGuardarCambiosConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaConyuge")) {
				jButtonGuardarCambiosConyugeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionConyuge")) {
				jButtonRecargarInformacionConyugeActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarConyuge")) {
				jButtonRecargarInformacionConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionConyuge")) {
				jButtonRecargarInformacionConyugeActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresConyuge")) {
				jButtonAnterioresConyugeActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarConyuge")) {
				jButtonAnterioresConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreConyuge")) {
				jButtonAnterioresConyugeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesConyuge")) {
				jButtonSiguientesConyugeActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarConyuge")) {
				jButtonSiguientesConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesConyuge")) {
				jButtonSiguientesConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByConyuge") || sTipo.equals("MenuItemDetalleAbrirOrderByConyuge")) {
				jButtonAbrirOrderByConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarConyuge") || sTipo.equals("MenuItemDetalleMostrarOcultarConyuge")) {
				jButtonMostrarOcultarConyugeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosConyuge")) {
				jButtonNuevoGuardarCambiosConyugeActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarConyuge")) {
				jButtonNuevoGuardarCambiosConyugeActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosConyuge")) {
				jButtonNuevoGuardarCambiosConyugeActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoConyuge")) {
				jButtonCerrarReporteDinamicoConyugeActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoConyuge")) {
				jButtonGenerarReporteDinamicoConyugeActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoConyuge")) {
				
				jButtonGenerarExcelReporteDinamicoConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionConyuge")) {
				jButtonCerrarImportacionConyugeActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionConyuge")) {
				
				jButtonGenerarImportacionConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionConyuge")) {
				
				jButtonAbrirImportacionConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesConyuge")) {
				jComboBoxTiposAccionesConyugeActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesConyuge")) {
				jComboBoxTiposRelacionesConyugeActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioConyuge")) {
				jComboBoxTiposAccionesConyugeActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarConyuge")) {
				
				jComboBoxTiposSeleccionarConyugeActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralConyuge")) {
				jTextFieldValorCampoGeneralConyugeActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByConyuge")) {
				jButtonAbrirOrderByConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarConyuge")) {
				jButtonAbrirOrderByConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByConyuge")) {
				jButtonCerrarOrderByConyugeActionPerformed(evt);
			} 
						
			
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteConyuge")) {
				this.jButtonid_clienteConyugeActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteConyugeUpdate")) {
				this.jButtonid_clienteConyugeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteConyugeBusqueda")) {
				this.jButtonid_clienteConyugeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvaloridentificacionConyugeUpdate")) {
				this.jButtonidvaloridentificacionConyugeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvaloridentificacionConyugeBusqueda")) {
				this.jButtonidvaloridentificacionConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionConyugeBusqueda")) {
				this.jButtonidentificacionConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidopaternoConyugeBusqueda")) {
				this.jButtonapellidopaternoConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidomaternoConyugeBusqueda")) {
				this.jButtonapellidomaternoConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("primernombreConyugeBusqueda")) {
				this.jButtonprimernombreConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("segundonombreConyugeBusqueda")) {
				this.jButtonsegundonombreConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrecortoConyugeBusqueda")) {
				this.jButtonnombrecortoConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoConyugeBusqueda")) {
				this.jButtonesactivoConyugeBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteConyuge")) {
				this.jButtonid_clienteConyugeActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdClienteConyuge")) {
				this.jButtonFK_IdClienteConyugeActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdValorIdentificacionConyuge")) {
				this.jButtonFK_IdValorIdentificacionConyugeActionPerformed(evt);
			}
			
			;
			
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessConyuge();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConyugeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				


				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Conyuge conyugeLocal=null;
			
			if(!this.getEsControlTabla()) {
				conyugeLocal=this.conyuge;
			} else {
				conyugeLocal=this.conyugeAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
							
				
				


				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConyugeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeAnterior =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conyugeAnterior =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
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
			
			


			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConyugeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
								
						
				


				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
								
				
				


				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConyugeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeAnterior =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conyugeAnterior =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConyugeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeAnterior =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conyugeAnterior =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConyugeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
							
				
				


				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConyugeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyugeAnterior =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conyugeAnterior =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
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
			
			


			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConyugeActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
								
				
				


				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConyugeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeAnterior =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conyugeAnterior =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConyugeActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
			
			this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConyugeActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosConyuge")) {
					jCheckBoxSeleccionarTodosConyugeItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosConyuge")) {
					jCheckBoxSeleccionadosConyugeItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarConyuge")) {
					
				}
				
				


				
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
												
				
				


				
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConyugeActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.conyugeAnterior =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.conyugeAnterior =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConyugeActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
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
			
			


			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaConyugeActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.conyuge);
				
				this.actualizarInformacion("INFO_PADRE",false,this.conyuge);
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
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
				
				


				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Conyuge.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Conyuge.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaConyugeActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.conyugeAnterior =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.conyugeAnterior =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarConyuge")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosConyugeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosConyuge.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.conyuge =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.conyuge =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.conyuge);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarConyuge")) {
				
				}
				
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarConyuge")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosConyuge.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarConyuge")) {
			
			}
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessConyuge();
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
			if(sTipo.equals("NuevoConyuge")) {
				jButtonNuevoConyugeActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarConyuge")) {
				jButtonDuplicarConyugeActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarConyuge")) {
				jButtonCopiarConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormConyuge")) {
				jButtonVerFormConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesConyuge")) {
				jButtonNuevoConyugeActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarConyuge")) {
				jButtonModificarConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarConyuge")) {
				jButtonActualizarConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarConyuge")) {
				jButtonEliminarConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaConyuge")) {
				jButtonGuardarCambiosConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarConyuge")) {
				jButtonCancelarConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarConyuge")) {
				jButtonCerrarConyugeActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosConyuge")) {
				jButtonGuardarCambiosConyugeActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosConyuge")) {
				jButtonNuevoGuardarCambiosConyugeActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByConyuge")) {
				jButtonAbrirOrderByConyugeActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionConyuge")) {
				jButtonRecargarInformacionConyugeActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresConyuge")) {
				jButtonAnterioresConyugeActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesConyuge")) {
				jButtonSiguientesConyugeActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteConyuge")) {
				this.jButtonid_clienteConyugeActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteConyugeUpdate")) {
				this.jButtonid_clienteConyugeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteConyugeBusqueda")) {
				this.jButtonid_clienteConyugeBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("idvaloridentificacionConyugeUpdate")) {
				this.jButtonidvaloridentificacionConyugeUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idvaloridentificacionConyugeBusqueda")) {
				this.jButtonidvaloridentificacionConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionConyugeBusqueda")) {
				this.jButtonidentificacionConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidopaternoConyugeBusqueda")) {
				this.jButtonapellidopaternoConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidomaternoConyugeBusqueda")) {
				this.jButtonapellidomaternoConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("primernombreConyugeBusqueda")) {
				this.jButtonprimernombreConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("segundonombreConyugeBusqueda")) {
				this.jButtonsegundonombreConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombrecortoConyugeBusqueda")) {
				this.jButtonnombrecortoConyugeBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esactivoConyugeBusqueda")) {
				this.jButtonesactivoConyugeBusquedaActionPerformed(evt);
			}
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessConyuge();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameConyuge")) {
				closingInternalFrameConyuge();
				
			} else if(sTipo.equals("jButtonCancelarConyuge")) {
				JInternalFrameBase jInternalFrameDetalleFormConyuge = (JInternalFrameBase)evt.getSource();
	            	
	            ConyugeBeanSwingJInternalFrame jInternalFrameParent=(ConyugeBeanSwingJInternalFrame)jInternalFrameDetalleFormConyuge.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarConyugeActionPerformed(null);
			}
			
			ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.conyuge,new Object(),this.conyugeParameterGeneral,this.conyugeReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormConyuge(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormConyuge(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormConyuge(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.conyuge)) {
			if(!esControlTabla) {
				if(ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);			
				}
				
				if(this.conyugeSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualConyuge(this.conyuge,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.conyugeReturnGeneral=conyugeLogic.procesarEventosConyugesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conyugeLogic.getConyuges(),this.conyuge,this.conyugeParameterGeneral,this.isEsNuevoConyuge,classes);//this.conyugeLogic.getConyuge()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanConyuge(this.conyugeReturnGeneral,this.conyugeBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.conyugeSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanConyuge(classes,this.conyugeReturnGeneral,this.conyugeBean,false);
					}
						
					if(this.conyugeReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyConyuge(this.conyugeReturnGeneral.getConyuge());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioConyuge(this.conyugeReturnGeneral.getConyuge());	
					}
						
					if(this.conyugeReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioConyuge(this.conyugeReturnGeneral.getConyuge(),classes);//this.conyugeBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioConyuge(this.conyuge,classes);//this.conyugeBean);									
				}
			
				if(ConyugeJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualConyuge(this.conyuge,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysConyuge(this.conyuge);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.conyugeAnterior!=null) {
						this.conyuge=this.conyugeAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.conyugeReturnGeneral=conyugeLogic.procesarEventosConyugesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conyugeLogic.getConyuges(),this.conyuge,this.conyugeParameterGeneral,this.isEsNuevoConyuge,classes);//this.conyugeLogic.getConyuge()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.conyugeSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.conyugeSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.conyugeReturnGeneral.getConyuge(),conyugeLogic.getConyuges());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.conyugeReturnGeneral.getConyuge(),this.conyuges);
				}
				//ARCHITECTURE
				
				//this.jTableDatosConyuge.repaint();
				
				//((AbstractTableModel) this.jTableDatosConyuge.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosConyuge();
			}
		}
	}
	
	public void actualizarVisualTableDatosConyuge() throws Exception {
		
		ConyugeModel conyugeModel=(ConyugeModel)this.jTableDatosConyuge.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			conyugeModel.conyuges=this.conyugeLogic.getConyuges();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			conyugeModel.conyuges=this.conyuges;
		}
		
		
		((ConyugeModel) this.jTableDatosConyuge.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaConyuge() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getconyugeAnterior(),this.conyugeLogic.getConyuges());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getconyugeAnterior(),this.conyuges);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosConyuge();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioConyuge(Conyuge conyuge,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
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
										
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conyuge,new Object(),generalEntityParameterGeneral,this.conyugeReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.conyugeSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ConyugeConstantesFunciones.getClassesRelationshipsOfConyuge(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ConyugeConstantesFunciones.getClassesRelationshipsFromStringsOfConyuge(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormConyuge(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ConyugeBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.conyuge,new Object(),generalEntityParameterGeneral,this.conyugeReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioConyuge(ConyugeBean conyugeBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanConyuge(ArrayList<Classe> classes,ConyugeReturnGeneral conyugeReturnGeneral,ConyugeBean conyugeBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualConyuge(Conyuge conyuge,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.conyuge)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormConyuge = new ConyugeDetalleFormJInternalFrame(jDesktopPane,this.conyugeSessionBean.getConGuardarRelaciones(),this.conyugeSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormConyuge);
		this.jInternalFrameDetalleFormConyuge.setVisible(false);
		this.jInternalFrameDetalleFormConyuge.setSelected(false);						
		
		this.jInternalFrameDetalleFormConyuge.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormConyuge.conyugeLogic=this.conyugeLogic;
		
		this.cargarCombosFrameForeignKeyConyuge("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleConyuge();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleConyuge();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyConyuge("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyConyuge();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormConyuge.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConyuge"));
		
		this.jInternalFrameDetalleFormConyuge.jButtonModificarConyuge.addActionListener(new ButtonActionListener(this,"ModificarConyuge"));

		
		this.jInternalFrameDetalleFormConyuge.jButtonModificarToolBarConyuge.addActionListener(new ButtonActionListener(this,"ModificarToolBarConyuge"));
					
		this.jInternalFrameDetalleFormConyuge.jMenuItemModificarConyuge.addActionListener(new ButtonActionListener(this,"MenuItemModificarConyuge"));		
		
		
		
		this.jInternalFrameDetalleFormConyuge.jButtonActualizarConyuge.addActionListener (new ButtonActionListener(this,"ActualizarConyuge"));
		
		
		this.jInternalFrameDetalleFormConyuge.jButtonActualizarToolBarConyuge.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConyuge"));
						
		this.jInternalFrameDetalleFormConyuge.jMenuItemActualizarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConyuge"));		
		
		
		
		this.jInternalFrameDetalleFormConyuge.jButtonEliminarConyuge.addActionListener (new ButtonActionListener(this,"EliminarConyuge"));
		
		
		this.jInternalFrameDetalleFormConyuge.jButtonEliminarToolBarConyuge.addActionListener (new ButtonActionListener(this,"EliminarToolBarConyuge"));
								
		this.jInternalFrameDetalleFormConyuge.jMenuItemEliminarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConyuge"));		
		
		
		
		this.jInternalFrameDetalleFormConyuge.jButtonCancelarConyuge.addActionListener (new ButtonActionListener(this,"CancelarConyuge"));
		
		
		this.jInternalFrameDetalleFormConyuge.jButtonCancelarToolBarConyuge.addActionListener (new ButtonActionListener(this,"CancelarToolBarConyuge"));
					
		this.jInternalFrameDetalleFormConyuge.jMenuItemCancelarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConyuge"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormConyuge.jMenuItemDetalleCerrarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConyuge"));		
		
		
		
		this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosToolBarConyuge.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConyuge"));
		
		
		
		this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosToolBarConyuge.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConyuge"));
		
		
		
		this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConyuge"));
		
		
				
		
		//jButtonid_clienteConyuge.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteConyugeActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyuge.addActionListener(new ButtonActionListener(this,"id_clienteConyuge"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyugeUpdate.addActionListener(new ButtonActionListener(this,"id_clienteConyugeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyugeBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteConyugeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConyuge.jButtonidvaloridentificacionConyugeUpdate.addActionListener(new ButtonActionListener(this,"idvaloridentificacionConyugeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonidvaloridentificacionConyugeBusqueda.addActionListener(new ButtonActionListener(this,"idvaloridentificacionConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonidentificacionConyugeBusqueda.addActionListener(new ButtonActionListener(this,"identificacionConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonapellidopaternoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"apellidopaternoConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonapellidomaternoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"apellidomaternoConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonprimernombreConyugeBusqueda.addActionListener(new ButtonActionListener(this,"primernombreConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonsegundonombreConyugeBusqueda.addActionListener(new ButtonActionListener(this,"segundonombreConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonnombrecortoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"nombrecortoConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonesactivoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"esactivoConyugeBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormConyuge.jTabbedPaneRelacionesConyuge.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConyuge"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameConyuge"));
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarConyuge"));
		}
		
		this.jTableDatosConyuge.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarConyuge"));
		
		this.jTableDatosConyuge.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarConyuge"));
		
		this.jButtonNuevoConyuge.addActionListener(new ButtonActionListener(this,"NuevoConyuge"));
		
		this.jButtonDuplicarConyuge.addActionListener(new ButtonActionListener(this,"DuplicarConyuge"));
		
		this.jButtonCopiarConyuge.addActionListener(new ButtonActionListener(this,"CopiarConyuge"));
		
		this.jButtonVerFormConyuge.addActionListener(new ButtonActionListener(this,"VerFormConyuge"));
		
		
		this.jButtonNuevoToolBarConyuge.addActionListener(new ButtonActionListener(this,"NuevoToolBarConyuge"));
			
		this.jButtonDuplicarToolBarConyuge.addActionListener(new ButtonActionListener(this,"DuplicarToolBarConyuge"));
			
		this.jMenuItemNuevoConyuge.addActionListener (new ButtonActionListener(this,"MenuItemNuevoConyuge"));
			
		this.jMenuItemDuplicarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarConyuge"));		
		
		
		this.jButtonNuevoRelacionesConyuge.addActionListener (new ButtonActionListener(this,"NuevoRelacionesConyuge"));
		
		
		this.jButtonNuevoRelacionesToolBarConyuge.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarConyuge"));
			
		this.jMenuItemNuevoRelacionesConyuge.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesConyuge"));		
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonModificarConyuge.addActionListener(new ButtonActionListener(this,"ModificarConyuge"));
		}
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonModificarToolBarConyuge.addActionListener(new ButtonActionListener(this,"ModificarToolBarConyuge"));
			
			this.jInternalFrameDetalleFormConyuge.jMenuItemModificarConyuge.addActionListener(new ButtonActionListener(this,"MenuItemModificarConyuge"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormConyuge.jButtonActualizarConyuge.addActionListener (new ButtonActionListener(this,"ActualizarConyuge"));
		}
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonActualizarToolBarConyuge.addActionListener(new ButtonActionListener(this,"ActualizarToolBarConyuge"));
				
			this.jInternalFrameDetalleFormConyuge.jMenuItemActualizarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemActualizarConyuge"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonEliminarConyuge.addActionListener (new ButtonActionListener(this,"EliminarConyuge"));
		}
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonEliminarToolBarConyuge.addActionListener (new ButtonActionListener(this,"EliminarToolBarConyuge"));
						
			this.jInternalFrameDetalleFormConyuge.jMenuItemEliminarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemEliminarConyuge"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonCancelarConyuge.addActionListener (new ButtonActionListener(this,"CancelarConyuge"));
		}
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonCancelarToolBarConyuge.addActionListener (new ButtonActionListener(this,"CancelarToolBarConyuge"));
			
			this.jInternalFrameDetalleFormConyuge.jMenuItemCancelarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemCancelarConyuge"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarConyuge.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarConyuge"));		
		
		
		this.jButtonCerrarConyuge.addActionListener (new ButtonActionListener(this,"CerrarConyuge"));
		
		
		this.jButtonCerrarToolBarConyuge.addActionListener (new ButtonActionListener(this,"CerrarToolBarConyuge"));
			
		this.jMenuItemCerrarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemCerrarConyuge"));
			
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jMenuItemDetalleCerrarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarConyuge"));		
		}
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosConyuge.addActionListener (new ButtonActionListener(this,"GuardarCambiosConyuge"));
		}
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosToolBarConyuge.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarConyuge"));
		}
		
		this.jButtonCopiarToolBarConyuge.addActionListener (new ButtonActionListener(this,"CopiarToolBarConyuge"));
			
		this.jButtonVerFormToolBarConyuge.addActionListener (new ButtonActionListener(this,"VerFormToolBarConyuge"));
		
		this.jMenuItemGuardarCambiosConyuge.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosConyuge"));
			
		this.jMenuItemCopiarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemCopiarConyuge"));		
		
		this.jMenuItemVerFormConyuge.addActionListener (new ButtonActionListener(this,"MenuItemVerFormConyuge"));		
		
		
		this.jButtonGuardarCambiosTablaConyuge.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConyuge"));
		
		
		this.jButtonGuardarCambiosTablaToolBarConyuge.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarConyuge"));
			
		this.jMenuItemGuardarCambiosTablaConyuge.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaConyuge"));		
		
		
		
		this.jButtonRecargarInformacionConyuge.addActionListener (new ButtonActionListener(this,"RecargarInformacionConyuge"));
					
		this.jButtonRecargarInformacionToolBarConyuge.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarConyuge"));
		
		this.jMenuItemRecargarInformacionConyuge.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionConyuge"));		
		
		
		
		this.jButtonAnterioresConyuge.addActionListener (new ButtonActionListener(this,"AnterioresConyuge"));
		
		
		this.jButtonAnterioresToolBarConyuge.addActionListener (new ButtonActionListener(this,"AnterioresToolBarConyuge"));
		
		this.jMenuItemAnterioresConyuge.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresConyuge"));		
		
		
		this.jButtonSiguientesConyuge.addActionListener (new ButtonActionListener(this,"SiguientesConyuge"));
		
		
		this.jButtonSiguientesToolBarConyuge.addActionListener (new ButtonActionListener(this,"SiguientesToolBarConyuge"));
			
		this.jMenuItemSiguientesConyuge.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesConyuge"));
			
		this.jMenuItemAbrirOrderByConyuge.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByConyuge"));
			
		this.jMenuItemMostrarOcultarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarConyuge"));
			
		this.jMenuItemDetalleAbrirOrderByConyuge.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByConyuge"));
			
		this.jMenuItemDetalleMostarOcultarConyuge.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarConyuge"));		
		
		
		this.jButtonNuevoGuardarCambiosConyuge.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosConyuge"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarConyuge.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarConyuge"));
			
		this.jMenuItemNuevoGuardarCambiosConyuge.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosConyuge"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosConyuge.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosConyuge"));

		this.jCheckBoxSeleccionadosConyuge.addItemListener(new CheckBoxItemListener(this,"SeleccionadosConyuge"));
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioConyuge"));
		}
		
		
		this.jComboBoxTiposRelacionesConyuge.addActionListener (new ButtonActionListener(this,"TiposRelacionesConyuge"));
			
		this.jComboBoxTiposAccionesConyuge.addActionListener (new ButtonActionListener(this,"TiposAccionesConyuge"));
					
		this.jComboBoxTiposSeleccionarConyuge.addActionListener (new ButtonActionListener(this,"TiposSeleccionarConyuge"));
			
		this.jTextFieldValorCampoGeneralConyuge.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralConyuge"));		
		
		
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//jButtonid_clienteConyuge.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteConyugeActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyuge.addActionListener(new ButtonActionListener(this,"id_clienteConyuge"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyugeUpdate.addActionListener(new ButtonActionListener(this,"id_clienteConyugeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyugeBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteConyugeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConyuge.jButtonidvaloridentificacionConyugeUpdate.addActionListener(new ButtonActionListener(this,"idvaloridentificacionConyugeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonidvaloridentificacionConyugeBusqueda.addActionListener(new ButtonActionListener(this,"idvaloridentificacionConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonidentificacionConyugeBusqueda.addActionListener(new ButtonActionListener(this,"identificacionConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonapellidopaternoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"apellidopaternoConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonapellidomaternoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"apellidomaternoConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonprimernombreConyugeBusqueda.addActionListener(new ButtonActionListener(this,"primernombreConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonsegundonombreConyugeBusqueda.addActionListener(new ButtonActionListener(this,"segundonombreConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonnombrecortoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"nombrecortoConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonesactivoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"esactivoConyugeBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdClienteConyuge.addActionListener(new ButtonActionListener(this,"FK_IdClienteConyuge"));

			this.jButtonBuscarFK_IdClienteid_clienteConyuge.addActionListener(new ButtonActionListener(this,"id_clienteConyuge"));

			this.jButtonFK_IdValorIdentificacionConyuge.addActionListener(new ButtonActionListener(this,"FK_IdValorIdentificacionConyuge"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoConyuge!=null) {
				this.jInternalFrameReporteDinamicoConyuge.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConyuge"));
				this.jInternalFrameReporteDinamicoConyuge.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConyuge"));
				this.jInternalFrameReporteDinamicoConyuge.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConyuge"));
			}
			
			//this.jButtonCerrarReporteDinamicoConyuge.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoConyuge"));				
			//this.jButtonGenerarReporteDinamicoConyuge.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoConyuge"));
			//this.jButtonGenerarExcelReporteDinamicoConyuge.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoConyuge"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionConyuge!=null) {
				this.jInternalFrameImportacionConyuge.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionConyuge"));
				this.jInternalFrameImportacionConyuge.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionConyuge"));
				this.jInternalFrameImportacionConyuge.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionConyuge"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByConyuge.addActionListener (new ButtonActionListener(this,"AbrirOrderByConyuge"));
			
			this.jButtonAbrirOrderByToolBarConyuge.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarConyuge"));			
			
			if(this.jInternalFrameOrderByConyuge!=null) {
				this.jInternalFrameOrderByConyuge.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByConyuge"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormConyuge!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormConyuge.jTabbedPaneRelacionesConyuge.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesConyuge"));
		
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
            		closingInternalFrameConyuge();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormConyuge.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormConyuge = (JInternalFrameBase)event.getSource();
	            	
	            ConyugeBeanSwingJInternalFrame jInternalFrameParent=(ConyugeBeanSwingJInternalFrame)jInternalFrameDetalleFormConyuge.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarConyugeActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosConyuge.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosConyugeListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosConyuge.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosConyuge.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConyugeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConyugeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConyugeActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoConyuge";
		inputMap = this.jButtonNuevoConyuge.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoConyuge.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConyugeActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConyugeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConyugeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoConyugeActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesConyuge";
		inputMap = this.jButtonNuevoRelacionesConyuge.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesConyuge.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoConyugeActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarConyuge";
		inputMap = this.jButtonModificarConyuge.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarConyuge.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarConyugeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarConyuge";
		inputMap = this.jButtonActualizarConyuge.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarConyuge.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarConyugeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarConyuge";
		inputMap = this.jButtonEliminarConyuge.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarConyuge.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarConyugeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarConyuge";
		inputMap = this.jButtonCancelarConyuge.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarConyuge.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarConyugeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarConyuge";
		inputMap = this.jButtonCerrarConyuge.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarConyuge.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarConyugeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosConyuge";
		inputMap = this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosConyuge.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormConyuge.jButtonGuardarCambiosConyuge.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosConyugeActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosConyuge.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosConyugeItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesConyuge.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesConyugeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarConyuge.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarConyugeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralConyuge.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralConyugeActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//jButtonid_clienteConyuge.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteConyugeActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyuge.addActionListener(new ButtonActionListener(this,"id_clienteConyuge"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyugeUpdate.addActionListener(new ButtonActionListener(this,"id_clienteConyugeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyugeBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteConyugeBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormConyuge.jButtonidvaloridentificacionConyugeUpdate.addActionListener(new ButtonActionListener(this,"idvaloridentificacionConyugeUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonidvaloridentificacionConyugeBusqueda.addActionListener(new ButtonActionListener(this,"idvaloridentificacionConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonidentificacionConyugeBusqueda.addActionListener(new ButtonActionListener(this,"identificacionConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonapellidopaternoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"apellidopaternoConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonapellidomaternoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"apellidomaternoConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonprimernombreConyugeBusqueda.addActionListener(new ButtonActionListener(this,"primernombreConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonsegundonombreConyugeBusqueda.addActionListener(new ButtonActionListener(this,"segundonombreConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonnombrecortoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"nombrecortoConyugeBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormConyuge.jButtonesactivoConyugeBusqueda.addActionListener(new ButtonActionListener(this,"esactivoConyugeBusqueda"));
		
		
		this.jButtonFK_IdClienteConyuge.addActionListener(new ButtonActionListener(this,"FK_IdClienteConyuge"));

		this.jButtonBuscarFK_IdClienteid_clienteConyuge.addActionListener(new ButtonActionListener(this,"id_clienteConyuge"));

		this.jButtonFK_IdValorIdentificacionConyuge.addActionListener(new ButtonActionListener(this,"FK_IdValorIdentificacionConyuge"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionConyuge.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionConyugeActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarConyugeActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarConyuge.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosConyuge(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Conyuge conyugeAux:this.conyugeLogic.getConyuges()) {
					conyugeAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Conyuge conyugeAux:conyuges) {
					conyugeAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosConyugeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConyuge(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Conyuge conyugeAux:this.conyugeLogic.getConyuges()) {
						conyugeAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Conyuge conyugeAux:conyuges) {
						conyugeAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Conyuge conyugeAux:this.conyugeLogic.getConyuges()) {
					
						if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							conyugeAux.setesactivo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Conyuge conyugeAux:conyuges) {
						
						if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_ESACTIVO)) {
							existe=true;
							conyugeAux.setesactivo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaConyuge(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConyuge.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConyuge.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConyuge,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosConyugeItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingConyuge(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosConyuge.getSelectedRows();
			
			Conyuge conyugeLocal=new Conyuge();
			
			//this.seleccionarTodosConyuge(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					conyugeLocal =(Conyuge) this.conyugeLogic.getConyuges().toArray()[this.jTableDatosConyuge.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					conyugeLocal =(Conyuge) this.conyuges.toArray()[this.jTableDatosConyuge.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				conyugeLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Conyuge conyugeAux:this.conyugeLogic.getConyuges()) {
						conyugeAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Conyuge conyugeAux:conyuges) {
						conyugeAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaConyuge(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosConyuge.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosConyuge.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosConyuge,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualConyugeItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarConyugeParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralConyugeActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingConyuge(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralConyuge.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Conyuge conyugeAux:this.conyugeLogic.getConyuges()) {
				
						if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							conyugeAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO)) {
							existe=true;
							conyugeAux.setapellidopaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO)) {
							existe=true;
							conyugeAux.setapellidomaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE)) {
							existe=true;
							conyugeAux.setprimernombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE)) {
							existe=true;
							conyugeAux.setsegundonombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_NOMBRECORTO)) {
							existe=true;
							conyugeAux.setnombrecorto(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Conyuge conyugeAux:conyuges) {
					
						if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							conyugeAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO)) {
							existe=true;
							conyugeAux.setapellidopaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO)) {
							existe=true;
							conyugeAux.setapellidomaterno(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE)) {
							existe=true;
							conyugeAux.setprimernombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE)) {
							existe=true;
							conyugeAux.setsegundonombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_NOMBRECORTO)) {
							existe=true;
							conyugeAux.setnombrecorto(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaConyuge(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesConyugeActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingConyuge(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioConyuge=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesConyuge.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteConyuge) {				
					conSplash=true;//false;										
					
					//this.startProcessConyuge(conSplash);
				
					this.generarReporteConyugesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoConyugesSeleccionados();
				//this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConyugesSeleccionados(false);
				//this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoConyugesSeleccionados(true);
				//this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConyuge();
				
				this.exportarConyugesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionConyuges();
				//this.importarConyuges();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessConyuge();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelConyugesSeleccionados();
				//this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Conyuge", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessConyuge();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoConyuge)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyConyuge(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.setSelectedIndex(0);					
				}	
			} 			
			else if(ConyugeBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteConyuge) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessConyuge(conSplash);
					
						//this.actualizarParametrosGeneralConyuge();
						
						this.generarReporteProcesoAccionConyugesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ConyugeBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO ConyugeS SELECCIONADOS?", "MANTENIMIENTO DE Conyuge", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessConyuge();
				
						this.actualizarParametrosGeneralConyuge();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.conyugeReturnGeneral=conyugeLogic.procesarAccionConyugesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.conyugeLogic.getConyuges(),this.conyugeParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarConyugeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralConyuge();
					
					ConyugeBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarConyugeReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesConyuge.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormConyuge.jComboBoxTiposAccionesFormularioConyuge.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessConyuge(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesConyugeActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessConyuge();
			
			if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();		
			Conyuge conyuge=new Conyuge();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingConyuge(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesConyuge.getSelectedItem();
			
			
			
			
			conyugesSeleccionados=this.getConyugesSeleccionados(true);
			//this.sTipoAccion;
			
			if(conyugesSeleccionados.size()==1) {
				for(Conyuge conyugeAux:conyugesSeleccionados) {
					conyuge=conyugeAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessConyuge();
			
      		//this.finishProcessConyuge(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarConyugeReturnGeneral() throws Exception {
		if(this.conyugeReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.conyugeReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.conyugeReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.conyugeReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.conyugeReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.conyugeReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingConyuge(false);
		}
		
		if(this.conyugeReturnGeneral.getConRetornoLista() || this.conyugeReturnGeneral.getConRetornoObjeto()) {
			if(this.conyugeReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conyugeLogic.setConyuges(this.conyugeReturnGeneral.getConyuges());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.conyugeReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.conyugeLogic.setConyuge(this.conyugeReturnGeneral.getConyuge());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingConyuge(false);
		}
	}
	
	public void actualizarParametrosGeneralConyuge() throws Exception {
		
		
	}
	
	public ArrayList<Conyuge> getConyugesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioConyuge) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Conyuge conyugeAux:conyugeLogic.getConyuges()) {
					if(conyugeAux.getIsSelected()) {
						conyugesSeleccionados.add(conyugeAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Conyuge conyugeAux:this.conyuges) {
					if(conyugeAux.getIsSelected()) {
						conyugesSeleccionados.add(conyugeAux);				
					}
				}
			}
			
			if(conyugesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						conyugesSeleccionados.addAll(this.conyugeLogic.getConyuges());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						conyugesSeleccionados.addAll(this.conyuges);				
					}
				}
			}
		} else {
			conyugesSeleccionados.add(this.conyuge);
		}
		
		return conyugesSeleccionados;
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
	
	public void generarReporteConyugesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalConyugesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoConyugesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConyugesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoConyugesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Conyuge",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesConyugesSeleccionados() throws Exception {
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();		
		
		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteConyuges("Todos",conyugesSeleccionados);
		
	}	
	
	public void generarReporteNormalConyugesSeleccionados() throws Exception {
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();		
		
		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteConyuges("Todos",conyugesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionConyugesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();
		
		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteConyuges("Todos",conyugesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoConyugesSeleccionados() throws Exception {
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();		
		
		
		this.abrirInicializarFrameReporteDinamicoConyuge();
		
		
		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoConyuge();
		
		
		//this.generarReporteConyuges("Todos",conyugesSeleccionados ,conyugeImplementable,conyugeImplementableHome);
	}
	
	public void mostrarImportacionConyuges() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionConyuge();
		
		this.abrirFrameImportacionConyuge();		
		
			
		//this.generarReporteConyuges("Todos",conyugesSeleccionados ,conyugeImplementable,conyugeImplementableHome);
	}
	
	public void importarConyuges() throws Exception {		
	
	}
	
	public void exportarConyugesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelConyugesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoConyugesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlConyugesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Conyuge",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoConyugesSeleccionados() throws Exception {
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();		
		
		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conyuge."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarConyuge(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Conyuge conyugeAux:conyugesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarConyuge(conyugeAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//conyugeAux.setsDetalleGeneralEntityReporte(conyugeAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarConyuge(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_IDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_NOMBRECORTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ConyugeConstantesFunciones.LABEL_ESACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarConyuge(Conyuge conyuge,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=conyuge.getcliente_descripcion();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=conyuge.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=conyuge.gettipoidentificacion_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conyuge.getidentificacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conyuge.getapellidopaterno();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conyuge.getapellidomaterno();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conyuge.getprimernombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conyuge.getsegundonombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conyuge.getnombrecorto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=conyuge.getesactivo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelConyugesSeleccionados() throws Exception {
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();		
		
		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conyuge.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Conyuges");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelConyuge(row);				
				iRow++;
			}				
			
			for(Conyuge conyugeAux:conyugesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelConyuge(conyugeAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlConyugesSeleccionados() throws Exception {
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();		
		
		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"conyuge.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("conyuges");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("conyuge");
			//elementRoot.appendChild(element);
		
			for(Conyuge conyugeAux:conyugesSeleccionados) {
				element = document.createElement("conyuge");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlConyuge(conyugeAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.conyugeSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Conyuge",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelConyuge(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_IDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_NOMBRECORTO);
		cell = row.createCell(iColumn++);cell.setCellValue(ConyugeConstantesFunciones.LABEL_ESACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelConyuge(Conyuge conyuge,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(conyuge.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conyuge.gettipoidentificacion_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(conyuge.getidentificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(conyuge.getapellidopaterno());
		cell = row.createCell(iColumn++);cell.setCellValue(conyuge.getapellidomaterno());
		cell = row.createCell(iColumn++);cell.setCellValue(conyuge.getprimernombre());
		cell = row.createCell(iColumn++);cell.setCellValue(conyuge.getsegundonombre());
		cell = row.createCell(iColumn++);cell.setCellValue(conyuge.getnombrecorto());
		cell = row.createCell(iColumn++);cell.setCellValue(conyuge.getesactivo());				
	}
	
	public void setFilaDatosExportarXmlConyuge(Conyuge conyuge,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementcliente_descripcion = document.createElement(ConyugeConstantesFunciones.ID);
		elementcliente_descripcion.appendChild(document.createTextNode(conyuge.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ConyugeConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(conyuge.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementtipoidentificacion_descripcion = document.createElement(ConyugeConstantesFunciones.IDTIPOIDENTIFICACION);
		elementtipoidentificacion_descripcion.appendChild(document.createTextNode(conyuge.gettipoidentificacion_descripcion()));
		element.appendChild(elementtipoidentificacion_descripcion);

		Element elementidentificacion = document.createElement(ConyugeConstantesFunciones.IDENTIFICACION);
		elementidentificacion.appendChild(document.createTextNode(conyuge.getidentificacion().trim()));
		element.appendChild(elementidentificacion);

		Element elementapellidopaterno = document.createElement(ConyugeConstantesFunciones.APELLIDOPATERNO);
		elementapellidopaterno.appendChild(document.createTextNode(conyuge.getapellidopaterno().trim()));
		element.appendChild(elementapellidopaterno);

		Element elementapellidomaterno = document.createElement(ConyugeConstantesFunciones.APELLIDOMATERNO);
		elementapellidomaterno.appendChild(document.createTextNode(conyuge.getapellidomaterno().trim()));
		element.appendChild(elementapellidomaterno);

		Element elementprimernombre = document.createElement(ConyugeConstantesFunciones.PRIMERNOMBRE);
		elementprimernombre.appendChild(document.createTextNode(conyuge.getprimernombre().trim()));
		element.appendChild(elementprimernombre);

		Element elementsegundonombre = document.createElement(ConyugeConstantesFunciones.SEGUNDONOMBRE);
		elementsegundonombre.appendChild(document.createTextNode(conyuge.getsegundonombre().trim()));
		element.appendChild(elementsegundonombre);

		Element elementnombrecorto = document.createElement(ConyugeConstantesFunciones.NOMBRECORTO);
		elementnombrecorto.appendChild(document.createTextNode(conyuge.getnombrecorto().trim()));
		element.appendChild(elementnombrecorto);

		Element elementesactivo = document.createElement(ConyugeConstantesFunciones.ESACTIVO);
		elementesactivo.appendChild(document.createTextNode(conyuge.getesactivo().toString().trim()));
		element.appendChild(elementesactivo);
	}
	
	public void generarReporteGroupGenericoConyugesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Conyuge> conyugesSeleccionados=new ArrayList<Conyuge>();
		
		conyugesSeleccionados=this.getConyugesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoConyuge(conyugesSeleccionados);
		
		this.generarReporteConyuges("Todos",conyugesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoConyuge(ArrayList<Conyuge> conyugesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Conyuge conyugeAux:conyugesSeleccionados) {
				conyugeAux.setsDetalleGeneralEntityReporte(conyugeAux.toString());
			
				if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_IDTIPOIDENTIFICACION)) {
					existe=true;
					conyugeAux.setsDescripcionGeneralEntityReporte1(conyugeAux.gettipoidentificacion_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_IDENTIFICACION)) {
					existe=true;
					conyugeAux.setsDescripcionGeneralEntityReporte1(conyugeAux.getidentificacion());
				}
				 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_APELLIDOPATERNO)) {
					existe=true;
					conyugeAux.setsDescripcionGeneralEntityReporte1(conyugeAux.getapellidopaterno());
				}
				 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_APELLIDOMATERNO)) {
					existe=true;
					conyugeAux.setsDescripcionGeneralEntityReporte1(conyugeAux.getapellidomaterno());
				}
				 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_PRIMERNOMBRE)) {
					existe=true;
					conyugeAux.setsDescripcionGeneralEntityReporte1(conyugeAux.getprimernombre());
				}
				 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_SEGUNDONOMBRE)) {
					existe=true;
					conyugeAux.setsDescripcionGeneralEntityReporte1(conyugeAux.getsegundonombre());
				}
				 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_NOMBRECORTO)) {
					existe=true;
					conyugeAux.setsDescripcionGeneralEntityReporte1(conyugeAux.getnombrecorto());
				}
				 else if(sTipoSeleccionar.equals(ConyugeConstantesFunciones.LABEL_ESACTIVO)) {
					existe=true;
					conyugeAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(conyugeAux.getesactivo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ConyugeConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesConyuge(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoConyuge=true;
				this.isVisibilidadCeldaNuevoRelacionesConyuge=true;
				this.isVisibilidadCeldaGuardarCambiosConyuge=true;
			}
			
			this.isVisibilidadCeldaModificarConyuge=false;
			this.isVisibilidadCeldaActualizarConyuge=false;
			this.isVisibilidadCeldaEliminarConyuge=false;
			this.isVisibilidadCeldaCancelarConyuge=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConyuge=true;
				} else {
					this.isVisibilidadCeldaGuardarConyuge=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoConyuge=false;
			this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
			this.isVisibilidadCeldaGuardarCambiosConyuge=false;
			this.isVisibilidadCeldaModificarConyuge=false;
			this.isVisibilidadCeldaActualizarConyuge=true;
			this.isVisibilidadCeldaEliminarConyuge=false;
			this.isVisibilidadCeldaCancelarConyuge=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConyuge=true;
				} else {
					this.isVisibilidadCeldaGuardarConyuge=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoConyuge=false;
			this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
			this.isVisibilidadCeldaGuardarCambiosConyuge=false;
			this.isVisibilidadCeldaModificarConyuge=false;
			this.isVisibilidadCeldaActualizarConyuge=true;
			this.isVisibilidadCeldaEliminarConyuge=true;
			this.isVisibilidadCeldaCancelarConyuge=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConyuge=true;
				} else {
					this.isVisibilidadCeldaGuardarConyuge=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoConyuge=false;
			this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
			this.isVisibilidadCeldaGuardarCambiosConyuge=false;
			this.isVisibilidadCeldaModificarConyuge=false;
			this.isVisibilidadCeldaActualizarConyuge=true;
			this.isVisibilidadCeldaEliminarConyuge=false;
			this.isVisibilidadCeldaCancelarConyuge=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConyuge=false;
				} else {
					this.isVisibilidadCeldaGuardarConyuge=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoConyuge=true;
			this.isVisibilidadCeldaNuevoRelacionesConyuge=true;
			this.isVisibilidadCeldaGuardarCambiosConyuge=true;
			this.isVisibilidadCeldaModificarConyuge=false;
			this.isVisibilidadCeldaActualizarConyuge=false;
			this.isVisibilidadCeldaEliminarConyuge=false;
			this.isVisibilidadCeldaCancelarConyuge=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConyuge=true;
				} else {
					this.isVisibilidadCeldaGuardarConyuge=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoConyuge=false;
			this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
			this.isVisibilidadCeldaGuardarCambiosConyuge=false;
			this.isVisibilidadCeldaActualizarConyuge=false;
			this.isVisibilidadCeldaEliminarConyuge=false;
			this.isVisibilidadCeldaCancelarConyuge=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConyuge=false;
				} else {
					this.isVisibilidadCeldaGuardarConyuge=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoConyuge=false;
			this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
			this.isVisibilidadCeldaGuardarCambiosConyuge=false;
			this.isVisibilidadCeldaModificarConyuge=true;
			this.isVisibilidadCeldaActualizarConyuge=false;
			this.isVisibilidadCeldaEliminarConyuge=false;
			this.isVisibilidadCeldaCancelarConyuge=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarConyuge=false;
				} else {
					this.isVisibilidadCeldaGuardarConyuge=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ConyugeJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoConyuge=true;
			this.isVisibilidadCeldaNuevoRelacionesConyuge=true;
			this.isVisibilidadCeldaGuardarCambiosConyuge=true;
		} else {
			this.actualizarEstadoPanelsConyuge(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarConyuge=false;
			//this.isVisibilidadCeldaVerFormConyuge=false;
			this.isVisibilidadCeldaDuplicarConyuge=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!conyugeSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
		} else {
			this.isVisibilidadCeldaNuevoConyuge=false;
			this.isVisibilidadCeldaGuardarCambiosConyuge=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(conyugeSessionBean.getEsGuardarRelacionado()) {
			if(!conyugeSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesConyuge=false;												
			}
			
			this.jButtonCerrarConyuge.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
		}
		
		if(!this.permiteMantenimiento(this.conyuge)) {
			this.isVisibilidadCeldaActualizarConyuge=false;
			this.isVisibilidadCeldaEliminarConyuge=false;
		}
		
		//SI ES UNO A UNO FK
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			
			if(conyugeLogic.getConyuges().size()>0) {
									this.isVisibilidadCeldaNuevoConyuge=false;	
									this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
									this.isVisibilidadCeldaGuardarCambiosConyuge=false;
			}
			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			if(conyuges.size()>0) {
				this.isVisibilidadCeldaNuevoConyuge=false;	
				this.isVisibilidadCeldaNuevoRelacionesConyuge=false;
				this.isVisibilidadCeldaGuardarCambiosConyuge=false;
			}
		}
		//ARCHITECTURE
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesConyuge() {
	}
	
	public void actualizarEstadoPanelsConyuge(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionConyuge!=null) {
				this.jScrollPanelDatosEdicionConyuge.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConyuge!=null) {
				this.jTabbedPaneBusquedasConyuge.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConyuge!=null) {
				this.jScrollPanelDatosConyuge.setVisible(true);
			}
			
			if(this.jPanelPaginacionConyuge!=null) {
				this.jPanelPaginacionConyuge.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConyuge!=null) {
				this.jPanelParametrosReportesConyuge.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionConyuge!=null) {
				this.jScrollPanelDatosEdicionConyuge.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConyuge!=null) {
				this.jTabbedPaneBusquedasConyuge.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosConyuge!=null) {
				this.jScrollPanelDatosConyuge.setVisible(false);
			}
			
			if(this.jPanelPaginacionConyuge!=null) {
				this.jPanelPaginacionConyuge.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConyuge!=null) {
				this.jPanelParametrosReportesConyuge.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionConyuge!=null) {
				this.jScrollPanelDatosEdicionConyuge.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConyuge!=null) {
				this.jTabbedPaneBusquedasConyuge.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConyuge!=null) {
				this.jScrollPanelDatosConyuge.setVisible(false);
			}
			
			if(this.jPanelPaginacionConyuge!=null) {
				this.jPanelPaginacionConyuge.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConyuge!=null) {
				this.jPanelParametrosReportesConyuge.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionConyuge!=null) {
				this.jScrollPanelDatosEdicionConyuge.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConyuge!=null) {
				this.jTabbedPaneBusquedasConyuge.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosConyuge!=null) {
				this.jScrollPanelDatosConyuge.setVisible(false);
			}
			
			if(this.jPanelPaginacionConyuge!=null) {
				this.jPanelPaginacionConyuge.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesConyuge!=null) {
				this.jPanelParametrosReportesConyuge.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionConyuge!=null) {
				this.jScrollPanelDatosEdicionConyuge.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConyuge!=null) {
				this.jTabbedPaneBusquedasConyuge.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConyuge!=null) {
				this.jScrollPanelDatosConyuge.setVisible(true);
			}
			
			if(this.jPanelPaginacionConyuge!=null) {
				this.jPanelPaginacionConyuge.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConyuge!=null) {
				this.jPanelParametrosReportesConyuge.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionConyuge!=null) {
				this.jScrollPanelDatosEdicionConyuge.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConyuge!=null) {
				this.jTabbedPaneBusquedasConyuge.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConyuge!=null) {
				this.jScrollPanelDatosConyuge.setVisible(true);
			}
			
			if(this.jPanelPaginacionConyuge!=null) {
				this.jPanelPaginacionConyuge.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConyuge!=null) {
				this.jPanelParametrosReportesConyuge.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionConyuge!=null) {
				this.jScrollPanelDatosEdicionConyuge.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConyuge!=null) {
				this.jTabbedPaneBusquedasConyuge.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosConyuge!=null) {
				this.jScrollPanelDatosConyuge.setVisible(true);
			}
			
			if(this.jPanelPaginacionConyuge!=null) {
				this.jPanelPaginacionConyuge.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesConyuge!=null) {
				this.jPanelParametrosReportesConyuge.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.conyugeSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasConyuge!=null) {
					this.jTabbedPaneBusquedasConyuge.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesConyuge!=null) {
				this.jPanelParametrosReportesConyuge.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.conyugeSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasConyuge!=null) {
				this.jTabbedPaneBusquedasConyuge.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesConyuge!=null) {
				this.jPanelParametrosReportesConyuge.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasConyuge.remove(jPanelFK_IdClienteConyuge);}

			this.isVisibilidadFK_IdValorIdentificacion=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdValorIdentificacion) {this.jTabbedPaneBusquedasConyuge.remove(jPanelFK_IdValorIdentificacionConyuge);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoIdentificacion(Boolean isParaTipoIdentificacion){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoIdentificacionNegation=!isParaTipoIdentificacion;

			this.isVisibilidadFK_IdCliente=isParaTipoIdentificacionNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasConyuge.remove(jPanelFK_IdClienteConyuge);}

			this.isVisibilidadFK_IdValorIdentificacion=isParaTipoIdentificacion;
			if(!this.isVisibilidadFK_IdValorIdentificacion) {this.jTabbedPaneBusquedasConyuge.remove(jPanelFK_IdValorIdentificacionConyuge);}
		}
		
	}
	
	
	
	

	public String registrarSesionConyugeParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(conyugeSessionBean==null) {
				conyugeSessionBean=new ConyugeSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(conyugeSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.conyugeFuncionGeneral.setCombosCodigoDesdeBusquedaId(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(ConyugeConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionConyuge(true);
			//clienteSessionBean.setlidConyugeActual(this.idConyugeActual);

			conyugeSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyConyuge(true);
			conyugeSessionBean.setlIdConyugeActualForeignKey(this.idConyugeActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ConyugeSessionBean conyugeSessionBean=new ConyugeSessionBean();
		
		if(this.conyugeSessionBean==null) {
			this.conyugeSessionBean=new ConyugeSessionBean();
		}
		
		this.conyugeSessionBean.setsUltimaBusquedaConyuge(this.getsAccionBusqueda());
		this.conyugeSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.conyugeSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			conyugeSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdValorIdentificacion")) {
			conyugeSessionBean.setidvaloridentificacion(this.getidvaloridentificacionFK_IdValorIdentificacion());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ConyugeSessionBean conyugeSessionBean=new ConyugeSessionBean();
		
		if(this.conyugeSessionBean==null) {
			this.conyugeSessionBean=new ConyugeSessionBean();
		}
		
		if(this.conyugeSessionBean.getsUltimaBusquedaConyuge()!=null&&!this.conyugeSessionBean.getsUltimaBusquedaConyuge().equals("")) {
			this.setsAccionBusqueda(conyugeSessionBean.getsUltimaBusquedaConyuge());
			this.setiNumeroPaginacion(conyugeSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(conyugeSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(conyugeSessionBean.getid_cliente());
				conyugeSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdValorIdentificacion")) {
				this.setidvaloridentificacionFK_IdValorIdentificacion(conyugeSessionBean.getidvaloridentificacion());
				conyugeSessionBean.setidvaloridentificacion(-1L);
			}
		}
		
		this.conyugeSessionBean.setsUltimaBusquedaConyuge("");
		this.conyugeSessionBean.setiNumeroPaginacion(ConyugeConstantesFunciones.INUMEROPAGINACION);
		this.conyugeSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaConyuge(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioConyuge() {
		this.updateBorderResaltarBusquedasFormularioConyuge();
		this.updateVisibilidadBusquedasFormularioConyuge();
		this.updateHabilitarBusquedasFormularioConyuge();
	}
	
	public void updateBorderResaltarBusquedasFormularioConyuge() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasConyuge.getComponents().length>0) {
	

		if(this.conyugeConstantesFunciones.resaltarFK_IdClienteConyuge!=null) {
			index= this.jTabbedPaneBusquedasConyuge.indexOfComponent(this.jPanelFK_IdClienteConyuge);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConyuge.getComponent(index);
				jPanel.setBorder(this.conyugeConstantesFunciones.resaltarFK_IdClienteConyuge);
			}
		}

		if(this.conyugeConstantesFunciones.resaltarFK_IdValorIdentificacionConyuge!=null) {
			index= this.jTabbedPaneBusquedasConyuge.indexOfComponent(this.jPanelFK_IdValorIdentificacionConyuge);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConyuge.getComponent(index);
				jPanel.setBorder(this.conyugeConstantesFunciones.resaltarFK_IdValorIdentificacionConyuge);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioConyuge() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasConyuge.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConyuge.indexOfComponent(this.jPanelFK_IdClienteConyuge);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConyuge.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conyugeConstantesFunciones.mostrarFK_IdClienteConyuge);
			if(!this.conyugeConstantesFunciones.mostrarFK_IdClienteConyuge && index>-1) {
				this.jTabbedPaneBusquedasConyuge.remove(index);
			}

			index= this.jTabbedPaneBusquedasConyuge.indexOfComponent(this.jPanelFK_IdValorIdentificacionConyuge);
			jPanel=(JPanel)this.jTabbedPaneBusquedasConyuge.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.conyugeConstantesFunciones.mostrarFK_IdValorIdentificacionConyuge);
			if(!this.conyugeConstantesFunciones.mostrarFK_IdValorIdentificacionConyuge && index>-1) {
				this.jTabbedPaneBusquedasConyuge.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioConyuge() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasConyuge.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasConyuge.indexOfComponent(this.jPanelFK_IdClienteConyuge);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConyuge.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conyugeConstantesFunciones.activarFK_IdClienteConyuge);
				this.jTabbedPaneBusquedasConyuge.setEnabledAt(index,this.conyugeConstantesFunciones.activarFK_IdClienteConyuge);
			}

			index= this.jTabbedPaneBusquedasConyuge.indexOfComponent(this.jPanelFK_IdValorIdentificacionConyuge);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasConyuge.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.conyugeConstantesFunciones.activarFK_IdValorIdentificacionConyuge);
				this.jTabbedPaneBusquedasConyuge.setEnabledAt(index,this.conyugeConstantesFunciones.activarFK_IdValorIdentificacionConyuge);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaConyuge(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasConyuge.indexOfComponent(this.jPanelFK_IdClienteConyuge);

			this.jTabbedPaneBusquedasConyuge.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConyuge.getComponent(index);

			this.conyugeConstantesFunciones.setResaltarFK_IdClienteConyuge(resaltar);

			jPanel.setBorder(this.conyugeConstantesFunciones.resaltarFK_IdClienteConyuge);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdValorIdentificacion")) {
			index= this.jTabbedPaneBusquedasConyuge.indexOfComponent(this.jPanelFK_IdValorIdentificacionConyuge);

			this.jTabbedPaneBusquedasConyuge.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasConyuge.getComponent(index);

			this.conyugeConstantesFunciones.setResaltarFK_IdValorIdentificacionConyuge(resaltar);

			jPanel.setBorder(this.conyugeConstantesFunciones.resaltarFK_IdValorIdentificacionConyuge);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarConyuge.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioConyuge() throws Exception {

		if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioConyuge();
		this.updateVisibilidadResaltarControlesFormularioConyuge();
		this.updateHabilitarResaltarControlesFormularioConyuge();
		
	}
	
	public void updateBorderResaltarControlesFormularioConyuge() throws Exception {
		if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.conyugeConstantesFunciones.resaltarid_clienteConyuge!=null && this.jInternalFrameDetalleFormConyuge!=null) {this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.setBorder(this.conyugeConstantesFunciones.resaltarid_clienteConyuge);}
		if(this.conyugeConstantesFunciones.resaltaridvaloridentificacionConyuge!=null && this.jInternalFrameDetalleFormConyuge!=null) {this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.setBorder(this.conyugeConstantesFunciones.resaltaridvaloridentificacionConyuge);}
		if(this.conyugeConstantesFunciones.resaltaridentificacionConyuge!=null && this.jInternalFrameDetalleFormConyuge!=null) {this.jInternalFrameDetalleFormConyuge.jTextFieldidentificacionConyuge.setBorder(this.conyugeConstantesFunciones.resaltaridentificacionConyuge);}
		if(this.conyugeConstantesFunciones.resaltarapellidopaternoConyuge!=null && this.jInternalFrameDetalleFormConyuge!=null) {this.jInternalFrameDetalleFormConyuge.jTextAreaapellidopaternoConyuge.setBorder(this.conyugeConstantesFunciones.resaltarapellidopaternoConyuge);}
		if(this.conyugeConstantesFunciones.resaltarapellidomaternoConyuge!=null && this.jInternalFrameDetalleFormConyuge!=null) {this.jInternalFrameDetalleFormConyuge.jTextAreaapellidomaternoConyuge.setBorder(this.conyugeConstantesFunciones.resaltarapellidomaternoConyuge);}
		if(this.conyugeConstantesFunciones.resaltarprimernombreConyuge!=null && this.jInternalFrameDetalleFormConyuge!=null) {this.jInternalFrameDetalleFormConyuge.jTextAreaprimernombreConyuge.setBorder(this.conyugeConstantesFunciones.resaltarprimernombreConyuge);}
		if(this.conyugeConstantesFunciones.resaltarsegundonombreConyuge!=null && this.jInternalFrameDetalleFormConyuge!=null) {this.jInternalFrameDetalleFormConyuge.jTextAreasegundonombreConyuge.setBorder(this.conyugeConstantesFunciones.resaltarsegundonombreConyuge);}
		if(this.conyugeConstantesFunciones.resaltarnombrecortoConyuge!=null && this.jInternalFrameDetalleFormConyuge!=null) {this.jInternalFrameDetalleFormConyuge.jTextAreanombrecortoConyuge.setBorder(this.conyugeConstantesFunciones.resaltarnombrecortoConyuge);}
		if(this.conyugeConstantesFunciones.resaltaresactivoConyuge!=null && this.jInternalFrameDetalleFormConyuge!=null) {this.jInternalFrameDetalleFormConyuge.jCheckBoxesactivoConyuge.setBorderPainted(true);this.jInternalFrameDetalleFormConyuge.jCheckBoxesactivoConyuge.setBorder(this.conyugeConstantesFunciones.resaltaresactivoConyuge);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioConyuge() throws Exception {		
		if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConyuge!=null) {
	
		//this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.setVisible(this.conyugeConstantesFunciones.mostrarid_clienteConyuge);
		this.jInternalFrameDetalleFormConyuge.jPanelid_clienteConyuge.setVisible(this.conyugeConstantesFunciones.mostrarid_clienteConyuge);
			this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyuge.setVisible(this.conyugeConstantesFunciones.mostrarid_clienteConyuge);
		//this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.setVisible(this.conyugeConstantesFunciones.mostraridvaloridentificacionConyuge);
		this.jInternalFrameDetalleFormConyuge.jPanelidvaloridentificacionConyuge.setVisible(this.conyugeConstantesFunciones.mostraridvaloridentificacionConyuge);
		//this.jInternalFrameDetalleFormConyuge.jTextFieldidentificacionConyuge.setVisible(this.conyugeConstantesFunciones.mostraridentificacionConyuge);
		this.jInternalFrameDetalleFormConyuge.jPanelidentificacionConyuge.setVisible(this.conyugeConstantesFunciones.mostraridentificacionConyuge);
		//this.jInternalFrameDetalleFormConyuge.jTextAreaapellidopaternoConyuge.setVisible(this.conyugeConstantesFunciones.mostrarapellidopaternoConyuge);
		this.jInternalFrameDetalleFormConyuge.jPanelapellidopaternoConyuge.setVisible(this.conyugeConstantesFunciones.mostrarapellidopaternoConyuge);
		//this.jInternalFrameDetalleFormConyuge.jTextAreaapellidomaternoConyuge.setVisible(this.conyugeConstantesFunciones.mostrarapellidomaternoConyuge);
		this.jInternalFrameDetalleFormConyuge.jPanelapellidomaternoConyuge.setVisible(this.conyugeConstantesFunciones.mostrarapellidomaternoConyuge);
		//this.jInternalFrameDetalleFormConyuge.jTextAreaprimernombreConyuge.setVisible(this.conyugeConstantesFunciones.mostrarprimernombreConyuge);
		this.jInternalFrameDetalleFormConyuge.jPanelprimernombreConyuge.setVisible(this.conyugeConstantesFunciones.mostrarprimernombreConyuge);
		//this.jInternalFrameDetalleFormConyuge.jTextAreasegundonombreConyuge.setVisible(this.conyugeConstantesFunciones.mostrarsegundonombreConyuge);
		this.jInternalFrameDetalleFormConyuge.jPanelsegundonombreConyuge.setVisible(this.conyugeConstantesFunciones.mostrarsegundonombreConyuge);
		//this.jInternalFrameDetalleFormConyuge.jTextAreanombrecortoConyuge.setVisible(this.conyugeConstantesFunciones.mostrarnombrecortoConyuge);
		this.jInternalFrameDetalleFormConyuge.jPanelnombrecortoConyuge.setVisible(this.conyugeConstantesFunciones.mostrarnombrecortoConyuge);
		//this.jInternalFrameDetalleFormConyuge.jCheckBoxesactivoConyuge.setVisible(this.conyugeConstantesFunciones.mostraresactivoConyuge);
		this.jInternalFrameDetalleFormConyuge.jPanelesactivoConyuge.setVisible(this.conyugeConstantesFunciones.mostraresactivoConyuge);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioConyuge() throws Exception {
		if(this.jInternalFrameDetalleFormConyuge==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormConyuge!=null) {
	
		this.jInternalFrameDetalleFormConyuge.jLabelid_clienteConyuge.setEnabled(this.conyugeConstantesFunciones.activarid_clienteConyuge);
			this.jInternalFrameDetalleFormConyuge.jButtonid_clienteConyuge.setEnabled(this.conyugeConstantesFunciones.activarid_clienteConyuge);
		this.jInternalFrameDetalleFormConyuge.jComboBoxidvaloridentificacionConyuge.setEnabled(this.conyugeConstantesFunciones.activaridvaloridentificacionConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextFieldidentificacionConyuge.setEnabled(this.conyugeConstantesFunciones.activaridentificacionConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreaapellidopaternoConyuge.setEnabled(this.conyugeConstantesFunciones.activarapellidopaternoConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreaapellidomaternoConyuge.setEnabled(this.conyugeConstantesFunciones.activarapellidomaternoConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreaprimernombreConyuge.setEnabled(this.conyugeConstantesFunciones.activarprimernombreConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreasegundonombreConyuge.setEnabled(this.conyugeConstantesFunciones.activarsegundonombreConyuge);
		this.jInternalFrameDetalleFormConyuge.jTextAreanombrecortoConyuge.setEnabled(this.conyugeConstantesFunciones.activarnombrecortoConyuge);
		this.jInternalFrameDetalleFormConyuge.jCheckBoxesactivoConyuge.setEnabled(this.conyugeConstantesFunciones.activaresactivoConyuge);
		}
	}
	
		
}