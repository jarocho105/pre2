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

import com.bydan.erp.contabilidad.util.TipoFacturaConstantesFunciones;
import com.bydan.erp.contabilidad.util.TipoFacturaParameterReturnGeneral;
//import com.bydan.erp.contabilidad.util.TipoFacturaParameterGeneral;
//import com.bydan.erp.contabilidad.presentation.report.source.TipoFacturaBean;
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

import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.contabilidad.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TipoFacturaBeanSwingJInternalFrame extends TipoFacturaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TipoFacturaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TipoFactura> tipofacturaValidator = new ClassValidator<TipoFactura>(TipoFactura.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TipoFactura tipofactura;	
	public TipoFactura tipofacturaAux;
	public TipoFactura tipofacturaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TipoFactura tipofacturaTotales;
	public Long idTipoFacturaActual;
	public Long iIdNuevoTipoFactura=0L;
	public int rowIndexActual=0;
	
	
	
	
		
	
	
	
	
	

	public Boolean isTienePermisosFactura=false;

	public Boolean getIsTienePermisosFactura() {
		return isTienePermisosFactura;
	}

	public void setIsTienePermisosFactura(Boolean isTienePermisosFactura) {
		this.isTienePermisosFactura= isTienePermisosFactura;
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
	
	public Boolean isPermisoTodoTipoFactura;
	public Boolean isPermisoNuevoTipoFactura;
	public Boolean isPermisoActualizarTipoFactura;
	public Boolean isPermisoActualizarOriginalTipoFactura;
	public Boolean isPermisoEliminarTipoFactura;
	public Boolean isPermisoGuardarCambiosTipoFactura;
	public Boolean isPermisoConsultaTipoFactura;
	public Boolean isPermisoBusquedaTipoFactura;
	public Boolean isPermisoReporteTipoFactura;
	public Boolean isPermisoPaginacionMedioTipoFactura;
	public Boolean isPermisoPaginacionAltoTipoFactura;
	public Boolean isPermisoPaginacionTodoTipoFactura;
	public Boolean isPermisoCopiarTipoFactura;
	public Boolean isPermisoVerFormTipoFactura;
	public Boolean isPermisoDuplicarTipoFactura;
	public Boolean isPermisoOrdenTipoFactura;
	
	
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
	
	public TipoFacturaParameterReturnGeneral tipofacturaReturnGeneral;
	public TipoFacturaParameterReturnGeneral tipofacturaParameterGeneral;
	
	

	public FacturaLogic facturaLogic=null;

	public FacturaLogic getFacturaLogic() {
		return facturaLogic;
	}

	public void setFacturaLogic(FacturaLogic facturaLogic) {
		this.facturaLogic = facturaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTipoFactura=false;
	public Boolean esParaAccionDesdeFormularioTipoFactura=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	
	
	//ESTA EN PADRE
	
	//public TipoFacturaLogic tipofacturaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TipoFactura tipofacturaBean;
	public TipoFacturaConstantesFunciones tipofacturaConstantesFunciones;
	//public TipoFacturaParameterReturnGeneral tipofacturaReturnGeneral;
	
	//FK
	
	
	//PARAMETROS
	
	
	//public List<TipoFactura> tipofacturas;	
	//public List<TipoFactura> tipofacturasEliminados;
	//public List<TipoFactura> tipofacturasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTipoFactura=false;
	public Boolean isVisibilidadCeldaDuplicarTipoFactura=true;
	public Boolean isVisibilidadCeldaCopiarTipoFactura=true;
	public Boolean isVisibilidadCeldaVerFormTipoFactura=true;
	public Boolean isVisibilidadCeldaOrdenTipoFactura=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTipoFactura=false;
	public Boolean isVisibilidadCeldaModificarTipoFactura=false;
	public Boolean isVisibilidadCeldaActualizarTipoFactura=false;
	public Boolean isVisibilidadCeldaEliminarTipoFactura=false;
	public Boolean isVisibilidadCeldaCancelarTipoFactura=false;
	public Boolean isVisibilidadCeldaGuardarTipoFactura=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTipoFactura=false;	
	
	
	
	public Long getiIdNuevoTipoFactura() {
		return this.iIdNuevoTipoFactura;
	}

	public void setiIdNuevoTipoFactura(Long iIdNuevoTipoFactura) {
		this.iIdNuevoTipoFactura = iIdNuevoTipoFactura;
	}
	
	public Long getidTipoFacturaActual() {
		return this.idTipoFacturaActual;
	}

	public void setidTipoFacturaActual(Long idTipoFacturaActual) {
		this.idTipoFacturaActual = idTipoFacturaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TipoFactura gettipofactura() {
		return this.tipofactura;
	}

	public void settipofactura(TipoFactura tipofactura) {
		this.tipofactura = tipofactura;
	}
	
	public TipoFactura gettipofacturaAux() {
		return this.tipofacturaAux;
	}

	public void settipofacturaAux(TipoFactura tipofacturaAux) {
		this.tipofacturaAux = tipofacturaAux;
	}				
	
	public TipoFactura gettipofacturaAnterior() {
		return this.tipofacturaAnterior;
	}

	public void settipofacturaAnterior(TipoFactura tipofacturaAnterior) {
		this.tipofacturaAnterior = tipofacturaAnterior;
	}	
	
	public TipoFactura gettipofacturaTotales() {
		return this.tipofacturaTotales;
	}

	public void settipofacturaTotales(TipoFactura tipofacturaTotales) {
		this.tipofacturaTotales = tipofacturaTotales;
	}	
	
	public TipoFactura gettipofacturaBean() {
		return this.tipofacturaBean;
	}

	public void settipofacturaBean(TipoFactura tipofacturaBean) {
		this.tipofacturaBean = tipofacturaBean;
	}	
	
	public TipoFacturaParameterReturnGeneral gettipofacturaReturnGeneral() {
		return this.tipofacturaReturnGeneral;
	}

	public void settipofacturaReturnGeneral(TipoFacturaParameterReturnGeneral tipofacturaReturnGeneral) {
		this.tipofacturaReturnGeneral = tipofacturaReturnGeneral;
	}	
	
	
		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TipoFacturaLogic getTipoFacturaLogic()	{		
		return tipofacturaLogic;
	}

	public void setTipoFacturaLogic(TipoFacturaLogic tipofacturaLogic) {
		this.tipofacturaLogic = tipofacturaLogic;
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
	
	public Boolean getIsEsNuevoTipoFactura() {
		return isEsNuevoTipoFactura;
	}

	public void setIsEsNuevoTipoFactura(Boolean isEsNuevoTipoFactura) {
		this.isEsNuevoTipoFactura = isEsNuevoTipoFactura;
	}

	public Boolean getEsParaAccionDesdeFormularioTipoFactura() {
		return esParaAccionDesdeFormularioTipoFactura;
	}
	
	public void setEsParaAccionDesdeFormularioTipoFactura(Boolean esParaAccionDesdeFormularioTipoFactura) {
		this.esParaAccionDesdeFormularioTipoFactura = esParaAccionDesdeFormularioTipoFactura;
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
	
	
	
	
	
	
	
	


	


	


	
	public void refrescarForeignKeysDescripcionesTipoFactura() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TipoFacturaConstantesFunciones.refrescarForeignKeysDescripcionesTipoFactura(this.tipofacturaLogic.getTipoFacturas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TipoFacturaConstantesFunciones.refrescarForeignKeysDescripcionesTipoFactura(this.tipofacturas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//tipofacturaLogic.setTipoFacturas(this.tipofacturas);
			tipofacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TipoFacturaParameterReturnGeneral getTipoFacturaParameterGeneral() {
		return this.tipofacturaParameterGeneral;
	}
	
	public void setTipoFacturaParameterGeneral(TipoFacturaParameterReturnGeneral tipofacturaParameterGeneral) {
		this.tipofacturaParameterGeneral = tipofacturaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTipoFactura() {
		return isPermisoTodoTipoFactura;
	}

	public void setIsPermisoTodoTipoFactura(Boolean isPermisoTodoTipoFactura) {
		this.isPermisoTodoTipoFactura = isPermisoTodoTipoFactura;
	}

	public Boolean getIsPermisoNuevoTipoFactura() {
		return isPermisoNuevoTipoFactura;
	}

	public void setIsPermisoNuevoTipoFactura(Boolean isPermisoNuevoTipoFactura) {
		this.isPermisoNuevoTipoFactura = isPermisoNuevoTipoFactura;
	}

	public Boolean getIsPermisoActualizarTipoFactura() {
		return isPermisoActualizarTipoFactura;
	}

	public void setIsPermisoActualizarTipoFactura(Boolean isPermisoActualizarTipoFactura) {
		this.isPermisoActualizarTipoFactura = isPermisoActualizarTipoFactura;
	}

	public Boolean getIsPermisoEliminarTipoFactura() {
		return isPermisoEliminarTipoFactura;
	}

	public void setIsPermisoEliminarTipoFactura(Boolean isPermisoEliminarTipoFactura) {
		this.isPermisoEliminarTipoFactura = isPermisoEliminarTipoFactura;
	}

	public Boolean getIsPermisoGuardarCambiosTipoFactura() {
		return isPermisoGuardarCambiosTipoFactura;
	}

	public void setIsPermisoGuardarCambiosTipoFactura(Boolean isPermisoGuardarCambiosTipoFactura) {
		this.isPermisoGuardarCambiosTipoFactura = isPermisoGuardarCambiosTipoFactura;
	}
	
	public Boolean getIsPermisoConsultaTipoFactura() {
		return isPermisoConsultaTipoFactura;
	}

	public void setIsPermisoConsultaTipoFactura(Boolean isPermisoConsultaTipoFactura) {
		this.isPermisoConsultaTipoFactura = isPermisoConsultaTipoFactura;
	}

	public Boolean getIsPermisoBusquedaTipoFactura() {
		return isPermisoBusquedaTipoFactura;
	}

	public void setIsPermisoBusquedaTipoFactura(Boolean isPermisoBusquedaTipoFactura) {
		this.isPermisoBusquedaTipoFactura = isPermisoBusquedaTipoFactura;
	}

	public Boolean getIsPermisoReporteTipoFactura() {
		return isPermisoReporteTipoFactura;
	}

	public void setIsPermisoReporteTipoFactura(Boolean isPermisoReporteTipoFactura) {
		this.isPermisoReporteTipoFactura = isPermisoReporteTipoFactura;
	}
	
	public Boolean getIsPermisoPaginacionMedioTipoFactura() {
		return isPermisoPaginacionMedioTipoFactura;
	}

	public void setIsPermisoPaginacionMedioTipoFactura(Boolean isPermisoPaginacionMedioTipoFactura) {
		this.isPermisoPaginacionMedioTipoFactura = isPermisoPaginacionMedioTipoFactura;
	}
	
	public Boolean getIsPermisoPaginacionTodoTipoFactura() {
		return isPermisoPaginacionTodoTipoFactura;
	}

	public void setIsPermisoPaginacionTodoTipoFactura(Boolean isPermisoPaginacionTodoTipoFactura) {
		this.isPermisoPaginacionTodoTipoFactura = isPermisoPaginacionTodoTipoFactura;
	}
	
	public Boolean getIsPermisoPaginacionAltoTipoFactura() {
		return isPermisoPaginacionAltoTipoFactura;
	}

	public void setIsPermisoPaginacionAltoTipoFactura(Boolean isPermisoPaginacionAltoTipoFactura) {
		this.isPermisoPaginacionAltoTipoFactura = isPermisoPaginacionAltoTipoFactura;
	}
	
	public Boolean getIsPermisoCopiarTipoFactura() {
		return isPermisoCopiarTipoFactura;
	}

	public void setIsPermisoCopiarTipoFactura(Boolean isPermisoCopiarTipoFactura) {
		this.isPermisoCopiarTipoFactura = isPermisoCopiarTipoFactura;
	}
	
	public Boolean getIsPermisoVerFormTipoFactura() {
		return isPermisoVerFormTipoFactura;
	}

	public void setIsPermisoVerFormTipoFactura(Boolean isPermisoVerFormTipoFactura) {
		this.isPermisoVerFormTipoFactura = isPermisoVerFormTipoFactura;
	}
	
	public Boolean getIsPermisoDuplicarTipoFactura() {
		return isPermisoDuplicarTipoFactura;
	}

	public void setIsPermisoDuplicarTipoFactura(Boolean isPermisoDuplicarTipoFactura) {
		this.isPermisoDuplicarTipoFactura = isPermisoDuplicarTipoFactura;
	}
	
	public Boolean getIsPermisoOrdenTipoFactura() {
		return isPermisoOrdenTipoFactura;
	}

	public void setIsPermisoOrdenTipoFactura(Boolean isPermisoOrdenTipoFactura) {
		this.isPermisoOrdenTipoFactura = isPermisoOrdenTipoFactura;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTipoFactura() {
		return isVisibilidadCeldaNuevoTipoFactura;
	}

	public void setIsVisibilidadCeldaNuevoTipoFactura(Boolean isVisibilidadCeldaNuevoTipoFactura) {
		this.isVisibilidadCeldaNuevoTipoFactura = isVisibilidadCeldaNuevoTipoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTipoFactura() {
		return isVisibilidadCeldaDuplicarTipoFactura;
	}

	public void setIsVisibilidadCeldaDuplicarTipoFactura(Boolean isVisibilidadCeldaDuplicarTipoFactura) {
		this.isVisibilidadCeldaDuplicarTipoFactura = isVisibilidadCeldaDuplicarTipoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTipoFactura() {
		return isVisibilidadCeldaCopiarTipoFactura;
	}

	public void setIsVisibilidadCeldaCopiarTipoFactura(Boolean isVisibilidadCeldaCopiarTipoFactura) {
		this.isVisibilidadCeldaCopiarTipoFactura = isVisibilidadCeldaCopiarTipoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTipoFactura() {
		return isVisibilidadCeldaVerFormTipoFactura;
	}

	public void setIsVisibilidadCeldaVerFormTipoFactura(Boolean isVisibilidadCeldaVerFormTipoFactura) {
		this.isVisibilidadCeldaVerFormTipoFactura = isVisibilidadCeldaVerFormTipoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTipoFactura() {
		return isVisibilidadCeldaOrdenTipoFactura;
	}

	public void setIsVisibilidadCeldaOrdenTipoFactura(Boolean isVisibilidadCeldaOrdenTipoFactura) {
		this.isVisibilidadCeldaOrdenTipoFactura = isVisibilidadCeldaOrdenTipoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTipoFactura() {
		return isVisibilidadCeldaNuevoRelacionesTipoFactura;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTipoFactura(Boolean isVisibilidadCeldaNuevoRelacionesTipoFactura) {
		this.isVisibilidadCeldaNuevoRelacionesTipoFactura = isVisibilidadCeldaNuevoRelacionesTipoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTipoFactura() {
		return isVisibilidadCeldaModificarTipoFactura;
	}

	public void setIsVisibilidadCeldaModificarTipoFactura(Boolean isVisibilidadCeldaModificarTipoFactura) {
		this.isVisibilidadCeldaModificarTipoFactura = isVisibilidadCeldaModificarTipoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTipoFactura() {
		return isVisibilidadCeldaActualizarTipoFactura;
	}

	public void setIsVisibilidadCeldaActualizarTipoFactura(Boolean isVisibilidadCeldaActualizarTipoFactura) {
		this.isVisibilidadCeldaActualizarTipoFactura = isVisibilidadCeldaActualizarTipoFactura;
	}

	public Boolean getIsVisibilidadCeldaEliminarTipoFactura() {
		return isVisibilidadCeldaEliminarTipoFactura;
	}

	public void setIsVisibilidadCeldaEliminarTipoFactura(Boolean isVisibilidadCeldaEliminarTipoFactura) {
		this.isVisibilidadCeldaEliminarTipoFactura = isVisibilidadCeldaEliminarTipoFactura;
	}

	public Boolean getIsVisibilidadCeldaCancelarTipoFactura() {
		return isVisibilidadCeldaCancelarTipoFactura;
	}

	public void setIsVisibilidadCeldaCancelarTipoFactura(Boolean isVisibilidadCeldaCancelarTipoFactura) {
		this.isVisibilidadCeldaCancelarTipoFactura = isVisibilidadCeldaCancelarTipoFactura;
	}

	public Boolean getIsVisibilidadCeldaGuardarTipoFactura() {
		return isVisibilidadCeldaGuardarTipoFactura;
	}

	public void setIsVisibilidadCeldaGuardarTipoFactura(Boolean isVisibilidadCeldaGuardarTipoFactura) {
		this.isVisibilidadCeldaGuardarTipoFactura = isVisibilidadCeldaGuardarTipoFactura;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTipoFactura() {
		return isVisibilidadCeldaGuardarCambiosTipoFactura;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTipoFactura(Boolean isVisibilidadCeldaGuardarCambiosTipoFactura) {
		this.isVisibilidadCeldaGuardarCambiosTipoFactura = isVisibilidadCeldaGuardarCambiosTipoFactura;
	}
		
	public TipoFacturaSessionBean gettipofacturaSessionBean() {
		return this.tipofacturaSessionBean;
	}
	
	public void settipofacturaSessionBean(TipoFacturaSessionBean tipofacturaSessionBean) {
		this.tipofacturaSessionBean=tipofacturaSessionBean;
	}
	
	
	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTipoFactura(TipoFactura tipofactura)throws Exception {
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
	
	public void bugActualizarReferenciaActual(TipoFactura tipofactura,TipoFactura tipofacturaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTipoFactura(tipofactura);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		tipofacturaAux.setId(tipofactura.getId());
		tipofacturaAux.setVersionRow(tipofactura.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTipoFactura();
		
			int intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTipoFactura(this.tipofactura,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = tipofacturaValidator.getInvalidValues(this.tipofactura);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			tipofacturaLogic.setDatosCliente(datosCliente);
			tipofacturaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				tipofacturaAux=new  TipoFactura();
				
				tipofacturaAux.setIsNew(true);
				tipofacturaAux.setIsChanged(true);
				
				tipofacturaAux.setTipoFacturaOriginal(this.tipofactura);
				
				tipofacturaAux.setId(this.tipofactura.getId());	
				tipofacturaAux.setVersionRow(this.tipofactura.getVersionRow());	
				tipofacturaAux.setcodigo(this.tipofactura.getcodigo());	
				tipofacturaAux.setnombre(this.tipofactura.getnombre());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(tipofacturaAux,tipofacturaLogic.getTipoFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofacturaAux,tipofacturas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.tipofacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturaLogic.saveTipoFacturas();//WithConnection
						//tipofacturaLogic.getSetVersionRowTipoFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofactura,tipofacturaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipofacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				tipofacturaAux=new  TipoFactura();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.tipofacturaSessionBean.getEsGuardarRelacionado() 
					|| (this.tipofacturaSessionBean.getEsGuardarRelacionado() && this.tipofactura.getId()>=0)) {
						
					tipofacturaAux.setIsNew(false);
				}
				
				tipofacturaAux.setIsDeleted(false);
			
				tipofacturaAux.setId(this.tipofactura.getId());	
				tipofacturaAux.setVersionRow(this.tipofactura.getVersionRow());	
				tipofacturaAux.setcodigo(this.tipofactura.getcodigo());	
				tipofacturaAux.setnombre(this.tipofactura.getnombre());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofacturaAux,tipofacturaLogic.getTipoFacturas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofacturaAux,tipofacturas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.tipofacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturaLogic.saveTipoFacturas();//WithConnection
						//tipofacturaLogic.getSetVersionRowTipoFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.tipofactura,tipofacturaAux);
					
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipofacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				tipofacturaAux=new  TipoFactura();
				
				tipofacturaAux.setIsNew(false);
				tipofacturaAux.setIsChanged(false);
				
				tipofacturaAux.setIsDeleted(true);
				
				tipofacturaAux.setId(this.tipofactura.getId());	
				tipofacturaAux.setVersionRow(this.tipofactura.getVersionRow());	
				tipofacturaAux.setcodigo(this.tipofactura.getcodigo());	
				tipofacturaAux.setnombre(this.tipofactura.getnombre());	
				
				if(this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.tipofacturaAux.getId()>=0) {	
						this.tipofacturasEliminados.add(tipofacturaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(tipofacturaAux,tipofacturaLogic.getTipoFacturas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofacturaAux,tipofacturas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.tipofacturaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.tipofacturaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturaLogic.saveTipoFacturas();//WithConnection
						//tipofacturaLogic.getSetVersionRowTipoFacturas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.tipofacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.quitarFilaTotales();}
							tipofacturaAux.setFacturas(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.tipofacturaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.tipofacturaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(tipofacturaAux,tipofacturaLogic.getTipoFacturas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(tipofacturaAux,tipofacturas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.getTipoFacturas().addAll(this.tipofacturasEliminados);
					
					tipofacturaLogic.saveTipoFacturas();//WithConnection
					//tipofacturaLogic.getSetVersionRowTipoFacturas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				
				this.tipofacturasEliminados= new ArrayList<TipoFactura>();		
			}
			
			if(this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Tipo Factura GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.tipofactura=tipofacturaAux;
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
      		//this.finishProcessTipoFactura();
      	}
		
	}	
	
	public void actualizarRelaciones(TipoFactura tipofacturaLocal) throws Exception {
		
		if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				tipofacturaLocal.setFacturas(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
			
			} else {
			
				tipofacturaLocal.setFacturas(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TipoFactura tipofacturaLocal) throws Exception {	
		if(this.tipofacturaSessionBean.getEsGuardarRelacionado()) {			
			
		
		
		}
	}
	
	public Boolean validarTipoFacturaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = tipofacturaValidator.getInvalidValues(this.tipofactura);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TipoFactura tipofactura,List<TipoFactura> tipofacturas) throws Exception {
		try	{		
			TipoFacturaConstantesFunciones.actualizarLista(tipofactura,tipofacturas,this.tipofacturaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TipoFactura tipofactura,List<TipoFactura> tipofacturas) throws Exception {
		try	{			
			TipoFacturaConstantesFunciones.actualizarSelectedLista(tipofactura,tipofacturas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TipoFactura> tipofacturasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				tipofacturasLocal=this.tipofacturaLogic.getTipoFacturas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				tipofacturasLocal=this.tipofacturas;
			}
			//ARCHITECTURE
		
			for(TipoFactura tipofacturaLocal:tipofacturasLocal) {
				if(this.permiteMantenimiento(tipofacturaLocal) && tipofacturaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TipoFacturaConstantesFunciones.getTipoFacturaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TipoFacturaConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFactura.jLabelcodigoTipoFactura,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TipoFacturaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFactura.jLabelnombreTipoFactura,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFactura.jLabelcodigoTipoFactura,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTipoFactura.jLabelnombreTipoFactura,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Factura")) {
			if(this.tipofactura==null) {
				this.tipofactura= new TipoFactura();
			}

			if(this.tipofacturaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTipoFactura
				this.setVariablesFormularioToObjetoActualTipoFactura(this.tipofactura,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);

				this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.getfactura().setTipoFactura(this.tipofactura);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTipoFactura--;	
		
		
		this.tipofacturaAux=new TipoFactura();
		
		this.tipofacturaAux.setId(this.iIdNuevoTipoFactura);
		this.tipofacturaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.tipofacturaLogic.getTipoFacturas().add(this.tipofacturaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.tipofacturas.add(this.tipofacturaAux);
		}
		//ARCHITECTURE
		
		this.tipofactura=this.tipofacturaAux;
		
		if(TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTipoFactura(this.tipofactura);
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFactura(this.tipofactura);
		}
				
		//this.setDefaultControlesTipoFactura();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTipoFactura();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTipoFactura();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFactura();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFactura(this.tipofacturaBean,this.tipofactura,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TipoFacturaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {
			classes=TipoFacturaConstantesFunciones.getClassesRelationshipsOfTipoFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.tipofacturaReturnGeneral=tipofacturaLogic.procesarEventosTipoFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofacturaLogic.getTipoFacturas(),this.tipofactura,this.tipofacturaParameterGeneral,this.isEsNuevoTipoFactura,classes);//this.tipofacturaLogic.getTipoFactura()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTipoFactura(this.tipofacturaReturnGeneral,this.tipofacturaBean,false);
		
		if(this.tipofacturaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTipoFactura(this.tipofacturaReturnGeneral.getTipoFactura());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTipoFactura(this.tipofacturaReturnGeneral.getTipoFactura());
		}
		
		if(this.tipofacturaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTipoFactura(this.tipofacturaReturnGeneral.getTipoFactura(),classes);//this.tipofacturaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTipoFactura(this.tipofactura,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTipoFactura();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTipoFactura();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTipoFactura(false);
						
			if(tipofacturaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturaSessionBean.getEsGuardarRelacionado() && FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFactura();
			}
			
			this.actualizarVisualTableDatosTipoFactura();
			
			this.jTableDatosTipoFactura.setRowSelectionInterval(this.getIndiceNuevoTipoFactura(), this.getIndiceNuevoTipoFactura());
			
			this.seleccionarFilaTablaTipoFacturaActual();
						
			this.actualizarEstadoCeldasBotonesTipoFactura("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTipoFactura(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTipoFactura.jTextFieldcodigoTipoFactura.setEnabled(isHabilitar && this.tipofacturaConstantesFunciones.activarcodigoTipoFactura);
		this.jInternalFrameDetalleFormTipoFactura.jTextAreanombreTipoFactura.setEnabled(isHabilitar && this.tipofacturaConstantesFunciones.activarnombreTipoFactura);	
		
	};
	
	public void setDefaultControlesTipoFactura() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTipoFactura(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.tipofacturaSessionBean.setConGuardarRelaciones(true);			
			this.tipofacturaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.tipofacturaSessionBean.setConGuardarRelaciones(false);			
			this.tipofacturaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTipoFactura() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFactura tipofacturaAux:this.tipofacturaLogic.getTipoFacturas()) {
				if(tipofacturaAux.getId().equals(this.iIdNuevoTipoFactura)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFactura tipofacturaAux:this.tipofacturas) {
				if(tipofacturaAux.getId().equals(this.iIdNuevoTipoFactura)) {
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
	
	public int getIndiceActualTipoFactura(TipoFactura tipofactura,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFactura tipofacturaAux:this.tipofacturaLogic.getTipoFacturas()) {
				if(tipofacturaAux.getId().equals(tipofactura.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFactura tipofacturaAux:this.tipofacturas) {
				if(tipofacturaAux.getId().equals(tipofactura.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTipoFactura(TipoFactura tipofacturaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFactura tipofacturaAux:this.tipofacturaLogic.getTipoFacturas()) {
				if(tipofacturaAux.getTipoFacturaOriginal().getId().equals(tipofacturaOriginal.getId())) {
					existe=true;
					tipofacturaOriginal.setId(tipofacturaAux.getId());
					tipofacturaOriginal.setVersionRow(tipofacturaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFactura tipofacturaAux:this.tipofacturas) {
				if(tipofacturaAux.getTipoFacturaOriginal().getId().equals(tipofacturaOriginal.getId())) {
					existe=true;
					tipofacturaOriginal.setId(tipofacturaAux.getId());
					tipofacturaOriginal.setVersionRow(tipofacturaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTipoFactura(Boolean esParaCancelar) throws Exception {
		tipofacturasAux=new ArrayList<TipoFactura>();
		tipofacturaAux=new TipoFactura();
		
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFactura tipofacturaAux:this.tipofacturaLogic.getTipoFacturas()) {
					if(tipofacturaAux.getId()<0) {
						tipofacturasAux.add(tipofacturaAux);
					}		
				}
				this.iIdNuevoTipoFactura=0L;
				this.tipofacturaLogic.getTipoFacturas().removeAll(tipofacturasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFactura tipofacturaAux:this.tipofacturas) {
					if(tipofacturaAux.getId()<0) {
						tipofacturasAux.add(tipofacturaAux);
					}		
				}
				this.iIdNuevoTipoFactura=0L;
				this.tipofacturas.removeAll(tipofacturasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTipoFactura 
					&& this.tipofacturaLogic.getTipoFacturas().size()>0
					) {
					tipofacturaAux=this.tipofacturaLogic.getTipoFacturas().get(this.tipofacturaLogic.getTipoFacturas().size() - 1);
				
					if(tipofacturaAux.getId()<0) {
						this.tipofacturaLogic.getTipoFacturas().remove(tipofacturaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTipoFactura && this.tipofacturas.size()>0) {
					tipofacturaAux=this.tipofacturas.get(this.tipofacturas.size() - 1);
				
					if(tipofacturaAux.getId()<0) {
						this.tipofacturas.remove(tipofacturaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTipoFactura(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(tipofactura.getId()<0) {
				this.tipofacturaLogic.getTipoFacturas().remove(this.tipofactura);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(tipofactura.getId()<0) {
				this.tipofacturas.remove(this.tipofactura);
			}
		}			
	}
	
	public void setEstadosInicialesTipoFactura(List<TipoFactura> tipofacturasAux) throws Exception {
		TipoFacturaConstantesFunciones.setEstadosInicialesTipoFactura(tipofacturasAux);
	}
	
	public void setEstadosInicialesTipoFactura(TipoFactura tipofacturaAux) throws Exception {
		TipoFacturaConstantesFunciones.setEstadosInicialesTipoFactura(tipofacturaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTipoFacturaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTipoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTipoFacturaActual()) {
				if(!this.isEsNuevoTipoFactura) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTipoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTipoFactura=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTipoFacturaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Tipo Factura ?", "MANTENIMIENTO DE Tipo Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTipoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TipoFactura tipofactura) throws Exception {
		TipoFacturaConstantesFunciones.seleccionarAsignar(this.tipofactura,tipofactura);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTipoFactura=this.isPermisoActualizarOriginalTipoFactura;
			
			
			this.seleccionarAsignar(tipofactura);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TipoFacturaConstantesFunciones.quitarEspaciosTipoFactura(this.tipofactura,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTipoFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.tipofacturaSessionBean.setsFuncionBusquedaRapida(this.tipofacturaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTipoFactura) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTipoFactura(esParaCancelar);				
				this.cancelarNuevoTipoFactura(esParaCancelar);								
			}
			
			this.tipofactura=new TipoFactura();
			
			this.inicializarTipoFactura();
			
			this.actualizarEstadoCeldasBotonesTipoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTipoFactura() throws Exception {
		try {
			TipoFacturaConstantesFunciones.inicializarTipoFactura(this.tipofactura);
			
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
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.tipofacturaLogic.getTipoFacturas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTipoFacturas(String sAccionBusqueda,List<TipoFactura> tipofacturasParaReportes) throws Exception {
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
					sPathReporteFinal="TipoFactura"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TipoFacturaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TipoFacturaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TipoFactura"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Tipo Facturas");		
		parameters.put("busquedapor", TipoFacturaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Factura.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TipoFacturaLogic tipofacturaLogicAuxiliar=new TipoFacturaLogic();
					tipofacturaLogicAuxiliar.setDatosCliente(tipofacturaLogic.getDatosCliente());				
					tipofacturaLogicAuxiliar.setTipoFacturas(tipofacturasParaReportes);
					
					tipofacturaLogicAuxiliar.cargarRelacionesLoteForeignKeyTipoFacturaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					tipofacturasParaReportes=tipofacturaLogicAuxiliar.getTipoFacturas();
					
					//tipofacturaLogic.getNewConnexionToDeep();
					
					//for (TipoFactura tipofactura:tipofacturasParaReportes) {
					//	tipofacturaLogic.deepLoad(tipofactura, false, DeepLoadType.INCLUDE, classes);
					//}						
					//tipofacturaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//tipofacturaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileFactura = AuxiliarReportes.class.getResourceAsStream("FacturaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_factura", reportFileFactura);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTipoFactura=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TipoFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TipoFacturaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTipoFactura=new JRBeanArrayDataSource(TipoFacturaJInternalFrame.TraerTipoFacturaBeans(tipofacturasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTipoFactura);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TipoFacturaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TipoFacturaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TipoFacturaBean.TraerTipoFacturaBeans(tipofacturasParaReportes).toArray()));
							
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
				this.generarExcelReporteTipoFacturas(sAccionBusqueda,sTipoArchivoReporte,tipofacturasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTipoFacturas(sAccionBusqueda,sTipoArchivoReporte,tipofacturasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTipoFacturaActionPerformed(null);
					//this.generarExcelReporteTipoFacturas(sAccionBusqueda,sTipoArchivoReporte,tipofacturasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTipoFacturas(sAccionBusqueda,sTipoArchivoReporte,tipofacturasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTipoFacturas(sAccionBusqueda,sTipoArchivoReporte,tipofacturasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTipoFacturas(sAccionBusqueda,sTipoArchivoReporte,tipofacturasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTipoFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFactura> tipofacturasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofactura";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFacturas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFactura("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TipoFactura tipofactura : tipofacturasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TipoFacturaConstantesFunciones.generarExcelReporteDataTipoFactura("NORMAL",row,workbook,tipofactura,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTipoFactura(String sTipo,Row row,Workbook workbook) {
		
		TipoFacturaConstantesFunciones.generarExcelReporteHeaderTipoFactura(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTipoFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFactura> tipofacturasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofactura_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TipoFactura tipofactura : tipofacturasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TipoFacturaConstantesFunciones.getTipoFacturaDescripcion(tipofactura));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFacturaConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFacturaConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofactura.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TipoFacturaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TipoFacturaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(tipofactura.getnombre());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTipoFacturas(String sAccionBusqueda,String sTipoArchivoReporte,List<TipoFactura> tipofacturasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TipoFactura> tipofacturasRespaldo=null;
		
		classes=TipoFacturaConstantesFunciones.getClassesRelationshipsOfTipoFactura(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.tipofacturaLogic.setDatosCliente(this.datosCliente);
		this.tipofacturaLogic.setDatosDeep(this.datosDeep);
		this.tipofacturaLogic.setIsConDeep(true);
		
		tipofacturasRespaldo=this.tipofacturaLogic.getTipoFacturas();
		
		this.tipofacturaLogic.setTipoFacturas(tipofacturasParaReportes);	
		this.tipofacturaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		tipofacturasParaReportes=this.tipofacturaLogic.getTipoFacturas();
		this.tipofacturaLogic.setTipoFacturas(tipofacturasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofactura_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TipoFacturas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTipoFactura("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TipoFactura tipofactura : tipofacturasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTipoFactura("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TipoFacturaConstantesFunciones.generarExcelReporteDataTipoFactura("NORMAL",row,workbook,tipofactura,cellStyleDataAux);
		
			
			


				//Factura
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(FacturaConstantesFunciones.SCLASSWEBTITULO))) {

				if(tipofactura.getFacturas()!=null && tipofactura.getFacturas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(FacturaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					FacturaConstantesFunciones.generarExcelReporteHeaderFactura("RELACIONADO",row,workbook);
				}

				if(tipofactura.getFacturas()!=null) {
					i2=0;
					for(Factura factura : tipofactura.getFacturas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						FacturaConstantesFunciones.generarExcelReporteDataFactura("RELACIONADO",row,workbook,factura,cellStyleDataAuxHijo);
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
		cell.setCellValue(TipoFacturaConstantesFunciones.getTipoFacturaDescripcion(tipofactura));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFactura.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTipoFactura() throws Exception {		
		this.startProcessTipoFactura(true);
	}
	
	public void startProcessTipoFactura(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,null ,this.jPanelParametrosReportesTipoFactura, this.jScrollPanelDatosTipoFactura,this.jPanelPaginacionTipoFactura, this.jScrollPanelDatosEdicionTipoFactura, this.jPanelAccionesTipoFactura,this.jPanelAccionesFormularioTipoFactura,this.jmenuBarTipoFactura,this.jmenuBarDetalleTipoFactura,this.jTtoolBarTipoFactura,this.jTtoolBarDetalleTipoFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFactura=null; 
		
		final JPanel jPanelParametrosReportesTipoFactura=this.jPanelParametrosReportesTipoFactura;
		//final JScrollPane jScrollPanelDatosTipoFactura=this.jScrollPanelDatosTipoFactura;
		final JTable jTableDatosTipoFactura=this.jTableDatosTipoFactura;		
		final JPanel jPanelPaginacionTipoFactura=this.jPanelPaginacionTipoFactura;
		//final JScrollPane jScrollPanelDatosEdicionTipoFactura=this.jScrollPanelDatosEdicionTipoFactura;
		final JPanel jPanelAccionesTipoFactura=this.jPanelAccionesTipoFactura;
		
		JPanel jPanelCamposAuxiliarTipoFactura=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTipoFactura=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			jPanelCamposAuxiliarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jPanelCamposTipoFactura;
			jPanelAccionesFormularioAuxiliarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jPanelAccionesFormularioTipoFactura;
		}
		
		final JPanel jPanelCamposTipoFactura=jPanelCamposAuxiliarTipoFactura;
		final JPanel jPanelAccionesFormularioTipoFactura=jPanelAccionesFormularioAuxiliarTipoFactura;
		
		
		final JMenuBar jmenuBarTipoFactura=this.jmenuBarTipoFactura;
		final JToolBar jTtoolBarTipoFactura=this.jTtoolBarTipoFactura;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTipoFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFactura=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			jmenuBarDetalleAuxiliarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jmenuBarDetalleTipoFactura;
			jTtoolBarDetalleAuxiliarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jTtoolBarDetalleTipoFactura;
		}
		
		final JMenuBar jmenuBarDetalleTipoFactura=jmenuBarDetalleAuxiliarTipoFactura;
		final JToolBar jTtoolBarDetalleTipoFactura=jTtoolBarDetalleAuxiliarTipoFactura;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFactura;
			processRunnable.jTableDatos=jTableDatosTipoFactura;
			processRunnable.jPanelCampos=jPanelCamposTipoFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFactura;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFactura;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFactura;
			processRunnable.jTtoolBar=jTtoolBarTipoFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTipoFactura ,jPanelParametrosReportesTipoFactura,jTableDatosTipoFactura, /*jScrollPanelDatosTipoFactura,*/jPanelCamposTipoFactura,jPanelPaginacionTipoFactura, /*jScrollPanelDatosEdicionTipoFactura,*/ jPanelAccionesTipoFactura,jPanelAccionesFormularioTipoFactura,jmenuBarTipoFactura,jmenuBarDetalleTipoFactura,jTtoolBarTipoFactura,jTtoolBarDetalleTipoFactura);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,null ,jPanelParametrosReportesTipoFactura, jScrollPanelDatosTipoFactura,jPanelPaginacionTipoFactura, jScrollPanelDatosEdicionTipoFactura, jPanelAccionesTipoFactura,jPanelAccionesFormularioTipoFactura,jmenuBarTipoFactura,jmenuBarDetalleTipoFactura,jTtoolBarTipoFactura,jTtoolBarDetalleTipoFactura);
						
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
	
	public void finishProcessTipoFactura() {// throws Exception 
		this.finishProcessTipoFactura(true);
	}
	
	public void finishProcessTipoFactura(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,null ,this.jPanelParametrosReportesTipoFactura, this.jScrollPanelDatosTipoFactura,this.jPanelPaginacionTipoFactura, this.jScrollPanelDatosEdicionTipoFactura, this.jPanelAccionesTipoFactura,this.jPanelAccionesFormularioTipoFactura,this.jmenuBarTipoFactura,this.jmenuBarDetalleTipoFactura,this.jTtoolBarTipoFactura,this.jTtoolBarDetalleTipoFactura);		
		
		final JTabbedPane jTabbedPaneBusquedasTipoFactura=null; 
		
		final JPanel jPanelParametrosReportesTipoFactura=this.jPanelParametrosReportesTipoFactura;
		//final JScrollPane jScrollPanelDatosTipoFactura=this.jScrollPanelDatosTipoFactura;
		final JTable jTableDatosTipoFactura=this.jTableDatosTipoFactura;		
		final JPanel jPanelPaginacionTipoFactura=this.jPanelPaginacionTipoFactura;
		//final JScrollPane jScrollPanelDatosEdicionTipoFactura=this.jScrollPanelDatosEdicionTipoFactura;
		final JPanel jPanelAccionesTipoFactura=this.jPanelAccionesTipoFactura;
		
		JPanel jPanelCamposAuxiliarTipoFactura=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTipoFactura=new JPanel();
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			jPanelCamposAuxiliarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jPanelCamposTipoFactura;
			jPanelAccionesFormularioAuxiliarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jPanelAccionesFormularioTipoFactura;
		}
		
		final JPanel jPanelCamposTipoFactura=jPanelCamposAuxiliarTipoFactura;
		final JPanel jPanelAccionesFormularioTipoFactura=jPanelAccionesFormularioAuxiliarTipoFactura;
		
		
		final JMenuBar jmenuBarTipoFactura=this.jmenuBarTipoFactura;		
		final JToolBar jTtoolBarTipoFactura=this.jTtoolBarTipoFactura;
				
		JMenuBar jmenuBarDetalleAuxiliarTipoFactura=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTipoFactura=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			jmenuBarDetalleAuxiliarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jmenuBarDetalleTipoFactura;
			jTtoolBarDetalleAuxiliarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jTtoolBarDetalleTipoFactura;		
		}
		
		final JMenuBar jmenuBarDetalleTipoFactura=jmenuBarDetalleAuxiliarTipoFactura;
		final JToolBar jTtoolBarDetalleTipoFactura=jTtoolBarDetalleAuxiliarTipoFactura;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTipoFactura;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTipoFactura;
			processRunnable.jTableDatos=jTableDatosTipoFactura;
			processRunnable.jPanelCampos=jPanelCamposTipoFactura;
			processRunnable.jPanelPaginacion=jPanelPaginacionTipoFactura;
			processRunnable.jPanelAcciones=jPanelAccionesTipoFactura;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTipoFactura;
			
			
			processRunnable.jmenuBar=jmenuBarTipoFactura;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTipoFactura;
			processRunnable.jTtoolBar=jTtoolBarTipoFactura;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTipoFactura;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTipoFactura ,jPanelParametrosReportesTipoFactura, jTableDatosTipoFactura,/*jScrollPanelDatosTipoFactura,*/jPanelCamposTipoFactura,jPanelPaginacionTipoFactura, /*jScrollPanelDatosEdicionTipoFactura,*/ jPanelAccionesTipoFactura,jPanelAccionesFormularioTipoFactura,jmenuBarTipoFactura,jmenuBarDetalleTipoFactura,jTtoolBarTipoFactura,jTtoolBarDetalleTipoFactura));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTipoFactura(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTipoFactura(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTipoFactura(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTipoFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTipoFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTipoFactura,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTipoFactura(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTipoFactura,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTipoFactura,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.tipofacturaConstantesFunciones.getsFinalQueryTipoFactura();
		String  finalQueryPaginacionTodos=this.tipofacturaConstantesFunciones.getsFinalQueryTipoFactura();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TipoFacturaConstantesFunciones.getArrayColumnasGlobalesNoTipoFactura(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TipoFacturaConstantesFunciones.getArrayColumnasGlobalesTipoFactura(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TipoFacturaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.tipofacturasEliminados= new ArrayList<TipoFactura>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTipoFactura();
		
				///*TipoFacturaSessionBean*/this.tipofacturaSessionBean=new TipoFacturaSessionBean();
			
			if(this.tipofacturaSessionBean==null) {
				this.tipofacturaSessionBean=new TipoFacturaSessionBean();
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
					this.iNumeroPaginacion=TipoFacturaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TipoFacturaConstantesFunciones.getClassesForeignKeysOfTipoFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/tipofactura."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			tipofacturasAux= new ArrayList<TipoFactura>();
			
				
			tipofacturaLogic.setDatosCliente(this.datosCliente);
			tipofacturaLogic.setDatosDeep(this.datosDeep);
			tipofacturaLogic.setIsConDeep(true);
			
			
			tipofacturaLogic.getTipoFacturaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					tipofacturaLogic.getTodosTipoFacturas(finalQueryGlobal,pagination);
					
					//tipofacturaLogic.getTodosTipoFacturasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(tipofacturaLogic.getTipoFacturas()==null|| tipofacturaLogic.getTipoFacturas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofacturasAux= new ArrayList<TipoFactura>();
							tipofacturasAux.addAll(tipofacturaLogic.getTipoFacturas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofacturasAux= new ArrayList<TipoFactura>();
							tipofacturasAux.addAll(tipofacturas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofacturaLogic.getTodosTipoFacturas(finalQueryGlobal+"",this.pagination);												
							
							//tipofacturaLogic.getTodosTipoFacturasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTipoFacturas("Todos",tipofacturaLogic.getTipoFacturas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							tipofacturaLogic.setTipoFacturas(new ArrayList<TipoFactura>());					
							tipofacturaLogic.getTipoFacturas().addAll(tipofacturasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofacturas=new ArrayList<TipoFactura>();
							tipofacturas.addAll(tipofacturasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTipoFactura=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTipoFactura=this.idActual;
				
				} else if(this.idTipoFacturaActual!=null && this.idTipoFacturaActual!=0L) {
					idTipoFactura=idTipoFacturaActual;
				}
				
					
				this.sDetalleReporte=TipoFacturaConstantesFunciones.getDetalleIndicePorId(idTipoFactura);
				
				this.tipofacturas=new ArrayList<TipoFactura>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					tipofacturaLogic.getEntity(idTipoFactura);
					
					//tipofacturaLogic.getEntityWithConnection(idTipoFactura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofacturaLogic.setTipoFacturas(new ArrayList<TipoFactura>());
					tipofacturaLogic.getTipoFacturas().add(tipofacturaLogic.getTipoFactura());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofacturas=new ArrayList<TipoFactura>();
					this.tipofacturas.add(tipofactura);
				}
				
				if(tipofacturaLogic.getTipoFactura()==null)	{
					
				
				}			
			}
			
		 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTipoFactura();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTipoFactura();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofacturaLogic.getTipoFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofacturas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=tipofacturaLogic.getTipoFacturas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=tipofacturas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TipoFactura tipofactura) {
		Boolean permite=true;
		
		if(this.tipofactura.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TipoFacturaConstantesFunciones.getOrderByListaTipoFactura();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TipoFacturaConstantesFunciones.getOrderByListaTipoFactura();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFactura tipofactura:tipofacturaLogic.getTipoFacturas()) {
				if(tipofactura.getsType().equals(Constantes2.S_TOTALES)) {
					tipofacturaTotales=tipofactura;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFactura tipofactura:this.tipofacturas) {
				if(tipofactura.getsType().equals(Constantes2.S_TOTALES)) {
					tipofacturaTotales=tipofactura;
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
			this.tipofacturaAux=new TipoFactura();
			this.tipofacturaAux.setsType(Constantes2.S_TOTALES);
			this.tipofacturaAux.setIsNew(false);
			this.tipofacturaAux.setIsChanged(false);
			this.tipofacturaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TipoFacturaConstantesFunciones.TotalizarValoresFilaTipoFactura(this.tipofacturaLogic.getTipoFacturas(),this.tipofacturaAux);
				
				this.tipofacturaLogic.getTipoFacturas().add(this.tipofacturaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TipoFacturaConstantesFunciones.TotalizarValoresFilaTipoFactura(this.tipofacturas,this.tipofacturaAux);
				
				this.tipofacturas.add(this.tipofacturaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		tipofacturaTotales=new TipoFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofacturaLogic.getTipoFacturas().remove(tipofacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.tipofacturas.remove(tipofacturaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		tipofacturaTotales=new TipoFactura();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TipoFactura tipofactura:tipofacturaLogic.getTipoFacturas()) {
				if(tipofactura.getsType().equals(Constantes2.S_TOTALES)) {
					tipofacturaTotales=tipofactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFacturaConstantesFunciones.TotalizarValoresFilaTipoFactura(this.tipofacturaLogic.getTipoFacturas(),tipofacturaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TipoFactura tipofactura:this.tipofacturas) {
				if(tipofactura.getsType().equals(Constantes2.S_TOTALES)) {
					tipofacturaTotales=tipofactura;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TipoFacturaConstantesFunciones.TotalizarValoresFilaTipoFactura(this.tipofacturas,tipofacturaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
	
	public void inicializarPermisosTipoFactura() {
		this.isPermisoTodoTipoFactura=false;
		this.isPermisoNuevoTipoFactura=false;
		this.isPermisoActualizarTipoFactura=false;
		this.isPermisoActualizarOriginalTipoFactura=false;
		this.isPermisoEliminarTipoFactura=false;
		this.isPermisoGuardarCambiosTipoFactura=false;
		this.isPermisoConsultaTipoFactura=false;
		this.isPermisoBusquedaTipoFactura=false;
		this.isPermisoReporteTipoFactura=false;		
		this.isPermisoOrdenTipoFactura=false;		
		this.isPermisoPaginacionMedioTipoFactura=false;		
		this.isPermisoPaginacionAltoTipoFactura=false;
		this.isPermisoPaginacionTodoTipoFactura=false;
		this.isPermisoCopiarTipoFactura=false;		
		this.isPermisoVerFormTipoFactura=false;		
		this.isPermisoDuplicarTipoFactura=false;		
		this.isPermisoOrdenTipoFactura=false;		
	}
	
	public void setPermisosUsuarioTipoFactura(Boolean isPermiso) {
		this.isPermisoTodoTipoFactura=isPermiso;
		this.isPermisoNuevoTipoFactura=isPermiso;
		this.isPermisoActualizarTipoFactura=isPermiso;
		this.isPermisoActualizarOriginalTipoFactura=isPermiso;
		this.isPermisoEliminarTipoFactura=isPermiso;
		this.isPermisoGuardarCambiosTipoFactura=isPermiso;
		this.isPermisoConsultaTipoFactura=isPermiso;
		this.isPermisoBusquedaTipoFactura=isPermiso;
		this.isPermisoReporteTipoFactura=isPermiso;
		this.isPermisoOrdenTipoFactura=isPermiso;		
		this.isPermisoPaginacionMedioTipoFactura=isPermiso;		
		this.isPermisoPaginacionAltoTipoFactura=isPermiso;		
		this.isPermisoPaginacionTodoTipoFactura=isPermiso;		
		this.isPermisoCopiarTipoFactura=isPermiso;		
		this.isPermisoVerFormTipoFactura=isPermiso;		
		this.isPermisoDuplicarTipoFactura=isPermiso;
		this.isPermisoOrdenTipoFactura=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTipoFactura(Boolean isPermiso) {
		//this.isPermisoTodoTipoFactura=isPermiso;
		this.isPermisoNuevoTipoFactura=isPermiso;
		this.isPermisoActualizarTipoFactura=isPermiso;
		this.isPermisoActualizarOriginalTipoFactura=isPermiso;
		this.isPermisoEliminarTipoFactura=isPermiso;
		this.isPermisoGuardarCambiosTipoFactura=isPermiso;
		//this.isPermisoConsultaTipoFactura=isPermiso;
		//this.isPermisoBusquedaTipoFactura=isPermiso;
		//this.isPermisoReporteTipoFactura=isPermiso;
		//this.isPermisoOrdenTipoFactura=isPermiso;		
		//this.isPermisoPaginacionMedioTipoFactura=isPermiso;		
		//this.isPermisoPaginacionAltoTipoFactura=isPermiso;		
		//this.isPermisoPaginacionTodoTipoFactura=isPermiso;		
		//this.isPermisoCopiarTipoFactura=isPermiso;		
		//this.isPermisoDuplicarTipoFactura=isPermiso;
		//this.isPermisoOrdenTipoFactura=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTipoFacturaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(FacturaConstantesFunciones.SNOMBREOPCION);
		
		if(TipoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosFactura=false;
		this.isTienePermisosFactura=this.verificarGetPermisosUsuarioOpcionTipoFacturaClaseRelacionada(this.opcionsRelacionadas,FacturaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTipoFactura(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTipoFacturaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosFactura=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTipoFacturaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTipoFacturaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTipoFacturaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosFactura && this.jInternalFrameDetalleFormTipoFactura!=null && this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.remove(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTipoFactura() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TipoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TipoFacturaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTipoFactura=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTipoFactura=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTipoFactura=this.isPermisoActualizarTipoFactura;
			this.isPermisoEliminarTipoFactura=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTipoFactura=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTipoFactura=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTipoFactura=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTipoFactura=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTipoFactura=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTipoFactura=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTipoFactura=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTipoFactura=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTipoFactura=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTipoFactura=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTipoFactura=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTipoFactura=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTipoFactura.setToolTipText(this.jTableDatosTipoFactura.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTipoFactura(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTipoFactura(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TipoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TipoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTipoFactura() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosFactura && this.tipofacturaConstantesFunciones.mostrarFacturaTipoFactura && !TipoFacturaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Factura");
			reporte.setsDescripcion("Factura");
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
	
		
	public void inicializarCombosForeignKeyTipoFacturaListas()throws Exception {
		try	{						
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTipoFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TipoFacturaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTipoFacturaListas(false);
			} else {
			
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	public void cargarCombosLoteForeignKeyTipoFacturaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTipoFactura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	public void initActionsCombosTodosForeignKeyTipoFactura()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTipoFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTipoFactura()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFactura();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTipoFactura(TipoFactura tipofactura)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTipoFactura(TipoFactura tipofactura,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTipoFactura()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTipoFactura()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTipoFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTipoFactura()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTipoFactura()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTipoFactura()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTipoFactura(String sFormularioTipoBusqueda)throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTipoFactura()throws Exception {
		try {
			


		} catch(Exception e) {
			throw e;
		}		
	}		
	
	
	
	

	public TipoFacturaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TipoFacturaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TipoFacturaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.tipofacturaSessionBean=new TipoFacturaSessionBean(); 
		this.tipofacturaConstantesFunciones=new TipoFacturaConstantesFunciones(); 
		this.tipofacturaBean=new TipoFactura();//(this.tipofacturaConstantesFunciones); 		
		this.tipofacturaReturnGeneral=new TipoFacturaParameterReturnGeneral(); 
		
		this.tipofacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipofacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TipoFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TipoFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TipoFacturaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTipoFactura(true);
			
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
			
			this.tipofacturaConstantesFunciones=new TipoFacturaConstantesFunciones(); 
			this.tipofacturaBean=new TipoFactura();//this.tipofacturaConstantesFunciones); 			
			this.tipofacturaReturnGeneral=new TipoFacturaParameterReturnGeneral(); 
		
			TipoFacturaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Factura Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.tipofactura=new TipoFactura();
			this.tipofacturas = new ArrayList<TipoFactura>();
			this.tipofacturasAux = new ArrayList<TipoFactura>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic=new TipoFacturaLogic();
				this.tipofacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.tipofacturaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.tipofacturaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTipoFactura);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTipoFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFactura);	
					}
					
					if(this.jInternalFrameImportacionTipoFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFactura);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTipoFactura!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTipoFactura);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTipoFactura!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFactura);
				this.jInternalFrameDetalleFormTipoFactura.setVisible(false);
				this.jInternalFrameDetalleFormTipoFactura.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTipoFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFactura);
					this.jInternalFrameReporteDinamicoTipoFactura.setVisible(false);
					this.jInternalFrameReporteDinamicoTipoFactura.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTipoFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTipoFactura);
					this.jInternalFrameImportacionTipoFactura.setVisible(false);
					this.jInternalFrameImportacionTipoFactura.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTipoFactura!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTipoFactura);
					this.jInternalFrameOrderByTipoFactura.setVisible(false);
					this.jInternalFrameOrderByTipoFactura.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTipoFacturaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TipoFacturaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.tipofacturaReturnGeneral=new TipoFacturaParameterReturnGeneral();
			
			this.tipofacturaParameterGeneral=new TipoFacturaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.tipofacturaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TipoFacturaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(FacturaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofacturaSessionBean.getEsGuardarRelacionado(),this.tipofacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TipoFacturaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.tipofacturaSessionBean.getEsGuardarRelacionado(),this.tipofacturaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTipoFactura=false;
			this.isVisibilidadCeldaDuplicarTipoFactura=true;
			this.isVisibilidadCeldaCopiarTipoFactura=true;
			this.isVisibilidadCeldaVerFormTipoFactura=true;
			this.isVisibilidadCeldaOrdenTipoFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=false;
			this.isVisibilidadCeldaModificarTipoFactura=false;
			this.isVisibilidadCeldaActualizarTipoFactura=false;
			this.isVisibilidadCeldaEliminarTipoFactura=false;
			this.isVisibilidadCeldaCancelarTipoFactura=false;
			this.isVisibilidadCeldaGuardarTipoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=false;
			
			
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTipoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTipoFactura();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTipoFactura(false);
			
			this.setPermisosUsuarioTipoFactura();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofacturaSessionBean.getEsGuardarRelacionado() 
				|| (this.tipofacturaSessionBean.getEsGuardarRelacionado() && this.tipofacturaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTipoFacturaClasesRelacionadas();
			}
			
			if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTipoFacturaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTipoFactura();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTipoFactura();
			}
			
			if(!this.isPermisoBusquedaTipoFactura) {
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTipoFactura,this.isPermisoPaginacionMedioTipoFactura,this.isPermisoPaginacionTodoTipoFactura);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TipoFacturaConstantesFunciones.getTiposSeleccionarTipoFactura());
				
				this.tiposColumnasSelect=TipoFacturaConstantesFunciones.getTiposSeleccionarTipoFactura(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTipoFactura();				
				//this.tiposRelacionesSelect=TipoFacturaConstantesFunciones.getTiposRelacionesTipoFactura(true);
				
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
			//if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTipoFactura();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,true,false);
				this.setAccionesUsuarioTipoFactura(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,true,false);							
				this.setAccionesUsuarioTipoFactura(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFactura() ;
			
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
			
			
			this.facturaLogic=new FacturaLogic(); 
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
				tipofacturaImplementable= (TipoFacturaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				tipofacturaImplementableHome= (TipoFacturaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TipoFacturaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.tipofacturas= new ArrayList<TipoFactura>();
			this.tipofacturasEliminados= new ArrayList<TipoFactura>();
						
			this.isEsNuevoTipoFactura=false;
			this.esParaAccionDesdeFormularioTipoFactura=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTipoFactura(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTipoFactura();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TipoFacturaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTipoFactura("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTipoFactura(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTipoFactura!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTipoFactura();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTipoFactura();
			}
			
			
			
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTipoFactura(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TipoFactura: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTipoFactura() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(FacturaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(FacturaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTipoFactura")) {
				iIndex=this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();	
				
				

				if(sTitle.equals("Facturas")) {
					if(!FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTipoFactura();

						this.cargarParteTabPanelRelacionadaFactura(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTipoFactura();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaFactura(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTipoFactura.cargarSessionConBeanSwingJInternalFrameFactura(false,true,iIndex);
		this.jButtonFacturaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaFactura();

		//this.jTabbedPaneRelacionesTipoFactura.updateUI();
		//this.jTabbedPaneRelacionesTipoFactura.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTipoFactura.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Factura")) {
				int row=this.jTableDatosTipoFactura.getSelectedRow();
				jButtonFacturaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Factura")) {

					if(this.isTienePermisosFactura && this.tipofacturaConstantesFunciones.mostrarFacturaTipoFactura && !TipoFacturaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Facturas"+"("+FacturaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Facturas");

						if(tipofacturaConstantesFunciones.resaltarFacturaTipoFactura!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(tipofacturaConstantesFunciones.resaltarFacturaTipoFactura);
						}

						jmenuItem.setEnabled(this.tipofacturaConstantesFunciones.activarFacturaTipoFactura);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Factura"));

						

						this.jInternalFrameDetalleFormTipoFactura.jmenuDetalleTipoFactura.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTipoFactura(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTipoFactura(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTipoFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTipoFacturaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTipoFactura();
		
		this.cargarCombosFrameForeignKeyTipoFactura();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTipoFactura();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTipoFactura();
		}
	}
	
	
	
	public void jButtonNuevoTipoFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
			
			if(jTableDatosTipoFactura.getRowCount()>=1) {
				jTableDatosTipoFactura.removeRowSelectionInterval(0, jTableDatosTipoFactura.getRowCount()-1);						
			}
			
			this.isEsNuevoTipoFactura=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTipoFactura(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTipoFactura(true);			
			//this.tipofactura=new TipoFactura();
			//this.tipofactura.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFactura(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFactura() ;
			
			if(TipoFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFactura(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.tipofactura);	
			this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);				
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
			if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TipoFactura: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTipoFacturaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTipoFactura.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTipoFactura.getSelectedRows().length;			
			}
			
			tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTipoFactura--;			
				//TipoFactura tipofacturaAux= new TipoFactura();			
				//tipofacturaAux.setId(this.iIdNuevoTipoFactura);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TipoFactura tipofacturaOrigen=new TipoFactura();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TipoFactura tipofacturaOrigen : tipofacturasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							tipofacturaOrigen =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							tipofacturaOrigen =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTipoFactura();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.tipofactura.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTipoFactura(tipofacturaOrigen,this.tipofactura,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofacturaLogic.getTipoFacturas().add(this.tipofacturaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofacturas.add(this.tipofacturaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTipoFactura(false);
				
				this.jTableDatosTipoFactura.setRowSelectionInterval(this.getIndiceNuevoTipoFactura(), this.getIndiceNuevoTipoFactura());
				
				int iLastRow =  this.jTableDatosTipoFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFactura(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();									
		
			TipoFactura tipofacturaOrigen=new TipoFactura();
			TipoFactura tipofacturaDestino=new TipoFactura();
				
			tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTipoFactura.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || tipofacturasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTipoFactura.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturaOrigen =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofacturaOrigen =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						tipofacturaDestino =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						tipofacturaDestino =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				tipofacturaOrigen =tipofacturasSeleccionados.get(0);
				tipofacturaDestino =tipofacturasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTipoFactura(tipofacturaOrigen,tipofacturaDestino,true,false);
				
				tipofacturaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(tipofacturaDestino,tipofacturaLogic.getTipoFacturas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(tipofacturaDestino,tipofacturas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTipoFactura(false);
				
				//this.jTableDatosTipoFactura.setRowSelectionInterval(this.getIndiceNuevoTipoFactura(), this.getIndiceNuevoTipoFactura());
				
				int iLastRow =  this.jTableDatosTipoFactura.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTipoFactura.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTipoFactura.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFactura(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTipoFactura.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTipoFactura.isVisible();
			
			
			this.jPanelParametrosReportesTipoFactura.setVisible(!isVisible);
			this.jPanelPaginacionTipoFactura.setVisible(!isVisible);
			this.jPanelAccionesTipoFactura.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTipoFactura();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTipoFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTipoFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTipoFactura();
			
			this.abrirFrameOrderByTipoFactura();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTipoFactura();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTipoFactura(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFactura);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTipoFactura.isMaximum()) {
					this.jInternalFrameDetalleFormTipoFactura.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTipoFactura.setSize(this.jInternalFrameDetalleFormTipoFactura.iWidthFormulario,this.jInternalFrameDetalleFormTipoFactura.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTipoFactura.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTipoFactura.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTipoFactura.isMaximum()) {
						this.jInternalFrameDetalleFormTipoFactura.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTipoFactura.jContentPaneDetalleTipoFactura.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTipoFactura.jContentPaneDetalleTipoFactura.getWidth(),TipoFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTipoFactura.jContentPaneDetalleTipoFactura.getWidth(),TipoFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTipoFactura.jContentPaneDetalleTipoFactura.getWidth(),TipoFacturaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaFactura();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTipoFactura.setVisible(true);
	        this.jInternalFrameDetalleFormTipoFactura.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTipoFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTipoFactura==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTipoFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFactura,false,this);
				} else {
					this.jInternalFrameOrderByTipoFactura=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTipoFactura,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTipoFactura);
				this.jInternalFrameOrderByTipoFactura.setVisible(false);
				this.jInternalFrameOrderByTipoFactura.setSelected(false);
				
				this.jInternalFrameOrderByTipoFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFactura"));
				
				this.inicializarActualizarBindingTablaOrderByTipoFactura();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTipoFactura() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTipoFactura==null) {
				
				this.jInternalFrameImportacionTipoFactura=new ImportacionJInternalFrame(TipoFacturaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTipoFactura);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTipoFactura);
				this.jInternalFrameImportacionTipoFactura.setVisible(false);
				this.jInternalFrameImportacionTipoFactura.setSelected(false);


				this.jInternalFrameImportacionTipoFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFactura"));
				this.jInternalFrameImportacionTipoFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFactura"));
				this.jInternalFrameImportacionTipoFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFactura"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTipoFactura() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTipoFactura==null) {
				this.jInternalFrameReporteDinamicoTipoFactura=new ReporteDinamicoJInternalFrame(TipoFacturaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTipoFactura);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTipoFactura);
				this.jInternalFrameReporteDinamicoTipoFactura.setVisible(false);
				this.jInternalFrameReporteDinamicoTipoFactura.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTipoFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFactura"));
				this.jInternalFrameReporteDinamicoTipoFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFactura"));
				this.jInternalFrameReporteDinamicoTipoFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFactura"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFactura();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaFactura() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTipoFactura.jContentPaneDetalleTipoFactura.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTipoFactura() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTipoFactura);
			
	       	this.jInternalFrameDetalleFormTipoFactura.setVisible(false);
	        this.jInternalFrameDetalleFormTipoFactura.setSelected(false);
			
			//this.jInternalFrameDetalleFormTipoFactura.dispose();
			//this.jInternalFrameDetalleFormTipoFactura=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTipoFactura() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTipoFactura.setVisible(true);
	        this.jInternalFrameReporteDinamicoTipoFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTipoFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTipoFactura.setVisible(true);
	        this.jInternalFrameImportacionTipoFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTipoFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTipoFactura.setVisible(true);
	        this.jInternalFrameOrderByTipoFactura.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTipoFactura() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTipoFactura.setVisible(false);
	        this.jInternalFrameOrderByTipoFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTipoFactura() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTipoFactura.setVisible(false);
	        this.jInternalFrameReporteDinamicoTipoFactura.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTipoFactura() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTipoFactura.setVisible(false);
	        this.jInternalFrameImportacionTipoFactura.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTipoFactura(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTipoFactura(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTipoFactura(true);
			//this.isEsNuevoTipoFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTipoFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFactura(false) ;
			
			if(tipofacturaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturaSessionBean.getEsGuardarRelacionado() && FacturaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonFacturaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TipoFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFactura(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTipoFacturaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTipoFactura(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTipoFactura(true);
			//this.isEsNuevoTipoFactura=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.tipofactura.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTipoFactura("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTipoFactura(false) ;
			
			if(TipoFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTipoFactura(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFactura(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
	
	
	
	public void jButtonActualizarTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTipoFactura(false);
			
			//if(!this.isEsNuevoTipoFactura) {								
				int intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTipoFactura(this.tipofactura,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
				
			}
			
			if(this.permiteMantenimiento(this.tipofactura)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTipoFactura=true;
					this.inicializarActualizarBindingTablaTipoFactura(false);
					this.isEsNuevoTipoFactura=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTipoFactura=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTipoFactura=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFactura(false);
				
				this.habilitarDeshabilitarControlesTipoFactura(false);
			
												
				
				if(TipoFacturaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTipoFactura();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTipoFacturaActionPerformed(evt,tipofacturaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTipoFactura(this.tipofactura,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTipoFactura.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,tipofacturaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.tipofactura.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTipoFacturaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				this.tipofactura.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				this.tipofactura.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.tipofactura)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TipoFacturaModel) this.jTableDatosTipoFactura.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTipoFactura=true;
				this.inicializarActualizarBindingTablaTipoFactura(false);
				this.isEsNuevoTipoFactura=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTipoFactura(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFactura(false);
				
				this.habilitarDeshabilitarControlesTipoFactura(false);
				
				
				
				if(TipoFacturaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTipoFactura();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTipoFacturaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTipoFactura.getRowCount()>=1) {
				jTableDatosTipoFactura.removeRowSelectionInterval(0, jTableDatosTipoFactura.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTipoFactura(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTipoFactura(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTipoFactura(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTipoFactura(false) ;
			
			this.isEsNuevoTipoFactura=false;
			
			if(TipoFacturaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTipoFactura();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTipoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTipoFactura(false);
				
				//SI ES MANUAL
				if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTipoFactura();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTipoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTipoFactura--;			
			//TipoFactura tipofacturaAux= new TipoFactura();			
			//tipofacturaAux.setId(this.iIdNuevoTipoFactura);
			
			if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTipoFactura();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
			
			this.tipofactura.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.tipofacturaLogic.getTipoFacturas().add(this.tipofacturaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.tipofacturas.add(this.tipofacturaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTipoFactura(false);
			
			this.jTableDatosTipoFactura.setRowSelectionInterval(this.getIndiceNuevoTipoFactura(), this.getIndiceNuevoTipoFactura());
			
			int iLastRow =  this.jTableDatosTipoFactura.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTipoFactura.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTipoFactura.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTipoFactura(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTipoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTipoFactura(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFactura(false);
			
			//SI ES MANUAL
			if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFactura();
			}
			
			//this.abrirFrameTreeTipoFactura();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTipoFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Tipo FacturaS ?", "MANTENIMIENTO DE Tipo Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTipoFactura.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTipoFactura();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.tipofacturaReturnGeneral=tipofacturaLogic.procesarImportacionTipoFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.tipofacturaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTipoFacturaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTipoFacturaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTipoFactura.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTipoFactura.setFileImportacion(this.jInternalFrameImportacionTipoFactura.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTipoFactura.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTipoFactura.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTipoFactura.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTipoFactura.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTipoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();		

		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TipoFacturaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TipoFacturaBaseDesign.jrxml";
			
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
			
			this.generarReporteTipoFacturas("Todos",tipofacturasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFacturaConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TipoFacturaConstantesFunciones.LABEL_NOMBRE:
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
		
		if(this.jInternalFrameReporteDinamicoTipoFactura.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TipoFacturaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case TipoFacturaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TipoFacturaConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case TipoFacturaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TipoFacturaConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case TipoFacturaConstantesFunciones.LABEL_NOMBRE:
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
	
	public void jButtonGenerarExcelReporteDinamicoTipoFacturaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();		
		
		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofactura";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TipoFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TipoFacturaConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFacturaConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(TipoFactura tipofactura:tipofacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofactura.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TipoFacturaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TipoFacturaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(TipoFactura tipofactura:tipofacturasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(tipofactura.getnombre());
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
			//	this.getFilaCabeceraExportarExcelTipoFactura(row);				
			//	iRow++;
			//}				
			
			//for(TipoFactura tipofacturaAux:tipofacturasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTipoFactura(tipofacturaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
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
				this.tipofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFactura(false);
			
			//SI ES MANUAL
			if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTipoFactura();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTipoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFactura(false);
			
			//SI ES MANUAL
			if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFactura();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTipoFacturaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTipoFactura(false);
			
			//SI ES MANUAL
			if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTipoFactura();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.tipofacturaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTipoFactura() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTipoFactura.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTipoFactura.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTipoFactura.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTipoFactura.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTipoFactura.setMinimumSize(dimensionMinimum);
		this.jTableDatosTipoFactura.setMaximumSize(dimensionMaximum);
		this.jTableDatosTipoFactura.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTipoFactura(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTipoFactura(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTipoFactura(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTipoFactura(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTipoFactura(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTipoFactura(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFactura(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTipoFactura(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTipoFactura() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTipoFactura();
		
		this.inicializarActualizarBindingBotonesManualTipoFactura(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFactura();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTipoFactura() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFactura(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFactura(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTipoFactura.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTipoFactura.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTipoFactura.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTipoFactura!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTipoFactura.jCheckBoxPostAccionNuevoTipoFactura.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTipoFactura.jCheckBoxPostAccionSinCerrarTipoFactura.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTipoFactura.jCheckBoxPostAccionSinMensajeTipoFactura.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTipoFactura.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTipoFactura.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTipoFactura.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTipoFactura!=null) {
				this.jInternalFrameDetalleFormTipoFactura.jCheckBoxPostAccionNuevoTipoFactura.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTipoFactura.jCheckBoxPostAccionSinCerrarTipoFactura.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTipoFactura.jCheckBoxPostAccionSinMensajeTipoFactura.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTipoFactura.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTipoFactura.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTipoFactura.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTipoFactura!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTipoFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTipoFactura.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTipoFactura.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTipoFactura.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTipoFactura!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTipoFactura.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTipoFactura.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTipoFactura(Boolean esInicializar) throws Exception {
		try	{	
			if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTipoFactura(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTipoFactura() throws Exception {
		try	{
			if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFactura();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFactura() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTipoFactura() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTipoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTipoFactura.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTipoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTipoFactura.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTipoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTipoFactura.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTipoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTipoFactura.addItem(reporte);
			}
			
			
			if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTipoFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTipoFactura.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTipoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTipoFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTipoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTipoFactura.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTipoFactura.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTipoFactura.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTipoFactura.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFactura();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTipoFactura() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFactura!=null) {
				this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTipoFactura!=null) {
				this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTipoFactura.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTipoFactura!=null) {
				
				if(this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFactura.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTipoFactura.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTipoFactura.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTipoFactura.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTipoFactura()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTipoFactura(Boolean esInicializar) throws Exception {				
		if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTipoFactura();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTipoFactura() throws Exception {
		this.inicializarActualizarBindingTablaTipoFactura(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTipoFactura() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TipoFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TipoFacturaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTipoFacturaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFacturaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TipoFacturaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TipoFacturaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTipoFactura(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=tipofacturaLogic.getTipoFacturas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=tipofacturas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTipoFactura.setModel(new TipoFacturaModel(this.tipofacturaLogic.getTipoFacturas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTipoFactura.setModel(new TipoFacturaModel(this.tipofacturas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTipoFactura!=null && this.jInternalFrameOrderByTipoFactura.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTipoFactura();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTipoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFactura,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TipoFacturaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO,tipofacturaConstantesFunciones.resaltarSeleccionarTipoFactura,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TipoFacturaConstantesFunciones.SCLASSWEBTITULO,tipofacturaConstantesFunciones.resaltarSeleccionarTipoFactura,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTipoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFactura,TipoFacturaConstantesFunciones.LABEL_ID));

		if(this.tipofacturaConstantesFunciones.mostraridTipoFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFacturaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.tipofacturaConstantesFunciones.resaltaridTipoFactura,this.tipofacturaConstantesFunciones.activaridTipoFactura,this,true,"idTipoFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofacturaConstantesFunciones.resaltaridTipoFactura,this.tipofacturaConstantesFunciones.activaridTipoFactura,this,true,"idTipoFactura","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFactura,TipoFacturaConstantesFunciones.LABEL_CODIGO));

		if(this.tipofacturaConstantesFunciones.mostrarcodigoTipoFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFacturaConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofacturaConstantesFunciones.resaltarcodigoTipoFactura,this.tipofacturaConstantesFunciones.activarcodigoTipoFactura,this,true,"codigoTipoFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofacturaConstantesFunciones.resaltarcodigoTipoFactura,this.tipofacturaConstantesFunciones.activarcodigoTipoFactura,this,true,"codigoTipoFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTipoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTipoFactura,TipoFacturaConstantesFunciones.LABEL_NOMBRE));

		if(this.tipofacturaConstantesFunciones.mostrarnombreTipoFactura && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TipoFacturaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.tipofacturaConstantesFunciones.resaltarnombreTipoFactura,this.tipofacturaConstantesFunciones.activarnombreTipoFactura,this,true,"nombreTipoFactura","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.tipofacturaConstantesFunciones.resaltarnombreTipoFactura,this.tipofacturaConstantesFunciones.activarnombreTipoFactura,this,true,"nombreTipoFactura","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TipoFacturaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosFactura && this.tipofacturaConstantesFunciones.mostrarFacturaTipoFactura && !TipoFacturaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Facturas");
				tableColumn.setHeaderValue("Facturas");
				tableColumn.setCellRenderer(new FacturaTableCell(tipofacturaConstantesFunciones.resaltarFacturaTipoFactura,this,this.tipofacturaConstantesFunciones.activarFacturaTipoFactura));
				tableColumn.setCellEditor(new FacturaTableCell(tipofacturaConstantesFunciones.resaltarFacturaTipoFactura,this,this.tipofacturaConstantesFunciones.activarFacturaTipoFactura));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTipoFactura.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofacturaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofacturaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFactura.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.tipofacturaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.tipofacturaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTipoFactura.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTipoFactura && this.isPermisoGuardarCambiosTipoFactura) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.tipofacturaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.tipofacturaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTipoFactura.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.tipofacturaSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosTipoFactura.addColumn(tableColumn);
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
			
			this.jTableDatosTipoFactura.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFactura && this.isPermisoGuardarCambiosTipoFactura) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipofacturaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTipoFactura && this.isPermisoGuardarCambiosTipoFactura) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTipoFactura.moveColumn(this.jTableDatosTipoFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTipoFactura.moveColumn(this.jTableDatosTipoFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.tipofacturaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTipoFactura.moveColumn(this.jTableDatosTipoFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTipoFactura.moveColumn(this.jTableDatosTipoFactura.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTipoFactura.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTipoFactura.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTipoFactura,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTipoFactura.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTipoFactura.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTipoFactura.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTipoFactura.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTipoFactura.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=tipofacturaLogic.getTipoFacturas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=tipofacturas.size()-1;
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
		//this.jTableDatosTipoFactura.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTipoFactura.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTipoFactura();
			
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
				
				//this.isEsNuevoTipoFactura=false;
					
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
				if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTipoFactura==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFactura.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.tipofactura.getsType().equals("DUPLICADO")
				   || this.tipofactura.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTipoFactura=true;
				
				} else {
					this.isEsNuevoTipoFactura=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
					if(this.tipofactura.getId()>=0 && !this.tipofactura.getIsNew()) {						
						this.isEsNuevoTipoFactura=false;
						
					} else {
						this.isEsNuevoTipoFactura=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTipoFactura(esRelaciones);						
				
				this.seleccionarTipoFactura(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.tipofactura.getId()<0) {
					this.isEsNuevoTipoFactura=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTipoFactura(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTipoFactura(evt,rowIndex);
				}	
				
				if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TipoFactura: " + this.dDif); 
					}
				}								
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTipoFactura(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.tipofactura)) {
					if(this.tipofactura.getId()>0) {
						this.tipofactura.setIsDeleted(true);
						
						this.tipofacturasEliminados.add(this.tipofactura);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.tipofacturaLogic.getTipoFacturas().remove(this.tipofactura);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.tipofacturas.remove(this.tipofactura);				
					}
					
					
					((TipoFacturaModel) this.jTableDatosTipoFactura.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTipoFactura(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTipoFactura(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTipoFactura) {
			
			if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTipoFactura.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTipoFactura.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTipoFactura(this.tipofactura);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTipoFactura("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTipoFactura(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTipoFactura() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFactura(TipoFactura tipofactura) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTipoFactura(tipofactura,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTipoFactura(TipoFactura tipofactura,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTipoFactura(tipofactura);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTipoFactura(tipofactura,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTipoFactura(tipofactura);
	}
	
	public void setVariablesObjetoActualToFormularioTipoFactura(TipoFactura tipofactura) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.setText(tipofactura.getId().toString());
			this.jInternalFrameDetalleFormTipoFactura.jTextFieldcodigoTipoFactura.setText(tipofactura.getcodigo());
			this.jInternalFrameDetalleFormTipoFactura.jTextAreanombreTipoFactura.setText(tipofactura.getnombre());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TipoFactura tipofacturaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,tipofacturaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TipoFactura tipofacturaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				tipofacturaLocal=this.tipofactura;
			} else {
				tipofacturaLocal=this.tipofacturaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(tipofacturaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTipoFactura(tipofacturaLocal,true);
					
					if(tipofacturaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(tipofacturaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(tipofacturaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTipoFactura(TipoFactura tipofactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFactura(tipofactura,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(tipofactura);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFactura(TipoFactura tipofactura,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTipoFactura(tipofactura,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTipoFactura(TipoFactura tipofactura,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.getText()==null || this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.getText()=="" || this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.getText()=="Id") {
				this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.setText("0");
			}

			if(conColumnasBase) {tipofactura.setId(Long.parseLong(this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFacturaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFactura.jLabelIdTipoFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofactura.setcodigo(this.jInternalFrameDetalleFormTipoFactura.jTextFieldcodigoTipoFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFacturaConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFactura.jLabelcodigoTipoFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			tipofactura.setnombre(this.jInternalFrameDetalleFormTipoFactura.jTextAreanombreTipoFactura.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TipoFacturaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTipoFactura.jLabelnombreTipoFactura,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTipoFactura(TipoFactura tipofacturaBean,TipoFactura tipofactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTipoFactura(TipoFactura tipofacturaOrigen,TipoFactura tipofactura,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofacturaOrigen.getId()!=null && !tipofacturaOrigen.getId().equals(0L))) {tipofactura.setId(tipofacturaOrigen.getId());}}
			if(conDefault || (!conDefault && tipofacturaOrigen.getcodigo()!=null && !tipofacturaOrigen.getcodigo().equals(""))) {tipofactura.setcodigo(tipofacturaOrigen.getcodigo());}
			if(conDefault || (!conDefault && tipofacturaOrigen.getnombre()!=null && !tipofacturaOrigen.getnombre().equals(""))) {tipofactura.setnombre(tipofacturaOrigen.getnombre());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFactura(TipoFactura tipofactura) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.setText(tipofactura.getId().toString());
			this.jInternalFrameDetalleFormTipoFactura.jTextFieldcodigoTipoFactura.setText(tipofactura.getcodigo());
			this.jInternalFrameDetalleFormTipoFactura.jTextAreanombreTipoFactura.setText(tipofactura.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTipoFactura(TipoFacturaBean tipofacturaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.setText(tipofacturaBean.getId().toString());
			this.jInternalFrameDetalleFormTipoFactura.jTextFieldcodigoTipoFactura.setText(tipofacturaBean.getcodigo());
			this.jInternalFrameDetalleFormTipoFactura.jTextAreanombreTipoFactura.setText(tipofacturaBean.getnombre());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTipoFactura(TipoFacturaParameterReturnGeneral tipofacturaReturnGeneral,TipoFacturaBean tipofacturaBean,Boolean conDefault) throws Exception { 
		try {
			TipoFactura tipofacturaLocal=new TipoFactura();
			
			tipofacturaLocal=tipofacturaReturnGeneral.getTipoFactura();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && tipofacturaLocal.getId()!=null && !tipofacturaLocal.getId().equals(0L))) {tipofacturaBean.setId(tipofacturaLocal.getId());}}
			if(conDefault || (!conDefault && tipofacturaLocal.getcodigo()!=null && !tipofacturaLocal.getcodigo().equals(""))) {tipofacturaBean.setcodigo(tipofacturaLocal.getcodigo());}
			if(conDefault || (!conDefault && tipofacturaLocal.getnombre()!=null && !tipofacturaLocal.getnombre().equals(""))) {tipofacturaBean.setnombre(tipofacturaLocal.getnombre());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTipoFacturaGenerico(Long idTipoFacturaSeleccionado,JComboBox jComboBoxTipoFactura,List<TipoFactura> tipofacturasLocal)throws Exception {
		try {
			TipoFactura  tipofacturaTemp=null;

			for(TipoFactura tipofacturaAux:tipofacturasLocal) {
				if(tipofacturaAux.getId()!=null && tipofacturaAux.getId().equals(idTipoFacturaSeleccionado)) {
					tipofacturaTemp=tipofacturaAux;
					break;
				}
			}

			jComboBoxTipoFactura.setSelectedItem(tipofacturaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTipoFacturaGenerico(JComboBox jComboBoxTipoFactura,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTipoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTipoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTipoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFactura.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTipoFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTipoFactura.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTipoFactura.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTipoFactura.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTipoFactura.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Factura")) {
			jButtonFacturaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofactura=(TipoFactura) tipofacturaLogic.getTipoFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofactura =(TipoFactura) tipofacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TipoFactura tipofacturaRow=new TipoFactura();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofacturaRow=(TipoFactura) tipofacturaLogic.getTipoFacturas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			tipofacturaRow=(TipoFactura) tipofacturas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonFacturaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TipoFactura tipofactura) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTipoFactura==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofactura = (TipoFactura)this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.tipofactura = (TipoFactura)this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(tipofactura!=null) {
						this.tipofactura = tipofactura;
					} else {
						this.tipofactura = new TipoFactura();
					}
				}

				if(this.isTienePermisosFactura && this.permiteMantenimiento(this.tipofactura)) {
					FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFramePopup=new FacturaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						facturaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFramePopup;
					} else {
						facturaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame;
					}

					List<TipoFactura> tipofacturas=new ArrayList<TipoFactura>();
					tipofacturas.add(this.tipofactura);
					if(!esRelacionado) {
						//facturaBeanSwingJInternalFrame.facturaSessionBean.setConGuardarRelaciones(false);
						//facturaBeanSwingJInternalFrame.facturaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					facturaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTipoFactura.cargarFacturaBeanSwingJInternalFrame(tipofacturas,this.tipofactura,facturaBeanSwingJInternalFrame,/*conInicializar,*/facturaBeanSwingJInternalFrame.facturaSessionBean.getConGuardarRelaciones(),facturaBeanSwingJInternalFrame.facturaSessionBean.getEsGuardarRelacionado());
					facturaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						facturaBeanSwingJInternalFrame.actualizarEstadoPanelsFactura("no_relacionado");

						facturaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(FacturaConstantesFunciones.ITAMANIOFILATABLA + (FacturaConstantesFunciones.ITAMANIOFILATABLA/2));

						facturaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTipoFactura=(TitledBorder)this.jScrollPanelDatosTipoFactura.getBorder();
						TitledBorder titledBorderFactura=(TitledBorder)facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

						titledBorderFactura.setTitle(titledBorderTipoFactura.getTitle() + " -> Factura");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,facturaBeanSwingJInternalFrame);
						}

						facturaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(facturaBeanSwingJInternalFrame);

						facturaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.tipofacturaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Factura",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTipoFactura(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTipoFactura.setVisible((this.isVisibilidadCeldaNuevoTipoFactura && this.isPermisoNuevoTipoFactura));			
			this.jButtonDuplicarTipoFactura.setVisible((this.isVisibilidadCeldaDuplicarTipoFactura && this.isPermisoDuplicarTipoFactura));			
			this.jButtonCopiarTipoFactura.setVisible((this.isVisibilidadCeldaCopiarTipoFactura && this.isPermisoCopiarTipoFactura));
			this.jButtonVerFormTipoFactura.setVisible((this.isVisibilidadCeldaVerFormTipoFactura && this.isPermisoVerFormTipoFactura));
			
			this.jButtonAbrirOrderByTipoFactura.setVisible((this.isVisibilidadCeldaOrdenTipoFactura && this.isPermisoOrdenTipoFactura));			
			
			this.jButtonNuevoRelacionesTipoFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFactura && this.isPermisoNuevoTipoFactura));			
			this.jButtonNuevoGuardarCambiosTipoFactura.setVisible((this.isVisibilidadCeldaNuevoTipoFactura && this.isPermisoNuevoTipoFactura && this.isPermisoGuardarCambiosTipoFactura));
			
			if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonModificarTipoFactura.setVisible((this.isVisibilidadCeldaModificarTipoFactura && this.isPermisoActualizarTipoFactura));	
			this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarTipoFactura.setVisible((this.isVisibilidadCeldaActualizarTipoFactura && this.isPermisoActualizarTipoFactura));	
			this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarTipoFactura.setVisible((this.isVisibilidadCeldaEliminarTipoFactura && this.isPermisoEliminarTipoFactura));
			this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarTipoFactura.setVisible(this.isVisibilidadCeldaCancelarTipoFactura);							
			this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosTipoFactura.setVisible((this.isVisibilidadCeldaGuardarTipoFactura && this.isPermisoGuardarCambiosTipoFactura));			
			
			}
						
			this.jButtonGuardarCambiosTablaTipoFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFactura && this.isPermisoGuardarCambiosTipoFactura));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTipoFactura.setVisible((this.isVisibilidadCeldaNuevoTipoFactura && this.isPermisoNuevoTipoFactura));						
			this.jButtonDuplicarToolBarTipoFactura.setVisible((this.isVisibilidadCeldaDuplicarTipoFactura && this.isPermisoDuplicarTipoFactura));						
			this.jButtonCopiarToolBarTipoFactura.setVisible((this.isVisibilidadCeldaCopiarTipoFactura && this.isPermisoCopiarTipoFactura));			
			this.jButtonVerFormToolBarTipoFactura.setVisible((this.isVisibilidadCeldaVerFormTipoFactura && this.isPermisoVerFormTipoFactura));			
			this.jButtonAbrirOrderByToolBarTipoFactura.setVisible((this.isVisibilidadCeldaOrdenTipoFactura && this.isPermisoOrdenTipoFactura));
			this.jButtonNuevoRelacionesToolBarTipoFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFactura && this.isPermisoNuevoTipoFactura));			
			this.jButtonNuevoGuardarCambiosToolBarTipoFactura.setVisible((this.isVisibilidadCeldaNuevoTipoFactura && this.isPermisoNuevoTipoFactura && this.isPermisoGuardarCambiosTipoFactura));			
			
			if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonModificarToolBarTipoFactura.setVisible((this.isVisibilidadCeldaModificarTipoFactura && this.isPermisoActualizarTipoFactura));	
			this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarToolBarTipoFactura.setVisible((this.isVisibilidadCeldaActualizarTipoFactura  && this.isPermisoActualizarTipoFactura));	
			this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarToolBarTipoFactura.setVisible((this.isVisibilidadCeldaEliminarTipoFactura && this.isPermisoEliminarTipoFactura));
			this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarToolBarTipoFactura.setVisible(this.isVisibilidadCeldaCancelarTipoFactura);				
			this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosToolBarTipoFactura.setVisible((this.isVisibilidadCeldaGuardarTipoFactura && this.isPermisoGuardarCambiosTipoFactura));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTipoFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFactura && this.isPermisoGuardarCambiosTipoFactura));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTipoFactura.setVisible((this.isVisibilidadCeldaNuevoTipoFactura && this.isPermisoNuevoTipoFactura));			
			this.jMenuItemDuplicarTipoFactura.setVisible((this.isVisibilidadCeldaDuplicarTipoFactura && this.isPermisoDuplicarTipoFactura));			
			this.jMenuItemCopiarTipoFactura.setVisible((this.isVisibilidadCeldaCopiarTipoFactura && this.isPermisoCopiarTipoFactura));			
			this.jMenuItemVerFormTipoFactura.setVisible((this.isVisibilidadCeldaVerFormTipoFactura && this.isPermisoVerFormTipoFactura));			
			this.jMenuItemAbrirOrderByTipoFactura.setVisible((this.isVisibilidadCeldaOrdenTipoFactura && this.isPermisoOrdenTipoFactura));			
			//this.jMenuItemMostrarOcultarTipoFactura.setVisible((this.isVisibilidadCeldaOrdenTipoFactura && this.isPermisoOrdenTipoFactura));
			this.jMenuItemDetalleAbrirOrderByTipoFactura.setVisible((this.isVisibilidadCeldaOrdenTipoFactura && this.isPermisoOrdenTipoFactura));			
			//this.jMenuItemDetalleMostrarOcultarTipoFactura.setVisible((this.isVisibilidadCeldaOrdenTipoFactura && this.isPermisoOrdenTipoFactura));			
			this.jMenuItemNuevoRelacionesTipoFactura.setVisible((this.isVisibilidadCeldaNuevoRelacionesTipoFactura && this.isPermisoNuevoTipoFactura));			
			this.jMenuItemNuevoGuardarCambiosTipoFactura.setVisible((this.isVisibilidadCeldaNuevoTipoFactura && this.isPermisoNuevoTipoFactura && this.isPermisoGuardarCambiosTipoFactura));									
			
			if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			this.jInternalFrameDetalleFormTipoFactura.jMenuItemModificarTipoFactura.setVisible((this.isVisibilidadCeldaModificarTipoFactura && this.isPermisoActualizarTipoFactura));	
			this.jInternalFrameDetalleFormTipoFactura.jMenuItemActualizarTipoFactura.setVisible((this.isVisibilidadCeldaActualizarTipoFactura && this.isPermisoActualizarTipoFactura));	
			this.jInternalFrameDetalleFormTipoFactura.jMenuItemEliminarTipoFactura.setVisible((this.isVisibilidadCeldaEliminarTipoFactura && this.isPermisoEliminarTipoFactura));
			this.jInternalFrameDetalleFormTipoFactura.jMenuItemCancelarTipoFactura.setVisible(this.isVisibilidadCeldaCancelarTipoFactura);				
			}
			
			this.jMenuItemGuardarCambiosTipoFactura.setVisible((this.isVisibilidadCeldaGuardarTipoFactura && this.isPermisoGuardarCambiosTipoFactura));						
			this.jMenuItemGuardarCambiosTablaTipoFactura.setVisible((this.isVisibilidadCeldaGuardarCambiosTipoFactura && this.isPermisoGuardarCambiosTipoFactura));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTipoFactura=this.jButtonNuevoTipoFactura.isVisible();
			this.isVisibilidadCeldaDuplicarTipoFactura=this.jButtonDuplicarTipoFactura.isVisible();
			this.isVisibilidadCeldaCopiarTipoFactura=this.jButtonCopiarTipoFactura.isVisible();
			this.isVisibilidadCeldaVerFormTipoFactura=this.jButtonVerFormTipoFactura.isVisible();
			
			this.isVisibilidadCeldaOrdenTipoFactura=this.jButtonAbrirOrderByTipoFactura.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=this.jButtonNuevoRelacionesTipoFactura.isVisible();
			this.isVisibilidadCeldaModificarTipoFactura=this.jButtonModificarTipoFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			this.isVisibilidadCeldaActualizarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarTipoFactura.isVisible();
			this.isVisibilidadCeldaEliminarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarTipoFactura.isVisible();
			this.isVisibilidadCeldaCancelarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarTipoFactura.isVisible();
			this.isVisibilidadCeldaGuardarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosTipoFactura.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=this.jButtonGuardarCambiosTablaTipoFactura.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTipoFactura=this.jButtonNuevoToolBarTipoFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=this.jButtonNuevoRelacionesToolBarTipoFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			this.isVisibilidadCeldaModificarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jButtonModificarToolBarTipoFactura.isVisible();
			this.isVisibilidadCeldaActualizarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarToolBarTipoFactura.isVisible();
			this.isVisibilidadCeldaEliminarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarToolBarTipoFactura.isVisible();
			this.isVisibilidadCeldaCancelarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarToolBarTipoFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFactura=this.jButtonGuardarCambiosToolBarTipoFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=this.jButtonGuardarCambiosTablaToolBarTipoFactura.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTipoFactura=this.jMenuItemNuevoTipoFactura.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=this.jMenuItemNuevoRelacionesTipoFactura.isVisible();
			
			if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			this.isVisibilidadCeldaModificarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jMenuItemModificarTipoFactura.isVisible();
			this.isVisibilidadCeldaActualizarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jMenuItemActualizarTipoFactura.isVisible();
			this.isVisibilidadCeldaEliminarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jMenuItemEliminarTipoFactura.isVisible();
			this.isVisibilidadCeldaCancelarTipoFactura=this.jInternalFrameDetalleFormTipoFactura.jMenuItemCancelarTipoFactura.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTipoFactura=this.jMenuItemGuardarCambiosTipoFactura.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=this.jMenuItemGuardarCambiosTablaTipoFactura.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTipoFactura(Boolean esInicializar) {
		if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {
				//if(this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFactura();
			}
			
			this.inicializarActualizarBindingBotonesManualTipoFactura(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTipoFactura() {
		this.jButtonNuevoTipoFactura.setVisible(this.isPermisoNuevoTipoFactura);			
		this.jButtonDuplicarTipoFactura.setVisible(this.isPermisoDuplicarTipoFactura);			
		this.jButtonCopiarTipoFactura.setVisible(this.isPermisoCopiarTipoFactura);			
		this.jButtonVerFormTipoFactura.setVisible(this.isPermisoVerFormTipoFactura);			
		
		this.jButtonAbrirOrderByTipoFactura.setVisible(this.isPermisoOrdenTipoFactura);					
		
		this.jButtonNuevoRelacionesTipoFactura.setVisible(this.isPermisoNuevoTipoFactura);			
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonModificarTipoFactura.setVisible(this.isPermisoActualizarTipoFactura);	
			this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarTipoFactura.setVisible(this.isPermisoActualizarTipoFactura);	
			this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarTipoFactura.setVisible(this.isPermisoEliminarTipoFactura);
			this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarTipoFactura.setVisible(this.isVisibilidadCeldaCancelarTipoFactura);						
			this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosTipoFactura.setVisible(this.isPermisoGuardarCambiosTipoFactura);							
		}
		
		this.jButtonGuardarCambiosTablaTipoFactura.setVisible(this.isPermisoActualizarTipoFactura);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFactura() {
		this.jInternalFrameDetalleFormTipoFactura.jButtonModificarTipoFactura.setVisible(this.isPermisoActualizarTipoFactura);	
		this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarTipoFactura.setVisible(this.isPermisoActualizarTipoFactura);	
		this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarTipoFactura.setVisible(this.isPermisoEliminarTipoFactura);
		this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarTipoFactura.setVisible(this.isVisibilidadCeldaCancelarTipoFactura);							
		this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosTipoFactura.setVisible((this.isVisibilidadCeldaGuardarTipoFactura && this.isPermisoGuardarCambiosTipoFactura));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTipoFactura() {
		if(TipoFacturaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTipoFactura();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTipoFactura() {
	}
	
	public void jTableDatosTipoFacturaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTipoFactura(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTipoFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFactura(this.gettipofactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofactura==null) {
						this.tipofactura = new TipoFactura();
					}

					this.setVariablesFormularioToObjetoActualTipoFactura(this.tipofactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
				}

				if(this.tipofactura.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.tipofactura.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoTipoFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFactura(this.gettipofactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofactura==null) {
						this.tipofactura = new TipoFactura();
					}

					this.setVariablesFormularioToObjetoActualTipoFactura(this.tipofactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
				}

				if(this.tipofactura.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.tipofactura.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTipoFacturaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTipoFactura(this.gettipofactura(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.tipofactura==null) {
						this.tipofactura = new TipoFactura();
					}

					this.setVariablesFormularioToObjetoActualTipoFactura(this.tipofactura,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);
				}

				if(this.tipofactura.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.tipofactura.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTipoFactura(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void closingInternalFrameTipoFactura() {
		if(this.jInternalFrameDetalleFormTipoFactura!=null) {
		

		if(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) {
			this.jInternalFrameDetalleFormTipoFactura.setVisible(false);	    			
			this.jInternalFrameDetalleFormTipoFactura.dispose();
			this.jInternalFrameDetalleFormTipoFactura=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTipoFactura!=null) {
			this.jInternalFrameReporteDinamicoTipoFactura.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTipoFactura.dispose();
			this.jInternalFrameReporteDinamicoTipoFactura=null;
		}
		
		if(this.jInternalFrameImportacionTipoFactura!=null) {
			this.jInternalFrameImportacionTipoFactura.setVisible(false);	    			
			this.jInternalFrameImportacionTipoFactura.dispose();
			this.jInternalFrameImportacionTipoFactura=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTipoFactura();
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTipoFactura")) {
				jButtonNuevoTipoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTipoFactura")) {
				jButtonDuplicarTipoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTipoFactura")) {
				jButtonCopiarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTipoFactura")) {
				jButtonVerFormTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTipoFactura")) {
				jButtonNuevoTipoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTipoFactura")) {
				jButtonDuplicarTipoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTipoFactura")) {
				jButtonNuevoTipoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTipoFactura")) {
				jButtonDuplicarTipoFacturaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTipoFactura")) {
				jButtonNuevoTipoFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTipoFactura")) {
				jButtonNuevoTipoFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTipoFactura")) {
				jButtonNuevoTipoFacturaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTipoFactura")) {
				jButtonModificarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTipoFactura")) {
				jButtonModificarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTipoFactura")) {
				jButtonModificarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTipoFactura")) {
				jButtonActualizarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTipoFactura")) {
				jButtonActualizarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTipoFactura")) {
				jButtonActualizarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTipoFactura")) {
				jButtonEliminarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTipoFactura")) {
				jButtonEliminarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTipoFactura")) {
				jButtonEliminarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTipoFactura")) {
				jButtonCancelarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTipoFactura")) {
				jButtonCancelarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTipoFactura")) {
				jButtonCancelarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTipoFactura")) {
				jButtonCerrarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTipoFactura")) {
				jButtonCerrarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTipoFactura")) {
				jButtonCerrarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTipoFactura")) {
				jButtonMostrarOcultarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTipoFactura")) {
				jButtonCancelarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTipoFactura")) {
				jButtonGuardarCambiosTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTipoFactura")) {
				jButtonGuardarCambiosTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTipoFactura")) {
				jButtonCopiarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTipoFactura")) {
				jButtonVerFormTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTipoFactura")) {
				jButtonGuardarCambiosTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTipoFactura")) {
				jButtonCopiarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTipoFactura")) {
				jButtonVerFormTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTipoFactura")) {
				jButtonGuardarCambiosTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTipoFactura")) {
				jButtonGuardarCambiosTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTipoFactura")) {
				jButtonGuardarCambiosTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTipoFactura")) {
				jButtonRecargarInformacionTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTipoFactura")) {
				jButtonRecargarInformacionTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTipoFactura")) {
				jButtonRecargarInformacionTipoFacturaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTipoFactura")) {
				jButtonAnterioresTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTipoFactura")) {
				jButtonAnterioresTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTipoFactura")) {
				jButtonAnterioresTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTipoFactura")) {
				jButtonSiguientesTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTipoFactura")) {
				jButtonSiguientesTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTipoFactura")) {
				jButtonSiguientesTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTipoFactura") || sTipo.equals("MenuItemDetalleAbrirOrderByTipoFactura")) {
				jButtonAbrirOrderByTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTipoFactura") || sTipo.equals("MenuItemDetalleMostrarOcultarTipoFactura")) {
				jButtonMostrarOcultarTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFactura")) {
				jButtonNuevoGuardarCambiosTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTipoFactura")) {
				jButtonNuevoGuardarCambiosTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTipoFactura")) {
				jButtonNuevoGuardarCambiosTipoFacturaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTipoFactura")) {
				jButtonCerrarReporteDinamicoTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTipoFactura")) {
				jButtonGenerarReporteDinamicoTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTipoFactura")) {
				
				jButtonGenerarExcelReporteDinamicoTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTipoFactura")) {
				jButtonCerrarImportacionTipoFacturaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTipoFactura")) {
				
				jButtonGenerarImportacionTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTipoFactura")) {
				
				jButtonAbrirImportacionTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTipoFactura")) {
				jComboBoxTiposAccionesTipoFacturaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTipoFactura")) {
				jComboBoxTiposRelacionesTipoFacturaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTipoFactura")) {
				jComboBoxTiposAccionesTipoFacturaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTipoFactura")) {
				
				jComboBoxTiposSeleccionarTipoFacturaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTipoFactura")) {
				jTextFieldValorCampoGeneralTipoFacturaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTipoFactura")) {
				jButtonAbrirOrderByTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTipoFactura")) {
				jButtonAbrirOrderByTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTipoFactura")) {
				jButtonCerrarOrderByTipoFacturaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFacturaBusqueda")) {
				this.jButtonidTipoFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFacturaBusqueda")) {
				this.jButtoncodigoTipoFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFacturaBusqueda")) {
				this.jButtonnombreTipoFacturaBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTipoFactura();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				


				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TipoFactura tipofacturaLocal=null;
			
			if(!this.getEsControlTabla()) {
				tipofacturaLocal=this.tipofactura;
			} else {
				tipofacturaLocal=this.tipofacturaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
							
				
				


				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
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
			
			


			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
								
						
				


				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
								
				
				


				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
							
				
				


				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofacturaAnterior =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofacturaAnterior =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
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
			
			


			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
								
				
				


				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
			
			this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTipoFactura")) {
					jCheckBoxSeleccionarTodosTipoFacturaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTipoFactura")) {
					jCheckBoxSeleccionadosTipoFacturaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTipoFactura")) {
					
				}
				
				


				
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
												
				
				


				
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.tipofacturaAnterior =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.tipofacturaAnterior =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
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
			
			


			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTipoFacturaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.tipofactura);
				
				this.actualizarInformacion("INFO_PADRE",false,this.tipofactura);
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
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
				
				


				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TipoFactura.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TipoFactura.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTipoFacturaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.tipofacturaAnterior =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTipoFactura")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTipoFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTipoFactura.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.tipofactura =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.tipofactura =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.tipofactura);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTipoFactura")) {
				
				}
				
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTipoFactura")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTipoFactura.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTipoFactura")) {
			
			}
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTipoFactura();
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
			if(sTipo.equals("NuevoTipoFactura")) {
				jButtonNuevoTipoFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTipoFactura")) {
				jButtonDuplicarTipoFacturaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTipoFactura")) {
				jButtonCopiarTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTipoFactura")) {
				jButtonVerFormTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTipoFactura")) {
				jButtonNuevoTipoFacturaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTipoFactura")) {
				jButtonModificarTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTipoFactura")) {
				jButtonActualizarTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTipoFactura")) {
				jButtonEliminarTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTipoFactura")) {
				jButtonGuardarCambiosTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTipoFactura")) {
				jButtonCancelarTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTipoFactura")) {
				jButtonCerrarTipoFacturaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTipoFactura")) {
				jButtonGuardarCambiosTipoFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTipoFactura")) {
				jButtonNuevoGuardarCambiosTipoFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTipoFactura")) {
				jButtonAbrirOrderByTipoFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTipoFactura")) {
				jButtonRecargarInformacionTipoFacturaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTipoFactura")) {
				jButtonAnterioresTipoFacturaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTipoFactura")) {
				jButtonSiguientesTipoFacturaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTipoFacturaBusqueda")) {
				this.jButtonidTipoFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoTipoFacturaBusqueda")) {
				this.jButtoncodigoTipoFacturaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTipoFacturaBusqueda")) {
				this.jButtonnombreTipoFacturaBusquedaActionPerformed(evt);
			}
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTipoFactura();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTipoFactura")) {
				closingInternalFrameTipoFactura();
				
			} else if(sTipo.equals("jButtonCancelarTipoFactura")) {
				JInternalFrameBase jInternalFrameDetalleFormTipoFactura = (JInternalFrameBase)evt.getSource();
	            	
	            TipoFacturaBeanSwingJInternalFrame jInternalFrameParent=(TipoFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFactura.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTipoFacturaActionPerformed(null);
			}
			
			TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.tipofactura,new Object(),this.tipofacturaParameterGeneral,this.tipofacturaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTipoFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTipoFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTipoFactura(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.tipofactura)) {
			if(!esControlTabla) {
				if(TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTipoFactura(this.tipofactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);			
				}
				
				if(this.tipofacturaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTipoFactura(this.tipofactura,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofacturaReturnGeneral=tipofacturaLogic.procesarEventosTipoFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofacturaLogic.getTipoFacturas(),this.tipofactura,this.tipofacturaParameterGeneral,this.isEsNuevoTipoFactura,classes);//this.tipofacturaLogic.getTipoFactura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTipoFactura(this.tipofacturaReturnGeneral,this.tipofacturaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.tipofacturaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTipoFactura(classes,this.tipofacturaReturnGeneral,this.tipofacturaBean,false);
					}
						
					if(this.tipofacturaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTipoFactura(this.tipofacturaReturnGeneral.getTipoFactura());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTipoFactura(this.tipofacturaReturnGeneral.getTipoFactura());	
					}
						
					if(this.tipofacturaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTipoFactura(this.tipofacturaReturnGeneral.getTipoFactura(),classes);//this.tipofacturaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTipoFactura(this.tipofactura,classes);//this.tipofacturaBean);									
				}
			
				if(TipoFacturaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTipoFactura(this.tipofactura,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTipoFactura(this.tipofactura);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.tipofacturaAnterior!=null) {
						this.tipofactura=this.tipofacturaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.tipofacturaReturnGeneral=tipofacturaLogic.procesarEventosTipoFacturasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofacturaLogic.getTipoFacturas(),this.tipofactura,this.tipofacturaParameterGeneral,this.isEsNuevoTipoFactura,classes);//this.tipofacturaLogic.getTipoFactura()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.tipofacturaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.tipofacturaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.tipofacturaReturnGeneral.getTipoFactura(),tipofacturaLogic.getTipoFacturas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.tipofacturaReturnGeneral.getTipoFactura(),this.tipofacturas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTipoFactura.repaint();
				
				//((AbstractTableModel) this.jTableDatosTipoFactura.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTipoFactura();
			}
		}
	}
	
	public void actualizarVisualTableDatosTipoFactura() throws Exception {
		
		TipoFacturaModel tipofacturaModel=(TipoFacturaModel)this.jTableDatosTipoFactura.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tipofacturaModel.tipofacturas=this.tipofacturaLogic.getTipoFacturas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			tipofacturaModel.tipofacturas=this.tipofacturas;
		}
		
		
		((TipoFacturaModel) this.jTableDatosTipoFactura.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTipoFactura() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettipofacturaAnterior(),this.tipofacturaLogic.getTipoFacturas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettipofacturaAnterior(),this.tipofacturas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTipoFactura();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTipoFactura(TipoFactura tipofactura,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Factura.class)) {
					this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(tipofactura.getFacturas());
					this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
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
										
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofactura,new Object(),generalEntityParameterGeneral,this.tipofacturaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.tipofacturaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TipoFacturaConstantesFunciones.getClassesRelationshipsOfTipoFactura(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TipoFacturaConstantesFunciones.getClassesRelationshipsFromStringsOfTipoFactura(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTipoFactura(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TipoFacturaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.tipofactura,new Object(),generalEntityParameterGeneral,this.tipofacturaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTipoFactura(TipoFacturaBean tipofacturaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Factura.class)) {
					this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturaLogic.setFacturas(tipofactura.getFacturas());
					this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTipoFactura(ArrayList<Classe> classes,TipoFacturaReturnGeneral tipofacturaReturnGeneral,TipoFacturaBean tipofacturaBean,Boolean conDefault) throws Exception {
		
			this.tipofacturaBean.setFacturas(tipofacturaReturnGeneral.getTipoFactura().getFacturas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTipoFactura(TipoFactura tipofactura,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Factura.class)) {
					tipofactura.setFacturas(this.jInternalFrameDetalleFormTipoFactura.facturaBeanSwingJInternalFrame.facturaLogic.getFacturas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.tipofactura)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTipoFactura = new TipoFacturaDetalleFormJInternalFrame(jDesktopPane,this.tipofacturaSessionBean.getConGuardarRelaciones(),this.tipofacturaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTipoFactura);
		this.jInternalFrameDetalleFormTipoFactura.setVisible(false);
		this.jInternalFrameDetalleFormTipoFactura.setSelected(false);						
		
		this.jInternalFrameDetalleFormTipoFactura.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTipoFactura.tipofacturaLogic=this.tipofacturaLogic;
		
		this.cargarCombosFrameForeignKeyTipoFactura("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTipoFactura();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTipoFactura();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTipoFactura("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTipoFactura();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTipoFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFactura"));
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonModificarTipoFactura.addActionListener(new ButtonActionListener(this,"ModificarTipoFactura"));

		
		this.jInternalFrameDetalleFormTipoFactura.jButtonModificarToolBarTipoFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFactura"));
					
		this.jInternalFrameDetalleFormTipoFactura.jMenuItemModificarTipoFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFactura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarTipoFactura.addActionListener (new ButtonActionListener(this,"ActualizarTipoFactura"));
		
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarToolBarTipoFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFactura"));
						
		this.jInternalFrameDetalleFormTipoFactura.jMenuItemActualizarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFactura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarTipoFactura.addActionListener (new ButtonActionListener(this,"EliminarTipoFactura"));
		
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFactura"));
								
		this.jInternalFrameDetalleFormTipoFactura.jMenuItemEliminarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFactura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarTipoFactura.addActionListener (new ButtonActionListener(this,"CancelarTipoFactura"));
		
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFactura"));
					
		this.jInternalFrameDetalleFormTipoFactura.jMenuItemCancelarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFactura"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTipoFactura.jMenuItemDetalleCerrarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFactura"));		
		
		
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFactura"));
		
		
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFactura"));
		
		
		
		this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFactura"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFactura.jButtonidTipoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFactura.jButtoncodigoTipoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFactura.jButtonnombreTipoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFacturaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFactura"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTipoFactura"));
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTipoFactura"));
		}
		
		this.jTableDatosTipoFactura.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTipoFactura"));
		
		this.jTableDatosTipoFactura.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTipoFactura"));
		
		this.jButtonNuevoTipoFactura.addActionListener(new ButtonActionListener(this,"NuevoTipoFactura"));
		
		this.jButtonDuplicarTipoFactura.addActionListener(new ButtonActionListener(this,"DuplicarTipoFactura"));
		
		this.jButtonCopiarTipoFactura.addActionListener(new ButtonActionListener(this,"CopiarTipoFactura"));
		
		this.jButtonVerFormTipoFactura.addActionListener(new ButtonActionListener(this,"VerFormTipoFactura"));
		
		
		this.jButtonNuevoToolBarTipoFactura.addActionListener(new ButtonActionListener(this,"NuevoToolBarTipoFactura"));
			
		this.jButtonDuplicarToolBarTipoFactura.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTipoFactura"));
			
		this.jMenuItemNuevoTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTipoFactura"));
			
		this.jMenuItemDuplicarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTipoFactura"));		
		
		
		this.jButtonNuevoRelacionesTipoFactura.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTipoFactura"));
		
		
		this.jButtonNuevoRelacionesToolBarTipoFactura.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTipoFactura"));
			
		this.jMenuItemNuevoRelacionesTipoFactura.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTipoFactura"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonModificarTipoFactura.addActionListener(new ButtonActionListener(this,"ModificarTipoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonModificarToolBarTipoFactura.addActionListener(new ButtonActionListener(this,"ModificarToolBarTipoFactura"));
			
			this.jInternalFrameDetalleFormTipoFactura.jMenuItemModificarTipoFactura.addActionListener(new ButtonActionListener(this,"MenuItemModificarTipoFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarTipoFactura.addActionListener (new ButtonActionListener(this,"ActualizarTipoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonActualizarToolBarTipoFactura.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTipoFactura"));
				
			this.jInternalFrameDetalleFormTipoFactura.jMenuItemActualizarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTipoFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarTipoFactura.addActionListener (new ButtonActionListener(this,"EliminarTipoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonEliminarToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"EliminarToolBarTipoFactura"));
						
			this.jInternalFrameDetalleFormTipoFactura.jMenuItemEliminarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTipoFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarTipoFactura.addActionListener (new ButtonActionListener(this,"CancelarTipoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonCancelarToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"CancelarToolBarTipoFactura"));
			
			this.jInternalFrameDetalleFormTipoFactura.jMenuItemCancelarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTipoFactura"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTipoFactura"));		
		
		
		this.jButtonCerrarTipoFactura.addActionListener (new ButtonActionListener(this,"CerrarTipoFactura"));
		
		
		this.jButtonCerrarToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"CerrarToolBarTipoFactura"));
			
		this.jMenuItemCerrarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTipoFactura"));
			
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jMenuItemDetalleCerrarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTipoFactura"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosTipoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTipoFactura"));
		}
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTipoFactura"));
		}
		
		this.jButtonCopiarToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"CopiarToolBarTipoFactura"));
			
		this.jButtonVerFormToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"VerFormToolBarTipoFactura"));
		
		this.jMenuItemGuardarCambiosTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTipoFactura"));
			
		this.jMenuItemCopiarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTipoFactura"));		
		
		this.jMenuItemVerFormTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTipoFactura"));		
		
		
		this.jButtonGuardarCambiosTablaTipoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFactura"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTipoFactura"));
			
		this.jMenuItemGuardarCambiosTablaTipoFactura.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTipoFactura"));		
		
		
		
		this.jButtonRecargarInformacionTipoFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionTipoFactura"));
					
		this.jButtonRecargarInformacionToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTipoFactura"));
		
		this.jMenuItemRecargarInformacionTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTipoFactura"));		
		
		
		
		this.jButtonAnterioresTipoFactura.addActionListener (new ButtonActionListener(this,"AnterioresTipoFactura"));
		
		
		this.jButtonAnterioresToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTipoFactura"));
		
		this.jMenuItemAnterioresTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTipoFactura"));		
		
		
		this.jButtonSiguientesTipoFactura.addActionListener (new ButtonActionListener(this,"SiguientesTipoFactura"));
		
		
		this.jButtonSiguientesToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTipoFactura"));
			
		this.jMenuItemSiguientesTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTipoFactura"));
			
		this.jMenuItemAbrirOrderByTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTipoFactura"));
			
		this.jMenuItemMostrarOcultarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTipoFactura"));
			
		this.jMenuItemDetalleAbrirOrderByTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTipoFactura"));
			
		this.jMenuItemDetalleMostarOcultarTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTipoFactura"));		
		
		
		this.jButtonNuevoGuardarCambiosTipoFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTipoFactura"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTipoFactura"));
			
		this.jMenuItemNuevoGuardarCambiosTipoFactura.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTipoFactura"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTipoFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTipoFactura"));

		this.jCheckBoxSeleccionadosTipoFactura.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTipoFactura"));
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTipoFactura"));
		}
		
		
		this.jComboBoxTiposRelacionesTipoFactura.addActionListener (new ButtonActionListener(this,"TiposRelacionesTipoFactura"));
			
		this.jComboBoxTiposAccionesTipoFactura.addActionListener (new ButtonActionListener(this,"TiposAccionesTipoFactura"));
					
		this.jComboBoxTiposSeleccionarTipoFactura.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTipoFactura"));
			
		this.jTextFieldValorCampoGeneralTipoFactura.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTipoFactura"));		
		
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFactura.jButtonidTipoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFactura.jButtoncodigoTipoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFactura.jButtonnombreTipoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFacturaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTipoFactura!=null) {
				this.jInternalFrameReporteDinamicoTipoFactura.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFactura"));
				this.jInternalFrameReporteDinamicoTipoFactura.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFactura"));
				this.jInternalFrameReporteDinamicoTipoFactura.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFactura"));
			}
			
			//this.jButtonCerrarReporteDinamicoTipoFactura.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTipoFactura"));				
			//this.jButtonGenerarReporteDinamicoTipoFactura.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTipoFactura"));
			//this.jButtonGenerarExcelReporteDinamicoTipoFactura.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTipoFactura"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTipoFactura!=null) {
				this.jInternalFrameImportacionTipoFactura.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTipoFactura"));
				this.jInternalFrameImportacionTipoFactura.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTipoFactura"));
				this.jInternalFrameImportacionTipoFactura.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTipoFactura"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTipoFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByTipoFactura"));
			
			this.jButtonAbrirOrderByToolBarTipoFactura.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTipoFactura"));			
			
			if(this.jInternalFrameOrderByTipoFactura!=null) {
				this.jInternalFrameOrderByTipoFactura.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTipoFactura"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTipoFactura!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTipoFactura.jTabbedPaneRelacionesTipoFactura.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTipoFactura"));
		
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
            		closingInternalFrameTipoFactura();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTipoFactura.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTipoFactura = (JInternalFrameBase)event.getSource();
	            	
	            TipoFacturaBeanSwingJInternalFrame jInternalFrameParent=(TipoFacturaBeanSwingJInternalFrame)jInternalFrameDetalleFormTipoFactura.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTipoFacturaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTipoFactura.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTipoFacturaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTipoFactura.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTipoFactura.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTipoFactura";
		inputMap = this.jButtonNuevoTipoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTipoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFacturaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTipoFacturaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTipoFactura";
		inputMap = this.jButtonNuevoRelacionesTipoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTipoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTipoFacturaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTipoFactura";
		inputMap = this.jButtonModificarTipoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTipoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTipoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTipoFactura";
		inputMap = this.jButtonActualizarTipoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTipoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTipoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTipoFactura";
		inputMap = this.jButtonEliminarTipoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTipoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTipoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTipoFactura";
		inputMap = this.jButtonCancelarTipoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTipoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTipoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTipoFactura";
		inputMap = this.jButtonCerrarTipoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTipoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTipoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTipoFactura";
		inputMap = this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosTipoFactura.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTipoFactura.jButtonGuardarCambiosTipoFactura.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTipoFacturaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTipoFactura.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTipoFacturaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTipoFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTipoFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTipoFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTipoFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTipoFactura.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTipoFacturaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFactura.jButtonidTipoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"idTipoFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFactura.jButtoncodigoTipoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"codigoTipoFacturaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTipoFactura.jButtonnombreTipoFacturaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTipoFacturaBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTipoFactura.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTipoFacturaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTipoFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTipoFactura.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTipoFactura(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TipoFactura tipofacturaAux:this.tipofacturaLogic.getTipoFacturas()) {
					tipofacturaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFactura tipofacturaAux:tipofacturas) {
					tipofacturaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTipoFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFactura tipofacturaAux:this.tipofacturaLogic.getTipoFacturas()) {
						tipofacturaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFactura tipofacturaAux:tipofacturas) {
						tipofacturaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TipoFactura tipofacturaAux:this.tipofacturaLogic.getTipoFacturas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFactura tipofacturaAux:tipofacturas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTipoFacturaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTipoFactura(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTipoFactura.getSelectedRows();
			
			TipoFactura tipofacturaLocal=new TipoFactura();
			
			//this.seleccionarTodosTipoFactura(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipofacturaLocal =(TipoFactura) this.tipofacturaLogic.getTipoFacturas().toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					tipofacturaLocal =(TipoFactura) this.tipofacturas.toArray()[this.jTableDatosTipoFactura.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				tipofacturaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TipoFactura tipofacturaAux:this.tipofacturaLogic.getTipoFacturas()) {
						tipofacturaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TipoFactura tipofacturaAux:tipofacturas) {
						tipofacturaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTipoFactura(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTipoFactura.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTipoFactura.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTipoFactura,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTipoFacturaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTipoFacturaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTipoFacturaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTipoFactura(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTipoFactura.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TipoFactura tipofacturaAux:this.tipofacturaLogic.getTipoFacturas()) {
				
						if(sTipoSeleccionar.equals(TipoFacturaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipofacturaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFacturaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofacturaAux.setnombre(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFactura tipofacturaAux:tipofacturas) {
					
						if(sTipoSeleccionar.equals(TipoFacturaConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							tipofacturaAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TipoFacturaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							tipofacturaAux.setnombre(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTipoFactura(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTipoFacturaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTipoFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTipoFactura=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTipoFactura.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTipoFactura) {				
					conSplash=true;//false;										
					
					//this.startProcessTipoFactura(conSplash);
				
					this.generarReporteTipoFacturasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTipoFacturasSeleccionados();
				//this.jComboBoxTiposAccionesTipoFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFacturasSeleccionados(false);
				//this.jComboBoxTiposAccionesTipoFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTipoFacturasSeleccionados(true);
				//this.jComboBoxTiposAccionesTipoFactura.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFactura();
				
				this.exportarTipoFacturasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTipoFacturas();
				//this.importarTipoFacturas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTipoFactura();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTipoFacturasSeleccionados();
				//this.jComboBoxTiposAccionesTipoFactura.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Tipo Factura", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTipoFactura();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTipoFactura)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTipoFactura(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTipoFactura.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTipoFactura.jComboBoxTiposAccionesFormularioTipoFactura.setSelectedIndex(0);					
				}	
			} 			
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTipoFactura();
					
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTipoFactura(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTipoFacturaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTipoFactura();
			
			if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();		
			TipoFactura tipofactura=new TipoFactura();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTipoFactura(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTipoFactura.getSelectedItem();
			
			
			
			
			tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
			//this.sTipoAccion;
			
			if(tipofacturasSeleccionados.size()==1) {
				for(TipoFactura tipofacturaAux:tipofacturasSeleccionados) {
					tipofactura=tipofacturaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Factura")) {
					jButtonFacturaActionPerformed(null,rowIndex,true,false,tipofactura);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTipoFactura();
			
      		//this.finishProcessTipoFactura(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTipoFacturaReturnGeneral() throws Exception {
		if(this.tipofacturaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.tipofacturaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.tipofacturaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.tipofacturaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.tipofacturaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.tipofacturaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTipoFactura(false);
		}
		
		if(this.tipofacturaReturnGeneral.getConRetornoLista() || this.tipofacturaReturnGeneral.getConRetornoObjeto()) {
			if(this.tipofacturaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofacturaLogic.setTipoFacturas(this.tipofacturaReturnGeneral.getTipoFacturas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.tipofacturaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.tipofacturaLogic.setTipoFactura(this.tipofacturaReturnGeneral.getTipoFactura());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTipoFactura(false);
		}
	}
	
	public void actualizarParametrosGeneralTipoFactura() throws Exception {
		
		
	}
	
	public ArrayList<TipoFactura> getTipoFacturasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTipoFactura) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TipoFactura tipofacturaAux:tipofacturaLogic.getTipoFacturas()) {
					if(tipofacturaAux.getIsSelected()) {
						tipofacturasSeleccionados.add(tipofacturaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TipoFactura tipofacturaAux:this.tipofacturas) {
					if(tipofacturaAux.getIsSelected()) {
						tipofacturasSeleccionados.add(tipofacturaAux);				
					}
				}
			}
			
			if(tipofacturasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						tipofacturasSeleccionados.addAll(this.tipofacturaLogic.getTipoFacturas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						tipofacturasSeleccionados.addAll(this.tipofacturas);				
					}
				}
			}
		} else {
			tipofacturasSeleccionados.add(this.tipofactura);
		}
		
		return tipofacturasSeleccionados;
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
	
	public void generarReporteTipoFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTipoFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTipoFacturasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFacturasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTipoFacturasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTipoFacturasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Tipo Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTipoFacturasSeleccionados() throws Exception {
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();		
		
		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTipoFacturas("Todos",tipofacturasSeleccionados);
		
	}	
	
	public void generarReporteNormalTipoFacturasSeleccionados() throws Exception {
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();		
		
		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTipoFacturas("Todos",tipofacturasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTipoFacturasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();
		
		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTipoFacturas("Todos",tipofacturasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTipoFacturasSeleccionados() throws Exception {
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTipoFactura();
		
		
		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTipoFactura();
		
		
		//this.generarReporteTipoFacturas("Todos",tipofacturasSeleccionados ,tipofacturaImplementable,tipofacturaImplementableHome);
	}
	
	public void mostrarImportacionTipoFacturas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTipoFactura();
		
		this.abrirFrameImportacionTipoFactura();		
		
			
		//this.generarReporteTipoFacturas("Todos",tipofacturasSeleccionados ,tipofacturaImplementable,tipofacturaImplementableHome);
	}
	
	public void importarTipoFacturas() throws Exception {		
	
	}
	
	public void exportarTipoFacturasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTipoFacturasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTipoFacturasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTipoFacturasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Tipo Factura",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTipoFacturasSeleccionados() throws Exception {
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();		
		
		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofactura."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTipoFactura(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TipoFactura tipofacturaAux:tipofacturasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTipoFactura(tipofacturaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//tipofacturaAux.setsDetalleGeneralEntityReporte(tipofacturaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTipoFactura(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TipoFacturaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFacturaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFacturaConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TipoFacturaConstantesFunciones.LABEL_NOMBRE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTipoFactura(TipoFactura tipofactura,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=tipofactura.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofactura.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofactura.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=tipofactura.getnombre();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTipoFacturasSeleccionados() throws Exception {
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();		
		
		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofactura.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TipoFacturas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTipoFactura(row);				
				iRow++;
			}				
			
			for(TipoFactura tipofacturaAux:tipofacturasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTipoFactura(tipofacturaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTipoFacturasSeleccionados() throws Exception {
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();		
		
		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"tipofactura.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("tipofacturas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("tipofactura");
			//elementRoot.appendChild(element);
		
			for(TipoFactura tipofacturaAux:tipofacturasSeleccionados) {
				element = document.createElement("tipofactura");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTipoFactura(tipofacturaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Tipo Factura",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTipoFactura(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFacturaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFacturaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TipoFacturaConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TipoFacturaConstantesFunciones.LABEL_NOMBRE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTipoFactura(TipoFactura tipofactura,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(tipofactura.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofactura.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(tipofactura.getnombre());				
	}
	
	public void setFilaDatosExportarXmlTipoFactura(TipoFactura tipofactura,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TipoFacturaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(tipofactura.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TipoFacturaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(tipofactura.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementcodigo = document.createElement(TipoFacturaConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(tipofactura.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(TipoFacturaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(tipofactura.getnombre().trim()));
		element.appendChild(elementnombre);
	}
	
	public void generarReporteGroupGenericoTipoFacturasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TipoFactura> tipofacturasSeleccionados=new ArrayList<TipoFactura>();
		
		tipofacturasSeleccionados=this.getTipoFacturasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTipoFactura(tipofacturasSeleccionados);
		
		this.generarReporteTipoFacturas("Todos",tipofacturasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTipoFactura(ArrayList<TipoFactura> tipofacturasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TipoFactura tipofacturaAux:tipofacturasSeleccionados) {
				tipofacturaAux.setsDetalleGeneralEntityReporte(tipofacturaAux.toString());
			
				if(sTipoSeleccionar.equals(TipoFacturaConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					tipofacturaAux.setsDescripcionGeneralEntityReporte1(tipofacturaAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(TipoFacturaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					tipofacturaAux.setsDescripcionGeneralEntityReporte1(tipofacturaAux.getnombre());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TipoFacturaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTipoFactura(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTipoFactura=true;
				this.isVisibilidadCeldaNuevoRelacionesTipoFactura=true;
				this.isVisibilidadCeldaGuardarCambiosTipoFactura=true;
			}
			
			this.isVisibilidadCeldaModificarTipoFactura=false;
			this.isVisibilidadCeldaActualizarTipoFactura=false;
			this.isVisibilidadCeldaEliminarTipoFactura=false;
			this.isVisibilidadCeldaCancelarTipoFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTipoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=false;
			this.isVisibilidadCeldaModificarTipoFactura=false;
			this.isVisibilidadCeldaActualizarTipoFactura=true;
			this.isVisibilidadCeldaEliminarTipoFactura=false;
			this.isVisibilidadCeldaCancelarTipoFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTipoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=false;
			this.isVisibilidadCeldaModificarTipoFactura=false;
			this.isVisibilidadCeldaActualizarTipoFactura=true;
			this.isVisibilidadCeldaEliminarTipoFactura=true;
			this.isVisibilidadCeldaCancelarTipoFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTipoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=false;
			this.isVisibilidadCeldaModificarTipoFactura=false;
			this.isVisibilidadCeldaActualizarTipoFactura=true;
			this.isVisibilidadCeldaEliminarTipoFactura=false;
			this.isVisibilidadCeldaCancelarTipoFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTipoFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=true;
			this.isVisibilidadCeldaModificarTipoFactura=false;
			this.isVisibilidadCeldaActualizarTipoFactura=false;
			this.isVisibilidadCeldaEliminarTipoFactura=false;
			this.isVisibilidadCeldaCancelarTipoFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFactura=true;
				} else {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTipoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=false;
			this.isVisibilidadCeldaActualizarTipoFactura=false;
			this.isVisibilidadCeldaEliminarTipoFactura=false;
			this.isVisibilidadCeldaCancelarTipoFactura=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTipoFactura=false;
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=false;
			this.isVisibilidadCeldaModificarTipoFactura=true;
			this.isVisibilidadCeldaActualizarTipoFactura=false;
			this.isVisibilidadCeldaEliminarTipoFactura=false;
			this.isVisibilidadCeldaCancelarTipoFactura=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				} else {
					this.isVisibilidadCeldaGuardarTipoFactura=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TipoFacturaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTipoFactura=true;
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=true;
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=true;
		} else {
			this.actualizarEstadoPanelsTipoFactura(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTipoFactura=false;
			//this.isVisibilidadCeldaVerFormTipoFactura=false;
			this.isVisibilidadCeldaDuplicarTipoFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!tipofacturaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=false;
		} else {
			this.isVisibilidadCeldaNuevoTipoFactura=false;
			this.isVisibilidadCeldaGuardarCambiosTipoFactura=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(tipofacturaSessionBean.getEsGuardarRelacionado()) {
			if(!tipofacturaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTipoFactura=false;												
			}
			
			this.jButtonCerrarTipoFactura.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTipoFactura=false;
		}
		
		if(!this.permiteMantenimiento(this.tipofactura)) {
			this.isVisibilidadCeldaActualizarTipoFactura=false;
			this.isVisibilidadCeldaEliminarTipoFactura=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTipoFactura() {
		this.isVisibilidadCeldaNuevoTipoFactura=false;
		this.isVisibilidadCeldaGuardarCambiosTipoFactura=false;
	}
	
	public void actualizarEstadoPanelsTipoFactura(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTipoFactura!=null) {
				this.jScrollPanelDatosEdicionTipoFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFactura!=null) {
				this.jScrollPanelDatosTipoFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFactura!=null) {
				this.jPanelPaginacionTipoFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFactura!=null) {
				this.jPanelParametrosReportesTipoFactura.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTipoFactura!=null) {
				this.jScrollPanelDatosEdicionTipoFactura.setVisible(true);			
			}
			
			
			
			if(this.jScrollPanelDatosTipoFactura!=null) {
				this.jScrollPanelDatosTipoFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFactura!=null) {
				this.jPanelPaginacionTipoFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFactura!=null) {
				this.jPanelParametrosReportesTipoFactura.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTipoFactura!=null) {
				this.jScrollPanelDatosEdicionTipoFactura.setVisible(true);		
			}
			
			
			if(this.jScrollPanelDatosTipoFactura!=null) {
				this.jScrollPanelDatosTipoFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFactura!=null) {
				this.jPanelPaginacionTipoFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFactura!=null) {
				this.jPanelParametrosReportesTipoFactura.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTipoFactura!=null) {
				this.jScrollPanelDatosEdicionTipoFactura.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTipoFactura!=null) {
				this.jScrollPanelDatosTipoFactura.setVisible(false);
			}
			
			if(this.jPanelPaginacionTipoFactura!=null) {
				this.jPanelPaginacionTipoFactura.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTipoFactura!=null) {
				this.jPanelParametrosReportesTipoFactura.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTipoFactura!=null) {
				this.jScrollPanelDatosEdicionTipoFactura.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTipoFactura!=null) {
				this.jScrollPanelDatosTipoFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFactura!=null) {
				this.jPanelPaginacionTipoFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFactura!=null) {
				this.jPanelParametrosReportesTipoFactura.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTipoFactura!=null) {
				this.jScrollPanelDatosEdicionTipoFactura.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFactura!=null) {
				this.jScrollPanelDatosTipoFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFactura!=null) {
				this.jPanelPaginacionTipoFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFactura!=null) {
				this.jPanelParametrosReportesTipoFactura.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTipoFactura!=null) {
				this.jScrollPanelDatosEdicionTipoFactura.setVisible(false);
			}
			
			
			if(this.jScrollPanelDatosTipoFactura!=null) {
				this.jScrollPanelDatosTipoFactura.setVisible(true);
			}
			
			if(this.jPanelPaginacionTipoFactura!=null) {
				this.jPanelPaginacionTipoFactura.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTipoFactura!=null) {
				this.jPanelParametrosReportesTipoFactura.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
		
		} else if(sAccion.equals("no_relacionado") && !this.tipofacturaSessionBean.getEsGuardarRelacionado()) {
		}
	}	
	
	
	
	

	public String registrarSesionTipoFacturaParaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(this.tipofacturaSessionBean==null) {
				this.tipofacturaSessionBean=new TipoFacturaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTipoFactura.facturaSessionBean==null) {
				this.jInternalFrameDetalleFormTipoFactura.facturaSessionBean=new FacturaSessionBean();
			}

			this.jInternalFrameDetalleFormTipoFactura.facturaSessionBean.setsPathNavegacionActual(tipofacturaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTipoFactura.facturaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupFactura=this.jInternalFrameDetalleFormTipoFactura.facturaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTipoFactura.facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			this.jInternalFrameDetalleFormTipoFactura.facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(TipoFacturaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTipoFactura.facturaSessionBean.setisBusquedaDesdeForeignKeySesionTipoFactura(true);
			this.jInternalFrameDetalleFormTipoFactura.facturaSessionBean.setlidTipoFacturaActual(this.idTipoFacturaActual);

			tipofacturaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTipoFactura(true);
			tipofacturaSessionBean.setlIdTipoFacturaActualForeignKey(this.idTipoFacturaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TipoFacturaSessionBean tipofacturaSessionBean=new TipoFacturaSessionBean();
		
		if(this.tipofacturaSessionBean==null) {
			this.tipofacturaSessionBean=new TipoFacturaSessionBean();
		}
		
		this.tipofacturaSessionBean.setsUltimaBusquedaTipoFactura(this.getsAccionBusqueda());
		this.tipofacturaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.tipofacturaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TipoFacturaSessionBean tipofacturaSessionBean=new TipoFacturaSessionBean();
		
		if(this.tipofacturaSessionBean==null) {
			this.tipofacturaSessionBean=new TipoFacturaSessionBean();
		}
		
		if(this.tipofacturaSessionBean.getsUltimaBusquedaTipoFactura()!=null&&!this.tipofacturaSessionBean.getsUltimaBusquedaTipoFactura().equals("")) {
			this.setsAccionBusqueda(tipofacturaSessionBean.getsUltimaBusquedaTipoFactura());
			this.setiNumeroPaginacion(tipofacturaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(tipofacturaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

		}
		
		this.tipofacturaSessionBean.setsUltimaBusquedaTipoFactura("");
		this.tipofacturaSessionBean.setiNumeroPaginacion(TipoFacturaConstantesFunciones.INUMEROPAGINACION);
		this.tipofacturaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTipoFactura(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTipoFactura() {
		this.updateBorderResaltarBusquedasFormularioTipoFactura();
		this.updateVisibilidadBusquedasFormularioTipoFactura();
		this.updateHabilitarBusquedasFormularioTipoFactura();
	}
	
	public void updateBorderResaltarBusquedasFormularioTipoFactura() {					
	}
	
	public void updateVisibilidadBusquedasFormularioTipoFactura() {
	}
	
	public void updateHabilitarBusquedasFormularioTipoFactura() {
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
	
	public void updateControlesFormularioTipoFactura() throws Exception {

		if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTipoFactura();
		this.updateVisibilidadResaltarControlesFormularioTipoFactura();
		this.updateHabilitarResaltarControlesFormularioTipoFactura();
		
	}
	
	public void updateBorderResaltarControlesFormularioTipoFactura() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.tipofacturaConstantesFunciones.resaltaridTipoFactura!=null && this.jInternalFrameDetalleFormTipoFactura!=null) {this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.setBorder(this.tipofacturaConstantesFunciones.resaltaridTipoFactura);}
		if(this.tipofacturaConstantesFunciones.resaltarcodigoTipoFactura!=null && this.jInternalFrameDetalleFormTipoFactura!=null) {this.jInternalFrameDetalleFormTipoFactura.jTextFieldcodigoTipoFactura.setBorder(this.tipofacturaConstantesFunciones.resaltarcodigoTipoFactura);}
		if(this.tipofacturaConstantesFunciones.resaltarnombreTipoFactura!=null && this.jInternalFrameDetalleFormTipoFactura!=null) {this.jInternalFrameDetalleFormTipoFactura.jTextAreanombreTipoFactura.setBorder(this.tipofacturaConstantesFunciones.resaltarnombreTipoFactura);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTipoFactura() throws Exception {		
		if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) {
	
		//this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.setVisible(this.tipofacturaConstantesFunciones.mostraridTipoFactura);
		this.jInternalFrameDetalleFormTipoFactura.jPanelidTipoFactura.setVisible(this.tipofacturaConstantesFunciones.mostraridTipoFactura);
		//this.jInternalFrameDetalleFormTipoFactura.jTextFieldcodigoTipoFactura.setVisible(this.tipofacturaConstantesFunciones.mostrarcodigoTipoFactura);
		this.jInternalFrameDetalleFormTipoFactura.jPanelcodigoTipoFactura.setVisible(this.tipofacturaConstantesFunciones.mostrarcodigoTipoFactura);
		//this.jInternalFrameDetalleFormTipoFactura.jTextAreanombreTipoFactura.setVisible(this.tipofacturaConstantesFunciones.mostrarnombreTipoFactura);
		this.jInternalFrameDetalleFormTipoFactura.jPanelnombreTipoFactura.setVisible(this.tipofacturaConstantesFunciones.mostrarnombreTipoFactura);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTipoFactura() throws Exception {
		if(this.jInternalFrameDetalleFormTipoFactura==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTipoFactura!=null) {
	
		this.jInternalFrameDetalleFormTipoFactura.jTextFieldidTipoFactura.setEnabled(this.tipofacturaConstantesFunciones.activaridTipoFactura);
		this.jInternalFrameDetalleFormTipoFactura.jTextFieldcodigoTipoFactura.setEnabled(this.tipofacturaConstantesFunciones.activarcodigoTipoFactura);
		this.jInternalFrameDetalleFormTipoFactura.jTextAreanombreTipoFactura.setEnabled(this.tipofacturaConstantesFunciones.activarnombreTipoFactura);
		}
	}
	
		
}