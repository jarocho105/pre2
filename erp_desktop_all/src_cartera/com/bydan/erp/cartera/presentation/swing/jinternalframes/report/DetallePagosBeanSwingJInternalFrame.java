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
package com.bydan.erp.cartera.presentation.swing.jinternalframes.report;




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

//import com.bydan.erp.cartera.util.DetallePagosConstantesFunciones;
import com.bydan.erp.cartera.util.report.DetallePagosParameterReturnGeneral;
//import com.bydan.erp.cartera.util.report.DetallePagosParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.report.DetallePagosBean;
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

import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.report.*;
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
import com.bydan.erp.cartera.resources.reportes.report.AuxiliarReportes;

import com.bydan.erp.cartera.util.*;

import com.bydan.erp.cartera.util.report.*;
import com.bydan.erp.cartera.business.logic.report.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.cartera.business.entity.report.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;






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

//import org.hibernate.collection.PersistentBag;

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
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.report.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetallePagosBeanSwingJInternalFrame extends DetallePagosJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetallePagosBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetallePagos> detallepagosValidator = new ClassValidator<DetallePagos>(DetallePagos.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetallePagos detallepagos;	
	public DetallePagos detallepagosAux;
	public DetallePagos detallepagosAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetallePagos detallepagosTotales;
	public Long idDetallePagosActual;
	public Long iIdNuevoDetallePagos=0L;
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

	public String sFinalQueryComboGrupoCliente="";

	public List<GrupoCliente> grupoclientesForeignKey;

	public List<GrupoCliente> getgrupoclientesForeignKey() {
		return grupoclientesForeignKey;
	}

	public void setgrupoclientesForeignKey(List<GrupoCliente> grupoclientesForeignKey) {
		this.grupoclientesForeignKey = grupoclientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public GrupoCliente grupoclienteForeignKey;

	public GrupoCliente getgrupoclienteForeignKey() {
		return grupoclienteForeignKey;
	}

	public void setgrupoclienteForeignKey(GrupoCliente grupoclienteForeignKey) {
		this.grupoclienteForeignKey = grupoclienteForeignKey;
	}

	public String sFinalQueryComboZona="";

	public List<Zona> zonasForeignKey;

	public List<Zona> getzonasForeignKey() {
		return zonasForeignKey;
	}

	public void setzonasForeignKey(List<Zona> zonasForeignKey) {
		this.zonasForeignKey = zonasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Zona zonaForeignKey;

	public Zona getzonaForeignKey() {
		return zonaForeignKey;
	}

	public void setzonaForeignKey(Zona zonaForeignKey) {
		this.zonaForeignKey = zonaForeignKey;
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
	
	public Boolean isPermisoTodoDetallePagos;
	public Boolean isPermisoNuevoDetallePagos;
	public Boolean isPermisoActualizarDetallePagos;
	public Boolean isPermisoActualizarOriginalDetallePagos;
	public Boolean isPermisoEliminarDetallePagos;
	public Boolean isPermisoGuardarCambiosDetallePagos;
	public Boolean isPermisoConsultaDetallePagos;
	public Boolean isPermisoBusquedaDetallePagos;
	public Boolean isPermisoReporteDetallePagos;
	public Boolean isPermisoPaginacionMedioDetallePagos;
	public Boolean isPermisoPaginacionAltoDetallePagos;
	public Boolean isPermisoPaginacionTodoDetallePagos;
	public Boolean isPermisoCopiarDetallePagos;
	public Boolean isPermisoVerFormDetallePagos;
	public Boolean isPermisoDuplicarDetallePagos;
	public Boolean isPermisoOrdenDetallePagos;
	
	
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
	
	public DetallePagosParameterReturnGeneral detallepagosReturnGeneral;
	public DetallePagosParameterReturnGeneral detallepagosParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetallePagos=false;
	public Boolean esParaAccionDesdeFormularioDetallePagos=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetallePagosSessionBeanAdditional detallepagosSessionBeanAdditional=null;
	
	public DetallePagosSessionBeanAdditional getDetallePagosSessionBeanAdditional() {
		return this.detallepagosSessionBeanAdditional;
	}
	
	public void setDetallePagosSessionBeanAdditional(DetallePagosSessionBeanAdditional detallepagosSessionBeanAdditional) {
		try {
			this.detallepagosSessionBeanAdditional=detallepagosSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetallePagosBeanSwingJInternalFrameAdditional detallepagosBeanSwingJInternalFrameAdditional=null;
	//public class DetallePagosBeanSwingJInternalFrame
	
	public DetallePagosBeanSwingJInternalFrameAdditional getDetallePagosBeanSwingJInternalFrameAdditional() {
		return this.detallepagosBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetallePagosBeanSwingJInternalFrameAdditional(DetallePagosBeanSwingJInternalFrameAdditional detallepagosBeanSwingJInternalFrameAdditional) {
		try {
			this.detallepagosBeanSwingJInternalFrameAdditional=detallepagosBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetallePagosLogic detallepagosLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetallePagos detallepagosBean;
	public DetallePagosConstantesFunciones detallepagosConstantesFunciones;
	//public DetallePagosParameterReturnGeneral detallepagosReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public GrupoClienteLogic grupoclienteLogic;
	public ZonaLogic zonaLogic;
	
	//PARAMETROS
	
	
	//public List<DetallePagos> detallepagoss;	
	//public List<DetallePagos> detallepagossEliminados;
	//public List<DetallePagos> detallepagossAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetallePagos=false;
	public Boolean isVisibilidadCeldaDuplicarDetallePagos=true;
	public Boolean isVisibilidadCeldaCopiarDetallePagos=true;
	public Boolean isVisibilidadCeldaVerFormDetallePagos=true;
	public Boolean isVisibilidadCeldaOrdenDetallePagos=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
	public Boolean isVisibilidadCeldaModificarDetallePagos=false;
	public Boolean isVisibilidadCeldaActualizarDetallePagos=false;
	public Boolean isVisibilidadCeldaEliminarDetallePagos=false;
	public Boolean isVisibilidadCeldaCancelarDetallePagos=false;
	public Boolean isVisibilidadCeldaGuardarDetallePagos=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetallePagos=false;	
	
	
	public Boolean isVisibilidadBusquedaDetallePagos=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdGrupoCliente=false;
	public Boolean isVisibilidadFK_IdZona=false;
	
	public Long getiIdNuevoDetallePagos() {
		return this.iIdNuevoDetallePagos;
	}

	public void setiIdNuevoDetallePagos(Long iIdNuevoDetallePagos) {
		this.iIdNuevoDetallePagos = iIdNuevoDetallePagos;
	}
	
	public Long getidDetallePagosActual() {
		return this.idDetallePagosActual;
	}

	public void setidDetallePagosActual(Long idDetallePagosActual) {
		this.idDetallePagosActual = idDetallePagosActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetallePagos getdetallepagos() {
		return this.detallepagos;
	}

	public void setdetallepagos(DetallePagos detallepagos) {
		this.detallepagos = detallepagos;
	}
	
	public DetallePagos getdetallepagosAux() {
		return this.detallepagosAux;
	}

	public void setdetallepagosAux(DetallePagos detallepagosAux) {
		this.detallepagosAux = detallepagosAux;
	}				
	
	public DetallePagos getdetallepagosAnterior() {
		return this.detallepagosAnterior;
	}

	public void setdetallepagosAnterior(DetallePagos detallepagosAnterior) {
		this.detallepagosAnterior = detallepagosAnterior;
	}	
	
	public DetallePagos getdetallepagosTotales() {
		return this.detallepagosTotales;
	}

	public void setdetallepagosTotales(DetallePagos detallepagosTotales) {
		this.detallepagosTotales = detallepagosTotales;
	}	
	
	public DetallePagos getdetallepagosBean() {
		return this.detallepagosBean;
	}

	public void setdetallepagosBean(DetallePagos detallepagosBean) {
		this.detallepagosBean = detallepagosBean;
	}	
	
	public DetallePagosParameterReturnGeneral getdetallepagosReturnGeneral() {
		return this.detallepagosReturnGeneral;
	}

	public void setdetallepagosReturnGeneral(DetallePagosParameterReturnGeneral detallepagosReturnGeneral) {
		this.detallepagosReturnGeneral = detallepagosReturnGeneral;
	}	
	
	
	public Long id_grupo_clienteBusquedaDetallePagos=-1L;

	public Long getid_grupo_clienteBusquedaDetallePagos() {
		return this.id_grupo_clienteBusquedaDetallePagos;
	}

	public void setid_grupo_clienteBusquedaDetallePagos(Long id_grupo_clienteBusquedaDetallePagos) {
		this.id_grupo_clienteBusquedaDetallePagos = id_grupo_clienteBusquedaDetallePagos;
	}

;
	public Long id_zonaBusquedaDetallePagos=-1L;

	public Long getid_zonaBusquedaDetallePagos() {
		return this.id_zonaBusquedaDetallePagos;
	}

	public void setid_zonaBusquedaDetallePagos(Long id_zonaBusquedaDetallePagos) {
		this.id_zonaBusquedaDetallePagos = id_zonaBusquedaDetallePagos;
	}

;
	public Date fecha_emision_desdeBusquedaDetallePagos=new Date();

	public Date getfecha_emision_desdeBusquedaDetallePagos() {
		return this.fecha_emision_desdeBusquedaDetallePagos;
	}

	public void setfecha_emision_desdeBusquedaDetallePagos(Date fecha_emision_desdeBusquedaDetallePagos) {
		this.fecha_emision_desdeBusquedaDetallePagos = fecha_emision_desdeBusquedaDetallePagos;
	}

;
	public Date fecha_emision_hastaBusquedaDetallePagos=new Date();

	public Date getfecha_emision_hastaBusquedaDetallePagos() {
		return this.fecha_emision_hastaBusquedaDetallePagos;
	}

	public void setfecha_emision_hastaBusquedaDetallePagos(Date fecha_emision_hastaBusquedaDetallePagos) {
		this.fecha_emision_hastaBusquedaDetallePagos = fecha_emision_hastaBusquedaDetallePagos;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_grupo_clienteFK_IdGrupoCliente=-1L;

	public Long getid_grupo_clienteFK_IdGrupoCliente() {
		return this.id_grupo_clienteFK_IdGrupoCliente;
	}

	public void setid_grupo_clienteFK_IdGrupoCliente(Long id_grupo_clienteFK_IdGrupoCliente) {
		this.id_grupo_clienteFK_IdGrupoCliente = id_grupo_clienteFK_IdGrupoCliente;
	}

	public Long id_zonaFK_IdZona=-1L;

	public Long getid_zonaFK_IdZona() {
		return this.id_zonaFK_IdZona;
	}

	public void setid_zonaFK_IdZona(Long id_zonaFK_IdZona) {
		this.id_zonaFK_IdZona = id_zonaFK_IdZona;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetallePagosLogic getDetallePagosLogic()	{		
		return detallepagosLogic;
	}

	public void setDetallePagosLogic(DetallePagosLogic detallepagosLogic) {
		this.detallepagosLogic = detallepagosLogic;
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
	
	public Boolean getIsEsNuevoDetallePagos() {
		return isEsNuevoDetallePagos;
	}

	public void setIsEsNuevoDetallePagos(Boolean isEsNuevoDetallePagos) {
		this.isEsNuevoDetallePagos = isEsNuevoDetallePagos;
	}

	public Boolean getEsParaAccionDesdeFormularioDetallePagos() {
		return esParaAccionDesdeFormularioDetallePagos;
	}
	
	public void setEsParaAccionDesdeFormularioDetallePagos(Boolean esParaAccionDesdeFormularioDetallePagos) {
		this.esParaAccionDesdeFormularioDetallePagos = esParaAccionDesdeFormularioDetallePagos;
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

			if(this.detallepagosSessionBean==null) {
				this.detallepagosSessionBean=new DetallePagosSessionBean();
			}

			if(!this.detallepagosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detallepagosSessionBean.getlidEmpresaActual());
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

	public void cargarCombosGrupoClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			GrupoClienteLogic grupoclienteLogic=new GrupoClienteLogic();

			//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

			if(this.detallepagosSessionBean==null) {
				this.detallepagosSessionBean=new DetallePagosSessionBean();
			}

			if(!this.detallepagosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//grupoclienteLogic.getGrupoClienteDataAccess().setIsForForeingKeyData(true);

					grupoclienteLogic.getTodosGrupoClientesWithConnection(sFinalQuery,new Pagination());

					this.grupoclientesForeignKey=grupoclienteLogic.getGrupoClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaGrupoCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					grupoclienteLogic.getEntityWithConnection(detallepagosSessionBean.getlidGrupoClienteActual());
					this.grupoclientesForeignKey.add(grupoclienteLogic.getGrupoCliente());
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

	public void cargarCombosZonasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.zonasForeignKey=new ArrayList<Zona>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ZonaLogic zonaLogic=new ZonaLogic();

			//zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

			if(this.detallepagosSessionBean==null) {
				this.detallepagosSessionBean=new DetallePagosSessionBean();
			}

			if(!this.detallepagosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//zonaLogic.getZonaDataAccess().setIsForForeingKeyData(true);

					zonaLogic.getTodosZonasWithConnection(sFinalQuery,new Pagination());

					this.zonasForeignKey=zonaLogic.getZonas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaZona(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					zonaLogic.getEntityWithConnection(detallepagosSessionBean.getlidZonaActual());
					this.zonasForeignKey.add(zonaLogic.getZona());
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

					if(this.detallepagos!=null) {
						this.detallepagos.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagos!=null) {
						this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetallePagos.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetallePagos!=null) {
						if(this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetallePagosGenerico)throws Exception
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
				jComboBoxid_empresaDetallePagosGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetallePagosGenerico!=null && jComboBoxid_empresaDetallePagosGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetallePagosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualGrupoClienteForeignKey(Long idGrupoClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(grupoclienteTemp!=null) {

					if(this.detallepagos!=null) {
						this.detallepagos.setGrupoCliente(grupoclienteTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagos!=null) {
						this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.setSelectedItem(grupoclienteTemp);
					}
				} else {
					//jComboBoxid_grupo_clienteDetallePagos.setSelectedItem(grupoclienteTemp);
					if(this.jInternalFrameDetalleFormDetallePagos!=null) {
						if(this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDetallePagos") || sFormularioTipoBusqueda.equals("Todos")){
					if(grupoclienteTemp!=null && jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos!=null) {
						jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.setSelectedItem(grupoclienteTemp);
					} else {
						if(jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos!=null) {
							//jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.setSelectedItem(grupoclienteTemp);
							if(jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.getItemCount()>0) {
								jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.setSelectedIndex(0);
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

	public String getActualGrupoClienteForeignKeyDescripcion(Long idGrupoClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}


			sDescripcion=GrupoClienteConstantesFunciones.getGrupoClienteDescripcion(grupoclienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualGrupoClienteForeignKeyGenerico(Long idGrupoClienteSeleccionado,JComboBox jComboBoxid_grupo_clienteDetallePagosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteTemp=null;

			for(GrupoCliente grupoclienteAux:grupoclientesForeignKey) {
				if(grupoclienteAux.getId()!=null && grupoclienteAux.getId().equals(idGrupoClienteSeleccionado)) {
					grupoclienteTemp=grupoclienteAux;
					break;
				}
			}

			if(grupoclienteTemp!=null) {
				jComboBoxid_grupo_clienteDetallePagosGenerico.setSelectedItem(grupoclienteTemp);
			} else {
				if(jComboBoxid_grupo_clienteDetallePagosGenerico!=null && jComboBoxid_grupo_clienteDetallePagosGenerico.getItemCount()>0) {
					jComboBoxid_grupo_clienteDetallePagosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualZonaForeignKey(Long idZonaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(zonaTemp!=null) {

					if(this.detallepagos!=null) {
						this.detallepagos.setZona(zonaTemp);
					}

					if(this.jInternalFrameDetalleFormDetallePagos!=null) {
						this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.setSelectedItem(zonaTemp);
					}
				} else {
					//jComboBoxid_zonaDetallePagos.setSelectedItem(zonaTemp);
					if(this.jInternalFrameDetalleFormDetallePagos!=null) {
						if(this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("BusquedaDetallePagos") || sFormularioTipoBusqueda.equals("Todos")){
					if(zonaTemp!=null && jComboBoxid_zonaBusquedaDetallePagosDetallePagos!=null) {
						jComboBoxid_zonaBusquedaDetallePagosDetallePagos.setSelectedItem(zonaTemp);
					} else {
						if(jComboBoxid_zonaBusquedaDetallePagosDetallePagos!=null) {
							//jComboBoxid_zonaBusquedaDetallePagosDetallePagos.setSelectedItem(zonaTemp);
							if(jComboBoxid_zonaBusquedaDetallePagosDetallePagos.getItemCount()>0) {
								jComboBoxid_zonaBusquedaDetallePagosDetallePagos.setSelectedIndex(0);
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

	public String getActualZonaForeignKeyDescripcion(Long idZonaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}


			sDescripcion=ZonaConstantesFunciones.getZonaDescripcion(zonaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualZonaForeignKeyGenerico(Long idZonaSeleccionado,JComboBox jComboBoxid_zonaDetallePagosGenerico)throws Exception
	{
		try
		{
			Zona  zonaTemp=null;

			for(Zona zonaAux:zonasForeignKey) {
				if(zonaAux.getId()!=null && zonaAux.getId().equals(idZonaSeleccionado)) {
					zonaTemp=zonaAux;
					break;
				}
			}

			if(zonaTemp!=null) {
				jComboBoxid_zonaDetallePagosGenerico.setSelectedItem(zonaTemp);
			} else {
				if(jComboBoxid_zonaDetallePagosGenerico!=null && jComboBoxid_zonaDetallePagosGenerico.getItemCount()>0) {
					jComboBoxid_zonaDetallePagosGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetallePagos detallepagos,JComboBox jComboBoxid_empresaDetallePagosGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetallePagosGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetallePagosGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detallepagos.setid_empresa(empresaAux.getId());
				detallepagos.setempresa_descripcion(DetallePagosConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detallepagos.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarGrupoClienteForeignKey(DetallePagos detallepagos,JComboBox jComboBoxid_grupo_clienteDetallePagosGenerico)throws Exception
	{
		try
		{
			GrupoCliente  grupoclienteAux=new GrupoCliente();

			if(jComboBoxid_grupo_clienteDetallePagosGenerico==null) {
				grupoclienteAux=(GrupoCliente)this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.getSelectedItem();
			} else {
				grupoclienteAux=(GrupoCliente)jComboBoxid_grupo_clienteDetallePagosGenerico.getSelectedItem();
			}

			if(grupoclienteAux!=null && grupoclienteAux.getId()!=null) {
				detallepagos.setid_grupo_cliente(grupoclienteAux.getId());
				detallepagos.setgrupocliente_descripcion(DetallePagosConstantesFunciones.getGrupoClienteDescripcion(grupoclienteAux));
				detallepagos.setGrupoCliente(grupoclienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarZonaForeignKey(DetallePagos detallepagos,JComboBox jComboBoxid_zonaDetallePagosGenerico)throws Exception
	{
		try
		{
			Zona  zonaAux=new Zona();

			if(jComboBoxid_zonaDetallePagosGenerico==null) {
				zonaAux=(Zona)this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.getSelectedItem();
			} else {
				zonaAux=(Zona)jComboBoxid_zonaDetallePagosGenerico.getSelectedItem();
			}

			if(zonaAux!=null && zonaAux.getId()!=null) {
				detallepagos.setid_zona(zonaAux.getId());
				detallepagos.setzona_descripcion(DetallePagosConstantesFunciones.getZonaDescripcion(zonaAux));
				detallepagos.setZona(zonaAux);			}
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

					if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagos!=null) { 
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagos!=null) { 
					}

					if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameGrupoClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingGrupoCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagos!=null) { 
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.addItem(grupocliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagos!=null) { 
					}

					if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDetallePagos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.removeAllItems();

							for(GrupoCliente grupocliente:this.grupoclientesForeignKey) {
								this.jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.addItem(grupocliente);
							}
						}

						if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameZonasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingZona=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetallePagos!=null) { 
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.addItem(zona);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetallePagos!=null) { 
					}

					if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("BusquedaDetallePagos") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_zonaBusquedaDetallePagosDetallePagos.removeAllItems();

							for(Zona zona:this.zonasForeignKey) {
								this.jComboBoxid_zonaBusquedaDetallePagosDetallePagos.addItem(zona);
							}
						}

						if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePagos!=null) {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagos!=null) {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameGrupoClienteForeignKey(GrupoCliente grupocliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePagos!=null) {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.setSelectedItem(grupocliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagos!=null) {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.setSelectedItem(grupocliente);
						} else {
							this.jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameZonaForeignKey(Zona zona,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetallePagos!=null) {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.setSelectedItem(zona);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetallePagos!=null) {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_zonaBusquedaDetallePagosDetallePagos.setSelectedItem(zona);
						} else {
							this.jComboBoxid_zonaBusquedaDetallePagosDetallePagos.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetallePagos() throws Exception {
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
		
	public DetallePagosParameterReturnGeneral getDetallePagosParameterGeneral() {
		return this.detallepagosParameterGeneral;
	}
	
	public void setDetallePagosParameterGeneral(DetallePagosParameterReturnGeneral detallepagosParameterGeneral) {
		this.detallepagosParameterGeneral = detallepagosParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetallePagos() {
		return isPermisoTodoDetallePagos;
	}

	public void setIsPermisoTodoDetallePagos(Boolean isPermisoTodoDetallePagos) {
		this.isPermisoTodoDetallePagos = isPermisoTodoDetallePagos;
	}

	public Boolean getIsPermisoNuevoDetallePagos() {
		return isPermisoNuevoDetallePagos;
	}

	public void setIsPermisoNuevoDetallePagos(Boolean isPermisoNuevoDetallePagos) {
		this.isPermisoNuevoDetallePagos = isPermisoNuevoDetallePagos;
	}

	public Boolean getIsPermisoActualizarDetallePagos() {
		return isPermisoActualizarDetallePagos;
	}

	public void setIsPermisoActualizarDetallePagos(Boolean isPermisoActualizarDetallePagos) {
		this.isPermisoActualizarDetallePagos = isPermisoActualizarDetallePagos;
	}

	public Boolean getIsPermisoEliminarDetallePagos() {
		return isPermisoEliminarDetallePagos;
	}

	public void setIsPermisoEliminarDetallePagos(Boolean isPermisoEliminarDetallePagos) {
		this.isPermisoEliminarDetallePagos = isPermisoEliminarDetallePagos;
	}

	public Boolean getIsPermisoGuardarCambiosDetallePagos() {
		return isPermisoGuardarCambiosDetallePagos;
	}

	public void setIsPermisoGuardarCambiosDetallePagos(Boolean isPermisoGuardarCambiosDetallePagos) {
		this.isPermisoGuardarCambiosDetallePagos = isPermisoGuardarCambiosDetallePagos;
	}
	
	public Boolean getIsPermisoConsultaDetallePagos() {
		return isPermisoConsultaDetallePagos;
	}

	public void setIsPermisoConsultaDetallePagos(Boolean isPermisoConsultaDetallePagos) {
		this.isPermisoConsultaDetallePagos = isPermisoConsultaDetallePagos;
	}

	public Boolean getIsPermisoBusquedaDetallePagos() {
		return isPermisoBusquedaDetallePagos;
	}

	public void setIsPermisoBusquedaDetallePagos(Boolean isPermisoBusquedaDetallePagos) {
		this.isPermisoBusquedaDetallePagos = isPermisoBusquedaDetallePagos;
	}

	public Boolean getIsPermisoReporteDetallePagos() {
		return isPermisoReporteDetallePagos;
	}

	public void setIsPermisoReporteDetallePagos(Boolean isPermisoReporteDetallePagos) {
		this.isPermisoReporteDetallePagos = isPermisoReporteDetallePagos;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetallePagos() {
		return isPermisoPaginacionMedioDetallePagos;
	}

	public void setIsPermisoPaginacionMedioDetallePagos(Boolean isPermisoPaginacionMedioDetallePagos) {
		this.isPermisoPaginacionMedioDetallePagos = isPermisoPaginacionMedioDetallePagos;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetallePagos() {
		return isPermisoPaginacionTodoDetallePagos;
	}

	public void setIsPermisoPaginacionTodoDetallePagos(Boolean isPermisoPaginacionTodoDetallePagos) {
		this.isPermisoPaginacionTodoDetallePagos = isPermisoPaginacionTodoDetallePagos;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetallePagos() {
		return isPermisoPaginacionAltoDetallePagos;
	}

	public void setIsPermisoPaginacionAltoDetallePagos(Boolean isPermisoPaginacionAltoDetallePagos) {
		this.isPermisoPaginacionAltoDetallePagos = isPermisoPaginacionAltoDetallePagos;
	}
	
	public Boolean getIsPermisoCopiarDetallePagos() {
		return isPermisoCopiarDetallePagos;
	}

	public void setIsPermisoCopiarDetallePagos(Boolean isPermisoCopiarDetallePagos) {
		this.isPermisoCopiarDetallePagos = isPermisoCopiarDetallePagos;
	}
	
	public Boolean getIsPermisoVerFormDetallePagos() {
		return isPermisoVerFormDetallePagos;
	}

	public void setIsPermisoVerFormDetallePagos(Boolean isPermisoVerFormDetallePagos) {
		this.isPermisoVerFormDetallePagos = isPermisoVerFormDetallePagos;
	}
	
	public Boolean getIsPermisoDuplicarDetallePagos() {
		return isPermisoDuplicarDetallePagos;
	}

	public void setIsPermisoDuplicarDetallePagos(Boolean isPermisoDuplicarDetallePagos) {
		this.isPermisoDuplicarDetallePagos = isPermisoDuplicarDetallePagos;
	}
	
	public Boolean getIsPermisoOrdenDetallePagos() {
		return isPermisoOrdenDetallePagos;
	}

	public void setIsPermisoOrdenDetallePagos(Boolean isPermisoOrdenDetallePagos) {
		this.isPermisoOrdenDetallePagos = isPermisoOrdenDetallePagos;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetallePagos() {
		return isVisibilidadCeldaNuevoDetallePagos;
	}

	public void setIsVisibilidadCeldaNuevoDetallePagos(Boolean isVisibilidadCeldaNuevoDetallePagos) {
		this.isVisibilidadCeldaNuevoDetallePagos = isVisibilidadCeldaNuevoDetallePagos;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetallePagos() {
		return isVisibilidadCeldaDuplicarDetallePagos;
	}

	public void setIsVisibilidadCeldaDuplicarDetallePagos(Boolean isVisibilidadCeldaDuplicarDetallePagos) {
		this.isVisibilidadCeldaDuplicarDetallePagos = isVisibilidadCeldaDuplicarDetallePagos;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetallePagos() {
		return isVisibilidadCeldaCopiarDetallePagos;
	}

	public void setIsVisibilidadCeldaCopiarDetallePagos(Boolean isVisibilidadCeldaCopiarDetallePagos) {
		this.isVisibilidadCeldaCopiarDetallePagos = isVisibilidadCeldaCopiarDetallePagos;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetallePagos() {
		return isVisibilidadCeldaVerFormDetallePagos;
	}

	public void setIsVisibilidadCeldaVerFormDetallePagos(Boolean isVisibilidadCeldaVerFormDetallePagos) {
		this.isVisibilidadCeldaVerFormDetallePagos = isVisibilidadCeldaVerFormDetallePagos;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetallePagos() {
		return isVisibilidadCeldaOrdenDetallePagos;
	}

	public void setIsVisibilidadCeldaOrdenDetallePagos(Boolean isVisibilidadCeldaOrdenDetallePagos) {
		this.isVisibilidadCeldaOrdenDetallePagos = isVisibilidadCeldaOrdenDetallePagos;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetallePagos() {
		return isVisibilidadCeldaNuevoRelacionesDetallePagos;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetallePagos(Boolean isVisibilidadCeldaNuevoRelacionesDetallePagos) {
		this.isVisibilidadCeldaNuevoRelacionesDetallePagos = isVisibilidadCeldaNuevoRelacionesDetallePagos;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetallePagos() {
		return isVisibilidadCeldaModificarDetallePagos;
	}

	public void setIsVisibilidadCeldaModificarDetallePagos(Boolean isVisibilidadCeldaModificarDetallePagos) {
		this.isVisibilidadCeldaModificarDetallePagos = isVisibilidadCeldaModificarDetallePagos;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetallePagos() {
		return isVisibilidadCeldaActualizarDetallePagos;
	}

	public void setIsVisibilidadCeldaActualizarDetallePagos(Boolean isVisibilidadCeldaActualizarDetallePagos) {
		this.isVisibilidadCeldaActualizarDetallePagos = isVisibilidadCeldaActualizarDetallePagos;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetallePagos() {
		return isVisibilidadCeldaEliminarDetallePagos;
	}

	public void setIsVisibilidadCeldaEliminarDetallePagos(Boolean isVisibilidadCeldaEliminarDetallePagos) {
		this.isVisibilidadCeldaEliminarDetallePagos = isVisibilidadCeldaEliminarDetallePagos;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetallePagos() {
		return isVisibilidadCeldaCancelarDetallePagos;
	}

	public void setIsVisibilidadCeldaCancelarDetallePagos(Boolean isVisibilidadCeldaCancelarDetallePagos) {
		this.isVisibilidadCeldaCancelarDetallePagos = isVisibilidadCeldaCancelarDetallePagos;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetallePagos() {
		return isVisibilidadCeldaGuardarDetallePagos;
	}

	public void setIsVisibilidadCeldaGuardarDetallePagos(Boolean isVisibilidadCeldaGuardarDetallePagos) {
		this.isVisibilidadCeldaGuardarDetallePagos = isVisibilidadCeldaGuardarDetallePagos;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetallePagos() {
		return isVisibilidadCeldaGuardarCambiosDetallePagos;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetallePagos(Boolean isVisibilidadCeldaGuardarCambiosDetallePagos) {
		this.isVisibilidadCeldaGuardarCambiosDetallePagos = isVisibilidadCeldaGuardarCambiosDetallePagos;
	}
		
	public DetallePagosSessionBean getdetallepagosSessionBean() {
		return this.detallepagosSessionBean;
	}
	
	public void setdetallepagosSessionBean(DetallePagosSessionBean detallepagosSessionBean) {
		this.detallepagosSessionBean=detallepagosSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaDetallePagos() {
		return this.isVisibilidadBusquedaDetallePagos;
	}

	public void setisVisibilidadBusquedaDetallePagos(Boolean isVisibilidadBusquedaDetallePagos) {
		this.isVisibilidadBusquedaDetallePagos=isVisibilidadBusquedaDetallePagos;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdGrupoCliente() {
		return this.isVisibilidadFK_IdGrupoCliente;
	}

	public void setisVisibilidadFK_IdGrupoCliente(Boolean isVisibilidadFK_IdGrupoCliente) {
		this.isVisibilidadFK_IdGrupoCliente=isVisibilidadFK_IdGrupoCliente;
	}

	public Boolean getisVisibilidadFK_IdZona() {
		return this.isVisibilidadFK_IdZona;
	}

	public void setisVisibilidadFK_IdZona(Boolean isVisibilidadFK_IdZona) {
		this.isVisibilidadFK_IdZona=isVisibilidadFK_IdZona;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetallePagos(DetallePagos detallepagos)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detallepagos,null);
				this.setActualParaGuardarGrupoClienteForeignKey(detallepagos,null);
				this.setActualParaGuardarZonaForeignKey(detallepagos,null);
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
	
	public void bugActualizarReferenciaActual(DetallePagos detallepagos,DetallePagos detallepagosAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetallePagos(detallepagos);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detallepagosAux.setId(detallepagos.getId());
		detallepagosAux.setVersionRow(detallepagos.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
	}	
	
	public void actualizarRelaciones(DetallePagos detallepagosLocal) throws Exception {
		
		if(this.detallepagosSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetallePagos detallepagosLocal) throws Exception {	
		if(this.detallepagosSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detallepagosLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(GrupoClienteDetalleFormJInternalFrame.class)) {
				GrupoClienteBeanSwingJInternalFrame grupoclienteBeanSwingJInternalFrameLocal=(GrupoClienteBeanSwingJInternalFrame) ((GrupoClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				grupoclienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.getgrupocliente(),true);
				grupoclienteBeanSwingJInternalFrameLocal.actualizarLista(grupoclienteBeanSwingJInternalFrameLocal.grupocliente,this.grupoclientesForeignKey);

				grupoclienteBeanSwingJInternalFrameLocal.actualizarRelaciones(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				detallepagosLocal.setGrupoCliente(grupoclienteBeanSwingJInternalFrameLocal.grupocliente);

				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey("Formulario");
				this.setActualGrupoClienteForeignKey(grupoclienteBeanSwingJInternalFrameLocal.grupocliente.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ZonaDetalleFormJInternalFrame.class)) {
				ZonaBeanSwingJInternalFrame zonaBeanSwingJInternalFrameLocal=(ZonaBeanSwingJInternalFrame) ((ZonaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				zonaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoZona(zonaBeanSwingJInternalFrameLocal.getzona(),true);
				zonaBeanSwingJInternalFrameLocal.actualizarLista(zonaBeanSwingJInternalFrameLocal.zona,this.zonasForeignKey);

				zonaBeanSwingJInternalFrameLocal.actualizarRelaciones(zonaBeanSwingJInternalFrameLocal.zona);

				detallepagosLocal.setZona(zonaBeanSwingJInternalFrameLocal.zona);

				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey("Formulario");
				this.setActualZonaForeignKey(zonaBeanSwingJInternalFrameLocal.zona.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetallePagosActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detallepagosValidator.getInvalidValues(this.detallepagos);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetallePagos detallepagos,List<DetallePagos> detallepagoss) throws Exception {
	}		
	
	public void actualizarSelectedLista(DetallePagos detallepagos,List<DetallePagos> detallepagoss) throws Exception {
		try	{			
			DetallePagosConstantesFunciones.actualizarSelectedLista(detallepagos,detallepagoss);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetallePagos> detallepagossLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detallepagossLocal=this.detallepagosLogic.getDetallePagoss();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detallepagossLocal=this.detallepagoss;
			}
			//ARCHITECTURE
		
			for(DetallePagos detallepagosLocal:detallepagossLocal) {
				if(this.permiteMantenimiento(detallepagosLocal) && detallepagosLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetallePagosConstantesFunciones.getDetallePagosLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetallePagosConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelcodigoDetallePagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagosConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelnombre_clienteDetallePagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagosConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelrucDetallePagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagosConstantesFunciones.TOTALFACTURAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabeltotal_facturasDetallePagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagosConstantesFunciones.TOTALABONOS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabeltotal_abonosDetallePagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagosConstantesFunciones.TOTALFACTURASACTUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabeltotal_facturas_actualDetallePagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagosConstantesFunciones.ABONOSANTERIOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelabonos_anteriorDetallePagos,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetallePagosConstantesFunciones.ABONOSACTUAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelabonos_actualDetallePagos,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagos.jLabelcodigoDetallePagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagos.jLabelnombre_clienteDetallePagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagos.jLabelrucDetallePagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagos.jLabeltotal_facturasDetallePagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagos.jLabeltotal_abonosDetallePagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagos.jLabeltotal_facturas_actualDetallePagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagos.jLabelabonos_anteriorDetallePagos,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetallePagos.jLabelabonos_actualDetallePagos,"");
		
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
		this.iIdNuevoDetallePagos--;	
		
		
		this.detallepagosAux=new DetallePagos();
		
		this.detallepagosAux.setId(this.iIdNuevoDetallePagos);
		this.detallepagosAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detallepagosLogic.getDetallePagoss().add(this.detallepagosAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detallepagoss.add(this.detallepagosAux);
		}
		//ARCHITECTURE
		
		this.detallepagos=this.detallepagosAux;
		
		if(DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetallePagos(this.detallepagos);
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePagos(this.detallepagos);
		}
				
		//this.setDefaultControlesDetallePagos();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetallePagos();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetallePagos();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePagos();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePagos(this.detallepagosBean,this.detallepagos,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetallePagos(this.detallepagosReturnGeneral,this.detallepagosBean,false);
		
		if(this.detallepagosReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetallePagos(this.detallepagosReturnGeneral.getDetallePagos());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetallePagos(this.detallepagosReturnGeneral.getDetallePagos());
		}
		
		if(this.detallepagosReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetallePagos(this.detallepagosReturnGeneral.getDetallePagos(),classes);//this.detallepagosBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetallePagos();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetallePagos();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetallePagosBeanSwingJInternalFrameAdditional.RecargarFormDetallePagos(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetallePagos(false);
						
			if(detallepagosSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePagos();
			}
			
			this.actualizarVisualTableDatosDetallePagos();
			
			this.jTableDatosDetallePagos.setRowSelectionInterval(this.getIndiceNuevoDetallePagos(), this.getIndiceNuevoDetallePagos());
			
			this.seleccionarFilaTablaDetallePagosActual();
						
			this.actualizarEstadoCeldasBotonesDetallePagos("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetallePagos(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetallePagos.jDateChooserfecha_emision_desdeDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarfecha_emision_desdeDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jDateChooserfecha_emision_hastaDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarfecha_emision_hastaDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldcodigoDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarcodigoDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextAreanombre_clienteDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarnombre_clienteDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldrucDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarrucDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturasDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activartotal_facturasDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_abonosDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activartotal_abonosDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturas_actualDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activartotal_facturas_actualDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_anteriorDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarabonos_anteriorDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_actualDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarabonos_actualDetallePagos);	
		//
		this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarid_empresaDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarid_grupo_clienteDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.setEnabled(isHabilitar && this.detallepagosConstantesFunciones.activarid_zonaDetallePagos);
	};
	
	public void setDefaultControlesDetallePagos() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetallePagos(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detallepagosSessionBean.setConGuardarRelaciones(true);			
			this.detallepagosSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetallePagos.jTabbedPaneRelacionesDetallePagos.setVisible(true);
			
					
		} else {
			//this.detallepagosSessionBean.setConGuardarRelaciones(false);			
			this.detallepagosSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetallePagos.jTabbedPaneRelacionesDetallePagos.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetallePagos() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagos detallepagosAux:this.detallepagosLogic.getDetallePagoss()) {
				if(detallepagosAux.getId().equals(this.iIdNuevoDetallePagos)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagos detallepagosAux:this.detallepagoss) {
				if(detallepagosAux.getId().equals(this.iIdNuevoDetallePagos)) {
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
	
	public int getIndiceActualDetallePagos(DetallePagos detallepagos,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagos detallepagosAux:this.detallepagosLogic.getDetallePagoss()) {
				if(detallepagosAux.getId().equals(detallepagos.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagos detallepagosAux:this.detallepagoss) {
				if(detallepagosAux.getId().equals(detallepagos.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetallePagos(DetallePagos detallepagosOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagos detallepagosAux:this.detallepagosLogic.getDetallePagoss()) {
				if(detallepagosAux.getDetallePagosOriginal().getId().equals(detallepagosOriginal.getId())) {
					existe=true;
					detallepagosOriginal.setId(detallepagosAux.getId());
					detallepagosOriginal.setVersionRow(detallepagosAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagos detallepagosAux:this.detallepagoss) {
				if(detallepagosAux.getDetallePagosOriginal().getId().equals(detallepagosOriginal.getId())) {
					existe=true;
					detallepagosOriginal.setId(detallepagosAux.getId());
					detallepagosOriginal.setVersionRow(detallepagosAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetallePagos(Boolean esParaCancelar) throws Exception {
		detallepagossAux=new ArrayList<DetallePagos>();
		detallepagosAux=new DetallePagos();
		
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePagos detallepagosAux:this.detallepagosLogic.getDetallePagoss()) {
					if(detallepagosAux.getId()<0) {
						detallepagossAux.add(detallepagosAux);
					}		
				}
				this.iIdNuevoDetallePagos=0L;
				this.detallepagosLogic.getDetallePagoss().removeAll(detallepagossAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePagos detallepagosAux:this.detallepagoss) {
					if(detallepagosAux.getId()<0) {
						detallepagossAux.add(detallepagosAux);
					}		
				}
				this.iIdNuevoDetallePagos=0L;
				this.detallepagoss.removeAll(detallepagossAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetallePagos 
					&& this.detallepagosLogic.getDetallePagoss().size()>0
					) {
					detallepagosAux=this.detallepagosLogic.getDetallePagoss().get(this.detallepagosLogic.getDetallePagoss().size() - 1);
				
					if(detallepagosAux.getId()<0) {
						this.detallepagosLogic.getDetallePagoss().remove(detallepagosAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetallePagos && this.detallepagoss.size()>0) {
					detallepagosAux=this.detallepagoss.get(this.detallepagoss.size() - 1);
				
					if(detallepagosAux.getId()<0) {
						this.detallepagoss.remove(detallepagosAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetallePagos(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detallepagos.getId()<0) {
				this.detallepagosLogic.getDetallePagoss().remove(this.detallepagos);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detallepagos.getId()<0) {
				this.detallepagoss.remove(this.detallepagos);
			}
		}			
	}
	
	public void setEstadosInicialesDetallePagos(List<DetallePagos> detallepagossAux) throws Exception {
		DetallePagosConstantesFunciones.setEstadosInicialesDetallePagos(detallepagossAux);
	}
	
	public void setEstadosInicialesDetallePagos(DetallePagos detallepagosAux) throws Exception {
		DetallePagosConstantesFunciones.setEstadosInicialesDetallePagos(detallepagosAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetallePagosActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetallePagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetallePagosActual()) {
				if(!this.isEsNuevoDetallePagos) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetallePagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetallePagos=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetallePagosActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Pagos ?", "MANTENIMIENTO DE Detalle Pagos", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetallePagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetallePagos detallepagos) throws Exception {
		DetallePagosConstantesFunciones.seleccionarAsignar(this.detallepagos,detallepagos);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetallePagos=this.isPermisoActualizarOriginalDetallePagos;
			
			
			this.seleccionarAsignar(detallepagos);
			
			
			
			
			
			this.actualizarEstadoCeldasBotonesDetallePagos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detallepagosSessionBean.setsFuncionBusquedaRapida(this.detallepagosSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetallePagos) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetallePagos(esParaCancelar);				
				this.cancelarNuevoDetallePagos(esParaCancelar);								
			}
			
			this.detallepagos=new DetallePagos();
			
			this.inicializarDetallePagos();
			
			this.actualizarEstadoCeldasBotonesDetallePagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetallePagos() throws Exception {
		try {
			DetallePagosConstantesFunciones.inicializarDetallePagos(this.detallepagos);
			
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
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detallepagosLogic.getDetallePagoss().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetallePagoss(String sAccionBusqueda,List<DetallePagos> detallepagossParaReportes) throws Exception {
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
					sPathReporteFinal="DetallePagos"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetallePagosMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetallePagosMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetallePagos"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Pagoses");		
		parameters.put("busquedapor", DetallePagosConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetallePagos=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetallePagosConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetallePagosConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetallePagos=new JRBeanArrayDataSource(DetallePagosJInternalFrame.TraerDetallePagosBeans(detallepagossParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetallePagos);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetallePagosConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetallePagosConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetallePagosBean.TraerDetallePagosBeans(detallepagossParaReportes).toArray()));
							
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
				this.generarExcelReporteDetallePagoss(sAccionBusqueda,sTipoArchivoReporte,detallepagossParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetallePagoss(sAccionBusqueda,sTipoArchivoReporte,detallepagossParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetallePagosActionPerformed(null);
					//this.generarExcelReporteDetallePagoss(sAccionBusqueda,sTipoArchivoReporte,detallepagossParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetallePagoss(sAccionBusqueda,sTipoArchivoReporte,detallepagossParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetallePagoss(sAccionBusqueda,sTipoArchivoReporte,detallepagossParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetallePagoss(sAccionBusqueda,sTipoArchivoReporte,detallepagossParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetallePagoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePagos> detallepagossParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagos";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePagoss");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePagos("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetallePagos detallepagos : detallepagossParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetallePagosConstantesFunciones.generarExcelReporteDataDetallePagos("NORMAL",row,workbook,detallepagos,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pagos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetallePagos(String sTipo,Row row,Workbook workbook) {
		
		DetallePagosConstantesFunciones.generarExcelReporteHeaderDetallePagos(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetallePagoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePagos> detallepagossParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagos_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePagoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetallePagos detallepagos : detallepagossParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetallePagosConstantesFunciones.getDetallePagosDescripcion(detallepagos));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getgrupocliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_IDZONA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_IDZONA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getzona_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getfecha_emision_desde());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getfecha_emision_hasta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.gettotal_facturas());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_TOTALABONOS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_TOTALABONOS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.gettotal_abonos());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.gettotal_facturas_actual());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getabonos_anterior());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detallepagos.getabonos_actual());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pagos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetallePagoss(String sAccionBusqueda,String sTipoArchivoReporte,List<DetallePagos> detallepagossParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetallePagos> detallepagossRespaldo=null;
		
		classes=DetallePagosConstantesFunciones.getClassesRelationshipsOfDetallePagos(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detallepagosLogic.setDatosCliente(this.datosCliente);
		this.detallepagosLogic.setDatosDeep(this.datosDeep);
		this.detallepagosLogic.setIsConDeep(true);
		
		detallepagossRespaldo=this.detallepagosLogic.getDetallePagoss();
		
		this.detallepagosLogic.setDetallePagoss(detallepagossParaReportes);	
		this.detallepagosLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detallepagossParaReportes=this.detallepagosLogic.getDetallePagoss();
		this.detallepagosLogic.setDetallePagoss(detallepagossRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagos_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetallePagoss");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetallePagos("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetallePagos detallepagos : detallepagossParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetallePagos("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetallePagosConstantesFunciones.generarExcelReporteDataDetallePagos("NORMAL",row,workbook,detallepagos,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetallePagosConstantesFunciones.getDetallePagosDescripcion(detallepagos));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pagos",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePagos.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetallePagos() throws Exception {		
		this.startProcessDetallePagos(true);
	}
	
	public void startProcessDetallePagos(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetallePagos ,this.jPanelParametrosReportesDetallePagos, this.jScrollPanelDatosDetallePagos,this.jPanelPaginacionDetallePagos, this.jScrollPanelDatosEdicionDetallePagos, this.jPanelAccionesDetallePagos,this.jPanelAccionesFormularioDetallePagos,this.jmenuBarDetallePagos,this.jmenuBarDetalleDetallePagos,this.jTtoolBarDetallePagos,this.jTtoolBarDetalleDetallePagos);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePagos=this.jTabbedPaneBusquedasDetallePagos; 
		
		final JPanel jPanelParametrosReportesDetallePagos=this.jPanelParametrosReportesDetallePagos;
		//final JScrollPane jScrollPanelDatosDetallePagos=this.jScrollPanelDatosDetallePagos;
		final JTable jTableDatosDetallePagos=this.jTableDatosDetallePagos;		
		final JPanel jPanelPaginacionDetallePagos=this.jPanelPaginacionDetallePagos;
		//final JScrollPane jScrollPanelDatosEdicionDetallePagos=this.jScrollPanelDatosEdicionDetallePagos;
		final JPanel jPanelAccionesDetallePagos=this.jPanelAccionesDetallePagos;
		
		JPanel jPanelCamposAuxiliarDetallePagos=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetallePagos=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			jPanelCamposAuxiliarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jPanelCamposDetallePagos;
			jPanelAccionesFormularioAuxiliarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jPanelAccionesFormularioDetallePagos;
		}
		
		final JPanel jPanelCamposDetallePagos=jPanelCamposAuxiliarDetallePagos;
		final JPanel jPanelAccionesFormularioDetallePagos=jPanelAccionesFormularioAuxiliarDetallePagos;
		
		
		final JMenuBar jmenuBarDetallePagos=this.jmenuBarDetallePagos;
		final JToolBar jTtoolBarDetallePagos=this.jTtoolBarDetallePagos;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetallePagos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePagos=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			jmenuBarDetalleAuxiliarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jmenuBarDetalleDetallePagos;
			jTtoolBarDetalleAuxiliarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jTtoolBarDetalleDetallePagos;
		}
		
		final JMenuBar jmenuBarDetalleDetallePagos=jmenuBarDetalleAuxiliarDetallePagos;
		final JToolBar jTtoolBarDetalleDetallePagos=jTtoolBarDetalleAuxiliarDetallePagos;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePagos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePagos;
			processRunnable.jTableDatos=jTableDatosDetallePagos;
			processRunnable.jPanelCampos=jPanelCamposDetallePagos;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePagos;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePagos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePagos;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePagos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePagos;
			processRunnable.jTtoolBar=jTtoolBarDetallePagos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePagos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePagos ,jPanelParametrosReportesDetallePagos,jTableDatosDetallePagos, /*jScrollPanelDatosDetallePagos,*/jPanelCamposDetallePagos,jPanelPaginacionDetallePagos, /*jScrollPanelDatosEdicionDetallePagos,*/ jPanelAccionesDetallePagos,jPanelAccionesFormularioDetallePagos,jmenuBarDetallePagos,jmenuBarDetalleDetallePagos,jTtoolBarDetallePagos,jTtoolBarDetalleDetallePagos);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetallePagos ,jPanelParametrosReportesDetallePagos, jScrollPanelDatosDetallePagos,jPanelPaginacionDetallePagos, jScrollPanelDatosEdicionDetallePagos, jPanelAccionesDetallePagos,jPanelAccionesFormularioDetallePagos,jmenuBarDetallePagos,jmenuBarDetalleDetallePagos,jTtoolBarDetallePagos,jTtoolBarDetalleDetallePagos);
						
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
	
	public void finishProcessDetallePagos() {// throws Exception 
		this.finishProcessDetallePagos(true);
	}
	
	public void finishProcessDetallePagos(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetallePagos ,this.jPanelParametrosReportesDetallePagos, this.jScrollPanelDatosDetallePagos,this.jPanelPaginacionDetallePagos, this.jScrollPanelDatosEdicionDetallePagos, this.jPanelAccionesDetallePagos,this.jPanelAccionesFormularioDetallePagos,this.jmenuBarDetallePagos,this.jmenuBarDetalleDetallePagos,this.jTtoolBarDetallePagos,this.jTtoolBarDetalleDetallePagos);		
		
		final JTabbedPane jTabbedPaneBusquedasDetallePagos=this.jTabbedPaneBusquedasDetallePagos; 
		
		final JPanel jPanelParametrosReportesDetallePagos=this.jPanelParametrosReportesDetallePagos;
		//final JScrollPane jScrollPanelDatosDetallePagos=this.jScrollPanelDatosDetallePagos;
		final JTable jTableDatosDetallePagos=this.jTableDatosDetallePagos;		
		final JPanel jPanelPaginacionDetallePagos=this.jPanelPaginacionDetallePagos;
		//final JScrollPane jScrollPanelDatosEdicionDetallePagos=this.jScrollPanelDatosEdicionDetallePagos;
		final JPanel jPanelAccionesDetallePagos=this.jPanelAccionesDetallePagos;
		
		JPanel jPanelCamposAuxiliarDetallePagos=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetallePagos=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			jPanelCamposAuxiliarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jPanelCamposDetallePagos;
			jPanelAccionesFormularioAuxiliarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jPanelAccionesFormularioDetallePagos;
		}
		
		final JPanel jPanelCamposDetallePagos=jPanelCamposAuxiliarDetallePagos;
		final JPanel jPanelAccionesFormularioDetallePagos=jPanelAccionesFormularioAuxiliarDetallePagos;
		
		
		final JMenuBar jmenuBarDetallePagos=this.jmenuBarDetallePagos;		
		final JToolBar jTtoolBarDetallePagos=this.jTtoolBarDetallePagos;
				
		JMenuBar jmenuBarDetalleAuxiliarDetallePagos=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetallePagos=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			jmenuBarDetalleAuxiliarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jmenuBarDetalleDetallePagos;
			jTtoolBarDetalleAuxiliarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jTtoolBarDetalleDetallePagos;		
		}
		
		final JMenuBar jmenuBarDetalleDetallePagos=jmenuBarDetalleAuxiliarDetallePagos;
		final JToolBar jTtoolBarDetalleDetallePagos=jTtoolBarDetalleAuxiliarDetallePagos;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetallePagos;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetallePagos;
			processRunnable.jTableDatos=jTableDatosDetallePagos;
			processRunnable.jPanelCampos=jPanelCamposDetallePagos;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetallePagos;
			processRunnable.jPanelAcciones=jPanelAccionesDetallePagos;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetallePagos;
			
			
			processRunnable.jmenuBar=jmenuBarDetallePagos;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetallePagos;
			processRunnable.jTtoolBar=jTtoolBarDetallePagos;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetallePagos;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetallePagos ,jPanelParametrosReportesDetallePagos, jTableDatosDetallePagos,/*jScrollPanelDatosDetallePagos,*/jPanelCamposDetallePagos,jPanelPaginacionDetallePagos, /*jScrollPanelDatosEdicionDetallePagos,*/ jPanelAccionesDetallePagos,jPanelAccionesFormularioDetallePagos,jmenuBarDetallePagos,jmenuBarDetalleDetallePagos,jTtoolBarDetallePagos,jTtoolBarDetalleDetallePagos));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetallePagos(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetallePagos(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetallePagos(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetallePagos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetallePagos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetallePagos,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetallePagos(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetallePagos,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetallePagos,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detallepagosConstantesFunciones.getsFinalQueryDetallePagos();
		String  finalQueryPaginacionTodos=this.detallepagosConstantesFunciones.getsFinalQueryDetallePagos();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetallePagosConstantesFunciones.getArrayColumnasGlobalesNoDetallePagos(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetallePagosConstantesFunciones.getArrayColumnasGlobalesDetallePagos(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetallePagosConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detallepagossEliminados= new ArrayList<DetallePagos>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetallePagos();
		
				///*DetallePagosSessionBean*/this.detallepagosSessionBean=new DetallePagosSessionBean();
			
			if(this.detallepagosSessionBean==null) {
				this.detallepagosSessionBean=new DetallePagosSessionBean();
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
					this.iNumeroPaginacion=DetallePagosConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetallePagosConstantesFunciones.getClassesForeignKeysOfDetallePagos(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detallepagos."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detallepagossAux= new ArrayList<DetallePagos>();
			
				
			detallepagosLogic.setDatosCliente(this.datosCliente);
			detallepagosLogic.setDatosDeep(this.datosDeep);
			detallepagosLogic.setIsConDeep(true);
			
			
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaDetallePagos")) {
				this.sDetalleReporte=DetallePagosConstantesFunciones.getDetalleIndiceBusquedaDetallePagos(id_grupo_clienteBusquedaDetallePagos,id_zonaBusquedaDetallePagos,fecha_emision_desdeBusquedaDetallePagos,fecha_emision_hastaBusquedaDetallePagos);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detallepagosLogic.getDetallePagossBusquedaDetallePagos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_grupo_clienteBusquedaDetallePagos,id_zonaBusquedaDetallePagos,fecha_emision_desdeBusquedaDetallePagos,fecha_emision_hastaBusquedaDetallePagos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagosConstantesFunciones.getDetalleIndiceBusquedaDetallePagos(id_grupo_clienteBusquedaDetallePagos,id_zonaBusquedaDetallePagos,fecha_emision_desdeBusquedaDetallePagos,fecha_emision_hastaBusquedaDetallePagos);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagosConstantesFunciones.getDetalleIndiceBusquedaDetallePagos(id_grupo_clienteBusquedaDetallePagos,id_zonaBusquedaDetallePagos,fecha_emision_desdeBusquedaDetallePagos,fecha_emision_hastaBusquedaDetallePagos);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detallepagosLogic.getDetallePagoss()==null||detallepagosLogic.getDetallePagoss().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detallepagoss==null|| detallepagoss.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagossAux=new ArrayList<DetallePagos>();
						detallepagossAux.addAll(detallepagosLogic.getDetallePagoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagossAux=new ArrayList<DetallePagos>();
							detallepagossAux.addAll(detallepagoss);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detallepagosLogic.getDetallePagossBusquedaDetallePagos(finalQueryGlobal,pagination,this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,id_grupo_clienteBusquedaDetallePagos,id_zonaBusquedaDetallePagos,fecha_emision_desdeBusquedaDetallePagos,fecha_emision_hastaBusquedaDetallePagos);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetallePagosConstantesFunciones.getDetalleIndiceBusquedaDetallePagos(id_grupo_clienteBusquedaDetallePagos,id_zonaBusquedaDetallePagos,fecha_emision_desdeBusquedaDetallePagos,fecha_emision_hastaBusquedaDetallePagos);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetallePagosConstantesFunciones.getDetalleIndiceBusquedaDetallePagos(id_grupo_clienteBusquedaDetallePagos,id_zonaBusquedaDetallePagos,fecha_emision_desdeBusquedaDetallePagos,fecha_emision_hastaBusquedaDetallePagos);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetallePagoss("BusquedaDetallePagos",detallepagosLogic.getDetallePagoss());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetallePagoss("BusquedaDetallePagos",detallepagoss);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagosLogic.setDetallePagoss(new ArrayList<DetallePagos>());
						detallepagosLogic.getDetallePagoss().addAll(detallepagossAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagoss=new ArrayList<DetallePagos>();
							detallepagoss.addAll(detallepagossAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetallePagos();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetallePagos();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepagosLogic.getDetallePagoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepagoss.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detallepagosLogic.getDetallePagoss().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detallepagoss.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetallePagos detallepagos) {
		Boolean permite=true;
		
		if(this.detallepagos.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetallePagosConstantesFunciones.getOrderByListaDetallePagos();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetallePagosConstantesFunciones.getOrderByListaDetallePagos();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagos detallepagos:detallepagosLogic.getDetallePagoss()) {
				if(detallepagos.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagosTotales=detallepagos;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagos detallepagos:this.detallepagoss) {
				if(detallepagos.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagosTotales=detallepagos;
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
			this.detallepagosAux=new DetallePagos();
			this.detallepagosAux.setsType(Constantes2.S_TOTALES);
			this.detallepagosAux.setIsNew(false);
			this.detallepagosAux.setIsChanged(false);
			this.detallepagosAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				//DetallePagosConstantesFunciones.TotalizarValoresFilaDetallePagos(this.detallepagosLogic.getDetallePagoss(),this.detallepagosAux);
				
				//this.detallepagosLogic.getDetallePagoss().add(this.detallepagosAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetallePagosConstantesFunciones.TotalizarValoresFilaDetallePagos(this.detallepagoss,this.detallepagosAux);
				
				this.detallepagoss.add(this.detallepagosAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detallepagosTotales=new DetallePagos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallepagosLogic.getDetallePagoss().remove(detallepagosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detallepagoss.remove(detallepagosTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detallepagosTotales=new DetallePagos();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetallePagos detallepagos:detallepagosLogic.getDetallePagoss()) {
				if(detallepagos.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagosTotales=detallepagos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePagosConstantesFunciones.TotalizarValoresFilaDetallePagos(this.detallepagosLogic.getDetallePagoss(),detallepagosTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetallePagos detallepagos:this.detallepagoss) {
				if(detallepagos.getsType().equals(Constantes2.S_TOTALES)) {
					detallepagosTotales=detallepagos;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetallePagosConstantesFunciones.TotalizarValoresFilaDetallePagos(this.detallepagoss,detallepagosTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetallePagossBusquedaDetallePagos()throws Exception {
		try {
			sAccionBusqueda="BusquedaDetallePagos";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagossFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagossFK_IdGrupoCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdGrupoCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetallePagossFK_IdZona()throws Exception {
		try {
			sAccionBusqueda="FK_IdZona";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetallePagossBusquedaDetallePagos(String sFinalQuery,Long id_grupo_cliente,Long id_zona,Date fecha_emision_desde,Date fecha_emision_hasta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallepagosLogic.getDetallePagossBusquedaDetallePagos(sFinalQuery,this.pagination,id_grupo_cliente,id_zona,fecha_emision_desde,fecha_emision_hasta);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagossFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallepagosLogic.getDetallePagossFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagossFK_IdGrupoCliente(String sFinalQuery,Long id_grupo_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallepagosLogic.getDetallePagossFK_IdGrupoCliente(sFinalQuery,this.pagination,id_grupo_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetallePagossFK_IdZona(String sFinalQuery,Long id_zona)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detallepagosLogic.getDetallePagossFK_IdZona(sFinalQuery,this.pagination,id_zona);
				
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
								
			//this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosDetallePagos() {
		this.isPermisoTodoDetallePagos=false;
		this.isPermisoNuevoDetallePagos=false;
		this.isPermisoActualizarDetallePagos=false;
		this.isPermisoActualizarOriginalDetallePagos=false;
		this.isPermisoEliminarDetallePagos=false;
		this.isPermisoGuardarCambiosDetallePagos=false;
		this.isPermisoConsultaDetallePagos=true;
		this.isPermisoBusquedaDetallePagos=true;
		this.isPermisoReporteDetallePagos=true;
		this.isPermisoOrdenDetallePagos=false;		
		this.isPermisoPaginacionMedioDetallePagos=false;		
		this.isPermisoPaginacionAltoDetallePagos=false;		
		this.isPermisoPaginacionTodoDetallePagos=false;		
		this.isPermisoCopiarDetallePagos=false;		
		this.isPermisoVerFormDetallePagos=false;		
		this.isPermisoDuplicarDetallePagos=false;
		this.isPermisoOrdenDetallePagos=false;
	}
	
	public void setPermisosUsuarioDetallePagos(Boolean isPermiso) {
		this.isPermisoTodoDetallePagos=isPermiso;
		this.isPermisoNuevoDetallePagos=isPermiso;
		this.isPermisoActualizarDetallePagos=isPermiso;
		this.isPermisoActualizarOriginalDetallePagos=isPermiso;
		this.isPermisoEliminarDetallePagos=isPermiso;
		this.isPermisoGuardarCambiosDetallePagos=isPermiso;
		this.isPermisoConsultaDetallePagos=isPermiso;
		this.isPermisoBusquedaDetallePagos=isPermiso;
		this.isPermisoReporteDetallePagos=isPermiso;
		this.isPermisoOrdenDetallePagos=isPermiso;		
		this.isPermisoPaginacionMedioDetallePagos=isPermiso;		
		this.isPermisoPaginacionAltoDetallePagos=isPermiso;		
		this.isPermisoPaginacionTodoDetallePagos=isPermiso;		
		this.isPermisoCopiarDetallePagos=isPermiso;		
		this.isPermisoVerFormDetallePagos=isPermiso;		
		this.isPermisoDuplicarDetallePagos=isPermiso;
		this.isPermisoOrdenDetallePagos=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetallePagos(Boolean isPermiso) {
		//this.isPermisoTodoDetallePagos=isPermiso;
		this.isPermisoNuevoDetallePagos=isPermiso;
		this.isPermisoActualizarDetallePagos=isPermiso;
		this.isPermisoActualizarOriginalDetallePagos=isPermiso;
		this.isPermisoEliminarDetallePagos=isPermiso;
		this.isPermisoGuardarCambiosDetallePagos=isPermiso;
		//this.isPermisoConsultaDetallePagos=isPermiso;
		//this.isPermisoBusquedaDetallePagos=isPermiso;
		//this.isPermisoReporteDetallePagos=isPermiso;
		//this.isPermisoOrdenDetallePagos=isPermiso;		
		//this.isPermisoPaginacionMedioDetallePagos=isPermiso;		
		//this.isPermisoPaginacionAltoDetallePagos=isPermiso;		
		//this.isPermisoPaginacionTodoDetallePagos=isPermiso;		
		//this.isPermisoCopiarDetallePagos=isPermiso;		
		//this.isPermisoDuplicarDetallePagos=isPermiso;
		//this.isPermisoOrdenDetallePagos=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetallePagosClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetallePagosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetallePagos(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetallePagosClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetallePagosClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetallePagosClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetallePagosClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetallePagos() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetallePagosJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detallepagosSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetallePagosConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetallePagos=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetallePagos=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetallePagos=this.isPermisoActualizarDetallePagos;
			this.isPermisoEliminarDetallePagos=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetallePagos=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetallePagos=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetallePagos=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetallePagos=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetallePagos=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePagos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetallePagos=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetallePagos=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetallePagos=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetallePagos=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetallePagos=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetallePagos=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetallePagos=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detallepagosSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetallePagos.setToolTipText(this.jTableDatosDetallePagos.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetallePagos(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetallePagos(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetallePagosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetallePagosJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetallePagos() throws Exception {
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
	public void inicializarCombosForeignKeyDetallePagosListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.grupoclientesForeignKey=new ArrayList();
				this.zonasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetallePagosListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetallePagosJInternalFrame.ISLOAD_FKLOTE) {
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyGrupoClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.grupoclientesForeignKey==null||this.grupoclientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=GrupoClienteConstantesFunciones.getArrayColumnasGlobalesGrupoCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,GrupoClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=GrupoClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosGrupoClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyZonaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.zonasForeignKey==null||this.zonasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ZonaConstantesFunciones.getArrayColumnasGlobalesZona(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ZonaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ZonaConstantesFunciones.SFINALQUERY;

				this.cargarCombosZonasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	
	public void addItemDefectoCombosTodosForeignKeyDetallePagos()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyGrupoCliente();
			this.addItemDefectoCombosForeignKeyZona();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detallepagosSessionBean==null) {
				this.detallepagosSessionBean=new DetallePagosSessionBean();
			}

			if(!this.detallepagosSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyGrupoCliente()throws Exception {
		try {

			if(!this.detallepagosSessionBean.getisBusquedaDesdeForeignKeySesionGrupoCliente()) {
				GrupoCliente grupocliente=new GrupoCliente();
				GrupoClienteConstantesFunciones.setGrupoClienteDescripcion(grupocliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				grupocliente.setId(null);

				if(!GrupoClienteConstantesFunciones.ExisteEnLista(this.grupoclientesForeignKey,grupocliente,true)) {

					this.grupoclientesForeignKey.add(0,grupocliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyZona()throws Exception {
		try {

			if(!this.detallepagosSessionBean.getisBusquedaDesdeForeignKeySesionZona()) {
				Zona zona=new Zona();
				ZonaConstantesFunciones.setZonaDescripcion(zona,Constantes.SMENSAJE_ESCOJA_OPCION);
				zona.setId(null);

				if(!ZonaConstantesFunciones.ExisteEnLista(this.zonasForeignKey,zona,true)) {

					this.zonasForeignKey.add(0,zona);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetallePagos()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetallePagos(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetallePagos()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePagos();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetallePagos(DetallePagos detallepagos)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetallePagos(DetallePagos detallepagos,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetallePagos()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetallePagos()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetallePagos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetallePagos()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetallePagos()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetallePagos()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameGrupoClientesForeignKey("Todos");
			this.cargarCombosFrameZonasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetallePagos(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetallePagos()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public DetallePagosBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetallePagosBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetallePagosBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detallepagosSessionBean=new DetallePagosSessionBean(); 
		this.detallepagosConstantesFunciones=new DetallePagosConstantesFunciones(); 
		this.detallepagosBean=new DetallePagos();//(this.detallepagosConstantesFunciones); 		
		this.detallepagosReturnGeneral=new DetallePagosParameterReturnGeneral(); 
		
		this.detallepagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detallepagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetallePagosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetallePagosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetallePagosBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetallePagos(true);
			
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
			
			this.detallepagosConstantesFunciones=new DetallePagosConstantesFunciones(); 
			this.detallepagosBean=new DetallePagos();//this.detallepagosConstantesFunciones); 			
			this.detallepagosReturnGeneral=new DetallePagosParameterReturnGeneral(); 
		
			DetallePagosBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Pagos Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detallepagos=new DetallePagos();
			this.detallepagoss = new ArrayList<DetallePagos>();
			this.detallepagossAux = new ArrayList<DetallePagos>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic=new DetallePagosLogic();
				this.detallepagosLogic.getNewConnexionToDeep("");
			}
			
			//this.detallepagosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detallepagosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetallePagos);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetallePagos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePagos);	
					}
					
					if(this.jInternalFrameImportacionDetallePagos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePagos);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetallePagos!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetallePagos);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetallePagos!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePagos);
				this.jInternalFrameDetalleFormDetallePagos.setVisible(false);
				this.jInternalFrameDetalleFormDetallePagos.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePagos!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePagos);
					this.jInternalFrameReporteDinamicoDetallePagos.setVisible(false);
					this.jInternalFrameReporteDinamicoDetallePagos.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetallePagos!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetallePagos);
					this.jInternalFrameImportacionDetallePagos.setVisible(false);
					this.jInternalFrameImportacionDetallePagos.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetallePagos!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetallePagos);
					this.jInternalFrameOrderByDetallePagos.setVisible(false);
					this.jInternalFrameOrderByDetallePagos.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetallePagosActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetallePagosConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detallepagosReturnGeneral=new DetallePagosParameterReturnGeneral();
			
			this.detallepagosParameterGeneral=new DetallePagosParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detallepagosLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetallePagosJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detallepagosSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePagosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallepagosSessionBean.getEsGuardarRelacionado(),this.detallepagosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetallePagosConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detallepagosSessionBean.getEsGuardarRelacionado(),this.detallepagosSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetallePagos=false;
			this.isVisibilidadCeldaDuplicarDetallePagos=true;
			this.isVisibilidadCeldaCopiarDetallePagos=true;
			this.isVisibilidadCeldaVerFormDetallePagos=true;
			this.isVisibilidadCeldaOrdenDetallePagos=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
			this.isVisibilidadCeldaModificarDetallePagos=false;
			this.isVisibilidadCeldaActualizarDetallePagos=false;
			this.isVisibilidadCeldaEliminarDetallePagos=false;
			this.isVisibilidadCeldaCancelarDetallePagos=false;
			this.isVisibilidadCeldaGuardarDetallePagos=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=false;
			
			
			this.isVisibilidadBusquedaDetallePagos=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdGrupoCliente=true;
			this.isVisibilidadFK_IdZona=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetallePagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetallePagos();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetallePagos(false);
			
			this.setPermisosUsuarioDetallePagos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepagosSessionBean.getEsGuardarRelacionado() 
				|| (this.detallepagosSessionBean.getEsGuardarRelacionado() && this.detallepagosSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetallePagosClasesRelacionadas();
			}
			
			if(this.detallepagosSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetallePagosClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetallePagos();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetallePagos();
			}
			
			if(!this.isPermisoBusquedaDetallePagos) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetallePagos.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(true,true,true);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetallePagosConstantesFunciones.getTiposSeleccionarDetallePagos());
				
				this.tiposColumnasSelect=DetallePagosConstantesFunciones.getTiposSeleccionarDetallePagos(true);
				
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
			//if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetallePagos();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,false);
				this.setAccionesUsuarioDetallePagos(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,false);							
				this.setAccionesUsuarioDetallePagos(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePagos() ;
			
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
			
			this.empresaLogic=new EmpresaLogic();
			this.grupoclienteLogic=new GrupoClienteLogic();
			this.zonaLogic=new ZonaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detallepagosImplementable= (DetallePagosImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePagosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detallepagosImplementableHome= (DetallePagosImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetallePagosConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detallepagoss= new ArrayList<DetallePagos>();
			this.detallepagossEliminados= new ArrayList<DetallePagos>();
						
			this.isEsNuevoDetallePagos=false;
			this.esParaAccionDesdeFormularioDetallePagos=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.grupoclientesForeignKey=new ArrayList<GrupoCliente>() ;
			this.zonasForeignKey=new ArrayList<Zona>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetallePagos(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetallePagos();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetallePagosBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetallePagosConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetallePagos("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetallePagos(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetallePagos!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetallePagos();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetallePagos();
			}
			
			DetallePagosBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetallePagos.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetallePagos.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetallePagos.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetallePagos(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetallePagos: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetallePagos() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetallePagos")) {
				iIndex=this.jInternalFrameDetalleFormDetallePagos.jTabbedPaneRelacionesDetallePagos.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetallePagos.jTabbedPaneRelacionesDetallePagos.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetallePagos();	
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
	
	public void cargarCombosForeignKeyDetallePagos(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetallePagos(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetallePagos(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetallePagosListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetallePagos();
		
		this.cargarCombosFrameForeignKeyDetallePagos();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetallePagos();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetallePagos();
		}
	}
	
	

	public void cargarCombosForeignKeyGrupoCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyGrupoClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyGrupoCliente();
				this.cargarCombosFrameGrupoClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaGrupoCliente(this.grupoclientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyZona(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyZonaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyZona();
				this.cargarCombosFrameZonasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaZona(this.zonasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetallePagosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detallepagosSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
			
			if(jTableDatosDetallePagos.getRowCount()>=1) {
				jTableDatosDetallePagos.removeRowSelectionInterval(0, jTableDatosDetallePagos.getRowCount()-1);						
			}
			
			this.isEsNuevoDetallePagos=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetallePagos(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetallePagos(true);			
			//this.detallepagos=new DetallePagos();
			//this.detallepagos.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePagos(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePagos() ;
			
			if(DetallePagosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePagos(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detallepagos);	
			this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);				
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
			if(this.detallepagosSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetallePagos: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetallePagosActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetallePagos.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetallePagos.getSelectedRows().length;			
			}
			
			detallepagossSeleccionados=this.getDetallePagossSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetallePagos--;			
				//DetallePagos detallepagosAux= new DetallePagos();			
				//detallepagosAux.setId(this.iIdNuevoDetallePagos);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetallePagos detallepagosOrigen=new DetallePagos();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetallePagos detallepagosOrigen : detallepagossSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detallepagosOrigen =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detallepagosOrigen =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetallePagos();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detallepagos.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetallePagos(detallepagosOrigen,this.detallepagos,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallepagosLogic.getDetallePagoss().add(this.detallepagosAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallepagoss.add(this.detallepagosAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetallePagos(false);
				
				this.jTableDatosDetallePagos.setRowSelectionInterval(this.getIndiceNuevoDetallePagos(), this.getIndiceNuevoDetallePagos());
				
				int iLastRow =  this.jTableDatosDetallePagos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePagos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePagos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePagos(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();									
		
			DetallePagos detallepagosOrigen=new DetallePagos();
			DetallePagos detallepagosDestino=new DetallePagos();
				
			detallepagossSeleccionados=this.getDetallePagossSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetallePagos.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detallepagossSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetallePagos.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagosOrigen =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallepagosOrigen =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detallepagosDestino =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detallepagosDestino =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detallepagosOrigen =detallepagossSeleccionados.get(0);
				detallepagosDestino =detallepagossSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetallePagos(detallepagosOrigen,detallepagosDestino,true,false);
				
				detallepagosDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detallepagosDestino,detallepagosLogic.getDetallePagoss());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detallepagosDestino,detallepagoss);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetallePagos(false);
				
				//this.jTableDatosDetallePagos.setRowSelectionInterval(this.getIndiceNuevoDetallePagos(), this.getIndiceNuevoDetallePagos());
				
				int iLastRow =  this.jTableDatosDetallePagos.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetallePagos.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetallePagos.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePagos(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetallePagos.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetallePagos.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetallePagos.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetallePagos.setVisible(!isVisible);
			this.jPanelPaginacionDetallePagos.setVisible(!isVisible);
			this.jPanelAccionesDetallePagos.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetallePagos();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetallePagos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetallePagos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetallePagos();
			
			this.abrirFrameOrderByDetallePagos();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetallePagos();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetallePagos(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePagos);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetallePagos.isMaximum()) {
					this.jInternalFrameDetalleFormDetallePagos.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetallePagos.setSize(this.jInternalFrameDetalleFormDetallePagos.iWidthFormulario,this.jInternalFrameDetalleFormDetallePagos.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetallePagos.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetallePagos.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetallePagos.isMaximum()) {
						this.jInternalFrameDetalleFormDetallePagos.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetallePagos.jContentPaneDetalleDetallePagos.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetallePagos.jTabbedPaneRelacionesDetallePagos.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetallePagos.jContentPaneDetalleDetallePagos.getWidth(),DetallePagosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePagos.jTabbedPaneRelacionesDetallePagos.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetallePagos.jContentPaneDetalleDetallePagos.getWidth(),DetallePagosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetallePagos.jTabbedPaneRelacionesDetallePagos.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetallePagos.jContentPaneDetalleDetallePagos.getWidth(),DetallePagosConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetallePagos.setVisible(true);
	        this.jInternalFrameDetalleFormDetallePagos.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetallePagos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetallePagos==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetallePagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePagos,false,this);
				} else {
					this.jInternalFrameOrderByDetallePagos=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetallePagos,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetallePagos);
				this.jInternalFrameOrderByDetallePagos.setVisible(false);
				this.jInternalFrameOrderByDetallePagos.setSelected(false);
				
				this.jInternalFrameOrderByDetallePagos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePagos"));
				
				this.inicializarActualizarBindingTablaOrderByDetallePagos();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetallePagos() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetallePagos==null) {
				
				this.jInternalFrameImportacionDetallePagos=new ImportacionJInternalFrame(DetallePagosConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetallePagos);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetallePagos);
				this.jInternalFrameImportacionDetallePagos.setVisible(false);
				this.jInternalFrameImportacionDetallePagos.setSelected(false);


				this.jInternalFrameImportacionDetallePagos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePagos"));
				this.jInternalFrameImportacionDetallePagos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePagos"));
				this.jInternalFrameImportacionDetallePagos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePagos"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetallePagos() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetallePagos==null) {
				this.jInternalFrameReporteDinamicoDetallePagos=new ReporteDinamicoJInternalFrame(DetallePagosConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetallePagos);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetallePagos);
				this.jInternalFrameReporteDinamicoDetallePagos.setVisible(false);
				this.jInternalFrameReporteDinamicoDetallePagos.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetallePagos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePagos"));
				this.jInternalFrameReporteDinamicoDetallePagos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePagos"));
				this.jInternalFrameReporteDinamicoDetallePagos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePagos"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePagos();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetallePagos() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetallePagos);
			
	       	this.jInternalFrameDetalleFormDetallePagos.setVisible(false);
	        this.jInternalFrameDetalleFormDetallePagos.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetallePagos.dispose();
			//this.jInternalFrameDetalleFormDetallePagos=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetallePagos() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetallePagos.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetallePagos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetallePagos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetallePagos.setVisible(true);
	        this.jInternalFrameImportacionDetallePagos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetallePagos() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetallePagos.setVisible(true);
	        this.jInternalFrameOrderByDetallePagos.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetallePagos() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetallePagos.setVisible(false);
	        this.jInternalFrameOrderByDetallePagos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetallePagos() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetallePagos.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetallePagos.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetallePagos() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetallePagos.setVisible(false);
	        this.jInternalFrameImportacionDetallePagos.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetallePagos(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetallePagos(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetallePagos(true);
			//this.isEsNuevoDetallePagos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetallePagos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePagos(false) ;
			
			if(detallepagosSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetallePagosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePagos(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePagos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetallePagosActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetallePagos(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetallePagos(true);
			//this.isEsNuevoDetallePagos=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detallepagos.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetallePagos("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetallePagos(false) ;
			
			if(DetallePagosJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetallePagos(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePagos(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaGrupoCliente(List<GrupoCliente> grupoclientesForeignKey)throws Exception{
		TableColumn tableColumnGrupoCliente=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE));
		TableCellEditor tableCellEditorGrupoCliente =tableColumnGrupoCliente.getCellEditor();

		GrupoClienteTableCell grupoclienteTableCellFk=(GrupoClienteTableCell)tableCellEditorGrupoCliente;

		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.setgrupoclientesForeignKey(grupoclientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePagos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//grupoclienteTableCellFk.setRowActual(intSelectedRow);
			//grupoclienteTableCellFk.setgrupoclientesForeignKeyActual(grupoclientesForeignKey);
		//}


		if(grupoclienteTableCellFk!=null) {
			grupoclienteTableCellFk.RecargarGrupoClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaZona(List<Zona> zonasForeignKey)throws Exception{
		TableColumn tableColumnZona=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_IDZONA));
		TableCellEditor tableCellEditorZona =tableColumnZona.getCellEditor();

		ZonaTableCell zonaTableCellFk=(ZonaTableCell)tableCellEditorZona;

		if(zonaTableCellFk!=null) {
			zonaTableCellFk.setzonasForeignKey(zonasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetallePagos.getSelectedRow();

		//if(intSelectedRow<=0) {
			//zonaTableCellFk.setRowActual(intSelectedRow);
			//zonaTableCellFk.setzonasForeignKeyActual(zonasForeignKey);
		//}


		if(zonaTableCellFk!=null) {
			zonaTableCellFk.RecargarZonasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetallePagos(false);
			
			//if(!this.isEsNuevoDetallePagos) {								
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				
			}
			
			if(this.permiteMantenimiento(this.detallepagos)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetallePagos=true;
					this.inicializarActualizarBindingTablaDetallePagos(false);
					this.isEsNuevoDetallePagos=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetallePagos=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetallePagos=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePagos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePagos(false);
				
				this.habilitarDeshabilitarControlesDetallePagos(false);
			
												
				
				if(DetallePagosJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetallePagos();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetallePagosActionPerformed(evt,detallepagosSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetallePagos(this.detallepagos,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetallePagos.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detallepagosSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detallepagos.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetallePagosActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				this.detallepagos.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				this.detallepagos.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detallepagos)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetallePagosModel) this.jTableDatosDetallePagos.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetallePagos=true;
				this.inicializarActualizarBindingTablaDetallePagos(false);
				this.isEsNuevoDetallePagos=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetallePagos(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePagos(false);
				
				this.habilitarDeshabilitarControlesDetallePagos(false);
				
				
				
				if(DetallePagosJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetallePagos();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetallePagosActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetallePagos.getRowCount()>=1) {
				jTableDatosDetallePagos.removeRowSelectionInterval(0, jTableDatosDetallePagos.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetallePagos(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetallePagos(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetallePagos(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetallePagos(false) ;
			
			this.isEsNuevoDetallePagos=false;
			
			if(DetallePagosJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetallePagos();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetallePagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetallePagos(false);
				
				//SI ES MANUAL
				if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetallePagos();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetallePagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetallePagos--;			
			//DetallePagos detallepagosAux= new DetallePagos();			
			//detallepagosAux.setId(this.iIdNuevoDetallePagos);
			
			if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetallePagos();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
			
			this.detallepagos.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detallepagosLogic.getDetallePagoss().add(this.detallepagosAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detallepagoss.add(this.detallepagosAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetallePagos(false);
			
			this.jTableDatosDetallePagos.setRowSelectionInterval(this.getIndiceNuevoDetallePagos(), this.getIndiceNuevoDetallePagos());
			
			int iLastRow =  this.jTableDatosDetallePagos.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetallePagos.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetallePagos.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetallePagos(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetallePagosActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetallePagos(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePagos(false);
			
			//SI ES MANUAL
			if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePagos();
			}
			
			//this.abrirFrameTreeDetallePagos();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetallePagosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetallePagosActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetallePagos.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetallePagos.setFileImportacion(this.jInternalFrameImportacionDetallePagos.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetallePagos.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetallePagos.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetallePagos.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetallePagos.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetallePagosActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();		

		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetallePagosBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetallePagosBaseDesign.jrxml";
			
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
			
			this.generarReporteDetallePagoss("Todos",detallepagossSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePagosConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagosConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talFacturas_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talFacturas_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talFacturas_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talFacturas_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALABONOS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talAbonos_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talAbonos_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talAbonos_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talAbonos_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talFacturasActual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talFacturasActual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talFacturasActual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talFacturasActual_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_onosAnterior_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_onosAnterior_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_onosAnterior_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_onosAnterior_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_onosActual_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_onosActual_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_onosActual_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_onosActual_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetallePagos.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetallePagosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case DetallePagosConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS:
					sNombreCampoCategoria="total_facturas";
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALABONOS:
					sNombreCampoCategoria="total_abonos";
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					sNombreCampoCategoria="total_facturas_actual";
					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR:
					sNombreCampoCategoria="abonos_anterior";
					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL:
					sNombreCampoCategoria="abonos_actual";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetallePagosConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case DetallePagosConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS:
					sNombreCampoCategoriaValor="total_facturas";
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALABONOS:
					sNombreCampoCategoriaValor="total_abonos";
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					sNombreCampoCategoriaValor="total_facturas_actual";
					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR:
					sNombreCampoCategoriaValor="abonos_anterior";
					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL:
					sNombreCampoCategoriaValor="abonos_actual";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetallePagosConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case DetallePagosConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Facturas",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_facturas");
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALABONOS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Abonos",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_abonos");
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Facturas Actual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_facturas_actual");
					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Abonos Anterior",sNombreCampoCategoria,sNombreCampoCategoriaValor,"abonos_anterior");
					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Abonos Actual",sNombreCampoCategoria,sNombreCampoCategoriaValor,"abonos_actual");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetallePagosActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();		
		
		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagos";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetallePagoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetallePagosConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getgrupocliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_IDZONA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_IDZONA);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getzona_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getfecha_emision_desde());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getfecha_emision_hasta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_RUC);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.gettotal_facturas());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALABONOS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_TOTALABONOS);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.gettotal_abonos());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.gettotal_facturas_actual());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getabonos_anterior());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL);
					iRow++;

					for(DetallePagos detallepagos:detallepagossSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detallepagos.getabonos_actual());
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
			//	this.getFilaCabeceraExportarExcelDetallePagos(row);				
			//	iRow++;
			//}				
			
			//for(DetallePagos detallepagosAux:detallepagossSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetallePagos(detallepagosAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pagos",JOptionPane.INFORMATION_MESSAGE);
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
				this.detallepagosLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePagos(false);
			
			//SI ES MANUAL
			if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetallePagos();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetallePagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePagos(false);
			
			//SI ES MANUAL
			if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePagos();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetallePagosActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetallePagos(false);
			
			//SI ES MANUAL
			if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetallePagos();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetallePagos() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetallePagos.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetallePagos.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetallePagos.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetallePagos.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetallePagos.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetallePagos.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetallePagos.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetallePagos(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetallePagos(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetallePagos(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetallePagos(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetallePagos(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetallePagos(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePagos(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetallePagos(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetallePagosJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetallePagos() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetallePagos();
		
		this.inicializarActualizarBindingBotonesManualDetallePagos(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePagos();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetallePagos() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePagos(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePagos(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetallePagos.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetallePagos.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetallePagos.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetallePagos!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetallePagos.jCheckBoxPostAccionNuevoDetallePagos.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetallePagos.jCheckBoxPostAccionSinCerrarDetallePagos.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetallePagos.jCheckBoxPostAccionSinMensajeDetallePagos.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetallePagos.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetallePagos.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetallePagos.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetallePagos!=null) {
				this.jInternalFrameDetalleFormDetallePagos.jCheckBoxPostAccionNuevoDetallePagos.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetallePagos.jCheckBoxPostAccionSinCerrarDetallePagos.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetallePagos.jCheckBoxPostAccionSinMensajeDetallePagos.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetallePagos.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetallePagos.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetallePagos.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetallePagos!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetallePagos.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetallePagos.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetallePagos.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetallePagos.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetallePagos!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetallePagos.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetallePagos.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetallePagos(Boolean esInicializar) throws Exception {
		try	{	
			if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetallePagos(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetallePagos() throws Exception {
		try	{
			if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePagos();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePagos() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetallePagos() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetallePagos.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetallePagos.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetallePagos.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetallePagos.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetallePagos.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetallePagos.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetallePagos.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetallePagos.addItem(reporte);
			}
			
			
			if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetallePagos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetallePagos.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetallePagos.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetallePagos.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetallePagos.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetallePagos.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetallePagos.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetallePagos.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetallePagos.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePagos();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetallePagos() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePagos!=null) {
				this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetallePagos!=null) {
				this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetallePagos!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetallePagos.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagos.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePagos.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=DetallePagosConstantesFunciones.getTiposSeleccionarDetallePagos(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=DetallePagosConstantesFunciones.getTiposSeleccionarDetallePagos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=DetallePagosConstantesFunciones.getTiposSeleccionarDetallePagos(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetallePagos.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoDetallePagos.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetallePagos()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.getSelectedItem()!=null){this.id_grupo_clienteBusquedaDetallePagos=((GrupoCliente)this.jComboBoxid_grupo_clienteBusquedaDetallePagosDetallePagos.getSelectedItem()).getId();}
		if(this.jComboBoxid_zonaBusquedaDetallePagosDetallePagos.getSelectedItem()!=null){this.id_zonaBusquedaDetallePagos=((Zona)this.jComboBoxid_zonaBusquedaDetallePagosDetallePagos.getSelectedItem()).getId();}
		this.fecha_emision_desdeBusquedaDetallePagos=new Date(this.jDateChooserfecha_emision_desdeBusquedaDetallePagosDetallePagos.getDate().getTime());
		this.fecha_emision_hastaBusquedaDetallePagos=new Date(this.jDateChooserfecha_emision_hastaBusquedaDetallePagosDetallePagos.getDate().getTime());
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetallePagos(Boolean esInicializar) throws Exception {				
		if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetallePagos();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetallePagos() throws Exception {
		this.inicializarActualizarBindingTablaDetallePagos(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetallePagos() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetallePagosOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagosOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetallePagos(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detallepagosLogic.getDetallePagoss().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detallepagoss.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetallePagos.setModel(new DetallePagosModel(this.detallepagosLogic.getDetallePagoss(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetallePagos.setModel(new DetallePagosModel(this.detallepagoss,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetallePagos!=null && this.jInternalFrameOrderByDetallePagos.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetallePagos();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetallePagosConstantesFunciones.SCLASSWEBTITULO,detallepagosConstantesFunciones.resaltarSeleccionarDetallePagos,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetallePagosConstantesFunciones.SCLASSWEBTITULO,detallepagosConstantesFunciones.resaltarSeleccionarDetallePagos,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_ID));

		if(this.detallepagosConstantesFunciones.mostraridDetallePagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagosConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagosConstantesFunciones.resaltaridDetallePagos,this.detallepagosConstantesFunciones.activaridDetallePagos,iSizeTabla,this,true,"idDetallePagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagosConstantesFunciones.resaltaridDetallePagos,this.detallepagosConstantesFunciones.activaridDetallePagos,this,true,"idDetallePagos","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_CODIGO));

		if(this.detallepagosConstantesFunciones.mostrarcodigoDetallePagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagosConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallepagosConstantesFunciones.resaltarcodigoDetallePagos,this.detallepagosConstantesFunciones.activarcodigoDetallePagos,iSizeTabla,this,true,"codigoDetallePagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagosConstantesFunciones.resaltarcodigoDetallePagos,this.detallepagosConstantesFunciones.activarcodigoDetallePagos,this,true,"codigoDetallePagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.detallepagosConstantesFunciones.mostrarnombre_clienteDetallePagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallepagosConstantesFunciones.resaltarnombre_clienteDetallePagos,this.detallepagosConstantesFunciones.activarnombre_clienteDetallePagos,iSizeTabla,this,true,"nombre_clienteDetallePagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagosConstantesFunciones.resaltarnombre_clienteDetallePagos,this.detallepagosConstantesFunciones.activarnombre_clienteDetallePagos,this,true,"nombre_clienteDetallePagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_RUC));

		if(this.detallepagosConstantesFunciones.mostrarrucDetallePagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagosConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detallepagosConstantesFunciones.resaltarrucDetallePagos,this.detallepagosConstantesFunciones.activarrucDetallePagos,iSizeTabla,this,true,"rucDetallePagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagosConstantesFunciones.resaltarrucDetallePagos,this.detallepagosConstantesFunciones.activarrucDetallePagos,this,true,"rucDetallePagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS));

		if(this.detallepagosConstantesFunciones.mostrartotal_facturasDetallePagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagosConstantesFunciones.resaltartotal_facturasDetallePagos,this.detallepagosConstantesFunciones.activartotal_facturasDetallePagos,iSizeTabla,this,true,"total_facturasDetallePagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagosConstantesFunciones.resaltartotal_facturasDetallePagos,this.detallepagosConstantesFunciones.activartotal_facturasDetallePagos,this,true,"total_facturasDetallePagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_TOTALABONOS));

		if(this.detallepagosConstantesFunciones.mostrartotal_abonosDetallePagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagosConstantesFunciones.LABEL_TOTALABONOS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagosConstantesFunciones.resaltartotal_abonosDetallePagos,this.detallepagosConstantesFunciones.activartotal_abonosDetallePagos,iSizeTabla,this,true,"total_abonosDetallePagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagosConstantesFunciones.resaltartotal_abonosDetallePagos,this.detallepagosConstantesFunciones.activartotal_abonosDetallePagos,this,true,"total_abonosDetallePagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL));

		if(this.detallepagosConstantesFunciones.mostrartotal_facturas_actualDetallePagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagosConstantesFunciones.resaltartotal_facturas_actualDetallePagos,this.detallepagosConstantesFunciones.activartotal_facturas_actualDetallePagos,iSizeTabla,this,true,"total_facturas_actualDetallePagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagosConstantesFunciones.resaltartotal_facturas_actualDetallePagos,this.detallepagosConstantesFunciones.activartotal_facturas_actualDetallePagos,this,true,"total_facturas_actualDetallePagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR));

		if(this.detallepagosConstantesFunciones.mostrarabonos_anteriorDetallePagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagosConstantesFunciones.resaltarabonos_anteriorDetallePagos,this.detallepagosConstantesFunciones.activarabonos_anteriorDetallePagos,iSizeTabla,this,true,"abonos_anteriorDetallePagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagosConstantesFunciones.resaltarabonos_anteriorDetallePagos,this.detallepagosConstantesFunciones.activarabonos_anteriorDetallePagos,this,true,"abonos_anteriorDetallePagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL));

		if(this.detallepagosConstantesFunciones.mostrarabonos_actualDetallePagos && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detallepagosConstantesFunciones.resaltarabonos_actualDetallePagos,this.detallepagosConstantesFunciones.activarabonos_actualDetallePagos,iSizeTabla,this,true,"abonos_actualDetallePagos","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detallepagosConstantesFunciones.resaltarabonos_actualDetallePagos,this.detallepagosConstantesFunciones.activarabonos_actualDetallePagos,this,true,"abonos_actualDetallePagos","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetallePagosPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detallepagosSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallepagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallepagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePagos.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detallepagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detallepagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetallePagos.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetallePagos && this.isPermisoGuardarCambiosDetallePagos) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detallepagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detallepagosSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetallePagos.addColumn(tableColumn);
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
			
			this.jTableDatosDetallePagos.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePagos && this.isPermisoGuardarCambiosDetallePagos) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetallePagos && this.isPermisoGuardarCambiosDetallePagos) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetallePagos.moveColumn(this.jTableDatosDetallePagos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetallePagos.moveColumn(this.jTableDatosDetallePagos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetallePagos.moveColumn(this.jTableDatosDetallePagos.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetallePagos.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetallePagos.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetallePagos,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetallePagos.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetallePagos.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetallePagos.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetallePagos.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetallePagos.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							//iSize=detallepagosLogic.getDetallePagoss().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detallepagoss.size()-1;
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
		//this.jTableDatosDetallePagos.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetallePagos.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetallePagos();
			
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
				
				//this.isEsNuevoDetallePagos=false;
					
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
				if(this.detallepagosSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetallePagos==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePagos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePagos.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detallepagos.getsType().equals("DUPLICADO")
				   || this.detallepagos.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetallePagos=true;
				
				} else {
					this.isEsNuevoDetallePagos=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detallepagosSessionBean.getEsGuardarRelacionado()) {
					if(this.detallepagos.getId()>=0 && !this.detallepagos.getIsNew()) {						
						this.isEsNuevoDetallePagos=false;
						
					} else {
						this.isEsNuevoDetallePagos=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetallePagos(esRelaciones);						
				
				this.seleccionarDetallePagos(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detallepagos.getId()<0) {
					this.isEsNuevoDetallePagos=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetallePagos(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetallePagos(evt,rowIndex);
				}	
				
				if(this.detallepagosSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetallePagos: " + this.dDif); 
					}
				}								
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetallePagos(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detallepagos)) {
					if(this.detallepagos.getId()>0) {
						this.detallepagos.setIsDeleted(true);
						
						this.detallepagossEliminados.add(this.detallepagos);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detallepagosLogic.getDetallePagoss().remove(this.detallepagos);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detallepagoss.remove(this.detallepagos);				
					}
					
					
					((DetallePagosModel) this.jTableDatosDetallePagos.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetallePagos(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetallePagos(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetallePagos) {
			
			if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetallePagos.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetallePagos.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetallePagos(this.detallepagos);
				}
				
				//ARCHITECTURE
				try {
					
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetallePagos("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetallePagos(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetallePagos() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePagos(DetallePagos detallepagos) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetallePagos(detallepagos,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetallePagos(DetallePagos detallepagos,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetallePagos(detallepagos);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetallePagos(detallepagos,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetallePagos(detallepagos);
	}
	
	public void setVariablesObjetoActualToFormularioDetallePagos(DetallePagos detallepagos) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.setText(detallepagos.getId().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldcodigoDetallePagos.setText(detallepagos.getcodigo());
			this.jInternalFrameDetalleFormDetallePagos.jTextAreanombre_clienteDetallePagos.setText(detallepagos.getnombre_cliente());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldrucDetallePagos.setText(detallepagos.getruc());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturasDetallePagos.setText(detallepagos.gettotal_facturas().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_abonosDetallePagos.setText(detallepagos.gettotal_abonos().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturas_actualDetallePagos.setText(detallepagos.gettotal_facturas_actual().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_anteriorDetallePagos.setText(detallepagos.getabonos_anterior().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_actualDetallePagos.setText(detallepagos.getabonos_actual().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetallePagos detallepagosLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detallepagosLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetallePagos detallepagosLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detallepagosLocal=this.detallepagos;
			} else {
				detallepagosLocal=this.detallepagosAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detallepagosLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetallePagos(detallepagosLocal,true);
					
					if(detallepagosSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detallepagosLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detallepagosSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detallepagosLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetallePagos(DetallePagos detallepagos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePagos(detallepagos,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(detallepagos);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePagos(DetallePagos detallepagos,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetallePagos(detallepagos,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetallePagos(DetallePagos detallepagos,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.getText()==null || this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.getText()=="" || this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.getText()=="Id") {
				this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.setText("0");
			}

			if(conColumnasBase) {detallepagos.setId(Long.parseLong(this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagosConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelIdDetallePagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepagos.setcodigo(this.jInternalFrameDetalleFormDetallePagos.jTextFieldcodigoDetallePagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagosConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelcodigoDetallePagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepagos.setnombre_cliente(this.jInternalFrameDetalleFormDetallePagos.jTextAreanombre_clienteDetallePagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelnombre_clienteDetallePagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepagos.setruc(this.jInternalFrameDetalleFormDetallePagos.jTextFieldrucDetallePagos.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagosConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelrucDetallePagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepagos.settotal_facturas(Double.parseDouble(this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturasDetallePagos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabeltotal_facturasDetallePagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepagos.settotal_abonos(Double.parseDouble(this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_abonosDetallePagos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagosConstantesFunciones.LABEL_TOTALABONOS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabeltotal_abonosDetallePagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepagos.settotal_facturas_actual(Double.parseDouble(this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturas_actualDetallePagos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabeltotal_facturas_actualDetallePagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepagos.setabonos_anterior(Double.parseDouble(this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_anteriorDetallePagos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelabonos_anteriorDetallePagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detallepagos.setabonos_actual(Double.parseDouble(this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_actualDetallePagos.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetallePagos.jLabelabonos_actualDetallePagos,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetallePagos(DetallePagos detallepagosBean,DetallePagos detallepagos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetallePagos(DetallePagos detallepagosOrigen,DetallePagos detallepagos,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallepagosOrigen.getId()!=null && !detallepagosOrigen.getId().equals(0L))) {detallepagos.setId(detallepagosOrigen.getId());}}
			if(conDefault || (!conDefault && detallepagosOrigen.getfecha_emision_desde()!=null && !detallepagosOrigen.getfecha_emision_desde().equals(new Date()))) {detallepagos.setfecha_emision_desde(detallepagosOrigen.getfecha_emision_desde());}
			if(conDefault || (!conDefault && detallepagosOrigen.getfecha_emision_hasta()!=null && !detallepagosOrigen.getfecha_emision_hasta().equals(new Date()))) {detallepagos.setfecha_emision_hasta(detallepagosOrigen.getfecha_emision_hasta());}
			if(conDefault || (!conDefault && detallepagosOrigen.getcodigo()!=null && !detallepagosOrigen.getcodigo().equals(""))) {detallepagos.setcodigo(detallepagosOrigen.getcodigo());}
			if(conDefault || (!conDefault && detallepagosOrigen.getnombre_cliente()!=null && !detallepagosOrigen.getnombre_cliente().equals(""))) {detallepagos.setnombre_cliente(detallepagosOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && detallepagosOrigen.getruc()!=null && !detallepagosOrigen.getruc().equals(""))) {detallepagos.setruc(detallepagosOrigen.getruc());}
			if(conDefault || (!conDefault && detallepagosOrigen.gettotal_facturas()!=null && !detallepagosOrigen.gettotal_facturas().equals(0.0))) {detallepagos.settotal_facturas(detallepagosOrigen.gettotal_facturas());}
			if(conDefault || (!conDefault && detallepagosOrigen.gettotal_abonos()!=null && !detallepagosOrigen.gettotal_abonos().equals(0.0))) {detallepagos.settotal_abonos(detallepagosOrigen.gettotal_abonos());}
			if(conDefault || (!conDefault && detallepagosOrigen.gettotal_facturas_actual()!=null && !detallepagosOrigen.gettotal_facturas_actual().equals(0.0))) {detallepagos.settotal_facturas_actual(detallepagosOrigen.gettotal_facturas_actual());}
			if(conDefault || (!conDefault && detallepagosOrigen.getabonos_anterior()!=null && !detallepagosOrigen.getabonos_anterior().equals(0.0))) {detallepagos.setabonos_anterior(detallepagosOrigen.getabonos_anterior());}
			if(conDefault || (!conDefault && detallepagosOrigen.getabonos_actual()!=null && !detallepagosOrigen.getabonos_actual().equals(0.0))) {detallepagos.setabonos_actual(detallepagosOrigen.getabonos_actual());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePagos(DetallePagos detallepagos) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.setText(detallepagos.getId().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldcodigoDetallePagos.setText(detallepagos.getcodigo());
			this.jInternalFrameDetalleFormDetallePagos.jTextAreanombre_clienteDetallePagos.setText(detallepagos.getnombre_cliente());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldrucDetallePagos.setText(detallepagos.getruc());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturasDetallePagos.setText(detallepagos.gettotal_facturas().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_abonosDetallePagos.setText(detallepagos.gettotal_abonos().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturas_actualDetallePagos.setText(detallepagos.gettotal_facturas_actual().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_anteriorDetallePagos.setText(detallepagos.getabonos_anterior().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_actualDetallePagos.setText(detallepagos.getabonos_actual().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetallePagos(DetallePagosBean detallepagosBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.setText(detallepagosBean.getId().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldcodigoDetallePagos.setText(detallepagosBean.getcodigo());
			this.jInternalFrameDetalleFormDetallePagos.jTextAreanombre_clienteDetallePagos.setText(detallepagosBean.getnombre_cliente());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldrucDetallePagos.setText(detallepagosBean.getruc());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturasDetallePagos.setText(detallepagosBean.gettotal_facturas().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_abonosDetallePagos.setText(detallepagosBean.gettotal_abonos().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturas_actualDetallePagos.setText(detallepagosBean.gettotal_facturas_actual().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_anteriorDetallePagos.setText(detallepagosBean.getabonos_anterior().toString());
			this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_actualDetallePagos.setText(detallepagosBean.getabonos_actual().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetallePagos(DetallePagosParameterReturnGeneral detallepagosReturnGeneral,DetallePagosBean detallepagosBean,Boolean conDefault) throws Exception { 
		try {
			DetallePagos detallepagosLocal=new DetallePagos();
			
			detallepagosLocal=detallepagosReturnGeneral.getDetallePagos();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detallepagosLocal.getId()!=null && !detallepagosLocal.getId().equals(0L))) {detallepagosBean.setId(detallepagosLocal.getId());}}
			if(conDefault || (!conDefault && detallepagosLocal.getcodigo()!=null && !detallepagosLocal.getcodigo().equals(""))) {detallepagosBean.setcodigo(detallepagosLocal.getcodigo());}
			if(conDefault || (!conDefault && detallepagosLocal.getnombre_cliente()!=null && !detallepagosLocal.getnombre_cliente().equals(""))) {detallepagosBean.setnombre_cliente(detallepagosLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && detallepagosLocal.getruc()!=null && !detallepagosLocal.getruc().equals(""))) {detallepagosBean.setruc(detallepagosLocal.getruc());}
			if(conDefault || (!conDefault && detallepagosLocal.gettotal_facturas()!=null && !detallepagosLocal.gettotal_facturas().equals(0.0))) {detallepagosBean.settotal_facturas(detallepagosLocal.gettotal_facturas());}
			if(conDefault || (!conDefault && detallepagosLocal.gettotal_abonos()!=null && !detallepagosLocal.gettotal_abonos().equals(0.0))) {detallepagosBean.settotal_abonos(detallepagosLocal.gettotal_abonos());}
			if(conDefault || (!conDefault && detallepagosLocal.gettotal_facturas_actual()!=null && !detallepagosLocal.gettotal_facturas_actual().equals(0.0))) {detallepagosBean.settotal_facturas_actual(detallepagosLocal.gettotal_facturas_actual());}
			if(conDefault || (!conDefault && detallepagosLocal.getabonos_anterior()!=null && !detallepagosLocal.getabonos_anterior().equals(0.0))) {detallepagosBean.setabonos_anterior(detallepagosLocal.getabonos_anterior());}
			if(conDefault || (!conDefault && detallepagosLocal.getabonos_actual()!=null && !detallepagosLocal.getabonos_actual().equals(0.0))) {detallepagosBean.setabonos_actual(detallepagosLocal.getabonos_actual());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetallePagosGenerico(Long idDetallePagosSeleccionado,JComboBox jComboBoxDetallePagos,List<DetallePagos> detallepagossLocal)throws Exception {
		try {
			DetallePagos  detallepagosTemp=null;

			for(DetallePagos detallepagosAux:detallepagossLocal) {
				if(detallepagosAux.getId()!=null && detallepagosAux.getId().equals(idDetallePagosSeleccionado)) {
					detallepagosTemp=detallepagosAux;
					break;
				}
			}

			jComboBoxDetallePagos.setSelectedItem(detallepagosTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetallePagosGenerico(JComboBox jComboBoxDetallePagos,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePagos.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetallePagos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetallePagos.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetallePagos.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetallePagos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetallePagos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepagos=(DetallePagos) detallepagosLogic.getDetallePagoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallepagos =(DetallePagos) detallepagoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detallepagos.getIsNew() && !detallepagos.getIsChanged() && !detallepagos.getIsDeleted()) {
				sDescripcion=detallepagos.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagos.getempresa_descripcion();
			}
		}

		if(sTipo.equals("GrupoCliente")) {
			//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
			if(!detallepagos.getIsNew() && !detallepagos.getIsChanged() && !detallepagos.getIsDeleted()) {
				sDescripcion=detallepagos.getgrupocliente_descripcion();
			} else {
				//sDescripcion=this.getActualGrupoClienteForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagos.getgrupocliente_descripcion();
			}
		}

		if(sTipo.equals("Zona")) {
			//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
			if(!detallepagos.getIsNew() && !detallepagos.getIsChanged() && !detallepagos.getIsDeleted()) {
				sDescripcion=detallepagos.getzona_descripcion();
			} else {
				//sDescripcion=this.getActualZonaForeignKeyDescripcion((Long)value);
				sDescripcion=detallepagos.getzona_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetallePagos detallepagosRow=new DetallePagos();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepagosRow=(DetallePagos) detallepagosLogic.getDetallePagoss().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detallepagosRow=(DetallePagos) detallepagoss.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetallePagos(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetallePagos.setVisible((this.isVisibilidadCeldaNuevoDetallePagos && this.isPermisoNuevoDetallePagos));			
			this.jButtonDuplicarDetallePagos.setVisible((this.isVisibilidadCeldaDuplicarDetallePagos && this.isPermisoDuplicarDetallePagos));			
			this.jButtonCopiarDetallePagos.setVisible((this.isVisibilidadCeldaCopiarDetallePagos && this.isPermisoCopiarDetallePagos));
			this.jButtonVerFormDetallePagos.setVisible((this.isVisibilidadCeldaVerFormDetallePagos && this.isPermisoVerFormDetallePagos));
			
			this.jButtonAbrirOrderByDetallePagos.setVisible((this.isVisibilidadCeldaOrdenDetallePagos && this.isPermisoOrdenDetallePagos));			
			
			this.jButtonNuevoRelacionesDetallePagos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePagos && this.isPermisoNuevoDetallePagos));			
			this.jButtonNuevoGuardarCambiosDetallePagos.setVisible((this.isVisibilidadCeldaNuevoDetallePagos && this.isPermisoNuevoDetallePagos && this.isPermisoGuardarCambiosDetallePagos));
			
			if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonModificarDetallePagos.setVisible((this.isVisibilidadCeldaModificarDetallePagos && this.isPermisoActualizarDetallePagos));	
			this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarDetallePagos.setVisible((this.isVisibilidadCeldaActualizarDetallePagos && this.isPermisoActualizarDetallePagos));	
			this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarDetallePagos.setVisible((this.isVisibilidadCeldaEliminarDetallePagos && this.isPermisoEliminarDetallePagos));
			this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarDetallePagos.setVisible(this.isVisibilidadCeldaCancelarDetallePagos);							
			this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosDetallePagos.setVisible((this.isVisibilidadCeldaGuardarDetallePagos && this.isPermisoGuardarCambiosDetallePagos));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetallePagos.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePagos && this.isPermisoGuardarCambiosDetallePagos));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetallePagos.setVisible((this.isVisibilidadCeldaNuevoDetallePagos && this.isPermisoNuevoDetallePagos));						
			this.jButtonDuplicarToolBarDetallePagos.setVisible((this.isVisibilidadCeldaDuplicarDetallePagos && this.isPermisoDuplicarDetallePagos));						
			this.jButtonCopiarToolBarDetallePagos.setVisible((this.isVisibilidadCeldaCopiarDetallePagos && this.isPermisoCopiarDetallePagos));			
			this.jButtonVerFormToolBarDetallePagos.setVisible((this.isVisibilidadCeldaVerFormDetallePagos && this.isPermisoVerFormDetallePagos));			
			this.jButtonAbrirOrderByToolBarDetallePagos.setVisible((this.isVisibilidadCeldaOrdenDetallePagos && this.isPermisoOrdenDetallePagos));
			this.jButtonNuevoRelacionesToolBarDetallePagos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePagos && this.isPermisoNuevoDetallePagos));			
			this.jButtonNuevoGuardarCambiosToolBarDetallePagos.setVisible((this.isVisibilidadCeldaNuevoDetallePagos && this.isPermisoNuevoDetallePagos && this.isPermisoGuardarCambiosDetallePagos));			
			
			if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonModificarToolBarDetallePagos.setVisible((this.isVisibilidadCeldaModificarDetallePagos && this.isPermisoActualizarDetallePagos));	
			this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarToolBarDetallePagos.setVisible((this.isVisibilidadCeldaActualizarDetallePagos  && this.isPermisoActualizarDetallePagos));	
			this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarToolBarDetallePagos.setVisible((this.isVisibilidadCeldaEliminarDetallePagos && this.isPermisoEliminarDetallePagos));
			this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarToolBarDetallePagos.setVisible(this.isVisibilidadCeldaCancelarDetallePagos);				
			this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosToolBarDetallePagos.setVisible((this.isVisibilidadCeldaGuardarDetallePagos && this.isPermisoGuardarCambiosDetallePagos));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetallePagos.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePagos && this.isPermisoGuardarCambiosDetallePagos));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetallePagos.setVisible((this.isVisibilidadCeldaNuevoDetallePagos && this.isPermisoNuevoDetallePagos));			
			this.jMenuItemDuplicarDetallePagos.setVisible((this.isVisibilidadCeldaDuplicarDetallePagos && this.isPermisoDuplicarDetallePagos));			
			this.jMenuItemCopiarDetallePagos.setVisible((this.isVisibilidadCeldaCopiarDetallePagos && this.isPermisoCopiarDetallePagos));			
			this.jMenuItemVerFormDetallePagos.setVisible((this.isVisibilidadCeldaVerFormDetallePagos && this.isPermisoVerFormDetallePagos));			
			this.jMenuItemAbrirOrderByDetallePagos.setVisible((this.isVisibilidadCeldaOrdenDetallePagos && this.isPermisoOrdenDetallePagos));			
			//this.jMenuItemMostrarOcultarDetallePagos.setVisible((this.isVisibilidadCeldaOrdenDetallePagos && this.isPermisoOrdenDetallePagos));
			this.jMenuItemDetalleAbrirOrderByDetallePagos.setVisible((this.isVisibilidadCeldaOrdenDetallePagos && this.isPermisoOrdenDetallePagos));			
			//this.jMenuItemDetalleMostrarOcultarDetallePagos.setVisible((this.isVisibilidadCeldaOrdenDetallePagos && this.isPermisoOrdenDetallePagos));			
			this.jMenuItemNuevoRelacionesDetallePagos.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetallePagos && this.isPermisoNuevoDetallePagos));			
			this.jMenuItemNuevoGuardarCambiosDetallePagos.setVisible((this.isVisibilidadCeldaNuevoDetallePagos && this.isPermisoNuevoDetallePagos && this.isPermisoGuardarCambiosDetallePagos));									
			
			if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			this.jInternalFrameDetalleFormDetallePagos.jMenuItemModificarDetallePagos.setVisible((this.isVisibilidadCeldaModificarDetallePagos && this.isPermisoActualizarDetallePagos));	
			this.jInternalFrameDetalleFormDetallePagos.jMenuItemActualizarDetallePagos.setVisible((this.isVisibilidadCeldaActualizarDetallePagos && this.isPermisoActualizarDetallePagos));	
			this.jInternalFrameDetalleFormDetallePagos.jMenuItemEliminarDetallePagos.setVisible((this.isVisibilidadCeldaEliminarDetallePagos && this.isPermisoEliminarDetallePagos));
			this.jInternalFrameDetalleFormDetallePagos.jMenuItemCancelarDetallePagos.setVisible(this.isVisibilidadCeldaCancelarDetallePagos);				
			}
			
			this.jMenuItemGuardarCambiosDetallePagos.setVisible((this.isVisibilidadCeldaGuardarDetallePagos && this.isPermisoGuardarCambiosDetallePagos));						
			this.jMenuItemGuardarCambiosTablaDetallePagos.setVisible((this.isVisibilidadCeldaGuardarCambiosDetallePagos && this.isPermisoGuardarCambiosDetallePagos));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetallePagos=this.jButtonNuevoDetallePagos.isVisible();
			this.isVisibilidadCeldaDuplicarDetallePagos=this.jButtonDuplicarDetallePagos.isVisible();
			this.isVisibilidadCeldaCopiarDetallePagos=this.jButtonCopiarDetallePagos.isVisible();
			this.isVisibilidadCeldaVerFormDetallePagos=this.jButtonVerFormDetallePagos.isVisible();
			
			this.isVisibilidadCeldaOrdenDetallePagos=this.jButtonAbrirOrderByDetallePagos.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=this.jButtonNuevoRelacionesDetallePagos.isVisible();
			this.isVisibilidadCeldaModificarDetallePagos=this.jButtonModificarDetallePagos.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			this.isVisibilidadCeldaActualizarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarDetallePagos.isVisible();
			this.isVisibilidadCeldaEliminarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarDetallePagos.isVisible();
			this.isVisibilidadCeldaCancelarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarDetallePagos.isVisible();
			this.isVisibilidadCeldaGuardarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosDetallePagos.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=this.jButtonGuardarCambiosTablaDetallePagos.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetallePagos=this.jButtonNuevoToolBarDetallePagos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=this.jButtonNuevoRelacionesToolBarDetallePagos.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			this.isVisibilidadCeldaModificarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jButtonModificarToolBarDetallePagos.isVisible();
			this.isVisibilidadCeldaActualizarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarToolBarDetallePagos.isVisible();
			this.isVisibilidadCeldaEliminarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarToolBarDetallePagos.isVisible();
			this.isVisibilidadCeldaCancelarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarToolBarDetallePagos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePagos=this.jButtonGuardarCambiosToolBarDetallePagos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=this.jButtonGuardarCambiosTablaToolBarDetallePagos.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetallePagos=this.jMenuItemNuevoDetallePagos.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=this.jMenuItemNuevoRelacionesDetallePagos.isVisible();
			
			if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			this.isVisibilidadCeldaModificarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jMenuItemModificarDetallePagos.isVisible();
			this.isVisibilidadCeldaActualizarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jMenuItemActualizarDetallePagos.isVisible();
			this.isVisibilidadCeldaEliminarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jMenuItemEliminarDetallePagos.isVisible();
			this.isVisibilidadCeldaCancelarDetallePagos=this.jInternalFrameDetalleFormDetallePagos.jMenuItemCancelarDetallePagos.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetallePagos=this.jMenuItemGuardarCambiosDetallePagos.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=this.jMenuItemGuardarCambiosTablaDetallePagos.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetallePagos(Boolean esInicializar) {
		if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detallepagosSessionBean.getConGuardarRelaciones()) {
				//if(this.detallepagosSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePagos();
			}
			
			this.inicializarActualizarBindingBotonesManualDetallePagos(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetallePagos() {
		this.jButtonNuevoDetallePagos.setVisible(this.isPermisoNuevoDetallePagos);			
		this.jButtonDuplicarDetallePagos.setVisible(this.isPermisoDuplicarDetallePagos);			
		this.jButtonCopiarDetallePagos.setVisible(this.isPermisoCopiarDetallePagos);			
		this.jButtonVerFormDetallePagos.setVisible(this.isPermisoVerFormDetallePagos);			
		
		this.jButtonAbrirOrderByDetallePagos.setVisible(this.isPermisoOrdenDetallePagos);					
		
		this.jButtonNuevoRelacionesDetallePagos.setVisible(this.isPermisoNuevoDetallePagos);			
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonModificarDetallePagos.setVisible(this.isPermisoActualizarDetallePagos);	
			this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarDetallePagos.setVisible(this.isPermisoActualizarDetallePagos);	
			this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarDetallePagos.setVisible(this.isPermisoEliminarDetallePagos);
			this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarDetallePagos.setVisible(this.isVisibilidadCeldaCancelarDetallePagos);						
			this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosDetallePagos.setVisible(this.isPermisoGuardarCambiosDetallePagos);							
		}
		
		this.jButtonGuardarCambiosTablaDetallePagos.setVisible(this.isPermisoActualizarDetallePagos);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePagos() {
		this.jInternalFrameDetalleFormDetallePagos.jButtonModificarDetallePagos.setVisible(this.isPermisoActualizarDetallePagos);	
		this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarDetallePagos.setVisible(this.isPermisoActualizarDetallePagos);	
		this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarDetallePagos.setVisible(this.isPermisoEliminarDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarDetallePagos.setVisible(this.isVisibilidadCeldaCancelarDetallePagos);							
		this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosDetallePagos.setVisible((this.isVisibilidadCeldaGuardarDetallePagos && this.isPermisoGuardarCambiosDetallePagos));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetallePagos() {
		if(DetallePagosJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetallePagos();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetallePagos() {
	}
	
	public void jTableDatosDetallePagosListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetallePagos(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detallepagos.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetallePagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetallePagos(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detallepagosLogic.getConnexion());

				if(this.detallepagos.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detallepagos.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagos=(TitledBorder)this.jScrollPanelDatosDetallePagos.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetallePagos.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detallepagos.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_grupo_clienteDetallePagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisogrupocliente=true;

			idTienePermisogrupocliente=this.tienePermisosUsuarioEnPaginaWebDetallePagos(GrupoClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisogrupocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);

				this.grupoclienteBeanSwingJInternalFrame=new GrupoClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.grupoclienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.grupoclienteBeanSwingJInternalFrame.getGrupoClienteLogic().setConnexion(this.detallepagosLogic.getConnexion());

				if(this.detallepagos.getid_grupo_cliente()!=null) {
					this.grupoclienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.grupoclienteBeanSwingJInternalFrame.setIdActual(this.detallepagos.getid_grupo_cliente());
					this.grupoclienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.grupoclienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaGrupoCliente();
				}

				JInternalFrameBase jinternalFrame =this.grupoclienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagos=(TitledBorder)this.jScrollPanelDatosDetallePagos.getBorder();
				TitledBorder titledBordergrupocliente=(TitledBorder)this.grupoclienteBeanSwingJInternalFrame.jScrollPanelDatosGrupoCliente.getBorder();

				titledBordergrupocliente.setTitle(titledBorderDetallePagos.getTitle() + " -> Grupo Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_grupo_clienteDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getid_grupo_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_grupo_cliente = "+this.detallepagos.getid_grupo_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_zonaDetallePagosUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisozona=true;

			idTienePermisozona=this.tienePermisosUsuarioEnPaginaWebDetallePagos(ZonaConstantesFunciones.CLASSNAME);

			if(idTienePermisozona) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetallePagos.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetallePagos.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);

				this.zonaBeanSwingJInternalFrame=new ZonaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.zonaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.zonaBeanSwingJInternalFrame.getZonaLogic().setConnexion(this.detallepagosLogic.getConnexion());

				if(this.detallepagos.getid_zona()!=null) {
					this.zonaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.zonaBeanSwingJInternalFrame.setIdActual(this.detallepagos.getid_zona());
					this.zonaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.zonaBeanSwingJInternalFrame.inicializarActualizarBindingTablaZona();
				}

				JInternalFrameBase jinternalFrame =this.zonaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetallePagos=(TitledBorder)this.jScrollPanelDatosDetallePagos.getBorder();
				TitledBorder titledBorderzona=(TitledBorder)this.zonaBeanSwingJInternalFrame.jScrollPanelDatosZona.getBorder();

				titledBorderzona.setTitle(titledBorderDetallePagos.getTitle() + " -> Zona");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_zonaDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getid_zona()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_zona = "+this.detallepagos.getid_zona().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_desdeDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getfecha_emision_desde()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_desde = '"+Funciones2.getStringPostgresDate(this.detallepagos.getfecha_emision_desde())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emision_hastaDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getfecha_emision_hasta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision_hasta = '"+Funciones2.getStringPostgresDate(this.detallepagos.getfecha_emision_hasta())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.detallepagos.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.detallepagos.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.detallepagos.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_facturasDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.gettotal_facturas()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_facturas = "+this.detallepagos.gettotal_facturas().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_abonosDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.gettotal_abonos()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_abonos = "+this.detallepagos.gettotal_abonos().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_facturas_actualDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.gettotal_facturas_actual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_facturas_actual = "+this.detallepagos.gettotal_facturas_actual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonabonos_anteriorDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getabonos_anterior()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where abonos_anterior = "+this.detallepagos.getabonos_anterior().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonabonos_actualDetallePagosBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.getdetallepagos(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detallepagos==null) {
						this.detallepagos = new DetallePagos();
					}

					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);
				}

				if(this.detallepagos.getabonos_actual()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where abonos_actual = "+this.detallepagos.getabonos_actual().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetallePagos(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaDetallePagosDetallePagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagos(false,false);

			this.getDetallePagossBusquedaDetallePagos();

			this.inicializarActualizarBindingDetallePagos(false);

			//if(DetallePagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaDetallePagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagos(false,false);

			this.getDetallePagossFK_IdEmpresa();

			this.inicializarActualizarBindingDetallePagos(false);

			//if(DetallePagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdGrupoClienteDetallePagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagos(false,false);

			this.getDetallePagossFK_IdGrupoCliente();

			this.inicializarActualizarBindingDetallePagos(false);

			//if(DetallePagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdZonaDetallePagosActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetallePagos(false,false);

			this.getDetallePagossFK_IdZona();

			this.inicializarActualizarBindingDetallePagos(false);

			//if(DetallePagosBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetallePagos(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detallepagosLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetallePagos() {
		if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) {
			this.jInternalFrameDetalleFormDetallePagos.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetallePagos.dispose();
			this.jInternalFrameDetalleFormDetallePagos=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetallePagos!=null) {
			this.jInternalFrameReporteDinamicoDetallePagos.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetallePagos.dispose();
			this.jInternalFrameReporteDinamicoDetallePagos=null;
		}
		
		if(this.jInternalFrameImportacionDetallePagos!=null) {
			this.jInternalFrameImportacionDetallePagos.setVisible(false);	    			
			this.jInternalFrameImportacionDetallePagos.dispose();
			this.jInternalFrameImportacionDetallePagos=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetallePagos();
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetallePagos")) {
				jButtonNuevoDetallePagosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetallePagos")) {
				jButtonDuplicarDetallePagosActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetallePagos")) {
				jButtonCopiarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetallePagos")) {
				jButtonVerFormDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetallePagos")) {
				jButtonNuevoDetallePagosActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetallePagos")) {
				jButtonDuplicarDetallePagosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetallePagos")) {
				jButtonNuevoDetallePagosActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetallePagos")) {
				jButtonDuplicarDetallePagosActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetallePagos")) {
				jButtonNuevoDetallePagosActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetallePagos")) {
				jButtonNuevoDetallePagosActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetallePagos")) {
				jButtonNuevoDetallePagosActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetallePagos")) {
				jButtonModificarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetallePagos")) {
				jButtonModificarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetallePagos")) {
				jButtonModificarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetallePagos")) {
				jButtonActualizarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetallePagos")) {
				jButtonActualizarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetallePagos")) {
				jButtonActualizarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetallePagos")) {
				jButtonEliminarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetallePagos")) {
				jButtonEliminarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetallePagos")) {
				jButtonEliminarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetallePagos")) {
				jButtonCancelarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetallePagos")) {
				jButtonCancelarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetallePagos")) {
				jButtonCancelarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetallePagos")) {
				jButtonCerrarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetallePagos")) {
				jButtonCerrarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetallePagos")) {
				jButtonCerrarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetallePagos")) {
				jButtonMostrarOcultarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetallePagos")) {
				jButtonCancelarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetallePagos")) {
				jButtonGuardarCambiosDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetallePagos")) {
				jButtonGuardarCambiosDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetallePagos")) {
				jButtonCopiarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetallePagos")) {
				jButtonVerFormDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetallePagos")) {
				jButtonGuardarCambiosDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetallePagos")) {
				jButtonCopiarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetallePagos")) {
				jButtonVerFormDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetallePagos")) {
				jButtonGuardarCambiosDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetallePagos")) {
				jButtonGuardarCambiosDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetallePagos")) {
				jButtonGuardarCambiosDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetallePagos")) {
				jButtonRecargarInformacionDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetallePagos")) {
				jButtonRecargarInformacionDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetallePagos")) {
				jButtonRecargarInformacionDetallePagosActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetallePagos")) {
				jButtonAnterioresDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetallePagos")) {
				jButtonAnterioresDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetallePagos")) {
				jButtonAnterioresDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetallePagos")) {
				jButtonSiguientesDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetallePagos")) {
				jButtonSiguientesDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetallePagos")) {
				jButtonSiguientesDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetallePagos") || sTipo.equals("MenuItemDetalleAbrirOrderByDetallePagos")) {
				jButtonAbrirOrderByDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetallePagos") || sTipo.equals("MenuItemDetalleMostrarOcultarDetallePagos")) {
				jButtonMostrarOcultarDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePagos")) {
				jButtonNuevoGuardarCambiosDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetallePagos")) {
				jButtonNuevoGuardarCambiosDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetallePagos")) {
				jButtonNuevoGuardarCambiosDetallePagosActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetallePagos")) {
				jButtonCerrarReporteDinamicoDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetallePagos")) {
				jButtonGenerarReporteDinamicoDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetallePagos")) {
				
				jButtonGenerarExcelReporteDinamicoDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetallePagos")) {
				jButtonCerrarImportacionDetallePagosActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetallePagos")) {
				
				jButtonGenerarImportacionDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetallePagos")) {
				
				jButtonAbrirImportacionDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetallePagos")) {
				jComboBoxTiposAccionesDetallePagosActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetallePagos")) {
				jComboBoxTiposRelacionesDetallePagosActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetallePagos")) {
				jComboBoxTiposAccionesDetallePagosActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetallePagos")) {
				
				jComboBoxTiposSeleccionarDetallePagosActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetallePagos")) {
				jTextFieldValorCampoGeneralDetallePagosActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetallePagos")) {
				jButtonAbrirOrderByDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetallePagos")) {
				jButtonAbrirOrderByDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetallePagos")) {
				jButtonCerrarOrderByDetallePagosActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePagosBusqueda")) {
				this.jButtonidDetallePagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePagosUpdate")) {
				this.jButtonid_empresaDetallePagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePagosBusqueda")) {
				this.jButtonid_empresaDetallePagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteDetallePagosUpdate")) {
				this.jButtonid_grupo_clienteDetallePagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteDetallePagosBusqueda")) {
				this.jButtonid_grupo_clienteDetallePagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaDetallePagosUpdate")) {
				this.jButtonid_zonaDetallePagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaDetallePagosBusqueda")) {
				this.jButtonid_zonaDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeDetallePagosBusqueda")) {
				this.jButtonfecha_emision_desdeDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaDetallePagosBusqueda")) {
				this.jButtonfecha_emision_hastaDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDetallePagosBusqueda")) {
				this.jButtoncodigoDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteDetallePagosBusqueda")) {
				this.jButtonnombre_clienteDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucDetallePagosBusqueda")) {
				this.jButtonrucDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturasDetallePagosBusqueda")) {
				this.jButtontotal_facturasDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_abonosDetallePagosBusqueda")) {
				this.jButtontotal_abonosDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturas_actualDetallePagosBusqueda")) {
				this.jButtontotal_facturas_actualDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abonos_anteriorDetallePagosBusqueda")) {
				this.jButtonabonos_anteriorDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abonos_actualDetallePagosBusqueda")) {
				this.jButtonabonos_actualDetallePagosBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaDetallePagosDetallePagos")) {
				this.jButtonBusquedaDetallePagosDetallePagosActionPerformed(evt);
			}
			
			;
			
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetallePagos();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				


				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetallePagos detallepagosLocal=null;
			
			if(!this.getEsControlTabla()) {
				detallepagosLocal=this.detallepagos;
			} else {
				detallepagosLocal=this.detallepagosAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
							
				
				


				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
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
			
			


			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
								
						
				


				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
								
				
				


				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
							
				
				


				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagosAnterior =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallepagosAnterior =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
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
			
			


			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagosActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
								
				
				


				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagosActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagosActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetallePagos")) {
					jCheckBoxSeleccionarTodosDetallePagosItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetallePagos")) {
					jCheckBoxSeleccionadosDetallePagosItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetallePagos")) {
					
				}
				
				


				
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
												
				
				


				
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagosActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detallepagosAnterior =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detallepagosAnterior =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagosActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
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
			
			


			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetallePagosActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detallepagos);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detallepagos);
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
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
				
				


				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetallePagos.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetallePagos.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetallePagosActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detallepagosAnterior =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetallePagos")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetallePagosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetallePagos.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detallepagos =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detallepagos =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detallepagos);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetallePagos")) {
				
				}
				
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetallePagos")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetallePagos.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetallePagos")) {
			
			}
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetallePagos();
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
			if(sTipo.equals("NuevoDetallePagos")) {
				jButtonNuevoDetallePagosActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetallePagos")) {
				jButtonDuplicarDetallePagosActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetallePagos")) {
				jButtonCopiarDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetallePagos")) {
				jButtonVerFormDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetallePagos")) {
				jButtonNuevoDetallePagosActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetallePagos")) {
				jButtonModificarDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetallePagos")) {
				jButtonActualizarDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetallePagos")) {
				jButtonEliminarDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetallePagos")) {
				jButtonGuardarCambiosDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetallePagos")) {
				jButtonCancelarDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetallePagos")) {
				jButtonCerrarDetallePagosActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetallePagos")) {
				jButtonGuardarCambiosDetallePagosActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetallePagos")) {
				jButtonNuevoGuardarCambiosDetallePagosActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetallePagos")) {
				jButtonAbrirOrderByDetallePagosActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetallePagos")) {
				jButtonRecargarInformacionDetallePagosActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetallePagos")) {
				jButtonAnterioresDetallePagosActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetallePagos")) {
				jButtonSiguientesDetallePagosActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetallePagosBusqueda")) {
				this.jButtonidDetallePagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetallePagosUpdate")) {
				this.jButtonid_empresaDetallePagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetallePagosBusqueda")) {
				this.jButtonid_empresaDetallePagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_grupo_clienteDetallePagosUpdate")) {
				this.jButtonid_grupo_clienteDetallePagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_grupo_clienteDetallePagosBusqueda")) {
				this.jButtonid_grupo_clienteDetallePagosBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_zonaDetallePagosUpdate")) {
				this.jButtonid_zonaDetallePagosUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_zonaDetallePagosBusqueda")) {
				this.jButtonid_zonaDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_desdeDetallePagosBusqueda")) {
				this.jButtonfecha_emision_desdeDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emision_hastaDetallePagosBusqueda")) {
				this.jButtonfecha_emision_hastaDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoDetallePagosBusqueda")) {
				this.jButtoncodigoDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteDetallePagosBusqueda")) {
				this.jButtonnombre_clienteDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucDetallePagosBusqueda")) {
				this.jButtonrucDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturasDetallePagosBusqueda")) {
				this.jButtontotal_facturasDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_abonosDetallePagosBusqueda")) {
				this.jButtontotal_abonosDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturas_actualDetallePagosBusqueda")) {
				this.jButtontotal_facturas_actualDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abonos_anteriorDetallePagosBusqueda")) {
				this.jButtonabonos_anteriorDetallePagosBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("abonos_actualDetallePagosBusqueda")) {
				this.jButtonabonos_actualDetallePagosBusquedaActionPerformed(evt);
			}
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetallePagos();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetallePagos")) {
				closingInternalFrameDetallePagos();
				
			} else if(sTipo.equals("jButtonCancelarDetallePagos")) {
				JInternalFrameBase jInternalFrameDetalleFormDetallePagos = (JInternalFrameBase)evt.getSource();
	            	
	            DetallePagosBeanSwingJInternalFrame jInternalFrameParent=(DetallePagosBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePagos.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetallePagosActionPerformed(null);
			}
			
			DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detallepagos,new Object(),this.detallepagosParameterGeneral,this.detallepagosReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetallePagos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetallePagos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetallePagos(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detallepagos)) {
			if(!esControlTabla) {
				if(DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);			
				}
				
				if(this.detallepagosSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetallePagos(this.detallepagos,classes);				
				}
			
				if(conIrServidorAplicacion) {
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetallePagos(this.detallepagosReturnGeneral,this.detallepagosBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detallepagosSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetallePagos(classes,this.detallepagosReturnGeneral,this.detallepagosBean,false);
					}
						
					if(this.detallepagosReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetallePagos(this.detallepagosReturnGeneral.getDetallePagos());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetallePagos(this.detallepagosReturnGeneral.getDetallePagos());	
					}
						
					if(this.detallepagosReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetallePagos(this.detallepagosReturnGeneral.getDetallePagos(),classes);//this.detallepagosBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetallePagos(this.detallepagos,classes);//this.detallepagosBean);									
				}
			
				if(DetallePagosJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetallePagos(this.detallepagos,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetallePagos(this.detallepagos);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detallepagosAnterior!=null) {
						this.detallepagos=this.detallepagosAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detallepagosSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detallepagosSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detallepagosReturnGeneral.getDetallePagos(),detallepagosLogic.getDetallePagoss());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detallepagosReturnGeneral.getDetallePagos(),this.detallepagoss);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetallePagos.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetallePagos.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetallePagos();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetallePagos() throws Exception {
		
		DetallePagosModel detallepagosModel=(DetallePagosModel)this.jTableDatosDetallePagos.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detallepagosModel.detallepagoss=this.detallepagosLogic.getDetallePagoss();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detallepagosModel.detallepagoss=this.detallepagoss;
		}
		
		
		((DetallePagosModel) this.jTableDatosDetallePagos.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetallePagos() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetallepagosAnterior(),this.detallepagosLogic.getDetallePagoss());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetallepagosAnterior(),this.detallepagoss);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetallePagos();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetallePagos(DetallePagos detallepagos,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
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
										
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepagos,new Object(),generalEntityParameterGeneral,this.detallepagosReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detallepagosSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetallePagosConstantesFunciones.getClassesRelationshipsOfDetallePagos(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetallePagosConstantesFunciones.getClassesRelationshipsFromStringsOfDetallePagos(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetallePagos(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetallePagosBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detallepagos,new Object(),generalEntityParameterGeneral,this.detallepagosReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetallePagos(DetallePagosBean detallepagosBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetallePagos(ArrayList<Classe> classes,DetallePagosReturnGeneral detallepagosReturnGeneral,DetallePagosBean detallepagosBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetallePagos(DetallePagos detallepagos,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detallepagos)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetallePagos = new DetallePagosDetalleFormJInternalFrame(jDesktopPane,this.detallepagosSessionBean.getConGuardarRelaciones(),this.detallepagosSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.setVisible(false);
		this.jInternalFrameDetalleFormDetallePagos.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetallePagos.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetallePagos.detallepagosLogic=this.detallepagosLogic;
		
		this.cargarCombosFrameForeignKeyDetallePagos("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetallePagos();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetallePagos();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetallePagos("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetallePagos();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetallePagos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePagos"));
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonModificarDetallePagos.addActionListener(new ButtonActionListener(this,"ModificarDetallePagos"));

		
		this.jInternalFrameDetalleFormDetallePagos.jButtonModificarToolBarDetallePagos.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePagos"));
					
		this.jInternalFrameDetalleFormDetallePagos.jMenuItemModificarDetallePagos.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePagos"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarDetallePagos.addActionListener (new ButtonActionListener(this,"ActualizarDetallePagos"));
		
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarToolBarDetallePagos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePagos"));
						
		this.jInternalFrameDetalleFormDetallePagos.jMenuItemActualizarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePagos"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarDetallePagos.addActionListener (new ButtonActionListener(this,"EliminarDetallePagos"));
		
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePagos"));
								
		this.jInternalFrameDetalleFormDetallePagos.jMenuItemEliminarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePagos"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarDetallePagos.addActionListener (new ButtonActionListener(this,"CancelarDetallePagos"));
		
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePagos"));
					
		this.jInternalFrameDetalleFormDetallePagos.jMenuItemCancelarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePagos"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetallePagos.jMenuItemDetalleCerrarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePagos"));		
		
		
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePagos"));
		
		
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePagos"));
		
		
		
		this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePagos"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonidDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_empresaDetallePagosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_empresaDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_grupo_clienteDetallePagosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteDetallePagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_grupo_clienteDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteDetallePagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_zonaDetallePagosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaDetallePagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_zonaDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonfecha_emision_desdeDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonfecha_emision_hastaDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtoncodigoDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonnombre_clienteDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonrucDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"rucDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtontotal_facturasDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturasDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtontotal_abonosDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"total_abonosDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtontotal_facturas_actualDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturas_actualDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonabonos_anteriorDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_anteriorDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonabonos_actualDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_actualDetallePagosBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetallePagos.jTabbedPaneRelacionesDetallePagos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePagos"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetallePagos"));
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetallePagos"));
		}
		
		this.jTableDatosDetallePagos.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetallePagos"));
		
		this.jTableDatosDetallePagos.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetallePagos"));
		
		this.jButtonNuevoDetallePagos.addActionListener(new ButtonActionListener(this,"NuevoDetallePagos"));
		
		this.jButtonDuplicarDetallePagos.addActionListener(new ButtonActionListener(this,"DuplicarDetallePagos"));
		
		this.jButtonCopiarDetallePagos.addActionListener(new ButtonActionListener(this,"CopiarDetallePagos"));
		
		this.jButtonVerFormDetallePagos.addActionListener(new ButtonActionListener(this,"VerFormDetallePagos"));
		
		
		this.jButtonNuevoToolBarDetallePagos.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetallePagos"));
			
		this.jButtonDuplicarToolBarDetallePagos.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetallePagos"));
			
		this.jMenuItemNuevoDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetallePagos"));
			
		this.jMenuItemDuplicarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetallePagos"));		
		
		
		this.jButtonNuevoRelacionesDetallePagos.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetallePagos"));
		
		
		this.jButtonNuevoRelacionesToolBarDetallePagos.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetallePagos"));
			
		this.jMenuItemNuevoRelacionesDetallePagos.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetallePagos"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonModificarDetallePagos.addActionListener(new ButtonActionListener(this,"ModificarDetallePagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonModificarToolBarDetallePagos.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetallePagos"));
			
			this.jInternalFrameDetalleFormDetallePagos.jMenuItemModificarDetallePagos.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetallePagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarDetallePagos.addActionListener (new ButtonActionListener(this,"ActualizarDetallePagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonActualizarToolBarDetallePagos.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetallePagos"));
				
			this.jInternalFrameDetalleFormDetallePagos.jMenuItemActualizarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetallePagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarDetallePagos.addActionListener (new ButtonActionListener(this,"EliminarDetallePagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonEliminarToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetallePagos"));
						
			this.jInternalFrameDetalleFormDetallePagos.jMenuItemEliminarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetallePagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarDetallePagos.addActionListener (new ButtonActionListener(this,"CancelarDetallePagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonCancelarToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetallePagos"));
			
			this.jInternalFrameDetalleFormDetallePagos.jMenuItemCancelarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetallePagos"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetallePagos"));		
		
		
		this.jButtonCerrarDetallePagos.addActionListener (new ButtonActionListener(this,"CerrarDetallePagos"));
		
		
		this.jButtonCerrarToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetallePagos"));
			
		this.jMenuItemCerrarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetallePagos"));
			
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jMenuItemDetalleCerrarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetallePagos"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosDetallePagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetallePagos"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetallePagos"));
		}
		
		this.jButtonCopiarToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetallePagos"));
			
		this.jButtonVerFormToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetallePagos"));
		
		this.jMenuItemGuardarCambiosDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetallePagos"));
			
		this.jMenuItemCopiarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetallePagos"));		
		
		this.jMenuItemVerFormDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetallePagos"));		
		
		
		this.jButtonGuardarCambiosTablaDetallePagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePagos"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetallePagos"));
			
		this.jMenuItemGuardarCambiosTablaDetallePagos.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetallePagos"));		
		
		
		
		this.jButtonRecargarInformacionDetallePagos.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetallePagos"));
					
		this.jButtonRecargarInformacionToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetallePagos"));
		
		this.jMenuItemRecargarInformacionDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetallePagos"));		
		
		
		
		this.jButtonAnterioresDetallePagos.addActionListener (new ButtonActionListener(this,"AnterioresDetallePagos"));
		
		
		this.jButtonAnterioresToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetallePagos"));
		
		this.jMenuItemAnterioresDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetallePagos"));		
		
		
		this.jButtonSiguientesDetallePagos.addActionListener (new ButtonActionListener(this,"SiguientesDetallePagos"));
		
		
		this.jButtonSiguientesToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetallePagos"));
			
		this.jMenuItemSiguientesDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetallePagos"));
			
		this.jMenuItemAbrirOrderByDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetallePagos"));
			
		this.jMenuItemMostrarOcultarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetallePagos"));
			
		this.jMenuItemDetalleAbrirOrderByDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetallePagos"));
			
		this.jMenuItemDetalleMostarOcultarDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetallePagos"));		
		
		
		this.jButtonNuevoGuardarCambiosDetallePagos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetallePagos"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetallePagos"));
			
		this.jMenuItemNuevoGuardarCambiosDetallePagos.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetallePagos"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetallePagos.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetallePagos"));

		this.jCheckBoxSeleccionadosDetallePagos.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetallePagos"));
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetallePagos"));
		}
		
		
		this.jComboBoxTiposRelacionesDetallePagos.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetallePagos"));
			
		this.jComboBoxTiposAccionesDetallePagos.addActionListener (new ButtonActionListener(this,"TiposAccionesDetallePagos"));
					
		this.jComboBoxTiposSeleccionarDetallePagos.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetallePagos"));
			
		this.jTextFieldValorCampoGeneralDetallePagos.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetallePagos"));		
		
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonidDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_empresaDetallePagosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_empresaDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_grupo_clienteDetallePagosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteDetallePagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_grupo_clienteDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteDetallePagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_zonaDetallePagosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaDetallePagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_zonaDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonfecha_emision_desdeDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonfecha_emision_hastaDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtoncodigoDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonnombre_clienteDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonrucDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"rucDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtontotal_facturasDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturasDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtontotal_abonosDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"total_abonosDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtontotal_facturas_actualDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturas_actualDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonabonos_anteriorDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_anteriorDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonabonos_actualDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_actualDetallePagosBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaDetallePagosDetallePagos.addActionListener(new ButtonActionListener(this,"BusquedaDetallePagosDetallePagos"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetallePagos!=null) {
				this.jInternalFrameReporteDinamicoDetallePagos.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePagos"));
				this.jInternalFrameReporteDinamicoDetallePagos.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePagos"));
				this.jInternalFrameReporteDinamicoDetallePagos.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePagos"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetallePagos.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetallePagos"));				
			//this.jButtonGenerarReporteDinamicoDetallePagos.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetallePagos"));
			//this.jButtonGenerarExcelReporteDinamicoDetallePagos.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetallePagos"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetallePagos!=null) {
				this.jInternalFrameImportacionDetallePagos.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetallePagos"));
				this.jInternalFrameImportacionDetallePagos.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetallePagos"));
				this.jInternalFrameImportacionDetallePagos.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetallePagos"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetallePagos.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetallePagos"));
			
			this.jButtonAbrirOrderByToolBarDetallePagos.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetallePagos"));			
			
			if(this.jInternalFrameOrderByDetallePagos!=null) {
				this.jInternalFrameOrderByDetallePagos.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetallePagos"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetallePagos!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetallePagos.jTabbedPaneRelacionesDetallePagos.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetallePagos"));
		
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
            		closingInternalFrameDetallePagos();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetallePagos.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetallePagos = (JInternalFrameBase)event.getSource();
	            	
	            DetallePagosBeanSwingJInternalFrame jInternalFrameParent=(DetallePagosBeanSwingJInternalFrame)jInternalFrameDetalleFormDetallePagos.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetallePagosActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetallePagos.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetallePagosListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetallePagos.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetallePagos.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagosActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetallePagos";
		inputMap = this.jButtonNuevoDetallePagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetallePagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePagosActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetallePagosActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetallePagos";
		inputMap = this.jButtonNuevoRelacionesDetallePagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetallePagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetallePagosActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetallePagos";
		inputMap = this.jButtonModificarDetallePagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetallePagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetallePagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetallePagos";
		inputMap = this.jButtonActualizarDetallePagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetallePagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetallePagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetallePagos";
		inputMap = this.jButtonEliminarDetallePagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetallePagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetallePagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetallePagos";
		inputMap = this.jButtonCancelarDetallePagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetallePagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetallePagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetallePagos";
		inputMap = this.jButtonCerrarDetallePagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetallePagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetallePagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetallePagos";
		inputMap = this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosDetallePagos.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetallePagos.jButtonGuardarCambiosDetallePagos.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetallePagosActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetallePagos.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetallePagosItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetallePagos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetallePagosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetallePagos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetallePagosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetallePagos.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetallePagosActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonidDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"idDetallePagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_empresaDetallePagosUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_empresaDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetallePagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_grupo_clienteDetallePagosUpdate.addActionListener(new ButtonActionListener(this,"id_grupo_clienteDetallePagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_grupo_clienteDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"id_grupo_clienteDetallePagosBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_zonaDetallePagosUpdate.addActionListener(new ButtonActionListener(this,"id_zonaDetallePagosUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonid_zonaDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"id_zonaDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonfecha_emision_desdeDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_desdeDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonfecha_emision_hastaDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emision_hastaDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtoncodigoDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"codigoDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonnombre_clienteDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonrucDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"rucDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtontotal_facturasDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturasDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtontotal_abonosDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"total_abonosDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtontotal_facturas_actualDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"total_facturas_actualDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonabonos_anteriorDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_anteriorDetallePagosBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetallePagos.jButtonabonos_actualDetallePagosBusqueda.addActionListener(new ButtonActionListener(this,"abonos_actualDetallePagosBusqueda"));
		
		
		this.jButtonBusquedaDetallePagosDetallePagos.addActionListener(new ButtonActionListener(this,"BusquedaDetallePagosDetallePagos"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetallePagos.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetallePagosActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetallePagosActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetallePagos.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetallePagos(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetallePagos detallepagosAux:this.detallepagosLogic.getDetallePagoss()) {
					detallepagosAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePagos detallepagosAux:detallepagoss) {
					detallepagosAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetallePagosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePagos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePagos detallepagosAux:this.detallepagosLogic.getDetallePagoss()) {
						detallepagosAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePagos detallepagosAux:detallepagoss) {
						detallepagosAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetallePagos detallepagosAux:this.detallepagosLogic.getDetallePagoss()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePagos detallepagosAux:detallepagoss) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePagos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePagos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePagos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetallePagosItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetallePagos(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetallePagos.getSelectedRows();
			
			DetallePagos detallepagosLocal=new DetallePagos();
			
			//this.seleccionarTodosDetallePagos(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detallepagosLocal =(DetallePagos) this.detallepagosLogic.getDetallePagoss().toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detallepagosLocal =(DetallePagos) this.detallepagoss.toArray()[this.jTableDatosDetallePagos.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detallepagosLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetallePagos detallepagosAux:this.detallepagosLogic.getDetallePagoss()) {
						detallepagosAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetallePagos detallepagosAux:detallepagoss) {
						detallepagosAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetallePagos(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetallePagos.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetallePagos.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetallePagos,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetallePagosItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetallePagosParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetallePagosActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetallePagos(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetallePagos.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetallePagos detallepagosAux:this.detallepagosLogic.getDetallePagoss()) {
				
						if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							detallepagosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							detallepagosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							detallepagosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							detallepagosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_RUC)) {
							existe=true;
							detallepagosAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS)) {
							existe=true;
							detallepagosAux.settotal_facturas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_TOTALABONOS)) {
							existe=true;
							detallepagosAux.settotal_abonos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL)) {
							existe=true;
							detallepagosAux.settotal_facturas_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR)) {
							existe=true;
							detallepagosAux.setabonos_anterior(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL)) {
							existe=true;
							detallepagosAux.setabonos_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePagos detallepagosAux:detallepagoss) {
					
						if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
							existe=true;
							detallepagosAux.setfecha_emision_desde(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
							existe=true;
							detallepagosAux.setfecha_emision_hasta(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							detallepagosAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							detallepagosAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_RUC)) {
							existe=true;
							detallepagosAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS)) {
							existe=true;
							detallepagosAux.settotal_facturas(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_TOTALABONOS)) {
							existe=true;
							detallepagosAux.settotal_abonos(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL)) {
							existe=true;
							detallepagosAux.settotal_facturas_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR)) {
							existe=true;
							detallepagosAux.setabonos_anterior(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL)) {
							existe=true;
							detallepagosAux.setabonos_actual(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetallePagos(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetallePagosActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetallePagos(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetallePagos=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetallePagos.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetallePagos) {				
					conSplash=true;//false;										
					
					//this.startProcessDetallePagos(conSplash);
				
					this.generarReporteDetallePagossSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetallePagossSeleccionados();
				//this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePagossSeleccionados(false);
				//this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetallePagossSeleccionados(true);
				//this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePagos();
				
				this.exportarDetallePagossSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetallePagoss();
				//this.importarDetallePagoss();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetallePagos();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetallePagossSeleccionados();
				//this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Pagos", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetallePagos();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetallePagos)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetallePagos(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Pagos",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.setSelectedIndex(0);					
				}	
			} 			
			else if(DetallePagosBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetallePagos) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetallePagos(conSplash);
					
						//this.actualizarParametrosGeneralDetallePagos();
						
						this.generarReporteProcesoAccionDetallePagossSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetallePagosBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle PagosES SELECCIONADOS?", "MANTENIMIENTO DE Detalle Pagos", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetallePagos();
				
						this.actualizarParametrosGeneralDetallePagos();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detallepagosReturnGeneral=detallepagosLogic.procesarAccionDetallePagossWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detallepagosLogic.getDetallePagoss(),this.detallepagosParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetallePagosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetallePagos();
					
					DetallePagosBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetallePagosReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetallePagos.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetallePagos.jComboBoxTiposAccionesFormularioDetallePagos.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetallePagos(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetallePagosActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetallePagos();
			
			if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();		
			DetallePagos detallepagos=new DetallePagos();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetallePagos(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetallePagos.getSelectedItem();
			
			
			
			
			detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
			//this.sTipoAccion;
			
			if(detallepagossSeleccionados.size()==1) {
				for(DetallePagos detallepagosAux:detallepagossSeleccionados) {
					detallepagos=detallepagosAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetallePagos();
			
      		//this.finishProcessDetallePagos(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetallePagosReturnGeneral() throws Exception {
		if(this.detallepagosReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detallepagosReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detallepagosReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detallepagosReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detallepagosReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detallepagosReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetallePagos(false);
		}
		
		if(this.detallepagosReturnGeneral.getConRetornoLista() || this.detallepagosReturnGeneral.getConRetornoObjeto()) {
			if(this.detallepagosReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detallepagosLogic.setDetallePagoss(this.detallepagosReturnGeneral.getDetallePagoss());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			
			this.inicializarActualizarBindingDetallePagos(false);
		}
	}
	
	public void actualizarParametrosGeneralDetallePagos() throws Exception {
		
		
	}
	
	public ArrayList<DetallePagos> getDetallePagossSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetallePagos) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetallePagos detallepagosAux:detallepagosLogic.getDetallePagoss()) {
					if(detallepagosAux.getIsSelected()) {
						detallepagossSeleccionados.add(detallepagosAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetallePagos detallepagosAux:this.detallepagoss) {
					if(detallepagosAux.getIsSelected()) {
						detallepagossSeleccionados.add(detallepagosAux);				
					}
				}
			}
			
			if(detallepagossSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detallepagossSeleccionados.addAll(this.detallepagosLogic.getDetallePagoss());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detallepagossSeleccionados.addAll(this.detallepagoss);				
					}
				}
			}
		} else {
			detallepagossSeleccionados.add(this.detallepagos);
		}
		
		return detallepagossSeleccionados;
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
	
	public void generarReporteDetallePagossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetallePagossSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetallePagossSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePagossSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetallePagossSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Pagos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetallePagossSeleccionados() throws Exception {
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();		
		
		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetallePagoss("Todos",detallepagossSeleccionados);
		
	}	
	
	public void generarReporteNormalDetallePagossSeleccionados() throws Exception {
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();		
		
		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetallePagoss("Todos",detallepagossSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetallePagossSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();
		
		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetallePagoss("Todos",detallepagossSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetallePagossSeleccionados() throws Exception {
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetallePagos();
		
		
		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetallePagos();
		
		
		//this.generarReporteDetallePagoss("Todos",detallepagossSeleccionados ,detallepagosImplementable,detallepagosImplementableHome);
	}
	
	public void mostrarImportacionDetallePagoss() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetallePagos();
		
		this.abrirFrameImportacionDetallePagos();		
		
			
		//this.generarReporteDetallePagoss("Todos",detallepagossSeleccionados ,detallepagosImplementable,detallepagosImplementableHome);
	}
	
	public void importarDetallePagoss() throws Exception {		
	
	}
	
	public void exportarDetallePagossSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetallePagossSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetallePagossSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetallePagossSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Pagos",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetallePagossSeleccionados() throws Exception {
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();		
		
		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagos."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetallePagos(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetallePagos detallepagosAux:detallepagossSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetallePagos(detallepagosAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detallepagosAux.setsDetalleGeneralEntityReporte(detallepagosAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetallePagos(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_IDZONA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_TOTALABONOS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetallePagos(DetallePagos detallepagos,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detallepagos.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getgrupocliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getzona_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getfecha_emision_desde().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getfecha_emision_hasta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.gettotal_facturas().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.gettotal_abonos().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.gettotal_facturas_actual().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getabonos_anterior().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detallepagos.getabonos_actual().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetallePagossSeleccionados() throws Exception {
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();		
		
		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagos.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetallePagoss");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetallePagos(row);				
				iRow++;
			}				
			
			for(DetallePagos detallepagosAux:detallepagossSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetallePagos(detallepagosAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetallePagossSeleccionados() throws Exception {
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();		
		
		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detallepagos.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detallepagoss");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detallepagos");
			//elementRoot.appendChild(element);
		
			for(DetallePagos detallepagosAux:detallepagossSeleccionados) {
				element = document.createElement("detallepagos");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetallePagos(detallepagosAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Pagos",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetallePagos(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_IDZONA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_TOTALFACTURAS);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_TOTALABONOS);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_TOTALFACTURASACTUAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_ABONOSANTERIOR);
		cell = row.createCell(iColumn++);cell.setCellValue(DetallePagosConstantesFunciones.LABEL_ABONOSACTUAL);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetallePagos(DetallePagos detallepagos,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getgrupocliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getzona_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getfecha_emision_desde());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getfecha_emision_hasta());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.gettotal_facturas());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.gettotal_abonos());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.gettotal_facturas_actual());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getabonos_anterior());
		cell = row.createCell(iColumn++);cell.setCellValue(detallepagos.getabonos_actual());				
	}
	
	public void setFilaDatosExportarXmlDetallePagos(DetallePagos detallepagos,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetallePagosConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detallepagos.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetallePagosConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detallepagos.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetallePagosConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detallepagos.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementgrupocliente_descripcion = document.createElement(DetallePagosConstantesFunciones.IDGRUPOCLIENTE);
		elementgrupocliente_descripcion.appendChild(document.createTextNode(detallepagos.getgrupocliente_descripcion()));
		element.appendChild(elementgrupocliente_descripcion);

		Element elementzona_descripcion = document.createElement(DetallePagosConstantesFunciones.IDZONA);
		elementzona_descripcion.appendChild(document.createTextNode(detallepagos.getzona_descripcion()));
		element.appendChild(elementzona_descripcion);

		Element elementfecha_emision_desde = document.createElement(DetallePagosConstantesFunciones.FECHAEMISIONDESDE);
		elementfecha_emision_desde.appendChild(document.createTextNode(detallepagos.getfecha_emision_desde().toString().trim()));
		element.appendChild(elementfecha_emision_desde);

		Element elementfecha_emision_hasta = document.createElement(DetallePagosConstantesFunciones.FECHAEMISIONHASTA);
		elementfecha_emision_hasta.appendChild(document.createTextNode(detallepagos.getfecha_emision_hasta().toString().trim()));
		element.appendChild(elementfecha_emision_hasta);

		Element elementcodigo = document.createElement(DetallePagosConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(detallepagos.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre_cliente = document.createElement(DetallePagosConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(detallepagos.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementruc = document.createElement(DetallePagosConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(detallepagos.getruc().trim()));
		element.appendChild(elementruc);

		Element elementtotal_facturas = document.createElement(DetallePagosConstantesFunciones.TOTALFACTURAS);
		elementtotal_facturas.appendChild(document.createTextNode(detallepagos.gettotal_facturas().toString().trim()));
		element.appendChild(elementtotal_facturas);

		Element elementtotal_abonos = document.createElement(DetallePagosConstantesFunciones.TOTALABONOS);
		elementtotal_abonos.appendChild(document.createTextNode(detallepagos.gettotal_abonos().toString().trim()));
		element.appendChild(elementtotal_abonos);

		Element elementtotal_facturas_actual = document.createElement(DetallePagosConstantesFunciones.TOTALFACTURASACTUAL);
		elementtotal_facturas_actual.appendChild(document.createTextNode(detallepagos.gettotal_facturas_actual().toString().trim()));
		element.appendChild(elementtotal_facturas_actual);

		Element elementabonos_anterior = document.createElement(DetallePagosConstantesFunciones.ABONOSANTERIOR);
		elementabonos_anterior.appendChild(document.createTextNode(detallepagos.getabonos_anterior().toString().trim()));
		element.appendChild(elementabonos_anterior);

		Element elementabonos_actual = document.createElement(DetallePagosConstantesFunciones.ABONOSACTUAL);
		elementabonos_actual.appendChild(document.createTextNode(detallepagos.getabonos_actual().toString().trim()));
		element.appendChild(elementabonos_actual);
	}
	
	public void generarReporteGroupGenericoDetallePagossSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetallePagos> detallepagossSeleccionados=new ArrayList<DetallePagos>();
		
		detallepagossSeleccionados=this.getDetallePagossSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetallePagos(detallepagossSeleccionados);
		
		this.generarReporteDetallePagoss("Todos",detallepagossSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetallePagos(ArrayList<DetallePagos> detallepagossSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetallePagos detallepagosAux:detallepagossSeleccionados) {
				detallepagosAux.setsDetalleGeneralEntityReporte(detallepagosAux.toString());
			
				if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detallepagosAux.setsDescripcionGeneralEntityReporte1(detallepagosAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_IDGRUPOCLIENTE)) {
					existe=true;
					detallepagosAux.setsDescripcionGeneralEntityReporte1(detallepagosAux.getgrupocliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_IDZONA)) {
					existe=true;
					detallepagosAux.setsDescripcionGeneralEntityReporte1(detallepagosAux.getzona_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONDESDE)) {
					existe=true;
					detallepagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(detallepagosAux.getfecha_emision_desde()));
				}
				 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_FECHAEMISIONHASTA)) {
					existe=true;
					detallepagosAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(detallepagosAux.getfecha_emision_hasta()));
				}
				 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					detallepagosAux.setsDescripcionGeneralEntityReporte1(detallepagosAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					detallepagosAux.setsDescripcionGeneralEntityReporte1(detallepagosAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(DetallePagosConstantesFunciones.LABEL_RUC)) {
					existe=true;
					detallepagosAux.setsDescripcionGeneralEntityReporte1(detallepagosAux.getruc());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetallePagosConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetallePagos(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetallePagos=true;
				this.isVisibilidadCeldaNuevoRelacionesDetallePagos=true;
				this.isVisibilidadCeldaGuardarCambiosDetallePagos=true;
			}
			
			this.isVisibilidadCeldaModificarDetallePagos=false;
			this.isVisibilidadCeldaActualizarDetallePagos=false;
			this.isVisibilidadCeldaEliminarDetallePagos=false;
			this.isVisibilidadCeldaCancelarDetallePagos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagos=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetallePagos=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=false;
			this.isVisibilidadCeldaModificarDetallePagos=false;
			this.isVisibilidadCeldaActualizarDetallePagos=true;
			this.isVisibilidadCeldaEliminarDetallePagos=false;
			this.isVisibilidadCeldaCancelarDetallePagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagos=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetallePagos=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=false;
			this.isVisibilidadCeldaModificarDetallePagos=false;
			this.isVisibilidadCeldaActualizarDetallePagos=true;
			this.isVisibilidadCeldaEliminarDetallePagos=true;
			this.isVisibilidadCeldaCancelarDetallePagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagos=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetallePagos=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=false;
			this.isVisibilidadCeldaModificarDetallePagos=false;
			this.isVisibilidadCeldaActualizarDetallePagos=true;
			this.isVisibilidadCeldaEliminarDetallePagos=false;
			this.isVisibilidadCeldaCancelarDetallePagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetallePagos=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=true;
			this.isVisibilidadCeldaModificarDetallePagos=false;
			this.isVisibilidadCeldaActualizarDetallePagos=false;
			this.isVisibilidadCeldaEliminarDetallePagos=false;
			this.isVisibilidadCeldaCancelarDetallePagos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagos=true;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetallePagos=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=false;
			this.isVisibilidadCeldaActualizarDetallePagos=false;
			this.isVisibilidadCeldaEliminarDetallePagos=false;
			this.isVisibilidadCeldaCancelarDetallePagos=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetallePagos=false;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=false;
			this.isVisibilidadCeldaModificarDetallePagos=true;
			this.isVisibilidadCeldaActualizarDetallePagos=false;
			this.isVisibilidadCeldaEliminarDetallePagos=false;
			this.isVisibilidadCeldaCancelarDetallePagos=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				} else {
					this.isVisibilidadCeldaGuardarDetallePagos=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetallePagosJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetallePagos=true;
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=true;
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=true;
		} else {
			this.actualizarEstadoPanelsDetallePagos(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetallePagos=false;
			//this.isVisibilidadCeldaVerFormDetallePagos=false;
			this.isVisibilidadCeldaDuplicarDetallePagos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detallepagosSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
		} else {
			this.isVisibilidadCeldaNuevoDetallePagos=false;
			this.isVisibilidadCeldaGuardarCambiosDetallePagos=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detallepagosSessionBean.getEsGuardarRelacionado()) {
			if(!detallepagosSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;												
			}
			
			this.jButtonCerrarDetallePagos.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
		}
		
		if(!this.permiteMantenimiento(this.detallepagos)) {
			this.isVisibilidadCeldaActualizarDetallePagos=false;
			this.isVisibilidadCeldaEliminarDetallePagos=false;
		}
		
		
		//SE DESHABILITA SIEMPRE
		this.isVisibilidadCeldaNuevoDetallePagos=false;
		this.isVisibilidadCeldaNuevoRelacionesDetallePagos=false;
		this.isVisibilidadCeldaGuardarCambiosDetallePagos=false;
		//this.isVisibilidadCeldaModificarDetallePagos=true;
		this.isVisibilidadCeldaActualizarDetallePagos=false;
		this.isVisibilidadCeldaEliminarDetallePagos=false;
		//this.isVisibilidadCeldaCancelarDetallePagos=true;			
		this.isVisibilidadCeldaGuardarDetallePagos=false;
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetallePagos() {
	}
	
	public void actualizarEstadoPanelsDetallePagos(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetallePagos!=null) {
				this.jScrollPanelDatosEdicionDetallePagos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagos!=null) {
				this.jTabbedPaneBusquedasDetallePagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagos!=null) {
				this.jScrollPanelDatosDetallePagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePagos!=null) {
				this.jPanelPaginacionDetallePagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePagos!=null) {
				this.jPanelParametrosReportesDetallePagos.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetallePagos!=null) {
				this.jScrollPanelDatosEdicionDetallePagos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagos!=null) {
				this.jTabbedPaneBusquedasDetallePagos.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetallePagos!=null) {
				this.jScrollPanelDatosDetallePagos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePagos!=null) {
				this.jPanelPaginacionDetallePagos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePagos!=null) {
				this.jPanelParametrosReportesDetallePagos.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetallePagos!=null) {
				this.jScrollPanelDatosEdicionDetallePagos.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagos!=null) {
				this.jTabbedPaneBusquedasDetallePagos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagos!=null) {
				this.jScrollPanelDatosDetallePagos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePagos!=null) {
				this.jPanelPaginacionDetallePagos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePagos!=null) {
				this.jPanelParametrosReportesDetallePagos.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetallePagos!=null) {
				this.jScrollPanelDatosEdicionDetallePagos.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagos!=null) {
				this.jTabbedPaneBusquedasDetallePagos.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagos!=null) {
				this.jScrollPanelDatosDetallePagos.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetallePagos!=null) {
				this.jPanelPaginacionDetallePagos.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetallePagos!=null) {
				this.jPanelParametrosReportesDetallePagos.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetallePagos!=null) {
				this.jScrollPanelDatosEdicionDetallePagos.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagos!=null) {
				this.jTabbedPaneBusquedasDetallePagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagos!=null) {
				this.jScrollPanelDatosDetallePagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePagos!=null) {
				this.jPanelPaginacionDetallePagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePagos!=null) {
				this.jPanelParametrosReportesDetallePagos.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetallePagos!=null) {
				this.jScrollPanelDatosEdicionDetallePagos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagos!=null) {
				this.jTabbedPaneBusquedasDetallePagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagos!=null) {
				this.jScrollPanelDatosDetallePagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePagos!=null) {
				this.jPanelPaginacionDetallePagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePagos!=null) {
				this.jPanelParametrosReportesDetallePagos.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetallePagos!=null) {
				this.jScrollPanelDatosEdicionDetallePagos.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagos!=null) {
				this.jTabbedPaneBusquedasDetallePagos.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetallePagos!=null) {
				this.jScrollPanelDatosDetallePagos.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetallePagos!=null) {
				this.jPanelPaginacionDetallePagos.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetallePagos!=null) {
				this.jPanelParametrosReportesDetallePagos.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detallepagosSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetallePagos!=null) {
					this.jTabbedPaneBusquedasDetallePagos.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetallePagos!=null) {
				this.jPanelParametrosReportesDetallePagos.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detallepagosSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetallePagos!=null) {
				this.jTabbedPaneBusquedasDetallePagos.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetallePagos!=null) {
				this.jPanelParametrosReportesDetallePagos.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaDetallePagos=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaDetallePagos) {this.jTabbedPaneBusquedasDetallePagos.remove(jPanelBusquedaDetallePagosDetallePagos);}
		}
		
	}

	public void setVisibilidadBusquedasParaGrupoCliente(Boolean isParaGrupoCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaGrupoClienteNegation=!isParaGrupoCliente;

			this.isVisibilidadBusquedaDetallePagos=isParaGrupoCliente;
			if(!this.isVisibilidadBusquedaDetallePagos) {this.jTabbedPaneBusquedasDetallePagos.remove(jPanelBusquedaDetallePagosDetallePagos);}
		}
		
	}

	public void setVisibilidadBusquedasParaZona(Boolean isParaZona){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaZonaNegation=!isParaZona;

			this.isVisibilidadBusquedaDetallePagos=isParaZona;
			if(!this.isVisibilidadBusquedaDetallePagos) {this.jTabbedPaneBusquedasDetallePagos.remove(jPanelBusquedaDetallePagosDetallePagos);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetallePagos(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetallePagos() {
		this.updateBorderResaltarBusquedasFormularioDetallePagos();
		this.updateVisibilidadBusquedasFormularioDetallePagos();
		this.updateHabilitarBusquedasFormularioDetallePagos();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetallePagos() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetallePagos.getComponents().length>0) {
	

		if(this.detallepagosConstantesFunciones.resaltarBusquedaDetallePagosDetallePagos!=null) {
			index= this.jTabbedPaneBusquedasDetallePagos.indexOfComponent(this.jPanelBusquedaDetallePagosDetallePagos);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePagos.getComponent(index);
				jPanel.setBorder(this.detallepagosConstantesFunciones.resaltarBusquedaDetallePagosDetallePagos);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetallePagos() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetallePagos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePagos.indexOfComponent(this.jPanelBusquedaDetallePagosDetallePagos);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePagos.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detallepagosConstantesFunciones.mostrarBusquedaDetallePagosDetallePagos);
			if(!this.detallepagosConstantesFunciones.mostrarBusquedaDetallePagosDetallePagos && index>-1) {
				this.jTabbedPaneBusquedasDetallePagos.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetallePagos() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetallePagos.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetallePagos.indexOfComponent(this.jPanelBusquedaDetallePagosDetallePagos);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePagos.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detallepagosConstantesFunciones.activarBusquedaDetallePagosDetallePagos);
				this.jTabbedPaneBusquedasDetallePagos.setEnabledAt(index,this.detallepagosConstantesFunciones.activarBusquedaDetallePagosDetallePagos);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetallePagos(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaDetallePagos")) {
			index= this.jTabbedPaneBusquedasDetallePagos.indexOfComponent(this.jPanelBusquedaDetallePagosDetallePagos);

			this.jTabbedPaneBusquedasDetallePagos.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetallePagos.getComponent(index);

			this.detallepagosConstantesFunciones.setResaltarBusquedaDetallePagosDetallePagos(resaltar);

			jPanel.setBorder(this.detallepagosConstantesFunciones.resaltarBusquedaDetallePagosDetallePagos);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetallePagos.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetallePagos() throws Exception {

		if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetallePagos();
		this.updateVisibilidadResaltarControlesFormularioDetallePagos();
		this.updateHabilitarResaltarControlesFormularioDetallePagos();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetallePagos() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detallepagosConstantesFunciones.resaltaridDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltaridDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarid_empresaDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarid_empresaDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarid_grupo_clienteDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarid_grupo_clienteDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarid_zonaDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarid_zonaDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarfecha_emision_desdeDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jDateChooserfecha_emision_desdeDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarfecha_emision_desdeDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarfecha_emision_hastaDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jDateChooserfecha_emision_hastaDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarfecha_emision_hastaDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarcodigoDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jTextFieldcodigoDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarcodigoDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarnombre_clienteDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jTextAreanombre_clienteDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarnombre_clienteDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarrucDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jTextFieldrucDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarrucDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltartotal_facturasDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturasDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltartotal_facturasDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltartotal_abonosDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_abonosDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltartotal_abonosDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltartotal_facturas_actualDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturas_actualDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltartotal_facturas_actualDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarabonos_anteriorDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_anteriorDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarabonos_anteriorDetallePagos);}
		if(this.detallepagosConstantesFunciones.resaltarabonos_actualDetallePagos!=null && this.jInternalFrameDetalleFormDetallePagos!=null) {this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_actualDetallePagos.setBorder(this.detallepagosConstantesFunciones.resaltarabonos_actualDetallePagos);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetallePagos() throws Exception {		
		if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) {
	
		//this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostraridDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelidDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostraridDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarid_empresaDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelid_empresaDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarid_empresaDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarid_grupo_clienteDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelid_grupo_clienteDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarid_grupo_clienteDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarid_zonaDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelid_zonaDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarid_zonaDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jDateChooserfecha_emision_desdeDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarfecha_emision_desdeDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelfecha_emision_desdeDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarfecha_emision_desdeDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jDateChooserfecha_emision_hastaDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarfecha_emision_hastaDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelfecha_emision_hastaDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarfecha_emision_hastaDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jTextFieldcodigoDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarcodigoDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelcodigoDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarcodigoDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jTextAreanombre_clienteDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarnombre_clienteDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelnombre_clienteDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarnombre_clienteDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jTextFieldrucDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarrucDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelrucDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarrucDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturasDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrartotal_facturasDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPaneltotal_facturasDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrartotal_facturasDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_abonosDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrartotal_abonosDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPaneltotal_abonosDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrartotal_abonosDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturas_actualDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrartotal_facturas_actualDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPaneltotal_facturas_actualDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrartotal_facturas_actualDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_anteriorDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarabonos_anteriorDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelabonos_anteriorDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarabonos_anteriorDetallePagos);
		//this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_actualDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarabonos_actualDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jPanelabonos_actualDetallePagos.setVisible(this.detallepagosConstantesFunciones.mostrarabonos_actualDetallePagos);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetallePagos() throws Exception {
		if(this.jInternalFrameDetalleFormDetallePagos==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetallePagos!=null) {
	
		this.jInternalFrameDetalleFormDetallePagos.jLabelidDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activaridDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_empresaDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarid_empresaDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_grupo_clienteDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarid_grupo_clienteDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jComboBoxid_zonaDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarid_zonaDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jDateChooserfecha_emision_desdeDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarfecha_emision_desdeDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jDateChooserfecha_emision_hastaDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarfecha_emision_hastaDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldcodigoDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarcodigoDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextAreanombre_clienteDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarnombre_clienteDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldrucDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarrucDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturasDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activartotal_facturasDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_abonosDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activartotal_abonosDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldtotal_facturas_actualDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activartotal_facturas_actualDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_anteriorDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarabonos_anteriorDetallePagos);
		this.jInternalFrameDetalleFormDetallePagos.jTextFieldabonos_actualDetallePagos.setEnabled(this.detallepagosConstantesFunciones.activarabonos_actualDetallePagos);
		}
	}
	
		
}