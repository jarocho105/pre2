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

import com.bydan.erp.cartera.util.RutaTransporteConstantesFunciones;
import com.bydan.erp.cartera.util.RutaTransporteParameterReturnGeneral;
//import com.bydan.erp.cartera.util.RutaTransporteParameterGeneral;
//import com.bydan.erp.cartera.presentation.report.source.RutaTransporteBean;
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

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.importaciones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.cartera.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.importaciones.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.importaciones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.importaciones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.importaciones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class RutaTransporteBeanSwingJInternalFrame extends RutaTransporteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(RutaTransporteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<RutaTransporte> rutatransporteValidator = new ClassValidator<RutaTransporte>(RutaTransporte.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public RutaTransporte rutatransporte;	
	public RutaTransporte rutatransporteAux;
	public RutaTransporte rutatransporteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public RutaTransporte rutatransporteTotales;
	public Long idRutaTransporteActual;
	public Long iIdNuevoRutaTransporte=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosProforma=false;

	public Boolean getIsTienePermisosProforma() {
		return isTienePermisosProforma;
	}

	public void setIsTienePermisosProforma(Boolean isTienePermisosProforma) {
		this.isTienePermisosProforma= isTienePermisosProforma;
	}


	public Boolean isTienePermisosPedido=false;

	public Boolean getIsTienePermisosPedido() {
		return isTienePermisosPedido;
	}

	public void setIsTienePermisosPedido(Boolean isTienePermisosPedido) {
		this.isTienePermisosPedido= isTienePermisosPedido;
	}


	public Boolean isTienePermisosServicioTransporte=false;

	public Boolean getIsTienePermisosServicioTransporte() {
		return isTienePermisosServicioTransporte;
	}

	public void setIsTienePermisosServicioTransporte(Boolean isTienePermisosServicioTransporte) {
		this.isTienePermisosServicioTransporte= isTienePermisosServicioTransporte;
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
	
	public Boolean isPermisoTodoRutaTransporte;
	public Boolean isPermisoNuevoRutaTransporte;
	public Boolean isPermisoActualizarRutaTransporte;
	public Boolean isPermisoActualizarOriginalRutaTransporte;
	public Boolean isPermisoEliminarRutaTransporte;
	public Boolean isPermisoGuardarCambiosRutaTransporte;
	public Boolean isPermisoConsultaRutaTransporte;
	public Boolean isPermisoBusquedaRutaTransporte;
	public Boolean isPermisoReporteRutaTransporte;
	public Boolean isPermisoPaginacionMedioRutaTransporte;
	public Boolean isPermisoPaginacionAltoRutaTransporte;
	public Boolean isPermisoPaginacionTodoRutaTransporte;
	public Boolean isPermisoCopiarRutaTransporte;
	public Boolean isPermisoVerFormRutaTransporte;
	public Boolean isPermisoDuplicarRutaTransporte;
	public Boolean isPermisoOrdenRutaTransporte;
	
	
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
	
	public RutaTransporteParameterReturnGeneral rutatransporteReturnGeneral;
	public RutaTransporteParameterReturnGeneral rutatransporteParameterGeneral;
	
	

	public ProformaLogic proformaLogic=null;

	public ProformaLogic getProformaLogic() {
		return proformaLogic;
	}

	public void setProformaLogic(ProformaLogic proformaLogic) {
		this.proformaLogic = proformaLogic;
	}


	public PedidoLogic pedidoLogic=null;

	public PedidoLogic getPedidoLogic() {
		return pedidoLogic;
	}

	public void setPedidoLogic(PedidoLogic pedidoLogic) {
		this.pedidoLogic = pedidoLogic;
	}


	public ServicioTransporteLogic serviciotransporteLogic=null;

	public ServicioTransporteLogic getServicioTransporteLogic() {
		return serviciotransporteLogic;
	}

	public void setServicioTransporteLogic(ServicioTransporteLogic serviciotransporteLogic) {
		this.serviciotransporteLogic = serviciotransporteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoRutaTransporte=false;
	public Boolean esParaAccionDesdeFormularioRutaTransporte=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected RutaTransporteSessionBeanAdditional rutatransporteSessionBeanAdditional=null;
	
	public RutaTransporteSessionBeanAdditional getRutaTransporteSessionBeanAdditional() {
		return this.rutatransporteSessionBeanAdditional;
	}
	
	public void setRutaTransporteSessionBeanAdditional(RutaTransporteSessionBeanAdditional rutatransporteSessionBeanAdditional) {
		try {
			this.rutatransporteSessionBeanAdditional=rutatransporteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected RutaTransporteBeanSwingJInternalFrameAdditional rutatransporteBeanSwingJInternalFrameAdditional=null;
	//public class RutaTransporteBeanSwingJInternalFrame
	
	public RutaTransporteBeanSwingJInternalFrameAdditional getRutaTransporteBeanSwingJInternalFrameAdditional() {
		return this.rutatransporteBeanSwingJInternalFrameAdditional;
	}
	
	public void setRutaTransporteBeanSwingJInternalFrameAdditional(RutaTransporteBeanSwingJInternalFrameAdditional rutatransporteBeanSwingJInternalFrameAdditional) {
		try {
			this.rutatransporteBeanSwingJInternalFrameAdditional=rutatransporteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public RutaTransporteLogic rutatransporteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public RutaTransporte rutatransporteBean;
	public RutaTransporteConstantesFunciones rutatransporteConstantesFunciones;
	//public RutaTransporteParameterReturnGeneral rutatransporteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<RutaTransporte> rutatransportes;	
	//public List<RutaTransporte> rutatransportesEliminados;
	//public List<RutaTransporte> rutatransportesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoRutaTransporte=false;
	public Boolean isVisibilidadCeldaDuplicarRutaTransporte=true;
	public Boolean isVisibilidadCeldaCopiarRutaTransporte=true;
	public Boolean isVisibilidadCeldaVerFormRutaTransporte=true;
	public Boolean isVisibilidadCeldaOrdenRutaTransporte=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;
	public Boolean isVisibilidadCeldaModificarRutaTransporte=false;
	public Boolean isVisibilidadCeldaActualizarRutaTransporte=false;
	public Boolean isVisibilidadCeldaEliminarRutaTransporte=false;
	public Boolean isVisibilidadCeldaCancelarRutaTransporte=false;
	public Boolean isVisibilidadCeldaGuardarRutaTransporte=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosRutaTransporte=false;	
	
	
	public Boolean isVisibilidadBusquedaPorDestino=false;
	public Boolean isVisibilidadBusquedaPorNombre=false;
	public Boolean isVisibilidadBusquedaPorOrigen=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoRutaTransporte() {
		return this.iIdNuevoRutaTransporte;
	}

	public void setiIdNuevoRutaTransporte(Long iIdNuevoRutaTransporte) {
		this.iIdNuevoRutaTransporte = iIdNuevoRutaTransporte;
	}
	
	public Long getidRutaTransporteActual() {
		return this.idRutaTransporteActual;
	}

	public void setidRutaTransporteActual(Long idRutaTransporteActual) {
		this.idRutaTransporteActual = idRutaTransporteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public RutaTransporte getrutatransporte() {
		return this.rutatransporte;
	}

	public void setrutatransporte(RutaTransporte rutatransporte) {
		this.rutatransporte = rutatransporte;
	}
	
	public RutaTransporte getrutatransporteAux() {
		return this.rutatransporteAux;
	}

	public void setrutatransporteAux(RutaTransporte rutatransporteAux) {
		this.rutatransporteAux = rutatransporteAux;
	}				
	
	public RutaTransporte getrutatransporteAnterior() {
		return this.rutatransporteAnterior;
	}

	public void setrutatransporteAnterior(RutaTransporte rutatransporteAnterior) {
		this.rutatransporteAnterior = rutatransporteAnterior;
	}	
	
	public RutaTransporte getrutatransporteTotales() {
		return this.rutatransporteTotales;
	}

	public void setrutatransporteTotales(RutaTransporte rutatransporteTotales) {
		this.rutatransporteTotales = rutatransporteTotales;
	}	
	
	public RutaTransporte getrutatransporteBean() {
		return this.rutatransporteBean;
	}

	public void setrutatransporteBean(RutaTransporte rutatransporteBean) {
		this.rutatransporteBean = rutatransporteBean;
	}	
	
	public RutaTransporteParameterReturnGeneral getrutatransporteReturnGeneral() {
		return this.rutatransporteReturnGeneral;
	}

	public void setrutatransporteReturnGeneral(RutaTransporteParameterReturnGeneral rutatransporteReturnGeneral) {
		this.rutatransporteReturnGeneral = rutatransporteReturnGeneral;
	}	
	
	
	public String destinoBusquedaPorDestino="";

	public String getdestinoBusquedaPorDestino() {
		return this.destinoBusquedaPorDestino;
	}

	public void setdestinoBusquedaPorDestino(String destinoBusquedaPorDestino) {
		this.destinoBusquedaPorDestino = destinoBusquedaPorDestino;
	}

	public String nombreBusquedaPorNombre="";

	public String getnombreBusquedaPorNombre() {
		return this.nombreBusquedaPorNombre;
	}

	public void setnombreBusquedaPorNombre(String nombreBusquedaPorNombre) {
		this.nombreBusquedaPorNombre = nombreBusquedaPorNombre;
	}

	public String origenBusquedaPorOrigen="";

	public String getorigenBusquedaPorOrigen() {
		return this.origenBusquedaPorOrigen;
	}

	public void setorigenBusquedaPorOrigen(String origenBusquedaPorOrigen) {
		this.origenBusquedaPorOrigen = origenBusquedaPorOrigen;
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
	
	
	public RutaTransporteLogic getRutaTransporteLogic()	{		
		return rutatransporteLogic;
	}

	public void setRutaTransporteLogic(RutaTransporteLogic rutatransporteLogic) {
		this.rutatransporteLogic = rutatransporteLogic;
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
	
	public Boolean getIsEsNuevoRutaTransporte() {
		return isEsNuevoRutaTransporte;
	}

	public void setIsEsNuevoRutaTransporte(Boolean isEsNuevoRutaTransporte) {
		this.isEsNuevoRutaTransporte = isEsNuevoRutaTransporte;
	}

	public Boolean getEsParaAccionDesdeFormularioRutaTransporte() {
		return esParaAccionDesdeFormularioRutaTransporte;
	}
	
	public void setEsParaAccionDesdeFormularioRutaTransporte(Boolean esParaAccionDesdeFormularioRutaTransporte) {
		this.esParaAccionDesdeFormularioRutaTransporte = esParaAccionDesdeFormularioRutaTransporte;
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

			if(this.rutatransporteSessionBean==null) {
				this.rutatransporteSessionBean=new RutaTransporteSessionBean();
			}

			if(!this.rutatransporteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(rutatransporteSessionBean.getlidEmpresaActual());
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

					if(this.rutatransporte!=null) {
						this.rutatransporte.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
						this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaRutaTransporte.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
						if(this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.getItemCount()>0) {
							this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaRutaTransporteGenerico)throws Exception
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
				jComboBoxid_empresaRutaTransporteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaRutaTransporteGenerico!=null && jComboBoxid_empresaRutaTransporteGenerico.getItemCount()>0) {
					jComboBoxid_empresaRutaTransporteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(RutaTransporte rutatransporte,JComboBox jComboBoxid_empresaRutaTransporteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaRutaTransporteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaRutaTransporteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				rutatransporte.setid_empresa(empresaAux.getId());
				rutatransporte.setempresa_descripcion(RutaTransporteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				rutatransporte.setEmpresa(empresaAux);			}
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

					if(!RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormRutaTransporte!=null) { 
							this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormRutaTransporte!=null) { 
					}

					if(!RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
							this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
							this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesRutaTransporte() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			RutaTransporteConstantesFunciones.refrescarForeignKeysDescripcionesRutaTransporte(this.rutatransporteLogic.getRutaTransportes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			RutaTransporteConstantesFunciones.refrescarForeignKeysDescripcionesRutaTransporte(this.rutatransportes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//rutatransporteLogic.setRutaTransportes(this.rutatransportes);
			rutatransporteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public RutaTransporteParameterReturnGeneral getRutaTransporteParameterGeneral() {
		return this.rutatransporteParameterGeneral;
	}
	
	public void setRutaTransporteParameterGeneral(RutaTransporteParameterReturnGeneral rutatransporteParameterGeneral) {
		this.rutatransporteParameterGeneral = rutatransporteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoRutaTransporte() {
		return isPermisoTodoRutaTransporte;
	}

	public void setIsPermisoTodoRutaTransporte(Boolean isPermisoTodoRutaTransporte) {
		this.isPermisoTodoRutaTransporte = isPermisoTodoRutaTransporte;
	}

	public Boolean getIsPermisoNuevoRutaTransporte() {
		return isPermisoNuevoRutaTransporte;
	}

	public void setIsPermisoNuevoRutaTransporte(Boolean isPermisoNuevoRutaTransporte) {
		this.isPermisoNuevoRutaTransporte = isPermisoNuevoRutaTransporte;
	}

	public Boolean getIsPermisoActualizarRutaTransporte() {
		return isPermisoActualizarRutaTransporte;
	}

	public void setIsPermisoActualizarRutaTransporte(Boolean isPermisoActualizarRutaTransporte) {
		this.isPermisoActualizarRutaTransporte = isPermisoActualizarRutaTransporte;
	}

	public Boolean getIsPermisoEliminarRutaTransporte() {
		return isPermisoEliminarRutaTransporte;
	}

	public void setIsPermisoEliminarRutaTransporte(Boolean isPermisoEliminarRutaTransporte) {
		this.isPermisoEliminarRutaTransporte = isPermisoEliminarRutaTransporte;
	}

	public Boolean getIsPermisoGuardarCambiosRutaTransporte() {
		return isPermisoGuardarCambiosRutaTransporte;
	}

	public void setIsPermisoGuardarCambiosRutaTransporte(Boolean isPermisoGuardarCambiosRutaTransporte) {
		this.isPermisoGuardarCambiosRutaTransporte = isPermisoGuardarCambiosRutaTransporte;
	}
	
	public Boolean getIsPermisoConsultaRutaTransporte() {
		return isPermisoConsultaRutaTransporte;
	}

	public void setIsPermisoConsultaRutaTransporte(Boolean isPermisoConsultaRutaTransporte) {
		this.isPermisoConsultaRutaTransporte = isPermisoConsultaRutaTransporte;
	}

	public Boolean getIsPermisoBusquedaRutaTransporte() {
		return isPermisoBusquedaRutaTransporte;
	}

	public void setIsPermisoBusquedaRutaTransporte(Boolean isPermisoBusquedaRutaTransporte) {
		this.isPermisoBusquedaRutaTransporte = isPermisoBusquedaRutaTransporte;
	}

	public Boolean getIsPermisoReporteRutaTransporte() {
		return isPermisoReporteRutaTransporte;
	}

	public void setIsPermisoReporteRutaTransporte(Boolean isPermisoReporteRutaTransporte) {
		this.isPermisoReporteRutaTransporte = isPermisoReporteRutaTransporte;
	}
	
	public Boolean getIsPermisoPaginacionMedioRutaTransporte() {
		return isPermisoPaginacionMedioRutaTransporte;
	}

	public void setIsPermisoPaginacionMedioRutaTransporte(Boolean isPermisoPaginacionMedioRutaTransporte) {
		this.isPermisoPaginacionMedioRutaTransporte = isPermisoPaginacionMedioRutaTransporte;
	}
	
	public Boolean getIsPermisoPaginacionTodoRutaTransporte() {
		return isPermisoPaginacionTodoRutaTransporte;
	}

	public void setIsPermisoPaginacionTodoRutaTransporte(Boolean isPermisoPaginacionTodoRutaTransporte) {
		this.isPermisoPaginacionTodoRutaTransporte = isPermisoPaginacionTodoRutaTransporte;
	}
	
	public Boolean getIsPermisoPaginacionAltoRutaTransporte() {
		return isPermisoPaginacionAltoRutaTransporte;
	}

	public void setIsPermisoPaginacionAltoRutaTransporte(Boolean isPermisoPaginacionAltoRutaTransporte) {
		this.isPermisoPaginacionAltoRutaTransporte = isPermisoPaginacionAltoRutaTransporte;
	}
	
	public Boolean getIsPermisoCopiarRutaTransporte() {
		return isPermisoCopiarRutaTransporte;
	}

	public void setIsPermisoCopiarRutaTransporte(Boolean isPermisoCopiarRutaTransporte) {
		this.isPermisoCopiarRutaTransporte = isPermisoCopiarRutaTransporte;
	}
	
	public Boolean getIsPermisoVerFormRutaTransporte() {
		return isPermisoVerFormRutaTransporte;
	}

	public void setIsPermisoVerFormRutaTransporte(Boolean isPermisoVerFormRutaTransporte) {
		this.isPermisoVerFormRutaTransporte = isPermisoVerFormRutaTransporte;
	}
	
	public Boolean getIsPermisoDuplicarRutaTransporte() {
		return isPermisoDuplicarRutaTransporte;
	}

	public void setIsPermisoDuplicarRutaTransporte(Boolean isPermisoDuplicarRutaTransporte) {
		this.isPermisoDuplicarRutaTransporte = isPermisoDuplicarRutaTransporte;
	}
	
	public Boolean getIsPermisoOrdenRutaTransporte() {
		return isPermisoOrdenRutaTransporte;
	}

	public void setIsPermisoOrdenRutaTransporte(Boolean isPermisoOrdenRutaTransporte) {
		this.isPermisoOrdenRutaTransporte = isPermisoOrdenRutaTransporte;
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
	
	public Boolean getIsVisibilidadCeldaNuevoRutaTransporte() {
		return isVisibilidadCeldaNuevoRutaTransporte;
	}

	public void setIsVisibilidadCeldaNuevoRutaTransporte(Boolean isVisibilidadCeldaNuevoRutaTransporte) {
		this.isVisibilidadCeldaNuevoRutaTransporte = isVisibilidadCeldaNuevoRutaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarRutaTransporte() {
		return isVisibilidadCeldaDuplicarRutaTransporte;
	}

	public void setIsVisibilidadCeldaDuplicarRutaTransporte(Boolean isVisibilidadCeldaDuplicarRutaTransporte) {
		this.isVisibilidadCeldaDuplicarRutaTransporte = isVisibilidadCeldaDuplicarRutaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarRutaTransporte() {
		return isVisibilidadCeldaCopiarRutaTransporte;
	}

	public void setIsVisibilidadCeldaCopiarRutaTransporte(Boolean isVisibilidadCeldaCopiarRutaTransporte) {
		this.isVisibilidadCeldaCopiarRutaTransporte = isVisibilidadCeldaCopiarRutaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormRutaTransporte() {
		return isVisibilidadCeldaVerFormRutaTransporte;
	}

	public void setIsVisibilidadCeldaVerFormRutaTransporte(Boolean isVisibilidadCeldaVerFormRutaTransporte) {
		this.isVisibilidadCeldaVerFormRutaTransporte = isVisibilidadCeldaVerFormRutaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenRutaTransporte() {
		return isVisibilidadCeldaOrdenRutaTransporte;
	}

	public void setIsVisibilidadCeldaOrdenRutaTransporte(Boolean isVisibilidadCeldaOrdenRutaTransporte) {
		this.isVisibilidadCeldaOrdenRutaTransporte = isVisibilidadCeldaOrdenRutaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesRutaTransporte() {
		return isVisibilidadCeldaNuevoRelacionesRutaTransporte;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesRutaTransporte(Boolean isVisibilidadCeldaNuevoRelacionesRutaTransporte) {
		this.isVisibilidadCeldaNuevoRelacionesRutaTransporte = isVisibilidadCeldaNuevoRelacionesRutaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaModificarRutaTransporte() {
		return isVisibilidadCeldaModificarRutaTransporte;
	}

	public void setIsVisibilidadCeldaModificarRutaTransporte(Boolean isVisibilidadCeldaModificarRutaTransporte) {
		this.isVisibilidadCeldaModificarRutaTransporte = isVisibilidadCeldaModificarRutaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarRutaTransporte() {
		return isVisibilidadCeldaActualizarRutaTransporte;
	}

	public void setIsVisibilidadCeldaActualizarRutaTransporte(Boolean isVisibilidadCeldaActualizarRutaTransporte) {
		this.isVisibilidadCeldaActualizarRutaTransporte = isVisibilidadCeldaActualizarRutaTransporte;
	}

	public Boolean getIsVisibilidadCeldaEliminarRutaTransporte() {
		return isVisibilidadCeldaEliminarRutaTransporte;
	}

	public void setIsVisibilidadCeldaEliminarRutaTransporte(Boolean isVisibilidadCeldaEliminarRutaTransporte) {
		this.isVisibilidadCeldaEliminarRutaTransporte = isVisibilidadCeldaEliminarRutaTransporte;
	}

	public Boolean getIsVisibilidadCeldaCancelarRutaTransporte() {
		return isVisibilidadCeldaCancelarRutaTransporte;
	}

	public void setIsVisibilidadCeldaCancelarRutaTransporte(Boolean isVisibilidadCeldaCancelarRutaTransporte) {
		this.isVisibilidadCeldaCancelarRutaTransporte = isVisibilidadCeldaCancelarRutaTransporte;
	}

	public Boolean getIsVisibilidadCeldaGuardarRutaTransporte() {
		return isVisibilidadCeldaGuardarRutaTransporte;
	}

	public void setIsVisibilidadCeldaGuardarRutaTransporte(Boolean isVisibilidadCeldaGuardarRutaTransporte) {
		this.isVisibilidadCeldaGuardarRutaTransporte = isVisibilidadCeldaGuardarRutaTransporte;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosRutaTransporte() {
		return isVisibilidadCeldaGuardarCambiosRutaTransporte;
	}

	public void setIsVisibilidadCeldaGuardarCambiosRutaTransporte(Boolean isVisibilidadCeldaGuardarCambiosRutaTransporte) {
		this.isVisibilidadCeldaGuardarCambiosRutaTransporte = isVisibilidadCeldaGuardarCambiosRutaTransporte;
	}
		
	public RutaTransporteSessionBean getrutatransporteSessionBean() {
		return this.rutatransporteSessionBean;
	}
	
	public void setrutatransporteSessionBean(RutaTransporteSessionBean rutatransporteSessionBean) {
		this.rutatransporteSessionBean=rutatransporteSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorDestino() {
		return this.isVisibilidadBusquedaPorDestino;
	}

	public void setisVisibilidadBusquedaPorDestino(Boolean isVisibilidadBusquedaPorDestino) {
		this.isVisibilidadBusquedaPorDestino=isVisibilidadBusquedaPorDestino;
	}

	public Boolean getisVisibilidadBusquedaPorNombre() {
		return this.isVisibilidadBusquedaPorNombre;
	}

	public void setisVisibilidadBusquedaPorNombre(Boolean isVisibilidadBusquedaPorNombre) {
		this.isVisibilidadBusquedaPorNombre=isVisibilidadBusquedaPorNombre;
	}

	public Boolean getisVisibilidadBusquedaPorOrigen() {
		return this.isVisibilidadBusquedaPorOrigen;
	}

	public void setisVisibilidadBusquedaPorOrigen(Boolean isVisibilidadBusquedaPorOrigen) {
		this.isVisibilidadBusquedaPorOrigen=isVisibilidadBusquedaPorOrigen;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(RutaTransporte rutatransporte)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(rutatransporte,null);
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
	
	public void bugActualizarReferenciaActual(RutaTransporte rutatransporte,RutaTransporte rutatransporteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalRutaTransporte(rutatransporte);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		rutatransporteAux.setId(rutatransporte.getId());
		rutatransporteAux.setVersionRow(rutatransporte.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessRutaTransporte();
		
			int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = rutatransporteValidator.getInvalidValues(this.rutatransporte);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			rutatransporteLogic.setDatosCliente(datosCliente);
			rutatransporteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				rutatransporteAux=new  RutaTransporte();
				
				rutatransporteAux.setIsNew(true);
				rutatransporteAux.setIsChanged(true);
				
				rutatransporteAux.setRutaTransporteOriginal(this.rutatransporte);
				
				rutatransporteAux.setId(this.rutatransporte.getId());	
				rutatransporteAux.setVersionRow(this.rutatransporte.getVersionRow());	
				rutatransporteAux.setid_empresa(this.rutatransporte.getid_empresa());	
				rutatransporteAux.setnombre(this.rutatransporte.getnombre());	
				rutatransporteAux.setorigen(this.rutatransporte.getorigen());	
				rutatransporteAux.setdestino(this.rutatransporte.getdestino());	
				rutatransporteAux.setprecio(this.rutatransporte.getprecio());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rutatransporteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(rutatransporteAux,rutatransporteLogic.getRutaTransportes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rutatransporteAux,rutatransportes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.rutatransporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rutatransporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransporteLogic.saveRutaTransportes();//WithConnection
						//rutatransporteLogic.getSetVersionRowRutaTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rutatransporte,rutatransporteAux);
					
					this.refrescarForeignKeysDescripcionesRutaTransporte();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas().addAll(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos().addAll(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes().addAll(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformas.addAll(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidos.addAll(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportes.addAll(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rutatransporteLogic.saveRutaTransporteRelaciones(rutatransporteAux,this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas(),this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos(),this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());//WithConnection
								//rutatransporteLogic.getSetVersionRowRutaTransportes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rutatransporte,rutatransporteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(new ArrayList<Proforma>());
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(new ArrayList<Pedido>());
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(new ArrayList<ServicioTransporte>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformas= new ArrayList<Proforma>();
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidos= new ArrayList<Pedido>();
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportes= new ArrayList<ServicioTransporte>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.quitarFilaTotales();}
							rutatransporteAux.setProformas(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());

							if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.quitarFilaTotales();}
							rutatransporteAux.setPedidos(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());

							if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();}
							rutatransporteAux.setServicioTransportes(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rutatransporteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rutatransporteAux,rutatransporteLogic.getRutaTransportes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rutatransporteAux,rutatransportes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rutatransporte,rutatransporteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				rutatransporteAux=new  RutaTransporte();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.rutatransporteSessionBean.getEsGuardarRelacionado() 
					|| (this.rutatransporteSessionBean.getEsGuardarRelacionado() && this.rutatransporte.getId()>=0)) {
						
					rutatransporteAux.setIsNew(false);
				}
				
				rutatransporteAux.setIsDeleted(false);
			
				rutatransporteAux.setId(this.rutatransporte.getId());	
				rutatransporteAux.setVersionRow(this.rutatransporte.getVersionRow());	
				rutatransporteAux.setid_empresa(this.rutatransporte.getid_empresa());	
				rutatransporteAux.setnombre(this.rutatransporte.getnombre());	
				rutatransporteAux.setorigen(this.rutatransporte.getorigen());	
				rutatransporteAux.setdestino(this.rutatransporte.getdestino());	
				rutatransporteAux.setprecio(this.rutatransporte.getprecio());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rutatransporteAux,rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rutatransporteAux,rutatransportes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.rutatransporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rutatransporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransporteLogic.saveRutaTransportes();//WithConnection
						//rutatransporteLogic.getSetVersionRowRutaTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.rutatransporte,rutatransporteAux);
					
					this.refrescarForeignKeysDescripcionesRutaTransporte();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas().addAll(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos().addAll(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes().addAll(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformas.addAll(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidos.addAll(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportes.addAll(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rutatransporteLogic.saveRutaTransporteRelaciones(rutatransporteAux,this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas(),this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos(),this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());//WithConnection
								//rutatransporteLogic.getSetVersionRowRutaTransportes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.rutatransporte,rutatransporteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(new ArrayList<Proforma>());
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(new ArrayList<Pedido>());
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(new ArrayList<ServicioTransporte>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformas= new ArrayList<Proforma>();
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidos= new ArrayList<Pedido>();
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportes= new ArrayList<ServicioTransporte>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.quitarFilaTotales();}
							rutatransporteAux.setProformas(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());

							if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.quitarFilaTotales();}
							rutatransporteAux.setPedidos(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());

							if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();}
							rutatransporteAux.setServicioTransportes(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.rutatransporteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(rutatransporteAux,rutatransporteLogic.getRutaTransportes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(rutatransporteAux,rutatransportes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.rutatransporte,rutatransporteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				rutatransporteAux=new  RutaTransporte();
				
				rutatransporteAux.setIsNew(false);
				rutatransporteAux.setIsChanged(false);
				
				rutatransporteAux.setIsDeleted(true);
				
				rutatransporteAux.setId(this.rutatransporte.getId());	
				rutatransporteAux.setVersionRow(this.rutatransporte.getVersionRow());	
				rutatransporteAux.setid_empresa(this.rutatransporte.getid_empresa());	
				rutatransporteAux.setnombre(this.rutatransporte.getnombre());	
				rutatransporteAux.setorigen(this.rutatransporte.getorigen());	
				rutatransporteAux.setdestino(this.rutatransporte.getdestino());	
				rutatransporteAux.setprecio(this.rutatransporte.getprecio());	
				
				if(this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.rutatransporteAux.getId()>=0) {	
						this.rutatransportesEliminados.add(rutatransporteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(rutatransporteAux,rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rutatransporteAux,rutatransportes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.rutatransporteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.rutatransporteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransporteLogic.saveRutaTransportes();//WithConnection
						//rutatransporteLogic.getSetVersionRowRutaTransportes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas().addAll(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos().addAll(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes().addAll(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformas.addAll(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformasEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidos.addAll(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidosEliminados);
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportes.addAll(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.terminoproformaBeanSwingJInternalFrame.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jInternalFrameDetalleFormProforma.detalleproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jInternalFrameDetalleFormPedido.detallepedidoBeanSwingJInternalFrame.quitarFilaTotales();*/}
								if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								rutatransporteLogic.saveRutaTransporteRelaciones(rutatransporteAux,this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas(),this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos(),this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());//WithConnection
								//rutatransporteLogic.getSetVersionRowRutaTransportes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(new ArrayList<Proforma>());
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(new ArrayList<Pedido>());
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(new ArrayList<ServicioTransporte>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformas= new ArrayList<Proforma>();
							this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidos= new ArrayList<Pedido>();
							this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportes= new ArrayList<ServicioTransporte>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.quitarFilaTotales();}
							rutatransporteAux.setProformas(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());

							if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.quitarFilaTotales();}
							rutatransporteAux.setPedidos(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());

							if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();}
							rutatransporteAux.setServicioTransportes(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.rutatransporteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(rutatransporteAux,rutatransporteLogic.getRutaTransportes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(rutatransporteAux,rutatransportes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getRutaTransportes().addAll(this.rutatransportesEliminados);
					
					rutatransporteLogic.saveRutaTransportes();//WithConnection
					//rutatransporteLogic.getSetVersionRowRutaTransportes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesRutaTransporte();
				
				this.rutatransportesEliminados= new ArrayList<RutaTransporte>();		
			}
			
			if(this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Ruta Transporte GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.rutatransporte=rutatransporteAux;
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
      		//this.finishProcessRutaTransporte();
      	}
		
	}	
	
	public void actualizarRelaciones(RutaTransporte rutatransporteLocal) throws Exception {
		
		if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				rutatransporteLocal.setProformas(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());
				rutatransporteLocal.setPedidos(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());
				rutatransporteLocal.setServicioTransportes(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
			
			} else {
			
				rutatransporteLocal.setProformas(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformas);
				rutatransporteLocal.setPedidos(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidos);
				rutatransporteLocal.setServicioTransportes(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransportes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(RutaTransporte rutatransporteLocal) throws Exception {	
		if(this.rutatransporteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				rutatransporteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarRutaTransporteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = rutatransporteValidator.getInvalidValues(this.rutatransporte);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(RutaTransporte rutatransporte,List<RutaTransporte> rutatransportes) throws Exception {
		try	{		
			RutaTransporteConstantesFunciones.actualizarLista(rutatransporte,rutatransportes,this.rutatransporteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(RutaTransporte rutatransporte,List<RutaTransporte> rutatransportes) throws Exception {
		try	{			
			RutaTransporteConstantesFunciones.actualizarSelectedLista(rutatransporte,rutatransportes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<RutaTransporte> rutatransportesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				rutatransportesLocal=this.rutatransporteLogic.getRutaTransportes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				rutatransportesLocal=this.rutatransportes;
			}
			//ARCHITECTURE
		
			for(RutaTransporte rutatransporteLocal:rutatransportesLocal) {
				if(this.permiteMantenimiento(rutatransporteLocal) && rutatransporteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+RutaTransporteConstantesFunciones.getRutaTransporteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(RutaTransporteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabelid_empresaRutaTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaTransporteConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabelnombreRutaTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaTransporteConstantesFunciones.ORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabelorigenRutaTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaTransporteConstantesFunciones.DESTINO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabeldestinoRutaTransporte,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(RutaTransporteConstantesFunciones.PRECIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabelprecioRutaTransporte,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRutaTransporte.jLabelid_empresaRutaTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRutaTransporte.jLabelnombreRutaTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRutaTransporte.jLabelorigenRutaTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRutaTransporte.jLabeldestinoRutaTransporte,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormRutaTransporte.jLabelprecioRutaTransporte,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Proforma")) {
			if(this.rutatransporte==null) {
				this.rutatransporte= new RutaTransporte();
			}

			if(this.rutatransporteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRutaTransporte
				this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);

				this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.getproforma().setRutaTransporte(this.rutatransporte);
			}

			return;
		}
		 else  if(sTipo.equals("Pedido")) {
			if(this.rutatransporte==null) {
				this.rutatransporte= new RutaTransporte();
			}

			if(this.rutatransporteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRutaTransporte
				this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);

				this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.getpedido().setRutaTransporte(this.rutatransporte);
			}

			return;
		}
		 else  if(sTipo.equals("ServicioTransporte")) {
			if(this.rutatransporte==null) {
				this.rutatransporte= new RutaTransporte();
			}

			if(this.rutatransporteSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoRutaTransporte
				this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);

				this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.getserviciotransporte().setRutaTransporte(this.rutatransporte);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoRutaTransporte--;	
		
		
		this.rutatransporteAux=new RutaTransporte();
		
		this.rutatransporteAux.setId(this.iIdNuevoRutaTransporte);
		this.rutatransporteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.rutatransporteLogic.getRutaTransportes().add(this.rutatransporteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.rutatransportes.add(this.rutatransporteAux);
		}
		//ARCHITECTURE
		
		this.rutatransporte=this.rutatransporteAux;
		
		if(RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioRutaTransporte(this.rutatransporte);
			this.setVariablesObjetoActualToFormularioForeignKeyRutaTransporte(this.rutatransporte);
		}
				
		//this.setDefaultControlesRutaTransporte();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyRutaTransporte();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyRutaTransporte();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyRutaTransporte();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRutaTransporte(this.rutatransporteBean,this.rutatransporte,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(RutaTransporteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {
			classes=RutaTransporteConstantesFunciones.getClassesRelationshipsOfRutaTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.rutatransporteReturnGeneral=rutatransporteLogic.procesarEventosRutaTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rutatransporteLogic.getRutaTransportes(),this.rutatransporte,this.rutatransporteParameterGeneral,this.isEsNuevoRutaTransporte,classes);//this.rutatransporteLogic.getRutaTransporte()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanRutaTransporte(this.rutatransporteReturnGeneral,this.rutatransporteBean,false);
		
		if(this.rutatransporteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyRutaTransporte(this.rutatransporteReturnGeneral.getRutaTransporte());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioRutaTransporte(this.rutatransporteReturnGeneral.getRutaTransporte());
		}
		
		if(this.rutatransporteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioRutaTransporte(this.rutatransporteReturnGeneral.getRutaTransporte(),classes);//this.rutatransporteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyRutaTransporte();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyRutaTransporte();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RutaTransporteBeanSwingJInternalFrameAdditional.RecargarFormRutaTransporte(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingRutaTransporte(false);
						
			if(rutatransporteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaSessionBean.getEsGuardarRelacionado() && ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProformaActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoSessionBean.getEsGuardarRelacionado() && PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoActionPerformed(null,-1,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.getEsGuardarRelacionado() && ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonServicioTransporteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRutaTransporte();
			}
			
			this.actualizarVisualTableDatosRutaTransporte();
			
			this.jTableDatosRutaTransporte.setRowSelectionInterval(this.getIndiceNuevoRutaTransporte(), this.getIndiceNuevoRutaTransporte());
			
			this.seleccionarFilaTablaRutaTransporteActual();
						
			this.actualizarEstadoCeldasBotonesRutaTransporte("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesRutaTransporte(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormRutaTransporte.jTextAreanombreRutaTransporte.setEnabled(isHabilitar && this.rutatransporteConstantesFunciones.activarnombreRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jTextAreaorigenRutaTransporte.setEnabled(isHabilitar && this.rutatransporteConstantesFunciones.activarorigenRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jTextAreadestinoRutaTransporte.setEnabled(isHabilitar && this.rutatransporteConstantesFunciones.activardestinoRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jTextFieldprecioRutaTransporte.setEnabled(isHabilitar && this.rutatransporteConstantesFunciones.activarprecioRutaTransporte);	
		//
		this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.setEnabled(isHabilitar && this.rutatransporteConstantesFunciones.activarid_empresaRutaTransporte);
	};
	
	public void setDefaultControlesRutaTransporte() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoRutaTransporte(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.rutatransporteSessionBean.setConGuardarRelaciones(true);			
			this.rutatransporteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}

			if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.rutatransporteSessionBean.setConGuardarRelaciones(false);			
			this.rutatransporteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}

			if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoRutaTransporte() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RutaTransporte rutatransporteAux:this.rutatransporteLogic.getRutaTransportes()) {
				if(rutatransporteAux.getId().equals(this.iIdNuevoRutaTransporte)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RutaTransporte rutatransporteAux:this.rutatransportes) {
				if(rutatransporteAux.getId().equals(this.iIdNuevoRutaTransporte)) {
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
	
	public int getIndiceActualRutaTransporte(RutaTransporte rutatransporte,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RutaTransporte rutatransporteAux:this.rutatransporteLogic.getRutaTransportes()) {
				if(rutatransporteAux.getId().equals(rutatransporte.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RutaTransporte rutatransporteAux:this.rutatransportes) {
				if(rutatransporteAux.getId().equals(rutatransporte.getId())) {
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
	
	public void setCamposBaseDesdeOriginalRutaTransporte(RutaTransporte rutatransporteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RutaTransporte rutatransporteAux:this.rutatransporteLogic.getRutaTransportes()) {
				if(rutatransporteAux.getRutaTransporteOriginal().getId().equals(rutatransporteOriginal.getId())) {
					existe=true;
					rutatransporteOriginal.setId(rutatransporteAux.getId());
					rutatransporteOriginal.setVersionRow(rutatransporteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RutaTransporte rutatransporteAux:this.rutatransportes) {
				if(rutatransporteAux.getRutaTransporteOriginal().getId().equals(rutatransporteOriginal.getId())) {
					existe=true;
					rutatransporteOriginal.setId(rutatransporteAux.getId());
					rutatransporteOriginal.setVersionRow(rutatransporteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosRutaTransporte(Boolean esParaCancelar) throws Exception {
		rutatransportesAux=new ArrayList<RutaTransporte>();
		rutatransporteAux=new RutaTransporte();
		
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RutaTransporte rutatransporteAux:this.rutatransporteLogic.getRutaTransportes()) {
					if(rutatransporteAux.getId()<0) {
						rutatransportesAux.add(rutatransporteAux);
					}		
				}
				this.iIdNuevoRutaTransporte=0L;
				this.rutatransporteLogic.getRutaTransportes().removeAll(rutatransportesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RutaTransporte rutatransporteAux:this.rutatransportes) {
					if(rutatransporteAux.getId()<0) {
						rutatransportesAux.add(rutatransporteAux);
					}		
				}
				this.iIdNuevoRutaTransporte=0L;
				this.rutatransportes.removeAll(rutatransportesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoRutaTransporte 
					&& this.rutatransporteLogic.getRutaTransportes().size()>0
					) {
					rutatransporteAux=this.rutatransporteLogic.getRutaTransportes().get(this.rutatransporteLogic.getRutaTransportes().size() - 1);
				
					if(rutatransporteAux.getId()<0) {
						this.rutatransporteLogic.getRutaTransportes().remove(rutatransporteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoRutaTransporte && this.rutatransportes.size()>0) {
					rutatransporteAux=this.rutatransportes.get(this.rutatransportes.size() - 1);
				
					if(rutatransporteAux.getId()<0) {
						this.rutatransportes.remove(rutatransporteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoRutaTransporte(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(rutatransporte.getId()<0) {
				this.rutatransporteLogic.getRutaTransportes().remove(this.rutatransporte);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(rutatransporte.getId()<0) {
				this.rutatransportes.remove(this.rutatransporte);
			}
		}			
	}
	
	public void setEstadosInicialesRutaTransporte(List<RutaTransporte> rutatransportesAux) throws Exception {
		RutaTransporteConstantesFunciones.setEstadosInicialesRutaTransporte(rutatransportesAux);
	}
	
	public void setEstadosInicialesRutaTransporte(RutaTransporte rutatransporteAux) throws Exception {
		RutaTransporteConstantesFunciones.setEstadosInicialesRutaTransporte(rutatransporteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarRutaTransporteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesRutaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarRutaTransporteActual()) {
				if(!this.isEsNuevoRutaTransporte) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesRutaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoRutaTransporte=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarRutaTransporteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Ruta Transporte ?", "MANTENIMIENTO DE Ruta Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesRutaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(RutaTransporte rutatransporte) throws Exception {
		RutaTransporteConstantesFunciones.seleccionarAsignar(this.rutatransporte,rutatransporte);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarRutaTransporte=this.isPermisoActualizarOriginalRutaTransporte;
			
			
			this.seleccionarAsignar(rutatransporte);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			RutaTransporteConstantesFunciones.quitarEspaciosRutaTransporte(this.rutatransporte,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesRutaTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.rutatransporteSessionBean.setsFuncionBusquedaRapida(this.rutatransporteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoRutaTransporte) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosRutaTransporte(esParaCancelar);				
				this.cancelarNuevoRutaTransporte(esParaCancelar);								
			}
			
			this.rutatransporte=new RutaTransporte();
			
			this.inicializarRutaTransporte();
			
			this.actualizarEstadoCeldasBotonesRutaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarRutaTransporte() throws Exception {
		try {
			RutaTransporteConstantesFunciones.inicializarRutaTransporte(this.rutatransporte);
			
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
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.rutatransporteLogic.getRutaTransportes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteRutaTransportes(String sAccionBusqueda,List<RutaTransporte> rutatransportesParaReportes) throws Exception {
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
					sPathReporteFinal="RutaTransporte"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="RutaTransporteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("RutaTransporteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="RutaTransporte"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Ruta Transportes");		
		parameters.put("busquedapor", RutaTransporteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Proforma.class));
			classes.add(new Classe(Pedido.class));
			classes.add(new Classe(ServicioTransporte.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					RutaTransporteLogic rutatransporteLogicAuxiliar=new RutaTransporteLogic();
					rutatransporteLogicAuxiliar.setDatosCliente(rutatransporteLogic.getDatosCliente());				
					rutatransporteLogicAuxiliar.setRutaTransportes(rutatransportesParaReportes);
					
					rutatransporteLogicAuxiliar.cargarRelacionesLoteForeignKeyRutaTransporteWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					rutatransportesParaReportes=rutatransporteLogicAuxiliar.getRutaTransportes();
					
					//rutatransporteLogic.getNewConnexionToDeep();
					
					//for (RutaTransporte rutatransporte:rutatransportesParaReportes) {
					//	rutatransporteLogic.deepLoad(rutatransporte, false, DeepLoadType.INCLUDE, classes);
					//}						
					//rutatransporteLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//rutatransporteLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileProforma = AuxiliarReportes.class.getResourceAsStream("ProformaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_proforma", reportFileProforma);

			InputStream reportFilePedido = AuxiliarReportes.class.getResourceAsStream("PedidoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_pedido", reportFilePedido);

			InputStream reportFileServicioTransporte = AuxiliarReportes.class.getResourceAsStream("ServicioTransporteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_serviciotransporte", reportFileServicioTransporte);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceRutaTransporte=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			RutaTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			RutaTransporteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceRutaTransporte=new JRBeanArrayDataSource(RutaTransporteJInternalFrame.TraerRutaTransporteBeans(rutatransportesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceRutaTransporte);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+RutaTransporteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+RutaTransporteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(RutaTransporteBean.TraerRutaTransporteBeans(rutatransportesParaReportes).toArray()));
							
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
				this.generarExcelReporteRutaTransportes(sAccionBusqueda,sTipoArchivoReporte,rutatransportesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalRutaTransportes(sAccionBusqueda,sTipoArchivoReporte,rutatransportesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoRutaTransporteActionPerformed(null);
					//this.generarExcelReporteRutaTransportes(sAccionBusqueda,sTipoArchivoReporte,rutatransportesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalRutaTransportes(sAccionBusqueda,sTipoArchivoReporte,rutatransportesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesRutaTransportes(sAccionBusqueda,sTipoArchivoReporte,rutatransportesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesRutaTransportes(sAccionBusqueda,sTipoArchivoReporte,rutatransportesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRutaTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<RutaTransporte> rutatransportesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rutatransporte";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RutaTransportes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRutaTransporte("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(RutaTransporte rutatransporte : rutatransportesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			RutaTransporteConstantesFunciones.generarExcelReporteDataRutaTransporte("NORMAL",row,workbook,rutatransporte,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderRutaTransporte(String sTipo,Row row,Workbook workbook) {
		
		RutaTransporteConstantesFunciones.generarExcelReporteHeaderRutaTransporte(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalRutaTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<RutaTransporte> rutatransportesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rutatransporte_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RutaTransportes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(RutaTransporte rutatransporte : rutatransportesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(RutaTransporteConstantesFunciones.getRutaTransporteDescripcion(rutatransporte));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaTransporteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rutatransporte.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaTransporteConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rutatransporte.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaTransporteConstantesFunciones.LABEL_ORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_ORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rutatransporte.getorigen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaTransporteConstantesFunciones.LABEL_DESTINO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_DESTINO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rutatransporte.getdestino());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(RutaTransporteConstantesFunciones.LABEL_PRECIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_PRECIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(rutatransporte.getprecio());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesRutaTransportes(String sAccionBusqueda,String sTipoArchivoReporte,List<RutaTransporte> rutatransportesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<RutaTransporte> rutatransportesRespaldo=null;
		
		classes=RutaTransporteConstantesFunciones.getClassesRelationshipsOfRutaTransporte(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.rutatransporteLogic.setDatosCliente(this.datosCliente);
		this.rutatransporteLogic.setDatosDeep(this.datosDeep);
		this.rutatransporteLogic.setIsConDeep(true);
		
		rutatransportesRespaldo=this.rutatransporteLogic.getRutaTransportes();
		
		this.rutatransporteLogic.setRutaTransportes(rutatransportesParaReportes);	
		this.rutatransporteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		rutatransportesParaReportes=this.rutatransporteLogic.getRutaTransportes();
		this.rutatransporteLogic.setRutaTransportes(rutatransportesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rutatransporte_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("RutaTransportes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderRutaTransporte("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(RutaTransporte rutatransporte : rutatransportesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderRutaTransporte("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			RutaTransporteConstantesFunciones.generarExcelReporteDataRutaTransporte("NORMAL",row,workbook,rutatransporte,cellStyleDataAux);
		
			
			


				//Proforma
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ProformaConstantesFunciones.SCLASSWEBTITULO))) {

				if(rutatransporte.getProformas()!=null && rutatransporte.getProformas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ProformaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ProformaConstantesFunciones.generarExcelReporteHeaderProforma("RELACIONADO",row,workbook);
				}

				if(rutatransporte.getProformas()!=null) {
					i2=0;
					for(Proforma proforma : rutatransporte.getProformas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ProformaConstantesFunciones.generarExcelReporteDataProforma("RELACIONADO",row,workbook,proforma,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//Pedido
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(PedidoConstantesFunciones.SCLASSWEBTITULO))) {

				if(rutatransporte.getPedidos()!=null && rutatransporte.getPedidos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(PedidoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					PedidoConstantesFunciones.generarExcelReporteHeaderPedido("RELACIONADO",row,workbook);
				}

				if(rutatransporte.getPedidos()!=null) {
					i2=0;
					for(Pedido pedido : rutatransporte.getPedidos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						PedidoConstantesFunciones.generarExcelReporteDataPedido("RELACIONADO",row,workbook,pedido,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}


				//ServicioTransporte
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO))) {

				if(rutatransporte.getServicioTransportes()!=null && rutatransporte.getServicioTransportes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ServicioTransporteConstantesFunciones.generarExcelReporteHeaderServicioTransporte("RELACIONADO",row,workbook);
				}

				if(rutatransporte.getServicioTransportes()!=null) {
					i2=0;
					for(ServicioTransporte serviciotransporte : rutatransporte.getServicioTransportes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ServicioTransporteConstantesFunciones.generarExcelReporteDataServicioTransporte("RELACIONADO",row,workbook,serviciotransporte,cellStyleDataAuxHijo);
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
		cell.setCellValue(RutaTransporteConstantesFunciones.getRutaTransporteDescripcion(rutatransporte));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoRutaTransporte.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessRutaTransporte() throws Exception {		
		this.startProcessRutaTransporte(true);
	}
	
	public void startProcessRutaTransporte(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasRutaTransporte ,this.jPanelParametrosReportesRutaTransporte, this.jScrollPanelDatosRutaTransporte,this.jPanelPaginacionRutaTransporte, this.jScrollPanelDatosEdicionRutaTransporte, this.jPanelAccionesRutaTransporte,this.jPanelAccionesFormularioRutaTransporte,this.jmenuBarRutaTransporte,this.jmenuBarDetalleRutaTransporte,this.jTtoolBarRutaTransporte,this.jTtoolBarDetalleRutaTransporte);		
		
		final JTabbedPane jTabbedPaneBusquedasRutaTransporte=this.jTabbedPaneBusquedasRutaTransporte; 
		
		final JPanel jPanelParametrosReportesRutaTransporte=this.jPanelParametrosReportesRutaTransporte;
		//final JScrollPane jScrollPanelDatosRutaTransporte=this.jScrollPanelDatosRutaTransporte;
		final JTable jTableDatosRutaTransporte=this.jTableDatosRutaTransporte;		
		final JPanel jPanelPaginacionRutaTransporte=this.jPanelPaginacionRutaTransporte;
		//final JScrollPane jScrollPanelDatosEdicionRutaTransporte=this.jScrollPanelDatosEdicionRutaTransporte;
		final JPanel jPanelAccionesRutaTransporte=this.jPanelAccionesRutaTransporte;
		
		JPanel jPanelCamposAuxiliarRutaTransporte=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarRutaTransporte=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			jPanelCamposAuxiliarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jPanelCamposRutaTransporte;
			jPanelAccionesFormularioAuxiliarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jPanelAccionesFormularioRutaTransporte;
		}
		
		final JPanel jPanelCamposRutaTransporte=jPanelCamposAuxiliarRutaTransporte;
		final JPanel jPanelAccionesFormularioRutaTransporte=jPanelAccionesFormularioAuxiliarRutaTransporte;
		
		
		final JMenuBar jmenuBarRutaTransporte=this.jmenuBarRutaTransporte;
		final JToolBar jTtoolBarRutaTransporte=this.jTtoolBarRutaTransporte;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarRutaTransporte=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRutaTransporte=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			jmenuBarDetalleAuxiliarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jmenuBarDetalleRutaTransporte;
			jTtoolBarDetalleAuxiliarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jTtoolBarDetalleRutaTransporte;
		}
		
		final JMenuBar jmenuBarDetalleRutaTransporte=jmenuBarDetalleAuxiliarRutaTransporte;
		final JToolBar jTtoolBarDetalleRutaTransporte=jTtoolBarDetalleAuxiliarRutaTransporte;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRutaTransporte;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRutaTransporte;
			processRunnable.jTableDatos=jTableDatosRutaTransporte;
			processRunnable.jPanelCampos=jPanelCamposRutaTransporte;
			processRunnable.jPanelPaginacion=jPanelPaginacionRutaTransporte;
			processRunnable.jPanelAcciones=jPanelAccionesRutaTransporte;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRutaTransporte;
			
			
			processRunnable.jmenuBar=jmenuBarRutaTransporte;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRutaTransporte;
			processRunnable.jTtoolBar=jTtoolBarRutaTransporte;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRutaTransporte;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRutaTransporte ,jPanelParametrosReportesRutaTransporte,jTableDatosRutaTransporte, /*jScrollPanelDatosRutaTransporte,*/jPanelCamposRutaTransporte,jPanelPaginacionRutaTransporte, /*jScrollPanelDatosEdicionRutaTransporte,*/ jPanelAccionesRutaTransporte,jPanelAccionesFormularioRutaTransporte,jmenuBarRutaTransporte,jmenuBarDetalleRutaTransporte,jTtoolBarRutaTransporte,jTtoolBarDetalleRutaTransporte);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasRutaTransporte ,jPanelParametrosReportesRutaTransporte, jScrollPanelDatosRutaTransporte,jPanelPaginacionRutaTransporte, jScrollPanelDatosEdicionRutaTransporte, jPanelAccionesRutaTransporte,jPanelAccionesFormularioRutaTransporte,jmenuBarRutaTransporte,jmenuBarDetalleRutaTransporte,jTtoolBarRutaTransporte,jTtoolBarDetalleRutaTransporte);
						
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
	
	public void finishProcessRutaTransporte() {// throws Exception 
		this.finishProcessRutaTransporte(true);
	}
	
	public void finishProcessRutaTransporte(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasRutaTransporte ,this.jPanelParametrosReportesRutaTransporte, this.jScrollPanelDatosRutaTransporte,this.jPanelPaginacionRutaTransporte, this.jScrollPanelDatosEdicionRutaTransporte, this.jPanelAccionesRutaTransporte,this.jPanelAccionesFormularioRutaTransporte,this.jmenuBarRutaTransporte,this.jmenuBarDetalleRutaTransporte,this.jTtoolBarRutaTransporte,this.jTtoolBarDetalleRutaTransporte);		
		
		final JTabbedPane jTabbedPaneBusquedasRutaTransporte=this.jTabbedPaneBusquedasRutaTransporte; 
		
		final JPanel jPanelParametrosReportesRutaTransporte=this.jPanelParametrosReportesRutaTransporte;
		//final JScrollPane jScrollPanelDatosRutaTransporte=this.jScrollPanelDatosRutaTransporte;
		final JTable jTableDatosRutaTransporte=this.jTableDatosRutaTransporte;		
		final JPanel jPanelPaginacionRutaTransporte=this.jPanelPaginacionRutaTransporte;
		//final JScrollPane jScrollPanelDatosEdicionRutaTransporte=this.jScrollPanelDatosEdicionRutaTransporte;
		final JPanel jPanelAccionesRutaTransporte=this.jPanelAccionesRutaTransporte;
		
		JPanel jPanelCamposAuxiliarRutaTransporte=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarRutaTransporte=new JPanel();
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			jPanelCamposAuxiliarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jPanelCamposRutaTransporte;
			jPanelAccionesFormularioAuxiliarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jPanelAccionesFormularioRutaTransporte;
		}
		
		final JPanel jPanelCamposRutaTransporte=jPanelCamposAuxiliarRutaTransporte;
		final JPanel jPanelAccionesFormularioRutaTransporte=jPanelAccionesFormularioAuxiliarRutaTransporte;
		
		
		final JMenuBar jmenuBarRutaTransporte=this.jmenuBarRutaTransporte;		
		final JToolBar jTtoolBarRutaTransporte=this.jTtoolBarRutaTransporte;
				
		JMenuBar jmenuBarDetalleAuxiliarRutaTransporte=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarRutaTransporte=new JToolBar();
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			jmenuBarDetalleAuxiliarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jmenuBarDetalleRutaTransporte;
			jTtoolBarDetalleAuxiliarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jTtoolBarDetalleRutaTransporte;		
		}
		
		final JMenuBar jmenuBarDetalleRutaTransporte=jmenuBarDetalleAuxiliarRutaTransporte;
		final JToolBar jTtoolBarDetalleRutaTransporte=jTtoolBarDetalleAuxiliarRutaTransporte;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasRutaTransporte;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesRutaTransporte;
			processRunnable.jTableDatos=jTableDatosRutaTransporte;
			processRunnable.jPanelCampos=jPanelCamposRutaTransporte;
			processRunnable.jPanelPaginacion=jPanelPaginacionRutaTransporte;
			processRunnable.jPanelAcciones=jPanelAccionesRutaTransporte;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioRutaTransporte;
			
			
			processRunnable.jmenuBar=jmenuBarRutaTransporte;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleRutaTransporte;
			processRunnable.jTtoolBar=jTtoolBarRutaTransporte;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleRutaTransporte;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasRutaTransporte ,jPanelParametrosReportesRutaTransporte, jTableDatosRutaTransporte,/*jScrollPanelDatosRutaTransporte,*/jPanelCamposRutaTransporte,jPanelPaginacionRutaTransporte, /*jScrollPanelDatosEdicionRutaTransporte,*/ jPanelAccionesRutaTransporte,jPanelAccionesFormularioRutaTransporte,jmenuBarRutaTransporte,jmenuBarDetalleRutaTransporte,jTtoolBarRutaTransporte,jTtoolBarDetalleRutaTransporte));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesRutaTransporte(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarRutaTransporte(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuRutaTransporte(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarRutaTransporte(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarRutaTransporte,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleRutaTransporte,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuRutaTransporte(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarRutaTransporte,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleRutaTransporte,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.rutatransporteConstantesFunciones.getsFinalQueryRutaTransporte();
		String  finalQueryPaginacionTodos=this.rutatransporteConstantesFunciones.getsFinalQueryRutaTransporte();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=RutaTransporteConstantesFunciones.getArrayColumnasGlobalesNoRutaTransporte(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=RutaTransporteConstantesFunciones.getArrayColumnasGlobalesRutaTransporte(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,RutaTransporteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.rutatransportesEliminados= new ArrayList<RutaTransporte>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessRutaTransporte();
		
				///*RutaTransporteSessionBean*/this.rutatransporteSessionBean=new RutaTransporteSessionBean();
			
			if(this.rutatransporteSessionBean==null) {
				this.rutatransporteSessionBean=new RutaTransporteSessionBean();
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
					this.iNumeroPaginacion=RutaTransporteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=RutaTransporteConstantesFunciones.getClassesForeignKeysOfRutaTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/rutatransporte."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			rutatransportesAux= new ArrayList<RutaTransporte>();
			
				
			rutatransporteLogic.setDatosCliente(this.datosCliente);
			rutatransporteLogic.setDatosDeep(this.datosDeep);
			rutatransporteLogic.setIsConDeep(true);
			
			
			rutatransporteLogic.getRutaTransporteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					rutatransporteLogic.getTodosRutaTransportes(finalQueryGlobal,pagination);
					
					//rutatransporteLogic.getTodosRutaTransportesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(rutatransporteLogic.getRutaTransportes()==null|| rutatransporteLogic.getRutaTransportes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rutatransportesAux= new ArrayList<RutaTransporte>();
							rutatransportesAux.addAll(rutatransporteLogic.getRutaTransportes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportesAux= new ArrayList<RutaTransporte>();
							rutatransportesAux.addAll(rutatransportes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rutatransporteLogic.getTodosRutaTransportes(finalQueryGlobal+"",this.pagination);												
							
							//rutatransporteLogic.getTodosRutaTransportesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteRutaTransportes("Todos",rutatransporteLogic.getRutaTransportes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							rutatransporteLogic.setRutaTransportes(new ArrayList<RutaTransporte>());					
							rutatransporteLogic.getRutaTransportes().addAll(rutatransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportes=new ArrayList<RutaTransporte>();
							rutatransportes.addAll(rutatransportesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idRutaTransporte=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idRutaTransporte=this.idActual;
				
				} else if(this.idRutaTransporteActual!=null && this.idRutaTransporteActual!=0L) {
					idRutaTransporte=idRutaTransporteActual;
				}
				
					
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndicePorId(idRutaTransporte);
				
				this.rutatransportes=new ArrayList<RutaTransporte>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					rutatransporteLogic.getEntity(idRutaTransporte);
					
					//rutatransporteLogic.getEntityWithConnection(idRutaTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutatransporteLogic.setRutaTransportes(new ArrayList<RutaTransporte>());
					rutatransporteLogic.getRutaTransportes().add(rutatransporteLogic.getRutaTransporte());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rutatransportes=new ArrayList<RutaTransporte>();
					this.rutatransportes.add(rutatransporte);
				}
				
				if(rutatransporteLogic.getRutaTransporte()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorDestino")) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutatransporteLogic.getRutaTransportesBusquedaPorDestino(finalQueryGlobal,pagination,destinoBusquedaPorDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutatransporteLogic.getRutaTransportes()==null||rutatransporteLogic.getRutaTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutatransportes==null|| rutatransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransportesAux=new ArrayList<RutaTransporte>();
						rutatransportesAux.addAll(rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportesAux=new ArrayList<RutaTransporte>();
							rutatransportesAux.addAll(rutatransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutatransporteLogic.getRutaTransportesBusquedaPorDestino(finalQueryGlobal,pagination,destinoBusquedaPorDestino);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorDestino(destinoBusquedaPorDestino);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutaTransportes("BusquedaPorDestino",rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutaTransportes("BusquedaPorDestino",rutatransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransporteLogic.setRutaTransportes(new ArrayList<RutaTransporte>());
						rutatransporteLogic.getRutaTransportes().addAll(rutatransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportes=new ArrayList<RutaTransporte>();
							rutatransportes.addAll(rutatransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombre")) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutatransporteLogic.getRutaTransportesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutatransporteLogic.getRutaTransportes()==null||rutatransporteLogic.getRutaTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutatransportes==null|| rutatransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransportesAux=new ArrayList<RutaTransporte>();
						rutatransportesAux.addAll(rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportesAux=new ArrayList<RutaTransporte>();
							rutatransportesAux.addAll(rutatransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutatransporteLogic.getRutaTransportesBusquedaPorNombre(finalQueryGlobal,pagination,nombreBusquedaPorNombre);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorNombre(nombreBusquedaPorNombre);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutaTransportes("BusquedaPorNombre",rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutaTransportes("BusquedaPorNombre",rutatransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransporteLogic.setRutaTransportes(new ArrayList<RutaTransporte>());
						rutatransporteLogic.getRutaTransportes().addAll(rutatransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportes=new ArrayList<RutaTransporte>();
							rutatransportes.addAll(rutatransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorOrigen")) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutatransporteLogic.getRutaTransportesBusquedaPorOrigen(finalQueryGlobal,pagination,origenBusquedaPorOrigen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutatransporteLogic.getRutaTransportes()==null||rutatransporteLogic.getRutaTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutatransportes==null|| rutatransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransportesAux=new ArrayList<RutaTransporte>();
						rutatransportesAux.addAll(rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportesAux=new ArrayList<RutaTransporte>();
							rutatransportesAux.addAll(rutatransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutatransporteLogic.getRutaTransportesBusquedaPorOrigen(finalQueryGlobal,pagination,origenBusquedaPorOrigen);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceBusquedaPorOrigen(origenBusquedaPorOrigen);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutaTransportes("BusquedaPorOrigen",rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutaTransportes("BusquedaPorOrigen",rutatransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransporteLogic.setRutaTransportes(new ArrayList<RutaTransporte>());
						rutatransporteLogic.getRutaTransportes().addAll(rutatransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportes=new ArrayList<RutaTransporte>();
							rutatransportes.addAll(rutatransportesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					rutatransporteLogic.getRutaTransportesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=rutatransporteLogic.getRutaTransportes()==null||rutatransporteLogic.getRutaTransportes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=rutatransportes==null|| rutatransportes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransportesAux=new ArrayList<RutaTransporte>();
						rutatransportesAux.addAll(rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportesAux=new ArrayList<RutaTransporte>();
							rutatransportesAux.addAll(rutatransportes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							rutatransporteLogic.getRutaTransportesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=RutaTransporteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteRutaTransportes("FK_IdEmpresa",rutatransporteLogic.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteRutaTransportes("FK_IdEmpresa",rutatransportes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransporteLogic.setRutaTransportes(new ArrayList<RutaTransporte>());
						rutatransporteLogic.getRutaTransportes().addAll(rutatransportesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransportes=new ArrayList<RutaTransporte>();
							rutatransportes.addAll(rutatransportesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesRutaTransporte();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessRutaTransporte();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rutatransporteLogic.getRutaTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rutatransportes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=rutatransporteLogic.getRutaTransportes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=rutatransportes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(RutaTransporte rutatransporte) {
		Boolean permite=true;
		
		if(this.rutatransporte.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=RutaTransporteConstantesFunciones.getOrderByListaRutaTransporte();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=RutaTransporteConstantesFunciones.getOrderByListaRutaTransporte();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RutaTransporte rutatransporte:rutatransporteLogic.getRutaTransportes()) {
				if(rutatransporte.getsType().equals(Constantes2.S_TOTALES)) {
					rutatransporteTotales=rutatransporte;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RutaTransporte rutatransporte:this.rutatransportes) {
				if(rutatransporte.getsType().equals(Constantes2.S_TOTALES)) {
					rutatransporteTotales=rutatransporte;
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
			this.rutatransporteAux=new RutaTransporte();
			this.rutatransporteAux.setsType(Constantes2.S_TOTALES);
			this.rutatransporteAux.setIsNew(false);
			this.rutatransporteAux.setIsChanged(false);
			this.rutatransporteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				RutaTransporteConstantesFunciones.TotalizarValoresFilaRutaTransporte(this.rutatransporteLogic.getRutaTransportes(),this.rutatransporteAux);
				
				this.rutatransporteLogic.getRutaTransportes().add(this.rutatransporteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				RutaTransporteConstantesFunciones.TotalizarValoresFilaRutaTransporte(this.rutatransportes,this.rutatransporteAux);
				
				this.rutatransportes.add(this.rutatransporteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		rutatransporteTotales=new RutaTransporte();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rutatransporteLogic.getRutaTransportes().remove(rutatransporteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.rutatransportes.remove(rutatransporteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		rutatransporteTotales=new RutaTransporte();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(RutaTransporte rutatransporte:rutatransporteLogic.getRutaTransportes()) {
				if(rutatransporte.getsType().equals(Constantes2.S_TOTALES)) {
					rutatransporteTotales=rutatransporte;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RutaTransporteConstantesFunciones.TotalizarValoresFilaRutaTransporte(this.rutatransporteLogic.getRutaTransportes(),rutatransporteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(RutaTransporte rutatransporte:this.rutatransportes) {
				if(rutatransporte.getsType().equals(Constantes2.S_TOTALES)) {
					rutatransporteTotales=rutatransporte;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				RutaTransporteConstantesFunciones.TotalizarValoresFilaRutaTransporte(this.rutatransportes,rutatransporteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getRutaTransportesBusquedaPorDestino()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorDestino";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutaTransportesBusquedaPorNombre()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombre";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutaTransportesBusquedaPorOrigen()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorOrigen";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getRutaTransportesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getRutaTransportesBusquedaPorDestino(String sFinalQuery,String destino)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutatransporteLogic.getRutaTransportesBusquedaPorDestino(sFinalQuery,this.pagination,destino);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutaTransportesBusquedaPorNombre(String sFinalQuery,String nombre)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutatransporteLogic.getRutaTransportesBusquedaPorNombre(sFinalQuery,this.pagination,nombre);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutaTransportesBusquedaPorOrigen(String sFinalQuery,String origen)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutatransporteLogic.getRutaTransportesBusquedaPorOrigen(sFinalQuery,this.pagination,origen);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getRutaTransportesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutatransporteLogic.getRutaTransportesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosRutaTransporte() {
		this.isPermisoTodoRutaTransporte=false;
		this.isPermisoNuevoRutaTransporte=false;
		this.isPermisoActualizarRutaTransporte=false;
		this.isPermisoActualizarOriginalRutaTransporte=false;
		this.isPermisoEliminarRutaTransporte=false;
		this.isPermisoGuardarCambiosRutaTransporte=false;
		this.isPermisoConsultaRutaTransporte=false;
		this.isPermisoBusquedaRutaTransporte=false;
		this.isPermisoReporteRutaTransporte=false;		
		this.isPermisoOrdenRutaTransporte=false;		
		this.isPermisoPaginacionMedioRutaTransporte=false;		
		this.isPermisoPaginacionAltoRutaTransporte=false;
		this.isPermisoPaginacionTodoRutaTransporte=false;
		this.isPermisoCopiarRutaTransporte=false;		
		this.isPermisoVerFormRutaTransporte=false;		
		this.isPermisoDuplicarRutaTransporte=false;		
		this.isPermisoOrdenRutaTransporte=false;		
	}
	
	public void setPermisosUsuarioRutaTransporte(Boolean isPermiso) {
		this.isPermisoTodoRutaTransporte=isPermiso;
		this.isPermisoNuevoRutaTransporte=isPermiso;
		this.isPermisoActualizarRutaTransporte=isPermiso;
		this.isPermisoActualizarOriginalRutaTransporte=isPermiso;
		this.isPermisoEliminarRutaTransporte=isPermiso;
		this.isPermisoGuardarCambiosRutaTransporte=isPermiso;
		this.isPermisoConsultaRutaTransporte=isPermiso;
		this.isPermisoBusquedaRutaTransporte=isPermiso;
		this.isPermisoReporteRutaTransporte=isPermiso;
		this.isPermisoOrdenRutaTransporte=isPermiso;		
		this.isPermisoPaginacionMedioRutaTransporte=isPermiso;		
		this.isPermisoPaginacionAltoRutaTransporte=isPermiso;		
		this.isPermisoPaginacionTodoRutaTransporte=isPermiso;		
		this.isPermisoCopiarRutaTransporte=isPermiso;		
		this.isPermisoVerFormRutaTransporte=isPermiso;		
		this.isPermisoDuplicarRutaTransporte=isPermiso;
		this.isPermisoOrdenRutaTransporte=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioRutaTransporte(Boolean isPermiso) {
		//this.isPermisoTodoRutaTransporte=isPermiso;
		this.isPermisoNuevoRutaTransporte=isPermiso;
		this.isPermisoActualizarRutaTransporte=isPermiso;
		this.isPermisoActualizarOriginalRutaTransporte=isPermiso;
		this.isPermisoEliminarRutaTransporte=isPermiso;
		this.isPermisoGuardarCambiosRutaTransporte=isPermiso;
		//this.isPermisoConsultaRutaTransporte=isPermiso;
		//this.isPermisoBusquedaRutaTransporte=isPermiso;
		//this.isPermisoReporteRutaTransporte=isPermiso;
		//this.isPermisoOrdenRutaTransporte=isPermiso;		
		//this.isPermisoPaginacionMedioRutaTransporte=isPermiso;		
		//this.isPermisoPaginacionAltoRutaTransporte=isPermiso;		
		//this.isPermisoPaginacionTodoRutaTransporte=isPermiso;		
		//this.isPermisoCopiarRutaTransporte=isPermiso;		
		//this.isPermisoDuplicarRutaTransporte=isPermiso;
		//this.isPermisoOrdenRutaTransporte=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioRutaTransporteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ProformaConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(PedidoConstantesFunciones.SNOMBREOPCION);
		arrPaginas.add(ServicioTransporteConstantesFunciones.SNOMBREOPCION);
		
		if(RutaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosProforma=false;
		this.isTienePermisosProforma=this.verificarGetPermisosUsuarioOpcionRutaTransporteClaseRelacionada(this.opcionsRelacionadas,ProformaConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosPedido=false;
		this.isTienePermisosPedido=this.verificarGetPermisosUsuarioOpcionRutaTransporteClaseRelacionada(this.opcionsRelacionadas,PedidoConstantesFunciones.SNOMBREOPCION);

		this.isTienePermisosServicioTransporte=false;
		this.isTienePermisosServicioTransporte=this.verificarGetPermisosUsuarioOpcionRutaTransporteClaseRelacionada(this.opcionsRelacionadas,ServicioTransporteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebRutaTransporte(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioRutaTransporteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosProforma=conPermiso;
		this.isTienePermisosPedido=conPermiso;
		this.isTienePermisosServicioTransporte=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioRutaTransporteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionRutaTransporteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioRutaTransporteClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosProforma && this.jInternalFrameDetalleFormRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.remove(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosPedido && this.jInternalFrameDetalleFormRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.remove(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.getContentPane());
		}

		if(!this.isTienePermisosServicioTransporte && this.jInternalFrameDetalleFormRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.remove(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioRutaTransporte() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(RutaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, RutaTransporteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoRutaTransporte=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarRutaTransporte=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalRutaTransporte=this.isPermisoActualizarRutaTransporte;
			this.isPermisoEliminarRutaTransporte=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosRutaTransporte=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaRutaTransporte=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaRutaTransporte=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoRutaTransporte=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteRutaTransporte=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRutaTransporte=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioRutaTransporte=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoRutaTransporte=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoRutaTransporte=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarRutaTransporte=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormRutaTransporte=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarRutaTransporte=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenRutaTransporte=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosRutaTransporte.setToolTipText(this.jTableDatosRutaTransporte.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioRutaTransporte(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioRutaTransporte(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(RutaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(RutaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioRutaTransporte() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosProforma && this.rutatransporteConstantesFunciones.mostrarProformaRutaTransporte && !RutaTransporteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Proforma");
			reporte.setsDescripcion("Proforma");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosPedido && this.rutatransporteConstantesFunciones.mostrarPedidoRutaTransporte && !RutaTransporteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Pedido");
			reporte.setsDescripcion("Pedido");
			this.tiposRelaciones.add(reporte);
		}

		if(this.isTienePermisosServicioTransporte && this.rutatransporteConstantesFunciones.mostrarServicioTransporteRutaTransporte && !RutaTransporteConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Servicio Transporte");
			reporte.setsDescripcion("Servicio Transporte");
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
	public void inicializarCombosForeignKeyRutaTransporteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyRutaTransporteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(RutaTransporteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyRutaTransporteListas(false);
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
	
	public void cargarCombosLoteForeignKeyRutaTransporteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			RutaTransporteParameterReturnGeneral rutatransporteReturnGeneral=new RutaTransporteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.rutatransporteConstantesFunciones.cargarid_empresaRutaTransporte)
					 || (this.esRecargarFks && this.rutatransporteConstantesFunciones.cargarid_empresaRutaTransporte)) {

					if(!this.rutatransporteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+rutatransporteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				rutatransporteReturnGeneral=rutatransporteLogic.cargarCombosLoteForeignKeyRutaTransporte(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=rutatransporteReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyRutaTransporte()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.rutatransporteSessionBean==null) {
				this.rutatransporteSessionBean=new RutaTransporteSessionBean();
			}

			if(!this.rutatransporteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyRutaTransporte()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyRutaTransporte(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyRutaTransporte()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyRutaTransporte();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyRutaTransporte(RutaTransporte rutatransporte)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyRutaTransporte(RutaTransporte rutatransporte,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyRutaTransporte()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyRutaTransporte()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyRutaTransporte()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyRutaTransporte()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroRutaTransporte()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyRutaTransporte()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyRutaTransporte(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyRutaTransporte()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.getItemCount()>0) {
				this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public RutaTransporteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public RutaTransporteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public RutaTransporteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.rutatransporteSessionBean=new RutaTransporteSessionBean(); 
		this.rutatransporteConstantesFunciones=new RutaTransporteConstantesFunciones(); 
		this.rutatransporteBean=new RutaTransporte();//(this.rutatransporteConstantesFunciones); 		
		this.rutatransporteReturnGeneral=new RutaTransporteParameterReturnGeneral(); 
		
		this.rutatransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rutatransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public RutaTransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public RutaTransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public RutaTransporteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessRutaTransporte(true);
			
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
			
			this.rutatransporteConstantesFunciones=new RutaTransporteConstantesFunciones(); 
			this.rutatransporteBean=new RutaTransporte();//this.rutatransporteConstantesFunciones); 			
			this.rutatransporteReturnGeneral=new RutaTransporteParameterReturnGeneral(); 
		
			RutaTransporteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Ruta Transporte Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.rutatransporte=new RutaTransporte();
			this.rutatransportes = new ArrayList<RutaTransporte>();
			this.rutatransportesAux = new ArrayList<RutaTransporte>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic=new RutaTransporteLogic();
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}
			
			//this.rutatransporteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.rutatransporteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormRutaTransporte);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoRutaTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRutaTransporte);	
					}
					
					if(this.jInternalFrameImportacionRutaTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRutaTransporte);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByRutaTransporte!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByRutaTransporte);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormRutaTransporte);
				this.jInternalFrameDetalleFormRutaTransporte.setVisible(false);
				this.jInternalFrameDetalleFormRutaTransporte.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoRutaTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRutaTransporte);
					this.jInternalFrameReporteDinamicoRutaTransporte.setVisible(false);
					this.jInternalFrameReporteDinamicoRutaTransporte.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionRutaTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionRutaTransporte);
					this.jInternalFrameImportacionRutaTransporte.setVisible(false);
					this.jInternalFrameImportacionRutaTransporte.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByRutaTransporte!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByRutaTransporte);
					this.jInternalFrameOrderByRutaTransporte.setVisible(false);
					this.jInternalFrameOrderByRutaTransporte.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idRutaTransporteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=RutaTransporteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.rutatransporteReturnGeneral=new RutaTransporteParameterReturnGeneral();
			
			this.rutatransporteParameterGeneral=new RutaTransporteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.rutatransporteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(RutaTransporteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ProformaConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(PedidoConstantesFunciones.SNOMBREOPCION);
				arrPaginas.add(ServicioTransporteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RutaTransporteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rutatransporteSessionBean.getEsGuardarRelacionado(),this.rutatransporteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,RutaTransporteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.rutatransporteSessionBean.getEsGuardarRelacionado(),this.rutatransporteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoRutaTransporte=false;
			this.isVisibilidadCeldaDuplicarRutaTransporte=true;
			this.isVisibilidadCeldaCopiarRutaTransporte=true;
			this.isVisibilidadCeldaVerFormRutaTransporte=true;
			this.isVisibilidadCeldaOrdenRutaTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;
			this.isVisibilidadCeldaModificarRutaTransporte=false;
			this.isVisibilidadCeldaActualizarRutaTransporte=false;
			this.isVisibilidadCeldaEliminarRutaTransporte=false;
			this.isVisibilidadCeldaCancelarRutaTransporte=false;
			this.isVisibilidadCeldaGuardarRutaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=false;
			
			
			this.isVisibilidadBusquedaPorDestino=true;
			this.isVisibilidadBusquedaPorNombre=true;
			this.isVisibilidadBusquedaPorOrigen=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesRutaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosRutaTransporte();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioRutaTransporte(false);
			
			this.setPermisosUsuarioRutaTransporte();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rutatransporteSessionBean.getEsGuardarRelacionado() 
				|| (this.rutatransporteSessionBean.getEsGuardarRelacionado() && this.rutatransporteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioRutaTransporteClasesRelacionadas();
			}
			
			if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioRutaTransporteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosRutaTransporte();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualRutaTransporte();
			}
			
			if(!this.isPermisoBusquedaRutaTransporte) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasRutaTransporte.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioRutaTransporte,this.isPermisoPaginacionMedioRutaTransporte,this.isPermisoPaginacionTodoRutaTransporte);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(RutaTransporteConstantesFunciones.getTiposSeleccionarRutaTransporte());
				
				this.tiposColumnasSelect=RutaTransporteConstantesFunciones.getTiposSeleccionarRutaTransporte(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectRutaTransporte();				
				//this.tiposRelacionesSelect=RutaTransporteConstantesFunciones.getTiposRelacionesRutaTransporte(true);
				
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
			//if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioRutaTransporte();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioRutaTransporte(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioRutaTransporte(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesRutaTransporte() ;
			
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
			
			
			this.proformaLogic=new ProformaLogic();
			this.pedidoLogic=new PedidoLogic();
			this.serviciotransporteLogic=new ServicioTransporteLogic(); 
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
				rutatransporteImplementable= (RutaTransporteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RutaTransporteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				rutatransporteImplementableHome= (RutaTransporteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+RutaTransporteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.rutatransportes= new ArrayList<RutaTransporte>();
			this.rutatransportesEliminados= new ArrayList<RutaTransporte>();
						
			this.isEsNuevoRutaTransporte=false;
			this.esParaAccionDesdeFormularioRutaTransporte=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyRutaTransporte(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroRutaTransporte();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			RutaTransporteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=RutaTransporteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesRutaTransporte("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingRutaTransporte(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioRutaTransporte();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioRutaTransporte();
			}
			
			RutaTransporteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasRutaTransporte.getTabCount(); i++) {
					this.jTabbedPaneBusquedasRutaTransporte.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasRutaTransporte.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessRutaTransporte(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga RutaTransporte: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectRutaTransporte() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ProformaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ProformaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(PedidoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(PedidoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);

		reporte=new Reporte();
		reporte.setsCodigo(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesRutaTransporte")) {
				iIndex=this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();	
				
				

				if(sTitle.equals("Pedidos")) {
					if(!PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRutaTransporte();

						this.cargarParteTabPanelRelacionadaPedido(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Proformas")) {
					if(!ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRutaTransporte();

						this.cargarParteTabPanelRelacionadaProforma(iIndex,intSelectedRow);
					}
					
				}

				if(sTitle.equals("Servicio Transportes")) {
					if(!ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessRutaTransporte();

						this.cargarParteTabPanelRelacionadaServicioTransporte(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessRutaTransporte();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaPedido(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRutaTransporte.cargarSessionConBeanSwingJInternalFramePedido(false,true,iIndex);
		this.jButtonPedidoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaPedido();

		//this.jTabbedPaneRelacionesRutaTransporte.updateUI();
		//this.jTabbedPaneRelacionesRutaTransporte.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRutaTransporte.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaProforma(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRutaTransporte.cargarSessionConBeanSwingJInternalFrameProforma(false,true,iIndex);
		this.jButtonProformaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaProforma();

		//this.jTabbedPaneRelacionesRutaTransporte.updateUI();
		//this.jTabbedPaneRelacionesRutaTransporte.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRutaTransporte.setSelectedIndex(iIndex);


	}

	public void cargarParteTabPanelRelacionadaServicioTransporte(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormRutaTransporte.cargarSessionConBeanSwingJInternalFrameServicioTransporte(false,true,iIndex);
		this.jButtonServicioTransporteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaServicioTransporte();

		//this.jTabbedPaneRelacionesRutaTransporte.updateUI();
		//this.jTabbedPaneRelacionesRutaTransporte.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesRutaTransporte.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Proforma")) {
				int row=this.jTableDatosRutaTransporte.getSelectedRow();
				jButtonProformaActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("Pedido")) {
				int row=this.jTableDatosRutaTransporte.getSelectedRow();
				jButtonPedidoActionPerformed(evt,row,true,false,null);
				}
				 else  if(sTipo.equals("ServicioTransporte")) {
				int row=this.jTableDatosRutaTransporte.getSelectedRow();
				jButtonServicioTransporteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Proforma")) {

					if(this.isTienePermisosProforma && this.rutatransporteConstantesFunciones.mostrarProformaRutaTransporte && !RutaTransporteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Proformas"+"("+ProformaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Proformas");

						if(rutatransporteConstantesFunciones.resaltarProformaRutaTransporte!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(rutatransporteConstantesFunciones.resaltarProformaRutaTransporte);
						}

						jmenuItem.setEnabled(this.rutatransporteConstantesFunciones.activarProformaRutaTransporte);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Proforma"));

						

						this.jInternalFrameDetalleFormRutaTransporte.jmenuDetalleRutaTransporte.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Pedido")) {

					if(this.isTienePermisosPedido && this.rutatransporteConstantesFunciones.mostrarPedidoRutaTransporte && !RutaTransporteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Pedidos"+"("+PedidoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Pedidos");

						if(rutatransporteConstantesFunciones.resaltarPedidoRutaTransporte!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(rutatransporteConstantesFunciones.resaltarPedidoRutaTransporte);
						}

						jmenuItem.setEnabled(this.rutatransporteConstantesFunciones.activarPedidoRutaTransporte);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Pedido"));

						

						this.jInternalFrameDetalleFormRutaTransporte.jmenuDetalleRutaTransporte.add(jmenuItem);

						
					}

					continue;
				}

				if(reporte.getsCodigo().equals("Servicio Transporte")) {

					if(this.isTienePermisosServicioTransporte && this.rutatransporteConstantesFunciones.mostrarServicioTransporteRutaTransporte && !RutaTransporteConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Servicio Transportes"+"("+ServicioTransporteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Servicio Transportes");

						if(rutatransporteConstantesFunciones.resaltarServicioTransporteRutaTransporte!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(rutatransporteConstantesFunciones.resaltarServicioTransporteRutaTransporte);
						}

						jmenuItem.setEnabled(this.rutatransporteConstantesFunciones.activarServicioTransporteRutaTransporte);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ServicioTransporte"));

						

						this.jInternalFrameDetalleFormRutaTransporte.jmenuDetalleRutaTransporte.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyRutaTransporte(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyRutaTransporte(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyRutaTransporte(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyRutaTransporteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyRutaTransporte();
		
		this.cargarCombosFrameForeignKeyRutaTransporte();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyRutaTransporte();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyRutaTransporte();
		}
	}
	
	
	
	public void jButtonNuevoRutaTransporteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
			
			if(jTableDatosRutaTransporte.getRowCount()>=1) {
				jTableDatosRutaTransporte.removeRowSelectionInterval(0, jTableDatosRutaTransporte.getRowCount()-1);						
			}
			
			this.isEsNuevoRutaTransporte=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoRutaTransporte(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesRutaTransporte(true);			
			//this.rutatransporte=new RutaTransporte();
			//this.rutatransporte.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRutaTransporte(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRutaTransporte() ;
			
			if(RutaTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRutaTransporte(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.rutatransporte);	
			this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);				
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
			if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar RutaTransporte: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarRutaTransporteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosRutaTransporte.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosRutaTransporte.getSelectedRows().length;			
			}
			
			rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoRutaTransporte--;			
				//RutaTransporte rutatransporteAux= new RutaTransporte();			
				//rutatransporteAux.setId(this.iIdNuevoRutaTransporte);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//RutaTransporte rutatransporteOrigen=new RutaTransporte();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(RutaTransporte rutatransporteOrigen : rutatransportesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							rutatransporteOrigen =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							rutatransporteOrigen =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaRutaTransporte();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.rutatransporte.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosRutaTransporte(rutatransporteOrigen,this.rutatransporte,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rutatransporteLogic.getRutaTransportes().add(this.rutatransporteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rutatransportes.add(this.rutatransporteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaRutaTransporte(false);
				
				this.jTableDatosRutaTransporte.setRowSelectionInterval(this.getIndiceNuevoRutaTransporte(), this.getIndiceNuevoRutaTransporte());
				
				int iLastRow =  this.jTableDatosRutaTransporte.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRutaTransporte.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRutaTransporte.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRutaTransporte(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();									
		
			RutaTransporte rutatransporteOrigen=new RutaTransporte();
			RutaTransporte rutatransporteDestino=new RutaTransporte();
				
			rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosRutaTransporte.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || rutatransportesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosRutaTransporte.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransporteOrigen =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rutatransporteOrigen =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						rutatransporteDestino =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						rutatransporteDestino =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				rutatransporteOrigen =rutatransportesSeleccionados.get(0);
				rutatransporteDestino =rutatransportesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosRutaTransporte(rutatransporteOrigen,rutatransporteDestino,true,false);
				
				rutatransporteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(rutatransporteDestino,rutatransporteLogic.getRutaTransportes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(rutatransporteDestino,rutatransportes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaRutaTransporte(false);
				
				//this.jTableDatosRutaTransporte.setRowSelectionInterval(this.getIndiceNuevoRutaTransporte(), this.getIndiceNuevoRutaTransporte());
				
				int iLastRow =  this.jTableDatosRutaTransporte.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosRutaTransporte.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosRutaTransporte.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaRutaTransporte(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormRutaTransporte.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesRutaTransporte.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasRutaTransporte.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesRutaTransporte.setVisible(!isVisible);
			this.jPanelPaginacionRutaTransporte.setVisible(!isVisible);
			this.jPanelAccionesRutaTransporte.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameRutaTransporte();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoRutaTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionRutaTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByRutaTransporte();
			
			this.abrirFrameOrderByRutaTransporte();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByRutaTransporte();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleRutaTransporte(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormRutaTransporte);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormRutaTransporte.isMaximum()) {
					this.jInternalFrameDetalleFormRutaTransporte.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormRutaTransporte.setSize(this.jInternalFrameDetalleFormRutaTransporte.iWidthFormulario,this.jInternalFrameDetalleFormRutaTransporte.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormRutaTransporte.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormRutaTransporte.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormRutaTransporte.isMaximum()) {
						this.jInternalFrameDetalleFormRutaTransporte.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormRutaTransporte.jContentPaneDetalleRutaTransporte.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormRutaTransporte.jContentPaneDetalleRutaTransporte.getWidth(),RutaTransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormRutaTransporte.jContentPaneDetalleRutaTransporte.getWidth(),RutaTransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormRutaTransporte.jContentPaneDetalleRutaTransporte.getWidth(),RutaTransporteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaPedido();
					}

					if(ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaProforma();
					}

					if(ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaServicioTransporte();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormRutaTransporte.setVisible(true);
	        this.jInternalFrameDetalleFormRutaTransporte.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByRutaTransporte() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByRutaTransporte==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByRutaTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRutaTransporte,false,this);
				} else {
					this.jInternalFrameOrderByRutaTransporte=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByRutaTransporte,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByRutaTransporte);
				this.jInternalFrameOrderByRutaTransporte.setVisible(false);
				this.jInternalFrameOrderByRutaTransporte.setSelected(false);
				
				this.jInternalFrameOrderByRutaTransporte.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRutaTransporte"));
				
				this.inicializarActualizarBindingTablaOrderByRutaTransporte();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionRutaTransporte() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionRutaTransporte==null) {
				
				this.jInternalFrameImportacionRutaTransporte=new ImportacionJInternalFrame(RutaTransporteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionRutaTransporte);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionRutaTransporte);
				this.jInternalFrameImportacionRutaTransporte.setVisible(false);
				this.jInternalFrameImportacionRutaTransporte.setSelected(false);


				this.jInternalFrameImportacionRutaTransporte.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRutaTransporte"));
				this.jInternalFrameImportacionRutaTransporte.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRutaTransporte"));
				this.jInternalFrameImportacionRutaTransporte.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRutaTransporte"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoRutaTransporte() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoRutaTransporte==null) {
				this.jInternalFrameReporteDinamicoRutaTransporte=new ReporteDinamicoJInternalFrame(RutaTransporteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoRutaTransporte);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoRutaTransporte);
				this.jInternalFrameReporteDinamicoRutaTransporte.setVisible(false);
				this.jInternalFrameReporteDinamicoRutaTransporte.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoRutaTransporte.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRutaTransporte"));
				this.jInternalFrameReporteDinamicoRutaTransporte.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRutaTransporte"));
				this.jInternalFrameReporteDinamicoRutaTransporte.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRutaTransporte"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRutaTransporte();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaPedido() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRutaTransporte.jContentPaneDetalleRutaTransporte.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaProforma() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRutaTransporte.jContentPaneDetalleRutaTransporte.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.setPreferredSize(dimension);


	}

	public void redimensionarTablaPanelRelacionadaServicioTransporte() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormRutaTransporte.jContentPaneDetalleRutaTransporte.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleRutaTransporte() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormRutaTransporte);
			
	       	this.jInternalFrameDetalleFormRutaTransporte.setVisible(false);
	        this.jInternalFrameDetalleFormRutaTransporte.setSelected(false);
			
			//this.jInternalFrameDetalleFormRutaTransporte.dispose();
			//this.jInternalFrameDetalleFormRutaTransporte=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoRutaTransporte() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoRutaTransporte.setVisible(true);
	        this.jInternalFrameReporteDinamicoRutaTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionRutaTransporte() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionRutaTransporte.setVisible(true);
	        this.jInternalFrameImportacionRutaTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByRutaTransporte() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByRutaTransporte.setVisible(true);
	        this.jInternalFrameOrderByRutaTransporte.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByRutaTransporte() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByRutaTransporte.setVisible(false);
	        this.jInternalFrameOrderByRutaTransporte.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoRutaTransporte() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoRutaTransporte.setVisible(false);
	        this.jInternalFrameReporteDinamicoRutaTransporte.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionRutaTransporte() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionRutaTransporte.setVisible(false);
	        this.jInternalFrameImportacionRutaTransporte.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarRutaTransporte(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarRutaTransporte(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesRutaTransporte(true);
			//this.isEsNuevoRutaTransporte=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesRutaTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRutaTransporte(false) ;
			
			if(rutatransporteSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaSessionBean.getEsGuardarRelacionado() && ProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonProformaActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoSessionBean.getEsGuardarRelacionado() && PedidoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonPedidoActionPerformed(null,intSelectedRow,false,true,null);
				}

				if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.getEsGuardarRelacionado() && ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonServicioTransporteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(RutaTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRutaTransporte(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRutaTransporte(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaRutaTransporteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarRutaTransporte(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesRutaTransporte(true);
			//this.isEsNuevoRutaTransporte=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.rutatransporte.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesRutaTransporte("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesRutaTransporte(false) ;
			
			if(RutaTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleRutaTransporte(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRutaTransporte(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesRutaTransporte(false);
			
			//if(!this.isEsNuevoRutaTransporte) {								
				int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);
				this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
				
			}
			
			if(this.permiteMantenimiento(this.rutatransporte)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoRutaTransporte=true;
					this.inicializarActualizarBindingTablaRutaTransporte(false);
					this.isEsNuevoRutaTransporte=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoRutaTransporte=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoRutaTransporte=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRutaTransporte(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRutaTransporte(false);
				
				this.habilitarDeshabilitarControlesRutaTransporte(false);
			
												
				
				if(RutaTransporteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleRutaTransporte();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoRutaTransporteActionPerformed(evt,rutatransporteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualRutaTransporte(this.rutatransporte,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosRutaTransporte.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,rutatransporteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.rutatransporte.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarRutaTransporteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				this.rutatransporte.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				this.rutatransporte.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.rutatransporte)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((RutaTransporteModel) this.jTableDatosRutaTransporte.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoRutaTransporte=true;
				this.inicializarActualizarBindingTablaRutaTransporte(false);
				this.isEsNuevoRutaTransporte=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesRutaTransporte(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRutaTransporte(false);
				
				this.habilitarDeshabilitarControlesRutaTransporte(false);
				
				
				
				if(RutaTransporteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleRutaTransporte();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarRutaTransporteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosRutaTransporte.getRowCount()>=1) {
				jTableDatosRutaTransporte.removeRowSelectionInterval(0, jTableDatosRutaTransporte.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesRutaTransporte(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaRutaTransporte(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesRutaTransporte(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualRutaTransporte(false) ;
			
			this.isEsNuevoRutaTransporte=false;
			
			if(RutaTransporteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleRutaTransporte();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosRutaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingRutaTransporte(false);
				
				//SI ES MANUAL
				if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualRutaTransporte();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosRutaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoRutaTransporte--;			
			//RutaTransporte rutatransporteAux= new RutaTransporte();			
			//rutatransporteAux.setId(this.iIdNuevoRutaTransporte);
			
			if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaRutaTransporte();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
			
			this.rutatransporte.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.rutatransporteLogic.getRutaTransportes().add(this.rutatransporteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.rutatransportes.add(this.rutatransporteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaRutaTransporte(false);
			
			this.jTableDatosRutaTransporte.setRowSelectionInterval(this.getIndiceNuevoRutaTransporte(), this.getIndiceNuevoRutaTransporte());
			
			int iLastRow =  this.jTableDatosRutaTransporte.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosRutaTransporte.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosRutaTransporte.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaRutaTransporte(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionRutaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingRutaTransporte(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRutaTransporte(false);
			
			//SI ES MANUAL
			if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRutaTransporte();
			}
			
			//this.abrirFrameTreeRutaTransporte();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionRutaTransporteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Ruta TransporteS ?", "MANTENIMIENTO DE Ruta Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionRutaTransporte.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralRutaTransporte();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.rutatransporteReturnGeneral=rutatransporteLogic.procesarImportacionRutaTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.rutatransporteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarRutaTransporteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionRutaTransporteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionRutaTransporte.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionRutaTransporte.setFileImportacion(this.jInternalFrameImportacionRutaTransporte.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionRutaTransporte.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionRutaTransporte.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionRutaTransporte.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionRutaTransporte.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoRutaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();		

		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("RutaTransporteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"RutaTransporteBaseDesign.jrxml";
			
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
			
			this.generarReporteRutaTransportes("Todos",rutatransportesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RutaTransporteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaTransporteConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaTransporteConstantesFunciones.LABEL_ORIGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_igen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_igen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_igen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_igen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaTransporteConstantesFunciones.LABEL_DESTINO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_stino_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_stino_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_stino_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_stino_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case RutaTransporteConstantesFunciones.LABEL_PRECIO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ecio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ecio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ecio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ecio_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoRutaTransporte.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case RutaTransporteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case RutaTransporteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case RutaTransporteConstantesFunciones.LABEL_ORIGEN:
					sNombreCampoCategoria="origen";
					break;

				case RutaTransporteConstantesFunciones.LABEL_DESTINO:
					sNombreCampoCategoria="destino";
					break;

				case RutaTransporteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoria="precio";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case RutaTransporteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case RutaTransporteConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case RutaTransporteConstantesFunciones.LABEL_ORIGEN:
					sNombreCampoCategoriaValor="origen";
					break;

				case RutaTransporteConstantesFunciones.LABEL_DESTINO:
					sNombreCampoCategoriaValor="destino";
					break;

				case RutaTransporteConstantesFunciones.LABEL_PRECIO:
					sNombreCampoCategoriaValor="precio";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case RutaTransporteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case RutaTransporteConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case RutaTransporteConstantesFunciones.LABEL_ORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"origen");
					break;

				case RutaTransporteConstantesFunciones.LABEL_DESTINO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Destino",sNombreCampoCategoria,sNombreCampoCategoriaValor,"destino");
					break;

				case RutaTransporteConstantesFunciones.LABEL_PRECIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Precio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"precio");
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
	
	public void jButtonGenerarExcelReporteDinamicoRutaTransporteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();		
		
		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rutatransporte";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("RutaTransportes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case RutaTransporteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(RutaTransporte rutatransporte:rutatransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rutatransporte.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaTransporteConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(RutaTransporte rutatransporte:rutatransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rutatransporte.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaTransporteConstantesFunciones.LABEL_ORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_ORIGEN);
					iRow++;

					for(RutaTransporte rutatransporte:rutatransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rutatransporte.getorigen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaTransporteConstantesFunciones.LABEL_DESTINO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_DESTINO);
					iRow++;

					for(RutaTransporte rutatransporte:rutatransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rutatransporte.getdestino());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case RutaTransporteConstantesFunciones.LABEL_PRECIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_PRECIO);
					iRow++;

					for(RutaTransporte rutatransporte:rutatransportesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(rutatransporte.getprecio());
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
			//	this.getFilaCabeceraExportarExcelRutaTransporte(row);				
			//	iRow++;
			//}				
			
			//for(RutaTransporte rutatransporteAux:rutatransportesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelRutaTransporte(rutatransporteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
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
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRutaTransporte(false);
			
			//SI ES MANUAL
			if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualRutaTransporte();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresRutaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRutaTransporte(false);
			
			//SI ES MANUAL
			if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRutaTransporte();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesRutaTransporteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingRutaTransporte(false);
			
			//SI ES MANUAL
			if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualRutaTransporte();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaRutaTransporte() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosRutaTransporte.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosRutaTransporte.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosRutaTransporte.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosRutaTransporte.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosRutaTransporte.setMinimumSize(dimensionMinimum);
		this.jTableDatosRutaTransporte.setMaximumSize(dimensionMaximum);
		this.jTableDatosRutaTransporte.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingRutaTransporte(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingRutaTransporte(esInicializar,true);
	}
	
	public void inicializarActualizarBindingRutaTransporte(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaRutaTransporte(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesRutaTransporte(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasRutaTransporte(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRutaTransporte(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesRutaTransporte(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualRutaTransporte() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaRutaTransporte();
		
		this.inicializarActualizarBindingBotonesManualRutaTransporte(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualRutaTransporte();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesRutaTransporte() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualRutaTransporte(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualRutaTransporte(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosRutaTransporte.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosRutaTransporte.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteRutaTransporte.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormRutaTransporte.jCheckBoxPostAccionNuevoRutaTransporte.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormRutaTransporte.jCheckBoxPostAccionSinCerrarRutaTransporte.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormRutaTransporte.jCheckBoxPostAccionSinMensajeRutaTransporte.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosRutaTransporte.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosRutaTransporte.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteRutaTransporte.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
				this.jInternalFrameDetalleFormRutaTransporte.jCheckBoxPostAccionNuevoRutaTransporte.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormRutaTransporte.jCheckBoxPostAccionSinCerrarRutaTransporte.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormRutaTransporte.jCheckBoxPostAccionSinMensajeRutaTransporte.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionRutaTransporte.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionRutaTransporte.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesRutaTransporte.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoRutaTransporte!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesRutaTransporte.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesRutaTransporte.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarRutaTransporte.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesRutaTransporte.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoRutaTransporte!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesRutaTransporte.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralRutaTransporte.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesRutaTransporte(Boolean esInicializar) throws Exception {
		try	{	
			if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualRutaTransporte(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesRutaTransporte() throws Exception {
		try	{
			if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualRutaTransporte();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRutaTransporte() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualRutaTransporte() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesRutaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesRutaTransporte.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesRutaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesRutaTransporte.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesRutaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesRutaTransporte.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionRutaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionRutaTransporte.addItem(reporte);
			}
			
			
			if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionRutaTransporte.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionRutaTransporte.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesRutaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesRutaTransporte.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesRutaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesRutaTransporte.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarRutaTransporte.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarRutaTransporte.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarRutaTransporte.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRutaTransporte();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualRutaTransporte() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRutaTransporte!=null) {
				this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoRutaTransporte!=null) {
				this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoRutaTransporte!=null) {
				
				if(this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoRutaTransporte.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoRutaTransporte.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRutaTransporte.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=RutaTransporteConstantesFunciones.getTiposSeleccionarRutaTransporte(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=RutaTransporteConstantesFunciones.getTiposSeleccionarRutaTransporte(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=RutaTransporteConstantesFunciones.getTiposSeleccionarRutaTransporte(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoRutaTransporte.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoRutaTransporte.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualRutaTransporte()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.destinoBusquedaPorDestino=this.jTextAreadestinoBusquedaPorDestinoRutaTransporte.getText();
		this.nombreBusquedaPorNombre=this.jTextAreanombreBusquedaPorNombreRutaTransporte.getText();
		this.origenBusquedaPorOrigen=this.jTextAreaorigenBusquedaPorOrigenRutaTransporte.getText();
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasRutaTransporte(Boolean esInicializar) throws Exception {				
		if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualRutaTransporte();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaRutaTransporte() throws Exception {
		this.inicializarActualizarBindingTablaRutaTransporte(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByRutaTransporte() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosRutaTransporteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaRutaTransporte(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=rutatransporteLogic.getRutaTransportes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=rutatransportes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosRutaTransporte.setModel(new RutaTransporteModel(this.rutatransporteLogic.getRutaTransportes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosRutaTransporte.setModel(new RutaTransporteModel(this.rutatransportes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByRutaTransporte!=null && this.jInternalFrameOrderByRutaTransporte.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByRutaTransporte();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosRutaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporte,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO,rutatransporteConstantesFunciones.resaltarSeleccionarRutaTransporte,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+RutaTransporteConstantesFunciones.SCLASSWEBTITULO,rutatransporteConstantesFunciones.resaltarSeleccionarRutaTransporte,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosRutaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporte,RutaTransporteConstantesFunciones.LABEL_ID));

		if(this.rutatransporteConstantesFunciones.mostraridRutaTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaTransporteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rutatransporteConstantesFunciones.resaltaridRutaTransporte,this.rutatransporteConstantesFunciones.activaridRutaTransporte,iSizeTabla,this,true,"idRutaTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutatransporteConstantesFunciones.resaltaridRutaTransporte,this.rutatransporteConstantesFunciones.activaridRutaTransporte,this,true,"idRutaTransporte","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRutaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporte,RutaTransporteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.rutatransporteConstantesFunciones.mostrarid_empresaRutaTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaTransporteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.rutatransporteConstantesFunciones.resaltarid_empresaRutaTransporte,this,this.rutatransporteConstantesFunciones.activarid_empresaRutaTransporte,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.rutatransporteConstantesFunciones.resaltarid_empresaRutaTransporte,this,this.rutatransporteConstantesFunciones.activarid_empresaRutaTransporte,false,"id_empresaRutaTransporte","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRutaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporte,RutaTransporteConstantesFunciones.LABEL_NOMBRE));

		if(this.rutatransporteConstantesFunciones.mostrarnombreRutaTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaTransporteConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rutatransporteConstantesFunciones.resaltarnombreRutaTransporte,this.rutatransporteConstantesFunciones.activarnombreRutaTransporte,iSizeTabla,this,true,"nombreRutaTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutatransporteConstantesFunciones.resaltarnombreRutaTransporte,this.rutatransporteConstantesFunciones.activarnombreRutaTransporte,this,true,"nombreRutaTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50);
			//tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRutaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporte,RutaTransporteConstantesFunciones.LABEL_ORIGEN));

		if(this.rutatransporteConstantesFunciones.mostrarorigenRutaTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaTransporteConstantesFunciones.LABEL_ORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rutatransporteConstantesFunciones.resaltarorigenRutaTransporte,this.rutatransporteConstantesFunciones.activarorigenRutaTransporte,iSizeTabla,this,true,"origenRutaTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutatransporteConstantesFunciones.resaltarorigenRutaTransporte,this.rutatransporteConstantesFunciones.activarorigenRutaTransporte,this,true,"origenRutaTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRutaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporte,RutaTransporteConstantesFunciones.LABEL_DESTINO));

		if(this.rutatransporteConstantesFunciones.mostrardestinoRutaTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaTransporteConstantesFunciones.LABEL_DESTINO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.rutatransporteConstantesFunciones.resaltardestinoRutaTransporte,this.rutatransporteConstantesFunciones.activardestinoRutaTransporte,iSizeTabla,this,true,"destinoRutaTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutatransporteConstantesFunciones.resaltardestinoRutaTransporte,this.rutatransporteConstantesFunciones.activardestinoRutaTransporte,this,true,"destinoRutaTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosRutaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporte,RutaTransporteConstantesFunciones.LABEL_PRECIO));

		if(this.rutatransporteConstantesFunciones.mostrarprecioRutaTransporte && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,RutaTransporteConstantesFunciones.LABEL_PRECIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.rutatransporteConstantesFunciones.resaltarprecioRutaTransporte,this.rutatransporteConstantesFunciones.activarprecioRutaTransporte,iSizeTabla,this,true,"precioRutaTransporte","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.rutatransporteConstantesFunciones.resaltarprecioRutaTransporte,this.rutatransporteConstantesFunciones.activarprecioRutaTransporte,this,true,"precioRutaTransporte","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new RutaTransportePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosProforma && this.rutatransporteConstantesFunciones.mostrarProformaRutaTransporte && !RutaTransporteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Proformas");
				tableColumn.setHeaderValue("Proformas");
				tableColumn.setCellRenderer(new ProformaTableCell(rutatransporteConstantesFunciones.resaltarProformaRutaTransporte,this,this.rutatransporteConstantesFunciones.activarProformaRutaTransporte));
				tableColumn.setCellEditor(new ProformaTableCell(rutatransporteConstantesFunciones.resaltarProformaRutaTransporte,this,this.rutatransporteConstantesFunciones.activarProformaRutaTransporte));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRutaTransporte.addColumn(tableColumn);
			}

			if(this.isTienePermisosPedido && this.rutatransporteConstantesFunciones.mostrarPedidoRutaTransporte && !RutaTransporteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Pedidos");
				tableColumn.setHeaderValue("Pedidos");
				tableColumn.setCellRenderer(new PedidoTableCell(rutatransporteConstantesFunciones.resaltarPedidoRutaTransporte,this,this.rutatransporteConstantesFunciones.activarPedidoRutaTransporte));
				tableColumn.setCellEditor(new PedidoTableCell(rutatransporteConstantesFunciones.resaltarPedidoRutaTransporte,this,this.rutatransporteConstantesFunciones.activarPedidoRutaTransporte));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRutaTransporte.addColumn(tableColumn);
			}

			if(this.isTienePermisosServicioTransporte && this.rutatransporteConstantesFunciones.mostrarServicioTransporteRutaTransporte && !RutaTransporteConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Servicio Transportes");
				tableColumn.setHeaderValue("Servicio Transportes");
				tableColumn.setCellRenderer(new ServicioTransporteTableCell(rutatransporteConstantesFunciones.resaltarServicioTransporteRutaTransporte,this,this.rutatransporteConstantesFunciones.activarServicioTransporteRutaTransporte));
				tableColumn.setCellEditor(new ServicioTransporteTableCell(rutatransporteConstantesFunciones.resaltarServicioTransporteRutaTransporte,this,this.rutatransporteConstantesFunciones.activarServicioTransporteRutaTransporte));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosRutaTransporte.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rutatransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rutatransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRutaTransporte.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.rutatransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.rutatransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosRutaTransporte.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.rutatransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.rutatransporteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosRutaTransporte.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.rutatransporteSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosRutaTransporte.addColumn(tableColumn);
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
			
			this.jTableDatosRutaTransporte.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.rutatransporteSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosRutaTransporte.moveColumn(this.jTableDatosRutaTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosRutaTransporte.moveColumn(this.jTableDatosRutaTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.rutatransporteSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosRutaTransporte.moveColumn(this.jTableDatosRutaTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosRutaTransporte.moveColumn(this.jTableDatosRutaTransporte.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosRutaTransporte.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosRutaTransporte.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosRutaTransporte,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosRutaTransporte.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosRutaTransporte.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosRutaTransporte.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosRutaTransporte.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosRutaTransporte.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=rutatransporteLogic.getRutaTransportes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=rutatransportes.size()-1;
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
		//this.jTableDatosRutaTransporte.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosRutaTransporte.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosRutaTransporte();
			
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
				
				//this.isEsNuevoRutaTransporte=false;
					
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
				if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormRutaTransporte==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRutaTransporte.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRutaTransporte.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.rutatransporte.getsType().equals("DUPLICADO")
				   || this.rutatransporte.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoRutaTransporte=true;
				
				} else {
					this.isEsNuevoRutaTransporte=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
					if(this.rutatransporte.getId()>=0 && !this.rutatransporte.getIsNew()) {						
						this.isEsNuevoRutaTransporte=false;
						
					} else {
						this.isEsNuevoRutaTransporte=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoRutaTransporte(esRelaciones);						
				
				this.seleccionarRutaTransporte(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.rutatransporte.getId()<0) {
					this.isEsNuevoRutaTransporte=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarRutaTransporte(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarRutaTransporte(evt,rowIndex);
				}	
				
				if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion RutaTransporte: " + this.dDif); 
					}
				}								
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarRutaTransporte(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.rutatransporte)) {
					if(this.rutatransporte.getId()>0) {
						this.rutatransporte.setIsDeleted(true);
						
						this.rutatransportesEliminados.add(this.rutatransporte);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.rutatransporteLogic.getRutaTransportes().remove(this.rutatransporte);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.rutatransportes.remove(this.rutatransporte);				
					}
					
					
					((RutaTransporteModel) this.jTableDatosRutaTransporte.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaRutaTransporte(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarRutaTransporte(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoRutaTransporte) {
			
			if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosRutaTransporte.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosRutaTransporte.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioRutaTransporte(this.rutatransporte);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.rutatransporteConstantesFunciones.cargarid_empresaRutaTransporte || this.rutatransporteConstantesFunciones.event_dependid_empresaRutaTransporte) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.rutatransporte.getid_empresa());
									//this.inicializarActualizarBindingRutaTransporte(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(rutatransporte.getEmpresa()!=null) {
							this.empresasForeignKey.add(rutatransporte.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.rutatransporte.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesRutaTransporte("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesRutaTransporte(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualRutaTransporte() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoRutaTransporte(RutaTransporte rutatransporte) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoRutaTransporte(rutatransporte,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoRutaTransporte(RutaTransporte rutatransporte,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioRutaTransporte(rutatransporte);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyRutaTransporte(rutatransporte,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyRutaTransporte(rutatransporte);
	}
	
	public void setVariablesObjetoActualToFormularioRutaTransporte(RutaTransporte rutatransporte) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.setText(rutatransporte.getId().toString());
			this.jInternalFrameDetalleFormRutaTransporte.jTextAreanombreRutaTransporte.setText(rutatransporte.getnombre());
			this.jInternalFrameDetalleFormRutaTransporte.jTextAreaorigenRutaTransporte.setText(rutatransporte.getorigen());
			this.jInternalFrameDetalleFormRutaTransporte.jTextAreadestinoRutaTransporte.setText(rutatransporte.getdestino());
			this.jInternalFrameDetalleFormRutaTransporte.jTextFieldprecioRutaTransporte.setText(rutatransporte.getprecio().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,RutaTransporte rutatransporteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,rutatransporteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,RutaTransporte rutatransporteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				rutatransporteLocal=this.rutatransporte;
			} else {
				rutatransporteLocal=this.rutatransporteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(rutatransporteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoRutaTransporte(rutatransporteLocal,true);
					
					if(rutatransporteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(rutatransporteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(rutatransporteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoRutaTransporte(RutaTransporte rutatransporte,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRutaTransporte(rutatransporte,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(rutatransporte);
	}
	
	public void setVariablesFormularioToObjetoActualRutaTransporte(RutaTransporte rutatransporte,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualRutaTransporte(rutatransporte,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualRutaTransporte(RutaTransporte rutatransporte,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.getText()==null || this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.getText()=="" || this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.getText()=="Id") {
				this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.setText("0");
			}

			if(conColumnasBase) {rutatransporte.setId(Long.parseLong(this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaTransporteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabelIdRutaTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rutatransporte.setnombre(this.jInternalFrameDetalleFormRutaTransporte.jTextAreanombreRutaTransporte.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaTransporteConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabelnombreRutaTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rutatransporte.setorigen(this.jInternalFrameDetalleFormRutaTransporte.jTextAreaorigenRutaTransporte.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaTransporteConstantesFunciones.LABEL_ORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabelorigenRutaTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rutatransporte.setdestino(this.jInternalFrameDetalleFormRutaTransporte.jTextAreadestinoRutaTransporte.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaTransporteConstantesFunciones.LABEL_DESTINO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabeldestinoRutaTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			rutatransporte.setprecio(Double.parseDouble(this.jInternalFrameDetalleFormRutaTransporte.jTextFieldprecioRutaTransporte.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+RutaTransporteConstantesFunciones.LABEL_PRECIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormRutaTransporte.jLabelprecioRutaTransporte,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualRutaTransporte(RutaTransporte rutatransporteBean,RutaTransporte rutatransporte,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosRutaTransporte(RutaTransporte rutatransporteOrigen,RutaTransporte rutatransporte,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rutatransporteOrigen.getId()!=null && !rutatransporteOrigen.getId().equals(0L))) {rutatransporte.setId(rutatransporteOrigen.getId());}}
			if(conDefault || (!conDefault && rutatransporteOrigen.getnombre()!=null && !rutatransporteOrigen.getnombre().equals(""))) {rutatransporte.setnombre(rutatransporteOrigen.getnombre());}
			if(conDefault || (!conDefault && rutatransporteOrigen.getorigen()!=null && !rutatransporteOrigen.getorigen().equals(""))) {rutatransporte.setorigen(rutatransporteOrigen.getorigen());}
			if(conDefault || (!conDefault && rutatransporteOrigen.getdestino()!=null && !rutatransporteOrigen.getdestino().equals(""))) {rutatransporte.setdestino(rutatransporteOrigen.getdestino());}
			if(conDefault || (!conDefault && rutatransporteOrigen.getprecio()!=null && !rutatransporteOrigen.getprecio().equals(0.0))) {rutatransporte.setprecio(rutatransporteOrigen.getprecio());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRutaTransporte(RutaTransporte rutatransporte) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.setText(rutatransporte.getId().toString());
			this.jInternalFrameDetalleFormRutaTransporte.jTextAreanombreRutaTransporte.setText(rutatransporte.getnombre());
			this.jInternalFrameDetalleFormRutaTransporte.jTextAreaorigenRutaTransporte.setText(rutatransporte.getorigen());
			this.jInternalFrameDetalleFormRutaTransporte.jTextAreadestinoRutaTransporte.setText(rutatransporte.getdestino());
			this.jInternalFrameDetalleFormRutaTransporte.jTextFieldprecioRutaTransporte.setText(rutatransporte.getprecio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioRutaTransporte(RutaTransporteBean rutatransporteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.setText(rutatransporteBean.getId().toString());
			this.jInternalFrameDetalleFormRutaTransporte.jTextAreanombreRutaTransporte.setText(rutatransporteBean.getnombre());
			this.jInternalFrameDetalleFormRutaTransporte.jTextAreaorigenRutaTransporte.setText(rutatransporteBean.getorigen());
			this.jInternalFrameDetalleFormRutaTransporte.jTextAreadestinoRutaTransporte.setText(rutatransporteBean.getdestino());
			this.jInternalFrameDetalleFormRutaTransporte.jTextFieldprecioRutaTransporte.setText(rutatransporteBean.getprecio().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanRutaTransporte(RutaTransporteParameterReturnGeneral rutatransporteReturnGeneral,RutaTransporteBean rutatransporteBean,Boolean conDefault) throws Exception { 
		try {
			RutaTransporte rutatransporteLocal=new RutaTransporte();
			
			rutatransporteLocal=rutatransporteReturnGeneral.getRutaTransporte();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && rutatransporteLocal.getId()!=null && !rutatransporteLocal.getId().equals(0L))) {rutatransporteBean.setId(rutatransporteLocal.getId());}}
			if(conDefault || (!conDefault && rutatransporteLocal.getnombre()!=null && !rutatransporteLocal.getnombre().equals(""))) {rutatransporteBean.setnombre(rutatransporteLocal.getnombre());}
			if(conDefault || (!conDefault && rutatransporteLocal.getorigen()!=null && !rutatransporteLocal.getorigen().equals(""))) {rutatransporteBean.setorigen(rutatransporteLocal.getorigen());}
			if(conDefault || (!conDefault && rutatransporteLocal.getdestino()!=null && !rutatransporteLocal.getdestino().equals(""))) {rutatransporteBean.setdestino(rutatransporteLocal.getdestino());}
			if(conDefault || (!conDefault && rutatransporteLocal.getprecio()!=null && !rutatransporteLocal.getprecio().equals(0.0))) {rutatransporteBean.setprecio(rutatransporteLocal.getprecio());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxRutaTransporteGenerico(Long idRutaTransporteSeleccionado,JComboBox jComboBoxRutaTransporte,List<RutaTransporte> rutatransportesLocal)throws Exception {
		try {
			RutaTransporte  rutatransporteTemp=null;

			for(RutaTransporte rutatransporteAux:rutatransportesLocal) {
				if(rutatransporteAux.getId()!=null && rutatransporteAux.getId().equals(idRutaTransporteSeleccionado)) {
					rutatransporteTemp=rutatransporteAux;
					break;
				}
			}

			jComboBoxRutaTransporte.setSelectedItem(rutatransporteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxRutaTransporteGenerico(JComboBox jComboBoxRutaTransporte,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRutaTransporte.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxRutaTransporte.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxRutaTransporte.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxRutaTransporte.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxRutaTransporte.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxRutaTransporte.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Proforma")) {
			jButtonProformaActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("Pedido")) {
			jButtonPedidoActionPerformed(evt,rowIndex,true,false,null);
		}
		 else if(sTipo.equals("ServicioTransporte")) {
			jButtonServicioTransporteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rutatransporte=(RutaTransporte) rutatransporteLogic.getRutaTransportes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rutatransporte =(RutaTransporte) rutatransportes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!rutatransporte.getIsNew() && !rutatransporte.getIsChanged() && !rutatransporte.getIsDeleted()) {
				sDescripcion=rutatransporte.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=rutatransporte.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		RutaTransporte rutatransporteRow=new RutaTransporte();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rutatransporteRow=(RutaTransporte) rutatransporteLogic.getRutaTransportes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			rutatransporteRow=(RutaTransporte) rutatransportes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonProformaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,RutaTransporte rutatransporte) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRutaTransporte==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporte = (RutaTransporte)this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.rutatransporte = (RutaTransporte)this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(rutatransporte!=null) {
						this.rutatransporte = rutatransporte;
					} else {
						this.rutatransporte = new RutaTransporte();
					}
				}

				if(this.isTienePermisosProforma && this.permiteMantenimiento(this.rutatransporte)) {
					ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFramePopup=new ProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						proformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFramePopup;
					} else {
						proformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame;
					}

					List<RutaTransporte> rutatransportes=new ArrayList<RutaTransporte>();
					rutatransportes.add(this.rutatransporte);
					if(!esRelacionado) {
						//proformaBeanSwingJInternalFrame.proformaSessionBean.setConGuardarRelaciones(false);
						//proformaBeanSwingJInternalFrame.proformaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					proformaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRutaTransporte.cargarProformaBeanSwingJInternalFrame(rutatransportes,this.rutatransporte,proformaBeanSwingJInternalFrame,/*conInicializar,*/proformaBeanSwingJInternalFrame.proformaSessionBean.getConGuardarRelaciones(),proformaBeanSwingJInternalFrame.proformaSessionBean.getEsGuardarRelacionado());
					proformaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						proformaBeanSwingJInternalFrame.actualizarEstadoPanelsProforma("no_relacionado");

						proformaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ProformaConstantesFunciones.ITAMANIOFILATABLA + (ProformaConstantesFunciones.ITAMANIOFILATABLA/2));

						proformaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRutaTransporte=(TitledBorder)this.jScrollPanelDatosRutaTransporte.getBorder();
						TitledBorder titledBorderProforma=(TitledBorder)proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.getBorder();

						titledBorderProforma.setTitle(titledBorderRutaTransporte.getTitle() + " -> Proforma");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,proformaBeanSwingJInternalFrame);
						}

						proformaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(proformaBeanSwingJInternalFrame);

						proformaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.rutatransporteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Proforma",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonPedidoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,RutaTransporte rutatransporte) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRutaTransporte==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporte = (RutaTransporte)this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.rutatransporte = (RutaTransporte)this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(rutatransporte!=null) {
						this.rutatransporte = rutatransporte;
					} else {
						this.rutatransporte = new RutaTransporte();
					}
				}

				if(this.isTienePermisosPedido && this.permiteMantenimiento(this.rutatransporte)) {
					PedidoBeanSwingJInternalFrame pedidoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFramePopup=new PedidoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						pedidoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFramePopup;
					} else {
						pedidoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame;
					}

					List<RutaTransporte> rutatransportes=new ArrayList<RutaTransporte>();
					rutatransportes.add(this.rutatransporte);
					if(!esRelacionado) {
						//pedidoBeanSwingJInternalFrame.pedidoSessionBean.setConGuardarRelaciones(false);
						//pedidoBeanSwingJInternalFrame.pedidoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					pedidoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRutaTransporte.cargarPedidoBeanSwingJInternalFrame(rutatransportes,this.rutatransporte,pedidoBeanSwingJInternalFrame,/*conInicializar,*/pedidoBeanSwingJInternalFrame.pedidoSessionBean.getConGuardarRelaciones(),pedidoBeanSwingJInternalFrame.pedidoSessionBean.getEsGuardarRelacionado());
					pedidoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						pedidoBeanSwingJInternalFrame.actualizarEstadoPanelsPedido("no_relacionado");

						pedidoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(PedidoConstantesFunciones.ITAMANIOFILATABLA + (PedidoConstantesFunciones.ITAMANIOFILATABLA/2));

						pedidoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRutaTransporte=(TitledBorder)this.jScrollPanelDatosRutaTransporte.getBorder();
						TitledBorder titledBorderPedido=(TitledBorder)pedidoBeanSwingJInternalFrame.jScrollPanelDatosPedido.getBorder();

						titledBorderPedido.setTitle(titledBorderRutaTransporte.getTitle() + " -> Pedido");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,pedidoBeanSwingJInternalFrame);
						}

						pedidoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(pedidoBeanSwingJInternalFrame);

						pedidoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.rutatransporteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Pedido",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonServicioTransporteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,RutaTransporte rutatransporte) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormRutaTransporte==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporte = (RutaTransporte)this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.rutatransporte = (RutaTransporte)this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(rutatransporte!=null) {
						this.rutatransporte = rutatransporte;
					} else {
						this.rutatransporte = new RutaTransporte();
					}
				}

				if(this.isTienePermisosServicioTransporte && this.permiteMantenimiento(this.rutatransporte)) {
					ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFramePopup=new ServicioTransporteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						serviciotransporteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFramePopup;
					} else {
						serviciotransporteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame;
					}

					List<RutaTransporte> rutatransportes=new ArrayList<RutaTransporte>();
					rutatransportes.add(this.rutatransporte);
					if(!esRelacionado) {
						//serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setConGuardarRelaciones(false);
						//serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					serviciotransporteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormRutaTransporte.cargarServicioTransporteBeanSwingJInternalFrame(rutatransportes,this.rutatransporte,serviciotransporteBeanSwingJInternalFrame,/*conInicializar,*/serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.getConGuardarRelaciones(),serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.getEsGuardarRelacionado());
					serviciotransporteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						serviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioTransporte("no_relacionado");

						serviciotransporteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ServicioTransporteConstantesFunciones.ITAMANIOFILATABLA + (ServicioTransporteConstantesFunciones.ITAMANIOFILATABLA/2));

						serviciotransporteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderRutaTransporte=(TitledBorder)this.jScrollPanelDatosRutaTransporte.getBorder();
						TitledBorder titledBorderServicioTransporte=(TitledBorder)serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.getBorder();

						titledBorderServicioTransporte.setTitle(titledBorderRutaTransporte.getTitle() + " -> Servicio Transporte");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,serviciotransporteBeanSwingJInternalFrame);
						}

						serviciotransporteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(serviciotransporteBeanSwingJInternalFrame);

						serviciotransporteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.rutatransporteSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Servicio Transporte",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualRutaTransporte(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoRutaTransporte.setVisible((this.isVisibilidadCeldaNuevoRutaTransporte && this.isPermisoNuevoRutaTransporte));			
			this.jButtonDuplicarRutaTransporte.setVisible((this.isVisibilidadCeldaDuplicarRutaTransporte && this.isPermisoDuplicarRutaTransporte));			
			this.jButtonCopiarRutaTransporte.setVisible((this.isVisibilidadCeldaCopiarRutaTransporte && this.isPermisoCopiarRutaTransporte));
			this.jButtonVerFormRutaTransporte.setVisible((this.isVisibilidadCeldaVerFormRutaTransporte && this.isPermisoVerFormRutaTransporte));
			
			this.jButtonAbrirOrderByRutaTransporte.setVisible((this.isVisibilidadCeldaOrdenRutaTransporte && this.isPermisoOrdenRutaTransporte));			
			
			this.jButtonNuevoRelacionesRutaTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesRutaTransporte && this.isPermisoNuevoRutaTransporte));			
			this.jButtonNuevoGuardarCambiosRutaTransporte.setVisible((this.isVisibilidadCeldaNuevoRutaTransporte && this.isPermisoNuevoRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));
			
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonModificarRutaTransporte.setVisible((this.isVisibilidadCeldaModificarRutaTransporte && this.isPermisoActualizarRutaTransporte));	
			this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarRutaTransporte.setVisible((this.isVisibilidadCeldaActualizarRutaTransporte && this.isPermisoActualizarRutaTransporte));	
			this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarRutaTransporte.setVisible((this.isVisibilidadCeldaEliminarRutaTransporte && this.isPermisoEliminarRutaTransporte));
			this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarRutaTransporte.setVisible(this.isVisibilidadCeldaCancelarRutaTransporte);							
			this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosRutaTransporte.setVisible((this.isVisibilidadCeldaGuardarRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));			
			
			}
						
			this.jButtonGuardarCambiosTablaRutaTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaNuevoRutaTransporte && this.isPermisoNuevoRutaTransporte));						
			this.jButtonDuplicarToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaDuplicarRutaTransporte && this.isPermisoDuplicarRutaTransporte));						
			this.jButtonCopiarToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaCopiarRutaTransporte && this.isPermisoCopiarRutaTransporte));			
			this.jButtonVerFormToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaVerFormRutaTransporte && this.isPermisoVerFormRutaTransporte));			
			this.jButtonAbrirOrderByToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaOrdenRutaTransporte && this.isPermisoOrdenRutaTransporte));
			this.jButtonNuevoRelacionesToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesRutaTransporte && this.isPermisoNuevoRutaTransporte));			
			this.jButtonNuevoGuardarCambiosToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaNuevoRutaTransporte && this.isPermisoNuevoRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));			
			
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonModificarToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaModificarRutaTransporte && this.isPermisoActualizarRutaTransporte));	
			this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaActualizarRutaTransporte  && this.isPermisoActualizarRutaTransporte));	
			this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaEliminarRutaTransporte && this.isPermisoEliminarRutaTransporte));
			this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarToolBarRutaTransporte.setVisible(this.isVisibilidadCeldaCancelarRutaTransporte);				
			this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaGuardarRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarRutaTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoRutaTransporte.setVisible((this.isVisibilidadCeldaNuevoRutaTransporte && this.isPermisoNuevoRutaTransporte));			
			this.jMenuItemDuplicarRutaTransporte.setVisible((this.isVisibilidadCeldaDuplicarRutaTransporte && this.isPermisoDuplicarRutaTransporte));			
			this.jMenuItemCopiarRutaTransporte.setVisible((this.isVisibilidadCeldaCopiarRutaTransporte && this.isPermisoCopiarRutaTransporte));			
			this.jMenuItemVerFormRutaTransporte.setVisible((this.isVisibilidadCeldaVerFormRutaTransporte && this.isPermisoVerFormRutaTransporte));			
			this.jMenuItemAbrirOrderByRutaTransporte.setVisible((this.isVisibilidadCeldaOrdenRutaTransporte && this.isPermisoOrdenRutaTransporte));			
			//this.jMenuItemMostrarOcultarRutaTransporte.setVisible((this.isVisibilidadCeldaOrdenRutaTransporte && this.isPermisoOrdenRutaTransporte));
			this.jMenuItemDetalleAbrirOrderByRutaTransporte.setVisible((this.isVisibilidadCeldaOrdenRutaTransporte && this.isPermisoOrdenRutaTransporte));			
			//this.jMenuItemDetalleMostrarOcultarRutaTransporte.setVisible((this.isVisibilidadCeldaOrdenRutaTransporte && this.isPermisoOrdenRutaTransporte));			
			this.jMenuItemNuevoRelacionesRutaTransporte.setVisible((this.isVisibilidadCeldaNuevoRelacionesRutaTransporte && this.isPermisoNuevoRutaTransporte));			
			this.jMenuItemNuevoGuardarCambiosRutaTransporte.setVisible((this.isVisibilidadCeldaNuevoRutaTransporte && this.isPermisoNuevoRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));									
			
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.jMenuItemModificarRutaTransporte.setVisible((this.isVisibilidadCeldaModificarRutaTransporte && this.isPermisoActualizarRutaTransporte));	
			this.jInternalFrameDetalleFormRutaTransporte.jMenuItemActualizarRutaTransporte.setVisible((this.isVisibilidadCeldaActualizarRutaTransporte && this.isPermisoActualizarRutaTransporte));	
			this.jInternalFrameDetalleFormRutaTransporte.jMenuItemEliminarRutaTransporte.setVisible((this.isVisibilidadCeldaEliminarRutaTransporte && this.isPermisoEliminarRutaTransporte));
			this.jInternalFrameDetalleFormRutaTransporte.jMenuItemCancelarRutaTransporte.setVisible(this.isVisibilidadCeldaCancelarRutaTransporte);				
			}
			
			this.jMenuItemGuardarCambiosRutaTransporte.setVisible((this.isVisibilidadCeldaGuardarRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));						
			this.jMenuItemGuardarCambiosTablaRutaTransporte.setVisible((this.isVisibilidadCeldaGuardarCambiosRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoRutaTransporte=this.jButtonNuevoRutaTransporte.isVisible();
			this.isVisibilidadCeldaDuplicarRutaTransporte=this.jButtonDuplicarRutaTransporte.isVisible();
			this.isVisibilidadCeldaCopiarRutaTransporte=this.jButtonCopiarRutaTransporte.isVisible();
			this.isVisibilidadCeldaVerFormRutaTransporte=this.jButtonVerFormRutaTransporte.isVisible();
			
			this.isVisibilidadCeldaOrdenRutaTransporte=this.jButtonAbrirOrderByRutaTransporte.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=this.jButtonNuevoRelacionesRutaTransporte.isVisible();
			this.isVisibilidadCeldaModificarRutaTransporte=this.jButtonModificarRutaTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			this.isVisibilidadCeldaActualizarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarRutaTransporte.isVisible();
			this.isVisibilidadCeldaEliminarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarRutaTransporte.isVisible();
			this.isVisibilidadCeldaCancelarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarRutaTransporte.isVisible();
			this.isVisibilidadCeldaGuardarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosRutaTransporte.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=this.jButtonGuardarCambiosTablaRutaTransporte.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoRutaTransporte=this.jButtonNuevoToolBarRutaTransporte.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=this.jButtonNuevoRelacionesToolBarRutaTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			this.isVisibilidadCeldaModificarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jButtonModificarToolBarRutaTransporte.isVisible();
			this.isVisibilidadCeldaActualizarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarToolBarRutaTransporte.isVisible();
			this.isVisibilidadCeldaEliminarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarToolBarRutaTransporte.isVisible();
			this.isVisibilidadCeldaCancelarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarToolBarRutaTransporte.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRutaTransporte=this.jButtonGuardarCambiosToolBarRutaTransporte.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=this.jButtonGuardarCambiosTablaToolBarRutaTransporte.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoRutaTransporte=this.jMenuItemNuevoRutaTransporte.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=this.jMenuItemNuevoRelacionesRutaTransporte.isVisible();
			
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			this.isVisibilidadCeldaModificarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jMenuItemModificarRutaTransporte.isVisible();
			this.isVisibilidadCeldaActualizarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jMenuItemActualizarRutaTransporte.isVisible();
			this.isVisibilidadCeldaEliminarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jMenuItemEliminarRutaTransporte.isVisible();
			this.isVisibilidadCeldaCancelarRutaTransporte=this.jInternalFrameDetalleFormRutaTransporte.jMenuItemCancelarRutaTransporte.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarRutaTransporte=this.jMenuItemGuardarCambiosRutaTransporte.isVisible();
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=this.jMenuItemGuardarCambiosTablaRutaTransporte.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesRutaTransporte(Boolean esInicializar) {
		if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {
				//if(this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesRutaTransporte();
			}
			
			this.inicializarActualizarBindingBotonesManualRutaTransporte(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualRutaTransporte() {
		this.jButtonNuevoRutaTransporte.setVisible(this.isPermisoNuevoRutaTransporte);			
		this.jButtonDuplicarRutaTransporte.setVisible(this.isPermisoDuplicarRutaTransporte);			
		this.jButtonCopiarRutaTransporte.setVisible(this.isPermisoCopiarRutaTransporte);			
		this.jButtonVerFormRutaTransporte.setVisible(this.isPermisoVerFormRutaTransporte);			
		
		this.jButtonAbrirOrderByRutaTransporte.setVisible(this.isPermisoOrdenRutaTransporte);					
		
		this.jButtonNuevoRelacionesRutaTransporte.setVisible(this.isPermisoNuevoRutaTransporte);			
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonModificarRutaTransporte.setVisible(this.isPermisoActualizarRutaTransporte);	
			this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarRutaTransporte.setVisible(this.isPermisoActualizarRutaTransporte);	
			this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarRutaTransporte.setVisible(this.isPermisoEliminarRutaTransporte);
			this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarRutaTransporte.setVisible(this.isVisibilidadCeldaCancelarRutaTransporte);						
			this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosRutaTransporte.setVisible(this.isPermisoGuardarCambiosRutaTransporte);							
		}
		
		this.jButtonGuardarCambiosTablaRutaTransporte.setVisible(this.isPermisoActualizarRutaTransporte);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleRutaTransporte() {
		this.jInternalFrameDetalleFormRutaTransporte.jButtonModificarRutaTransporte.setVisible(this.isPermisoActualizarRutaTransporte);	
		this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarRutaTransporte.setVisible(this.isPermisoActualizarRutaTransporte);	
		this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarRutaTransporte.setVisible(this.isPermisoEliminarRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarRutaTransporte.setVisible(this.isVisibilidadCeldaCancelarRutaTransporte);							
		this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosRutaTransporte.setVisible((this.isVisibilidadCeldaGuardarRutaTransporte && this.isPermisoGuardarCambiosRutaTransporte));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosRutaTransporte() {
		if(RutaTransporteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualRutaTransporte();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesRutaTransporte() {
	}
	
	public void jTableDatosRutaTransporteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarRutaTransporte(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidRutaTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRutaTransporte(this.getrutatransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rutatransporte==null) {
						this.rutatransporte = new RutaTransporte();
					}

					this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
				}

				if(this.rutatransporte.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.rutatransporte.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRutaTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaRutaTransporteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebRutaTransporte(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosRutaTransporte.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosRutaTransporte.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualRutaTransporte(this.getrutatransporte(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.rutatransporteLogic.getConnexion());

				if(this.rutatransporte.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.rutatransporte.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderRutaTransporte=(TitledBorder)this.jScrollPanelDatosRutaTransporte.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderRutaTransporte.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaRutaTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRutaTransporte(this.getrutatransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rutatransporte==null) {
						this.rutatransporte = new RutaTransporte();
					}

					this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
				}

				if(this.rutatransporte.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.rutatransporte.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRutaTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreRutaTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRutaTransporte(this.getrutatransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rutatransporte==null) {
						this.rutatransporte = new RutaTransporte();
					}

					this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
				}

				if(this.rutatransporte.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.rutatransporte.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRutaTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonorigenRutaTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRutaTransporte(this.getrutatransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rutatransporte==null) {
						this.rutatransporte = new RutaTransporte();
					}

					this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
				}

				if(this.rutatransporte.getorigen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where origen like '%"+this.rutatransporte.getorigen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRutaTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondestinoRutaTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRutaTransporte(this.getrutatransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rutatransporte==null) {
						this.rutatransporte = new RutaTransporte();
					}

					this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
				}

				if(this.rutatransporte.getdestino()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where destino like '%"+this.rutatransporte.getdestino()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRutaTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonprecioRutaTransporteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualRutaTransporte(this.getrutatransporte(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.rutatransporte==null) {
						this.rutatransporte = new RutaTransporte();
					}

					this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);
				}

				if(this.rutatransporte.getprecio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where precio = "+this.rutatransporte.getprecio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingRutaTransporte(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorDestinoRutaTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRutaTransporte(false,false);

			this.getRutaTransportesBusquedaPorDestino();

			this.inicializarActualizarBindingRutaTransporte(false);

			//if(RutaTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRutaTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreRutaTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRutaTransporte(false,false);

			this.getRutaTransportesBusquedaPorNombre();

			this.inicializarActualizarBindingRutaTransporte(false);

			//if(RutaTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRutaTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorOrigenRutaTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRutaTransporte(false,false);

			this.getRutaTransportesBusquedaPorOrigen();

			this.inicializarActualizarBindingRutaTransporte(false);

			//if(RutaTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRutaTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaRutaTransporteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingRutaTransporte(false,false);

			this.getRutaTransportesFK_IdEmpresa();

			this.inicializarActualizarBindingRutaTransporte(false);

			//if(RutaTransporteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingRutaTransporte(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.rutatransporteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameRutaTransporte() {
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
		

		if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFramePopup=null;
		}

		if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
			this.jInternalFrameDetalleFormRutaTransporte.setVisible(false);	    			
			this.jInternalFrameDetalleFormRutaTransporte.dispose();
			this.jInternalFrameDetalleFormRutaTransporte=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoRutaTransporte!=null) {
			this.jInternalFrameReporteDinamicoRutaTransporte.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoRutaTransporte.dispose();
			this.jInternalFrameReporteDinamicoRutaTransporte=null;
		}
		
		if(this.jInternalFrameImportacionRutaTransporte!=null) {
			this.jInternalFrameImportacionRutaTransporte.setVisible(false);	    			
			this.jInternalFrameImportacionRutaTransporte.dispose();
			this.jInternalFrameImportacionRutaTransporte=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessRutaTransporte();
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
			
			if(sTipo.equals("NuevoRutaTransporte")) {
				jButtonNuevoRutaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarRutaTransporte")) {
				jButtonDuplicarRutaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarRutaTransporte")) {
				jButtonCopiarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("VerFormRutaTransporte")) {
				jButtonVerFormRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarRutaTransporte")) {
				jButtonNuevoRutaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarRutaTransporte")) {
				jButtonDuplicarRutaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoRutaTransporte")) {
				jButtonNuevoRutaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarRutaTransporte")) {
				jButtonDuplicarRutaTransporteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesRutaTransporte")) {
				jButtonNuevoRutaTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarRutaTransporte")) {
				jButtonNuevoRutaTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesRutaTransporte")) {
				jButtonNuevoRutaTransporteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarRutaTransporte")) {
				jButtonModificarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarRutaTransporte")) {
				jButtonModificarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarRutaTransporte")) {
				jButtonModificarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarRutaTransporte")) {
				jButtonActualizarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarRutaTransporte")) {
				jButtonActualizarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarRutaTransporte")) {
				jButtonActualizarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("EliminarRutaTransporte")) {
				jButtonEliminarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarRutaTransporte")) {
				jButtonEliminarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarRutaTransporte")) {
				jButtonEliminarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CancelarRutaTransporte")) {
				jButtonCancelarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarRutaTransporte")) {
				jButtonCancelarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarRutaTransporte")) {
				jButtonCancelarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CerrarRutaTransporte")) {
				jButtonCerrarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarRutaTransporte")) {
				jButtonCerrarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarRutaTransporte")) {
				jButtonCerrarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarRutaTransporte")) {
				jButtonMostrarOcultarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarRutaTransporte")) {
				jButtonCancelarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosRutaTransporte")) {
				jButtonGuardarCambiosRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarRutaTransporte")) {
				jButtonGuardarCambiosRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarRutaTransporte")) {
				jButtonCopiarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarRutaTransporte")) {
				jButtonVerFormRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosRutaTransporte")) {
				jButtonGuardarCambiosRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarRutaTransporte")) {
				jButtonCopiarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormRutaTransporte")) {
				jButtonVerFormRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaRutaTransporte")) {
				jButtonGuardarCambiosRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarRutaTransporte")) {
				jButtonGuardarCambiosRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaRutaTransporte")) {
				jButtonGuardarCambiosRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionRutaTransporte")) {
				jButtonRecargarInformacionRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarRutaTransporte")) {
				jButtonRecargarInformacionRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionRutaTransporte")) {
				jButtonRecargarInformacionRutaTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresRutaTransporte")) {
				jButtonAnterioresRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarRutaTransporte")) {
				jButtonAnterioresRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreRutaTransporte")) {
				jButtonAnterioresRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesRutaTransporte")) {
				jButtonSiguientesRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarRutaTransporte")) {
				jButtonSiguientesRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesRutaTransporte")) {
				jButtonSiguientesRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByRutaTransporte") || sTipo.equals("MenuItemDetalleAbrirOrderByRutaTransporte")) {
				jButtonAbrirOrderByRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarRutaTransporte") || sTipo.equals("MenuItemDetalleMostrarOcultarRutaTransporte")) {
				jButtonMostrarOcultarRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosRutaTransporte")) {
				jButtonNuevoGuardarCambiosRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarRutaTransporte")) {
				jButtonNuevoGuardarCambiosRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosRutaTransporte")) {
				jButtonNuevoGuardarCambiosRutaTransporteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoRutaTransporte")) {
				jButtonCerrarReporteDinamicoRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoRutaTransporte")) {
				jButtonGenerarReporteDinamicoRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoRutaTransporte")) {
				
				jButtonGenerarExcelReporteDinamicoRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionRutaTransporte")) {
				jButtonCerrarImportacionRutaTransporteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionRutaTransporte")) {
				
				jButtonGenerarImportacionRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionRutaTransporte")) {
				
				jButtonAbrirImportacionRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesRutaTransporte")) {
				jComboBoxTiposAccionesRutaTransporteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesRutaTransporte")) {
				jComboBoxTiposRelacionesRutaTransporteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioRutaTransporte")) {
				jComboBoxTiposAccionesRutaTransporteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarRutaTransporte")) {
				
				jComboBoxTiposSeleccionarRutaTransporteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralRutaTransporte")) {
				jTextFieldValorCampoGeneralRutaTransporteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByRutaTransporte")) {
				jButtonAbrirOrderByRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarRutaTransporte")) {
				jButtonAbrirOrderByRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByRutaTransporte")) {
				jButtonCerrarOrderByRutaTransporteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRutaTransporteBusqueda")) {
				this.jButtonidRutaTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRutaTransporteUpdate")) {
				this.jButtonid_empresaRutaTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRutaTransporteBusqueda")) {
				this.jButtonid_empresaRutaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRutaTransporteBusqueda")) {
				this.jButtonnombreRutaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("origenRutaTransporteBusqueda")) {
				this.jButtonorigenRutaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("destinoRutaTransporteBusqueda")) {
				this.jButtondestinoRutaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioRutaTransporteBusqueda")) {
				this.jButtonprecioRutaTransporteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("BusquedaPorDestinoRutaTransporte")) {
				this.jButtonBusquedaPorDestinoRutaTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreRutaTransporte")) {
				this.jButtonBusquedaPorNombreRutaTransporteActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorOrigenRutaTransporte")) {
				this.jButtonBusquedaPorOrigenRutaTransporteActionPerformed(evt);
			}
			
			;
			
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessRutaTransporte();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaTransporteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				


				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			RutaTransporte rutatransporteLocal=null;
			
			if(!this.getEsControlTabla()) {
				rutatransporteLocal=this.rutatransporte;
			} else {
				rutatransporteLocal=this.rutatransporteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
							
				
				


				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
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
			
			


			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaTransporteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
								
						
				


				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
								
				
				


				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaTransporteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
							
				
				


				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaTransporteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporteAnterior =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rutatransporteAnterior =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
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
			
			


			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaTransporteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
								
				
				


				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaTransporteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
			
			this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaTransporteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosRutaTransporte")) {
					jCheckBoxSeleccionarTodosRutaTransporteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosRutaTransporte")) {
					jCheckBoxSeleccionadosRutaTransporteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarRutaTransporte")) {
					
				}
				
				


				
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
												
				
				


				
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaTransporteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.rutatransporteAnterior =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.rutatransporteAnterior =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaTransporteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
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
			
			


			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaRutaTransporteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.rutatransporte);
				
				this.actualizarInformacion("INFO_PADRE",false,this.rutatransporte);
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
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
				
				


				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(RutaTransporte.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",RutaTransporte.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaRutaTransporteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.rutatransporteAnterior =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarRutaTransporte")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosRutaTransporteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosRutaTransporte.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.rutatransporte =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.rutatransporte =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.rutatransporte);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarRutaTransporte")) {
				
				}
				
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarRutaTransporte")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosRutaTransporte.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarRutaTransporte")) {
			
			}
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessRutaTransporte();
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
			if(sTipo.equals("NuevoRutaTransporte")) {
				jButtonNuevoRutaTransporteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarRutaTransporte")) {
				jButtonDuplicarRutaTransporteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarRutaTransporte")) {
				jButtonCopiarRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormRutaTransporte")) {
				jButtonVerFormRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesRutaTransporte")) {
				jButtonNuevoRutaTransporteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarRutaTransporte")) {
				jButtonModificarRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarRutaTransporte")) {
				jButtonActualizarRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarRutaTransporte")) {
				jButtonEliminarRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaRutaTransporte")) {
				jButtonGuardarCambiosRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarRutaTransporte")) {
				jButtonCancelarRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarRutaTransporte")) {
				jButtonCerrarRutaTransporteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosRutaTransporte")) {
				jButtonGuardarCambiosRutaTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosRutaTransporte")) {
				jButtonNuevoGuardarCambiosRutaTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByRutaTransporte")) {
				jButtonAbrirOrderByRutaTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionRutaTransporte")) {
				jButtonRecargarInformacionRutaTransporteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresRutaTransporte")) {
				jButtonAnterioresRutaTransporteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesRutaTransporte")) {
				jButtonSiguientesRutaTransporteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idRutaTransporteBusqueda")) {
				this.jButtonidRutaTransporteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaRutaTransporteUpdate")) {
				this.jButtonid_empresaRutaTransporteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaRutaTransporteBusqueda")) {
				this.jButtonid_empresaRutaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreRutaTransporteBusqueda")) {
				this.jButtonnombreRutaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("origenRutaTransporteBusqueda")) {
				this.jButtonorigenRutaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("destinoRutaTransporteBusqueda")) {
				this.jButtondestinoRutaTransporteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("precioRutaTransporteBusqueda")) {
				this.jButtonprecioRutaTransporteBusquedaActionPerformed(evt);
			}
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessRutaTransporte();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameRutaTransporte")) {
				closingInternalFrameRutaTransporte();
				
			} else if(sTipo.equals("jButtonCancelarRutaTransporte")) {
				JInternalFrameBase jInternalFrameDetalleFormRutaTransporte = (JInternalFrameBase)evt.getSource();
	            	
	            RutaTransporteBeanSwingJInternalFrame jInternalFrameParent=(RutaTransporteBeanSwingJInternalFrame)jInternalFrameDetalleFormRutaTransporte.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarRutaTransporteActionPerformed(null);
			}
			
			RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.rutatransporte,new Object(),this.rutatransporteParameterGeneral,this.rutatransporteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormRutaTransporte(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormRutaTransporte(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormRutaTransporte(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.rutatransporte)) {
			if(!esControlTabla) {
				if(RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);			
				}
				
				if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualRutaTransporte(this.rutatransporte,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rutatransporteReturnGeneral=rutatransporteLogic.procesarEventosRutaTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rutatransporteLogic.getRutaTransportes(),this.rutatransporte,this.rutatransporteParameterGeneral,this.isEsNuevoRutaTransporte,classes);//this.rutatransporteLogic.getRutaTransporte()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanRutaTransporte(this.rutatransporteReturnGeneral,this.rutatransporteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanRutaTransporte(classes,this.rutatransporteReturnGeneral,this.rutatransporteBean,false);
					}
						
					if(this.rutatransporteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyRutaTransporte(this.rutatransporteReturnGeneral.getRutaTransporte());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioRutaTransporte(this.rutatransporteReturnGeneral.getRutaTransporte());	
					}
						
					if(this.rutatransporteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioRutaTransporte(this.rutatransporteReturnGeneral.getRutaTransporte(),classes);//this.rutatransporteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioRutaTransporte(this.rutatransporte,classes);//this.rutatransporteBean);									
				}
			
				if(RutaTransporteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualRutaTransporte(this.rutatransporte,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysRutaTransporte(this.rutatransporte);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.rutatransporteAnterior!=null) {
						this.rutatransporte=this.rutatransporteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.rutatransporteReturnGeneral=rutatransporteLogic.procesarEventosRutaTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rutatransporteLogic.getRutaTransportes(),this.rutatransporte,this.rutatransporteParameterGeneral,this.isEsNuevoRutaTransporte,classes);//this.rutatransporteLogic.getRutaTransporte()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.rutatransporteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.rutatransporteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.rutatransporteReturnGeneral.getRutaTransporte(),rutatransporteLogic.getRutaTransportes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.rutatransporteReturnGeneral.getRutaTransporte(),this.rutatransportes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosRutaTransporte.repaint();
				
				//((AbstractTableModel) this.jTableDatosRutaTransporte.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosRutaTransporte();
			}
		}
	}
	
	public void actualizarVisualTableDatosRutaTransporte() throws Exception {
		
		RutaTransporteModel rutatransporteModel=(RutaTransporteModel)this.jTableDatosRutaTransporte.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			rutatransporteModel.rutatransportes=this.rutatransporteLogic.getRutaTransportes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			rutatransporteModel.rutatransportes=this.rutatransportes;
		}
		
		
		((RutaTransporteModel) this.jTableDatosRutaTransporte.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaRutaTransporte() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getrutatransporteAnterior(),this.rutatransporteLogic.getRutaTransportes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getrutatransporteAnterior(),this.rutatransportes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosRutaTransporte();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioRutaTransporte(RutaTransporte rutatransporte,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Proforma.class)) {
					this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(rutatransporte.getProformas());
					this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Pedido.class)) {
					this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(rutatransporte.getPedidos());
					this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ServicioTransporte.class)) {
					this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(rutatransporte.getServicioTransportes());
					this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioTransporte(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
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
										
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rutatransporte,new Object(),generalEntityParameterGeneral,this.rutatransporteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.rutatransporteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=RutaTransporteConstantesFunciones.getClassesRelationshipsOfRutaTransporte(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=RutaTransporteConstantesFunciones.getClassesRelationshipsFromStringsOfRutaTransporte(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormRutaTransporte(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				RutaTransporteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.rutatransporte,new Object(),generalEntityParameterGeneral,this.rutatransporteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioRutaTransporte(RutaTransporteBean rutatransporteBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Proforma.class)) {
					this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.setProformas(rutatransporte.getProformas());
					this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Pedido.class)) {
					this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.setPedidos(rutatransporte.getPedidos());
					this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPedido(false);
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ServicioTransporte.class)) {
					this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(rutatransporte.getServicioTransportes());
					this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioTransporte(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanRutaTransporte(ArrayList<Classe> classes,RutaTransporteReturnGeneral rutatransporteReturnGeneral,RutaTransporteBean rutatransporteBean,Boolean conDefault) throws Exception {
		
			this.rutatransporteBean.setProformas(rutatransporteReturnGeneral.getRutaTransporte().getProformas());
			this.rutatransporteBean.setPedidos(rutatransporteReturnGeneral.getRutaTransporte().getPedidos());
			this.rutatransporteBean.setServicioTransportes(rutatransporteReturnGeneral.getRutaTransporte().getServicioTransportes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualRutaTransporte(RutaTransporte rutatransporte,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Proforma.class)) {
					rutatransporte.setProformas(this.jInternalFrameDetalleFormRutaTransporte.proformaBeanSwingJInternalFrame.proformaLogic.getProformas());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(Pedido.class)) {
					rutatransporte.setPedidos(this.jInternalFrameDetalleFormRutaTransporte.pedidoBeanSwingJInternalFrame.pedidoLogic.getPedidos());
					break;
				}
			}
			for(Classe clas:classes) {
				if(clas.clas.equals(ServicioTransporte.class)) {
					rutatransporte.setServicioTransportes(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
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
		if(!paraTabla && !this.permiteMantenimiento(this.rutatransporte)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormRutaTransporte = new RutaTransporteDetalleFormJInternalFrame(jDesktopPane,this.rutatransporteSessionBean.getConGuardarRelaciones(),this.rutatransporteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.setVisible(false);
		this.jInternalFrameDetalleFormRutaTransporte.setSelected(false);						
		
		this.jInternalFrameDetalleFormRutaTransporte.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormRutaTransporte.rutatransporteLogic=this.rutatransporteLogic;
		
		this.cargarCombosFrameForeignKeyRutaTransporte("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleRutaTransporte();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleRutaTransporte();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyRutaTransporte("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyRutaTransporte();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormRutaTransporte.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRutaTransporte"));
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonModificarRutaTransporte.addActionListener(new ButtonActionListener(this,"ModificarRutaTransporte"));

		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonModificarToolBarRutaTransporte.addActionListener(new ButtonActionListener(this,"ModificarToolBarRutaTransporte"));
					
		this.jInternalFrameDetalleFormRutaTransporte.jMenuItemModificarRutaTransporte.addActionListener(new ButtonActionListener(this,"MenuItemModificarRutaTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarRutaTransporte.addActionListener (new ButtonActionListener(this,"ActualizarRutaTransporte"));
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarToolBarRutaTransporte.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRutaTransporte"));
						
		this.jInternalFrameDetalleFormRutaTransporte.jMenuItemActualizarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRutaTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarRutaTransporte.addActionListener (new ButtonActionListener(this,"EliminarRutaTransporte"));
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"EliminarToolBarRutaTransporte"));
								
		this.jInternalFrameDetalleFormRutaTransporte.jMenuItemEliminarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRutaTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarRutaTransporte.addActionListener (new ButtonActionListener(this,"CancelarRutaTransporte"));
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"CancelarToolBarRutaTransporte"));
					
		this.jInternalFrameDetalleFormRutaTransporte.jMenuItemCancelarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRutaTransporte"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jMenuItemDetalleCerrarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRutaTransporte"));		
		
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRutaTransporte"));
		
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRutaTransporte"));
		
		
		
		this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRutaTransporte"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonidRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idRutaTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRutaTransporte.jButtonid_empresaRutaTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRutaTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonid_empresaRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonnombreRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"nombreRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonorigenRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"origenRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtondestinoRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"destinoRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonprecioRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"precioRutaTransporteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRutaTransporte"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameRutaTransporte"));
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarRutaTransporte"));
		}
		
		this.jTableDatosRutaTransporte.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarRutaTransporte"));
		
		this.jTableDatosRutaTransporte.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarRutaTransporte"));
		
		this.jButtonNuevoRutaTransporte.addActionListener(new ButtonActionListener(this,"NuevoRutaTransporte"));
		
		this.jButtonDuplicarRutaTransporte.addActionListener(new ButtonActionListener(this,"DuplicarRutaTransporte"));
		
		this.jButtonCopiarRutaTransporte.addActionListener(new ButtonActionListener(this,"CopiarRutaTransporte"));
		
		this.jButtonVerFormRutaTransporte.addActionListener(new ButtonActionListener(this,"VerFormRutaTransporte"));
		
		
		this.jButtonNuevoToolBarRutaTransporte.addActionListener(new ButtonActionListener(this,"NuevoToolBarRutaTransporte"));
			
		this.jButtonDuplicarToolBarRutaTransporte.addActionListener(new ButtonActionListener(this,"DuplicarToolBarRutaTransporte"));
			
		this.jMenuItemNuevoRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemNuevoRutaTransporte"));
			
		this.jMenuItemDuplicarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarRutaTransporte"));		
		
		
		this.jButtonNuevoRelacionesRutaTransporte.addActionListener (new ButtonActionListener(this,"NuevoRelacionesRutaTransporte"));
		
		
		this.jButtonNuevoRelacionesToolBarRutaTransporte.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarRutaTransporte"));
			
		this.jMenuItemNuevoRelacionesRutaTransporte.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesRutaTransporte"));		
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonModificarRutaTransporte.addActionListener(new ButtonActionListener(this,"ModificarRutaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonModificarToolBarRutaTransporte.addActionListener(new ButtonActionListener(this,"ModificarToolBarRutaTransporte"));
			
			this.jInternalFrameDetalleFormRutaTransporte.jMenuItemModificarRutaTransporte.addActionListener(new ButtonActionListener(this,"MenuItemModificarRutaTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarRutaTransporte.addActionListener (new ButtonActionListener(this,"ActualizarRutaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonActualizarToolBarRutaTransporte.addActionListener(new ButtonActionListener(this,"ActualizarToolBarRutaTransporte"));
				
			this.jInternalFrameDetalleFormRutaTransporte.jMenuItemActualizarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemActualizarRutaTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarRutaTransporte.addActionListener (new ButtonActionListener(this,"EliminarRutaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonEliminarToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"EliminarToolBarRutaTransporte"));
						
			this.jInternalFrameDetalleFormRutaTransporte.jMenuItemEliminarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemEliminarRutaTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarRutaTransporte.addActionListener (new ButtonActionListener(this,"CancelarRutaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonCancelarToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"CancelarToolBarRutaTransporte"));
			
			this.jInternalFrameDetalleFormRutaTransporte.jMenuItemCancelarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCancelarRutaTransporte"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarRutaTransporte"));		
		
		
		this.jButtonCerrarRutaTransporte.addActionListener (new ButtonActionListener(this,"CerrarRutaTransporte"));
		
		
		this.jButtonCerrarToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"CerrarToolBarRutaTransporte"));
			
		this.jMenuItemCerrarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCerrarRutaTransporte"));
			
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jMenuItemDetalleCerrarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarRutaTransporte"));		
		}
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosRutaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosRutaTransporte"));
		}
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarRutaTransporte"));
		}
		
		this.jButtonCopiarToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"CopiarToolBarRutaTransporte"));
			
		this.jButtonVerFormToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"VerFormToolBarRutaTransporte"));
		
		this.jMenuItemGuardarCambiosRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosRutaTransporte"));
			
		this.jMenuItemCopiarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemCopiarRutaTransporte"));		
		
		this.jMenuItemVerFormRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemVerFormRutaTransporte"));		
		
		
		this.jButtonGuardarCambiosTablaRutaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRutaTransporte"));
		
		
		this.jButtonGuardarCambiosTablaToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarRutaTransporte"));
			
		this.jMenuItemGuardarCambiosTablaRutaTransporte.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaRutaTransporte"));		
		
		
		
		this.jButtonRecargarInformacionRutaTransporte.addActionListener (new ButtonActionListener(this,"RecargarInformacionRutaTransporte"));
					
		this.jButtonRecargarInformacionToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarRutaTransporte"));
		
		this.jMenuItemRecargarInformacionRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionRutaTransporte"));		
		
		
		
		this.jButtonAnterioresRutaTransporte.addActionListener (new ButtonActionListener(this,"AnterioresRutaTransporte"));
		
		
		this.jButtonAnterioresToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"AnterioresToolBarRutaTransporte"));
		
		this.jMenuItemAnterioresRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresRutaTransporte"));		
		
		
		this.jButtonSiguientesRutaTransporte.addActionListener (new ButtonActionListener(this,"SiguientesRutaTransporte"));
		
		
		this.jButtonSiguientesToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"SiguientesToolBarRutaTransporte"));
			
		this.jMenuItemSiguientesRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesRutaTransporte"));
			
		this.jMenuItemAbrirOrderByRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByRutaTransporte"));
			
		this.jMenuItemMostrarOcultarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarRutaTransporte"));
			
		this.jMenuItemDetalleAbrirOrderByRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByRutaTransporte"));
			
		this.jMenuItemDetalleMostarOcultarRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarRutaTransporte"));		
		
		
		this.jButtonNuevoGuardarCambiosRutaTransporte.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosRutaTransporte"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarRutaTransporte"));
			
		this.jMenuItemNuevoGuardarCambiosRutaTransporte.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosRutaTransporte"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosRutaTransporte.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosRutaTransporte"));

		this.jCheckBoxSeleccionadosRutaTransporte.addItemListener(new CheckBoxItemListener(this,"SeleccionadosRutaTransporte"));
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRutaTransporte"));
		}
		
		
		this.jComboBoxTiposRelacionesRutaTransporte.addActionListener (new ButtonActionListener(this,"TiposRelacionesRutaTransporte"));
			
		this.jComboBoxTiposAccionesRutaTransporte.addActionListener (new ButtonActionListener(this,"TiposAccionesRutaTransporte"));
					
		this.jComboBoxTiposSeleccionarRutaTransporte.addActionListener (new ButtonActionListener(this,"TiposSeleccionarRutaTransporte"));
			
		this.jTextFieldValorCampoGeneralRutaTransporte.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralRutaTransporte"));		
		
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonidRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idRutaTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRutaTransporte.jButtonid_empresaRutaTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRutaTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonid_empresaRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonnombreRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"nombreRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonorigenRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"origenRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtondestinoRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"destinoRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonprecioRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"precioRutaTransporteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorDestinoRutaTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorDestinoRutaTransporte"));

			this.jButtonBusquedaPorNombreRutaTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreRutaTransporte"));

			this.jButtonBusquedaPorOrigenRutaTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorOrigenRutaTransporte"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoRutaTransporte!=null) {
				this.jInternalFrameReporteDinamicoRutaTransporte.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRutaTransporte"));
				this.jInternalFrameReporteDinamicoRutaTransporte.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRutaTransporte"));
				this.jInternalFrameReporteDinamicoRutaTransporte.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRutaTransporte"));
			}
			
			//this.jButtonCerrarReporteDinamicoRutaTransporte.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoRutaTransporte"));				
			//this.jButtonGenerarReporteDinamicoRutaTransporte.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoRutaTransporte"));
			//this.jButtonGenerarExcelReporteDinamicoRutaTransporte.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoRutaTransporte"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionRutaTransporte!=null) {
				this.jInternalFrameImportacionRutaTransporte.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionRutaTransporte"));
				this.jInternalFrameImportacionRutaTransporte.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionRutaTransporte"));
				this.jInternalFrameImportacionRutaTransporte.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionRutaTransporte"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByRutaTransporte.addActionListener (new ButtonActionListener(this,"AbrirOrderByRutaTransporte"));
			
			this.jButtonAbrirOrderByToolBarRutaTransporte.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarRutaTransporte"));			
			
			if(this.jInternalFrameOrderByRutaTransporte!=null) {
				this.jInternalFrameOrderByRutaTransporte.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByRutaTransporte"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormRutaTransporte.jTabbedPaneRelacionesRutaTransporte.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesRutaTransporte"));
		
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
            		closingInternalFrameRutaTransporte();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormRutaTransporte.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormRutaTransporte = (JInternalFrameBase)event.getSource();
	            	
	            RutaTransporteBeanSwingJInternalFrame jInternalFrameParent=(RutaTransporteBeanSwingJInternalFrame)jInternalFrameDetalleFormRutaTransporte.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarRutaTransporteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosRutaTransporte.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosRutaTransporteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosRutaTransporte.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosRutaTransporte.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaTransporteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRutaTransporte";
		inputMap = this.jButtonNuevoRutaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRutaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRutaTransporteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoRutaTransporteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesRutaTransporte";
		inputMap = this.jButtonNuevoRelacionesRutaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesRutaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoRutaTransporteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarRutaTransporte";
		inputMap = this.jButtonModificarRutaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarRutaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarRutaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarRutaTransporte";
		inputMap = this.jButtonActualizarRutaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarRutaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarRutaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarRutaTransporte";
		inputMap = this.jButtonEliminarRutaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarRutaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarRutaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarRutaTransporte";
		inputMap = this.jButtonCancelarRutaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarRutaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarRutaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarRutaTransporte";
		inputMap = this.jButtonCerrarRutaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarRutaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarRutaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosRutaTransporte";
		inputMap = this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosRutaTransporte.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormRutaTransporte.jButtonGuardarCambiosRutaTransporte.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosRutaTransporteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosRutaTransporte.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosRutaTransporteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesRutaTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesRutaTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarRutaTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarRutaTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralRutaTransporte.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralRutaTransporteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonidRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"idRutaTransporteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormRutaTransporte.jButtonid_empresaRutaTransporteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaRutaTransporteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonid_empresaRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonnombreRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"nombreRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonorigenRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"origenRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtondestinoRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"destinoRutaTransporteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormRutaTransporte.jButtonprecioRutaTransporteBusqueda.addActionListener(new ButtonActionListener(this,"precioRutaTransporteBusqueda"));
		
		
		this.jButtonBusquedaPorDestinoRutaTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorDestinoRutaTransporte"));

		this.jButtonBusquedaPorNombreRutaTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreRutaTransporte"));

		this.jButtonBusquedaPorOrigenRutaTransporte.addActionListener(new ButtonActionListener(this,"BusquedaPorOrigenRutaTransporte"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionRutaTransporte.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionRutaTransporteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarRutaTransporteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarRutaTransporte.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosRutaTransporte(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(RutaTransporte rutatransporteAux:this.rutatransporteLogic.getRutaTransportes()) {
					rutatransporteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RutaTransporte rutatransporteAux:rutatransportes) {
					rutatransporteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosRutaTransporteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRutaTransporte(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RutaTransporte rutatransporteAux:this.rutatransporteLogic.getRutaTransportes()) {
						rutatransporteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RutaTransporte rutatransporteAux:rutatransportes) {
						rutatransporteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(RutaTransporte rutatransporteAux:this.rutatransporteLogic.getRutaTransportes()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RutaTransporte rutatransporteAux:rutatransportes) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaRutaTransporte(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRutaTransporte.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRutaTransporte.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporte,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosRutaTransporteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingRutaTransporte(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosRutaTransporte.getSelectedRows();
			
			RutaTransporte rutatransporteLocal=new RutaTransporte();
			
			//this.seleccionarTodosRutaTransporte(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					rutatransporteLocal =(RutaTransporte) this.rutatransporteLogic.getRutaTransportes().toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					rutatransporteLocal =(RutaTransporte) this.rutatransportes.toArray()[this.jTableDatosRutaTransporte.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				rutatransporteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(RutaTransporte rutatransporteAux:this.rutatransporteLogic.getRutaTransportes()) {
						rutatransporteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(RutaTransporte rutatransporteAux:rutatransportes) {
						rutatransporteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaRutaTransporte(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosRutaTransporte.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosRutaTransporte.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosRutaTransporte,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualRutaTransporteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarRutaTransporteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralRutaTransporteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingRutaTransporte(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralRutaTransporte.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(RutaTransporte rutatransporteAux:this.rutatransporteLogic.getRutaTransportes()) {
				
						if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							rutatransporteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_ORIGEN)) {
							existe=true;
							rutatransporteAux.setorigen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_DESTINO)) {
							existe=true;
							rutatransporteAux.setdestino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							rutatransporteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RutaTransporte rutatransporteAux:rutatransportes) {
					
						if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							rutatransporteAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_ORIGEN)) {
							existe=true;
							rutatransporteAux.setorigen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_DESTINO)) {
							existe=true;
							rutatransporteAux.setdestino(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_PRECIO)) {
							existe=true;
							rutatransporteAux.setprecio(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaRutaTransporte(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesRutaTransporteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingRutaTransporte(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioRutaTransporte=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesRutaTransporte.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteRutaTransporte) {				
					conSplash=true;//false;										
					
					//this.startProcessRutaTransporte(conSplash);
				
					this.generarReporteRutaTransportesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoRutaTransportesSeleccionados();
				//this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRutaTransportesSeleccionados(false);
				//this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoRutaTransportesSeleccionados(true);
				//this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRutaTransporte();
				
				this.exportarRutaTransportesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionRutaTransportes();
				//this.importarRutaTransportes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessRutaTransporte();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelRutaTransportesSeleccionados();
				//this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Ruta Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessRutaTransporte();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoRutaTransporte)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyRutaTransporte(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.setSelectedIndex(0);					
				}	
			} 			
			else if(RutaTransporteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteRutaTransporte) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessRutaTransporte(conSplash);
					
						//this.actualizarParametrosGeneralRutaTransporte();
						
						this.generarReporteProcesoAccionRutaTransportesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(RutaTransporteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Ruta TransporteS SELECCIONADOS?", "MANTENIMIENTO DE Ruta Transporte", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessRutaTransporte();
				
						this.actualizarParametrosGeneralRutaTransporte();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.rutatransporteReturnGeneral=rutatransporteLogic.procesarAccionRutaTransportesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.rutatransporteLogic.getRutaTransportes(),this.rutatransporteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarRutaTransporteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralRutaTransporte();
					
					RutaTransporteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarRutaTransporteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesRutaTransporte.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormRutaTransporte.jComboBoxTiposAccionesFormularioRutaTransporte.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessRutaTransporte(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesRutaTransporteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessRutaTransporte();
			
			if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();		
			RutaTransporte rutatransporte=new RutaTransporte();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingRutaTransporte(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesRutaTransporte.getSelectedItem();
			
			
			
			
			rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
			//this.sTipoAccion;
			
			if(rutatransportesSeleccionados.size()==1) {
				for(RutaTransporte rutatransporteAux:rutatransportesSeleccionados) {
					rutatransporte=rutatransporteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Proforma")) {
					jButtonProformaActionPerformed(null,rowIndex,true,false,rutatransporte);
				}
				else if(this.sTipoRelacion.equals("Pedido")) {
					jButtonPedidoActionPerformed(null,rowIndex,true,false,rutatransporte);
				}
				else if(this.sTipoRelacion.equals("Servicio Transporte")) {
					jButtonServicioTransporteActionPerformed(null,rowIndex,true,false,rutatransporte);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessRutaTransporte();
			
      		//this.finishProcessRutaTransporte(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarRutaTransporteReturnGeneral() throws Exception {
		if(this.rutatransporteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.rutatransporteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.rutatransporteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.rutatransporteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.rutatransporteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.rutatransporteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingRutaTransporte(false);
		}
		
		if(this.rutatransporteReturnGeneral.getConRetornoLista() || this.rutatransporteReturnGeneral.getConRetornoObjeto()) {
			if(this.rutatransporteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rutatransporteLogic.setRutaTransportes(this.rutatransporteReturnGeneral.getRutaTransportes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.rutatransporteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.rutatransporteLogic.setRutaTransporte(this.rutatransporteReturnGeneral.getRutaTransporte());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingRutaTransporte(false);
		}
	}
	
	public void actualizarParametrosGeneralRutaTransporte() throws Exception {
		
		
	}
	
	public ArrayList<RutaTransporte> getRutaTransportesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioRutaTransporte) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(RutaTransporte rutatransporteAux:rutatransporteLogic.getRutaTransportes()) {
					if(rutatransporteAux.getIsSelected()) {
						rutatransportesSeleccionados.add(rutatransporteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(RutaTransporte rutatransporteAux:this.rutatransportes) {
					if(rutatransporteAux.getIsSelected()) {
						rutatransportesSeleccionados.add(rutatransporteAux);				
					}
				}
			}
			
			if(rutatransportesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						rutatransportesSeleccionados.addAll(this.rutatransporteLogic.getRutaTransportes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						rutatransportesSeleccionados.addAll(this.rutatransportes);				
					}
				}
			}
		} else {
			rutatransportesSeleccionados.add(this.rutatransporte);
		}
		
		return rutatransportesSeleccionados;
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
	
	public void generarReporteRutaTransportesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalRutaTransportesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoRutaTransportesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRutaTransportesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoRutaTransportesSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesRutaTransportesSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Ruta Transporte",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesRutaTransportesSeleccionados() throws Exception {
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();		
		
		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteRutaTransportes("Todos",rutatransportesSeleccionados);
		
	}	
	
	public void generarReporteNormalRutaTransportesSeleccionados() throws Exception {
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();		
		
		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteRutaTransportes("Todos",rutatransportesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionRutaTransportesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();
		
		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteRutaTransportes("Todos",rutatransportesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoRutaTransportesSeleccionados() throws Exception {
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();		
		
		
		this.abrirInicializarFrameReporteDinamicoRutaTransporte();
		
		
		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoRutaTransporte();
		
		
		//this.generarReporteRutaTransportes("Todos",rutatransportesSeleccionados ,rutatransporteImplementable,rutatransporteImplementableHome);
	}
	
	public void mostrarImportacionRutaTransportes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionRutaTransporte();
		
		this.abrirFrameImportacionRutaTransporte();		
		
			
		//this.generarReporteRutaTransportes("Todos",rutatransportesSeleccionados ,rutatransporteImplementable,rutatransporteImplementableHome);
	}
	
	public void importarRutaTransportes() throws Exception {		
	
	}
	
	public void exportarRutaTransportesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelRutaTransportesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoRutaTransportesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlRutaTransportesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Ruta Transporte",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoRutaTransportesSeleccionados() throws Exception {
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();		
		
		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rutatransporte."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarRutaTransporte(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(RutaTransporte rutatransporteAux:rutatransportesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarRutaTransporte(rutatransporteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//rutatransporteAux.setsDetalleGeneralEntityReporte(rutatransporteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarRutaTransporte(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=RutaTransporteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaTransporteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaTransporteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaTransporteConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaTransporteConstantesFunciones.LABEL_ORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaTransporteConstantesFunciones.LABEL_DESTINO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=RutaTransporteConstantesFunciones.LABEL_PRECIO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarRutaTransporte(RutaTransporte rutatransporte,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=rutatransporte.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=rutatransporte.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=rutatransporte.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rutatransporte.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rutatransporte.getorigen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rutatransporte.getdestino();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=rutatransporte.getprecio().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelRutaTransportesSeleccionados() throws Exception {
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();		
		
		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rutatransporte.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("RutaTransportes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelRutaTransporte(row);				
				iRow++;
			}				
			
			for(RutaTransporte rutatransporteAux:rutatransportesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelRutaTransporte(rutatransporteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlRutaTransportesSeleccionados() throws Exception {
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();		
		
		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"rutatransporte.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("rutatransportes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("rutatransporte");
			//elementRoot.appendChild(element);
		
			for(RutaTransporte rutatransporteAux:rutatransportesSeleccionados) {
				element = document.createElement("rutatransporte");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlRutaTransporte(rutatransporteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Ruta Transporte",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelRutaTransporte(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_ORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_DESTINO);
		cell = row.createCell(iColumn++);cell.setCellValue(RutaTransporteConstantesFunciones.LABEL_PRECIO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelRutaTransporte(RutaTransporte rutatransporte,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(rutatransporte.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(rutatransporte.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(rutatransporte.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(rutatransporte.getorigen());
		cell = row.createCell(iColumn++);cell.setCellValue(rutatransporte.getdestino());
		cell = row.createCell(iColumn++);cell.setCellValue(rutatransporte.getprecio());				
	}
	
	public void setFilaDatosExportarXmlRutaTransporte(RutaTransporte rutatransporte,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(RutaTransporteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(rutatransporte.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(RutaTransporteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(rutatransporte.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(RutaTransporteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(rutatransporte.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementnombre = document.createElement(RutaTransporteConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(rutatransporte.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementorigen = document.createElement(RutaTransporteConstantesFunciones.ORIGEN);
		elementorigen.appendChild(document.createTextNode(rutatransporte.getorigen().trim()));
		element.appendChild(elementorigen);

		Element elementdestino = document.createElement(RutaTransporteConstantesFunciones.DESTINO);
		elementdestino.appendChild(document.createTextNode(rutatransporte.getdestino().trim()));
		element.appendChild(elementdestino);

		Element elementprecio = document.createElement(RutaTransporteConstantesFunciones.PRECIO);
		elementprecio.appendChild(document.createTextNode(rutatransporte.getprecio().toString().trim()));
		element.appendChild(elementprecio);
	}
	
	public void generarReporteGroupGenericoRutaTransportesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<RutaTransporte> rutatransportesSeleccionados=new ArrayList<RutaTransporte>();
		
		rutatransportesSeleccionados=this.getRutaTransportesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoRutaTransporte(rutatransportesSeleccionados);
		
		this.generarReporteRutaTransportes("Todos",rutatransportesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoRutaTransporte(ArrayList<RutaTransporte> rutatransportesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(RutaTransporte rutatransporteAux:rutatransportesSeleccionados) {
				rutatransporteAux.setsDetalleGeneralEntityReporte(rutatransporteAux.toString());
			
				if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					rutatransporteAux.setsDescripcionGeneralEntityReporte1(rutatransporteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					rutatransporteAux.setsDescripcionGeneralEntityReporte1(rutatransporteAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_ORIGEN)) {
					existe=true;
					rutatransporteAux.setsDescripcionGeneralEntityReporte1(rutatransporteAux.getorigen());
				}
				 else if(sTipoSeleccionar.equals(RutaTransporteConstantesFunciones.LABEL_DESTINO)) {
					existe=true;
					rutatransporteAux.setsDescripcionGeneralEntityReporte1(rutatransporteAux.getdestino());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,RutaTransporteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesRutaTransporte(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoRutaTransporte=true;
				this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=true;
				this.isVisibilidadCeldaGuardarCambiosRutaTransporte=true;
			}
			
			this.isVisibilidadCeldaModificarRutaTransporte=false;
			this.isVisibilidadCeldaActualizarRutaTransporte=false;
			this.isVisibilidadCeldaEliminarRutaTransporte=false;
			this.isVisibilidadCeldaCancelarRutaTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRutaTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoRutaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=false;
			this.isVisibilidadCeldaModificarRutaTransporte=false;
			this.isVisibilidadCeldaActualizarRutaTransporte=true;
			this.isVisibilidadCeldaEliminarRutaTransporte=false;
			this.isVisibilidadCeldaCancelarRutaTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRutaTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoRutaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=false;
			this.isVisibilidadCeldaModificarRutaTransporte=false;
			this.isVisibilidadCeldaActualizarRutaTransporte=true;
			this.isVisibilidadCeldaEliminarRutaTransporte=true;
			this.isVisibilidadCeldaCancelarRutaTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRutaTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoRutaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=false;
			this.isVisibilidadCeldaModificarRutaTransporte=false;
			this.isVisibilidadCeldaActualizarRutaTransporte=true;
			this.isVisibilidadCeldaEliminarRutaTransporte=false;
			this.isVisibilidadCeldaCancelarRutaTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoRutaTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=true;
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=true;
			this.isVisibilidadCeldaModificarRutaTransporte=false;
			this.isVisibilidadCeldaActualizarRutaTransporte=false;
			this.isVisibilidadCeldaEliminarRutaTransporte=false;
			this.isVisibilidadCeldaCancelarRutaTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRutaTransporte=true;
				} else {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoRutaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=false;
			this.isVisibilidadCeldaActualizarRutaTransporte=false;
			this.isVisibilidadCeldaEliminarRutaTransporte=false;
			this.isVisibilidadCeldaCancelarRutaTransporte=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoRutaTransporte=false;
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=false;
			this.isVisibilidadCeldaModificarRutaTransporte=true;
			this.isVisibilidadCeldaActualizarRutaTransporte=false;
			this.isVisibilidadCeldaEliminarRutaTransporte=false;
			this.isVisibilidadCeldaCancelarRutaTransporte=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				} else {
					this.isVisibilidadCeldaGuardarRutaTransporte=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(RutaTransporteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoRutaTransporte=true;
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=true;
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=true;
		} else {
			this.actualizarEstadoPanelsRutaTransporte(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarRutaTransporte=false;
			//this.isVisibilidadCeldaVerFormRutaTransporte=false;
			this.isVisibilidadCeldaDuplicarRutaTransporte=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!rutatransporteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;
		} else {
			this.isVisibilidadCeldaNuevoRutaTransporte=false;
			this.isVisibilidadCeldaGuardarCambiosRutaTransporte=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(rutatransporteSessionBean.getEsGuardarRelacionado()) {
			if(!rutatransporteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;												
			}
			
			this.jButtonCerrarRutaTransporte.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesRutaTransporte=false;
		}
		
		if(!this.permiteMantenimiento(this.rutatransporte)) {
			this.isVisibilidadCeldaActualizarRutaTransporte=false;
			this.isVisibilidadCeldaEliminarRutaTransporte=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesRutaTransporte() {
		this.isVisibilidadCeldaNuevoRutaTransporte=false;
		this.isVisibilidadCeldaGuardarCambiosRutaTransporte=false;
	}
	
	public void actualizarEstadoPanelsRutaTransporte(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionRutaTransporte!=null) {
				this.jScrollPanelDatosEdicionRutaTransporte.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRutaTransporte!=null) {
				this.jTabbedPaneBusquedasRutaTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRutaTransporte!=null) {
				this.jScrollPanelDatosRutaTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionRutaTransporte!=null) {
				this.jPanelPaginacionRutaTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRutaTransporte!=null) {
				this.jPanelParametrosReportesRutaTransporte.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionRutaTransporte!=null) {
				this.jScrollPanelDatosEdicionRutaTransporte.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRutaTransporte!=null) {
				this.jTabbedPaneBusquedasRutaTransporte.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosRutaTransporte!=null) {
				this.jScrollPanelDatosRutaTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionRutaTransporte!=null) {
				this.jPanelPaginacionRutaTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRutaTransporte!=null) {
				this.jPanelParametrosReportesRutaTransporte.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionRutaTransporte!=null) {
				this.jScrollPanelDatosEdicionRutaTransporte.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRutaTransporte!=null) {
				this.jTabbedPaneBusquedasRutaTransporte.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRutaTransporte!=null) {
				this.jScrollPanelDatosRutaTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionRutaTransporte!=null) {
				this.jPanelPaginacionRutaTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRutaTransporte!=null) {
				this.jPanelParametrosReportesRutaTransporte.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionRutaTransporte!=null) {
				this.jScrollPanelDatosEdicionRutaTransporte.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRutaTransporte!=null) {
				this.jTabbedPaneBusquedasRutaTransporte.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosRutaTransporte!=null) {
				this.jScrollPanelDatosRutaTransporte.setVisible(false);
			}
			
			if(this.jPanelPaginacionRutaTransporte!=null) {
				this.jPanelPaginacionRutaTransporte.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesRutaTransporte!=null) {
				this.jPanelParametrosReportesRutaTransporte.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionRutaTransporte!=null) {
				this.jScrollPanelDatosEdicionRutaTransporte.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRutaTransporte!=null) {
				this.jTabbedPaneBusquedasRutaTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRutaTransporte!=null) {
				this.jScrollPanelDatosRutaTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionRutaTransporte!=null) {
				this.jPanelPaginacionRutaTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRutaTransporte!=null) {
				this.jPanelParametrosReportesRutaTransporte.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionRutaTransporte!=null) {
				this.jScrollPanelDatosEdicionRutaTransporte.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRutaTransporte!=null) {
				this.jTabbedPaneBusquedasRutaTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRutaTransporte!=null) {
				this.jScrollPanelDatosRutaTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionRutaTransporte!=null) {
				this.jPanelPaginacionRutaTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRutaTransporte!=null) {
				this.jPanelParametrosReportesRutaTransporte.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionRutaTransporte!=null) {
				this.jScrollPanelDatosEdicionRutaTransporte.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRutaTransporte!=null) {
				this.jTabbedPaneBusquedasRutaTransporte.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosRutaTransporte!=null) {
				this.jScrollPanelDatosRutaTransporte.setVisible(true);
			}
			
			if(this.jPanelPaginacionRutaTransporte!=null) {
				this.jPanelPaginacionRutaTransporte.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesRutaTransporte!=null) {
				this.jPanelParametrosReportesRutaTransporte.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasRutaTransporte!=null) {
					this.jTabbedPaneBusquedasRutaTransporte.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesRutaTransporte!=null) {
				this.jPanelParametrosReportesRutaTransporte.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.rutatransporteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasRutaTransporte!=null) {
				this.jTabbedPaneBusquedasRutaTransporte.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesRutaTransporte!=null) {
				this.jPanelParametrosReportesRutaTransporte.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorDestino=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorDestino) {this.jTabbedPaneBusquedasRutaTransporte.remove(jPanelBusquedaPorDestinoRutaTransporte);}

			this.isVisibilidadBusquedaPorNombre=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombre) {this.jTabbedPaneBusquedasRutaTransporte.remove(jPanelBusquedaPorNombreRutaTransporte);}

			this.isVisibilidadBusquedaPorOrigen=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorOrigen) {this.jTabbedPaneBusquedasRutaTransporte.remove(jPanelBusquedaPorOrigenRutaTransporte);}
		}
		
	}
	
	

	public String registrarSesionRutaTransporteParaProformas() throws Exception {
		Boolean isPaginaPopupProforma=false;

		try {

			if(this.rutatransporteSessionBean==null) {
				this.rutatransporteSessionBean=new RutaTransporteSessionBean();
			}

			if(this.jInternalFrameDetalleFormRutaTransporte.proformaSessionBean==null) {
				this.jInternalFrameDetalleFormRutaTransporte.proformaSessionBean=new ProformaSessionBean();
			}

			this.jInternalFrameDetalleFormRutaTransporte.proformaSessionBean.setsPathNavegacionActual(rutatransporteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ProformaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRutaTransporte.proformaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupProforma=this.jInternalFrameDetalleFormRutaTransporte.proformaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRutaTransporte.proformaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeProforma(true);
			this.jInternalFrameDetalleFormRutaTransporte.proformaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeProforma(RutaTransporteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRutaTransporte.proformaSessionBean.setisBusquedaDesdeForeignKeySesionRutaTransporte(true);
			this.jInternalFrameDetalleFormRutaTransporte.proformaSessionBean.setlidRutaTransporteActual(this.idRutaTransporteActual);

			rutatransporteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRutaTransporte(true);
			rutatransporteSessionBean.setlIdRutaTransporteActualForeignKey(this.idRutaTransporteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionRutaTransporteParaPedidos() throws Exception {
		Boolean isPaginaPopupPedido=false;

		try {

			if(this.rutatransporteSessionBean==null) {
				this.rutatransporteSessionBean=new RutaTransporteSessionBean();
			}

			if(this.jInternalFrameDetalleFormRutaTransporte.pedidoSessionBean==null) {
				this.jInternalFrameDetalleFormRutaTransporte.pedidoSessionBean=new PedidoSessionBean();
			}

			this.jInternalFrameDetalleFormRutaTransporte.pedidoSessionBean.setsPathNavegacionActual(rutatransporteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+PedidoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRutaTransporte.pedidoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupPedido=this.jInternalFrameDetalleFormRutaTransporte.pedidoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRutaTransporte.pedidoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdePedido(true);
			this.jInternalFrameDetalleFormRutaTransporte.pedidoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdePedido(RutaTransporteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRutaTransporte.pedidoSessionBean.setisBusquedaDesdeForeignKeySesionRutaTransporte(true);
			this.jInternalFrameDetalleFormRutaTransporte.pedidoSessionBean.setlidRutaTransporteActual(this.idRutaTransporteActual);

			rutatransporteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRutaTransporte(true);
			rutatransporteSessionBean.setlIdRutaTransporteActualForeignKey(this.idRutaTransporteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}

	public String registrarSesionRutaTransporteParaServicioTransportes() throws Exception {
		Boolean isPaginaPopupServicioTransporte=false;

		try {

			if(this.rutatransporteSessionBean==null) {
				this.rutatransporteSessionBean=new RutaTransporteSessionBean();
			}

			if(this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteSessionBean==null) {
				this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
			}

			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteSessionBean.setsPathNavegacionActual(rutatransporteSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupServicioTransporte=this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte(true);
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte(RutaTransporteConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteSessionBean.setisBusquedaDesdeForeignKeySesionRutaTransporte(true);
			this.jInternalFrameDetalleFormRutaTransporte.serviciotransporteSessionBean.setlidRutaTransporteActual(this.idRutaTransporteActual);

			rutatransporteSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyRutaTransporte(true);
			rutatransporteSessionBean.setlIdRutaTransporteActualForeignKey(this.idRutaTransporteActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//RutaTransporteSessionBean rutatransporteSessionBean=new RutaTransporteSessionBean();
		
		if(this.rutatransporteSessionBean==null) {
			this.rutatransporteSessionBean=new RutaTransporteSessionBean();
		}
		
		this.rutatransporteSessionBean.setsUltimaBusquedaRutaTransporte(this.getsAccionBusqueda());
		this.rutatransporteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.rutatransporteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorDestino")) {
			rutatransporteSessionBean.setdestino(this.getdestinoBusquedaPorDestino());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
			rutatransporteSessionBean.setnombre(this.getnombreBusquedaPorNombre());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorOrigen")) {
			rutatransporteSessionBean.setorigen(this.getorigenBusquedaPorOrigen());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			rutatransporteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//RutaTransporteSessionBean rutatransporteSessionBean=new RutaTransporteSessionBean();
		
		if(this.rutatransporteSessionBean==null) {
			this.rutatransporteSessionBean=new RutaTransporteSessionBean();
		}
		
		if(this.rutatransporteSessionBean.getsUltimaBusquedaRutaTransporte()!=null&&!this.rutatransporteSessionBean.getsUltimaBusquedaRutaTransporte().equals("")) {
			this.setsAccionBusqueda(rutatransporteSessionBean.getsUltimaBusquedaRutaTransporte());
			this.setiNumeroPaginacion(rutatransporteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(rutatransporteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorDestino")) {
				this.setdestinoBusquedaPorDestino(rutatransporteSessionBean.getdestino());
				rutatransporteSessionBean.setdestino("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombre")) {
				this.setnombreBusquedaPorNombre(rutatransporteSessionBean.getnombre());
				rutatransporteSessionBean.setnombre("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorOrigen")) {
				this.setorigenBusquedaPorOrigen(rutatransporteSessionBean.getorigen());
				rutatransporteSessionBean.setorigen("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(rutatransporteSessionBean.getid_empresa());
				rutatransporteSessionBean.setid_empresa(-1L);
			}
		}
		
		this.rutatransporteSessionBean.setsUltimaBusquedaRutaTransporte("");
		this.rutatransporteSessionBean.setiNumeroPaginacion(RutaTransporteConstantesFunciones.INUMEROPAGINACION);
		this.rutatransporteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaRutaTransporte(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioRutaTransporte() {
		this.updateBorderResaltarBusquedasFormularioRutaTransporte();
		this.updateVisibilidadBusquedasFormularioRutaTransporte();
		this.updateHabilitarBusquedasFormularioRutaTransporte();
	}
	
	public void updateBorderResaltarBusquedasFormularioRutaTransporte() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasRutaTransporte.getComponents().length>0) {
	

		if(this.rutatransporteConstantesFunciones.resaltarBusquedaPorDestinoRutaTransporte!=null) {
			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorDestinoRutaTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);
				jPanel.setBorder(this.rutatransporteConstantesFunciones.resaltarBusquedaPorDestinoRutaTransporte);
			}
		}

		if(this.rutatransporteConstantesFunciones.resaltarBusquedaPorNombreRutaTransporte!=null) {
			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorNombreRutaTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);
				jPanel.setBorder(this.rutatransporteConstantesFunciones.resaltarBusquedaPorNombreRutaTransporte);
			}
		}

		if(this.rutatransporteConstantesFunciones.resaltarBusquedaPorOrigenRutaTransporte!=null) {
			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorOrigenRutaTransporte);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);
				jPanel.setBorder(this.rutatransporteConstantesFunciones.resaltarBusquedaPorOrigenRutaTransporte);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioRutaTransporte() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasRutaTransporte.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorDestinoRutaTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutatransporteConstantesFunciones.mostrarBusquedaPorDestinoRutaTransporte);
			if(!this.rutatransporteConstantesFunciones.mostrarBusquedaPorDestinoRutaTransporte && index>-1) {
				this.jTabbedPaneBusquedasRutaTransporte.remove(index);
			}

			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorNombreRutaTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutatransporteConstantesFunciones.mostrarBusquedaPorNombreRutaTransporte);
			if(!this.rutatransporteConstantesFunciones.mostrarBusquedaPorNombreRutaTransporte && index>-1) {
				this.jTabbedPaneBusquedasRutaTransporte.remove(index);
			}

			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorOrigenRutaTransporte);
			jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.rutatransporteConstantesFunciones.mostrarBusquedaPorOrigenRutaTransporte);
			if(!this.rutatransporteConstantesFunciones.mostrarBusquedaPorOrigenRutaTransporte && index>-1) {
				this.jTabbedPaneBusquedasRutaTransporte.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioRutaTransporte() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasRutaTransporte.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorDestinoRutaTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutatransporteConstantesFunciones.activarBusquedaPorDestinoRutaTransporte);
				this.jTabbedPaneBusquedasRutaTransporte.setEnabledAt(index,this.rutatransporteConstantesFunciones.activarBusquedaPorDestinoRutaTransporte);
			}

			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorNombreRutaTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutatransporteConstantesFunciones.activarBusquedaPorNombreRutaTransporte);
				this.jTabbedPaneBusquedasRutaTransporte.setEnabledAt(index,this.rutatransporteConstantesFunciones.activarBusquedaPorNombreRutaTransporte);
			}

			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorOrigenRutaTransporte);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.rutatransporteConstantesFunciones.activarBusquedaPorOrigenRutaTransporte);
				this.jTabbedPaneBusquedasRutaTransporte.setEnabledAt(index,this.rutatransporteConstantesFunciones.activarBusquedaPorOrigenRutaTransporte);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaRutaTransporte(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorDestino")) {
			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorDestinoRutaTransporte);

			this.jTabbedPaneBusquedasRutaTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);

			this.rutatransporteConstantesFunciones.setResaltarBusquedaPorDestinoRutaTransporte(resaltar);

			jPanel.setBorder(this.rutatransporteConstantesFunciones.resaltarBusquedaPorDestinoRutaTransporte);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombre")) {
			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorNombreRutaTransporte);

			this.jTabbedPaneBusquedasRutaTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);

			this.rutatransporteConstantesFunciones.setResaltarBusquedaPorNombreRutaTransporte(resaltar);

			jPanel.setBorder(this.rutatransporteConstantesFunciones.resaltarBusquedaPorNombreRutaTransporte);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorOrigen")) {
			index= this.jTabbedPaneBusquedasRutaTransporte.indexOfComponent(this.jPanelBusquedaPorOrigenRutaTransporte);

			this.jTabbedPaneBusquedasRutaTransporte.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasRutaTransporte.getComponent(index);

			this.rutatransporteConstantesFunciones.setResaltarBusquedaPorOrigenRutaTransporte(resaltar);

			jPanel.setBorder(this.rutatransporteConstantesFunciones.resaltarBusquedaPorOrigenRutaTransporte);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarRutaTransporte.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioRutaTransporte() throws Exception {

		if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioRutaTransporte();
		this.updateVisibilidadResaltarControlesFormularioRutaTransporte();
		this.updateHabilitarResaltarControlesFormularioRutaTransporte();
		
	}
	
	public void updateBorderResaltarControlesFormularioRutaTransporte() throws Exception {
		if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.rutatransporteConstantesFunciones.resaltaridRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte!=null) {this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.setBorder(this.rutatransporteConstantesFunciones.resaltaridRutaTransporte);}
		if(this.rutatransporteConstantesFunciones.resaltarid_empresaRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte!=null) {this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.setBorder(this.rutatransporteConstantesFunciones.resaltarid_empresaRutaTransporte);}
		if(this.rutatransporteConstantesFunciones.resaltarnombreRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte!=null) {this.jInternalFrameDetalleFormRutaTransporte.jTextAreanombreRutaTransporte.setBorder(this.rutatransporteConstantesFunciones.resaltarnombreRutaTransporte);}
		if(this.rutatransporteConstantesFunciones.resaltarorigenRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte!=null) {this.jInternalFrameDetalleFormRutaTransporte.jTextAreaorigenRutaTransporte.setBorder(this.rutatransporteConstantesFunciones.resaltarorigenRutaTransporte);}
		if(this.rutatransporteConstantesFunciones.resaltardestinoRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte!=null) {this.jInternalFrameDetalleFormRutaTransporte.jTextAreadestinoRutaTransporte.setBorder(this.rutatransporteConstantesFunciones.resaltardestinoRutaTransporte);}
		if(this.rutatransporteConstantesFunciones.resaltarprecioRutaTransporte!=null && this.jInternalFrameDetalleFormRutaTransporte!=null) {this.jInternalFrameDetalleFormRutaTransporte.jTextFieldprecioRutaTransporte.setBorder(this.rutatransporteConstantesFunciones.resaltarprecioRutaTransporte);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioRutaTransporte() throws Exception {		
		if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
	
		//this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostraridRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jPanelidRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostraridRutaTransporte);
		//this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrarid_empresaRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jPanelid_empresaRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrarid_empresaRutaTransporte);
		//this.jInternalFrameDetalleFormRutaTransporte.jTextAreanombreRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrarnombreRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jPanelnombreRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrarnombreRutaTransporte);
		//this.jInternalFrameDetalleFormRutaTransporte.jTextAreaorigenRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrarorigenRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jPanelorigenRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrarorigenRutaTransporte);
		//this.jInternalFrameDetalleFormRutaTransporte.jTextAreadestinoRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrardestinoRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jPaneldestinoRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrardestinoRutaTransporte);
		//this.jInternalFrameDetalleFormRutaTransporte.jTextFieldprecioRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrarprecioRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jPanelprecioRutaTransporte.setVisible(this.rutatransporteConstantesFunciones.mostrarprecioRutaTransporte);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioRutaTransporte() throws Exception {
		if(this.jInternalFrameDetalleFormRutaTransporte==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormRutaTransporte!=null) {
	
		this.jInternalFrameDetalleFormRutaTransporte.jLabelidRutaTransporte.setEnabled(this.rutatransporteConstantesFunciones.activaridRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jComboBoxid_empresaRutaTransporte.setEnabled(this.rutatransporteConstantesFunciones.activarid_empresaRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jTextAreanombreRutaTransporte.setEnabled(this.rutatransporteConstantesFunciones.activarnombreRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jTextAreaorigenRutaTransporte.setEnabled(this.rutatransporteConstantesFunciones.activarorigenRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jTextAreadestinoRutaTransporte.setEnabled(this.rutatransporteConstantesFunciones.activardestinoRutaTransporte);
		this.jInternalFrameDetalleFormRutaTransporte.jTextFieldprecioRutaTransporte.setEnabled(this.rutatransporteConstantesFunciones.activarprecioRutaTransporte);
		}
	}
	
		
}